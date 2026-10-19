package kotlinx.datetime.format;

/* JADX INFO: compiled from: LocalDateFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC2716a<Ua.e, p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.datetime.internal.format.f<InterfaceC2720e> f43844a;

    /* JADX INFO: compiled from: LocalDateFormat.kt */
    public static final class a implements InterfaceC2717b<InterfaceC2720e, a>, InterfaceC2718c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kotlinx.datetime.internal.format.d f43845a;

        public a(kotlinx.datetime.internal.format.d dVar) {
            this.f43845a = dVar;
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final kotlinx.datetime.internal.format.d a() {
            return this.f43845a;
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

        @Override // kotlinx.datetime.format.InterfaceC2724i.a
        public final void p(Padding padding) {
            kotlin.jvm.internal.i.e(padding, "padding");
            u(new kotlinx.datetime.internal.format.e(new C2726k(padding)));
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final void t(Ia.l<? super a, p293xa.r>[] lVarArr, Ia.l<? super a, p293xa.r> lVar) {
            InterfaceC2717b.a.a(this, lVarArr, lVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2718c
        public final void u(kotlinx.datetime.internal.format.n<? super InterfaceC2720e> nVar) {
            this.f43845a.a(nVar);
        }

        @Override // kotlinx.datetime.format.InterfaceC2717b
        public final InterfaceC2717b v() {
            return new a(new kotlinx.datetime.internal.format.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(kotlinx.datetime.internal.format.f<? super InterfaceC2720e> fVar) {
        this.f43844a = fVar;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.f<InterfaceC2720e> b() {
        return this.f43844a;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final kotlinx.datetime.internal.format.parser.c c() {
        return LocalDateFormatKt.f43747c;
    }

    @Override // kotlinx.datetime.format.AbstractC2716a
    public final Ua.e d(kotlinx.datetime.internal.format.parser.c cVar) {
        p intermediate = (p) cVar;
        kotlin.jvm.internal.i.e(intermediate, "intermediate");
        return intermediate.b();
    }
}
