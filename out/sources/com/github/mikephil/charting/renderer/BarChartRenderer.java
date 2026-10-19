package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: loaded from: classes.dex */
public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect;
    private RectF mBarShadowRectBuffer;
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new RectF();
        this.mBarShadowRectBuffer = new RectF();
        this.mChart = barDataProvider;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(R.styleable.AppCompatTheme_windowFixedHeightMajor);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i10 = 0; i10 < barData.getDataSetCount(); i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                rectF.left = x10 - barWidth;
                rectF.right = x10 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
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
            int i13 = i12 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i13])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i12])) {
                    return;
                }
                if (!z11) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i12 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    GradientColor gradientColor = iBarDataSet.getGradientColor();
                    Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    float f10 = fArr[i12];
                    paint.setShader(new LinearGradient(f10, fArr[i12 + 3], f10, fArr[i12 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f11 = fArr2[i12];
                    float f12 = fArr2[i12 + 3];
                    float f13 = fArr2[i12 + 1];
                    int i14 = i12 / 4;
                    paint2.setShader(new LinearGradient(f11, f12, f11, f13, iBarDataSet.getGradientColor(i14).getStartColor(), iBarDataSet.getGradientColor(i14).getEndColor(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = barBuffer.buffer;
                int i15 = i12 + 1;
                int i16 = i12 + 3;
                canvas.drawRect(fArr3[i12], fArr3[i15], fArr3[i13], fArr3[i16], this.mRenderPaint);
                if (z10) {
                    float[] fArr4 = barBuffer.buffer;
                    canvas.drawRect(fArr4[i12], fArr4[i15], fArr4[i13], fArr4[i16], this.mBarBorderPaint);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y10;
        float f10;
        float f11;
        float f12;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() < 0 || !barEntry.isStacked()) {
                        y10 = barEntry.getY();
                        f10 = 0.0f;
                    } else {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            y10 = barEntry.getPositiveSum();
                            f10 = -barEntry.getNegativeSum();
                        } else {
                            Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            f12 = range.from;
                            f11 = range.to;
                        }
                        prepareBarHighlight(barEntry.getX(), f12, f11, barData.getBarWidth() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    }
                    f11 = f10;
                    f12 = y10;
                    prepareBarHighlight(barEntry.getX(), f12, f11, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f10, float f11, int i10) {
        this.mValuePaint.setColor(i10);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List list;
        MPPointF mPPointF;
        float[] fArr;
        BarEntry barEntry;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i10 = 0;
            while (i10 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i10);
                if (shouldDrawValues(iBarDataSet)) {
                    applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
                    float f15 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f16 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f15 = (-f15) - fCalcTextHeight;
                        f16 = (-f16) - fCalcTextHeight;
                    }
                    float f17 = f15;
                    float f18 = f16;
                    BarBuffer barBuffer = this.mBarBuffers[i10];
                    float phaseY = this.mAnimator.getPhaseY();
                    ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    MPPointF mPPointF2 = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.f25204x = Utils.convertDpToPixel(mPPointF2.f25204x);
                    mPPointF2.f25205y = Utils.convertDpToPixel(mPPointF2.f25205y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        mPPointF = mPPointF2;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i11 = 0;
                        int length = 0;
                        while (i11 < this.mAnimator.getPhaseX() * iBarDataSet.getEntryCount()) {
                            BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i11);
                            float[] yVals = barEntry2.getYVals();
                            float[] fArr2 = barBuffer.buffer;
                            float f19 = (fArr2[length] + fArr2[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i11);
                            if (yVals != null) {
                                BarEntry barEntry3 = barEntry2;
                                i11 = i11;
                                fConvertDpToPixel = fConvertDpToPixel;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                fArr = yVals;
                                transformer = transformer;
                                float f20 = f19;
                                int length2 = fArr.length * 2;
                                float[] fArr3 = new float[length2];
                                float f21 = -barEntry3.getNegativeSum();
                                float f22 = 0.0f;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < length2) {
                                    float f23 = fArr[i13];
                                    if (f23 == 0.0f && (f22 == 0.0f || f21 == 0.0f)) {
                                        float f24 = f21;
                                        f21 = f23;
                                        f11 = f24;
                                    } else if (f23 >= 0.0f) {
                                        f22 += f23;
                                        f11 = f21;
                                        f21 = f22;
                                    } else {
                                        f11 = f21 - f23;
                                    }
                                    fArr3[i12 + 1] = f21 * phaseY;
                                    i12 += 2;
                                    i13++;
                                    f21 = f11;
                                }
                                transformer.pointValuesToPixel(fArr3);
                                int i14 = 0;
                                while (i14 < length2) {
                                    float f25 = fArr[i14 / 2];
                                    float f26 = fArr3[i14 + 1] + (((f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) == 0 && (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1)) == 0 && (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1)) > 0) || (f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1)) < 0 ? f18 : f17);
                                    int i15 = i14;
                                    if (!this.mViewPortHandler.isInBoundsRight(f20)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f26) && this.mViewPortHandler.isInBoundsLeft(f20)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            BarEntry barEntry4 = barEntry3;
                                            f10 = f26;
                                            barEntry = barEntry4;
                                            drawValue(canvas, valueFormatter.getBarStackedLabel(f25, barEntry4), f20, f10, valueTextColor);
                                        } else {
                                            f10 = f26;
                                            barEntry = barEntry3;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon = barEntry.getIcon();
                                            Utils.drawImage(canvas, icon, (int) (f20 + mPPointF.f25204x), (int) (f10 + mPPointF.f25205y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                        }
                                    } else {
                                        length2 = length2;
                                        f20 = f20;
                                        i15 = i15;
                                        barEntry = barEntry3;
                                        fArr3 = fArr3;
                                    }
                                    i14 = i15 + 2;
                                    fArr3 = fArr3;
                                    barEntry3 = barEntry;
                                    length2 = length2;
                                    f20 = f20;
                                }
                            } else {
                                if (!this.mViewPortHandler.isInBoundsRight(f19)) {
                                    break;
                                }
                                fArr = yVals;
                                int i16 = length + 1;
                                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i16]) && this.mViewPortHandler.isInBoundsLeft(f19)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f12 = f19;
                                        drawValue(canvas, valueFormatter.getBarLabel(barEntry2), f12, barBuffer.buffer[i16] + (barEntry2.getY() >= 0.0f ? f17 : f18), valueTextColor);
                                    } else {
                                        f12 = f19;
                                    }
                                    if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon2 = barEntry2.getIcon();
                                        Utils.drawImage(canvas, icon2, (int) (mPPointF.f25204x + f12), (int) (barBuffer.buffer[i16] + (barEntry2.getY() >= 0.0f ? f17 : f18) + mPPointF.f25205y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                    }
                                } else {
                                    transformer = transformer;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    fConvertDpToPixel = fConvertDpToPixel;
                                    i11 = i11;
                                }
                            }
                            length = fArr == null ? length + 4 : (fArr.length * 4) + length;
                            i11++;
                            transformer = transformer;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            fConvertDpToPixel = fConvertDpToPixel;
                        }
                    } else {
                        int i17 = 0;
                        while (i17 < this.mAnimator.getPhaseX() * barBuffer.buffer.length) {
                            float[] fArr4 = barBuffer.buffer;
                            float f27 = (fArr4[i17] + fArr4[i17 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f27)) {
                                break;
                            }
                            int i18 = i17 + 1;
                            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i18]) && this.mViewPortHandler.isInBoundsLeft(f27)) {
                                int i19 = i17 / 4;
                                BarEntry barEntry5 = (BarEntry) iBarDataSet.getEntryForIndex(i19);
                                float y10 = barEntry5.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    f14 = f27;
                                    drawValue(canvas, valueFormatter.getBarLabel(barEntry5), f14, y10 >= 0.0f ? barBuffer.buffer[i18] + f17 : barBuffer.buffer[i17 + 3] + f18, iBarDataSet.getValueTextColor(i19));
                                } else {
                                    f14 = f27;
                                }
                                if (barEntry5.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon3 = barEntry5.getIcon();
                                    Utils.drawImage(canvas, icon3, (int) (f14 + mPPointF2.f25204x), (int) ((y10 >= 0.0f ? barBuffer.buffer[i18] + f17 : barBuffer.buffer[i17 + 3] + f18) + mPPointF2.f25205y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i17 = i17;
                                valueFormatter = valueFormatter;
                                dataSets = dataSets;
                                mPPointF2 = mPPointF2;
                            }
                            i17 += 4;
                            mPPointF2 = mPPointF2;
                            valueFormatter = valueFormatter;
                            dataSets = dataSets;
                        }
                        list = dataSets;
                        mPPointF = mPPointF2;
                    }
                    f13 = fConvertDpToPixel;
                    z10 = zIsDrawValueAboveBarEnabled;
                    MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f13 = fConvertDpToPixel;
                    z10 = zIsDrawValueAboveBarEnabled;
                }
                i10++;
                zIsDrawValueAboveBarEnabled = z10;
                dataSets = list;
                fConvertDpToPixel = f13;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i10 = 0; i10 < this.mBarBuffers.length; i10++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i10);
            this.mBarBuffers[i10] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public void prepareBarHighlight(float f10, float f11, float f12, float f13, Transformer transformer) {
        this.mBarRect.set(f10 - f13, f11, f10 + f13, f12);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }
}
