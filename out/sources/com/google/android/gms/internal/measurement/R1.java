package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.C0873a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R1 implements W1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0873a f25571h = new C0873a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f25572i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f25573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f25574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f25575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T1 f25576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f25577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Map<String, String> f25578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25579g;

    public R1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        T1 t8 = new T1(this);
        this.f25576d = t8;
        this.f25577e = new Object();
        this.f25579g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f25573a = contentResolver;
        this.f25574b = uri;
        this.f25575c = runnable;
        contentResolver.registerContentObserver(uri, false, t8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static R1 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        R1 r10;
        synchronized (R1.class) {
            C0873a c0873a = f25571h;
            r10 = (R1) c0873a.get(uri);
            if (r10 == null) {
                try {
                    R1 r11 = new R1(contentResolver, uri, runnable);
                    try {
                        c0873a.put(uri, r11);
                    } catch (SecurityException unused) {
                    }
                    r10 = r11;
                } catch (SecurityException unused2) {
                }
            }
        }
        return r10;
    }

    public static synchronized void c() {
        try {
            for (R1 r10 : (C0873a.e) f25571h.values()) {
                r10.f25573a.unregisterContentObserver(r10.f25576d);
            }
            f25571h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map<String, String> b() {
        Map<String, String> map;
        ?? r10;
        Object objH;
        Map<String, String> map2 = this.f25578f;
        ?? r11 = map2;
        if (map2 == null) {
            synchronized (this.f25577e) {
                try {
                    ?? r12 = this.f25578f;
                    r10 = r12;
                    if (r12 == 0) {
                        try {
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                J.b bVar = new J.b();
                                bVar.f3951b = this;
                                try {
                                    objH = bVar.h();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objH = bVar.h();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objH;
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                map = null;
                            }
                            this.f25578f = map;
                            r10 = map;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(r12);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            r11 = r10;
        }
        return r11 != 0 ? r11 : Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.measurement.W1
    public final /* synthetic */ Object e(String str) {
        return b().get(str);
    }
}
