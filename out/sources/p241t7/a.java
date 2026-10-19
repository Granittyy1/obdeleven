package p241t7;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: AndroidLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f47351c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f47352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47353b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f47354b == null) {
                    b.f47354b = new b();
                }
                bVar = b.f47354b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f47352a = bVar;
    }

    public static a d() {
        if (f47351c == null) {
            synchronized (a.class) {
                try {
                    if (f47351c == null) {
                        f47351c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f47351c;
    }

    public final void a() {
        if (this.f47353b) {
            this.f47352a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f47353b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f47352a.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f47353b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f47352a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f47353b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f47352a.getClass();
        }
    }

    public final void f() {
        if (this.f47353b) {
            this.f47352a.getClass();
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f47353b) {
            String.format(Locale.ENGLISH, str, objArr);
            this.f47352a.getClass();
        }
    }
}
