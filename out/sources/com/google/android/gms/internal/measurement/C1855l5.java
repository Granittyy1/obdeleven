package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1855l5 implements InterfaceC1862m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1845k2 f25791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1845k2 f25792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1845k2 f25793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1845k2 f25794g;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25788a = c1852l2.b("measurement.rb.attribution.client2", true);
        f25789b = c1852l2.b("measurement.rb.attribution.dma_fix", true);
        f25790c = c1852l2.b("measurement.rb.attribution.followup1.service", false);
        f25791d = c1852l2.b("measurement.rb.attribution.index_out_of_bounds_fix", false);
        f25792e = c1852l2.b("measurement.rb.attribution.service", true);
        f25793f = c1852l2.b("measurement.rb.attribution.enable_trigger_redaction", true);
        f25794g = c1852l2.b("measurement.rb.attribution.uuid_generation", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean A() {
        return f25792e.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean B() {
        return f25794g.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean b() {
        return f25790c.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean c() {
        return f25793f.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean x() {
        return f25788a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean y() {
        return f25789b.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1862m5
    public final boolean z() {
        return f25791d.a().booleanValue();
    }
}
