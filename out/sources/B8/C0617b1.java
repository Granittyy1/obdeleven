package B8;

/* JADX INFO: renamed from: B8.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ItemEditTextBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0617b1 extends AbstractC0614a1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f1868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1869w;

    /* JADX INFO: renamed from: B8.b1$a */
    /* JADX INFO: compiled from: ItemEditTextBindingImpl.java */
    public class a implements M0.f {
        public a() {
        }

        @Override // M0.f
        public final void a() {
            C0617b1 c0617b1 = C0617b1.this;
            c0617b1.u(c0617b1.f1857r.getText().toString());
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1869w;
            this.f1869w = 0L;
        }
        String str = this.f1859t;
        N8.e eVar = this.f1860u;
        long j10 = 5 & j;
        long j11 = j & 6;
        if (j10 != 0) {
            N0.c.a(this.f1857r, str);
        }
        if (j11 != 0) {
            N0.c.b(this.f1857r, eVar, this.f1868v);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1869w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1869w = 4L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0614a1
    public final void t(N8.e eVar) {
        this.f1860u = eVar;
        synchronized (this) {
            this.f1869w |= 2;
        }
        c(19);
        n();
    }

    @Override // B8.AbstractC0614a1
    public final void u(String str) {
        this.f1859t = str;
        synchronized (this) {
            this.f1869w |= 1;
        }
        c(30);
        n();
    }
}
