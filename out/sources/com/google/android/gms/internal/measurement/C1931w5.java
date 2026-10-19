package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1931w5 implements InterfaceC1910t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1845k2 f25906a = new C1852l2(C1810f2.a("com.google.android.gms.measurement"), "", "", true, true).b("measurement.sessionid.enable_client_session_id", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910t5
    public final boolean x() {
        return f25906a.a().booleanValue();
    }
}
