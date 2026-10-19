package p093h4;

import D7.h;
import Z3.I;
import Z3.q;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.fragment.app.RunnableC1341f;
import com.braze.Constants;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.i;
import p005a4.n;
import p017b4.d;
import p030c4.b;
import p030c4.c;
import p030c4.f;
import p030c4.g;
import p165n4.j;
import p165n4.l;
import p165n4.s;
import p293xa.r;

/* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36137a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f36139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile ScheduledFuture<?> f36140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f36141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f36142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile j f36143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f36144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f36145i;
    public static long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f36146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static WeakReference<Activity> f36147l;

    /* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            i.e(activity, "activity");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityCreated");
            e.f36139c.execute(new c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            i.e(activity, "activity");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityDestroyed");
            e.f36137a.getClass();
            g gVar = b.f22300a;
            c.f22307f.a().f22313e.remove(Integer.valueOf(activity.hashCode()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            i.e(activity, "activity");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityPaused");
            e.f36137a.getClass();
            AtomicInteger atomicInteger = e.f36142f;
            if (atomicInteger.decrementAndGet() < 0) {
                atomicInteger.set(0);
            }
            e.a();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final String strL = s.l(activity);
            if (b.f22304e.get()) {
                c cVarA = c.f22307f.a();
                if (!i.a(null, Boolean.TRUE)) {
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                    }
                    cVarA.f22310b.remove(activity);
                    cVarA.f22311c.clear();
                    cVarA.f22313e.put(Integer.valueOf(activity.hashCode()), (HashSet) cVarA.f22312d.clone());
                    cVarA.f22312d.clear();
                }
                f fVar = b.f22302c;
                if (fVar != null && fVar.f22327b.get() != null) {
                    try {
                        Timer timer = fVar.f22328c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        fVar.f22328c = null;
                    } catch (Exception e10) {
                        Log.e(f.f22325e, "Error unscheduling indexing job", e10);
                    }
                }
                SensorManager sensorManager = b.f22301b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(b.f22300a);
                }
            }
            e.f36139c.execute(new Runnable() { // from class: h4.b
                @Override // java.lang.Runnable
                public final void run() {
                    final long j = jCurrentTimeMillis;
                    final String str = strL;
                    if (e.f36143g == null) {
                        e.f36143g = new j(Long.valueOf(j), null);
                    }
                    j jVar = e.f36143g;
                    if (jVar != null) {
                        jVar.f36164b = Long.valueOf(j);
                    }
                    if (e.f36142f.get() <= 0) {
                        Runnable runnable = new Runnable() { // from class: h4.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                long j10 = j;
                                String str2 = str;
                                if (e.f36143g == null) {
                                    e.f36143g = new j(Long.valueOf(j10), null);
                                }
                                if (e.f36142f.get() <= 0) {
                                    k kVar = k.f36169a;
                                    k.b(str2, e.f36143g, e.f36145i);
                                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(q.a()).edit();
                                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                    editorEdit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                    editorEdit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                    editorEdit.apply();
                                    SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(q.a()).edit();
                                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                    editorEdit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                    editorEdit2.apply();
                                    e.f36143g = null;
                                }
                                synchronized (e.f36141e) {
                                    e.f36140d = null;
                                    r rVar = r.f47939a;
                                }
                            }
                        };
                        synchronized (e.f36141e) {
                            ScheduledExecutorService scheduledExecutorService = e.f36139c;
                            e.f36137a.getClass();
                            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                            j jVarB = FetchedAppSettingsManager.b(q.b());
                            e.f36140d = scheduledExecutorService.schedule(runnable, jVarB == null ? 60 : jVarB.f44896b, TimeUnit.SECONDS);
                            r rVar = r.f47939a;
                        }
                    }
                    long j10 = e.j;
                    long j11 = j10 > 0 ? (j - j10) / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) : 0L;
                    f fVar2 = f.f36148a;
                    Context contextA = q.a();
                    j jVarF = FetchedAppSettingsManager.f(q.b(), false);
                    if (jVarF != null && jVarF.f44898d && j11 > 0) {
                        n nVar = new n(contextA, (String) null);
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
                        double d10 = j11;
                        if (I.a()) {
                            nVar.a("fb_aa_time_spent_on_view", Double.valueOf(d10), bundle, false, e.b());
                        }
                    }
                    j jVar2 = e.f36143g;
                    if (jVar2 == null) {
                        return;
                    }
                    jVar2.a();
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            SensorManager sensorManager;
            int i10 = 2;
            int i11 = 1;
            i.e(activity, "activity");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityResumed");
            e.f36147l = new WeakReference<>(activity);
            e.f36142f.incrementAndGet();
            e.f36137a.getClass();
            e.a();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            e.j = jCurrentTimeMillis;
            final String strL = s.l(activity);
            if (b.f22304e.get()) {
                c cVarA = c.f22307f.a();
                Boolean bool = Boolean.TRUE;
                if (!i.a(null, bool)) {
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                    }
                    cVarA.f22310b.add(activity);
                    cVarA.f22312d.clear();
                    HashSet<String> hashSet = cVarA.f22313e.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        cVarA.f22312d = hashSet;
                    }
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        cVarA.a();
                    } else {
                        cVarA.f22309a.post(new RunnableC1341f(i11, cVarA));
                    }
                }
                Context applicationContext = activity.getApplicationContext();
                String strB = q.b();
                j jVarB = FetchedAppSettingsManager.b(strB);
                if (i.a(jVarB != null ? Boolean.valueOf(jVarB.f44901g) : null, bool) && (sensorManager = (SensorManager) applicationContext.getSystemService("sensor")) != null) {
                    b.f22301b = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    f fVar = new f(activity);
                    b.f22302c = fVar;
                    g gVar = b.f22300a;
                    gVar.f22332a = new h(jVarB, i10, strB);
                    sensorManager.registerListener(gVar, defaultSensor, 2);
                    if (jVarB != null && jVarB.f44901g) {
                        fVar.a();
                    }
                }
            }
            try {
                if (p017b4.b.f20550b) {
                    CopyOnWriteArraySet copyOnWriteArraySet = p017b4.c.f20551d;
                    if (!new HashSet(p017b4.c.f20551d).isEmpty()) {
                        HashMap map = d.f20555f;
                        d.a.b(activity);
                    }
                }
            } catch (Exception unused) {
            }
            p143l4.c.b(activity);
            p068f4.l.a();
            final Context applicationContext2 = activity.getApplicationContext();
            e.f36139c.execute(new Runnable() { // from class: h4.a
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar;
                    long j = jCurrentTimeMillis;
                    String str = strL;
                    Context appContext = applicationContext2;
                    j jVar2 = e.f36143g;
                    Long l10 = jVar2 == null ? null : jVar2.f36164b;
                    if (e.f36143g == null) {
                        e.f36143g = new j(Long.valueOf(j), null);
                        k kVar = k.f36169a;
                        String str2 = e.f36145i;
                        i.d(appContext, "appContext");
                        k.a(appContext, str, str2);
                    } else if (l10 != null) {
                        long jLongValue = j - l10.longValue();
                        e.f36137a.getClass();
                        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                        j jVarB2 = FetchedAppSettingsManager.b(q.b());
                        if (jLongValue > (jVarB2 == null ? 60 : jVarB2.f44896b) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) {
                            k kVar2 = k.f36169a;
                            k.b(str, e.f36143g, e.f36145i);
                            String str3 = e.f36145i;
                            i.d(appContext, "appContext");
                            k.a(appContext, str, str3);
                            e.f36143g = new j(Long.valueOf(j), null);
                        } else if (jLongValue > 1000 && (jVar = e.f36143g) != null) {
                            jVar.f36166d++;
                        }
                    }
                    j jVar3 = e.f36143g;
                    if (jVar3 != null) {
                        jVar3.f36164b = Long.valueOf(j);
                    }
                    j jVar4 = e.f36143g;
                    if (jVar4 == null) {
                        return;
                    }
                    jVar4.a();
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            i.e(activity, "activity");
            i.e(outState, "outState");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            i.e(activity, "activity");
            e.f36146k++;
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            i.e(activity, "activity");
            l.a aVar = l.f44910c;
            l.a.a(LoggingBehavior.f24776d, e.f36138b, "onActivityStopped");
            p005a4.j.f8030d.execute(new p005a4.h());
            e.f36146k--;
        }
    }

    static {
        String canonicalName = e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f36138b = canonicalName;
        f36139c = Executors.newSingleThreadScheduledExecutor();
        f36141e = new Object();
        f36142f = new AtomicInteger(0);
        f36144h = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f36141e) {
            try {
                if (f36140d != null && (scheduledFuture = f36140d) != null) {
                    scheduledFuture.cancel(false);
                }
                f36140d = null;
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final UUID b() {
        j jVar;
        if (f36143g == null || (jVar = f36143g) == null) {
            return null;
        }
        return jVar.f36165c;
    }

    public static final void c(Application application, String str) {
        i.e(application, "application");
        if (f36144h.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.f24975a;
            FeatureManager.a(new J4.n(7), FeatureManager.Feature.CodelessEvents);
            f36145i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
