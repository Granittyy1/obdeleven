package com.google.firebase.perf;

import C7.o;
import Z6.r;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.G;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p046d7.k;
import p046d7.l;
import p144l6.e;
import p144l6.g;
import p193p7.a;
import p193p7.c;
import p193p7.d;
import p228s6.b;
import p228s6.j;
import p228s6.p;
import p311z4.h;
import p314z7.f;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(p pVar, b bVar) {
        AppStartTrace appStartTrace;
        e eVar = (e) bVar.a(e.class);
        g gVar = (g) bVar.d(g.class).get();
        Executor executor = (Executor) bVar.c(pVar);
        a aVar = new a();
        eVar.a();
        Context context = eVar.f44388a;
        p218r7.a aVarE = p218r7.a.e();
        aVarE.getClass();
        p218r7.a.f46360d.f47353b = i.a(context);
        aVarE.f46364c.c(context);
        p206q7.a aVarA = p206q7.a.a();
        synchronized (aVarA) {
            if (!aVarA.f46161q) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(aVarA);
                    aVarA.f46161q = true;
                }
            }
        }
        c cVar = new c();
        synchronized (aVarA.f46153h) {
            aVarA.f46153h.add(cVar);
        }
        if (gVar != null) {
            if (AppStartTrace.f28436y != null) {
                appStartTrace = AppStartTrace.f28436y;
            } else {
                f fVar = f.f48930t;
                O.e eVar2 = new O.e();
                if (AppStartTrace.f28436y == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f28436y == null) {
                                AppStartTrace.f28436y = new AppStartTrace(fVar, eVar2, p218r7.a.e(), new ThreadPoolExecutor(0, 1, AppStartTrace.f28435x + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.f28436y;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f28438b) {
                    G.j.f17734g.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.f28457v = appStartTrace.f28457v || AppStartTrace.e((Application) applicationContext2);
                        appStartTrace.f28438b = true;
                        appStartTrace.f28442f = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.b(appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static p193p7.b providesFirebasePerformance(b bVar) {
        bVar.a(a.class);
        p229s7.a aVar = new p229s7.a((e) bVar.a(e.class), (p108i7.c) bVar.a(p108i7.c.class), bVar.d(o.class), bVar.d(h.class));
        d dVar = new d(new r(2, aVar), new l(1, aVar), new k(1, aVar), new p229s7.e(aVar), new p229s7.c(), new p229s7.b(), new p229s7.d());
        C9.a aVar2 = new C9.a();
        aVar2.f2466b = C9.a.f2464c;
        aVar2.f2465a = dVar;
        return (p193p7.b) aVar2.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<p228s6.a<?>> getComponents() {
        p pVar = new p(p217r6.d.class, Executor.class);
        p228s6.a.C0531a c0531aA = p228s6.a.a(p193p7.b.class);
        c0531aA.f46937a = LIBRARY_NAME;
        c0531aA.a(j.b(e.class));
        c0531aA.a(new j(1, 1, o.class));
        c0531aA.a(j.b(p108i7.c.class));
        c0531aA.a(new j(1, 1, h.class));
        c0531aA.a(j.b(a.class));
        c0531aA.f46942f = new J4.i(9);
        p228s6.a aVarB = c0531aA.b();
        p228s6.a.C0531a c0531aA2 = p228s6.a.a(a.class);
        c0531aA2.f46937a = EARLY_LIBRARY_NAME;
        c0531aA2.a(j.b(e.class));
        c0531aA2.a(j.a(g.class));
        c0531aA2.a(new j((p<?>) pVar, 1, 0));
        c0531aA2.c(2);
        c0531aA2.f46942f = new com.google.gson.internal.a(pVar);
        return Arrays.asList(aVarB, c0531aA2.b(), B7.g.a(LIBRARY_NAME, "20.5.2"));
    }
}
