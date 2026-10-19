package D2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SidePropagation.java */
/* JADX INFO: loaded from: classes.dex */
public final class C extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2475b;

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    @Override // D2.f0
    public final long a(ViewGroup viewGroup, F f10, O o10, O o11) {
        int i10;
        int iCenterX;
        int iCenterY;
        int iAbs;
        Integer num;
        O o12 = o10;
        if (o12 == null && o11 == null) {
            return 0L;
        }
        F.d dVar = f10.f2521z;
        Rect rectA = dVar == null ? null : dVar.a();
        if (o11 != null) {
            int iIntValue = 8;
            if (o12 != null && (num = (Integer) o12.f2553a.get("android:visibilityPropagation:visibility")) != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == 0) {
                i10 = -1;
            } else {
                o12 = o11;
                i10 = 1;
            }
        } else {
            i10 = -1;
        }
        int iB = f0.b(o12, 0);
        int iB2 = f0.b(o12, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectA != null) {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i11 = this.f2475b;
        if (i11 == 8388611) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            if (viewGroup.getLayoutDirection() == 1) {
                i11 = 5;
            } else {
                i11 = 3;
            }
        } else if (i11 == 8388613) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap2 = androidx.core.view.O.f16859a;
            if (viewGroup.getLayoutDirection() == 1) {
                i11 = 3;
            } else {
                i11 = 5;
            }
        }
        if (i11 == 3) {
            iAbs = Math.abs(iCenterY - iB2) + (width - iB);
        } else if (i11 == 5) {
            iAbs = Math.abs(iCenterY - iB2) + (iB - iRound);
        } else if (i11 != 48) {
            iAbs = i11 != 80 ? 0 : Math.abs(iCenterX - iB) + (iB2 - iRound2);
        } else {
            iAbs = Math.abs(iCenterX - iB) + (height - iB2);
        }
        float f11 = iAbs;
        int i12 = this.f2475b;
        float width2 = f11 / ((i12 == 3 || i12 == 5 || i12 == 8388611 || i12 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long j = f10.f2500d;
        if (j < 0) {
            j = 300;
        }
        return Math.round(((j * ((long) i10)) / 3.0f) * width2);
    }
}
