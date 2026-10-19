package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3 f25411c = new C3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f25413b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1825h3 f25412a = new C1825h3();

    public final <T> E3<T> a(Class<T> cls) {
        E3<T> e3L;
        C1922v3 c1922v3;
        Class<?> cls2;
        Charset charset = Q2.f25563a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f25413b;
        E3<T> e10 = (E3) concurrentHashMap.get(cls);
        if (e10 != null) {
            return e10;
        }
        C1825h3 c1825h3 = this.f25412a;
        c1825h3.getClass();
        Class<?> cls3 = H3.f25466a;
        if (!N2.class.isAssignableFrom(cls) && (cls2 = H3.f25466a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        InterfaceC1888q3 interfaceC1888q3B = c1825h3.f25765a.b(cls);
        if (interfaceC1888q3B.y()) {
            if (N2.class.isAssignableFrom(cls)) {
                c1922v3 = new C1922v3(H3.f25468c, H2.f25464a, interfaceC1888q3B.a());
            } else {
                Q3<?, ?> q10 = H3.f25467b;
                F2<?> f10 = H2.f25465b;
                if (f10 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c1922v3 = new C1922v3(q10, f10, interfaceC1888q3B.a());
            }
            e3L = c1922v3;
        } else if (N2.class.isAssignableFrom(cls)) {
            e3L = C1839j3.f25776a[interfaceC1888q3B.x().ordinal()] != 1 ? C1915u3.l(interfaceC1888q3B, C1948z3.f25939b, AbstractC1783b3.f25664b, H3.f25468c, H2.f25464a, C1867n3.f25803b) : C1915u3.l(interfaceC1888q3B, C1948z3.f25939b, AbstractC1783b3.f25664b, H3.f25468c, null, C1867n3.f25803b);
        } else if (C1839j3.f25776a[interfaceC1888q3B.x().ordinal()] != 1) {
            InterfaceC1936x3 interfaceC1936x3 = C1948z3.f25938a;
            C1797d3 c1797d3 = AbstractC1783b3.f25663a;
            Q3<?, ?> q11 = H3.f25467b;
            F2<?> f11 = H2.f25465b;
            if (f11 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            e3L = C1915u3.l(interfaceC1888q3B, interfaceC1936x3, c1797d3, q11, f11, C1867n3.f25802a);
        } else {
            e3L = C1915u3.l(interfaceC1888q3B, C1948z3.f25938a, AbstractC1783b3.f25663a, H3.f25467b, null, C1867n3.f25802a);
        }
        E3<T> e11 = (E3) concurrentHashMap.putIfAbsent(cls, e3L);
        return e11 != null ? e11 : e3L;
    }
}
