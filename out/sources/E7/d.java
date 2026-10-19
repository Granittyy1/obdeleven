package E7;

import G7.f;
import K2.InterfaceC0711d;
import K2.r;
import Q2.C0738o;
import Z3.q;
import android.media.metrics.NetworkEvent;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import androidx.media3.exoplayer.I;
import androidx.media3.exoplayer.K;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import p005a4.n;
import p078g1.F;
import p114j1.A;
import p162n1.t;
import p297y1.x;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3121d;

    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        this.f3119b = i10;
        this.f3120c = obj;
        this.f3121d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3119b) {
            case 0:
                ((f) this.f3120c).a((G7.c) this.f3121d);
                return;
            case 1:
                r rVar = (r) this.f3120c;
                C0738o c0738o = (C0738o) this.f3121d;
                synchronized (rVar.f4221k) {
                    try {
                        Iterator it = rVar.j.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC0711d) it.next()).b(c0738o, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 2:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.f3120c;
                i.e(operation, "$operation");
                DefaultSpecialEffectsController.TransitionEffect this$0 = (DefaultSpecialEffectsController.TransitionEffect) this.f3121d;
                i.e(this$0, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    operation.toString();
                }
                operation.c(this$0);
                return;
            case 3:
                new n(q.a(), (String) null).a((String) this.f3120c, null, (Bundle) this.f3121d, false, p093h4.e.b());
                return;
            case 4:
                ((t) this.f3120c).f44720d.reportNetworkEvent((NetworkEvent) this.f3121d);
                return;
            case 5:
                p240t6.a aVar = (p240t6.a) this.f3120c;
                Process.setThreadPriority(aVar.f47320d);
                StrictMode.ThreadPolicy threadPolicy = aVar.f47321e;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f3121d).run();
                return;
            default:
                x xVar = (x) this.f3120c;
                xVar.getClass();
                int i10 = A.f40996a;
                K k10 = K.this;
                F f10 = (F) this.f3121d;
                k10.f18022e0 = f10;
                k10.f18033m.e(25, new I(f10));
                return;
        }
    }
}
