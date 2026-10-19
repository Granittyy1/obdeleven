package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements L6.c<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28682a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28683b = L6.b.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28684c = L6.b.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28685d = L6.b.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f28686e = L6.b.a("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f28687f = L6.b.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f28688g = L6.b.a("appProcessDetails");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        a aVar = (a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f28683b, aVar.f28664a);
        dVar2.a(f28684c, aVar.f28665b);
        dVar2.a(f28685d, aVar.f28666c);
        dVar2.a(f28686e, aVar.f28667d);
        dVar2.a(f28687f, aVar.f28668e);
        dVar2.a(f28688g, aVar.f28669f);
    }
}
