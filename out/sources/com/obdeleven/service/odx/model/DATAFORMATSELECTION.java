package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum DATAFORMATSELECTION {
    INTEL_HEX("INTEL-HEX"),
    MOTOROLA_S("MOTOROLA-S"),
    BINARY("BINARY"),
    USER_DEFINED("USER-DEFINED");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<DATAFORMATSELECTION> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public DATAFORMATSELECTION read(InputNode inputNode) throws Exception {
            return DATAFORMATSELECTION.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, DATAFORMATSELECTION dataformatselection) throws Exception {
            outputNode.setValue(dataformatselection.value());
        }
    }

    DATAFORMATSELECTION(String str) {
        this.value = str;
    }

    public static DATAFORMATSELECTION fromValue(String str) {
        for (DATAFORMATSELECTION dataformatselection : values()) {
            if (dataformatselection.value.equals(str)) {
                return dataformatselection;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
