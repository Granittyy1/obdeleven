package kotlinx.datetime.format;

import java.time.LocalDateTime;

/* JADX INFO: compiled from: LocalDateTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC2716a<Ua.f, q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.f<Object> f43846a;

    /* JADX INFO: compiled from: LocalDateTimeFormat.kt */
    public static final class a implements InterfaceC2717b<Object, a>, InterfaceC2718c, InterfaceC2719d, InterfaceC2724i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.datetime.internal.format.d f43847a;

        public a(kotlinx.datetime.internal.format.d dVar) {
            this.f43847a = dVar;
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final kotlinx.datetime.internal.format.d a() {
            return this.f43847a;
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

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void l(int i10, int i11) {
            InterfaceC2719d.a.a(this, i10, i11);
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void n(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            h(new kotlinx.datetime.internal.format.e(new o(padding)));
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

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void x(int i10) {
            l(i10, i10);
        }

        public final void z(kotlinx.datetime.internal.format.n<Object> nVar) {
            this.f43847a.a(nVar);
        }
    }

    public u(kotlinx.datetime.internal.format.f<Object> fVar) {
        this.f43846a = fVar;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.f<Object> b() {
        return this.f43846a;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.parser.c c() {
        return LocalDateTimeFormatKt.f43753b;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final Ua.f d(kotlinx.datetime.internal.format.parser.c cVar) {
        q intermediate = (q) cVar;
        kotlin.jvm.internal.i.e(intermediate, "intermediate");
        LocalDateTime localDateTimeOf = LocalDateTime.of(intermediate.f43832a.b().f6578b, intermediate.f43833b.i().f6582b);
        kotlin.jvm.internal.i.d(localDateTimeOf, "of(...)");
        return new Ua.f(localDateTimeOf);
    }
}
