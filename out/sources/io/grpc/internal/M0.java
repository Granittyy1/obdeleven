package io.grpc.internal;

/* JADX INFO: compiled from: SharedResourceHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L0.b f37271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L0.c f37272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0 f37274e;

    public M0(L0 l10, L0.b bVar, L0.c cVar, Object obj) {
        this.f37274e = l10;
        this.f37271b = bVar;
        this.f37272c = cVar;
        this.f37273d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37274e) {
            try {
                if (this.f37271b.f37269b == 0) {
                    try {
                        this.f37272c.b(this.f37273d);
                        this.f37274e.f37265a.remove(this.f37272c);
                        if (this.f37274e.f37265a.isEmpty()) {
                            this.f37274e.f37267c.shutdown();
                            this.f37274e.f37267c = null;
                        }
                    } catch (Throwable th) {
                        this.f37274e.f37265a.remove(this.f37272c);
                        if (this.f37274e.f37265a.isEmpty()) {
                            this.f37274e.f37267c.shutdown();
                            this.f37274e.f37267c = null;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
