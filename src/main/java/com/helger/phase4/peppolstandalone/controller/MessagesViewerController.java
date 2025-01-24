package com.helger.phase4.peppolstandalone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.attribute.FileTime;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Base64;

@Controller
@RequestMapping("/messages")
public class MessagesViewerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessagesViewerController.class);
    private static final String DUMP_PATH = System.getProperty("user.dir") + "/phase4-dumps";
    private static final TransformerFactory TRANSFORMER_FACTORY;
    private static final ObjectMapper OBJECT_MAPPER;
    private final AtomicBoolean filesFound = new AtomicBoolean(false);
    private final AtomicInteger messageCounter = new AtomicInteger(0);

    static {
        TRANSFORMER_FACTORY = TransformerFactory.newInstance();
        OBJECT_MAPPER = new ObjectMapper();
    }

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String viewMessages() {
        StringBuilder html = new StringBuilder()
            .append("<!DOCTYPE html>\n")
            .append("<html>\n")
            .append("<head>\n")
            .append("    <title>AS4 Messages</title>\n")
            .append("    <style>\n")
            .append("        body { font-family: Arial, sans-serif; margin: 20px; background-color: #f5f5f5; }\n")
            .append("        h1 { color: #2c3e50; text-align: center; }\n")
            .append("        table { border-collapse: collapse; width: 100%; background-color: white; box-shadow: 0 1px 3px rgba(0,0,0,0.2); }\n")
            .append("        th { background-color: #34495e; color: white; padding: 12px; text-align: left; }\n")
            .append("        td { border: 1px solid #ddd; padding: 12px; }\n")
            .append("        tr:nth-child(even) { background-color: #f9f9f9; }\n")
            .append("        tr:hover { background-color: #f5f5f5; }\n")
            .append("        .message-content { display: none; white-space: pre-wrap; background-color: #f8f9fa; padding: 15px; border-radius: 4px; margin-top: 10px; }\n")
            .append("        .view-button { background-color: #3498db; color: white; border: none; padding: 8px 16px; border-radius: 4px; cursor: pointer; }\n")
            .append("        .view-button:hover { background-color: #2980b9; }\n")
            .append("        pre { white-space: pre-wrap; background-color: #f8f9fa; padding: 15px; border-radius: 4px; margin: 10px 0; }\n")
            .append("        .message-content { max-height: 500px; overflow-y: auto; }\n")
            .append("    </style>\n")
            .append("    <script>\n")
            .append("        function toggleContent(id) {\n")
            .append("            var content = document.getElementById('content-' + id);\n")
            .append("            var button = document.getElementById('btn-' + id);\n")
            .append("            if (content.style.display === 'none') {\n")
            .append("                content.style.display = 'block';\n")
            .append("                button.textContent = 'Hide Content';\n")
            .append("            } else {\n")
            .append("                content.style.display = 'none';\n")
            .append("                button.textContent = 'View Content';\n")
            .append("            }\n")
            .append("        }\n")
            .append("    </script>\n")
            .append("</head>\n")
            .append("<body>\n")
            .append("    <h1>AS4 Messages</h1>\n")
            .append("    <table>\n")
            .append("        <thead>\n")
            .append("            <tr>\n")
            .append("                <th>Filename</th>\n")
            .append("                <th>Type</th>\n")
            .append("                <th>Size</th>\n")
            .append("                <th>Modified</th>\n")
            .append("                <th>Content</th>\n")
            .append("            </tr>\n")
            .append("        </thead>\n")
            .append("        <tbody>\n");

        // Check both incoming and outgoing directories
        List<AbstractMap.SimpleEntry<Path, FileTime>> allFiles = new ArrayList<>();
        
        for (String dirType : new String[]{"incoming", "outgoing"}) {
            Path dumpPath = Paths.get(DUMP_PATH, dirType);
            LOGGER.info("Searching for messages in: {}", dumpPath);

            if (Files.exists(dumpPath)) {
                try {
                    Files.walk(dumpPath)
                        .filter(path -> path.toString().endsWith(".as4in") || 
                                      path.toString().endsWith(".as4out"))
                        .forEach(path -> {
                            try {
                                allFiles.add(new AbstractMap.SimpleEntry<>(
                                    path,
                                    Files.getLastModifiedTime(path)
                                ));
                            } catch (IOException e) {
                                LOGGER.error("Error reading file: " + path, e);
                            }
                        });
                } catch (IOException e) {
                    LOGGER.error("Error walking through directory: " + dumpPath, e);
                }
            }
        }

        // Sort files by last modified time (newest first)
        allFiles.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Process sorted files
        allFiles.forEach(entry -> {
            try {
                Path path = entry.getKey();
                filesFound.set(true);
                byte[] fileBytes = Files.readAllBytes(path);
                String content = formatContent(new String(fileBytes));
                
                String fileName = path.getFileName().toString();
                String type = fileName.endsWith(".as4in") ? "Incoming" : "Outgoing";
                long size = Files.size(path);
                LocalDateTime modified = LocalDateTime.ofInstant(
                    entry.getValue().toInstant(), 
                    ZoneId.systemDefault()
                );

                html.append("<tr>")
                    .append("<td>").append(fileName).append("</td>")
                    .append("<td>").append(type).append("</td>") 
                    .append("<td>").append(size/1024).append(" KB</td>")
                    .append("<td>").append(modified.format(
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                    .append("</td>")
                    .append("<td>")
                    .append("<button class='view-button' id='btn-").append(messageCounter.getAndIncrement())
                    .append("' onclick='toggleContent(").append(messageCounter.get()).append(")'>View Content</button>")
                    .append("<div class='message-content' id='content-").append(messageCounter.get())
                    .append("'>").append(content).append("</div>")
                    .append("</td>")
                    .append("</tr>\n");
            } catch (IOException e) {
                LOGGER.error("Error processing file: " + entry.getKey(), e);
            }
        });

        if (!filesFound.get()) {
            html.append("<tr><td colspan='5' style='text-align: center;'>No messages found</td></tr>");
        }

        html.append("        </tbody>\n")
            .append("    </table>\n")
            .append("</body>\n")
            .append("</html>");

        return html.toString();
    }

    private String formatContent(String content) {
        if (content == null || content.trim().isEmpty()) {
            return "Empty or invalid file content";
        }

        try {
            // First try to decode if content is Base64
            String decodedContent;
            try {
                byte[] decodedBytes = Base64.getDecoder().decode(content.trim());
                decodedContent = new String(decodedBytes);
            } catch (IllegalArgumentException e) {
                // If not Base64, use original content
                decodedContent = content;
            }

            String trimmedContent = decodedContent.trim();
            if (trimmedContent.length() <= 1) {
                return "File contains insufficient content (length: " + trimmedContent.length() + ")";
            }

            // Handle JSON content
            if (trimmedContent.startsWith("{")) {
                Object json = OBJECT_MAPPER.readValue(trimmedContent, Object.class);
                return OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(json);
            }
            // Handle XML content
            else if (trimmedContent.startsWith("<")) {
                if (trimmedContent.length() < 5) {
                    return "Invalid XML content (too short)";
                }

                Transformer transformer = TRANSFORMER_FACTORY.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

                StreamSource source = new StreamSource(new StringReader(trimmedContent));
                StringWriter writer = new StringWriter();
                StreamResult result = new StreamResult(writer);

                transformer.transform(source, result);
                return writer.toString()
                        .replaceAll("&", "&amp;")
                        .replaceAll("<", "&lt;")
                        .replaceAll(">", "&gt;");
            }
            
            // If neither JSON nor XML, return as plain text
            return "Content (plain text):\n" + decodedContent;
        } catch (Exception e) {
            LOGGER.error("Error processing content", e);
            return "Error processing content: " + e.getMessage();
        }
    }
} 