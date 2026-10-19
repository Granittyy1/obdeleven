package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2013v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C2013v0 f26276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2013v0 f26277c = new C2013v0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26278a;

    public C2013v0() {
        this.f26278a = new HashMap();
    }

    public final H0 a(InterfaceC1967f1 interfaceC1967f1, int i10) {
        return (H0) this.f26278a.get(new C2010u0(interfaceC1967f1, i10));
    }

    public C2013v0(int i10) {
        this.f26278a = Collections.emptyMap();
    }
}
