package com.google.firebase.messaging;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2038a implements L6.c<MessagingClientEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2038a f28344a = new C2038a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f28345b = new L6.b("projectNumber", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f28346c = new L6.b("messageId", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f28347d = new L6.b("instanceId", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f28348e = new L6.b("messageType", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f28349f = new L6.b("sdkPlatform", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f28350g = new L6.b("packageName", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f28351h = new L6.b("collapseKey", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f28352i = new L6.b("priority", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(8))));
    public static final L6.b j = new L6.b("ttl", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final L6.b f28353k = new L6.b("topic", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final L6.b f28354l = new L6.b("bulkId", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L6.b f28355m = new L6.b("event", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final L6.b f28356n = new L6.b("analyticsLabel", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final L6.b f28357o = new L6.b("campaignId", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final L6.b f28358p = new L6.b("composerLabel", C4.b.h(C4.a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(15))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f28345b, messagingClientEvent.f28391a);
        dVar2.a(f28346c, messagingClientEvent.f28392b);
        dVar2.a(f28347d, messagingClientEvent.f28393c);
        dVar2.a(f28348e, messagingClientEvent.f28394d);
        dVar2.a(f28349f, MessagingClientEvent.SDKPlatform.ANDROID);
        dVar2.a(f28350g, messagingClientEvent.f28395e);
        dVar2.a(f28351h, messagingClientEvent.f28396f);
        dVar2.c(f28352i, messagingClientEvent.f28397g);
        dVar2.c(j, messagingClientEvent.f28398h);
        dVar2.a(f28353k, messagingClientEvent.f28399i);
        dVar2.d(f28354l, 0L);
        dVar2.a(f28355m, MessagingClientEvent.Event.MESSAGE_DELIVERED);
        dVar2.a(f28356n, messagingClientEvent.j);
        dVar2.d(f28357o, 0L);
        dVar2.a(f28358p, messagingClientEvent.f28400k);
    }
}
