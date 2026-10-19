package com.google.android.datatransport.cct.internal;

import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements L6.c<NetworkConnectionInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25249a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f25250b = L6.b.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f25251c = L6.b.a("mobileSubtype");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f25250b, networkConnectionInfo.b());
        dVar2.a(f25251c, networkConnectionInfo.a());
    }
}
