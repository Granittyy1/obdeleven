package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mBarShadowRectBuffer = new RectF();
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i10) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z10 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i11 = 0; i11 < iMin; i11++) {
                float x10 = ((BarEntry) iBarDataSet.getEntryForIndex(i11)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.top = x10 - barWidth;
                rectF.bottom = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        BarBuffer barBuffer = this.mBarBuffers[i10];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i10);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z11 = iBarDataSet.getColors().size() == 1;
        if (z11) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i12 = 0; i12 < barBuffer.size(); i12 += 4) {
            int i13 = i12 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i13])) {
                return;
            }
            int i14 = i12 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i14])) {
                if (!z11) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i12 / 4));
                }
                float[] fArr = barBuffer.buffer;
                int i15 = i12 + 2;
                canvas.drawRect(fArr[i12], fArr[i14], fArr[i15], fArr[i13], this.mRenderPaint);
                if (z10) {
                    float[] fArr2 = barBuffer.buffer;
                    canvas.drawRect(fArr2[i12], fArr2[i14], fArr2[i15], fArr2[i13], this.mBarBorderPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f10, float f11, int i10) {
        this.mValuePaint.setColor(i10);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        int i10;
        MPPointF mPPointF;
        float[] fArr;
        float f10;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i11 = 0;
            while (i11 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i11);
                if (shouldDrawValues(iBarDataSet)) {
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f11 = 2.0f;
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "10") / 2.0f;
                    ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer = this.mBarBuffers[i11];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.f25204x = Utils.convertDpToPixel(mPPointF2.f25204x);
                    mPPointF2.f25205y = Utils.convertDpToPixel(mPPointF2.f25205y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        i10 = i11;
                        mPPointF = mPPointF2;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i12 = 0;
                        int length = 0;
                        while (i12 < this.mAnimator.getPhaseX() * iBarDataSet.getEntryCount()) {
                            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i12);
                            int valueTextColor = iBarDataSet.getValueTextColor(i12);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i13 = length + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i13])) {
                                    break;
                                }
                                if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[length]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i13])) {
                                    String barLabel = valueFormatter.getBarLabel(barEntry);
                                    float fCalcTextWidth = Utils.calcTextWidth(this.mValuePaint, barLabel);
                                    float f12 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth + fConvertDpToPixel);
                                    fArr = yVals;
                                    float f13 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + fConvertDpToPixel) : fConvertDpToPixel;
                                    if (zIsInverted) {
                                        f12 = (-f12) - fCalcTextWidth;
                                        f13 = (-f13) - fCalcTextWidth;
                                    }
                                    float f14 = f12;
                                    float f15 = f13;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        drawValue(canvas, barLabel, barBuffer.buffer[length + 2] + (barEntry.getY() >= 0.0f ? f14 : f15), barBuffer.buffer[i13] + fCalcTextHeight, valueTextColor);
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon = barEntry.getIcon();
                                        float f16 = barBuffer.buffer[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f14 = f15;
                                        }
                                        Utils.drawImage(canvas, icon, (int) (f16 + f14 + mPPointF.f25204x), (int) (barBuffer.buffer[i13] + mPPointF.f25205y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i12 = i12;
                                fCalcTextHeight = fCalcTextHeight;
                                fArr = yVals;
                                int length2 = fArr.length * 2;
                                float[] fArr2 = new float[length2];
                                float f17 = -barEntry.getNegativeSum();
                                float f18 = 0.0f;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < length2) {
                                    float f19 = fArr[i15];
                                    if (f19 == 0.0f && (f18 == 0.0f || f17 == 0.0f)) {
                                        float f20 = f17;
                                        f17 = f19;
                                        f10 = f20;
                                    } else if (f19 >= 0.0f) {
                                        f18 += f19;
                                        f10 = f17;
                                        f17 = f18;
                                    } else {
                                        f10 = f17 - f19;
                                    }
                                    fArr2[i14] = f17 * phaseY;
                                    i14 += 2;
                                    i15++;
                                    f17 = f10;
                                }
                                transformer.pointValuesToPixel(fArr2);
                                int i16 = 0;
                                while (true) {
                                    if (i16 < length2) {
                                        float f21 = fArr[i16 / 2];
                                        String barStackedLabel = valueFormatter.getBarStackedLabel(f21, barEntry);
                                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mValuePaint, barStackedLabel);
                                        float f22 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth2 + fConvertDpToPixel);
                                        int i17 = length2;
                                        float f23 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + fConvertDpToPixel) : fConvertDpToPixel;
                                        if (zIsInverted) {
                                            f22 = (-f22) - fCalcTextWidth2;
                                            f23 = (-f23) - fCalcTextWidth2;
                                        }
                                        boolean z10 = (f21 == 0.0f && f17 == 0.0f && f18 > 0.0f) || f21 < 0.0f;
                                        float f24 = fArr2[i16];
                                        if (z10) {
                                            f22 = f23;
                                        }
                                        float f25 = f24 + f22;
                                        float[] fArr3 = barBuffer.buffer;
                                        float f26 = (fArr3[length + 1] + fArr3[length + 3]) / 2.0f;
                                        if (!this.mViewPortHandler.isInBoundsTop(f26)) {
                                            break;
                                        }
                                        if (this.mViewPortHandler.isInBoundsX(f25) && this.mViewPortHandler.isInBoundsBottom(f26)) {
                                            if (iBarDataSet.isDrawValuesEnabled()) {
                                                drawValue(canvas, barStackedLabel, f25, f26 + fCalcTextHeight, valueTextColor);
                                            }
                                            if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                                Drawable icon2 = barEntry.getIcon();
                                                Utils.drawImage(canvas, icon2, (int) (f25 + mPPointF.f25204x), (int) (f26 + mPPointF.f25205y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                            }
                                        } else {
                                            i16 = i16;
                                            fArr2 = fArr2;
                                        }
                                        i16 += 2;
                                        length2 = i17;
                                        fArr2 = fArr2;
                                    }
                                }
                                if (fArr == null) {
                                    length += 4;
                                } else {
                                    length = (fArr.length * 4) + length;
                                }
                                i12++;
                                fCalcTextHeight = fCalcTextHeight;
                            }
                            if (fArr == null) {
                                length += 4;
                            } else {
                                length = (fArr.length * 4) + length;
                            }
                            i12++;
                            fCalcTextHeight = fCalcTextHeight;
                        }
                    } else {
                        int i18 = 0;
                        while (i18 < this.mAnimator.getPhaseX() * barBuffer.buffer.length) {
                            float[] fArr4 = barBuffer.buffer;
                            int i19 = i18 + 1;
                            float f27 = fArr4[i19];
                            float f28 = (fArr4[i18 + 3] + f27) / f11;
                            if (!this.mViewPortHandler.isInBoundsTop(f27)) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i18]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i19])) {
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i18 / 4);
                                float y10 = barEntry2.getY();
                                String barLabel2 = valueFormatter.getBarLabel(barEntry2);
                                float fCalcTextWidth3 = Utils.calcTextWidth(this.mValuePaint, barLabel2);
                                float f29 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                float f30 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel;
                                if (zIsInverted) {
                                    f29 = (-f29) - fCalcTextWidth3;
                                    f30 = (-f30) - fCalcTextWidth3;
                                }
                                float f31 = f29;
                                float f32 = f30;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, barLabel2, barBuffer.buffer[i18 + 2] + (y10 >= 0.0f ? f31 : f32), f28 + fCalcTextHeight, iBarDataSet.getValueTextColor(i18 / 2));
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry2.getIcon();
                                    float f33 = barBuffer.buffer[i18 + 2];
                                    if (y10 < 0.0f) {
                                        f31 = f32;
                                    }
                                    Utils.drawImage(canvas, icon3, (int) (f33 + f31 + mPPointF2.f25204x), (int) (f28 + mPPointF2.f25205y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i18 = i18;
                                barBuffer = barBuffer;
                                dataSets = dataSets;
                                i11 = i11;
                                mPPointF2 = mPPointF2;
                                valueFormatter = valueFormatter;
                            }
                            i18 += 4;
                            mPPointF2 = mPPointF2;
                            valueFormatter = valueFormatter;
                            barBuffer = barBuffer;
                            dataSets = dataSets;
                            i11 = i11;
                            f11 = 2.0f;
                        }
                        list = dataSets;
                        i10 = i11;
                        mPPointF = mPPointF2;
                    }
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    i10 = i11;
                }
                i11 = i10 + 1;
                dataSets = list;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i10 = 0; i10 < this.mBarBuffers.length; i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            this.mBarBuffers[i10] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < this.mViewPortHandler.getScaleY() * ((float) chartInterface.getMaxVisibleCount());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f11, f10 - f13, f12, f10 + f13);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
