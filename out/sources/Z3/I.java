package Z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UserSettingsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f7769a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f7770b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f7771c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f7776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SharedPreferences f7777i;

    /* JADX INFO: compiled from: UserSettingsManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f7780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f7781d;

        public final boolean a() {
            Boolean bool = this.f7780c;
            return bool == null ? this.f7778a : bool.booleanValue();
        }
    }

    static {
        a aVar = new a();
        aVar.f7778a = true;
        aVar.f7779b = "com.facebook.sdk.AutoInitEnabled";
        f7772d = aVar;
        a aVar2 = new a();
        aVar2.f7778a = true;
        aVar2.f7779b = "com.facebook.sdk.AutoLogAppEventsEnabled";
        f7773e = aVar2;
        a aVar3 = new a();
        aVar3.f7778a = true;
        aVar3.f7779b = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
        f7774f = aVar3;
        a aVar4 = new a();
        aVar4.f7778a = false;
        aVar4.f7779b = "auto_event_setup_enabled";
        f7775g = aVar4;
        a aVar5 = new a();
        aVar5.f7778a = true;
        aVar5.f7779b = "com.facebook.sdk.MonitorEnabled";
        f7776h = aVar5;
    }

    public static final boolean a() {
        f7769a.getClass();
        c();
        return f7773e.a();
    }

    public static void b() {
        a aVar = f7775g;
        e(aVar);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (aVar.f7780c == null || jCurrentTimeMillis - aVar.f7781d >= 604800000) {
            aVar.f7780c = null;
            aVar.f7781d = 0L;
            if (f7771c.compareAndSet(false, true)) {
                q.c().execute(new Runnable() { // from class: Z3.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (I.f7774f.a()) {
                            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                            p165n4.j jVarF = FetchedAppSettingsManager.f(q.b(), false);
                            if (jVarF != null && jVarF.f44901g) {
                                p165n4.a aVarA = p165n4.a.C0509a.a(q.a());
                                String strA = (aVarA == null || aVarA.a() == null) ? null : aVarA.a();
                                if (strA != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("advertiser_id", strA);
                                    bundle.putString("fields", "auto_event_setup_enabled");
                                    String str = r.j;
                                    r rVarG = r.c.g(null, "app", null);
                                    rVarG.f7876d = bundle;
                                    JSONObject jSONObject = rVarG.c().f7904b;
                                    if (jSONObject != null) {
                                        Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                        I.a aVar2 = I.f7775g;
                                        aVar2.f7780c = boolValueOf;
                                        aVar2.f7781d = jCurrentTimeMillis;
                                        I.f7769a.getClass();
                                        I.f(aVar2);
                                    }
                                }
                            }
                        }
                        I.f7771c.set(false);
                    }
                });
            }
        }
    }

    public static void c() {
        if (q.f7866p.get()) {
            AtomicBoolean atomicBoolean = f7770b;
            int i10 = 0;
            if (atomicBoolean.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = q.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                kotlin.jvm.internal.i.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f7777i = sharedPreferences;
                a aVar = f7772d;
                a aVar2 = f7773e;
                a aVar3 = f7774f;
                a[] aVarArr = {aVar2, aVar3, aVar};
                while (i10 < 3) {
                    a aVar4 = aVarArr[i10];
                    i10++;
                    if (aVar4 == f7775g) {
                        b();
                    } else {
                        Boolean bool = aVar4.f7780c;
                        String str = aVar4.f7779b;
                        if (bool == null) {
                            e(aVar4);
                            if (aVar4.f7780c != null) {
                                continue;
                            } else {
                                if (!atomicBoolean.get()) {
                                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                                }
                                try {
                                    Context contextA = q.a();
                                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                                    kotlin.jvm.internal.i.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                                    Bundle bundle = applicationInfo.metaData;
                                    if (bundle != null && bundle.containsKey(str)) {
                                        aVar4.f7780c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, aVar4.f7778a));
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                    q qVar = q.f7852a;
                                }
                            }
                        } else {
                            f(aVar4);
                        }
                    }
                }
                b();
                try {
                    Context contextA2 = q.a();
                    ApplicationInfo applicationInfo2 = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
                    kotlin.jvm.internal.i.d(applicationInfo2, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    Bundle bundle2 = applicationInfo2.metaData;
                    if (bundle2 != null) {
                        bundle2.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                        applicationInfo2.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        f7769a.getClass();
                        c();
                        aVar3.a();
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                d();
            }
        }
    }

    public static void d() {
        int i10;
        int i11;
        if (f7770b.get() && q.f7866p.get()) {
            Context contextA = q.a();
            int i12 = (f7772d.a() ? 1 : 0) | ((f7773e.a() ? 1 : 0) << 1) | ((f7774f.a() ? 1 : 0) << 2) | ((f7776h.a() ? 1 : 0) << 3);
            SharedPreferences sharedPreferences = f7777i;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.i.m("userSettingPref");
                throw null;
            }
            int i13 = 0;
            int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i14 != i12) {
                SharedPreferences sharedPreferences2 = f7777i;
                if (sharedPreferences2 == null) {
                    kotlin.jvm.internal.i.m("userSettingPref");
                    throw null;
                }
                sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).apply();
                try {
                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                    kotlin.jvm.internal.i.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    if (applicationInfo.metaData != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i10 = 0;
                        i11 = 0;
                        while (true) {
                            int i15 = i13 + 1;
                            try {
                                i10 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                                i11 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                if (i15 > 3) {
                                    break;
                                } else {
                                    i13 = i15;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                i13 = i11;
                                i11 = i13;
                            }
                        }
                        i13 = i10;
                    } else {
                        i11 = 0;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    i10 = 0;
                }
                p005a4.n nVar = new p005a4.n(contextA, (String) null);
                Bundle bundle = new Bundle();
                bundle.putInt("usage", i13);
                bundle.putInt("initial", i11);
                bundle.putInt("previous", i14);
                bundle.putInt("current", i12);
                if ((bundle.getInt("previous") & 2) == 0) {
                    q qVar = q.f7852a;
                    if (!a()) {
                        return;
                    }
                }
                nVar.a("fb_sdk_settings_changed", null, bundle, true, p093h4.e.b());
            }
        }
    }

    public static void e(a aVar) {
        String str = "";
        if (!f7770b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
        try {
            SharedPreferences sharedPreferences = f7777i;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.i.m("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(aVar.f7779b, "");
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f7780c = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.f7781d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException unused) {
            q qVar = q.f7852a;
        }
    }

    public static void f(a aVar) {
        if (!f7770b.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.f7780c);
            jSONObject.put("last_timestamp", aVar.f7781d);
            SharedPreferences sharedPreferences = f7777i;
            if (sharedPreferences == null) {
                kotlin.jvm.internal.i.m("userSettingPref");
                throw null;
            }
            sharedPreferences.edit().putString(aVar.f7779b, jSONObject.toString()).apply();
            d();
        } catch (Exception unused) {
            q qVar = q.f7852a;
        }
    }
}
