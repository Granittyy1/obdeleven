package com.google.firebase.sessions;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements L6.c<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f28705a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28706b = L6.b.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28707c = L6.b.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28708d = L6.b.a("applicationInfo");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        p pVar = (p) obj;
        L6.d dVar2 = dVar;
        pVar.getClass();
        dVar2.a(f28706b, EventType.SESSION_START);
        dVar2.a(f28707c, pVar.f28734a);
        dVar2.a(f28708d, pVar.f28735b);
    }
}
