package p191p5;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45842c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f45843d;

    public t(Executor executor, d dVar) {
        this.f45841b = executor;
        this.f45843d = dVar;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        if (gVar.o() || gVar.m()) {
            return;
        }
        synchronized (this.f45842c) {
            try {
                if (this.f45843d == null) {
                    return;
                }
                this.f45841b.execute(new s(this, gVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p191p5.w
    public final void y() {
        synchronized (this.f45842c) {
            this.f45843d = null;
        }
    }
}
