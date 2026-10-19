package C4;

/* JADX INFO: compiled from: TransportRuntime_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class z implements E4.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.d f2411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I4.p f2412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I4.t f2413c;

    public z(H4.d dVar, I4.p pVar, I4.t tVar) {
        this.f2411a = dVar;
        this.f2412b = pVar;
        this.f2413c = tVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new x(new L4.b(), new kotlin.jvm.internal.n(), (H4.e) this.f2411a.get(), (I4.o) this.f2412b.get(), (I4.s) this.f2413c.get());
    }
}
