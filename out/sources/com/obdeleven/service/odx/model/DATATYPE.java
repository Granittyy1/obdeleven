package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum DATATYPE {
    A_INT32("A_INT32"),
    A_UINT32("A_UINT32"),
    A_FLOAT32("A_FLOAT32"),
    A_FLOAT64("A_FLOAT64"),
    A_ASCIISTRING("A_ASCIISTRING"),
    A_UTF8STRING("A_UTF8STRING"),
    A_UNICODE2STRING("A_UNICODE2STRING"),
    A_BYTEFIELD("A_BYTEFIELD");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<DATATYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public DATATYPE read(InputNode inputNode) throws Exception {
            return DATATYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, DATATYPE datatype) throws Exception {
            outputNode.setValue(datatype.value());
        }
    }

    DATATYPE(String str) {
        this.value = str;
    }

    public static DATATYPE fromValue(String str) {
        for (DATATYPE datatype : values()) {
            if (datatype.value.equals(str)) {
                return datatype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
