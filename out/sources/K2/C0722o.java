package K2;

/* JADX INFO: renamed from: K2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OperationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0722o implements androidx.work.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.C<androidx.work.n.a> f4201c = new androidx.lifecycle.C<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<androidx.work.n.a.c> f4202d = new androidx.work.impl.utils.futures.a<>();

    public C0722o() {
        a(androidx.work.n.f20464b);
    }

    public final void a(androidx.work.n.a aVar) {
        this.f4201c.k(aVar);
        boolean z10 = aVar instanceof androidx.work.n.a.c;
        androidx.work.impl.utils.futures.a<androidx.work.n.a.c> aVar2 = this.f4202d;
        if (z10) {
            aVar2.k((androidx.work.n.a.c) aVar);
        } else if (aVar instanceof androidx.work.n.a.C0204a) {
            aVar2.l(((androidx.work.n.a.C0204a) aVar).f20465a);
        }
    }
}
