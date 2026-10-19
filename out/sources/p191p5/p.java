package p191p5;

import D3.b;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f45831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45832c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2756b f45833d;

    public p(Executor executor, InterfaceC2756b interfaceC2756b) {
        this.f45831b = executor;
        this.f45833d = interfaceC2756b;
    }

    @Override // p191p5.w
    public final void a(g gVar) {
        if (gVar.m()) {
            synchronized (this.f45832c) {
                try {
                    if (this.f45833d == null) {
                        return;
                    }
                    this.f45831b.execute(new b(2, this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p191p5.w
    public final void y() {
        synchronized (this.f45832c) {
            this.f45833d = null;
        }
    }
}
