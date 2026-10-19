package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size != 0 || size2 != 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size == 0 || size2 == 0) ? Math.max(size, size2) : Math.min(size, size2), 1073741824);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        } else {
            super.onMeasure(i10, i11);
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        }
    }
}
