package com.google.firebase.messaging;

import R4.C0756c;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: compiled from: ProxyNotificationPreferences.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void b(Context context, w wVar, boolean z10) {
        p191p5.B bD;
        int i10;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesA = a(context);
            if (sharedPreferencesA.contains("proxy_retention") && sharedPreferencesA.getBoolean("proxy_retention", false) == z10) {
                return;
            }
            C0756c c0756c = wVar.f28420c;
            if (c0756c.f5272c.a() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z10);
                R4.A a10 = R4.A.a(c0756c.f5271b);
                synchronized (a10) {
                    i10 = a10.f5257d;
                    a10.f5257d = i10 + 1;
                }
                bD = a10.b(new R4.x(i10, 4, bundle));
            } else {
                bD = p191p5.j.d(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            bD.f(new p188p2.b(), new D(context, z10));
        }
    }
}
