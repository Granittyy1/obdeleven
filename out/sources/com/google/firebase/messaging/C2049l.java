package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import p191p5.InterfaceC2755a;

/* JADX INFO: renamed from: com.google.firebase.messaging.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FcmBroadcastProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2049l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28381c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static V f28382d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p188p2.b f28384b = new p188p2.b();

    public C2049l(Context context) {
        this.f28383a = context;
    }

    public static p191p5.g<Integer> a(Context context, Intent intent, boolean z10) {
        V v10;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (f28381c) {
            try {
                if (f28382d == null) {
                    f28382d = new V(context);
                }
                v10 = f28382d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            return v10.b(intent).g(new p188p2.b(), new C4.v(6));
        }
        if (I.a().c(context)) {
            synchronized (S.f28331b) {
                try {
                    S.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        S.f28332c.a(S.f28330a);
                    }
                    v10.b(intent).c(new I4.f(5, intent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            v10.b(intent);
        }
        return p191p5.j.e(-1);
    }

    public final p191p5.g<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f28383a;
        boolean z10 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        p188p2.b bVar = this.f28384b;
        return p191p5.j.c(new CallableC2047j(context, 0, intent), bVar).i(bVar, new InterfaceC2755a() { // from class: com.google.firebase.messaging.k
            @Override // p191p5.InterfaceC2755a
            public final Object i(p191p5.g gVar) {
                if (((Integer) gVar.k()).intValue() != 402) {
                    return gVar;
                }
                return C2049l.a(context, intent, z11).g(new p188p2.b(), new androidx.compose.animation.D(3));
            }
        });
    }
}
