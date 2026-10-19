package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1325o extends AbstractC1324n<GeneratedMessageLite.d> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final GeneratedMessageLite.e b(C1323m c1323m, I i10, int i11) {
        c1323m.getClass();
        return c1323m.f17266a.get(new C1323m.a(i11, i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final C1327q<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final C1327q<GeneratedMessageLite.d> d(Object obj) {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        C1327q<GeneratedMessageLite.d> c1327q = cVar.extensions;
        if (c1327q.f17273b) {
            cVar.extensions = c1327q.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final boolean e(I i10) {
        return i10 instanceof GeneratedMessageLite.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final void f(Object obj) {
        C1327q<GeneratedMessageLite.d> c1327q = ((GeneratedMessageLite.c) obj).extensions;
        if (c1327q.f17273b) {
            return;
        }
        c1327q.f17272a.h();
        c1327q.f17273b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1324n
    public final void j(Map.Entry entry) throws IOException {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
        throw null;
    }
}
