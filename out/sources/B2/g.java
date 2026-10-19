package B2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: SwipeRefreshLayout.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f1496d;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.f1496d = swipeRefreshLayout;
        this.f1494b = i10;
        this.f1495c = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        d dVar = this.f1496d.f20171A;
        int i10 = this.f1494b;
        dVar.setAlpha((int) (((this.f1495c - i10) * f10) + i10));
    }
}
