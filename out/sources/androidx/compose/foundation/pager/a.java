package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagerState f10955b;

    public a(PagerState pagerState) {
        Orientation orientation = Orientation.f9957b;
        this.f10955b = pagerState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long C0(int i10, long j) {
        if (androidx.compose.ui.input.nestedscroll.c.a(i10, 1)) {
            PagerState pagerState = this.f10955b;
            if (Math.abs(pagerState.k()) > 1.0E-6d) {
                float fK = pagerState.k() * pagerState.n();
                float fG = ((pagerState.l().g() + pagerState.l().f()) * (-Math.signum(pagerState.k()))) + fK;
                if (pagerState.k() > 0.0f) {
                    fG = fK;
                    fK = fG;
                }
                Orientation orientation = Orientation.f9957b;
                float f10 = -pagerState.f10938k.e(-Na.l.C(Float.intBitsToFloat((int) (j >> 32)), fK, fG));
                Orientation orientation2 = Orientation.f9957b;
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
            }
        }
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object U(long j, long j10, kotlin.coroutines.c<? super p013b0.p> cVar) {
        Orientation orientation = Orientation.f9957b;
        Orientation orientation2 = Orientation.f9957b;
        return new p013b0.p(p013b0.p.a(0.0f, 0.0f, 1, j10));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long c1(int i10, long j, long j10) {
        if (!androidx.compose.ui.input.nestedscroll.c.a(i10, 2)) {
            return 0L;
        }
        Orientation orientation = Orientation.f9957b;
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
