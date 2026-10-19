package com.google.firebase.perf.metrics;

import O.e;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.compose.ui.platform.RunnableC1240q;
import androidx.compose.ui.text.font.s;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.Lifecycle;
import com.google.firebase.messaging.U;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.i;
import com.voltasit.obdeleven.ui.activity.o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p134k8.RunnableC2650t1;
import p144l6.g;
import p314z7.f;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC1375s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f28434w = new h();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f28435x = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static volatile AppStartTrace f28436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static ThreadPoolExecutor f28437z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f28439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p218r7.a f28440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.a f28441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Application f28442f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f28444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f28445i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p290x7.a f28453r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28438b = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28443g = false;
    public h j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f28446k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h f28447l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f28448m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f28449n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f28450o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f28451p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f28452q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28454s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28455t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a f28456u = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f28457v = false;

    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.f28455t++;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AppStartTrace f28459b;

        public b(AppStartTrace appStartTrace) {
            this.f28459b = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.f28459b;
            if (appStartTrace.j == null) {
                appStartTrace.f28454s = true;
            }
        }
    }

    public AppStartTrace(f fVar, e eVar, p218r7.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        h hVar = null;
        this.f28439c = fVar;
        this.f28440d = aVar;
        f28437z = threadPoolExecutor;
        i.a aVarA0 = i.a0();
        aVarA0.y("_experiment_app_start_ttid");
        this.f28441e = aVarA0;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        long micros2 = timeUnit.toMicros(System.currentTimeMillis());
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f28444h = new h((micros - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + micros2, micros);
        g gVar = (g) p144l6.e.c().b(g.class);
        if (gVar != null) {
            long micros3 = timeUnit.toMicros(gVar.a());
            hVar = new h((micros3 - timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros3);
        }
        this.f28445i = hVar;
    }

    public static boolean e(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strB = s.b(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strB))) {
                return true;
            }
        }
        return false;
    }

    public final h a() {
        h hVar = this.f28445i;
        return hVar != null ? hVar : f28434w;
    }

    public final h d() {
        h hVar = this.f28444h;
        return hVar != null ? hVar : a();
    }

    public final void f(i.a aVar) {
        if (this.f28450o == null || this.f28451p == null || this.f28452q == null) {
            return;
        }
        f28437z.execute(new RunnableC2650t1(this, 1, aVar));
        g();
    }

    public final synchronized void g() {
        if (this.f28438b) {
            G.j.f17734g.c(this);
            this.f28442f.unregisterActivityLifecycleCallbacks(this);
            this.f28438b = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f28454s && this.j == null) {
                this.f28457v = this.f28457v || e(this.f28442f);
                new WeakReference(activity);
                this.j = new h();
                if (d().b(this.j) > f28435x) {
                    this.f28443g = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f28454s || this.f28443g || !this.f28440d.f()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f28456u);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f28454s && !this.f28443g) {
                boolean zF = this.f28440d.f();
                if (zF) {
                    View viewFindViewById = activity.findViewById(R.id.content);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f28456u);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(new com.google.firebase.perf.util.b(viewFindViewById, new o(3, this)));
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new com.google.firebase.perf.util.e(viewFindViewById, new U(4, this), new RunnableC1240q(5, this)));
                }
                if (this.f28447l != null) {
                    return;
                }
                new WeakReference(activity);
                this.f28447l = new h();
                this.f28453r = SessionManager.getInstance().perfSession();
                p241t7.a aVarD = p241t7.a.d();
                activity.getClass();
                a().b(this.f28447l);
                aVarD.a();
                f28437z.execute(new X8.a(4, this));
                if (!zF) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f28454s && this.f28446k == null && !this.f28443g) {
            this.f28446k = new h();
        }
    }

    @E(Lifecycle.Event.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f28454s || this.f28443g || this.f28449n != null) {
            return;
        }
        this.f28449n = new h();
        i.a aVarA0 = i.a0();
        aVarA0.y("_experiment_firstBackgrounding");
        aVarA0.w(d().f28507b);
        aVarA0.x(d().b(this.f28449n));
        this.f28441e.u(aVarA0.p());
    }

    @E(Lifecycle.Event.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f28454s || this.f28443g || this.f28448m != null) {
            return;
        }
        this.f28448m = new h();
        i.a aVarA0 = i.a0();
        aVarA0.y("_experiment_firstForegrounding");
        aVarA0.w(d().f28507b);
        aVarA0.x(d().b(this.f28448m));
        this.f28441e.u(aVarA0.p());
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
