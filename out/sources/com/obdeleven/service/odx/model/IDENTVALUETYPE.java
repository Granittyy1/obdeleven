package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum IDENTVALUETYPE {
    A_UINT_32("A_UINT32"),
    A_BYTEFIELD("A_BYTEFIELD"),
    A_ASCIISTRING("A_ASCIISTRING");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<IDENTVALUETYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public IDENTVALUETYPE read(InputNode inputNode) throws Exception {
            return IDENTVALUETYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, IDENTVALUETYPE identvaluetype) throws Exception {
            outputNode.setValue(identvaluetype.value());
        }
    }

    IDENTVALUETYPE(String str) {
        this.value = str;
    }

    public static IDENTVALUETYPE fromValue(String str) {
        for (IDENTVALUETYPE identvaluetype : values()) {
            if (identvaluetype.value.equals(str)) {
                return identvaluetype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
