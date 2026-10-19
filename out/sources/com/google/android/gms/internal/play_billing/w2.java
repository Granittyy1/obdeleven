package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y2 f26294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z2 f26295c = new z2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26296d;

    public final void a(Object obj) {
        this.f26296d = true;
        y2 y2Var = this.f26294b;
        if (y2Var != null) {
            x2 x2Var = y2Var.f26311c;
            x2Var.getClass();
            if (obj == null) {
                obj = v2.f26289h;
            }
            if (v2.f26288g.d(x2Var, null, obj)) {
                v2.d(x2Var);
                this.f26293a = null;
                this.f26294b = null;
                this.f26295c = null;
            }
        }
    }

    public final void finalize() {
        z2 z2Var;
        y2 y2Var = this.f26294b;
        if (y2Var != null) {
            x2 x2Var = y2Var.f26311c;
            if (!x2Var.isDone()) {
                if (v2.f26288g.d(x2Var, null, new V0(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f26293a)))))) {
                    v2.d(x2Var);
                }
            }
        }
        if (this.f26296d || (z2Var = this.f26295c) == null) {
            return;
        }
        z2Var.i(null);
    }
}
