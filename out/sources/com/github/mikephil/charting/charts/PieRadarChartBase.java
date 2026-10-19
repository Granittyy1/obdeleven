package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float fConvertDpToPixel;
        float fMin;
        float fMin2;
        float f10;
        float fMin3;
        Legend legend = this.mLegend;
        float requiredBaseOffset4 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
        } else {
            float fMin4 = Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth());
            int i10 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
            if (i10 == 1) {
                if (this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.RIGHT) {
                    fConvertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.CENTER) {
                    fConvertDpToPixel = Utils.convertDpToPixel(13.0f) + fMin4;
                } else {
                    fConvertDpToPixel = Utils.convertDpToPixel(8.0f) + fMin4;
                    Legend legend2 = this.mLegend;
                    float f11 = legend2.mNeededHeight + legend2.mTextHeightMax;
                    MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fConvertDpToPixel) + 15.0f : fConvertDpToPixel - 15.0f;
                    float f12 = f11 + 15.0f;
                    float fDistanceToCenter = distanceToCenter(width, f12);
                    MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f12));
                    float fDistanceToCenter2 = distanceToCenter(position.f25204x, position.f25205y);
                    float fConvertDpToPixel2 = Utils.convertDpToPixel(5.0f);
                    if (f12 < center.f25205y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fDistanceToCenter < fDistanceToCenter2 ? (fDistanceToCenter2 - fDistanceToCenter) + fConvertDpToPixel2 : 0.0f;
                    }
                    MPPointF.recycleInstance(center);
                    MPPointF.recycleInstance(position);
                }
                int i11 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i11 == 1) {
                    fMin = 0.0f;
                    fMin2 = 0.0f;
                    requiredBaseOffset4 = fConvertDpToPixel;
                    fConvertDpToPixel = 0.0f;
                } else if (i11 == 2) {
                    fMin = 0.0f;
                    fMin2 = 0.0f;
                } else if (i11 == 3) {
                    int i12 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            fMin = 0.0f;
                            fConvertDpToPixel = 0.0f;
                        } else {
                            fMin = Math.min(this.mLegend.mNeededHeight, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                            fConvertDpToPixel = 0.0f;
                        }
                        fMin2 = fConvertDpToPixel;
                    } else {
                        fMin2 = Math.min(this.mLegend.mNeededHeight, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                        fMin = 0.0f;
                        fConvertDpToPixel = 0.0f;
                    }
                } else {
                    fMin = 0.0f;
                    fConvertDpToPixel = 0.0f;
                    fMin2 = fConvertDpToPixel;
                }
                float f13 = fMin2;
                f10 = fMin;
                fMin3 = f13;
            } else if (i10 == 2 && (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.BOTTOM)) {
                fMin3 = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                int i13 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                if (i13 == 1) {
                    fConvertDpToPixel = 0.0f;
                    f10 = fConvertDpToPixel;
                } else if (i13 != 2) {
                    fMin3 = 0.0f;
                    fConvertDpToPixel = 0.0f;
                    f10 = fConvertDpToPixel;
                } else {
                    f10 = fMin3;
                    fMin3 = 0.0f;
                    fConvertDpToPixel = 0.0f;
                }
            } else {
                fMin3 = 0.0f;
                fConvertDpToPixel = 0.0f;
                f10 = fConvertDpToPixel;
            }
            requiredBaseOffset4 += getRequiredBaseOffset();
            requiredBaseOffset2 = fConvertDpToPixel + getRequiredBaseOffset();
            requiredBaseOffset = fMin3 + getRequiredBaseOffset();
            requiredBaseOffset3 = f10 + getRequiredBaseOffset();
        }
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel3 = Math.max(fConvertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel3, getExtraLeftOffset() + requiredBaseOffset4), Math.max(fConvertDpToPixel3, getExtraTopOffset() + requiredBaseOffset), Math.max(fConvertDpToPixel3, getExtraRightOffset() + requiredBaseOffset2), Math.max(fConvertDpToPixel3, Math.max(getRequiredBaseOffset(), getExtraBottomOffset() + requiredBaseOffset3)));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f10, float f11) {
        MPPointF centerOffsets = getCenterOffsets();
        float f12 = centerOffsets.f25204x;
        float f13 = f10 > f12 ? f10 - f12 : f12 - f10;
        float f14 = centerOffsets.f25205y;
        float fSqrt = (float) Math.sqrt(Math.pow(f11 > f14 ? f11 - f14 : f14 - f11, 2.0d) + Math.pow(f13, 2.0d));
        MPPointF.recycleInstance(centerOffsets);
        return fSqrt;
    }

    public float getAngleForPoint(float f10, float f11) {
        MPPointF centerOffsets = getCenterOffsets();
        double d10 = f10 - centerOffsets.f25204x;
        double d11 = f11 - centerOffsets.f25205y;
        float degrees = (float) Math.toDegrees(Math.acos(d11 / Math.sqrt((d11 * d11) + (d10 * d10))));
        if (f10 > centerOffsets.f25204x) {
            degrees = 360.0f - degrees;
        }
        float f12 = degrees + 90.0f;
        if (f12 > 360.0f) {
            f12 -= 360.0f;
        }
        MPPointF.recycleInstance(centerOffsets);
        return f12;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left = getExtraLeftOffset() + contentRect.left;
        contentRect.top = getExtraTopOffset() + contentRect.top;
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f10);

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public MPPointF getPosition(MPPointF mPPointF, float f10, float f11) {
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f10, f11, mPPointF2);
        return mPPointF2;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mChartTouchListener = new PieRadarChartTouchListener(this);
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.mTouchEnabled || (chartTouchListener = this.mChartTouchListener) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f10) {
        this.mMinOffset = f10;
    }

    public void setRotationAngle(float f10) {
        this.mRawRotationAngle = f10;
        this.mRotationAngle = Utils.getNormalizedAngle(f10);
    }

    public void setRotationEnabled(boolean z10) {
        this.mRotateEnabled = z10;
    }

    public void spin(int i10, float f10, float f11, Easing.EasingFunction easingFunction) {
        setRotationAngle(f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f10, f11);
        objectAnimatorOfFloat.setDuration(i10);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.PieRadarChartBase.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieRadarChartBase.this.postInvalidate();
            }
        });
        objectAnimatorOfFloat.start();
    }

    public void getPosition(MPPointF mPPointF, float f10, float f11, MPPointF mPPointF2) {
        double d10 = f10;
        double d11 = f11;
        mPPointF2.f25204x = (float) ((Math.cos(Math.toRadians(d11)) * d10) + ((double) mPPointF.f25204x));
        mPPointF2.f25205y = (float) ((Math.sin(Math.toRadians(d11)) * d10) + ((double) mPPointF.f25205y));
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
    }
}
