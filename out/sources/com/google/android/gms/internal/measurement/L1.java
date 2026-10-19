package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N1 f25504a;

    static {
        N1 n10;
        Uri uri = K1.f25494a;
        synchronized (M1.class) {
            try {
                if (M1.f25511a == null) {
                    N1 n11 = new N1();
                    synchronized (M1.class) {
                        if (M1.f25511a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        M1.f25511a = n11;
                    }
                }
                n10 = M1.f25511a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f25504a = n10;
    }
}
