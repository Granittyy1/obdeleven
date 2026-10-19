package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements L6.c<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f28696a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28697b = L6.b.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28698c = L6.b.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28699d = L6.b.a("sessionSamplingRate");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        i iVar = (i) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f28697b, iVar.f28717a);
        dVar2.a(f28698c, iVar.f28718b);
        dVar2.b(f28699d, iVar.f28719c);
    }
}
