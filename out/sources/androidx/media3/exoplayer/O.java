package androidx.media3.exoplayer;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18062d;

    public /* synthetic */ O(Object obj, int i10, Object obj2) {
        this.f18060b = i10;
        this.f18061c = obj;
        this.f18062d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18060b) {
            case 0:
                j0 j0Var = (j0) this.f18062d;
                ((P) this.f18061c).getClass();
                try {
                    synchronized (j0Var) {
                    }
                    try {
                        j0Var.f18454a.x(j0Var.f18456c, j0Var.f18457d);
                        return;
                    } finally {
                        j0Var.a(true);
                    }
                } catch (ExoPlaybackException e10) {
                    p114j1.k.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 1:
                List processedEvents = (List) this.f18062d;
                kotlin.jvm.internal.i.e(processedEvents, "$processedEvents");
                HashSet<Integer> hashSet = com.facebook.appevents.cloudbridge.d.f24909a;
                Integer num = (Integer) this.f18061c;
                if (kotlin.collections.q.J(hashSet, num) || !kotlin.collections.q.J(com.facebook.appevents.cloudbridge.d.f24910b, num)) {
                    return;
                }
                if (com.facebook.appevents.cloudbridge.d.f24913e >= 5) {
                    com.facebook.appevents.cloudbridge.d.b().clear();
                    com.facebook.appevents.cloudbridge.d.f24913e = 0;
                    return;
                } else {
                    com.facebook.appevents.cloudbridge.d.b().addAll(0, processedEvents);
                    com.facebook.appevents.cloudbridge.d.f24913e++;
                    return;
                }
            case 2:
                com.voltasit.obdeleven.ui.module.g gVar = (com.voltasit.obdeleven.ui.module.g) this.f18061c;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(gVar.q(), R.anim.fade_out);
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(gVar.q(), R.anim.fade_in);
                animationLoadAnimation.setDuration(250L);
                animationLoadAnimation2.setDuration(250L);
                animationLoadAnimation.setAnimationListener(new W8.c(gVar, (Drawable) this.f18062d, animationLoadAnimation2, 1));
                gVar.f34105n.startAnimation(animationLoadAnimation);
                return;
            default:
                y7.a aVar = (y7.a) this.f18061c;
                com.google.firebase.perf.v1.d dVarB = aVar.b((com.google.firebase.perf.util.h) this.f18062d);
                if (dVarB != null) {
                    aVar.f48412a.add(dVarB);
                    return;
                }
                return;
        }
    }
}
