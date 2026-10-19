package B8;

/* JADX INFO: compiled from: FragmentComposeBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X extends W {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1831s;

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1831s = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1831s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1831s = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
