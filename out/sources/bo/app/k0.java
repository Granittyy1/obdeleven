package bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements g2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21393f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrazeConfigurationProvider f21395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f21397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PackageInfo f21398e;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.k0$a$a, reason: collision with other inner class name */
        public static final class C0223a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0223a f21399b = new C0223a();

            public C0223a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to obtain device resolution";
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String a(Context context, boolean z10) {
            kotlin.jvm.internal.i.e(context, "context");
            try {
                Pair<Integer, Integer> displayHeightAndWidthPixels = BrazeImageUtils.getDisplayHeightAndWidthPixels(context);
                int iIntValue = displayHeightAndWidthPixels.a().intValue();
                int iIntValue2 = displayHeightAndWidthPixels.b().intValue();
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue);
                    sb2.append('x');
                    sb2.append(iIntValue2);
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(iIntValue2);
                sb3.append('x');
                sb3.append(iIntValue);
                return sb3.toString();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, C0223a.f21399b);
                return null;
            }
        }

        private a() {
        }

        public final String a(Locale locale) {
            kotlin.jvm.internal.i.e(locale, "locale");
            String string = locale.toString();
            kotlin.jvm.internal.i.d(string, "locale.toString()");
            return string;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21400b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to read notifications enabled state from NotificationManagerCompat.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21401b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "App version code could not be read. Returning null";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21402b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to collect background restriction information from Activity Manager";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21403b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while reading the phone carrier name.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.f21404b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Unable to inspect package ["), this.f21404b, ']');
        }
    }

    public k0(Context context, BrazeConfigurationProvider configurationProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        this.f21394a = context;
        this.f21395b = configurationProvider;
        PackageInfo packageInfoM = m();
        this.f21396c = packageInfoM != null ? packageInfoM.versionName : null;
        SharedPreferences sharedPreferences = this.f21394a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f21397d = sharedPreferences;
    }

    private final boolean g() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f21394a.getSystemService("activity");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return ((ActivityManager) systemService).isBackgroundRestricted();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f21402b);
            return false;
        }
    }

    private final boolean h() {
        return this.f21394a.getResources().getConfiguration().orientation == 2;
    }

    private final String i() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    private final String j() {
        try {
            Object systemService = this.f21394a.getSystemService(AttributeType.PHONE);
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return kotlin.text.n.p0(networkOperatorName).toString();
            }
            return null;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f21403b);
            return null;
        }
    }

    private final Locale k() {
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.i.d(locale, "getDefault()");
        return locale;
    }

    private final TimeZone l() {
        TimeZone timeZone = TimeZone.getDefault();
        kotlin.jvm.internal.i.d(timeZone, "getDefault()");
        return timeZone;
    }

    private final PackageInfo m() {
        PackageInfo packageInfo = this.f21398e;
        if (packageInfo != null) {
            return packageInfo;
        }
        String packageName = this.f21394a.getPackageName();
        try {
            PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? this.f21394a.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : this.f21394a.getPackageManager().getPackageInfo(packageName, 0);
            this.f21398e = packageInfo2;
            return packageInfo2;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new f(packageName));
            ApplicationInfo applicationInfo = this.f21394a.getApplicationInfo();
            PackageInfo packageArchiveInfo = Build.VERSION.SDK_INT >= 33 ? this.f21394a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : this.f21394a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.f21398e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    @Override // bo.app.g2
    public String a() {
        return this.f21396c;
    }

    @Override // bo.app.g2
    public i0 b() {
        i0.a aVarF = new i0.a(this.f21395b).a(i()).c(j()).b(Build.BRAND).f(Build.MODEL);
        a aVar = f21393f;
        return aVarF.e(aVar.a(k())).h(l().getID()).g(aVar.a(this.f21394a, h())).c(Boolean.valueOf(e())).b(Boolean.valueOf(g())).d(d()).a(f()).a();
    }

    @Override // bo.app.g2
    public String c() {
        long jB;
        PackageInfo packageInfoM = m();
        if (packageInfoM == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21401b, 3, (Object) null);
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            jB = packageInfoM.getLongVersionCode();
        } else {
            jB = i10 >= 28 ? p199q0.a.b(packageInfoM) : packageInfoM.versionCode;
        }
        return jB + ".0.0.0";
    }

    public final String d() {
        return this.f21397d.getString("google_ad_id", null);
    }

    public final boolean e() {
        Object systemService = this.f21394a.getSystemService("notification");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final Boolean f() {
        if (this.f21397d.contains("ad_tracking_enabled")) {
            return Boolean.valueOf(this.f21397d.getBoolean("ad_tracking_enabled", true));
        }
        return null;
    }

    @Override // bo.app.g2
    public i0 a(j0 deviceCache) {
        kotlin.jvm.internal.i.e(deviceCache, "deviceCache");
        deviceCache.a(b());
        return (i0) deviceCache.a();
    }

    @Override // bo.app.g2
    public void a(String googleAdvertisingId) {
        kotlin.jvm.internal.i.e(googleAdvertisingId, "googleAdvertisingId");
        this.f21397d.edit().putString("google_ad_id", googleAdvertisingId).apply();
    }

    @Override // bo.app.g2
    public void a(boolean z10) {
        this.f21397d.edit().putBoolean("ad_tracking_enabled", !z10).apply();
    }
}
