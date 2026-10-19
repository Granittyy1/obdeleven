package p126k0;

import android.view.animation.Interpolator;
import p077g0.c;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f41384a;

    public t(c cVar) {
        this.f41384a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) this.f41384a.a(f10);
    }
}
