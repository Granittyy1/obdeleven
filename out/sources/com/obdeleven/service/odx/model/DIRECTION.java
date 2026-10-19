package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum DIRECTION {
    DOWNLOAD,
    UPLOAD;

    public static class Converter implements org.simpleframework.xml.convert.Converter<DIRECTION> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public DIRECTION read(InputNode inputNode) throws Exception {
            return DIRECTION.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, DIRECTION direction) throws Exception {
            outputNode.setValue(direction.value());
        }
    }

    public static DIRECTION fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
