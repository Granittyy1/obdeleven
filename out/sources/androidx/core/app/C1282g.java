package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1282g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f16725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f16726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f16727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f16728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f16729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f16730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f16731g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f16725a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f16726b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f16727c = declaredField2;
        Class<?> cls2 = f16725a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f16728d = declaredMethod;
        Class<?> cls3 = f16725a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f16729e = declaredMethod2;
        Class<?> cls4 = f16725a;
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 == 26 || i10 == 27) && cls4 != null) {
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f16730f = method;
    }

    /* JADX INFO: renamed from: androidx.core.app.g$a */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f16732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f16733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16735e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f16736f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f16737g = false;

        public a(Activity activity) {
            this.f16733c = activity;
            this.f16734d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f16733c == activity) {
                this.f16733c = null;
                this.f16736f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f16736f || this.f16737g || this.f16735e) {
                return;
            }
            Object obj = this.f16732b;
            try {
                Object obj2 = C1282g.f16727c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f16734d) {
                    C1282g.f16731g.postAtFrontOfQueue(new RunnableC1281f(C1282g.f16726b.get(activity), obj2));
                    this.f16737g = true;
                    this.f16732b = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f16733c == activity) {
                this.f16735e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
