package com.google.firebase.installations;

import Q6.f;
import Q6.g;
import androidx.annotation.Keep;
import androidx.compose.animation.D;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.messaging.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p108i7.c;
import p114j1.C2479a;
import p144l6.e;
import p228s6.b;
import p228s6.j;
import p228s6.p;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static c lambda$getComponents$0(b bVar) {
        return new a((e) bVar.a(e.class), bVar.d(g.class), (ExecutorService) bVar.c(new p(p217r6.a.class, ExecutorService.class)), new SequentialExecutor((Executor) bVar.c(new p(p217r6.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(c.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(j.b(e.class));
        c0531aA.a(j.a(g.class));
        c0531aA.a(new j((p<?>) new p(p217r6.a.class, ExecutorService.class), 1, 0));
        c0531aA.a(new j((p<?>) new p(p217r6.b.class, Executor.class), 1, 0));
        c0531aA.f46942f = new D(4);
        p228s6.a aVarB = c0531aA.b();
        C2479a c2479a = new C2479a();
        p228s6.a.C0531a c0531aA2 = p228s6.a.a(f.class);
        c0531aA2.f46941e = 1;
        c0531aA2.f46942f = new r(c2479a);
        return Arrays.asList(aVarB, c0531aA2.b(), B7.g.a(LIBRARY_NAME, "17.2.0"));
    }
}
