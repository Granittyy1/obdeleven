package p191p5;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class l<T> implements e, d, InterfaceC2756b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45815b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f45817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Exception f45821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45822i;

    public l(int i10, B b10) {
        this.f45816c = i10;
        this.f45817d = b10;
    }

    public final void a() {
        int i10 = this.f45818e + this.f45819f + this.f45820g;
        int i11 = this.f45816c;
        if (i10 == i11) {
            Exception exc = this.f45821h;
            B b10 = this.f45817d;
            if (exc == null) {
                if (this.f45822i) {
                    b10.u();
                    return;
                } else {
                    b10.t(null);
                    return;
                }
            }
            b10.s(new ExecutionException(this.f45819f + " out of " + i11 + " underlying tasks failed", this.f45821h));
        }
    }

    @Override // p191p5.InterfaceC2756b
    public final void b() {
        synchronized (this.f45815b) {
            this.f45820g++;
            this.f45822i = true;
            a();
        }
    }

    @Override // p191p5.d
    public final void d(Exception exc) {
        synchronized (this.f45815b) {
            this.f45819f++;
            this.f45821h = exc;
            a();
        }
    }

    @Override // p191p5.e
    public final void onSuccess(T t8) {
        synchronized (this.f45815b) {
            this.f45818e++;
            a();
        }
    }
}
