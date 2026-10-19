package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum INTERVALTYPE {
    OPEN,
    CLOSED,
    INFINITE;

    public static class Converter implements org.simpleframework.xml.convert.Converter<INTERVALTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public INTERVALTYPE read(InputNode inputNode) throws Exception {
            return INTERVALTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, INTERVALTYPE intervaltype) throws Exception {
            outputNode.setValue(intervaltype.value());
        }
    }

    public static INTERVALTYPE fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
