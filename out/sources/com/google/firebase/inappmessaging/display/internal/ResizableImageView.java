package com.google.firebase.inappmessaging.display.internal;

import H3.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public class ResizableImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28175b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28177b;

        public a(int i10, int i11) {
            this.f28176a = i10;
            this.f28177b = i11;
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28175b = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    public final a c(int i10, int i11) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i10 > maxWidth) {
            c.j();
            i11 = (i11 * maxWidth) / i10;
            i10 = maxWidth;
        }
        if (i11 > maxHeight) {
            c.j();
            i10 = (i10 * maxHeight) / i11;
        } else {
            maxHeight = i11;
        }
        return new a(i10, maxHeight);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        c.j();
        a aVarC = c((int) Math.ceil((intrinsicWidth * this.f28175b) / 160), (int) Math.ceil((intrinsicHeight * this.f28175b) / 160));
        c.j();
        setMeasuredDimension(aVarC.f28176a, aVarC.f28177b);
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = iMax;
        float f11 = iMax2;
        c.j();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        c.j();
        float f14 = measuredWidth < iMax ? f10 / f12 : 1.0f;
        float f15 = measuredHeight < iMax2 ? f11 / f13 : 1.0f;
        if (f14 <= f15) {
            f14 = f15;
        }
        if (f14 > 1.0d) {
            int iCeil = (int) Math.ceil(f12 * f14);
            int iCeil2 = (int) Math.ceil(f13 * f14);
            c.j();
            a aVarC2 = c(iCeil, iCeil2);
            setMeasuredDimension(aVarC2.f28176a, aVarC2.f28177b);
        }
    }
}
