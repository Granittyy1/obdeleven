package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H extends C1365h {
    final /* synthetic */ G this$0;

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class a extends C1365h {
        final /* synthetic */ G this$0;

        public a(G g10) {
            this.this$0 = g10;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            G g10 = this.this$0;
            int i10 = g10.f17729b + 1;
            g10.f17729b = i10;
            if (i10 == 1 && g10.f17732e) {
                g10.f17734g.f(Lifecycle.Event.ON_START);
                g10.f17732e = false;
            }
        }
    }

    public H(G g10) {
        this.this$0 = g10;
    }

    @Override // androidx.lifecycle.C1365h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = J.f17740c;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) fragmentFindFragmentByTag).f17741b = this.this$0.f17736i;
        }
    }

    @Override // androidx.lifecycle.C1365h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        G g10 = this.this$0;
        int i10 = g10.f17730c - 1;
        g10.f17730c = i10;
        if (i10 == 0) {
            Handler handler = g10.f17733f;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(g10.f17735h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        G.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.C1365h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        G g10 = this.this$0;
        int i10 = g10.f17729b - 1;
        g10.f17729b = i10;
        if (i10 == 0 && g10.f17731d) {
            g10.f17734g.f(Lifecycle.Event.ON_STOP);
            g10.f17732e = true;
        }
    }
}
