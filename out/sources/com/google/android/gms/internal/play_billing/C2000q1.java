package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2000q1 extends C2014v1 {
    public C2000q1() {
        this.f26282d = Collections.emptyMap();
        this.f26285g = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.play_billing.C2014v1
    public final void a() {
        if (!this.f26283e) {
            if (this.f26281c > 0) {
                ((InterfaceC2025z0) f(0).f26246b).z();
                throw null;
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                ((InterfaceC2025z0) ((Map.Entry) it.next()).getKey()).z();
                throw null;
            }
        }
        super.a();
    }
}
