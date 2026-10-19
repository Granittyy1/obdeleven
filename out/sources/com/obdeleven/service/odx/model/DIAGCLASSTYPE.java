package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum DIAGCLASSTYPE {
    STARTCOMM("STARTCOMM"),
    STOPCOMM("STOPCOMM"),
    VARIANTIDENTIFICATION("VARIANTIDENTIFICATION"),
    READ_DYN_DEF_MESSAGE("READ-DYN-DEF-MESSAGE"),
    DYN_DEF_MESSAGE("DYN-DEF-MESSAGE"),
    CLEAR_DYN_DEF_MESSAGE("CLEAR-DYN-DEF-MESSAGE");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<DIAGCLASSTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public DIAGCLASSTYPE read(InputNode inputNode) throws Exception {
            return DIAGCLASSTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, DIAGCLASSTYPE diagclasstype) throws Exception {
            outputNode.setValue(diagclasstype.value());
        }
    }

    DIAGCLASSTYPE(String str) {
        this.value = str;
    }

    public static DIAGCLASSTYPE fromValue(String str) {
        for (DIAGCLASSTYPE diagclasstype : values()) {
            if (diagclasstype.value.equals(str)) {
                return diagclasstype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
