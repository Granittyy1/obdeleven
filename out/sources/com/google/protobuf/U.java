package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes3.dex */
public final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f29087c = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f29089b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f29088a = new C();

    public final <T> X<T> a(Class<T> cls) {
        X<T> xA;
        N n10;
        Class<?> cls2;
        C2078u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f29089b;
        X<T> x10 = (X) concurrentHashMap.get(cls);
        if (x10 != null) {
            return x10;
        }
        C c10 = this.f29088a;
        c10.getClass();
        Class<?> cls3 = Y.f29112a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = Y.f29112a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        H hA = c10.f29010a.a(cls);
        if (hA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                n10 = new N(Y.f29115d, C2074p.f29188a, hA.b());
            } else {
                c0<?, ?> c0Var = Y.f29113b;
                AbstractC2072n<?> abstractC2072n = C2074p.f29189b;
                if (abstractC2072n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n10 = new N(c0Var, abstractC2072n, hA.b());
            }
            xA = n10;
        } else {
            boolean zIsAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f29082b;
            if (zIsAssignableFrom) {
                xA = hA.c() == protoSyntax ? M.A(hA, Q.f29086b, A.f29003b, Y.f29115d, C2074p.f29188a, G.f29037b) : M.A(hA, Q.f29086b, A.f29003b, Y.f29115d, null, G.f29037b);
            } else if (hA.c() == protoSyntax) {
                O o10 = Q.f29085a;
                A.a aVar = A.f29002a;
                c0<?, ?> c0Var2 = Y.f29113b;
                AbstractC2072n<?> abstractC2072n2 = C2074p.f29189b;
                if (abstractC2072n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                xA = M.A(hA, o10, aVar, c0Var2, abstractC2072n2, G.f29036a);
            } else {
                xA = M.A(hA, Q.f29085a, A.f29002a, Y.f29114c, null, G.f29036a);
            }
        }
        X<T> x11 = (X) concurrentHashMap.putIfAbsent(cls, xA);
        return x11 != null ? x11 : xA;
    }
}
