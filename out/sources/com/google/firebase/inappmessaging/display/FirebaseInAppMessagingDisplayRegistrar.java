package com.google.firebase.inappmessaging.display;

import A1.C0579n;
import S4.o;
import S6.j;
import U6.b;
import W6.k;
import Z6.a;
import Z6.c;
import Z6.d;
import Z6.f;
import Z6.g;
import Z6.h;
import Z6.i;
import Z6.l;
import Z6.m;
import Z6.n;
import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p144l6.e;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public b buildFirebaseInAppMessagingUI(p228s6.b bVar) {
        e eVar = (e) bVar.a(e.class);
        j jVar = (j) bVar.a(j.class);
        eVar.a();
        Application application = (Application) eVar.f44388a;
        a aVar = new a();
        aVar.f7923a = application;
        Z6.e eVar2 = new Z6.e();
        Y6.e eVar3 = new Y6.e();
        eVar3.f7625a = V6.a.a(new Z6.b(aVar));
        eVar3.f7626b = V6.a.a(k.a.f7023a);
        eVar3.f7627c = V6.a.a(new W6.b(0, eVar3.f7625a));
        Z6.j jVar2 = new Z6.j(eVar2, eVar3.f7625a);
        eVar3.f7628d = new n(eVar2, jVar2);
        eVar3.f7629e = new Z6.k(eVar2, jVar2);
        eVar3.f7630f = new l(eVar2, jVar2);
        eVar3.f7631g = new m(eVar2, jVar2);
        eVar3.f7632h = new h(eVar2, jVar2);
        eVar3.f7633i = new i(eVar2, jVar2);
        eVar3.j = new g(eVar2, jVar2);
        eVar3.f7634k = new f(eVar2, jVar2);
        C0579n c0579n = new C0579n(jVar);
        o oVar = new o();
        p268va.a aVarA = V6.a.a(new d(0, c0579n));
        Y6.a aVar2 = new Y6.a(eVar3);
        Y6.b bVar2 = new Y6.b(eVar3);
        b bVar3 = (b) ((V6.a) V6.a.a(new U6.g(aVarA, aVar2, V6.a.a(new W6.g(0, V6.a.a(new c(oVar, bVar2)))), new W6.b(1, eVar3), bVar2, new W6.g(1, eVar3), V6.a.a(W6.e.a.f7009a)))).get();
        application.registerActivityLifecycleCallbacks(bVar3);
        return bVar3;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(b.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(p228s6.j.b(e.class));
        c0531aA.a(p228s6.j.b(j.class));
        c0531aA.f46942f = new U6.f(this);
        c0531aA.c(2);
        return Arrays.asList(c0531aA.b(), B7.g.a(LIBRARY_NAME, "20.4.1"));
    }
}
