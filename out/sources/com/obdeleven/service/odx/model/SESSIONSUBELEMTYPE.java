package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum SESSIONSUBELEMTYPE {
    A_UINT_32("A_UINT32"),
    A_BYTEFIELD("A_BYTEFIELD"),
    A_ASCIISTRING("A_ASCIISTRING");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<SESSIONSUBELEMTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public SESSIONSUBELEMTYPE read(InputNode inputNode) throws Exception {
            return SESSIONSUBELEMTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, SESSIONSUBELEMTYPE sessionsubelemtype) throws Exception {
            outputNode.setValue(sessionsubelemtype.value());
        }
    }

    SESSIONSUBELEMTYPE(String str) {
        this.value = str;
    }

    public static SESSIONSUBELEMTYPE fromValue(String str) {
        for (SESSIONSUBELEMTYPE sessionsubelemtype : values()) {
            if (sessionsubelemtype.value.equals(str)) {
                return sessionsubelemtype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
