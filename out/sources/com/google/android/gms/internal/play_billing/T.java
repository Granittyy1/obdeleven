package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbm f26158a = new zzbm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f26160c;

    public T(Class cls) {
        this.f26159b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f26160c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f26158a) {
            try {
                Logger logger2 = this.f26160c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f26159b);
                this.f26160c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
