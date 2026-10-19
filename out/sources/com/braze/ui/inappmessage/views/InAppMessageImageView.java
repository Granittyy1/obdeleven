package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InAppMessageImageView.kt */
/* JADX INFO: loaded from: classes.dex */
public class InAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private float aspectRatio;
    private Path clipPath;
    private float[] inAppRadii;
    private RectF rectf;
    private boolean setToHalfParentHeight;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPath = new Path();
        this.rectf = new RectF();
        this.aspectRatio = -1.0f;
        setAdjustViewBounds(true);
    }

    public final boolean clipCanvasToPath(Canvas canvas, int i10, int i11) {
        i.e(canvas, "canvas");
        if (this.inAppRadii == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath.2
                @Override // Ia.a
                public final String invoke() {
                    return "In-app message radii is uninitialized, not clipping path.";
                }
            }, 3, (Object) null);
            return false;
        }
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, i10, i11);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath.3
                @Override // Ia.a
                public final String invoke() {
                    return "Encountered exception while trying to clip in-app message image";
                }
            });
            return false;
        }
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        i.m("inAppRadii");
        throw null;
    }

    public final RectF getRectf() {
        return this.rectf;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.aspectRatio != -1.0f && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.aspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.setToHalfParentHeight) {
            Object parent = getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.View");
            setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) parent).getHeight()) * 0.5d));
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setAspectRatio(float f10) {
        this.aspectRatio = f10;
        requestLayout();
    }

    public final void setClipPath(Path path) {
        i.e(path, "<set-?>");
        this.clipPath = path;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiiPx(float f10, float f11, float f12, float f13) {
        this.inAppRadii = new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiusPx(float f10) {
        setCornersRadiiPx(f10, f10, f10, f10);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(RectF rectF) {
        i.e(rectF, "<set-?>");
        this.rectf = rectF;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setToHalfParentHeight(boolean z10) {
        this.setToHalfParentHeight = z10;
        requestLayout();
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }
}
