package com.google.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2073o extends AbstractC2072n<GeneratedMessageLite.d> {
    @Override // com.google.protobuf.AbstractC2072n
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final GeneratedMessageLite.e b(C2071m c2071m, J j, int i10) {
        c2071m.getClass();
        return c2071m.f29185a.get(new C2071m.a(i10, j));
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final C2075q<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final C2075q<GeneratedMessageLite.d> d(Object obj) {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        C2075q<GeneratedMessageLite.d> c2075q = cVar.extensions;
        if (c2075q.f29192b) {
            cVar.extensions = c2075q.clone();
        }
        return cVar.extensions;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final boolean e(J j) {
        return j instanceof GeneratedMessageLite.c;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final void f(Object obj) {
        ((GeneratedMessageLite.c) obj).extensions.j();
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.protobuf.AbstractC2072n
    public final void j(Map.Entry entry) throws IOException {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
        throw null;
    }
}
