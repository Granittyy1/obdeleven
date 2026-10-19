package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements E {
    @Override // com.google.protobuf.E
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteF = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteF.c()) {
                mapFieldLiteF = mapFieldLiteF.f();
            }
            mapFieldLiteF.b();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteF.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteF;
    }

    @Override // com.google.protobuf.E
    public final Object b(Object obj) {
        ((MapFieldLite) obj).e();
        return obj;
    }

    @Override // com.google.protobuf.E
    public final D.a<?, ?> c(Object obj) {
        return ((D) obj).f29022a;
    }

    @Override // com.google.protobuf.E
    public final MapFieldLite d() {
        return MapFieldLite.f29077b.f();
    }

    @Override // com.google.protobuf.E
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.E
    public final int f(Object obj, int i10, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        D d10 = (D) obj2;
        int iB = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                d10.getClass();
                int iU = CodedOutputStream.u(i10);
                int iA = D.a(d10.f29022a, key, value);
                iB = p005a4.o.b(iA, iA, iU, iB);
            }
        }
        return iB;
    }

    @Override // com.google.protobuf.E
    public final boolean g(Object obj) {
        return !((MapFieldLite) obj).c();
    }

    @Override // com.google.protobuf.E
    public final MapFieldLite h(Object obj) {
        return (MapFieldLite) obj;
    }
}
