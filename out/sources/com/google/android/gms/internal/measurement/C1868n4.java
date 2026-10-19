package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1868n4 implements InterfaceC1875o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25805b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25804a = c1852l2.b("measurement.consent.stop_reset_on_ads_storage_denied.client.dev", false);
        f25805b = c1852l2.b("measurement.consent.stop_reset_on_ads_storage_denied.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1875o4
    public final boolean a() {
        return f25804a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1875o4
    public final boolean x() {
        return f25805b.a().booleanValue();
    }
}
