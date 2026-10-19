package com.google.firebase.messaging;

import androidx.annotation.Keep;
import bo.app.F0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(p228s6.p pVar, p228s6.b bVar) {
        return new FirebaseMessaging((p144l6.e) bVar.a(p144l6.e.class), (R6.a) bVar.a(R6.a.class), bVar.d(B7.h.class), bVar.d(HeartBeatInfo.class), (p108i7.c) bVar.a(p108i7.c.class), bVar.g(pVar), (P6.d) bVar.a(P6.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p228s6.p pVar = new p228s6.p(H6.b.class, p311z4.h.class);
        p228s6.a.C0531a c0531aA = p228s6.a.a(FirebaseMessaging.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(p228s6.j.b(p144l6.e.class));
        c0531aA.a(new p228s6.j(0, 0, R6.a.class));
        c0531aA.a(p228s6.j.a(B7.h.class));
        c0531aA.a(p228s6.j.a(HeartBeatInfo.class));
        c0531aA.a(p228s6.j.b(p108i7.c.class));
        c0531aA.a(new p228s6.j((p228s6.p<?>) pVar, 0, 1));
        c0531aA.a(p228s6.j.b(P6.d.class));
        c0531aA.f46942f = new F0(1, pVar);
        c0531aA.c(1);
        return Arrays.asList(c0531aA.b(), B7.g.a(LIBRARY_NAME, "24.1.1"));
    }
}
