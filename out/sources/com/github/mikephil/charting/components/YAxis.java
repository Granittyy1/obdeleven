package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public class YAxis extends AxisBase {
    private AxisDependency mAxisDependency;
    private boolean mDrawBottomYLabelEntry;
    private boolean mDrawTopYLabelEntry;
    protected boolean mDrawZeroLine;
    protected boolean mInverted;
    protected float mMaxWidth;
    protected float mMinWidth;
    private YAxisLabelPosition mPosition;
    protected float mSpacePercentBottom;
    protected float mSpacePercentTop;
    private boolean mUseAutoScaleRestrictionMax;
    private boolean mUseAutoScaleRestrictionMin;
    protected int mZeroLineColor;
    protected float mZeroLineWidth;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.mDrawBottomYLabelEntry = true;
        this.mDrawTopYLabelEntry = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.mUseAutoScaleRestrictionMin = false;
        this.mUseAutoScaleRestrictionMax = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = AxisDependency.LEFT;
        this.mYOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void calculate(float f10, float f11) {
        float spaceBottom;
        float spaceTop;
        if (Math.abs(f11 - f10) == 0.0f) {
            f11 += 1.0f;
            f10 -= 1.0f;
        }
        float fAbs = Math.abs(f11 - f10);
        if (this.mCustomAxisMin) {
            spaceBottom = this.mAxisMinimum;
        } else {
            spaceBottom = f10 - (getSpaceBottom() * (fAbs / 100.0f));
        }
        this.mAxisMinimum = spaceBottom;
        if (this.mCustomAxisMax) {
            spaceTop = this.mAxisMaximum;
        } else {
            spaceTop = (getSpaceTop() * (fAbs / 100.0f)) + f11;
        }
        this.mAxisMaximum = spaceTop;
        this.mAxisRange = Math.abs(this.mAxisMinimum - spaceTop);
    }

    public AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    public YAxisLabelPosition getLabelPosition() {
        return this.mPosition;
    }

    public float getMaxWidth() {
        return this.mMaxWidth;
    }

    public float getMinWidth() {
        return this.mMinWidth;
    }

    public float getRequiredHeightSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        return (getYOffset() * 2.0f) + Utils.calcTextHeight(paint, getLongestLabel());
    }

    public float getRequiredWidthSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        float xOffset = (getXOffset() * 2.0f) + Utils.calcTextWidth(paint, getLongestLabel());
        float minWidth = getMinWidth();
        float maxWidth = getMaxWidth();
        if (minWidth > 0.0f) {
            minWidth = Utils.convertDpToPixel(minWidth);
        }
        if (maxWidth > 0.0f && maxWidth != Float.POSITIVE_INFINITY) {
            maxWidth = Utils.convertDpToPixel(maxWidth);
        }
        if (maxWidth <= 0.0d) {
            maxWidth = xOffset;
        }
        return Math.max(minWidth, Math.min(xOffset, maxWidth));
    }

    public float getSpaceBottom() {
        return this.mSpacePercentBottom;
    }

    public float getSpaceTop() {
        return this.mSpacePercentTop;
    }

    public int getZeroLineColor() {
        return this.mZeroLineColor;
    }

    public float getZeroLineWidth() {
        return this.mZeroLineWidth;
    }

    public boolean isDrawBottomYLabelEntryEnabled() {
        return this.mDrawBottomYLabelEntry;
    }

    public boolean isDrawTopYLabelEntryEnabled() {
        return this.mDrawTopYLabelEntry;
    }

    public boolean isDrawZeroLineEnabled() {
        return this.mDrawZeroLine;
    }

    public boolean isInverted() {
        return this.mInverted;
    }

    @Deprecated
    public boolean isUseAutoScaleMaxRestriction() {
        return this.mUseAutoScaleRestrictionMax;
    }

    @Deprecated
    public boolean isUseAutoScaleMinRestriction() {
        return this.mUseAutoScaleRestrictionMin;
    }

    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public void setDrawTopYLabelEntry(boolean z10) {
        this.mDrawTopYLabelEntry = z10;
    }

    public void setDrawZeroLine(boolean z10) {
        this.mDrawZeroLine = z10;
    }

    public void setInverted(boolean z10) {
        this.mInverted = z10;
    }

    public void setMaxWidth(float f10) {
        this.mMaxWidth = f10;
    }

    public void setMinWidth(float f10) {
        this.mMinWidth = f10;
    }

    public void setPosition(YAxisLabelPosition yAxisLabelPosition) {
        this.mPosition = yAxisLabelPosition;
    }

    public void setSpaceBottom(float f10) {
        this.mSpacePercentBottom = f10;
    }

    public void setSpaceTop(float f10) {
        this.mSpacePercentTop = f10;
    }

    @Deprecated
    public void setStartAtZero(boolean z10) {
        if (z10) {
            setAxisMinimum(0.0f);
        } else {
            resetAxisMinimum();
        }
    }

    @Deprecated
    public void setUseAutoScaleMaxRestriction(boolean z10) {
        this.mUseAutoScaleRestrictionMax = z10;
    }

    @Deprecated
    public void setUseAutoScaleMinRestriction(boolean z10) {
        this.mUseAutoScaleRestrictionMin = z10;
    }

    public void setZeroLineColor(int i10) {
        this.mZeroLineColor = i10;
    }

    public void setZeroLineWidth(float f10) {
        this.mZeroLineWidth = Utils.convertDpToPixel(f10);
    }

    public YAxis(AxisDependency axisDependency) {
        this.mDrawBottomYLabelEntry = true;
        this.mDrawTopYLabelEntry = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.mUseAutoScaleRestrictionMin = false;
        this.mUseAutoScaleRestrictionMax = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = axisDependency;
        this.mYOffset = 0.0f;
    }
}
