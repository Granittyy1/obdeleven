package coil.util;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f23153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f23154b;

    public d(Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2) {
        this.f23153a = aVar;
        this.f23154b = aVar2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Ia.a<p293xa.r> aVar = this.f23154b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Ia.a<p293xa.r> aVar = this.f23153a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
