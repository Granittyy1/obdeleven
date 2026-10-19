package com.google.firebase.dynamiclinks.internal;

import A1.C0576k;
import B7.g;
import I6.a;
import J6.c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p144l6.e;
import p228s6.b;
import p228s6.j;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new c((e) bVar.a(e.class), bVar.d(p192p6.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(a.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(j.b(e.class));
        c0531aA.a(j.a(p192p6.a.class));
        c0531aA.f46942f = new C0576k(3);
        return Arrays.asList(c0531aA.b(), g.a(LIBRARY_NAME, "21.2.0"));
    }
}
