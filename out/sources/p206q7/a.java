package p206q7;

import O.e;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.l;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1353s;
import androidx.fragment.app.y;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.d;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p293xa.r;
import p314z7.f;

/* JADX INFO: compiled from: AppStateMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p241t7.a f46145s = p241t7.a.d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static volatile a f46146t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f46147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap<Activity, d> f46148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Activity, c> f46149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f46150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f46151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f46152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f46153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f46154i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p218r7.a f46155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f46156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f46157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f46158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f46159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ApplicationProcessState f46160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46162r;

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppStateMonitor.java */
    public interface InterfaceC0520a {
        void a();
    }

    /* JADX INFO: compiled from: AppStateMonitor.java */
    public interface b {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public a(f fVar, e eVar) {
        p218r7.a aVarE = p218r7.a.e();
        p241t7.a aVar = d.f46169e;
        this.f46147b = new WeakHashMap<>();
        this.f46148c = new WeakHashMap<>();
        this.f46149d = new WeakHashMap<>();
        this.f46150e = new WeakHashMap<>();
        this.f46151f = new HashMap();
        this.f46152g = new HashSet();
        this.f46153h = new HashSet();
        this.f46154i = new AtomicInteger(0);
        this.f46160p = ApplicationProcessState.BACKGROUND;
        this.f46161q = false;
        this.f46162r = true;
        this.j = fVar;
        this.f46156l = eVar;
        this.f46155k = aVarE;
        this.f46157m = true;
    }

    public static a a() {
        if (f46146t == null) {
            synchronized (a.class) {
                try {
                    if (f46146t == null) {
                        f46146t = new a(f.f48930t, new e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f46146t;
    }

    public final void b(String str) {
        synchronized (this.f46151f) {
            try {
                Long l10 = (Long) this.f46151f.get(str);
                if (l10 == null) {
                    this.f46151f.put(str, 1L);
                } else {
                    this.f46151f.put(str, Long.valueOf(l10.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Activity activity) {
        d<p253u7.b> dVar;
        WeakHashMap<Activity, Trace> weakHashMap = this.f46150e;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        d dVar2 = this.f46148c.get(activity);
        l lVar = dVar2.f46171b;
        boolean z10 = dVar2.f46173d;
        p241t7.a aVar = d.f46169e;
        if (z10) {
            HashMap map = dVar2.f46172c;
            if (!map.isEmpty()) {
                aVar.a();
                map.clear();
            }
            d<p253u7.b> dVarA = dVar2.a();
            try {
                lVar.a(dVar2.f46170a);
            } catch (IllegalArgumentException | NullPointerException e10) {
                if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e10;
                }
                aVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                dVarA = new d<>();
            }
            l.a aVar2 = lVar.f16739a;
            SparseIntArray[] sparseIntArrayArr = aVar2.f16743b;
            aVar2.f16743b = new SparseIntArray[9];
            dVar2.f46173d = false;
            dVar = dVarA;
        } else {
            aVar.a();
            dVar = new d<>();
        }
        if (dVar.b()) {
            g.a(trace, dVar.a());
            trace.stop();
        } else {
            f46145s.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void d(String str, h hVar, h hVar2) {
        if (this.f46155k.o()) {
            i.a aVarA0 = i.a0();
            aVarA0.y(str);
            aVarA0.w(hVar.f28507b);
            aVarA0.x(hVar.b(hVar2));
            com.google.firebase.perf.v1.h hVarA = SessionManager.getInstance().perfSession().a();
            aVarA0.r();
            i.M((i) aVarA0.f29047c, hVarA);
            int andSet = this.f46154i.getAndSet(0);
            synchronized (this.f46151f) {
                try {
                    HashMap map = this.f46151f;
                    aVarA0.r();
                    i.I((i) aVarA0.f29047c).putAll(map);
                    if (andSet != 0) {
                        aVarA0.v(andSet, Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString());
                    }
                    this.f46151f.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j.c(aVarA0.p(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.f46157m && this.f46155k.o()) {
            d dVar = new d(activity);
            this.f46148c.put(activity, dVar);
            if (activity instanceof ActivityC1347l) {
                c cVar = new c(this.f46156l, this.j, this, dVar);
                this.f46149d.put(activity, cVar);
                C1353s c1353s = ((ActivityC1347l) activity).getSupportFragmentManager().f17688p;
                c1353s.getClass();
                c1353s.f17639b.add(new C1353s.a(cVar));
            }
        }
    }

    public final void f(ApplicationProcessState applicationProcessState) {
        this.f46160p = applicationProcessState;
        synchronized (this.f46152g) {
            try {
                Iterator it = this.f46152g.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f46160p);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f46148c.remove(activity);
        if (this.f46149d.containsKey(activity)) {
            y supportFragmentManager = ((ActivityC1347l) activity).getSupportFragmentManager();
            c cb2 = this.f46149d.remove(activity);
            C1353s c1353s = supportFragmentManager.f17688p;
            c1353s.getClass();
            kotlin.jvm.internal.i.e(cb2, "cb");
            synchronized (c1353s.f17639b) {
                try {
                    int size = c1353s.f17639b.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (c1353s.f17639b.get(i10).f17640a == cb2) {
                            c1353s.f17639b.remove(i10);
                            break;
                        }
                    }
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.f46147b.isEmpty()) {
            this.f46156l.getClass();
            this.f46158n = new h();
            this.f46147b.put(activity, Boolean.TRUE);
            if (this.f46162r) {
                f(ApplicationProcessState.FOREGROUND);
                synchronized (this.f46153h) {
                    try {
                        for (InterfaceC0520a interfaceC0520a : this.f46153h) {
                            if (interfaceC0520a != null) {
                                interfaceC0520a.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f46162r = false;
            } else {
                d(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f46159o, this.f46158n);
                f(ApplicationProcessState.FOREGROUND);
            }
        } else {
            this.f46147b.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f46157m && this.f46155k.o()) {
                if (!this.f46148c.containsKey(activity)) {
                    e(activity);
                }
                this.f46148c.get(activity).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.j, this.f46156l, this);
                trace.start();
                this.f46150e.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f46157m) {
                c(activity);
            }
            if (this.f46147b.containsKey(activity)) {
                this.f46147b.remove(activity);
                if (this.f46147b.isEmpty()) {
                    this.f46156l.getClass();
                    this.f46159o = new h();
                    d(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f46158n, this.f46159o);
                    f(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
