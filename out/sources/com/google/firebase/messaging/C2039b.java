package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2039b implements L6.c<o7.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2039b f28359a = new C2039b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28360b = new L6.b("messagingClientEvent", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        dVar.a(f28360b, ((o7.a) obj).f45233a);
    }
}
