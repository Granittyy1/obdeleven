package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC1938y {
    public static InterfaceC1884q c(K k10, Iterator<InterfaceC1884q> it, InterfaceC1884q interfaceC1884q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1884q interfaceC1884qA = k10.b(it.next()).a((C1814g) interfaceC1884q);
                if (interfaceC1884qA instanceof C1842k) {
                    C1842k c1842k = (C1842k) interfaceC1884qA;
                    if ("break".equals(c1842k.f25779c)) {
                        return InterfaceC1884q.f25814f0;
                    }
                    if ("return".equals(c1842k.f25779c)) {
                        return c1842k;
                    }
                }
            }
        }
        return InterfaceC1884q.f25814f0;
    }

    public static InterfaceC1884q d(K k10, InterfaceC1884q interfaceC1884q, InterfaceC1884q interfaceC1884q2) {
        if (interfaceC1884q instanceof Iterable) {
            return c(k10, ((Iterable) interfaceC1884q).iterator(), interfaceC1884q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        InterfaceC1884q interfaceC1884qA;
        C1842k c1842k;
        switch (J.f25480a[D1.b(str).ordinal()]) {
            case 1:
                D1.f(zzbv.FOR_IN, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strA = ((InterfaceC1884q) arrayList.get(0)).A();
                InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
                Iterator<InterfaceC1884q> itB = interfaceC1884qC.B();
                if (itB != null) {
                    while (itB.hasNext()) {
                        y10.e(strA, itB.next());
                        InterfaceC1884q interfaceC1884qA2 = y10.a((C1814g) interfaceC1884qC2);
                        if (interfaceC1884qA2 instanceof C1842k) {
                            C1842k c1842k2 = (C1842k) interfaceC1884qA2;
                            if ("break".equals(c1842k2.f25779c)) {
                                return InterfaceC1884q.f25814f0;
                            }
                            if ("return".equals(c1842k2.f25779c)) {
                                return c1842k2;
                            }
                        }
                    }
                }
                return InterfaceC1884q.f25814f0;
            case 2:
                D1.f(zzbv.FOR_IN_CONST, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new W.f(y10, ((InterfaceC1884q) arrayList.get(0)).A()), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).B(), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2)));
            case 3:
                D1.f(zzbv.FOR_IN_LET, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strA2 = ((InterfaceC1884q) arrayList.get(0)).A();
                InterfaceC1884q interfaceC1884qC3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                InterfaceC1884q interfaceC1884qC4 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
                Iterator<InterfaceC1884q> itB2 = interfaceC1884qC3.B();
                if (itB2 != null) {
                    while (itB2.hasNext()) {
                        InterfaceC1884q next = itB2.next();
                        Y1 y1D = y10.d();
                        y1D.e(strA2, next);
                        InterfaceC1884q interfaceC1884qA3 = y1D.a((C1814g) interfaceC1884qC4);
                        if (interfaceC1884qA3 instanceof C1842k) {
                            C1842k c1842k3 = (C1842k) interfaceC1884qA3;
                            if ("break".equals(c1842k3.f25779c)) {
                                return InterfaceC1884q.f25814f0;
                            }
                            if ("return".equals(c1842k3.f25779c)) {
                                return c1842k3;
                            }
                        }
                    }
                }
                return InterfaceC1884q.f25814f0;
            case 4:
                D1.f(zzbv.FOR_LET, 4, arrayList);
                InterfaceC1884q interfaceC1884qC5 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                if (!(interfaceC1884qC5 instanceof C1814g)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C1814g c1814g = (C1814g) interfaceC1884qC5;
                InterfaceC1884q interfaceC1884q = (InterfaceC1884q) arrayList.get(1);
                InterfaceC1884q interfaceC1884q2 = (InterfaceC1884q) arrayList.get(2);
                InterfaceC1884q interfaceC1884qC6 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(3));
                Y1 y1D2 = y10.d();
                for (int i10 = 0; i10 < c1814g.s(); i10++) {
                    String strA3 = c1814g.d(i10).A();
                    y1D2.g(strA3, y10.c(strA3));
                }
                while (y10.f25642b.c(y10, interfaceC1884q).b().booleanValue()) {
                    InterfaceC1884q interfaceC1884qA4 = y10.a((C1814g) interfaceC1884qC6);
                    if (interfaceC1884qA4 instanceof C1842k) {
                        C1842k c1842k4 = (C1842k) interfaceC1884qA4;
                        if ("break".equals(c1842k4.f25779c)) {
                            return InterfaceC1884q.f25814f0;
                        }
                        if ("return".equals(c1842k4.f25779c)) {
                            return c1842k4;
                        }
                    }
                    Y1 y1D3 = y10.d();
                    for (int i11 = 0; i11 < c1814g.s(); i11++) {
                        String strA4 = c1814g.d(i11).A();
                        y1D3.g(strA4, y1D2.c(strA4));
                    }
                    y1D3.b(interfaceC1884q2);
                    y1D2 = y1D3;
                }
                return InterfaceC1884q.f25814f0;
            case 5:
                D1.f(zzbv.FOR_OF, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new androidx.compose.material.ripple.j(y10, ((InterfaceC1884q) arrayList.get(0)).A()), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2)));
            case 6:
                D1.f(zzbv.FOR_OF_CONST, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new W.f(y10, ((InterfaceC1884q) arrayList.get(0)).A()), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2)));
            case 7:
                D1.f(zzbv.FOR_OF_LET, 3, arrayList);
                if (!(arrayList.get(0) instanceof C1897s)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new R4.E(y10, ((InterfaceC1884q) arrayList.get(0)).A()), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)), y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2)));
            case 8:
                D1.f(zzbv.WHILE, 4, arrayList);
                InterfaceC1884q interfaceC1884q3 = (InterfaceC1884q) arrayList.get(0);
                InterfaceC1884q interfaceC1884q4 = (InterfaceC1884q) arrayList.get(1);
                InterfaceC1884q interfaceC1884q5 = (InterfaceC1884q) arrayList.get(2);
                InterfaceC1884q interfaceC1884qC7 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(3));
                if (y10.f25642b.c(y10, interfaceC1884q5).b().booleanValue()) {
                    InterfaceC1884q interfaceC1884qA5 = y10.a((C1814g) interfaceC1884qC7);
                    if (interfaceC1884qA5 instanceof C1842k) {
                        C1842k c1842k5 = (C1842k) interfaceC1884qA5;
                        if (!"break".equals(c1842k5.f25779c)) {
                            if ("return".equals(c1842k5.f25779c)) {
                                return c1842k5;
                            }
                            while (y10.f25642b.c(y10, interfaceC1884q3).b().booleanValue()) {
                                interfaceC1884qA = y10.a((C1814g) interfaceC1884qC7);
                                if (interfaceC1884qA instanceof C1842k) {
                                    c1842k = (C1842k) interfaceC1884qA;
                                    if (!"break".equals(c1842k.f25779c)) {
                                        if ("return".equals(c1842k.f25779c)) {
                                            return c1842k;
                                        }
                                    }
                                }
                                y10.b(interfaceC1884q4);
                            }
                        }
                    } else {
                        while (y10.f25642b.c(y10, interfaceC1884q3).b().booleanValue()) {
                            interfaceC1884qA = y10.a((C1814g) interfaceC1884qC7);
                            if (interfaceC1884qA instanceof C1842k) {
                                c1842k = (C1842k) interfaceC1884qA;
                                if (!"break".equals(c1842k.f25779c)) {
                                    if ("return".equals(c1842k.f25779c)) {
                                        return c1842k;
                                    }
                                }
                            }
                            y10.b(interfaceC1884q4);
                        }
                    }
                } else {
                    while (y10.f25642b.c(y10, interfaceC1884q3).b().booleanValue()) {
                        interfaceC1884qA = y10.a((C1814g) interfaceC1884qC7);
                        if (interfaceC1884qA instanceof C1842k) {
                            c1842k = (C1842k) interfaceC1884qA;
                            if (!"break".equals(c1842k.f25779c)) {
                                if ("return".equals(c1842k.f25779c)) {
                                    return c1842k;
                                }
                            }
                        }
                        y10.b(interfaceC1884q4);
                    }
                }
                return InterfaceC1884q.f25814f0;
            default:
                b(str);
                throw null;
        }
    }
}
