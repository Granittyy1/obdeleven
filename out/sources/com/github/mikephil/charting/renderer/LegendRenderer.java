package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LegendRenderer extends Renderer {
    protected List<LegendEntry> computedEntries;
    protected Paint.FontMetrics legendFontMetrics;
    protected Legend mLegend;
    protected Paint mLegendFormPaint;
    protected Paint mLegendLabelPaint;
    private Path mLineFormPath;

    /* JADX INFO: renamed from: com.github.mikephil.charting.renderer.LegendRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = iArr;
            try {
                iArr[Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr2;
            try {
                iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr4;
            try {
                iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public LegendRenderer(ViewPortHandler viewPortHandler, Legend legend) {
        super(viewPortHandler);
        this.computedEntries = new ArrayList(16);
        this.legendFontMetrics = new Paint.FontMetrics();
        this.mLineFormPath = new Path();
        this.mLegend = legend;
        Paint paint = new Paint(1);
        this.mLegendLabelPaint = paint;
        paint.setTextSize(Utils.convertDpToPixel(9.0f));
        this.mLegendLabelPaint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.mLegendFormPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:37:0x0155  */
    /* JADX WARN: Code duplicated, block: B:40:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x0166  */
    /* JADX WARN: Code duplicated, block: B:46:0x016f  */
    public void computeLegend(ChartData<?> chartData) {
        int i10;
        String label;
        ICandleDataSet iCandleDataSet;
        ChartData<?> chartData2;
        IPieDataSet iPieDataSet;
        int i11;
        ChartData<?> chartData3 = chartData;
        if (!this.mLegend.isLegendCustom()) {
            this.computedEntries.clear();
            int i12 = 0;
            while (i12 < chartData.getDataSetCount()) {
                IDataSet dataSetByIndex = chartData3.getDataSetByIndex(i12);
                List<Integer> colors = dataSetByIndex.getColors();
                int entryCount = dataSetByIndex.getEntryCount();
                if (dataSetByIndex instanceof IBarDataSet) {
                    IBarDataSet iBarDataSet = (IBarDataSet) dataSetByIndex;
                    if (iBarDataSet.isStacked()) {
                        String[] stackLabels = iBarDataSet.getStackLabels();
                        for (int i13 = 0; i13 < colors.size() && i13 < iBarDataSet.getStackSize(); i13++) {
                            this.computedEntries.add(new LegendEntry(stackLabels[i13 % stackLabels.length], dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i13).intValue()));
                        }
                        if (iBarDataSet.getLabel() != null) {
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, ColorTemplate.COLOR_NONE));
                        }
                        chartData2 = chartData3;
                    } else {
                        if (dataSetByIndex instanceof IPieDataSet) {
                            iPieDataSet = (IPieDataSet) dataSetByIndex;
                            for (i11 = 0; i11 < colors.size() && i11 < entryCount; i11++) {
                                this.computedEntries.add(new LegendEntry(iPieDataSet.getEntryForIndex(i11).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i11).intValue()));
                            }
                            if (iPieDataSet.getLabel() != null) {
                                this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, ColorTemplate.COLOR_NONE));
                            }
                        } else if (dataSetByIndex instanceof ICandleDataSet) {
                            iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                            if (iCandleDataSet.getDecreasingColor() != 1122867) {
                                int decreasingColor = iCandleDataSet.getDecreasingColor();
                                int increasingColor = iCandleDataSet.getIncreasingColor();
                                this.computedEntries.add(new LegendEntry(null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), decreasingColor));
                                this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), increasingColor));
                            } else {
                                for (i10 = 0; i10 < colors.size() && i10 < entryCount; i10++) {
                                    if (i10 < colors.size() - 1 || i10 >= entryCount - 1) {
                                        label = chartData.getDataSetByIndex(i12).getLabel();
                                    } else {
                                        label = null;
                                    }
                                    this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i10).intValue()));
                                }
                            }
                        } else {
                            while (i10 < colors.size()) {
                                if (i10 < colors.size() - 1) {
                                    label = chartData.getDataSetByIndex(i12).getLabel();
                                } else {
                                    label = chartData.getDataSetByIndex(i12).getLabel();
                                }
                                this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i10).intValue()));
                            }
                        }
                        chartData2 = chartData;
                    }
                } else {
                    if (dataSetByIndex instanceof IPieDataSet) {
                        iPieDataSet = (IPieDataSet) dataSetByIndex;
                        while (i11 < colors.size()) {
                            this.computedEntries.add(new LegendEntry(iPieDataSet.getEntryForIndex(i11).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i11).intValue()));
                        }
                        if (iPieDataSet.getLabel() != null) {
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, ColorTemplate.COLOR_NONE));
                        }
                    } else if (dataSetByIndex instanceof ICandleDataSet) {
                        iCandleDataSet = (ICandleDataSet) dataSetByIndex;
                        if (iCandleDataSet.getDecreasingColor() != 1122867) {
                            int decreasingColor2 = iCandleDataSet.getDecreasingColor();
                            int increasingColor2 = iCandleDataSet.getIncreasingColor();
                            this.computedEntries.add(new LegendEntry(null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), decreasingColor2));
                            this.computedEntries.add(new LegendEntry(dataSetByIndex.getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), increasingColor2));
                        } else {
                            while (i10 < colors.size()) {
                                if (i10 < colors.size() - 1) {
                                    label = chartData.getDataSetByIndex(i12).getLabel();
                                } else {
                                    label = chartData.getDataSetByIndex(i12).getLabel();
                                }
                                this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i10).intValue()));
                            }
                        }
                    } else {
                        while (i10 < colors.size()) {
                            if (i10 < colors.size() - 1) {
                                label = chartData.getDataSetByIndex(i12).getLabel();
                            } else {
                                label = chartData.getDataSetByIndex(i12).getLabel();
                            }
                            this.computedEntries.add(new LegendEntry(label, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i10).intValue()));
                        }
                    }
                    chartData2 = chartData;
                }
                i12++;
                chartData3 = chartData2;
            }
            if (this.mLegend.getExtraEntries() != null) {
                Collections.addAll(this.computedEntries, this.mLegend.getExtraEntries());
            }
            this.mLegend.setEntries(this.computedEntries);
        }
        Typeface typeface = this.mLegend.getTypeface();
        if (typeface != null) {
            this.mLegendLabelPaint.setTypeface(typeface);
        }
        this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
        this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
        this.mLegend.calculateDimensions(this.mLegendLabelPaint, this.mViewPortHandler);
    }

    public void drawForm(Canvas canvas, float f10, float f11, LegendEntry legendEntry, Legend legend) {
        int i10 = legendEntry.formColor;
        if (i10 == 1122868 || i10 == 1122867 || i10 == 0) {
            return;
        }
        int iSave = canvas.save();
        Legend.LegendForm form = legendEntry.form;
        if (form == Legend.LegendForm.DEFAULT) {
            form = legend.getForm();
        }
        this.mLegendFormPaint.setColor(legendEntry.formColor);
        float fConvertDpToPixel = Utils.convertDpToPixel(Float.isNaN(legendEntry.formSize) ? legend.getFormSize() : legendEntry.formSize);
        float f12 = fConvertDpToPixel / 2.0f;
        int i11 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[form.ordinal()];
        if (i11 == 3 || i11 == 4) {
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10 + f12, f11, f12, this.mLegendFormPaint);
        } else if (i11 == 5) {
            this.mLegendFormPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, f11 - f12, f10 + fConvertDpToPixel, f11 + f12, this.mLegendFormPaint);
        } else if (i11 == 6) {
            float fConvertDpToPixel2 = Utils.convertDpToPixel(Float.isNaN(legendEntry.formLineWidth) ? legend.getFormLineWidth() : legendEntry.formLineWidth);
            DashPathEffect formLineDashEffect = legendEntry.formLineDashEffect;
            if (formLineDashEffect == null) {
                formLineDashEffect = legend.getFormLineDashEffect();
            }
            this.mLegendFormPaint.setStyle(Paint.Style.STROKE);
            this.mLegendFormPaint.setStrokeWidth(fConvertDpToPixel2);
            this.mLegendFormPaint.setPathEffect(formLineDashEffect);
            this.mLineFormPath.reset();
            this.mLineFormPath.moveTo(f10, f11);
            this.mLineFormPath.lineTo(f10 + fConvertDpToPixel, f11);
            canvas.drawPath(this.mLineFormPath, this.mLegendFormPaint);
        }
        canvas.restoreToCount(iSave);
    }

    public void drawLabel(Canvas canvas, float f10, float f11, String str) {
        canvas.drawText(str, f10, f11, this.mLegendLabelPaint);
    }

    public Paint getFormPaint() {
        return this.mLegendFormPaint;
    }

    public Paint getLabelPaint() {
        return this.mLegendLabelPaint;
    }

    public void renderLegend(Canvas canvas) {
        float chartWidth;
        float f10;
        float f11;
        List<Boolean> list;
        List<FSize> list2;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        float fContentTop;
        float f16;
        Legend.LegendDirection legendDirection;
        LegendEntry legendEntry;
        float fCalcTextWidth;
        if (this.mLegend.isEnabled()) {
            Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = Utils.getLineHeight(this.mLegendLabelPaint, this.legendFontMetrics);
            float fConvertDpToPixel = Utils.convertDpToPixel(this.mLegend.getYEntrySpace()) + Utils.getLineSpacing(this.mLegendLabelPaint, this.legendFontMetrics);
            float fCalcTextHeight = lineHeight - (Utils.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            LegendEntry[] entries = this.mLegend.getEntries();
            float fConvertDpToPixel2 = Utils.convertDpToPixel(this.mLegend.getFormToTextSpace());
            float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mLegend.getXEntrySpace());
            Legend.LegendOrientation orientation = this.mLegend.getOrientation();
            Legend.LegendHorizontalAlignment horizontalAlignment = this.mLegend.getHorizontalAlignment();
            Legend.LegendVerticalAlignment verticalAlignment = this.mLegend.getVerticalAlignment();
            Legend.LegendDirection direction = this.mLegend.getDirection();
            float fConvertDpToPixel4 = Utils.convertDpToPixel(this.mLegend.getFormSize());
            float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mLegend.getStackSpace());
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            int i11 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[horizontalAlignment.ordinal()];
            float f17 = fConvertDpToPixel5;
            float f18 = fConvertDpToPixel3;
            if (i11 == 1) {
                lineHeight = lineHeight;
                fConvertDpToPixel = fConvertDpToPixel;
                if (orientation != Legend.LegendOrientation.VERTICAL) {
                    xOffset += this.mViewPortHandler.contentLeft();
                }
                chartWidth = direction == Legend.LegendDirection.RIGHT_TO_LEFT ? xOffset + this.mLegend.mNeededWidth : xOffset;
            } else if (i11 == 2) {
                lineHeight = lineHeight;
                fConvertDpToPixel = fConvertDpToPixel;
                chartWidth = (orientation == Legend.LegendOrientation.VERTICAL ? this.mViewPortHandler.getChartWidth() : this.mViewPortHandler.contentRight()) - xOffset;
                if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    chartWidth -= this.mLegend.mNeededWidth;
                }
            } else if (i11 != 3) {
                lineHeight = lineHeight;
                fConvertDpToPixel = fConvertDpToPixel;
                chartWidth = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation = Legend.LegendOrientation.VERTICAL;
                float chartWidth2 = orientation == legendOrientation ? this.mViewPortHandler.getChartWidth() / 2.0f : this.mViewPortHandler.contentLeft() + (this.mViewPortHandler.contentWidth() / 2.0f);
                Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                chartWidth = chartWidth2 + (direction == legendDirection2 ? xOffset : -xOffset);
                if (orientation == legendOrientation) {
                    chartWidth = (float) (((double) chartWidth) + (direction == legendDirection2 ? (((double) (-this.mLegend.mNeededWidth)) / 2.0d) + ((double) xOffset) : (((double) this.mLegend.mNeededWidth) / 2.0d) - ((double) xOffset)));
                } else {
                    lineHeight = lineHeight;
                }
            }
            int i12 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[orientation.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                int i13 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
                if (i13 == 1) {
                    fContentTop = (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.mViewPortHandler.contentTop()) + yOffset;
                } else if (i13 == 2) {
                    fContentTop = (horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER ? this.mViewPortHandler.getChartHeight() : this.mViewPortHandler.contentBottom()) - (this.mLegend.mNeededHeight + yOffset);
                } else if (i13 != 3) {
                    fContentTop = 0.0f;
                } else {
                    float chartHeight = this.mViewPortHandler.getChartHeight() / 2.0f;
                    Legend legend = this.mLegend;
                    fContentTop = legend.getYOffset() + (chartHeight - (legend.mNeededHeight / 2.0f));
                }
                float f19 = fContentTop;
                float f20 = 0.0f;
                boolean z10 = false;
                int i14 = 0;
                while (i14 < entries.length) {
                    LegendEntry legendEntry2 = entries[i14];
                    boolean z11 = legendEntry2.form != Legend.LegendForm.NONE;
                    float fConvertDpToPixel6 = Float.isNaN(legendEntry2.formSize) ? fConvertDpToPixel4 : Utils.convertDpToPixel(legendEntry2.formSize);
                    if (z11) {
                        Legend.LegendDirection legendDirection3 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        fCalcTextWidth = direction == legendDirection3 ? chartWidth + f20 : chartWidth - (fConvertDpToPixel6 - f20);
                        f16 = chartWidth;
                        legendDirection = direction;
                        drawForm(canvas, fCalcTextWidth, f19 + fCalcTextHeight, legendEntry2, this.mLegend);
                        if (legendDirection == legendDirection3) {
                            fCalcTextWidth += fConvertDpToPixel6;
                        }
                        legendEntry = legendEntry2;
                    } else {
                        f16 = chartWidth;
                        legendDirection = direction;
                        legendEntry = legendEntry2;
                        fCalcTextWidth = f16;
                    }
                    String str = legendEntry.label;
                    if (str != null) {
                        if (z11 && !z10) {
                            fCalcTextWidth += legendDirection == Legend.LegendDirection.LEFT_TO_RIGHT ? fConvertDpToPixel2 : -fConvertDpToPixel2;
                        } else if (z10) {
                            fCalcTextWidth = f16;
                        }
                        if (legendDirection == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            fCalcTextWidth -= Utils.calcTextWidth(this.mLegendLabelPaint, str);
                        }
                        float f21 = fCalcTextWidth;
                        if (z10) {
                            f19 += lineHeight + fConvertDpToPixel;
                            drawLabel(canvas, f21, f19 + lineHeight, legendEntry.label);
                        } else {
                            drawLabel(canvas, f21, f19 + lineHeight, legendEntry.label);
                        }
                        f19 = lineHeight + fConvertDpToPixel + f19;
                        f20 = 0.0f;
                    } else {
                        f20 = fConvertDpToPixel6 + f17 + f20;
                        z10 = true;
                    }
                    i14++;
                    direction = legendDirection;
                    f17 = f17;
                    fCalcTextHeight = fCalcTextHeight;
                    chartWidth = f16;
                }
                return;
            }
            float f22 = chartWidth;
            float f23 = f17;
            List<FSize> calculatedLineSizes = this.mLegend.getCalculatedLineSizes();
            List<FSize> calculatedLabelSizes = this.mLegend.getCalculatedLabelSizes();
            List<Boolean> calculatedLabelBreakPoints = this.mLegend.getCalculatedLabelBreakPoints();
            int i15 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[verticalAlignment.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    yOffset = i15 != 3 ? 0.0f : yOffset + ((this.mViewPortHandler.getChartHeight() - this.mLegend.mNeededHeight) / 2.0f);
                } else {
                    yOffset = (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
                }
            }
            int length = entries.length;
            float f24 = f22;
            int i16 = 0;
            int i17 = 0;
            while (i16 < length) {
                float f25 = f23;
                LegendEntry legendEntry3 = entries[i16];
                float f26 = f24;
                int i18 = length;
                boolean z12 = legendEntry3.form != Legend.LegendForm.NONE;
                float fConvertDpToPixel7 = Float.isNaN(legendEntry3.formSize) ? fConvertDpToPixel4 : Utils.convertDpToPixel(legendEntry3.formSize);
                if (i16 >= calculatedLabelBreakPoints.size() || !calculatedLabelBreakPoints.get(i16).booleanValue()) {
                    f10 = f26;
                    f11 = yOffset;
                } else {
                    f11 = lineHeight + fConvertDpToPixel + yOffset;
                    f10 = f22;
                }
                if (f10 == f22 && horizontalAlignment == Legend.LegendHorizontalAlignment.CENTER && i17 < calculatedLineSizes.size()) {
                    f10 += (direction == Legend.LegendDirection.RIGHT_TO_LEFT ? calculatedLineSizes.get(i17).width : -calculatedLineSizes.get(i17).width) / 2.0f;
                    i17++;
                }
                int i19 = i17;
                boolean z13 = legendEntry3.label == null;
                if (z12) {
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f10 -= fConvertDpToPixel7;
                    }
                    float f27 = f10;
                    list2 = calculatedLineSizes;
                    i10 = i16;
                    list = calculatedLabelBreakPoints;
                    drawForm(canvas, f27, f11 + fCalcTextHeight, legendEntry3, this.mLegend);
                    f10 = direction == Legend.LegendDirection.LEFT_TO_RIGHT ? f27 + fConvertDpToPixel7 : f27;
                } else {
                    list = calculatedLabelBreakPoints;
                    list2 = calculatedLineSizes;
                    i10 = i16;
                }
                if (z13) {
                    f12 = f18;
                    if (direction == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f13 = f25;
                        f14 = -f13;
                    } else {
                        f13 = f25;
                        f14 = f13;
                    }
                    f24 = f10 + f14;
                } else {
                    if (z12) {
                        f10 += direction == Legend.LegendDirection.RIGHT_TO_LEFT ? -fConvertDpToPixel2 : fConvertDpToPixel2;
                    }
                    Legend.LegendDirection legendDirection4 = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (direction == legendDirection4) {
                        f10 -= calculatedLabelSizes.get(i10).width;
                    }
                    drawLabel(canvas, f10, f11 + lineHeight, legendEntry3.label);
                    if (direction == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f10 += calculatedLabelSizes.get(i10).width;
                    }
                    if (direction == legendDirection4) {
                        f12 = f18;
                        f15 = -f12;
                    } else {
                        f12 = f18;
                        f15 = f12;
                    }
                    f24 = f10 + f15;
                    f13 = f25;
                }
                f18 = f12;
                f23 = f13;
                i16 = i10 + 1;
                yOffset = f11;
                length = i18;
                i17 = i19;
                calculatedLineSizes = list2;
                calculatedLabelBreakPoints = list;
            }
        }
    }
}
