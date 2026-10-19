package kotlinx.datetime.format;

import java.time.ZoneId;
import java.util.Set;
import kotlinx.datetime.internal.format.SignedFormatStructure;

/* JADX INFO: renamed from: kotlinx.datetime.format.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2722g extends AbstractC2716a<DateTimeComponents, C2721f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.f<C2721f> f43817a;

    /* JADX INFO: renamed from: kotlinx.datetime.format.g$a */
    /* JADX INFO: compiled from: DateTimeComponents.kt */
    public static final class a implements InterfaceC2717b<C2721f, a>, InterfaceC2718c, InterfaceC2719d, InterfaceC2724i.b, InterfaceC2724i.e, InterfaceC2724i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.datetime.internal.format.d f43818a;

        public a(kotlinx.datetime.internal.format.d dVar) {
            this.f43818a = dVar;
        }

        public final void A(kotlinx.datetime.internal.format.n<? super G> nVar) {
            this.f43818a.a(nVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final kotlinx.datetime.internal.format.d a() {
            return this.f43818a;
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void b() {
            InterfaceC2718c.a.a(this);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void c(Ia.l lVar, String str) {
            InterfaceC2717b.a.b(this, str, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i
        public final void d(String str) {
            InterfaceC2717b.a.d(this, str);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void e(v format) {
            kotlin.jvm.internal.i.e(format, "format");
            h(format.f43848a);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void f(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            h(new kotlinx.datetime.internal.format.e(new w(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void g(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            h(new kotlinx.datetime.internal.format.e(new B(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2719d
        public final void h(kotlinx.datetime.internal.format.n<? super C> nVar) {
            z(nVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void i(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            u(new kotlinx.datetime.internal.format.e(new x(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void j(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            u(new kotlinx.datetime.internal.format.e(new L(padding, false)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.c
        public final void k() {
            Ua.h.Companion.getClass();
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            kotlin.jvm.internal.i.d(availableZoneIds, "getAvailableZoneIds(...)");
            this.f43818a.a(new kotlinx.datetime.internal.format.e(new D(availableZoneIds)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void l(int i10, int i11) {
            InterfaceC2719d.a.a(this, i10, i11);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void m(H format) {
            kotlin.jvm.internal.i.e(format, "format");
            this.f43818a.a(format.f43738a);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void n(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            h(new kotlinx.datetime.internal.format.e(new o(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void o(m names) {
            kotlin.jvm.internal.i.e(names, "names");
            z(new kotlinx.datetime.internal.format.e(new C2727l(names)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void p(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            u(new kotlinx.datetime.internal.format.e(new C2726k(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void q(InterfaceC2723h<Ua.e> format) {
            kotlin.jvm.internal.i.e(format, "format");
            if (format instanceof t) {
                u(((t) format).f43844a);
            }
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void r(z names) {
            kotlin.jvm.internal.i.e(names, "names");
            z(new kotlinx.datetime.internal.format.e(new y(names)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void s(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            A(new kotlinx.datetime.internal.format.e(new I(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void t(Ia.l<? super a, p293xa.r>[] lVarArr, Ia.l<? super a, p293xa.r> lVar) {
            InterfaceC2717b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2718c
        public final void u(kotlinx.datetime.internal.format.n<? super InterfaceC2720e> nVar) {
            z(nVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final InterfaceC2717b v() {
            return new a(new kotlinx.datetime.internal.format.d());
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void w(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            A(new SignedFormatStructure(new kotlinx.datetime.internal.format.e(new K(padding))));
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void x(int i10) {
            l(i10, i10);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.e
        public final void y(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            A(new kotlinx.datetime.internal.format.e(new J(padding)));
        }

        public final void z(kotlinx.datetime.internal.format.n<Object> nVar) {
            this.f43818a.a(nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2722g(kotlinx.datetime.internal.format.f<? super C2721f> fVar) {
        this.f43817a = fVar;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.f<C2721f> b() {
        return this.f43817a;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.parser.c c() {
        return DateTimeComponentsKt.f43661b;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final DateTimeComponents d(kotlinx.datetime.internal.format.parser.c cVar) {
        C2721f intermediate = (C2721f) cVar;
        kotlin.jvm.internal.i.e(intermediate, "intermediate");
        return new DateTimeComponents(intermediate);
    }
}
