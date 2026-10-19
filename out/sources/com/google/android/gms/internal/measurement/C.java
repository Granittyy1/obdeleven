package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends AbstractC1938y {
    public static r c(Y1 y10, ArrayList arrayList) {
        D1.k(zzbv.FN, 2, arrayList);
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
        InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
        if (!(interfaceC1884qC2 instanceof C1814g)) {
            throw new IllegalArgumentException(B7.b.c("FN requires an ArrayValue of parameter names found ", interfaceC1884qC2.getClass().getCanonicalName()));
        }
        ArrayList arrayListL = ((C1814g) interfaceC1884qC2).L();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new r(interfaceC1884qC.A(), arrayListL, arrayList2, y10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ab A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        InterfaceC1884q interfaceC1884qC;
        switch (E.f25433a[D1.b(str).ordinal()]) {
            case 1:
                D1.f(zzbv.APPLY, 3, arrayList);
                InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                String strA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).A();
                InterfaceC1884q interfaceC1884qC3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
                if (!(interfaceC1884qC3 instanceof C1814g)) {
                    throw new IllegalArgumentException(B7.b.c("Function arguments for Apply are not a list found ", interfaceC1884qC3.getClass().getCanonicalName()));
                }
                if (strA.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return interfaceC1884qC2.C(strA, y10, ((C1814g) interfaceC1884qC3).L());
            case 2:
                return y10.d().a(new C1814g(arrayList));
            case 3:
                D1.f(zzbv.BREAK, 0, arrayList);
                return InterfaceC1884q.f25817i0;
            case 4:
            case 5:
                if (!arrayList.isEmpty()) {
                    InterfaceC1884q interfaceC1884qC4 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                    if (interfaceC1884qC4 instanceof C1814g) {
                        return y10.a((C1814g) interfaceC1884qC4);
                    }
                }
                return InterfaceC1884q.f25814f0;
            case 6:
                D1.f(zzbv.BREAK, 0, arrayList);
                return InterfaceC1884q.f25816h0;
            case 7:
                D1.k(zzbv.DEFINE_FUNCTION, 2, arrayList);
                r rVarC = c(y10, arrayList);
                String str2 = rVarC.f25795b;
                if (str2 == null) {
                    y10.g("", rVarC);
                } else {
                    y10.g(str2, rVarC);
                }
                return rVarC;
            case 8:
                return c(y10, arrayList);
            case 9:
                D1.k(zzbv.IF, 2, arrayList);
                InterfaceC1884q interfaceC1884qC5 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                InterfaceC1884q interfaceC1884qC6 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                InterfaceC1884q interfaceC1884qC7 = arrayList.size() > 2 ? y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2)) : null;
                InterfaceC1884q interfaceC1884q = InterfaceC1884q.f25814f0;
                InterfaceC1884q interfaceC1884qA = interfaceC1884qC5.b().booleanValue() ? y10.a((C1814g) interfaceC1884qC6) : interfaceC1884qC7 != null ? y10.a((C1814g) interfaceC1884qC7) : interfaceC1884q;
                return interfaceC1884qA instanceof C1842k ? interfaceC1884qA : interfaceC1884q;
            case 10:
                return new C1814g(arrayList);
            case 11:
                if (arrayList.isEmpty()) {
                    return InterfaceC1884q.f25818j0;
                }
                D1.f(zzbv.RETURN, 1, arrayList);
                return new C1842k("return", y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)));
            case 12:
                D1.f(zzbv.SWITCH, 3, arrayList);
                InterfaceC1884q interfaceC1884qC8 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                InterfaceC1884q interfaceC1884qC9 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                InterfaceC1884q interfaceC1884qC10 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
                if (!(interfaceC1884qC9 instanceof C1814g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC1884qC10 instanceof C1814g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C1814g c1814g = (C1814g) interfaceC1884qC9;
                C1814g c1814g2 = (C1814g) interfaceC1884qC10;
                boolean z10 = false;
                for (int i10 = 0; i10 < c1814g.s(); i10++) {
                    if (z10) {
                        interfaceC1884qC = y10.f25642b.c(y10, c1814g2.d(i10));
                        if (interfaceC1884qC instanceof C1842k) {
                            if (!((C1842k) interfaceC1884qC).f25779c.equals("break")) {
                                return interfaceC1884qC;
                            }
                            return InterfaceC1884q.f25814f0;
                        }
                        z10 = true;
                    } else if (interfaceC1884qC8.equals(y10.f25642b.c(y10, c1814g.d(i10)))) {
                        interfaceC1884qC = y10.f25642b.c(y10, c1814g2.d(i10));
                        if (interfaceC1884qC instanceof C1842k) {
                            if (!((C1842k) interfaceC1884qC).f25779c.equals("break")) {
                                return interfaceC1884qC;
                            }
                            return InterfaceC1884q.f25814f0;
                        }
                        z10 = true;
                    } else {
                        continue;
                    }
                }
                if (c1814g.s() + 1 == c1814g2.s()) {
                    InterfaceC1884q interfaceC1884qC11 = y10.f25642b.c(y10, c1814g2.d(c1814g.s()));
                    if (interfaceC1884qC11 instanceof C1842k) {
                        String str3 = ((C1842k) interfaceC1884qC11).f25779c;
                        if (str3.equals("return") || str3.equals(ActionType.CONTINUE)) {
                            return interfaceC1884qC11;
                        }
                    }
                }
                return InterfaceC1884q.f25814f0;
            case 13:
                D1.f(zzbv.TERNARY, 3, arrayList);
                if (y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).b().booleanValue()) {
                    return y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                }
                return y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
            default:
                b(str);
                throw null;
        }
    }
}
