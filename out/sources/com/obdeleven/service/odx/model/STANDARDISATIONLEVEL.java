package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum STANDARDISATIONLEVEL {
    STANDARD("STANDARD"),
    OEM_SPECIFIC("OEM-SPECIFIC"),
    OPTIONAL("OPTIONAL"),
    OEM_OPTIONAL("OEM-OPTIONAL");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<STANDARDISATIONLEVEL> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public STANDARDISATIONLEVEL read(InputNode inputNode) throws Exception {
            return STANDARDISATIONLEVEL.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, STANDARDISATIONLEVEL standardisationlevel) throws Exception {
            outputNode.setValue(standardisationlevel.value());
        }
    }

    STANDARDISATIONLEVEL(String str) {
        this.value = str;
    }

    public static STANDARDISATIONLEVEL fromValue(String str) {
        for (STANDARDISATIONLEVEL standardisationlevel : values()) {
            if (standardisationlevel.value.equals(str)) {
                return standardisationlevel;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
