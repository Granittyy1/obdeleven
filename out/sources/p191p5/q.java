package p191p5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f45834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f45835c;

    public q(r rVar, g gVar) {
        this.f45835c = rVar;
        this.f45834b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f45835c.f45837c) {
            try {
                c cVar = this.f45835c.f45838d;
                if (cVar != null) {
                    cVar.e(this.f45834b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
