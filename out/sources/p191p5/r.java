package p191p5;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45837c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f45838d;

    public r(Executor executor, c cVar) {
        this.f45836b = executor;
        this.f45838d = cVar;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        synchronized (this.f45837c) {
            try {
                if (this.f45838d == null) {
                    return;
                }
                this.f45836b.execute(new q(this, gVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p191p5.w
    public final void y() {
        synchronized (this.f45837c) {
            this.f45838d = null;
        }
    }
}
