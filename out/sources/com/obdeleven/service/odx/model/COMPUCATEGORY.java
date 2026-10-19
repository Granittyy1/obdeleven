package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum COMPUCATEGORY {
    IDENTICAL("IDENTICAL"),
    LINEAR("LINEAR"),
    SCALE_LINEAR("SCALE-LINEAR"),
    TEXTTABLE("TEXTTABLE"),
    COMPUCODE("COMPUCODE"),
    TAB_INTP("TAB-INTP"),
    RAT_FUNC("RAT-FUNC"),
    SCALE_RAT_FUNC("SCALE-RAT-FUNC");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<COMPUCATEGORY> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public COMPUCATEGORY read(InputNode inputNode) throws Exception {
            return COMPUCATEGORY.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, COMPUCATEGORY compucategory) throws Exception {
            outputNode.setValue(compucategory.value());
        }
    }

    COMPUCATEGORY(String str) {
        this.value = str;
    }

    public static COMPUCATEGORY fromValue(String str) {
        for (COMPUCATEGORY compucategory : values()) {
            if (compucategory.value.equals(str)) {
                return compucategory;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
