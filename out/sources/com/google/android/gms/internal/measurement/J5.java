package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class J5 implements K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25491b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25490a = c1852l2.b("measurement.tcf.client", false);
        f25491b = c1852l2.b("measurement.tcf.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final boolean x() {
        return f25490a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final boolean y() {
        return f25491b.a().booleanValue();
    }
}
