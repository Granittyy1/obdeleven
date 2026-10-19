package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2010u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1967f1 f26267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26268b;

    public C2010u0(InterfaceC1967f1 interfaceC1967f1, int i10) {
        this.f26267a = interfaceC1967f1;
        this.f26268b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2010u0)) {
            return false;
        }
        C2010u0 c2010u0 = (C2010u0) obj;
        return this.f26267a == c2010u0.f26267a && this.f26268b == c2010u0.f26268b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f26267a) * 65535) + this.f26268b;
    }
}
