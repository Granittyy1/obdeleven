package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2009u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26266c;

    public C2009u(Object obj, Object obj2, Object obj3) {
        this.f26264a = obj;
        this.f26265b = obj2;
        this.f26266c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f26264a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f26265b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f26266c);
        StringBuilder sbC = B6.a.c("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbC.append(strValueOf3);
        sbC.append("=");
        sbC.append(strValueOf4);
        return new IllegalArgumentException(sbC.toString());
    }
}
