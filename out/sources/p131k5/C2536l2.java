package p131k5;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: renamed from: k5.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2536l2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f42296b;

    public C2536l2(e eVar) {
        this.f42296b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e eVar = this.f42296b;
        try {
            try {
                eVar.d().f41719n.c("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (TextUtils.isEmpty(string)) {
                            data = null;
                        } else {
                            data = Uri.parse(string);
                        }
                    } else {
                        data = null;
                    }
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    eVar.o();
                    eVar.i().z(new RunnableC2532k2(this, bundle == null, uri, z3.Y(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                }
            } catch (RuntimeException e10) {
                eVar.d().f41712f.b(e10, "Throwable caught in onActivityCreated");
            }
        } finally {
            eVar.r().z(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C2567t2 c2567t2R = this.f42296b.r();
        synchronized (c2567t2R.f42471l) {
            try {
                if (activity == c2567t2R.f42467g) {
                    c2567t2R.f42467g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C2523i1) c2567t2R.f3968a).f42218g.E()) {
            c2567t2R.f42466f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C2567t2 c2567t2R = this.f42296b.r();
        synchronized (c2567t2R.f42471l) {
            c2567t2R.f42470k = false;
            c2567t2R.f42468h = true;
        }
        ((C2523i1) c2567t2R.f3968a).f42224n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((C2523i1) c2567t2R.f3968a).f42218g.E()) {
            C2559r2 c2559r2D = c2567t2R.D(activity);
            c2567t2R.f42464d = c2567t2R.f42463c;
            c2567t2R.f42463c = null;
            c2567t2R.i().z(new RunnableC2579w2(c2567t2R, c2559r2D, jElapsedRealtime));
        } else {
            c2567t2R.f42463c = null;
            c2567t2R.i().z(new RunnableC2583x2(c2567t2R, jElapsedRealtime));
        }
        Y2 y2S = this.f42296b.s();
        ((C2523i1) y2S.f3968a).f42224n.getClass();
        y2S.i().z(new RunnableC2485a3(y2S, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Y2 y2S = this.f42296b.s();
        ((C2523i1) y2S.f3968a).f42224n.getClass();
        y2S.i().z(new RunnableC2490b3(y2S, SystemClock.elapsedRealtime()));
        C2567t2 c2567t2R = this.f42296b.r();
        synchronized (c2567t2R.f42471l) {
            c2567t2R.f42470k = true;
            if (activity != c2567t2R.f42467g) {
                synchronized (c2567t2R.f42471l) {
                    c2567t2R.f42467g = activity;
                    c2567t2R.f42468h = false;
                }
                if (((C2523i1) c2567t2R.f3968a).f42218g.E()) {
                    c2567t2R.f42469i = null;
                    c2567t2R.i().z(new RunnableC2591z2(0, c2567t2R));
                }
            }
        }
        if (!((C2523i1) c2567t2R.f3968a).f42218g.E()) {
            c2567t2R.f42463c = c2567t2R.f42469i;
            c2567t2R.i().z(new RunnableC2571u2(c2567t2R));
            return;
        }
        c2567t2R.A(activity, c2567t2R.D(activity), false);
        C2481a c2481aM = ((C2523i1) c2567t2R.f3968a).m();
        ((C2523i1) c2481aM.f3968a).f42224n.getClass();
        c2481aM.i().z(new RunnableC2546o0(c2481aM, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C2559r2 c2559r2;
        C2567t2 c2567t2R = this.f42296b.r();
        if (!((C2523i1) c2567t2R.f3968a).f42218g.E() || bundle == null || (c2559r2 = (C2559r2) c2567t2R.f42466f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2559r2.f42437c);
        bundle2.putString("name", c2559r2.f42435a);
        bundle2.putString("referrer_name", c2559r2.f42436b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
