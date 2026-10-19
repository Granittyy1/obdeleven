package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum UNITGROUPCATEGORY {
    COUNTRY("COUNTRY"),
    EQUIV_UNITS("EQUIV-UNITS");

    private final String value;

    public static class Converter implements org.simpleframework.xml.convert.Converter<UNITGROUPCATEGORY> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public UNITGROUPCATEGORY read(InputNode inputNode) throws Exception {
            return UNITGROUPCATEGORY.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, UNITGROUPCATEGORY unitgroupcategory) throws Exception {
            outputNode.setValue(unitgroupcategory.value());
        }
    }

    UNITGROUPCATEGORY(String str) {
        this.value = str;
    }

    public static UNITGROUPCATEGORY fromValue(String str) {
        for (UNITGROUPCATEGORY unitgroupcategory : values()) {
            if (unitgroupcategory.value.equals(str)) {
                return unitgroupcategory;
            }
        }
        throw new IllegalArgumentException(str);
    }

    public String value() {
        return this.value;
    }
}
