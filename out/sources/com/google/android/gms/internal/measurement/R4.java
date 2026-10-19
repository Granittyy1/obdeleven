package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R4 implements O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25581b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25580a = c1852l2.b("measurement.gbraid_campaign.gbraid.client.dev", false);
        f25581b = c1852l2.b("measurement.gbraid_campaign.gbraid.service", false);
        c1852l2.a(0L, "measurement.id.gbraid_campaign.service");
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final boolean x() {
        return f25580a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final boolean y() {
        return f25581b.a().booleanValue();
    }
}
