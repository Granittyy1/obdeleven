package com.obdeleven.service.odx.model;

import Ba.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OdxParamType.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum OdxParamType {
    Value("VALUE"),
    CodedConst("CODED-CONST"),
    Reserved("RESERVED"),
    PhysConst("PHYS-CONST"),
    TableKey("TABLE-KEY"),
    TableStruct("TABLE-STRUCT");

    private static final Map<String, OdxParamType> map;
    private final String string;
    private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: OdxParamType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final OdxParamType fromString(String type) {
            i.e(type, "type");
            return (OdxParamType) OdxParamType.map.get(type);
        }

        private Companion() {
        }
    }

    static {
        OdxParamType[] odxParamTypeArrValues = values();
        int iN = x.n(odxParamTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN < 16 ? 16 : iN);
        for (OdxParamType odxParamType : odxParamTypeArrValues) {
            linkedHashMap.put(odxParamType.string, odxParamType);
        }
        map = linkedHashMap;
    }

    OdxParamType(String str) {
        this.string = str;
    }

    public static a<OdxParamType> getEntries() {
        return $ENTRIES;
    }

    public final String getString() {
        return this.string;
    }
}
