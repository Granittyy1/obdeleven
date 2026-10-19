package p191p5;

import U4.C0804l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class h<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f45811a = new B();

    public final void a(Exception exc) {
        this.f45811a.s(exc);
    }

    public final void b(TResult tresult) {
        this.f45811a.t(tresult);
    }

    public final void c(Exception exc) {
        B b10 = this.f45811a;
        b10.getClass();
        C0804l.i(exc, "Exception must not be null");
        synchronized (b10.f45805a) {
            try {
                if (b10.f45807c) {
                    return;
                }
                b10.f45807c = true;
                b10.f45810f = exc;
                b10.f45806b.b(b10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        B b10 = this.f45811a;
        synchronized (b10.f45805a) {
            try {
                if (b10.f45807c) {
                    return;
                }
                b10.f45807c = true;
                b10.f45809e = obj;
                b10.f45806b.b(b10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
