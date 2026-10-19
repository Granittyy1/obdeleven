package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends D {
    @Override // com.google.android.gms.internal.play_billing.D
    public final A a(C c10, A a10) {
        A a11;
        synchronized (c10) {
            try {
                a11 = c10.f26140c;
                if (a11 != a10) {
                    c10.f26140c = a10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a11;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final H b(C c10) {
        H h8;
        H h10 = H.f26132c;
        synchronized (c10) {
            try {
                h8 = c10.f26141d;
                if (h8 != h10) {
                    c10.f26141d = h10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h8;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void c(H h8, H h10) {
        h8.f26134b = h10;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final void d(H h8, Thread thread) {
        h8.f26133a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean e(C c10, A a10, A a11) {
        synchronized (c10) {
            try {
                if (c10.f26140c != a10) {
                    return false;
                }
                c10.f26140c = a11;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean f(I i10, Object obj, Object obj2) {
        synchronized (i10) {
            try {
                if (i10.f26139b != obj) {
                    return false;
                }
                i10.f26139b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D
    public final boolean g(I i10, H h8, H h10) {
        synchronized (i10) {
            try {
                if (i10.f26141d != h8) {
                    return false;
                }
                i10.f26141d = h10;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
