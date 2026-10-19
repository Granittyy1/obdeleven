package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class E4 implements B4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25439c;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.client.ad_id_consent_fix", true);
        f25437a = c1852l2.b("measurement.service.consent.aiid_reset_fix", true);
        f25438b = c1852l2.b("measurement.service.consent.app_start_fix", true);
        f25439c = c1852l2.b("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final boolean a() {
        return f25437a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final boolean x() {
        return f25438b.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final boolean y() {
        return f25439c.a().booleanValue();
    }
}
