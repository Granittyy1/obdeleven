package com.google.firebase.inappmessaging;

import D3.l;
import S6.j;
import Z6.r;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.Q;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.Y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import p033c7.C1488a;
import p033c7.C1503p;
import p033c7.C1510x;
import p033c7.I;
import p033c7.P;
import p033c7.X;
import p046d7.k;
import p046d7.o;
import p058e7.C2189c;
import p058e7.C2190d;
import p058e7.C2191e;
import p058e7.C2192f;
import p058e7.C2193g;
import p058e7.C2194h;
import p058e7.H;
import p058e7.i;
import p058e7.m;
import p058e7.q;
import p058e7.u;
import p058e7.v;
import p058e7.w;
import p058e7.x;
import p228s6.p;
import p311z4.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private p<Executor> backgroundExecutor = new p<>(p217r6.a.class, Executor.class);
    private p<Executor> blockingExecutor = new p<>(p217r6.b.class, Executor.class);
    private p<Executor> lightWeightExecutor = new p<>(p217r6.c.class, Executor.class);
    private p<h> legacyTransportFactory = new p<>(H6.a.class, h.class);

    /* JADX INFO: Access modifiers changed from: private */
    public j providesFirebaseInAppMessaging(p228s6.b bVar) {
        p144l6.e eVar = (p144l6.e) bVar.a(p144l6.e.class);
        p108i7.c cVar = (p108i7.c) bVar.a(p108i7.c.class);
        p096h7.a aVarH = bVar.h(p192p6.a.class);
        P6.d dVar = (P6.d) bVar.a(P6.d.class);
        eVar.a();
        l lVar = new l(3, (Application) eVar.f44388a);
        Q q10 = new Q();
        X x10 = new X();
        x10.f22414a = aVarH;
        aVarH.a(new Q6.d(x10));
        q10.f18135a = x10;
        q10.f18136b = dVar;
        O.h hVar = new O.h();
        P p10 = new P();
        x xVar = new x();
        xVar.f34825a = p10;
        o oVar = new o(new A8.p(), new C1787c0(), lVar, new q(), xVar, hVar, new n(), new D9.o(), new Y(11), q10, new m((Executor) bVar.c(this.lightWeightExecutor), (Executor) bVar.c(this.backgroundExecutor), (Executor) bVar.c(this.blockingExecutor)));
        C1488a c1488a = new C1488a(((p167n6.a) bVar.a(p167n6.a.class)).a("fiam"), (Executor) bVar.c(this.blockingExecutor));
        C2189c c2189c = new C2189c(eVar, cVar, new p071f7.b());
        u uVar = new u(eVar);
        h hVar2 = (h) bVar.c(this.legacyTransportFactory);
        hVar2.getClass();
        p046d7.b bVar2 = new p046d7.b(oVar);
        r rVar = new r(1, oVar);
        p046d7.f fVar = new p046d7.f(oVar);
        p046d7.g gVar = new p046d7.g(oVar);
        p268va.a aVarA = T6.a.a(new C2190d(c2189c, T6.a.a(new C1510x(T6.a.a(new w(uVar, new p046d7.j(oVar), new v(uVar))))), new p046d7.d(oVar), new p046d7.l(0, oVar)));
        p046d7.a aVar = new p046d7.a(oVar);
        p046d7.n nVar = new p046d7.n(oVar);
        Z6.p pVar = new Z6.p(1, oVar);
        p046d7.m mVar = new p046d7.m(oVar);
        p046d7.c cVar2 = new p046d7.c(oVar);
        C2194h c2194h = new C2194h(c2189c);
        i iVar = new i(c2189c, c2194h);
        C2193g c2193g = new C2193g(c2189c);
        C2191e c2191e = new C2191e(c2189c, c2194h, new p046d7.i(oVar));
        T6.c cVar3 = new T6.c(c1488a);
        p046d7.e eVar2 = new p046d7.e(oVar);
        p268va.a aVarA2 = T6.a.a(new I(bVar2, rVar, fVar, gVar, aVarA, aVar, nVar, pVar, mVar, cVar2, iVar, c2193g, c2191e, cVar3, eVar2));
        k kVar = new k(0, oVar);
        C2192f c2192f = new C2192f(c2189c);
        T6.c cVar4 = new T6.c(hVar2);
        Z6.d dVar2 = new Z6.d(1, oVar);
        p046d7.h hVar3 = new p046d7.h(oVar);
        return (j) T6.a.a(new S6.l(aVarA2, kVar, c2191e, c2193g, new C1503p(pVar, gVar, nVar, mVar, fVar, cVar2, T6.a.a(new H(c2192f, cVar4, dVar2, c2193g, gVar, hVar3, eVar2)), c2191e), hVar3, new Z6.q(1, oVar))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(j.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(p228s6.j.b(Context.class));
        c0531aA.a(p228s6.j.b(p108i7.c.class));
        c0531aA.a(p228s6.j.b(p144l6.e.class));
        c0531aA.a(p228s6.j.b(p167n6.a.class));
        c0531aA.a(new p228s6.j(0, 2, p192p6.a.class));
        c0531aA.a(p228s6.j.c(this.legacyTransportFactory));
        c0531aA.a(p228s6.j.b(P6.d.class));
        c0531aA.a(p228s6.j.c(this.backgroundExecutor));
        c0531aA.a(p228s6.j.c(this.blockingExecutor));
        c0531aA.a(p228s6.j.c(this.lightWeightExecutor));
        c0531aA.f46942f = new S6.k(0, this);
        c0531aA.c(2);
        return Arrays.asList(c0531aA.b(), B7.g.a(LIBRARY_NAME, "20.4.1"));
    }
}
