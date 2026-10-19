package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1799d5 implements InterfaceC1778a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25679a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        c1852l2.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f25679a = c1852l2.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c1852l2.a(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1778a5
    public final boolean a() {
        return f25679a.a().booleanValue();
    }
}
