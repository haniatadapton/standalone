/*
 * Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.helger.phase4.ebms3header.runtime;

import jakarta.xml.bind.DatatypeConverter;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Serializes {@code boolean} as 0 or 1.
 *
 * @author Kohsuke Kawaguchi
 * @since 2.0
 */
public class ZeroOneBooleanAdapter extends XmlAdapter<String,Boolean> {
    @Override
    public Boolean unmarshal(String v) {
        if(v==null)     return null;
        return DatatypeConverter.parseBoolean(v);
    }

    @Override
    public String marshal(Boolean v) {
        if(v==null)     return null;
        if(v) {
            return "1";
        } else {
            return "0";
        }
    }
}
