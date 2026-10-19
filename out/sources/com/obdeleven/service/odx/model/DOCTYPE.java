package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum DOCTYPE {
    FLASH("FLASH"),
    CONTAINER("CONTAINER"),
    LAYER("LAYER"),
    MULTIPLE_ECU_JOB_SPEC("MULTIPLE-ECU-JOB-SPEC"),
    COMPARAM_SPEC("COMPARAM-SPEC"),
    VEHICLE_INFO_SPEC("VEHICLE-INFO-SPEC"),
    COMPARAM_SUBSET("COMPARAM-SUBSET"),
    ECU_CONFIG("ECU-CONFIG"),
    FUNCTION_DICTIONARY_SPEC("FUNCTION-DICTIONARY-SPEC");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<DOCTYPE> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public DOCTYPE read(InputNode inputNode) throws Exception {
            return DOCTYPE.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, DOCTYPE doctype) throws Exception {
            outputNode.setValue(doctype.value());
        }
    }

    DOCTYPE(String str) {
        this.value = str;
    }

    public static DOCTYPE fromValue(String str) {
        for (DOCTYPE doctype : values()) {
            if (doctype.value.equals(str)) {
                return doctype;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
