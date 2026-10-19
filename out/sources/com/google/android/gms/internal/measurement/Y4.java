package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y4 implements Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25647b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25646a = c1852l2.b("measurement.item_scoped_custom_parameters.client", true);
        f25647b = c1852l2.b("measurement.item_scoped_custom_parameters.service", false);
        c1852l2.a(0L, "measurement.id.item_scoped_custom_parameters.service");
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean x() {
        return f25646a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Z4
    public final boolean y() {
        return f25647b.a().booleanValue();
    }
}
