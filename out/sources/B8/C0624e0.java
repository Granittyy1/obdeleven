package B8;

/* JADX INFO: renamed from: B8.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentEmptyBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0624e0 extends F {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1897r;

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1897r = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1897r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1897r = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
