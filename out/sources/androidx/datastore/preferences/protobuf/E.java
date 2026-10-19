package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class E implements D {
    @Override // androidx.datastore.preferences.protobuf.D
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

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object b(Object obj) {
        ((MapFieldLite) obj).e();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final C.a<?, ?> c(Object obj) {
        return ((C) obj).f17097a;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final MapFieldLite d() {
        return MapFieldLite.f17163b.f();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final int f(Object obj, int i10, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C c10 = (C) obj2;
        int iC = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c10.getClass();
                int iU = CodedOutputStream.u(i10);
                int iA = C.a(c10.f17097a, key, value);
                iC = B6.c.c(iA, iA, iU, iC);
            }
        }
        return iC;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final boolean g(Object obj) {
        return !((MapFieldLite) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final MapFieldLite h(Object obj) {
        return (MapFieldLite) obj;
    }
}
