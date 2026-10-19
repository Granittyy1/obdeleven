package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Protobuf.java */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f17169c = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f17171b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f17170a = new B();

    public final <T> X<T> a(Class<T> cls) {
        X<T> x10;
        M m7;
        Class<?> cls2;
        C1330u.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f17171b;
        X<T> x11 = (X) concurrentHashMap.get(cls);
        if (x11 != null) {
            return x11;
        }
        B b10 = this.f17170a;
        b10.getClass();
        Class<?> cls3 = Y.f17193a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = Y.f17193a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        G gA = b10.f17093a.a(cls);
        if (gA.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                m7 = new M(Y.f17196d, C1326p.f17269a, gA.b());
            } else {
                c0<?, ?> c0Var = Y.f17194b;
                AbstractC1324n<?> abstractC1324n = C1326p.f17270b;
                if (abstractC1324n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                m7 = new M(c0Var, abstractC1324n, gA.b());
            }
            x10 = m7;
        } else {
            boolean zIsAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f17166b;
            if (zIsAssignableFrom) {
                x10 = gA.c() == protoSyntax ? L.x(gA, P.f17165b, AbstractC1335z.f17288b, Y.f17196d, C1326p.f17269a, F.f17112b) : L.x(gA, P.f17165b, AbstractC1335z.f17288b, Y.f17196d, null, F.f17112b);
            } else if (gA.c() == protoSyntax) {
                N n10 = P.f17164a;
                AbstractC1335z.a aVar = AbstractC1335z.f17287a;
                c0<?, ?> c0Var2 = Y.f17194b;
                AbstractC1324n<?> abstractC1324n2 = C1326p.f17270b;
                if (abstractC1324n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x10 = L.x(gA, n10, aVar, c0Var2, abstractC1324n2, F.f17111a);
            } else {
                x10 = L.x(gA, P.f17164a, AbstractC1335z.f17287a, Y.f17195c, null, F.f17111a);
            }
        }
        X<T> x12 = (X) concurrentHashMap.putIfAbsent(cls, x10);
        return x12 != null ? x12 : x10;
    }
}
