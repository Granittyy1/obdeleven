package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum ADDRESSING {
    FUNCTIONAL("FUNCTIONAL"),
    PHYSICAL("PHYSICAL"),
    FUNCTIONAL_OR_PHYSICAL("FUNCTIONAL-OR-PHYSICAL");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<ADDRESSING> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public ADDRESSING read(InputNode inputNode) throws Exception {
            return ADDRESSING.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, ADDRESSING addressing) throws Exception {
            outputNode.setValue(addressing.value());
        }
    }

    ADDRESSING(String str) {
        this.value = str;
    }

    public static ADDRESSING fromValue(String str) {
        for (ADDRESSING addressing : values()) {
            if (addressing.value.equals(str)) {
                return addressing;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
