package com.github.mikephil.charting.renderer;

import Z3.n;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        Paint paint2 = this.mHolePaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mTransparentCirclePaint = paint3;
        paint3.setColor(-1);
        this.mTransparentCirclePaint.setStyle(style);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        Paint paint4 = this.mValuePaint;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.mEntryLabelsPaint = paint5;
        paint5.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(align);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint6 = new Paint(1);
        this.mValueLinePaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f10, float f11, float f12, float f13, float f14, float f15) {
        double d10 = (f14 + f15) * 0.017453292f;
        float fCos = (((float) Math.cos(d10)) * f10) + mPPointF.f25204x;
        float fSin = (((float) Math.sin(d10)) * f10) + mPPointF.f25205y;
        double d11 = ((f15 / 2.0f) + f14) * 0.017453292f;
        float fCos2 = (((float) Math.cos(d11)) * f10) + mPPointF.f25204x;
        return (float) (((double) (f10 - ((float) (Math.tan(((180.0d - ((double) f11)) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(fSin - f13, 2.0d) + Math.pow(fCos - f12, 2.0d)) / 2.0d))))) - Math.sqrt(Math.pow(((((float) Math.sin(d11)) * f10) + mPPointF.f25205y) - ((fSin + f13) / 2.0f), 2.0d) + Math.pow(fCos2 - ((fCos + f12) / 2.0f), 2.0d)));
    }

    public void drawCenterText(Canvas canvas) {
        float radius;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f10 = centerCircleBox.f25204x + centerTextOffset.f25204x;
        float f11 = centerCircleBox.f25205y + centerTextOffset.f25205y;
        if (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius();
        } else {
            radius = (this.mChart.getHoleRadius() / 100.0f) * this.mChart.getRadius();
        }
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        rectF.left = f10 - radius;
        rectF.top = f11 - radius;
        rectF.right = f10 + radius;
        rectF.bottom = f11 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, ((rectF2.height() - height) / 2.0f) + rectF2.top);
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        MPPointF.recycleInstance(centerCircleBox);
        MPPointF.recycleInstance(centerTextOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f10;
        RectF rectF;
        float f11;
        boolean z10;
        float fMax;
        MPPointF mPPointF;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z11 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z11 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF2 = new RectF();
        boolean z12 = z11 && this.mChart.isDrawRoundedSlicesEnabled();
        int i10 = 0;
        for (int i11 = 0; i11 < entryCount; i11++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i11).getY()) > Utils.FLOAT_EPSILON) {
                i10++;
            }
        }
        float sliceSpace = i10 <= 1 ? 0.0f : getSliceSpace(iPieDataSet2);
        int i12 = 0;
        float f12 = 0.0f;
        while (i12 < entryCount) {
            float f13 = drawAngles[i12];
            float fAbs = Math.abs(iPieDataSet2.getEntryForIndex(i12).getY());
            float f14 = Utils.FLOAT_EPSILON;
            if (fAbs > f14 && (!this.mChart.needsHighlight(i12) || z12)) {
                boolean z13 = sliceSpace > 0.0f && f13 <= 180.0f;
                this.mRenderPaint.setColor(iPieDataSet2.getColor(i12));
                float f15 = i10 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f16 = (((f15 / 2.0f) + f12) * phaseY) + rotationAngle;
                float f17 = (f13 - f15) * phaseY;
                float f18 = f17 < 0.0f ? 0.0f : f17;
                this.mPathBuffer.reset();
                if (z12) {
                    float f19 = radius - holeRadius2;
                    double d10 = f16 * 0.017453292f;
                    float fCos = (((float) Math.cos(d10)) * f19) + centerCircleBox.f25204x;
                    float fSin = (f19 * ((float) Math.sin(d10))) + centerCircleBox.f25205y;
                    rectF2.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                }
                double d11 = f16 * 0.017453292f;
                f10 = holeRadius;
                float fCos2 = (((float) Math.cos(d11)) * radius) + centerCircleBox.f25204x;
                float fSin2 = (((float) Math.sin(d11)) * radius) + centerCircleBox.f25205y;
                if (f18 < 360.0f || f18 % 360.0f > f14) {
                    if (z12) {
                        this.mPathBuffer.arcTo(rectF2, f16 + 180.0f, -180.0f);
                    }
                    this.mPathBuffer.arcTo(circleBox, f16, f18);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, radius, Path.Direction.CW);
                }
                RectF rectF3 = this.mInnerRectBuffer;
                float f20 = centerCircleBox.f25204x;
                float f21 = centerCircleBox.f25205y;
                rectF = rectF2;
                rectF3.set(f20 - f10, f21 - f10, f20 + f10, f21 + f10);
                if (z11) {
                    if (f10 > 0.0f || z13) {
                        if (z13) {
                            f10 = f10;
                            z10 = true;
                            float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f13 * phaseY, fCos2, fSin2, f16, f18);
                            if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                            }
                            fMax = Math.max(f10, fCalculateMinimumRadiusForSpacedSlice);
                        } else {
                            f10 = f10;
                            z10 = true;
                            fMax = f10;
                        }
                        float f22 = (i10 == z10 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                        float f23 = (((f22 / 2.0f) + f12) * phaseY) + rotationAngle;
                        float f24 = (f13 - f22) * phaseY;
                        if (f24 < 0.0f) {
                            f24 = 0.0f;
                        }
                        float f25 = f23 + f24;
                        if (f18 < 360.0f || f18 % 360.0f > f14) {
                            if (z12) {
                                float f26 = radius - holeRadius2;
                                double d12 = 0.017453292f * f25;
                                mPPointF = centerCircleBox;
                                float fCos3 = (((float) Math.cos(d12)) * f26) + centerCircleBox.f25204x;
                                float fSin3 = (f26 * ((float) Math.sin(d12))) + mPPointF.f25205y;
                                rectF = rectF;
                                rectF.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                this.mPathBuffer.arcTo(rectF, f25, 180.0f);
                            } else {
                                mPPointF = centerCircleBox;
                                rectF = rectF;
                                double d13 = f25 * 0.017453292f;
                                this.mPathBuffer.lineTo((((float) Math.cos(d13)) * fMax) + mPPointF.f25204x, (fMax * ((float) Math.sin(d13))) + mPPointF.f25205y);
                            }
                            this.mPathBuffer.arcTo(this.mInnerRectBuffer, f25, -f24);
                        } else {
                            this.mPathBuffer.addCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, fMax, Path.Direction.CCW);
                            mPPointF = centerCircleBox;
                            rectF = rectF;
                        }
                        centerCircleBox = mPPointF;
                    } else {
                        f11 = 360.0f;
                    }
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                    f12 = (f13 * phaseX) + f12;
                } else {
                    f11 = 360.0f;
                }
                if (f18 % f11 > f14) {
                    if (z13) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f13 * phaseY, fCos2, fSin2, f16, f18);
                        double d14 = 0.017453292f * ((f18 / 2.0f) + f16);
                        this.mPathBuffer.lineTo((((float) Math.cos(d14)) * fCalculateMinimumRadiusForSpacedSlice2) + centerCircleBox.f25204x, (fCalculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d14))) + centerCircleBox.f25205y);
                    } else {
                        this.mPathBuffer.lineTo(centerCircleBox.f25204x, centerCircleBox.f25205y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                f12 = (f13 * phaseX) + f12;
            } else {
                i12 = i12;
                radius = radius;
                rotationAngle = rotationAngle;
                phaseX = phaseX;
                circleBox = circleBox;
                drawAngles = drawAngles;
                f12 = (f13 * phaseX) + f12;
                i10 = i10;
                rectF = rectF2;
                f10 = holeRadius;
                centerCircleBox = centerCircleBox;
            }
            i12++;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f10;
            rectF2 = rectF;
            centerCircleBox = centerCircleBox;
            i10 = i10;
            radius = radius;
            entryCount = entryCount;
            circleBox = circleBox;
            rotationAngle = rotationAngle;
            phaseX = phaseX;
            drawAngles = drawAngles;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    public void drawEntryLabel(Canvas canvas, String str, float f10, float f11) {
        canvas.drawText(str, f10, f11, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        IPieDataSet dataSetByIndex;
        float f10;
        int i10;
        MPPointF mPPointF;
        float fCalculateMinimumRadiusForSpacedSlice;
        float f11;
        float f12;
        float fMax;
        boolean z10 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z10 && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z10 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF = this.mDrawHighlightedRectF;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i11 = 0;
        while (i11 < highlightArr.length) {
            int x10 = (int) highlightArr[i11].getX();
            if (x10 < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i11].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i12 = 0;
                for (int i13 = 0; i13 < entryCount; i13++) {
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i13).getY()) > Utils.FLOAT_EPSILON) {
                        i12++;
                    }
                }
                if (x10 == 0) {
                    i10 = 1;
                    f10 = 0.0f;
                } else {
                    f10 = absoluteAngles[x10 - 1] * phaseX;
                    i10 = 1;
                }
                float sliceSpace = i12 <= i10 ? 0.0f : dataSetByIndex.getSliceSpace();
                float f13 = drawAngles[x10];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f14 = radius + selectionShift;
                rectF.set(this.mChart.getCircleBox());
                float f15 = -selectionShift;
                rectF.inset(f15, f15);
                boolean z11 = sliceSpace > 0.0f && f13 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x10));
                float f16 = i12 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f17 = i12 == 1 ? 0.0f : sliceSpace / (f14 * 0.017453292f);
                float f18 = (((f16 / 2.0f) + f10) * phaseY) + rotationAngle;
                float f19 = (f13 - f16) * phaseY;
                float f20 = f19 < 0.0f ? 0.0f : f19;
                float f21 = (((f17 / 2.0f) + f10) * phaseY) + rotationAngle;
                float f22 = (f13 - f17) * phaseY;
                if (f22 < 0.0f) {
                    f22 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f20 < 360.0f || f20 % 360.0f > Utils.FLOAT_EPSILON) {
                    double d10 = f21 * 0.017453292f;
                    this.mPathBuffer.moveTo((((float) Math.cos(d10)) * f14) + centerCircleBox.f25204x, (f14 * ((float) Math.sin(d10))) + centerCircleBox.f25205y);
                    this.mPathBuffer.arcTo(rectF, f21, f22);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, f14, Path.Direction.CW);
                }
                if (z11) {
                    double d11 = f18 * 0.017453292f;
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f13 * phaseY, (((float) Math.cos(d11)) * radius) + centerCircleBox.f25204x, (((float) Math.sin(d11)) * radius) + centerCircleBox.f25205y, f18, f20);
                } else {
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                RectF rectF2 = this.mInnerRectBuffer;
                float f23 = mPPointF.f25204x;
                float f24 = mPPointF.f25205y;
                rectF2.set(f23 - r22, f24 - r22, f23 + r22, f24 + r22);
                if (z10 == 0 || (r22 <= 0.0f && !z11)) {
                    f11 = phaseX;
                    f12 = phaseY;
                    if (f20 % 360.0f > Utils.FLOAT_EPSILON) {
                        if (z11) {
                            double d12 = ((f20 / 2.0f) + f18) * 0.017453292f;
                            this.mPathBuffer.lineTo((((float) Math.cos(d12)) * fCalculateMinimumRadiusForSpacedSlice) + mPPointF.f25204x, (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d12))) + mPPointF.f25205y);
                        } else {
                            this.mPathBuffer.lineTo(mPPointF.f25204x, mPPointF.f25205y);
                        }
                    }
                } else {
                    if (z11) {
                        if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(r22, fCalculateMinimumRadiusForSpacedSlice);
                    } else {
                        fMax = r22;
                    }
                    float f25 = (i12 == 1 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f26 = (((f25 / 2.0f) + f10) * phaseY) + rotationAngle;
                    float f27 = (f13 - f25) * phaseY;
                    if (f27 < 0.0f) {
                        f27 = 0.0f;
                    }
                    float f28 = f26 + f27;
                    if (f20 < 360.0f || f20 % 360.0f > Utils.FLOAT_EPSILON) {
                        double d13 = f28 * 0.017453292f;
                        f11 = phaseX;
                        f12 = phaseY;
                        this.mPathBuffer.lineTo((((float) Math.cos(d13)) * fMax) + mPPointF.f25204x, (fMax * ((float) Math.sin(d13))) + mPPointF.f25205y);
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f28, -f27);
                    } else {
                        this.mPathBuffer.addCircle(mPPointF.f25204x, mPPointF.f25205y, fMax, Path.Direction.CCW);
                        f11 = phaseX;
                        f12 = phaseY;
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                rectF = rectF;
                drawAngles = drawAngles;
                z10 = z10;
                f11 = phaseX;
                f12 = phaseY;
                mPPointF = centerCircleBox;
            }
            i11++;
            phaseX = f11;
            rectF = rectF;
            holeRadius = holeRadius;
            centerCircleBox = mPPointF;
            phaseY = f12;
            drawAngles = drawAngles;
            z10 = z10;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    public void drawHole(Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, holeRadius, this.mHolePaint);
        }
        if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = (this.mChart.getTransparentCircleRadius() / 100.0f) * radius;
            this.mTransparentCirclePaint.setAlpha((int) (this.mAnimator.getPhaseY() * this.mAnimator.getPhaseX() * alpha));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.f25204x, centerCircleBox.f25205y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawRoundedSlices(Canvas canvas) {
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i10 = 0;
                while (i10 < dataSet.getEntryCount()) {
                    float f10 = drawAngles[i10];
                    if (Math.abs(dataSet.getEntryForIndex(i10).getY()) > Utils.FLOAT_EPSILON) {
                        double d10 = radius - holeRadius;
                        double d11 = (rotationAngle + f10) * phaseY;
                        float fCos = (float) (((double) centerCircleBox.f25204x) + (Math.cos(Math.toRadians(d11)) * d10));
                        float fSin = (float) ((Math.sin(Math.toRadians(d11)) * d10) + ((double) centerCircleBox.f25205y));
                        this.mRenderPaint.setColor(dataSet.getColor(i10));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    }
                    rotationAngle = (f10 * phaseX) + rotationAngle;
                    i10++;
                    phaseY = phaseY;
                    drawAngles = drawAngles;
                }
                MPPointF.recycleInstance(centerCircleBox);
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
        float[] fArr;
        float[] fArr2;
        float f10;
        float f11;
        float f12;
        MPPointF mPPointF;
        float f13;
        Canvas canvas2;
        PieDataSet.ValuePosition valuePosition;
        boolean z10;
        float fB;
        MPPointF mPPointF2;
        float f14;
        float f15;
        float f16;
        IPieDataSet iPieDataSet;
        Canvas canvas3;
        String str;
        String str2;
        Canvas canvas4;
        MPPointF mPPointF3;
        Canvas canvas5 = canvas;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f17 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f17 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) ((((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)) + ((double) rotationAngle));
            }
        }
        float f18 = rotationAngle;
        float f19 = radius - f17;
        PieData pieData = (PieData) this.mChart.getData();
        List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i10 = 0;
        int i11 = 0;
        while (i11 < dataSets.size()) {
            IPieDataSet iPieDataSet2 = dataSets.get(i11);
            boolean zIsDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled();
            if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet2.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet2.getYValuePosition();
                applyValueTextStyle(iPieDataSet2);
                int i12 = i10;
                float fConvertDpToPixel2 = Utils.convertDpToPixel(4.0f) + Utils.calcTextHeight(this.mValuePaint, "Q");
                ValueFormatter valueFormatter = iPieDataSet2.getValueFormatter();
                int entryCount = iPieDataSet2.getEntryCount();
                this.mValueLinePaint.setColor(iPieDataSet2.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet2);
                MPPointF mPPointF4 = MPPointF.getInstance(iPieDataSet2.getIconsOffset());
                MPPointF mPPointF5 = centerCircleBox;
                mPPointF4.f25204x = Utils.convertDpToPixel(mPPointF4.f25204x);
                mPPointF4.f25205y = Utils.convertDpToPixel(mPPointF4.f25205y);
                int i13 = 0;
                while (i13 < entryCount) {
                    MPPointF mPPointF6 = mPPointF4;
                    PieEntry entryForIndex = iPieDataSet2.getEntryForIndex(i13);
                    int i14 = entryCount;
                    float f20 = ((((drawAngles[i12] - ((sliceSpace / (f19 * 0.017453292f)) / 2.0f)) / 2.0f) + (i12 == 0 ? 0.0f : absoluteAngles[i12 - 1] * phaseX)) * phaseY) + f18;
                    float f21 = sliceSpace;
                    String pieLabel = valueFormatter.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                    float[] fArr3 = drawAngles;
                    String label = entryForIndex.getLabel();
                    ValueFormatter valueFormatter2 = valueFormatter;
                    PieEntry pieEntry = entryForIndex;
                    double d10 = f20 * 0.017453292f;
                    float[] fArr4 = absoluteAngles;
                    float f22 = phaseX;
                    float fCos = (float) Math.cos(d10);
                    float f23 = phaseY;
                    float fSin = (float) Math.sin(d10);
                    boolean z11 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float f24 = f18;
                    boolean z12 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z13 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z14 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z11 || z12) {
                        float valueLinePart1Length = iPieDataSet2.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet2.getValueLinePart2Length();
                        valuePosition = yValuePosition;
                        float valueLinePart1OffsetPercentage = iPieDataSet2.getValueLinePart1OffsetPercentage() / 100.0f;
                        z10 = z13;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f25 = radius * holeRadius2;
                            fB = n.b(radius, f25, valueLinePart1OffsetPercentage, f25);
                        } else {
                            fB = valueLinePart1OffsetPercentage * radius;
                        }
                        float fAbs = iPieDataSet2.isValueLineVariableLength() ? valueLinePart2Length * f19 * ((float) Math.abs(Math.sin(d10))) : valueLinePart2Length * f19;
                        mPPointF2 = mPPointF5;
                        float f26 = mPPointF2.f25204x;
                        float f27 = (fB * fCos) + f26;
                        f14 = radius;
                        float f28 = mPPointF2.f25205y;
                        float f29 = (fB * fSin) + f28;
                        float f30 = (valueLinePart1Length + 1.0f) * f19;
                        float f31 = (f30 * fCos) + f26;
                        float f32 = f28 + (f30 * fSin);
                        double d11 = ((double) f20) % 360.0d;
                        if (d11 < 90.0d || d11 > 270.0d) {
                            f15 = f31 + fAbs;
                            Paint paint = this.mValuePaint;
                            Paint.Align align = Paint.Align.LEFT;
                            paint.setTextAlign(align);
                            if (z11) {
                                this.mEntryLabelsPaint.setTextAlign(align);
                            }
                            f16 = f15 + fConvertDpToPixel;
                        } else {
                            float f33 = f31 - fAbs;
                            Paint paint2 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.RIGHT;
                            paint2.setTextAlign(align2);
                            if (z11) {
                                this.mEntryLabelsPaint.setTextAlign(align2);
                            }
                            f15 = f33;
                            f16 = f33 - fConvertDpToPixel;
                        }
                        if (iPieDataSet2.getValueLineColor() != 1122867) {
                            if (iPieDataSet2.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet2.getColor(i13));
                            }
                            iPieDataSet = iPieDataSet2;
                            canvas.drawLine(f27, f29, f31, f32, this.mValueLinePaint);
                            canvas.drawLine(f31, f32, f15, f32, this.mValueLinePaint);
                        } else {
                            iPieDataSet = iPieDataSet2;
                        }
                        if (z11 && z12) {
                            drawValue(canvas, pieLabel, f16, f32, iPieDataSet.getValueTextColor(i13));
                            if (i13 >= pieData.getEntryCount() || label == null) {
                                canvas4 = canvas;
                                str2 = label;
                            } else {
                                canvas3 = canvas;
                                str = label;
                                drawEntryLabel(canvas3, str, f16, f32 + fConvertDpToPixel2);
                                str2 = str;
                                canvas4 = canvas3;
                            }
                        } else {
                            canvas3 = canvas;
                            float f34 = f16;
                            str = label;
                            if (z11) {
                                if (i13 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f34, (fConvertDpToPixel2 / 2.0f) + f32);
                                }
                            } else if (z12) {
                                str2 = str;
                                canvas4 = canvas3;
                                drawValue(canvas, pieLabel, f34, f32 + (fConvertDpToPixel2 / 2.0f), iPieDataSet.getValueTextColor(i13));
                            }
                            str2 = str;
                            canvas4 = canvas3;
                        }
                    } else {
                        valuePosition = yValuePosition;
                        z10 = z13;
                        mPPointF2 = mPPointF5;
                        mPPointF6 = mPPointF6;
                        pieEntry = pieEntry;
                        valueFormatter2 = valueFormatter2;
                        str2 = label;
                        f14 = radius;
                        fSin = fSin;
                        canvas4 = canvas;
                        iPieDataSet = iPieDataSet2;
                    }
                    if (z10 || z14) {
                        float f35 = (f19 * fCos) + mPPointF2.f25204x;
                        float f36 = (f19 * fSin) + mPPointF2.f25205y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z10 && z14) {
                            drawValue(canvas, pieLabel, f35, f36, iPieDataSet.getValueTextColor(i13));
                            if (i13 < pieData.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas4, str2, f35, f36 + fConvertDpToPixel2);
                            }
                        } else if (z10) {
                            if (i13 < pieData.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas4, str2, f35, (fConvertDpToPixel2 / 2.0f) + f36);
                            }
                        } else if (z14) {
                            drawValue(canvas, pieLabel, f35, (fConvertDpToPixel2 / 2.0f) + f36, iPieDataSet.getValueTextColor(i13));
                        }
                    }
                    if (pieEntry.getIcon() == null || !iPieDataSet.isDrawIconsEnabled()) {
                        mPPointF3 = mPPointF6;
                    } else {
                        Drawable icon = pieEntry.getIcon();
                        mPPointF3 = mPPointF6;
                        float f37 = mPPointF3.f25205y;
                        Utils.drawImage(canvas, icon, (int) (((f19 + f37) * fCos) + mPPointF2.f25204x), (int) (((f37 + f19) * fSin) + mPPointF2.f25205y + mPPointF3.f25204x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i12++;
                    i13++;
                    mPPointF4 = mPPointF3;
                    iPieDataSet2 = iPieDataSet;
                    radius = f14;
                    entryCount = i14;
                    sliceSpace = f21;
                    absoluteAngles = fArr4;
                    phaseX = f22;
                    phaseY = f23;
                    f18 = f24;
                    xValuePosition = valuePosition2;
                    yValuePosition = valuePosition;
                    valueFormatter = valueFormatter2;
                    mPPointF5 = mPPointF2;
                    drawAngles = fArr3;
                }
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f10 = phaseX;
                f11 = phaseY;
                f12 = f18;
                mPPointF = mPPointF5;
                f13 = radius;
                canvas2 = canvas;
                MPPointF.recycleInstance(mPPointF4);
                i10 = i12;
            } else {
                f13 = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f10 = phaseX;
                f11 = phaseY;
                f12 = f18;
                canvas2 = canvas5;
                mPPointF = centerCircleBox;
            }
            i11++;
            canvas5 = canvas2;
            centerCircleBox = mPPointF;
            dataSets = dataSets;
            radius = f13;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            phaseX = f10;
            phaseY = f11;
            f18 = f12;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getSliceSpace(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }
}
