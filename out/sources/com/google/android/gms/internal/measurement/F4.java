package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class F4 implements G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1845k2 f25451c;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f25449a = c1852l2.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f25450b = c1852l2.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f25451c = c1852l2.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final boolean b() {
        return f25451c.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final boolean x() {
        return f25449a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final boolean y() {
        return f25450b.a().booleanValue();
    }
}
