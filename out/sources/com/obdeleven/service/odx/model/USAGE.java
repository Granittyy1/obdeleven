package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum USAGE {
    ECU_SOFTWARE("ECU-SOFTWARE"),
    ECU_COMM("ECU-COMM"),
    APPLICATION("APPLICATION"),
    TESTER("TESTER");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<USAGE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public USAGE read(InputNode inputNode) throws Exception {
            return USAGE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, USAGE usage) throws Exception {
            outputNode.setValue(usage.value());
        }
    }

    USAGE(String str) {
        this.value = str;
    }

    public static USAGE fromValue(String str) {
        for (USAGE usage : values()) {
            if (usage.value.equals(str)) {
                return usage;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
