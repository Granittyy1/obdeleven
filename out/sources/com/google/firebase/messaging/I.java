package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: ServiceStarter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static I f28280e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28281a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f28282b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f28283c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f28284d = new ArrayDeque();

    public static synchronized I a() {
        try {
            if (f28280e == null) {
                f28280e = new I();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f28280e;
    }

    public final boolean b(Context context) {
        if (this.f28283c == null) {
            this.f28283c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f28282b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f28283c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f28282b == null) {
            this.f28282b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f28282b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f28282b.booleanValue();
    }
}
