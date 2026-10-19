package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum RADIX {
    HEX,
    DEC,
    BIN,
    OCT;

    public static class Converter implements org.simpleframework.xml.convert.Converter<RADIX> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public RADIX read(InputNode inputNode) throws Exception {
            return RADIX.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, RADIX radix) throws Exception {
            outputNode.setValue(radix.value());
        }
    }

    public static RADIX fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
