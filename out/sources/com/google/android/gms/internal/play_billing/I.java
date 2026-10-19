package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I<V> extends Y implements U<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f26135e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final T f26136f = new T(C.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f26137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f26138h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f26139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile A f26140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile H f26141d;

    static {
        boolean z10;
        D f10;
        Throwable th;
        Throwable th2;
        D g10;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f26137g = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e10 = null;
        if (property == null || property.contains("Android")) {
            try {
                g10 = new G();
            } catch (Error | Exception e11) {
                try {
                    f10 = new E();
                } catch (Error | Exception e12) {
                    e10 = e12;
                    f10 = new F();
                }
                th = e11;
                th2 = e10;
                g10 = f10;
            }
        } else {
            try {
                g10 = new E();
            } catch (NoClassDefFoundError unused2) {
                g10 = new F();
            }
        }
        th2 = null;
        th = null;
        f26138h = g10;
        if (th2 != null) {
            T t8 = f26136f;
            Logger loggerA = t8.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            t8.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(H h8) {
        h8.f26133a = null;
        while (true) {
            H h10 = this.f26141d;
            if (h10 != H.f26132c) {
                H h11 = null;
                while (h10 != null) {
                    H h12 = h10.f26134b;
                    if (h10.f26133a != null) {
                        h11 = h10;
                    } else if (h11 != null) {
                        h11.f26134b = h12;
                        if (h11.f26133a == null) {
                        }
                    } else if (!f26138h.g(this, h10, h12)) {
                    }
                    h10 = h12;
                }
                return;
            }
            return;
        }
    }
}
