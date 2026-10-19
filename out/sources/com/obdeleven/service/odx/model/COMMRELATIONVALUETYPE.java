package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum COMMRELATIONVALUETYPE {
    CURRENT,
    STORED,
    STATIC,
    SUBSTITUTED;

    public static class Converter implements org.simpleframework.xml.convert.Converter<COMMRELATIONVALUETYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public COMMRELATIONVALUETYPE read(InputNode inputNode) throws Exception {
            return COMMRELATIONVALUETYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, COMMRELATIONVALUETYPE commrelationvaluetype) throws Exception {
            outputNode.setValue(commrelationvaluetype.value());
        }
    }

    public static COMMRELATIONVALUETYPE fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
