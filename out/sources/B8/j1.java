package B8;

/* JADX INFO: compiled from: ItemProfileButtonBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends i1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1986t;

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1986t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1986t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1986t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
