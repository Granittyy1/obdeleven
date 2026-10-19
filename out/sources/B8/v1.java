package B8;

/* JADX INFO: compiled from: ListDialogItemBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2175u;

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2175u;
            this.f2175u = 0L;
        }
        String str = this.f2167t;
        if ((j & 3) != 0) {
            N0.c.a(this.f2165r, str);
            N0.c.a(this.f2166s, str);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2175u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2175u = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.u1
    public final void t(String str) {
        this.f2167t = str;
        synchronized (this) {
            this.f2175u |= 1;
        }
        c(26);
        n();
    }
}
