package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum PHYSICALDATATYPE {
    A_INT32("A_INT32"),
    A_UINT32("A_UINT32"),
    A_FLOAT32("A_FLOAT32"),
    A_FLOAT64("A_FLOAT64"),
    A_UNICODE2STRING("A_UNICODE2STRING"),
    A_BYTEFIELD("A_BYTEFIELD");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<PHYSICALDATATYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public PHYSICALDATATYPE read(InputNode inputNode) throws Exception {
            return PHYSICALDATATYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, PHYSICALDATATYPE physicaldatatype) throws Exception {
            outputNode.setValue(physicaldatatype.value());
        }
    }

    PHYSICALDATATYPE(String str) {
        this.value = str;
    }

    public static PHYSICALDATATYPE fromValue(String str) {
        for (PHYSICALDATATYPE physicaldatatype : values()) {
            if (physicaldatatype.value.equals(str)) {
                return physicaldatatype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
