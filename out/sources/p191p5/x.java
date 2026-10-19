package p191p5;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45850a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f45851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45852c;

    public final void a(w wVar) {
        synchronized (this.f45850a) {
            try {
                if (this.f45851b == null) {
                    this.f45851b = new ArrayDeque();
                }
                this.f45851b.add(wVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(g gVar) {
        w wVar;
        synchronized (this.f45850a) {
            if (this.f45851b != null && !this.f45852c) {
                this.f45852c = true;
                while (true) {
                    synchronized (this.f45850a) {
                        try {
                            wVar = (w) this.f45851b.poll();
                            if (wVar == null) {
                                this.f45852c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wVar.a(gVar);
                }
            }
        }
    }
}
