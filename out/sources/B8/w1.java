package B8;

/* JADX INFO: compiled from: StartupActivityBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends F {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f2180r;

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2180r = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2180r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2180r = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
