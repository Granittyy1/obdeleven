package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25416a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.client.sessions.background_sessions_enabled", true);
        f25416a = c1852l2.b("measurement.client.sessions.enable_fix_background_engagement", false);
        c1852l2.b("measurement.client.sessions.immediate_start_enabled_foreground", true);
        c1852l2.b("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c1852l2.b("measurement.client.sessions.session_id_enabled", true);
        c1852l2.a(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final boolean a() {
        return f25416a.a().booleanValue();
    }
}
