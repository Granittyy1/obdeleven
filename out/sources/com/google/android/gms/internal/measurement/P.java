package com.google.android.gms.internal.measurement;

import com.braze.models.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC1938y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        String str2;
        int i10 = 0;
        switch (O.f25538a[D1.b(str).ordinal()]) {
            case 1:
                D1.f(zzbv.ASSIGN, 2, arrayList);
                InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                if (!(interfaceC1884qC instanceof C1897s)) {
                    throw new IllegalArgumentException(B7.b.c("Expected string for assign var. got ", interfaceC1884qC.getClass().getCanonicalName()));
                }
                C1897s c1897s = (C1897s) interfaceC1884qC;
                boolean zF = y10.f(c1897s.f25833b);
                String str3 = c1897s.f25833b;
                if (!zF) {
                    throw new IllegalArgumentException(B7.b.c("Attempting to assign undefined value ", str3));
                }
                InterfaceC1884q interfaceC1884qC2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                y10.g(str3, interfaceC1884qC2);
                return interfaceC1884qC2;
            case 2:
                D1.k(zzbv.CONST, 2, arrayList);
                if (arrayList.size() % 2 != 0) {
                    throw new IllegalArgumentException(J4.i.b(arrayList.size(), "CONST requires an even number of arguments, found "));
                }
                while (i10 < arrayList.size() - 1) {
                    InterfaceC1884q interfaceC1884qC3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i10));
                    if (!(interfaceC1884qC3 instanceof C1897s)) {
                        throw new IllegalArgumentException(B7.b.c("Expected string for const name. got ", interfaceC1884qC3.getClass().getCanonicalName()));
                    }
                    String str4 = ((C1897s) interfaceC1884qC3).f25833b;
                    y10.e(str4, y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i10 + 1)));
                    y10.f25644d.put(str4, Boolean.TRUE);
                    i10 += 2;
                }
                return InterfaceC1884q.f25814f0;
            case 3:
                if (arrayList.isEmpty()) {
                    return new C1814g();
                }
                C1814g c1814g = new C1814g();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC1884q interfaceC1884qC4 = y10.f25642b.c(y10, (InterfaceC1884q) it.next());
                    if (interfaceC1884qC4 instanceof C1842k) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c1814g.I(i10, interfaceC1884qC4);
                    i10++;
                }
                return c1814g;
            case 4:
                if (arrayList.isEmpty()) {
                    return new C1877p();
                }
                if (arrayList.size() % 2 != 0) {
                    throw new IllegalArgumentException(J4.i.b(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                }
                C1877p c1877p = new C1877p();
                while (i10 < arrayList.size() - 1) {
                    InterfaceC1884q interfaceC1884qC5 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i10));
                    InterfaceC1884q interfaceC1884qC6 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i10 + 1));
                    if ((interfaceC1884qC5 instanceof C1842k) || (interfaceC1884qC6 instanceof C1842k)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    c1877p.k(interfaceC1884qC5.A(), interfaceC1884qC6);
                    i10 += 2;
                }
                return c1877p;
            case 5:
                D1.k(zzbv.EXPRESSION_LIST, 1, arrayList);
                InterfaceC1884q interfaceC1884qC7 = InterfaceC1884q.f25814f0;
                while (i10 < arrayList.size()) {
                    interfaceC1884qC7 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i10));
                    if (interfaceC1884qC7 instanceof C1842k) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i10++;
                }
                return interfaceC1884qC7;
            case 6:
                D1.f(zzbv.GET, 1, arrayList);
                InterfaceC1884q interfaceC1884qC8 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                if (interfaceC1884qC8 instanceof C1897s) {
                    return y10.c(((C1897s) interfaceC1884qC8).f25833b);
                }
                throw new IllegalArgumentException(B7.b.c("Expected string for get var. got ", interfaceC1884qC8.getClass().getCanonicalName()));
            case 7:
            case 8:
                D1.f(zzbv.GET_PROPERTY, 2, arrayList);
                InterfaceC1884q interfaceC1884qC9 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                InterfaceC1884q interfaceC1884qC10 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                if ((interfaceC1884qC9 instanceof C1814g) && D1.l(interfaceC1884qC10)) {
                    return ((C1814g) interfaceC1884qC9).d(interfaceC1884qC10.z().intValue());
                }
                if (interfaceC1884qC9 instanceof InterfaceC1849l) {
                    return ((InterfaceC1849l) interfaceC1884qC9).e(interfaceC1884qC10.A());
                }
                if (interfaceC1884qC9 instanceof C1897s) {
                    if (Name.LENGTH.equals(interfaceC1884qC10.A())) {
                        return new C1835j(Double.valueOf(((C1897s) interfaceC1884qC9).f25833b.length()));
                    }
                    if (D1.l(interfaceC1884qC10)) {
                        C1897s c1897s2 = (C1897s) interfaceC1884qC9;
                        if (interfaceC1884qC10.z().doubleValue() < c1897s2.f25833b.length()) {
                            return new C1897s(String.valueOf(c1897s2.f25833b.charAt(interfaceC1884qC10.z().intValue())));
                        }
                    }
                }
                return InterfaceC1884q.f25814f0;
            case 9:
                D1.f(zzbv.NULL, 0, arrayList);
                return InterfaceC1884q.f25815g0;
            case 10:
                D1.f(zzbv.SET_PROPERTY, 3, arrayList);
                InterfaceC1884q interfaceC1884qC11 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                InterfaceC1884q interfaceC1884qC12 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                InterfaceC1884q interfaceC1884qC13 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(2));
                if (interfaceC1884qC11 == InterfaceC1884q.f25814f0 || interfaceC1884qC11 == InterfaceC1884q.f25815g0) {
                    throw new IllegalStateException(B6.c.d("Can't set property ", interfaceC1884qC12.A(), " of ", interfaceC1884qC11.A()));
                }
                if ((interfaceC1884qC11 instanceof C1814g) && (interfaceC1884qC12 instanceof C1835j)) {
                    ((C1814g) interfaceC1884qC11).I(((C1835j) interfaceC1884qC12).f25775b.intValue(), interfaceC1884qC13);
                } else if (interfaceC1884qC11 instanceof InterfaceC1849l) {
                    ((InterfaceC1849l) interfaceC1884qC11).k(interfaceC1884qC12.A(), interfaceC1884qC13);
                }
                return interfaceC1884qC13;
            case 11:
                D1.f(zzbv.TYPEOF, 1, arrayList);
                InterfaceC1884q interfaceC1884qC14 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                if (interfaceC1884qC14 instanceof C1932x) {
                    str2 = "undefined";
                } else if (interfaceC1884qC14 instanceof C1821h) {
                    str2 = "boolean";
                } else if (interfaceC1884qC14 instanceof C1835j) {
                    str2 = "number";
                } else if (interfaceC1884qC14 instanceof C1897s) {
                    str2 = FeatureFlag.PROPERTIES_TYPE_STRING;
                } else if (interfaceC1884qC14 instanceof r) {
                    str2 = "function";
                } else {
                    if ((interfaceC1884qC14 instanceof C1904t) || (interfaceC1884qC14 instanceof C1842k)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC1884qC14));
                    }
                    str2 = "object";
                }
                return new C1897s(str2);
            case 12:
                D1.f(zzbv.UNDEFINED, 0, arrayList);
                return InterfaceC1884q.f25814f0;
            case 13:
                D1.k(zzbv.VAR, 1, arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC1884q interfaceC1884qC15 = y10.f25642b.c(y10, (InterfaceC1884q) it2.next());
                    if (!(interfaceC1884qC15 instanceof C1897s)) {
                        throw new IllegalArgumentException(B7.b.c("Expected string for var name. got ", interfaceC1884qC15.getClass().getCanonicalName()));
                    }
                    y10.e(((C1897s) interfaceC1884qC15).f25833b, InterfaceC1884q.f25814f0);
                }
                return InterfaceC1884q.f25814f0;
            default:
                b(str);
                throw null;
        }
    }
}
