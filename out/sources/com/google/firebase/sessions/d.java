package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements L6.c<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f28689a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28690b = L6.b.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28691c = L6.b.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28692d = L6.b.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f28693e = L6.b.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f28694f = L6.b.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f28695g = L6.b.a("androidAppInfo");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        b bVar = (b) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f28690b, bVar.f28678a);
        dVar2.a(f28691c, bVar.f28679b);
        dVar2.a(f28692d, "1.2.3");
        dVar2.a(f28693e, bVar.f28680c);
        dVar2.a(f28694f, LogEnvironment.LOG_ENVIRONMENT_PROD);
        dVar2.a(f28695g, bVar.f28681d);
    }
}
