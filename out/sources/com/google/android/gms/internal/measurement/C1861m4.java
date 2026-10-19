package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1861m4 implements InterfaceC1840j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1831i2 f25799a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.client.consent_state_v1", true);
        c1852l2.b("measurement.client.3p_consent_state_v1", true);
        c1852l2.b("measurement.service.consent_state_v1_W36", true);
        f25799a = c1852l2.a(203600L, "measurement.service.storage_consent_support_version");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1840j4
    public final long a() {
        return f25799a.a().longValue();
    }
}
