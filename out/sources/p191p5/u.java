package p191p5;

import R4.p;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45845c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f45846d;

    public u(Executor executor, e eVar) {
        this.f45844b = executor;
        this.f45846d = eVar;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        if (gVar.o()) {
            synchronized (this.f45845c) {
                try {
                    if (this.f45846d == null) {
                        return;
                    }
                    this.f45844b.execute(new p(this, gVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p191p5.w
    public final void y() {
        synchronized (this.f45845c) {
            this.f45846d = null;
        }
    }
}
