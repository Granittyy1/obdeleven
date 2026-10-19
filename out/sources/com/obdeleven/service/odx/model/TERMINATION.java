package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum TERMINATION {
    END_OF_PDU("END-OF-PDU"),
    ZERO("ZERO"),
    HEX_FF("HEX-FF");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<TERMINATION> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public TERMINATION read(InputNode inputNode) throws Exception {
            return TERMINATION.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, TERMINATION termination) throws Exception {
            outputNode.setValue(termination.value());
        }
    }

    TERMINATION(String str) {
        this.value = str;
    }

    public static TERMINATION fromValue(String str) {
        for (TERMINATION termination : values()) {
            if (termination.value.equals(str)) {
                return termination;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
