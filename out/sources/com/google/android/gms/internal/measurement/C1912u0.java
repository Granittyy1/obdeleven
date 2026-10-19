package com.google.android.gms.internal.measurement;

import U4.C0804l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.braze.models.FeatureFlag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p131k5.C2498d1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1912u0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile C1912u0 f25853i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25854a = "FA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.c f25855b = Y4.c.f7603a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f25856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p118j5.a f25857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile InterfaceC1808f0 f25861h;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
    public class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C1912u0.this.e(new R0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C1912u0.this.e(new W0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1912u0.this.e(new S0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C1912u0.this.e(new T0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            BinderC1815g0 binderC1815g0 = new BinderC1815g0();
            C1912u0.this.e(new U0(this, activity, binderC1815g0));
            Bundle bundleG = binderC1815g0.g(50L);
            if (bundleG != null) {
                bundle.putAll(bundleG);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C1912u0.this.e(new P0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C1912u0.this.e(new V0(this, activity));
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
    public static class c extends AbstractBinderC1871o0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p118j5.a.InterfaceC0469a f25867c;

        public c(p118j5.a.InterfaceC0469a interfaceC0469a) {
            super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
            this.f25867c = interfaceC0469a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1850l0
        public final void M(long j, Bundle bundle, String str, String str2) {
            this.f25867c.a(j, bundle, str, str2);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC1850l0
        public final int a() {
            return System.identityHashCode(this.f25867c);
        }
    }

    public C1912u0(Context context, Bundle bundle) {
        C0 c10 = new C0();
        c10.f25407b = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), c10);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f25856c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f25857d = new p118j5.a(this);
        this.f25858e = new ArrayList();
        try {
            String strA = C2498d1.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = C2498d1.a(context);
            }
            int identifier = resources.getIdentifier("google_app_id", FeatureFlag.PROPERTIES_TYPE_STRING, strA);
            String string = null;
            if (identifier != 0) {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C1912u0.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f25860g = true;
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        e(new C1905t0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
    }

    public static C1912u0 b(Context context, Bundle bundle) {
        C0804l.h(context);
        if (f25853i == null) {
            synchronized (C1912u0.class) {
                try {
                    if (f25853i == null) {
                        f25853i = new C1912u0(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25853i;
    }

    public final int a(String str) {
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        e(new M0(this, str, binderC1815g0));
        Integer num = (Integer) BinderC1815g0.b0(binderC1815g0.g(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List<Bundle> c(String str, String str2) {
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        e(new C1933x0(this, str, str2, binderC1815g0));
        List<Bundle> list = (List) BinderC1815g0.b0(binderC1815g0.g(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> d(String str, String str2, boolean z10) {
        BinderC1815g0 binderC1815g0 = new BinderC1815g0();
        e(new J0(this, str, str2, z10, binderC1815g0));
        Bundle bundleG = binderC1815g0.g(5000L);
        if (bundleG == null || bundleG.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleG.size());
        for (String str3 : bundleG.keySet()) {
            Object obj = bundleG.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void e(a aVar) {
        this.f25856c.execute(aVar);
    }

    public final void f(Exception exc, boolean z10, boolean z11) {
        this.f25860g |= z10;
        if (!z10 && z11) {
            e(new L0(this, exc));
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.6.1 */
    public abstract class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25864d;

        public a(boolean z10) {
            C1912u0.this.f25855b.getClass();
            this.f25862b = System.currentTimeMillis();
            C1912u0.this.f25855b.getClass();
            this.f25863c = SystemClock.elapsedRealtime();
            this.f25864d = z10;
        }

        public abstract void a() throws RemoteException;

        @Override // java.lang.Runnable
        public final void run() {
            C1912u0 c1912u0 = C1912u0.this;
            if (c1912u0.f25860g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e10) {
                c1912u0.f(e10, false, this.f25864d);
                b();
            }
        }

        public void b() {
        }
    }
}
