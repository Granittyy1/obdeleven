package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1890q5 implements InterfaceC1869n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1845k2 f25825b;

    static {
        C1852l2 c1852l2 = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true);
        c1852l2.b("measurement.redaction.app_instance_id", true);
        c1852l2.b("measurement.redaction.client_ephemeral_aiid_generation", true);
        c1852l2.b("measurement.redaction.config_redacted_fields", true);
        c1852l2.b("measurement.redaction.device_info", true);
        c1852l2.b("measurement.redaction.e_tag", true);
        c1852l2.b("measurement.redaction.enhanced_uid", true);
        c1852l2.b("measurement.redaction.populate_ephemeral_app_instance_id", true);
        c1852l2.b("measurement.redaction.google_signals", true);
        c1852l2.b("measurement.redaction.no_aiid_in_config_request", true);
        f25824a = c1852l2.b("measurement.redaction.retain_major_os_version", true);
        f25825b = c1852l2.b("measurement.redaction.scion_payload_generator", true);
        c1852l2.b("measurement.redaction.upload_redacted_fields", true);
        c1852l2.b("measurement.redaction.upload_subdomain_override", true);
        c1852l2.b("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1869n5
    public final boolean a() {
        return f25824a.a().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1869n5
    public final boolean x() {
        return f25825b.a().booleanValue();
    }
}
