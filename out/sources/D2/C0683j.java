package D2;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: renamed from: D2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CircularPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0683j extends f0 {
    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    @Override // D2.f0
    public final long a(ViewGroup viewGroup, F f10, O o10, O o11) {
        int i10;
        int iRound;
        int iCenterX;
        Integer num;
        if (o10 == null && o11 == null) {
            return 0L;
        }
        if (o11 != null) {
            int iIntValue = 8;
            if (o10 != null && (num = (Integer) o10.f2553a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i10 = -1;
            } else {
                o10 = o11;
                i10 = 1;
            }
        } else {
            i10 = -1;
        }
        int iB = f0.b(o10, 0);
        int iB2 = f0.b(o10, 1);
        F.d dVar = f10.f2521z;
        Rect rectA = dVar == null ? null : dVar.a();
        if (rectA != null) {
            iCenterX = rectA.centerX();
            iRound = rectA.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f11 = iCenterX - iB;
        float f12 = iRound - iB2;
        float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j = f10.f2500d;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i10)) / 3.0f) * fSqrt2);
    }
}
