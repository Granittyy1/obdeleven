package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1943y4 implements InterfaceC1923v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1845k2 f25930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1845k2 f25931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1845k2 f25932f;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        f25927a = c1852l2.b("measurement.dma_consent.client", true);
        f25928b = c1852l2.b("measurement.dma_consent.client_bow_check2", true);
        f25929c = c1852l2.b("measurement.dma_consent.service", true);
        f25930d = c1852l2.b("measurement.dma_consent.service_dcu_event", false);
        f25931e = c1852l2.b("measurement.dma_consent.service_npa_remote_default", true);
        f25932f = c1852l2.b("measurement.dma_consent.service_split_batch_on_consent", true);
        c1852l2.a(0L, "measurement.id.dma_consent.service_dcu_event");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean A() {
        return f25931e.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean b() {
        return f25929c.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean c() {
        return f25932f.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean x() {
        return f25927a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean y() {
        return f25928b.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1923v4
    public final boolean z() {
        return f25930d.a().booleanValue();
    }
}
