package androidx.work.impl.workers;

import Q2.z;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.d;
import androidx.work.impl.utils.futures.a;
import androidx.work.j;
import androidx.work.k;
import kotlin.jvm.internal.i;
import p107i6.f;
import p293xa.r;

/* JADX INFO: compiled from: ConstraintTrackingWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends j implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f20452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f20454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<j.a> f20455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f20456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        i.e(appContext, "appContext");
        i.e(workerParameters, "workerParameters");
        this.f20452b = workerParameters;
        this.f20453c = new Object();
        this.f20455e = new a<>();
    }

    @Override // androidx.work.impl.constraints.d
    public final void a(z workSpec, b state) {
        i.e(workSpec, "workSpec");
        i.e(state, "state");
        k kVarC = k.c();
        String str = T2.a.f5798a;
        workSpec.toString();
        kVarC.getClass();
        if (state instanceof b.C0202b) {
            synchronized (this.f20453c) {
                this.f20454d = true;
                r rVar = r.f47939a;
            }
        }
    }

    @Override // androidx.work.j
    public final void onStopped() {
        super.onStopped();
        j jVar = this.f20456f;
        if (jVar == null || jVar.isStopped()) {
            return;
        }
        jVar.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // androidx.work.j
    public final f<j.a> startWork() {
        getBackgroundExecutor().execute(new M2.d(1, this));
        a<j.a> future = this.f20455e;
        i.d(future, "future");
        return future;
    }
}
