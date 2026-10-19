package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1826h4 implements InterfaceC1833i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25767b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25766a = c1852l2.b("measurement.consent_regional_defaults.client", false);
        f25767b = c1852l2.b("measurement.consent_regional_defaults.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1833i4
    public final boolean x() {
        return f25766a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1833i4
    public final boolean y() {
        return f25767b.a().booleanValue();
    }
}
