package com.google.android.datatransport.cct.internal;

import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements L6.c<ClientInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25246a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f25247b = L6.b.a("clientType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f25248c = L6.b.a("androidClientInfo");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        ClientInfo clientInfo = (ClientInfo) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f25247b, clientInfo.b());
        dVar2.a(f25248c, clientInfo.a());
    }
}
