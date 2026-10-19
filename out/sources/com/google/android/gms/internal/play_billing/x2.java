package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends v2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2 f26304i;

    public x2(y2 y2Var) {
        Objects.requireNonNull(y2Var);
        this.f26304i = y2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.v2
    public final String c() {
        w2 w2Var = (w2) this.f26304i.f26310b.get();
        return w2Var == null ? "Completer object has been garbage collected, future will fail soon" : androidx.compose.foundation.gestures.d.b("tag=[", String.valueOf(w2Var.f26293a), "]");
    }
}
