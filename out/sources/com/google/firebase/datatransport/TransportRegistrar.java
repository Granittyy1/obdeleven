package com.google.firebase.datatransport;

import A1.C0575j;
import A1.C0576k;
import A4.a;
import B7.g;
import C4.x;
import H6.c;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p228s6.b;
import p228s6.j;
import p228s6.p;
import p311z4.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$0(b bVar) {
        x.b((Context) bVar.a(Context.class));
        return x.a().c(a.f584f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$1(b bVar) {
        x.b((Context) bVar.a(Context.class));
        return x.a().c(a.f584f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$2(b bVar) {
        x.b((Context) bVar.a(Context.class));
        return x.a().c(a.f583e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(h.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(j.b(Context.class));
        c0531aA.f46942f = new C0575j(1);
        p228s6.a aVarB = c0531aA.b();
        p228s6.a.C0531a c0531aB = p228s6.a.b(new p(H6.a.class, h.class));
        c0531aB.a(j.b(Context.class));
        c0531aB.f46942f = new C0576k(2);
        p228s6.a aVarB2 = c0531aB.b();
        p228s6.a.C0531a c0531aB2 = p228s6.a.b(new p(H6.b.class, h.class));
        c0531aB2.a(j.b(Context.class));
        c0531aB2.f46942f = new c(0);
        return Arrays.asList(aVarB, aVarB2, c0531aB2.b(), g.a(LIBRARY_NAME, "18.2.0"));
    }
}
