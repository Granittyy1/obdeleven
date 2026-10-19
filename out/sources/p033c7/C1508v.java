package p033c7;

import Q3.d;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.RunnableC1341f;
import p256ua.a;

/* JADX INFO: renamed from: c7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ForegroundNotifier.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1508v implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RunnableC1341f f22511e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22508b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22509c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22510d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a<String> f22512f = new a<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f22510d = true;
        RunnableC1341f runnableC1341f = this.f22511e;
        Handler handler = this.f22508b;
        if (runnableC1341f != null) {
            handler.removeCallbacks(runnableC1341f);
        }
        RunnableC1341f runnableC1341f2 = new RunnableC1341f(2, this);
        this.f22511e = runnableC1341f2;
        handler.postDelayed(runnableC1341f2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f22510d = false;
        boolean z10 = this.f22509c;
        this.f22509c = true;
        RunnableC1341f runnableC1341f = this.f22511e;
        if (runnableC1341f != null) {
            this.f22508b.removeCallbacks(runnableC1341f);
        }
        if (z10) {
            return;
        }
        d.C();
        this.f22512f.c("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
