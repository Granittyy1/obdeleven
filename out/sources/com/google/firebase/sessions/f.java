package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements L6.c<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f28700a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28701b = L6.b.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28702c = L6.b.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28703d = L6.b.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f28704e = L6.b.a("defaultProcess");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        l lVar = (l) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f28701b, lVar.f28724a);
        dVar2.c(f28702c, lVar.f28725b);
        dVar2.c(f28703d, lVar.f28726c);
        dVar2.e(f28704e, lVar.f28727d);
    }
}
