package p131k5;

import U4.C0804l;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import p191p5.g;
import p191p5.i;
import p191p5.v;
import p191p5.y;

/* JADX INFO: renamed from: k5.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2494c2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42119d;

    public /* synthetic */ RunnableC2494c2(Object obj, int i10, Object obj2) {
        this.f42117b = i10;
        this.f42118c = obj2;
        this.f42119d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42117b) {
            case 0:
                e eVar = (e) this.f42119d;
                eVar.p();
                eVar.t();
                Bundle bundle = (Bundle) this.f42118c;
                String string = bundle.getString("name");
                C0804l.e(string);
                C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
                if (!c2523i1.h()) {
                    eVar.d().f41719n.c("Conditional property not cleared since app measurement is disabled");
                } else {
                    v3 v3Var = new v3(0L, null, string, "");
                    try {
                        z3 z3VarO = eVar.o();
                        bundle.getString("app_id");
                        c2523i1.r().z(new C2496d(bundle.getString("app_id"), "", v3Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), z3VarO.F(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                v vVar = (v) this.f42119d;
                try {
                    g gVarC = vVar.f45848c.c(((g) this.f42118c).k());
                    if (gVarC != null) {
                        y yVar = i.f45813b;
                        gVarC.f(yVar, vVar);
                        gVarC.d(yVar, vVar);
                        gVarC.a(yVar, vVar);
                    } else {
                        vVar.d(new NullPointerException("Continuation returned null"));
                    }
                    break;
                } catch (RuntimeExecutionException e10) {
                    if (e10.getCause() instanceof Exception) {
                        vVar.d((Exception) e10.getCause());
                        return;
                    }
                    vVar.d(e10);
                } catch (CancellationException unused2) {
                    vVar.b();
                    return;
                } catch (Exception e11) {
                    vVar.d(e11);
                    return;
                }
                break;
        }
    }
}
