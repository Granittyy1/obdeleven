package io.intercom.android.sdk.helpcenter.utils.views;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: GrayscaleImageView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GrayscaleImageView extends AppCompatImageView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrayscaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        i.e(attributeSet, "attributeSet");
    }

    public final void setGrayscale(int i10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1 - (i10 / 100));
        setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
