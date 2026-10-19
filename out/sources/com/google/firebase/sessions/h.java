package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements L6.c<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f28709a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28710b = L6.b.a("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28711c = L6.b.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28712d = L6.b.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f28713e = L6.b.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f28714f = L6.b.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f28715g = L6.b.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f28716h = L6.b.a("firebaseAuthenticationToken");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        t tVar = (t) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f28710b, tVar.f28770a);
        dVar2.a(f28711c, tVar.f28771b);
        dVar2.c(f28712d, tVar.f28772c);
        dVar2.d(f28713e, tVar.f28773d);
        dVar2.a(f28714f, tVar.f28774e);
        dVar2.a(f28715g, tVar.f28775f);
        dVar2.a(f28716h, tVar.f28776g);
    }
}
