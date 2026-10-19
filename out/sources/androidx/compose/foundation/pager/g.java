package androidx.compose.foundation.pager;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.foundation.gestures.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagerState f10974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.c f10975c;

    public g(PagerState pagerState, androidx.compose.foundation.gestures.c cVar) {
        this.f10974b = pagerState;
        this.f10975c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.c
    public final float a(float f10, float f11, float f12) {
        float fA = this.f10975c.a(f10, f11, f12);
        boolean z10 = false;
        if (f10 <= 0.0f ? f10 + f11 <= 0.0f : f10 + f11 > f12) {
            z10 = true;
        }
        float fAbs = Math.abs(fA);
        PagerState pagerState = this.f10974b;
        if (fAbs == 0.0f || !z10) {
            if (Math.abs(pagerState.f10934f) < 1.0E-6d) {
                return 0.0f;
            }
            float fO = pagerState.f10934f * (-1.0f);
            if (((Boolean) pagerState.f10927F.getValue()).booleanValue()) {
                fO += pagerState.o();
            }
            return Na.l.C(fO, -f12, f12);
        }
        float fO2 = pagerState.f10934f * (-1);
        while (fA > 0.0f && fO2 < fA) {
            fO2 += pagerState.o();
        }
        while (fA < 0.0f && fO2 > fA) {
            fO2 -= pagerState.o();
        }
        return fO2;
    }
}
