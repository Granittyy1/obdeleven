package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.collection.C0873a;
import com.google.common.base.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1803e2<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f25685g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile S1 f25686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p006a5.a f25687i;
    public static final AtomicInteger j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1852l2 f25688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f25690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f25691d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile T f25692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25693f;

    static {
        new AtomicReference();
        f25687i = new p006a5.a();
        j = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1803e2(C1852l2 c1852l2, String str, Object obj) {
        c1852l2.getClass();
        if (c1852l2.f25782a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f25688a = c1852l2;
        this.f25689b = str;
        this.f25690c = obj;
        this.f25693f = true;
    }

    public final T a() {
        if (!this.f25693f) {
            p006a5.a aVar = f25687i;
            String str = this.f25689b;
            aVar.getClass();
            A8.p.j(str, "flagName must not be null");
        }
        int i10 = j.get();
        if (this.f25691d < i10) {
            synchronized (this) {
                try {
                    if (this.f25691d < i10) {
                        S1 s10 = f25686h;
                        Optional<InterfaceC1789c2> optionalA = Optional.a();
                        String strA = null;
                        if (s10 != null) {
                            optionalA = s10.f25586b.get();
                            if (optionalA.c()) {
                                InterfaceC1789c2 interfaceC1789c2B = optionalA.b();
                                C1852l2 c1852l2 = this.f25688a;
                                strA = interfaceC1789c2B.a(c1852l2.f25784c, this.f25689b, c1852l2.f25782a);
                            }
                        }
                        A8.p.p("Must call PhenotypeFlagInitializer.maybeInit() first", s10 != null);
                        this.f25688a.getClass();
                        T tC = (T) d(s10);
                        if (tC == null && (tC = (T) b(s10)) == null) {
                            tC = this.f25690c;
                        }
                        if (optionalA.c()) {
                            tC = strA == null ? this.f25690c : c(strA);
                        }
                        this.f25692e = tC;
                        this.f25691d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f25692e;
    }

    public final Object b(S1 s10) {
        X1 x10;
        String strB;
        if (!this.f25688a.f25785d) {
            Context context = s10.f25585a;
            synchronized (X1.class) {
                try {
                    if (X1.f25633c == null) {
                        X1.f25633c = Fa.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new X1(context) : new X1();
                    }
                    x10 = X1.f25633c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C1852l2 c1852l2 = this.f25688a;
            if (c1852l2.f25785d) {
                strB = null;
            } else {
                String str = c1852l2.f25783b;
                strB = this.f25689b;
                if (str == null || !str.isEmpty()) {
                    strB = androidx.compose.ui.text.font.s.b(str, strB);
                }
            }
            Object objE = x10.e(strB);
            if (objE != null) {
                return c(objE);
            }
        }
        return null;
    }

    public abstract T c(Object obj);

    public final Object d(S1 s10) {
        R1 r1A;
        C1852l2 c1852l2 = this.f25688a;
        Uri uri = c1852l2.f25782a;
        if (uri == null) {
            Context context = s10.f25585a;
            c1852l2.getClass();
            C0873a c0873a = C1873o2.f25807b;
            throw null;
        }
        Context context2 = s10.f25585a;
        Optional<Boolean> optional = C1796d2.f25676a;
        String authority = uri.getAuthority();
        boolean zBooleanValue = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
        } else if (C1796d2.f25676a.c()) {
            zBooleanValue = C1796d2.f25676a.b().booleanValue();
        } else {
            synchronized (C1796d2.f25677b) {
                try {
                    if (C1796d2.f25676a.c()) {
                        zBooleanValue = C1796d2.f25676a.b().booleanValue();
                    } else {
                        try {
                            if (!"com.google.android.gms".equals(context2.getPackageName())) {
                                ProviderInfo providerInfoResolveContentProvider = context2.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                                if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                                }
                                C1796d2.f25676a = Optional.d(Boolean.valueOf(zBooleanValue));
                                zBooleanValue = C1796d2.f25676a.b().booleanValue();
                            }
                            if ((context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                zBooleanValue = true;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        C1796d2.f25676a = Optional.d(Boolean.valueOf(zBooleanValue));
                        zBooleanValue = C1796d2.f25676a.b().booleanValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zBooleanValue) {
            this.f25688a.getClass();
            r1A = R1.a(s10.f25585a.getContentResolver(), this.f25688a.f25782a, RunnableC1824h2.f25763b);
        } else {
            r1A = null;
        }
        if (r1A != null) {
            String str = this.f25688a.f25784c;
            String strB = this.f25689b;
            if (str == null || !str.isEmpty()) {
                strB = androidx.compose.ui.text.font.s.b(str, strB);
            }
            Object objE = r1A.e(strB);
            if (objE != null) {
                return c(objE);
            }
        }
        return null;
    }
}
