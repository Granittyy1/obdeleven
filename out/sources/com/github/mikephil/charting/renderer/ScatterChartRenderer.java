package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    protected ScatterDataProvider mChart;
    float[] mPixelBuffer;

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mPixelBuffer = new float[2];
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        for (T t8 : this.mChart.getScatterData().getDataSets()) {
            if (t8.isVisible()) {
                drawDataSet(canvas, t8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        if (iScatterDataSet.getEntryCount() < 1) {
            return;
        }
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
        if (shapeRenderer == null) {
            return;
        }
        int iMin = (int) Math.min(Math.ceil(this.mAnimator.getPhaseX() * iScatterDataSet.getEntryCount()), iScatterDataSet.getEntryCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i10);
            this.mPixelBuffer[0] = entryForIndex.getX();
            this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.mPixelBuffer);
            if (!viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                return;
            }
            if (viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) && viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                this.mRenderPaint.setColor(iScatterDataSet.getColor(i10 / 2));
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float[] fArr = this.mPixelBuffer;
                shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        ScatterData scatterData = this.mChart.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), this.mAnimator.getPhaseY() * entryForXValue.getY());
                    highlight.setDraw((float) pixelForValues.f25202x, (float) pixelForValues.f25203y);
                    drawHighlightLines(canvas, (float) pixelForValues.f25202x, (float) pixelForValues.f25203y, iScatterDataSet);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(Canvas canvas, String str, float f10, float f11, int i10) {
        this.mValuePaint.setColor(i10);
        canvas.drawText(str, f10, f11, this.mValuePaint);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i10 = 0; i10 < this.mChart.getScatterData().getDataSetCount(); i10++) {
                IScatterDataSet iScatterDataSet = (IScatterDataSet) dataSets.get(i10);
                if (shouldDrawValues(iScatterDataSet) && iScatterDataSet.getEntryCount() >= 1) {
                    applyValueTextStyle(iScatterDataSet);
                    this.mXBounds.set(this.mChart, iScatterDataSet);
                    Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] fArrGenerateTransformedValuesScatter = transformer.generateTransformedValuesScatter(iScatterDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    ValueFormatter valueFormatter = iScatterDataSet.getValueFormatter();
                    MPPointF mPPointF = MPPointF.getInstance(iScatterDataSet.getIconsOffset());
                    mPPointF.f25204x = Utils.convertDpToPixel(mPPointF.f25204x);
                    mPPointF.f25205y = Utils.convertDpToPixel(mPPointF.f25205y);
                    int i11 = 0;
                    while (i11 < fArrGenerateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesScatter[i11])) {
                        if (this.mViewPortHandler.isInBoundsLeft(fArrGenerateTransformedValuesScatter[i11])) {
                            int i12 = i11 + 1;
                            if (this.mViewPortHandler.isInBoundsY(fArrGenerateTransformedValuesScatter[i12])) {
                                int i13 = i11 / 2;
                                Entry entryForIndex = iScatterDataSet.getEntryForIndex(this.mXBounds.min + i13);
                                if (iScatterDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), fArrGenerateTransformedValuesScatter[i11], fArrGenerateTransformedValuesScatter[i12] - fConvertDpToPixel, iScatterDataSet.getValueTextColor(i13 + this.mXBounds.min));
                                }
                                if (entryForIndex.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entryForIndex.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (fArrGenerateTransformedValuesScatter[i11] + mPPointF.f25204x), (int) (fArrGenerateTransformedValuesScatter[i12] + mPPointF.f25205y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                iScatterDataSet = iScatterDataSet;
                            }
                        } else {
                            iScatterDataSet = iScatterDataSet;
                        }
                        i11 += 2;
                        iScatterDataSet = iScatterDataSet;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }
}
