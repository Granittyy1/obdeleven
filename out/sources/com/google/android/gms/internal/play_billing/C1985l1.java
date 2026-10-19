package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1985l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1985l1 f26210c = new C1985l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26212b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0 f26211a = new Y0();

    public final InterfaceC1994o1 a(Class cls) {
        Charset charset = O0.f26148a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f26212b;
        InterfaceC1994o1 c1979j1 = (InterfaceC1994o1) concurrentHashMap.get(cls);
        if (c1979j1 == null) {
            Y0 y10 = this.f26211a;
            y10.getClass();
            C2023y1 c2023y1 = C1997p1.f26239a;
            I0.class.isAssignableFrom(cls);
            InterfaceC1958c1 interfaceC1958c1A = y10.f26170a.a(cls);
            if (interfaceC1958c1A.x()) {
                C2023y1 c2023y2 = C1997p1.f26239a;
                C2019x0 c2019x0 = C2022y0.f26309a;
                c1979j1 = new C1979j1(c2023y2, interfaceC1958c1A.a());
            } else {
                int i10 = C1982k1.f26208a;
                int i11 = U0.f26161a;
                C2023y1 c2023y3 = C1997p1.f26239a;
                C2019x0 c2019x1 = interfaceC1958c1A.y() + (-1) != 1 ? C2022y0.f26309a : null;
                int i12 = C1955b1.f26173a;
                c1979j1 = C1976i1.u(interfaceC1958c1A, c2023y3, c2019x1);
            }
            InterfaceC1994o1 interfaceC1994o1 = (InterfaceC1994o1) concurrentHashMap.putIfAbsent(cls, c1979j1);
            if (interfaceC1994o1 != null) {
                return interfaceC1994o1;
            }
        }
        return c1979j1;
    }
}
