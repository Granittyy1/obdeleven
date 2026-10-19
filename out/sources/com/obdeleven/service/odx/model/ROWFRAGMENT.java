package com.obdeleven.service.odx.model;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public enum ROWFRAGMENT {
    KEY,
    STRUCT;

    public static class Converter implements org.simpleframework.xml.convert.Converter<ROWFRAGMENT> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.simpleframework.xml.convert.Converter
        public ROWFRAGMENT read(InputNode inputNode) throws Exception {
            return ROWFRAGMENT.fromValue(inputNode.getValue());
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, ROWFRAGMENT rowfragment) throws Exception {
            outputNode.setValue(rowfragment.value());
        }
    }

    public static ROWFRAGMENT fromValue(String str) {
        return valueOf(str);
    }

    public String value() {
        return name();
    }
}
