package W;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6988a;

    public a(f fVar) {
        this.f6988a = fVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f6988a.z(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f6988a.p(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f6988a.q(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f6988a.y(i10);
    }
}
