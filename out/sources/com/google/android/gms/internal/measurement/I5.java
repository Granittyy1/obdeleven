package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I5 implements F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25479c;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25477a = c1852l2.b("measurement.sgtm.client.dev", false);
        f25478b = c1852l2.b("measurement.sgtm.preview_mode_enabled.dev", false);
        f25479c = c1852l2.b("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean b() {
        return f25479c.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean x() {
        return f25477a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final boolean y() {
        return f25478b.a().booleanValue();
    }
}
