package com.google.firebase.analytics;

import U4.C0804l;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.android.gms.internal.measurement.C1945z0;
import com.google.android.gms.internal.measurement.O0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p108i7.c;
import p131k5.InterfaceC2544n2;
import p144l6.e;
import p180o6.a;
import p191p5.j;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f28048b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1912u0 f28049a;

    public FirebaseAnalytics(C1912u0 c1912u0) {
        C0804l.h(c1912u0);
        this.f28049a = c1912u0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f28048b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f28048b == null) {
                        f28048b = new FirebaseAnalytics(C1912u0.b(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28048b;
    }

    @Keep
    public static InterfaceC2544n2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1912u0 c1912u0B = C1912u0.b(context, bundle);
        if (c1912u0B == null) {
            return null;
        }
        return new a(c1912u0B);
    }

    public final void a(Bundle bundle, String str) {
        C1912u0 c1912u0 = this.f28049a;
        c1912u0.getClass();
        c1912u0.e(new O0(c1912u0, null, str, bundle, false));
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.a.f28202m;
            return (String) j.b(((com.google.firebase.installations.a) e.c().b(c.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C1912u0 c1912u0 = this.f28049a;
        c1912u0.getClass();
        c1912u0.e(new C1945z0(c1912u0, activity, str, str2));
    }
}
