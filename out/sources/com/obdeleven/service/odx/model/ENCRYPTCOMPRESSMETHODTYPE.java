package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum ENCRYPTCOMPRESSMETHODTYPE {
    A_UINT_32("A_UINT32"),
    A_BYTEFIELD("A_BYTEFIELD");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<ENCRYPTCOMPRESSMETHODTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public ENCRYPTCOMPRESSMETHODTYPE read(InputNode inputNode) throws Exception {
            return ENCRYPTCOMPRESSMETHODTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, ENCRYPTCOMPRESSMETHODTYPE encryptcompressmethodtype) throws Exception {
            outputNode.setValue(encryptcompressmethodtype.value());
        }
    }

    ENCRYPTCOMPRESSMETHODTYPE(String str) {
        this.value = str;
    }

    public static ENCRYPTCOMPRESSMETHODTYPE fromValue(String str) {
        for (ENCRYPTCOMPRESSMETHODTYPE encryptcompressmethodtype : values()) {
            if (encryptcompressmethodtype.value.equals(str)) {
                return encryptcompressmethodtype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
