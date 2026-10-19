package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class X1 implements W1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static X1 f25633c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1 f25635b;

    public X1() {
        this.f25634a = null;
        this.f25635b = null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0049 A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:9:0x000e, B:11:0x0012, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:24:0x0030, B:26:0x0036, B:32:0x0049, B:34:0x004d, B:35:0x004f, B:29:0x0041), top: B:61:0x000e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x004d A[Catch: all -> 0x0014, TryCatch #2 {all -> 0x0014, blocks: (B:9:0x000e, B:11:0x0012, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:24:0x0030, B:26:0x0036, B:32:0x0049, B:34:0x004d, B:35:0x004f, B:29:0x0041), top: B:61:0x000e, inners: #3 }] */
    @Override // com.google.android.gms.internal.measurement.W1
    public final Object e(String str) {
        Object objB;
        Context context = this.f25634a;
        if (context == null) {
            return null;
        }
        boolean z10 = true;
        if (!Q1.f25562b) {
            synchronized (Q1.class) {
                try {
                    if (!Q1.f25562b) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (Q1.f25561a == null) {
                                    Q1.f25561a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = Q1.f25561a;
                                if (userManager != null) {
                                    try {
                                        if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                                        }
                                        if (z10) {
                                            Q1.f25561a = null;
                                        }
                                    } catch (NullPointerException unused) {
                                        Q1.f25561a = null;
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    Q1.f25562b = z10;
                                }
                            }
                            z10 = false;
                            if (z10) {
                                Q1.f25561a = null;
                            }
                            if (z10) {
                                Q1.f25562b = z10;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!z10) {
            return null;
        }
        try {
            try {
                C1775a2 c1775a2 = new C1775a2();
                c1775a2.f25655a = this;
                c1775a2.f25656b = str;
                try {
                    objB = c1775a2.b();
                } catch (SecurityException unused2) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        objB = c1775a2.b();
                    } finally {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                }
                return (String) objB;
            } catch (SecurityException e10) {
                e = e10;
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                return null;
            }
        } catch (IllegalStateException e11) {
            e = e11;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        }
    }

    public X1(Context context) {
        this.f25634a = context;
        Z1 z10 = new Z1(null);
        this.f25635b = z10;
        context.getContentResolver().registerContentObserver(K1.f25494a, true, z10);
    }
}
