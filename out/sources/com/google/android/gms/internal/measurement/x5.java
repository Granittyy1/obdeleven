package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25918c;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25916a = c1852l2.b("measurement.collection.enable_session_stitching_token.client.dev", true);
        f25917b = c1852l2.b("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f25918c = c1852l2.b("measurement.session_stitching_token_enabled", false);
        c1852l2.b("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean b() {
        return f25918c.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean x() {
        return f25916a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public final boolean y() {
        return f25917b.a().booleanValue();
    }
}
