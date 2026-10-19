package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1949z4 implements A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25941b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.collection.event_safelist", true);
        f25940a = c1852l2.b("measurement.service.store_null_safelist", true);
        f25941b = c1852l2.b("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final boolean x() {
        return f25940a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final boolean y() {
        return f25941b.a().booleanValue();
    }
}
