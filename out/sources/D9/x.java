package D9;

/* JADX INFO: compiled from: SynchronizationContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w.b f2922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J9.g.d f2923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2925e;

    public x(w wVar, w.b bVar, J9.g.d dVar, long j) {
        this.f2925e = wVar;
        this.f2922b = bVar;
        this.f2923c = dVar;
        this.f2924d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2925e.execute(this.f2922b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2923c.toString());
        sb2.append("(scheduled in SynchronizationContext with delay of ");
        return p005a4.o.d(this.f2924d, ")", sb2);
    }
}
