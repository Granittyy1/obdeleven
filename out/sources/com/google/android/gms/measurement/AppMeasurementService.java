package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.h;
import p131k5.B0;
import p131k5.BinderC2535l1;
import p131k5.C2523i1;
import p131k5.V2;
import p131k5.W2;
import p131k5.X2;
import p131k5.Z2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements Z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V2<AppMeasurementService> f26531b;

    @Override // p131k5.Z2
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = Y0.a.f7477a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = Y0.a.f7477a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p131k5.Z2
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // p131k5.Z2
    public final boolean c(int i10) {
        return stopSelfResult(i10);
    }

    public final V2<AppMeasurementService> d() {
        if (this.f26531b == null) {
            this.f26531b = new V2<>(this);
        }
        return this.f26531b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        V2<AppMeasurementService> v2D = d();
        if (intent == null) {
            v2D.a().f41712f.c("onBind called with null intent");
            return null;
        }
        v2D.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2535l1(h.g(v2D.f42026a));
        }
        v2D.a().f41715i.b(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        B0 b10 = C2523i1.c(d().f42026a, null, null).f42220i;
        C2523i1.g(b10);
        b10.f41719n.c("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        B0 b10 = C2523i1.c(d().f42026a, null, null).f42220i;
        C2523i1.g(b10);
        b10.f41719n.c("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        V2<AppMeasurementService> v2D = d();
        if (intent == null) {
            v2D.a().f41712f.c("onRebind called with null intent");
            return;
        }
        v2D.getClass();
        v2D.a().f41719n.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        V2<AppMeasurementService> v2D = d();
        B0 b10 = C2523i1.c(v2D.f42026a, null, null).f42220i;
        C2523i1.g(b10);
        if (intent == null) {
            b10.f41715i.c("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        b10.f41719n.a(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        X2 x10 = new X2();
        x10.f42047b = v2D;
        x10.f42048c = i11;
        x10.f42049d = b10;
        x10.f42050e = intent;
        h hVarG = h.g(v2D.f42026a);
        hVarG.i().z(new W2(hVarG, 0, x10));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        V2<AppMeasurementService> v2D = d();
        if (intent == null) {
            v2D.a().f41712f.c("onUnbind called with null intent");
            return true;
        }
        v2D.getClass();
        v2D.a().f41719n.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
