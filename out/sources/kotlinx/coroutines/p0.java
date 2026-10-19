package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.c<p293xa.r> f43524e;

    public p0(kotlin.coroutines.e eVar, Ia.p<? super A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar) {
        super(eVar, true, false);
        this.f43524e = A8.p.u(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void l0() {
        try {
            kotlinx.coroutines.internal.i.a(A8.p.y(this.f43524e), p293xa.r.f47939a, null);
        } catch (Throwable th) {
            resumeWith(kotlin.b.a(th));
            throw th;
        }
    }
}
