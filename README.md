# Standalone BDEW phase4

This an example standalone implementation of [phase4](https://github.com/phax/phase4) for the BDEW Network.

This project is part of Philip Helger's Peppol solution stack. See https://github.com/phax/peppol for other components and libraries in that area.

# Functionality

## Functionality Receiving

Based on the Servlet technology, the application takes AS4 messages via HTTP POST to `/as4`.

By default, all valid incoming messages are handled by class `CustomPeppolIncomingSBDHandlerSPI`.
This class contains a `TODO` where you need to implement the stuff you want to do with incoming messages.

## Functionality Sending

Sending is triggered via an HTTP POST request. To send a messages use the [BDEW Client](https://github.com/haniatadapton/phase4-bdew-client) .


## What is not included

The following list contains the elements not considered for this demo application:

* You need your own BDEW certificate to make it work, but BDEW certificate validation is commented out for now.
* Key exchange is missing and needs ti be implemented in `CustomPeppolIncomingSBDHandlerSPI`

# Get it up and running
This application is based on Spring Boot 3.x and uses Apache 3.x and Java 17 to build.
run the `Phase4PeppolStandaloneApplication` file and this should spawn a local Tomcat at port `8080` and you can access it via `http://localhost:8080`.
It should show a small introduction page. The `/as4` servlet itself has no user interface. To see the messages go to `/messages`

In case you run the application behind an HTTP proxy, modify the settings in the configuration file (`http.proxy.*`).

In case you don't like port 8080, also check the configuration file.

The main configuration is done via the file `src/main/resources/application.properties`.
You may need to rebuild the application to have an effect.