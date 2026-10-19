package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1806e5 implements InterfaceC1813f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1838j2 f25697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1831i2 f25698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1831i2 f25699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1859m2 f25700e;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25696a = c1852l2.b("measurement.test.boolean_flag", false);
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = AbstractC1803e2.f25685g;
        f25697b = new C1838j2(c1852l2, "measurement.test.double_flag", dValueOf);
        f25698c = c1852l2.a(-2L, "measurement.test.int_flag");
        f25699d = c1852l2.a(-1L, "measurement.test.long_flag");
        f25700e = c1852l2.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813f5
    public final double a() {
        return f25697b.a().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813f5
    public final String b() {
        return f25700e.a();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813f5
    public final long x() {
        return f25698c.a().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813f5
    public final long y() {
        return f25699d.a().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1813f5
    public final boolean z() {
        return f25696a.a().booleanValue();
    }
}
