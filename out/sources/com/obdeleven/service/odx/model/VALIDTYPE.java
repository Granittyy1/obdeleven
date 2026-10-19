package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum VALIDTYPE {
    VALID("VALID"),
    NOT_VALID("NOT-VALID"),
    NOT_DEFINED("NOT-DEFINED"),
    NOT_AVAILABLE("NOT-AVAILABLE");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<VALIDTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public VALIDTYPE read(InputNode inputNode) throws Exception {
            return VALIDTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, VALIDTYPE validtype) throws Exception {
            outputNode.setValue(validtype.value());
        }
    }

    VALIDTYPE(String str) {
        this.value = str;
    }

    public static VALIDTYPE fromValue(String str) {
        for (VALIDTYPE validtype : values()) {
            if (validtype.value.equals(str)) {
                return validtype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
