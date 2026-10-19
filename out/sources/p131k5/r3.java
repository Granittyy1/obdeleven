package p131k5;

import U4.C0804l;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.h;
import com.google.firebase.sessions.settings.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f42441b;

    public r3(h hVar, a aVar) {
        this.f42441b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f42441b;
        hVar.i().p();
        hVar.f26608k = new S0(hVar);
        C2529k c2529k = new C2529k(hVar);
        c2529k.u();
        hVar.f26601c = c2529k;
        C2501e c2501eS = hVar.S();
        d dVar = hVar.f26599a;
        C0804l.h(dVar);
        c2501eS.f42147d = dVar;
        T2 t8 = new T2(hVar);
        t8.u();
        hVar.f26607i = t8;
        C3 c10 = new C3(hVar);
        c10.u();
        hVar.f26604f = c10;
        C2552p2 c2552p2 = new C2552p2(hVar);
        c2552p2.u();
        hVar.f26606h = c2552p2;
        l3 l3Var = new l3(hVar);
        l3Var.u();
        hVar.f26603e = l3Var;
        hVar.f26602d = new K0(hVar);
        if (hVar.f26615r != hVar.f26616s) {
            B0 b0D = hVar.d();
            b0D.f41712f.a(Integer.valueOf(hVar.f26615r), Integer.valueOf(hVar.f26616s), "Not all upload components initialized");
        }
        hVar.f26610m = true;
        hVar.i().p();
        C2529k c2529k2 = hVar.f26601c;
        h.y(c2529k2);
        c2529k2.o0();
        if (hVar.f26607i.f41998g.a() == 0) {
            P0 p10 = hVar.f26607i.f41998g;
            hVar.x().getClass();
            p10.b(System.currentTimeMillis());
        }
        hVar.F();
    }
}
