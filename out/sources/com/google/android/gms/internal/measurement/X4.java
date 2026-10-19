package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class X4 implements U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25638a;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25638a = c1852l2.b("measurement.increase_param_lengths", false);
        c1852l2.a(0L, "measurement.id.increase_param_lengths");
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final boolean x() {
        return f25638a.a().booleanValue();
    }
}
