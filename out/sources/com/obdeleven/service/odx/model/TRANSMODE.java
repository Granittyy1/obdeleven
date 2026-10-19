package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum TRANSMODE {
    SEND_ONLY("SEND-ONLY"),
    RECEIVE_ONLY("RECEIVE-ONLY"),
    SEND_AND_RECEIVE("SEND-AND-RECEIVE"),
    SEND_OR_RECEIVE("SEND-OR-RECEIVE");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<TRANSMODE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public TRANSMODE read(InputNode inputNode) throws Exception {
            return TRANSMODE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, TRANSMODE transmode) throws Exception {
            outputNode.setValue(transmode.value());
        }
    }

    TRANSMODE(String str) {
        this.value = str;
    }

    public static TRANSMODE fromValue(String str) {
        for (TRANSMODE transmode : values()) {
            if (transmode.value.equals(str)) {
                return transmode;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
