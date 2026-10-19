package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1909t4 implements InterfaceC1916u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25850a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25850a = c1852l2.b("measurement.disable_npa_for_dasher_and_unicorn", false);
        c1852l2.a(0L, "measurement.id.disable_npa_for_dasher_and_unicorn.client");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1916u4
    public final boolean x() {
        return f25850a.a().booleanValue();
    }
}
