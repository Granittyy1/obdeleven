package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.h;
import p131k5.B0;
import p131k5.C2523i1;
import p131k5.U2;
import p131k5.V2;
import p131k5.W2;
import p131k5.Z2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements Z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V2<AppMeasurementJobService> f26529b;

    @Override // p131k5.Z2
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // p131k5.Z2
    public final boolean c(int i10) {
        throw new UnsupportedOperationException();
    }

    public final V2<AppMeasurementJobService> d() {
        if (this.f26529b == null) {
            this.f26529b = new V2<>(this);
        }
        return this.f26529b;
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
        V2<AppMeasurementJobService> v2D = d();
        if (intent == null) {
            v2D.a().f41712f.c("onRebind called with null intent");
            return;
        }
        v2D.getClass();
        v2D.a().f41719n.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        V2<AppMeasurementJobService> v2D = d();
        B0 b10 = C2523i1.c(v2D.f42026a, null, null).f42220i;
        C2523i1.g(b10);
        String string = jobParameters.getExtras().getString("action");
        b10.f41719n.b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        U2 u10 = new U2();
        u10.f42009b = v2D;
        u10.f42010c = b10;
        u10.f42011d = jobParameters;
        h hVarG = h.g(v2D.f42026a);
        hVarG.i().z(new W2(hVarG, 0, u10));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        V2<AppMeasurementJobService> v2D = d();
        if (intent == null) {
            v2D.a().f41712f.c("onUnbind called with null intent");
            return true;
        }
        v2D.getClass();
        v2D.a().f41719n.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // p131k5.Z2
    public final void a(Intent intent) {
    }
}
