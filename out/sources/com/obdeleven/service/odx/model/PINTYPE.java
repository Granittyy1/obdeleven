package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum PINTYPE {
    HI,
    LOW,
    K,
    L,
    TX,
    RX,
    PLUS,
    MINUS,
    SINGLE;

    public static class Converter implements org.simpleframework.xml.convert.Converter<PINTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public PINTYPE read(InputNode inputNode) throws Exception {
            return PINTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, PINTYPE pintype) throws Exception {
            outputNode.setValue(pintype.value());
        }
    }

    public static PINTYPE fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
