package p208q9;

import android.widget.Scroller;

/* JADX INFO: compiled from: DurationScroller.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Scroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f46185a;

    @Override // android.widget.Scroller
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (int) (((double) i14) * this.f46185a));
    }
}
