package androidx.compose.foundation.gestures.snapping;

import Ia.q;
import Na.l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.m;
import androidx.compose.foundation.pager.r;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: PagerSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f10042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Float, Float, Float, Float> f10043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f10044d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(PagerState pagerState, q<? super Float, ? super Float, ? super Float, Float> qVar, r rVar) {
        this.f10042b = pagerState;
        this.f10043c = qVar;
        this.f10044d = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.snapping.j
    public final float c(float f10, float f11) {
        PagerState pagerState = this.f10042b;
        int iN = ((m) pagerState.f10943p.getValue()).f10986c + pagerState.n();
        if (iN == 0) {
            return 0.0f;
        }
        int i10 = f10 < 0.0f ? pagerState.f10933e + 1 : pagerState.f10933e;
        int iD = l.D(((int) (f11 / iN)) + i10, 0, pagerState.m());
        pagerState.n();
        int i11 = ((m) pagerState.f10943p.getValue()).f10986c;
        this.f10044d.getClass();
        long j = i10;
        long j10 = 1;
        int iAbs = Math.abs((l.D(l.D(iD, (int) l.y(j - j10, 0L), (int) l.A(j + j10, 2147483647L)), 0, pagerState.m()) - i10) * iN) - iN;
        int i12 = iAbs >= 0 ? iAbs : 0;
        if (i12 == 0) {
            return i12;
        }
        return Math.signum(f10) * i12;
    }

    @Override // androidx.compose.foundation.gestures.snapping.j
    public final float d(float f10) {
        PagerState pagerState = this.f10042b;
        k kVarH = pagerState.l().h();
        List<androidx.compose.foundation.pager.d> listE = pagerState.l().e();
        int size = listE.size();
        float f11 = Float.NEGATIVE_INFINITY;
        float f12 = Float.POSITIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.pager.d dVar = listE.get(i10);
            androidx.compose.foundation.pager.i iVarL = pagerState.l();
            int iA = (int) (iVarL.getOrientation() == Orientation.f9957b ? iVarL.a() & 4294967295L : iVarL.a() >> 32);
            int iC = pagerState.l().c();
            int iB = pagerState.l().b();
            int iF = pagerState.l().f();
            int offset = dVar.getOffset();
            pagerState.m();
            float f13 = offset - kVarH.f(iA, iF, iC, iB);
            if (f13 <= 0.0f && f13 > f11) {
                f11 = f13;
            }
            if (f13 >= 0.0f && f13 < f12) {
                f12 = f13;
            }
        }
        if (f11 == Float.NEGATIVE_INFINITY) {
            f11 = f12;
        }
        if (f12 == Float.POSITIVE_INFINITY) {
            f12 = f11;
        }
        if (!pagerState.d()) {
            if (I2.e.l(pagerState, f10)) {
                f11 = 0.0f;
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
            }
        }
        if (!pagerState.c()) {
            f11 = 0.0f;
            if (!I2.e.l(pagerState, f10)) {
                f12 = 0.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f11), Float.valueOf(f12));
        float fFloatValue = ((Number) pair.a()).floatValue();
        float fFloatValue2 = ((Number) pair.b()).floatValue();
        float fFloatValue3 = this.f10043c.invoke(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            p245u.c.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }
}
