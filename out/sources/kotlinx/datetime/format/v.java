package kotlinx.datetime.format;

/* JADX INFO: compiled from: LocalTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends AbstractC2716a<Ua.g, r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.f<C> f43848a;

    /* JADX INFO: compiled from: LocalTimeFormat.kt */
    public static final class a implements InterfaceC2717b<C, a>, InterfaceC2719d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.datetime.internal.format.d f43849a;

        public a(kotlinx.datetime.internal.format.d dVar) {
            this.f43849a = dVar;
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final kotlinx.datetime.internal.format.d a() {
            return this.f43849a;
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
            this.f43849a.a(nVar);
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

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void t(Ia.l<? super a, p293xa.r>[] lVarArr, Ia.l<? super a, p293xa.r> lVar) {
            InterfaceC2717b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final InterfaceC2717b v() {
            return new a(new kotlinx.datetime.internal.format.d());
        }

        @Override // kotlinx.datetime.format.InterfaceC2724i.d
        public final void x(int i10) {
            l(i10, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(kotlinx.datetime.internal.format.f<? super C> fVar) {
        this.f43848a = fVar;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.f<C> b() {
        return this.f43848a;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.parser.c c() {
        return LocalTimeFormatKt.f43759b;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final Ua.g d(kotlinx.datetime.internal.format.parser.c cVar) {
        r intermediate = (r) cVar;
        kotlin.jvm.internal.i.e(intermediate, "intermediate");
        return intermediate.i();
    }
}
