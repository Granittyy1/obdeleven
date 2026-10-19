package com.google.firebase.messaging;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2040c implements L6.c<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2040c f28361a = new C2040c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28362b = L6.b.a("messagingClientEventExtension");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        dVar.a(f28362b, ((A) obj).a());
    }
}
