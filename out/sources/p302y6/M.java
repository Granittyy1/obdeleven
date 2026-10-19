package p302y6;

import D2.C0692t;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;
import p108i7.c;

/* JADX INFO: compiled from: IdManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f48335g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f48336h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0692t f48337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f48338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f48340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f48341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2807c f48342f;

    public M(Context context, String str, c cVar, I i10) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f48338b = context;
        this.f48339c = str;
        this.f48340d = cVar;
        this.f48341e = i10;
        this.f48337a = new C0692t();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f48335g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized N b() {
        String str;
        C2807c c2807c = this.f48342f;
        if (c2807c != null && (c2807c.f48365b != null || !this.f48341e.a())) {
            return this.f48342f;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        SharedPreferences sharedPreferences = this.f48338b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        Log.isLoggable("FirebaseCrashlytics", 2);
        if (this.f48341e.a()) {
            try {
                str = (String) Q.a(this.f48340d.getId());
            } catch (Exception unused) {
                str = null;
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f48342f = new C2807c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f48342f = new C2807c(a(sharedPreferences, str), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f48342f = new C2807c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null);
        } else {
            this.f48342f = new C2807c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        Objects.toString(this.f48342f);
        Log.isLoggable("FirebaseCrashlytics", 2);
        return this.f48342f;
    }

    public final String c() {
        String str;
        C0692t c0692t = this.f48337a;
        Context context = this.f48338b;
        synchronized (c0692t) {
            try {
                if (((String) c0692t.f2697b) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0692t.f2697b = installerPackageName;
                }
                str = "".equals((String) c0692t.f2697b) ? null : (String) c0692t.f2697b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
