package kotlinx.datetime.format;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Unicode.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnicodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f43787a = kotlin.collections.q.c0(kotlin.collections.q.b0(new Na.c('a', 'z'), new Na.c('A', 'Z')), kotlin.collections.l.s('[', ']', '\''));

    public static final E.a a(char c10, int i10) {
        if (c10 == 'G') {
            return new E.a.AbstractC0481a.f(i10);
        }
        if (c10 == 'y') {
            return new E.a.AbstractC0481a.s(i10);
        }
        if (c10 == 'Y') {
            return new E.a.AbstractC0481a.o(i10);
        }
        if (c10 == 'u') {
            return new E.a.AbstractC0481a.r(i10);
        }
        if (c10 == 'U') {
            return new E.a.AbstractC0481a.C0482a(i10);
        }
        if (c10 == 'r') {
            return new E.a.AbstractC0481a.k(i10);
        }
        if (c10 == 'Q') {
            return new E.a.AbstractC0481a.j(i10);
        }
        if (c10 == 'q') {
            return new E.a.AbstractC0481a.n(i10);
        }
        if (c10 == 'M') {
            return new E.a.AbstractC0481a.i(i10);
        }
        if (c10 == 'L') {
            return new E.a.AbstractC0481a.m(i10);
        }
        if (c10 == 'w') {
            return new E.a.AbstractC0481a.q(i10);
        }
        if (c10 == 'W') {
            return new E.a.AbstractC0481a.p(i10);
        }
        if (c10 == 'd') {
            return new E.a.AbstractC0481a.b(i10);
        }
        if (c10 == 'D') {
            return new E.a.AbstractC0481a.e(i10);
        }
        if (c10 == 'F') {
            return new E.a.AbstractC0481a.d(i10);
        }
        if (c10 == 'g') {
            return new E.a.AbstractC0481a.h(i10);
        }
        if (c10 == 'E') {
            return new E.a.AbstractC0481a.c(i10);
        }
        if (c10 == 'e') {
            return new E.a.AbstractC0481a.g(i10);
        }
        if (c10 == 'c') {
            return new E.a.AbstractC0481a.l(i10);
        }
        if (c10 == 'a') {
            return new E.a.c.b(i10);
        }
        if (c10 == 'h') {
            return new E.a.c.C0485a(i10);
        }
        if (c10 == 'H') {
            return new E.a.c.C0486c(i10);
        }
        if (c10 == 'm') {
            return new E.a.c.d(i10);
        }
        if (c10 == 's') {
            return new E.a.c.e.C0487a(i10);
        }
        if (c10 == 'S') {
            return new E.a.c.f.C0488a(i10);
        }
        if (c10 == 'A') {
            return new E.a.c.f.b(i10);
        }
        if (c10 == 'n') {
            return new E.a.c.f.d(i10);
        }
        if (c10 == 'N') {
            return new E.a.c.f.C0489c(i10);
        }
        if (c10 == 'V') {
            return new E.a.d.b(i10);
        }
        if (c10 == 'v') {
            return new E.a.d.C0490a(i10);
        }
        if (c10 == 'z') {
            return new E.a.d.c(i10);
        }
        if (c10 == 'O') {
            return new E.a.b.C0483a(i10);
        }
        if (c10 == 'X') {
            return new E.a.b.C0484b(i10);
        }
        if (c10 == 'x') {
            return new E.a.b.c(i10);
        }
        return c10 == 'Z' ? new E.a.b.d(i10) : new F(c10, i10);
    }

    public static final void b(E.a aVar) {
        throw new IllegalArgumentException("Unknown length " + aVar.a() + " for the " + aVar.b() + " directive");
    }

    public static final void c(E.a.AbstractC0481a abstractC0481a, int i10) {
        StringBuilder sbE = A8.f.e(i10, "Padding do ", " digits is not supported for the ");
        sbE.append(abstractC0481a.b());
        sbE.append(" directive");
        throw new UnsupportedOperationException(sbE.toString());
    }

    public static final void d(InterfaceC2724i interfaceC2724i, final E e10) {
        if (e10 instanceof E.d) {
            interfaceC2724i.d(((E.d) e10).f43735a);
            return;
        }
        if (e10 instanceof E.c) {
            Iterator<T> it = ((E.c) e10).f43734a.iterator();
            while (it.hasNext()) {
                d(interfaceC2724i, (E) it.next());
            }
            return;
        }
        if (e10 instanceof E.b) {
            C2725j.a(interfaceC2724i, new Ia.l[]{new Ia.l<InterfaceC2724i, p293xa.r>() { // from class: kotlinx.datetime.format.UnicodeKt$byUnicodePattern$rec$2
                @Override // Ia.l
                public final p293xa.r invoke(InterfaceC2724i interfaceC2724i2) {
                    InterfaceC2724i alternativeParsing = interfaceC2724i2;
                    kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                    return p293xa.r.f47939a;
                }
            }}, new Ia.l<InterfaceC2724i, p293xa.r>() { // from class: kotlinx.datetime.format.UnicodeKt$byUnicodePattern$rec$3
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(InterfaceC2724i interfaceC2724i2) {
                    InterfaceC2724i alternativeParsing = interfaceC2724i2;
                    kotlin.jvm.internal.i.e(alternativeParsing, "$this$alternativeParsing");
                    UnicodeKt.d(alternativeParsing, ((E.b) e10).f43733a);
                    return p293xa.r.f47939a;
                }
            });
            return;
        }
        if (e10 instanceof E.a) {
            E.a aVar = (E.a) e10;
            if (aVar instanceof E.a.c) {
                if (interfaceC2724i instanceof InterfaceC2724i.d) {
                    ((E.a.c) e10).c((InterfaceC2724i.d) interfaceC2724i);
                    return;
                }
                throw new IllegalArgumentException(("A time-based directive " + e10 + " was used in a format builder that doesn't support time components").toString());
            }
            if (aVar instanceof E.a.AbstractC0481a) {
                if (interfaceC2724i instanceof InterfaceC2724i.a) {
                    ((E.a.AbstractC0481a) e10).c((InterfaceC2724i.a) interfaceC2724i);
                    return;
                }
                throw new IllegalArgumentException(("A date-based directive " + e10 + " was used in a format builder that doesn't support date components").toString());
            }
            if (aVar instanceof E.a.d) {
                if (interfaceC2724i instanceof InterfaceC2724i.c) {
                    ((E.a.d) e10).c((InterfaceC2724i.c) interfaceC2724i);
                    return;
                }
                throw new IllegalArgumentException(("A time-zone-based directive " + e10 + " was used in a format builder that doesn't support time-zone components").toString());
            }
            if (!(aVar instanceof E.a.b)) {
                if (aVar instanceof F) {
                    throw new IllegalArgumentException("The meaning of the directive '" + e10 + "' is unknown");
                }
                return;
            }
            if (interfaceC2724i instanceof InterfaceC2724i.e) {
                ((E.a.b) e10).c((InterfaceC2724i.e) interfaceC2724i);
                return;
            }
            throw new IllegalArgumentException(("A UTC-offset-based directive " + e10 + " was used in a format builder that doesn't support UTC offset components").toString());
        }
    }

    public static final void e(E.a aVar, String str) {
        StringBuilder sb2 = new StringBuilder("The directive '");
        sb2.append(aVar);
        sb2.append("' is locale-dependent, but locales are not supported in Kotlin");
        sb2.append(str != null ? ". ".concat(str) : "");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final void f(String str, String str2) {
        throw new UnsupportedOperationException(Q8.d.a(C7.g.a("kotlinx.datetime formatting does not support the ", str, " field. "), str2 != null ? str2.concat(" ") : "", "Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues"));
    }
}
