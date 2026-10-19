package p131k5;

import U4.C0804l;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.zzip;
import com.google.android.gms.measurement.internal.zziq;
import java.util.HashMap;
import kotlinx.coroutines.selects.a;
import p293xa.r;

/* JADX INFO: renamed from: k5.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2578w1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42515d;

    public /* synthetic */ RunnableC2578w1(Object obj, Parcelable parcelable, int i10) {
        this.f42513b = i10;
        this.f42514c = parcelable;
        this.f42515d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42513b) {
            case 0:
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this.f42515d;
                binderC2535l1.f42293c.Y();
                h hVar = binderC2535l1.f42293c;
                hVar.i().p();
                hVar.Z();
                o3 o3Var = (o3) this.f42514c;
                C0804l.e(o3Var.f42332b);
                C1930w4.a();
                C2501e c2501eS = hVar.S();
                C2557r0<Boolean> c2557r0 = B.f41630M0;
                zziq zziqVarE = zziq.e(c2501eS.B(null, c2557r0) ? o3Var.f42326B : 100, o3Var.f42352w);
                String str = o3Var.f42332b;
                zziq zziqVarH = hVar.H(str);
                hVar.d().f41719n.a(str, zziqVarE, "Setting consent, package, consent");
                hVar.r(str, zziqVarE);
                if (zziqVarE.k(zziqVarH, (zziq.zza[]) zziqVarE.f26647a.keySet().toArray(new zziq.zza[0]))) {
                    hVar.Q(o3Var);
                }
                C1930w4.a();
                if (hVar.S().B(null, c2557r0)) {
                    b bVarB = b.b(o3Var.f42327C);
                    if (!b.f26542f.equals(bVarB)) {
                        hVar.d().f41719n.a(str, bVarB, "Setting DMA consent. package, consent");
                        hVar.i().p();
                        hVar.Z();
                        C1930w4.a();
                        HashMap map = hVar.f26594C;
                        boolean zB = hVar.S().B(null, B.f41638Q0);
                        String str2 = o3Var.f42332b;
                        if (!zB) {
                            map.put(str2, bVarB);
                            C2529k c2529k = hVar.f26601c;
                            h.y(c2529k);
                            c2529k.M(str2, bVarB);
                            break;
                        } else {
                            zzip zzipVarD = b.a(100, hVar.e(str2)).d();
                            map.put(str2, bVarB);
                            C2529k c2529k2 = hVar.f26601c;
                            h.y(c2529k2);
                            c2529k2.M(str2, bVarB);
                            zzip zzipVarD2 = b.a(100, hVar.e(str2)).d();
                            hVar.i().p();
                            hVar.Z();
                            if (zzipVarD == zzip.f26643d && zzipVarD2 == zzip.f26644e) {
                                hVar.d().f41719n.b(str2, "Generated _dcu event for");
                                Bundle bundle = new Bundle();
                                C2529k c2529k3 = hVar.f26601c;
                                h.y(c2529k3);
                                if (c2529k3.I(hVar.b0(), str2, 1L, false, false, false, false, false, false).f42288f < hVar.S().u(str2, B.f41651X)) {
                                    bundle.putLong("_r", 1L);
                                    C2529k c2529k4 = hVar.f26601c;
                                    h.y(c2529k4);
                                    hVar.d().f41719n.a(str2, Long.valueOf(c2529k4.I(hVar.b0(), str2, 1L, false, false, false, false, false, true).f42288f), "_dcu realtime event count");
                                }
                                hVar.f26598G.a(bundle, str2, "_dcu");
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                e eVar = (e) this.f42515d;
                eVar.p();
                eVar.t();
                Bundle bundle2 = (Bundle) this.f42514c;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                C0804l.e(string);
                C0804l.e(string2);
                C0804l.h(bundle2.get("value"));
                C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
                if (!c2523i1.h()) {
                    eVar.d().f41719n.c("Conditional property not set since app measurement is disabled");
                } else {
                    v3 v3Var = new v3(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        z3 z3VarO = eVar.o();
                        bundle2.getString("app_id");
                        C2588z c2588zF = z3VarO.F(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        z3 z3VarO2 = eVar.o();
                        bundle2.getString("app_id");
                        C2588z c2588zF2 = z3VarO2.F(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        z3 z3VarO3 = eVar.o();
                        bundle2.getString("app_id");
                        c2523i1.r().z(new C2496d(bundle2.getString("app_id"), string2, v3Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), c2588zF2, bundle2.getLong("trigger_timeout"), c2588zF, bundle2.getLong("time_to_live"), z3VarO3.F(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                ((kotlinx.coroutines.selects.e) this.f42514c).c((a) this.f42515d, r.f47939a);
                break;
        }
    }

    public RunnableC2578w1(kotlinx.coroutines.selects.e eVar, a aVar) {
        this.f42513b = 2;
        this.f42514c = eVar;
        this.f42515d = aVar;
    }
}
