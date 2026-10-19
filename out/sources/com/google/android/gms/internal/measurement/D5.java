package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D5 implements E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25432b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25431a = c1852l2.b("measurement.sfmc.client", true);
        f25432b = c1852l2.b("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final boolean x() {
        return f25431a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final boolean y() {
        return f25432b.a().booleanValue();
    }
}
