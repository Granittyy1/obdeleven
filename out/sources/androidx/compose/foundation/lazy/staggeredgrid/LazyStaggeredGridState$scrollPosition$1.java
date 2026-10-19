package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements Ia.p<Integer, Integer, int[]> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ia.p
    public final int[] invoke(Integer num, Integer num2) {
        int iMin;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        LazyStaggeredGridState lazyStaggeredGridState = (LazyStaggeredGridState) this.receiver;
        W.f fVar = LazyStaggeredGridState.f10788x;
        lazyStaggeredGridState.getClass();
        int[] iArr = new int[iIntValue2];
        ((n) lazyStaggeredGridState.f10792d.getValue()).j.f(iIntValue);
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridState.f10793e;
        lazyStaggeredGridLaneInfo.c(iIntValue + iIntValue2);
        int iF = lazyStaggeredGridLaneInfo.f(iIntValue);
        if (iF == -2 || iF == -1) {
            iMin = 0;
        } else {
            if (iF < 0) {
                p245u.c.a("Expected positive lane number, got " + iF + " instead.");
            }
            iMin = Math.min(iF, iIntValue2);
        }
        int iD = iIntValue;
        for (int i10 = iMin - 1; -1 < i10; i10--) {
            iD = lazyStaggeredGridLaneInfo.d(iD, i10);
            iArr[i10] = iD;
            if (iD == -1) {
                Q3.d.x(-1, i10, 2, iArr);
                break;
            }
        }
        iArr[iMin] = iIntValue;
        while (true) {
            iMin++;
            if (iMin >= iIntValue2) {
                return iArr;
            }
            iIntValue++;
            int length = lazyStaggeredGridLaneInfo.f10782a + lazyStaggeredGridLaneInfo.f10783b.length;
            while (true) {
                if (iIntValue >= length) {
                    iIntValue = lazyStaggeredGridLaneInfo.f10782a + lazyStaggeredGridLaneInfo.f10783b.length;
                    break;
                }
                if (lazyStaggeredGridLaneInfo.a(iIntValue, iMin)) {
                    break;
                }
                iIntValue++;
            }
            iArr[iMin] = iIntValue;
        }
    }
}
