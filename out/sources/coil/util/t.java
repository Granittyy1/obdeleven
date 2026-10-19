package coil.util;

/* JADX INFO: compiled from: HardwareBitmaps.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23176a;

    public t(boolean z10) {
        this.f23176a = z10;
    }

    @Override // coil.util.r
    public boolean a() {
        return this.f23176a;
    }

    @Override // coil.util.r
    public boolean b(Z2.e eVar) {
        return this.f23176a;
    }

    public synchronized void c() {
        boolean z10 = false;
        while (!this.f23176a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        if (this.f23176a) {
            return false;
        }
        this.f23176a = true;
        notifyAll();
        return true;
    }
}
