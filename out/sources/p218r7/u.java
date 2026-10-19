package p218r7;

import I4.c;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p144l6.e;
import p241t7.a;

/* JADX INFO: compiled from: DeviceCacheManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46384c = a.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u f46385d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f46386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f46387b;

    public u(ExecutorService executorService) {
        this.f46387b = executorService;
    }

    public static Context a() {
        try {
            e.c();
            e eVarC = e.c();
            eVarC.a();
            return eVarC.f44388a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized u b() {
        try {
            if (f46385d == null) {
                f46385d = new u(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f46385d;
    }

    public final synchronized void c(Context context) {
        if (this.f46386a == null && context != null) {
            this.f46387b.execute(new c(this, 4, context));
        }
    }

    public final void d(long j, String str) {
        if (this.f46386a == null) {
            c(a());
            if (this.f46386a == null) {
                return;
            }
        }
        this.f46386a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d10) {
        if (this.f46386a == null) {
            c(a());
            if (this.f46386a == null) {
                return;
            }
        }
        this.f46386a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f46386a == null) {
            c(a());
            if (this.f46386a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f46386a.edit().remove(str).apply();
        } else {
            this.f46386a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z10) {
        if (this.f46386a == null) {
            c(a());
            if (this.f46386a == null) {
                return;
            }
        }
        this.f46386a.edit().putBoolean(str, z10).apply();
    }
}
