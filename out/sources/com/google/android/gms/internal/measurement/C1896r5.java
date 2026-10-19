package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1896r5 implements InterfaceC1903s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25832a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25832a = c1852l2.b("measurement.remove_app_background.client", false);
        c1852l2.a(0L, "measurement.id.remove_app_background.client");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1903s5
    public final boolean x() {
        return f25832a.a().booleanValue();
    }
}
