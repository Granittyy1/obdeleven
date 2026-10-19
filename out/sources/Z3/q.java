package Z3;

import B8.E0;
import D2.V;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.core.view.C1293h;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.messaging.CallableC2047j;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: FacebookSdk.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Executor f7854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f7855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f7856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f7857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Boolean f7858g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f7860i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f7863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f7864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f7865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicBoolean f7866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile String f7867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile String f7868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1293h f7869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f7870t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f7852a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<LoggingBehavior> f7853b = kotlin.collections.B.y(LoggingBehavior.f24777e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f7859h = new AtomicLong(65536);
    public static int j = 64206;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f7861k = new ReentrantLock();

    static {
        int i10 = p165n4.p.f44923a;
        f7862l = "v16.0";
        f7866p = new AtomicBoolean(false);
        f7867q = "instagram.com";
        f7868r = "facebook.com";
        f7869s = new C1293h(0);
    }

    public static final Context a() {
        p165n4.t.e();
        Context context = f7860i;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.i.m("applicationContext");
        throw null;
    }

    public static final String b() {
        p165n4.t.e();
        String str = f7855d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f7861k;
        reentrantLock.lock();
        try {
            if (f7854c == null) {
                f7854c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            Executor executor = f7854c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        String str = f7862l;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = C0835a.f7782m;
        C0835a c0835aB = C0835a.b.b();
        String str = c0835aB != null ? c0835aB.f7794l : null;
        String str2 = f7868r;
        if (str == null) {
            return str2;
        }
        if (str.equals("gaming")) {
            return kotlin.text.m.G(str2, "facebook.com", "fb.gg");
        }
        return str.equals("instagram") ? kotlin.text.m.G(str2, "facebook.com", "instagram.com") : str2;
    }

    public static final boolean f(Context context) {
        p165n4.t.e();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        return f7870t;
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.i.d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f7855d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    if (kotlin.text.m.I(J4.n.d(locale, "ROOT", str, locale, "(this as java.lang.String).toLowerCase(locale)"), "fb", false)) {
                        String strSubstring = str.substring(2);
                        kotlin.jvm.internal.i.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        f7855d = strSubstring;
                    } else {
                        f7855d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f7856e == null) {
                f7856e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f7857f == null) {
                f7857f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (j == 64206) {
                j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f7858g == null) {
                f7858g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @p293xa.d
    public static final synchronized void i(Context context) {
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        synchronized (q.class) {
            try {
                if (f7866p.get()) {
                    return;
                }
                int i13 = p165n4.t.f44935a;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    try {
                        packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                int i14 = p165n4.t.f44935a;
                context.checkCallingOrSelfPermission("android.permission.INTERNET");
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.i.d(applicationContext, "applicationContext.applicationContext");
                f7860i = applicationContext;
                V.k(context);
                Context context2 = f7860i;
                if (context2 == null) {
                    kotlin.jvm.internal.i.m("applicationContext");
                    throw null;
                }
                h(context2);
                String str = f7855d;
                if (str == null || str.length() == 0) {
                    throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                }
                String str2 = f7857f;
                if (str2 == null || str2.length() == 0) {
                    throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                }
                f7866p.set(true);
                I.f7769a.getClass();
                I.c();
                if (I.f7772d.a()) {
                    f7870t = true;
                }
                Context context3 = f7860i;
                if (context3 == null) {
                    kotlin.jvm.internal.i.m("applicationContext");
                    throw null;
                }
                if ((context3 instanceof Application) && I.a()) {
                    p093h4.e eVar = p093h4.e.f36137a;
                    Context context4 = f7860i;
                    if (context4 == null) {
                        kotlin.jvm.internal.i.m("applicationContext");
                        throw null;
                    }
                    p093h4.e.c((Application) context4, f7855d);
                }
                FetchedAppSettingsManager.c();
                if (p165n4.m.f44917d.compareAndSet(false, true)) {
                    c().execute(new p068f4.b(i12));
                }
                p165n4.b bVar = p165n4.b.f44875b;
                Context context5 = f7860i;
                if (context5 == null) {
                    kotlin.jvm.internal.i.m("applicationContext");
                    throw null;
                }
                if (p165n4.b.f44875b == null) {
                    p165n4.b bVar2 = new p165n4.b(context5);
                    p065f1.a aVarA = p065f1.a.a(bVar2.f44876a);
                    kotlin.jvm.internal.i.d(aVarA, "getInstance(applicationContext)");
                    aVarA.b(bVar2, new IntentFilter("com.parse.bolts.measurement_event"));
                    p165n4.b.f44875b = bVar2;
                }
                m mVar = new m();
                H2.b bVar3 = new H2.b();
                bVar3.f3627c = new CountDownLatch(1);
                c().execute(new FutureTask(new CallableC2047j(bVar3, i10, mVar)));
                FeatureManager featureManager = FeatureManager.f24975a;
                FeatureManager.a(new n(i11), FeatureManager.Feature.Instrument);
                FeatureManager.a(new B7.b(i10), FeatureManager.Feature.AppEvents);
                FeatureManager.a(new J4.i(i12), FeatureManager.Feature.ChromeCustomTabsPrefetching);
                FeatureManager.a(new E0(3), FeatureManager.Feature.IgnoreAppSwitchToLoggedOut);
                FeatureManager.a(new o(), FeatureManager.Feature.BypassAppSwitch);
                c().execute(new FutureTask(new p()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
