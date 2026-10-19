package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class M4 implements N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25517a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25517a = c1852l2.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        c1852l2.b("measurement.client.sessions.check_on_startup", true);
        c1852l2.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final boolean x() {
        return f25517a.a().booleanValue();
    }
}
