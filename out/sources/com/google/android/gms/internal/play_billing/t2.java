package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 extends V {
    @Override // com.google.android.gms.internal.play_billing.V
    public final void a(u2 u2Var, u2 u2Var2) {
        u2Var.f26272b = u2Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final void b(u2 u2Var, Thread thread) {
        u2Var.f26271a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean c(v2 v2Var, C2005s1 c2005s1, C2005s1 c2005s2) {
        synchronized (v2Var) {
            try {
                if (v2Var.f26291c != c2005s1) {
                    return false;
                }
                v2Var.f26291c = c2005s2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean d(v2 v2Var, Object obj, Object obj2) {
        synchronized (v2Var) {
            try {
                if (v2Var.f26290b != obj) {
                    return false;
                }
                v2Var.f26290b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V
    public final boolean e(v2 v2Var, u2 u2Var, u2 u2Var2) {
        synchronized (v2Var) {
            try {
                if (v2Var.f26292d != u2Var) {
                    return false;
                }
                v2Var.f26292d = u2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
