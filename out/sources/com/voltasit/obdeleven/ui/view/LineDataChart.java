package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p220r9.C2786s;

/* JADX INFO: loaded from: classes3.dex */
public class LineDataChart extends LineChart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f34182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34183c;

    public class a extends MarkerView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f34184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f34185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f34186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MPPointF f34187e;

        public a(Context context) {
            super(context, R.layout.chart_marker);
            this.f34184b = 0L;
            this.f34186d = context;
            this.f34185c = (TextView) findViewById(R.id.x_value);
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public final MPPointF getOffset() {
            float x10 = this.f34187e.getX();
            Context context = this.f34186d;
            int width = getWidth() + C2786s.a(context.getResources(), 5.0f);
            return new MPPointF(((float) LineDataChart.this.getWidth()) - x10 > ((float) width) ? C2786s.a(context.getResources(), 5.0f) : -width, (-getHeight()) - C2786s.a(context.getResources(), 5.0f));
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public final MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
            this.f34187e = new MPPointF(f10, f11);
            return super.getOffsetForDrawingAtPoint(f10, f11);
        }

        @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
        public final void refreshContent(Entry entry, Highlight highlight) {
            int x10 = (int) entry.getX();
            LineDataChart lineDataChart = LineDataChart.this;
            if (lineDataChart.f34182b.isEmpty() || x10 >= lineDataChart.f34182b.size()) {
                return;
            }
            if (this.f34184b == 0) {
                this.f34184b = Long.parseLong((String) lineDataChart.f34182b.get(0));
            }
            long j = Long.parseLong((String) lineDataChart.f34182b.get(x10)) - this.f34184b;
            int i10 = (int) (j % 1000);
            long j10 = j / 1000;
            this.f34185c.setText(String.format(Locale.US, "%02d:%02d:%03d", Integer.valueOf((int) (j10 / 60)), Integer.valueOf((int) (j10 % 60)), Integer.valueOf(i10)));
            super.refreshContent(entry, highlight);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LineDataSet f34189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34190b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34191c = false;

        public b(String str, int i10) {
            LineDataSet lineDataSet = new LineDataSet(new ArrayList(), str);
            this.f34189a = lineDataSet;
            lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
            lineDataSet.setColor(i10);
            lineDataSet.setLineWidth(3.0f);
            lineDataSet.setCircleRadius(1.5f);
            lineDataSet.setCircleColor(i10);
            lineDataSet.setCircleHoleColor(i10);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawVerticalHighlightIndicator(true);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighlightLineWidth(3.0f);
            lineDataSet.setHighLightColor(-6710887);
        }
    }

    public class c extends ValueFormatter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f34192a = 0;

        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter, com.github.mikephil.charting.formatter.IAxisValueFormatter
        public final String getFormattedValue(float f10, AxisBase axisBase) {
            LineDataChart lineDataChart = LineDataChart.this;
            if (lineDataChart.f34182b.isEmpty()) {
                return "";
            }
            int i10 = (int) f10;
            if (i10 >= lineDataChart.f34182b.size()) {
                p279w9.b bVar = Application.f29634b;
                P8.c.a(5, "LineDataChart", "x value size doesn't match chart data set size", Arrays.copyOf(new Object[0], 0));
                return "";
            }
            if (this.f34192a == 0) {
                this.f34192a = Long.parseLong((String) lineDataChart.f34182b.get(0));
            }
            long j = Long.parseLong((String) lineDataChart.f34182b.get(i10)) - this.f34192a;
            int i11 = (int) (j % 1000);
            long j10 = j / 1000;
            return String.format(Locale.US, "%02d:%02d:%03d   ", Integer.valueOf((int) (j10 / 60)), Integer.valueOf((int) (j10 % 60)), Integer.valueOf(i11));
        }
    }

    public LineDataChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34182b = new ArrayList();
        this.f34183c = new ArrayList();
        setup(context);
    }

    private void setup(Context context) {
        setBackground(getResources().getDrawable(R.drawable.chart_background));
        setGridBackgroundColor(-1644826);
        setDrawGridBackground(true);
        setDrawBorders(false);
        setMaxVisibleValueCount(100);
        setDragEnabled(true);
        setPinchZoom(true);
        setDoubleTapToZoomEnabled(false);
        getLegend().setEnabled(false);
        Description description = new Description();
        description.setText("");
        setDescription(description);
        setHardwareAccelerationEnabled(true);
        setMarker(new a(context));
        XAxis xAxis = getXAxis();
        xAxis.setTypeface(C1787c0.j());
        xAxis.setTextColor(-10395295);
        xAxis.setDrawLabels(true);
        xAxis.setEnabled(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setValueFormatter(new c());
        YAxis axisLeft = getAxisLeft();
        axisLeft.setTypeface(C1787c0.j());
        axisLeft.setTextColor(-10395295);
        axisLeft.setDrawLabels(true);
        axisLeft.setAxisMinimum(0.0f);
        axisLeft.setAxisMaximum(100.0f);
        axisLeft.setLabelCount(5, true);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(true);
        axisLeft.setGridLineWidth(3.0f);
        axisLeft.setGridColor(getResources().getColor(android.R.color.white));
        axisLeft.setDrawZeroLine(false);
        getAxisRight().setEnabled(false);
        LineData lineData = new LineData();
        lineData.setDrawValues(true);
        lineData.setHighlightEnabled(true);
        setData(lineData);
    }

    public final void a(b bVar) {
        if (bVar.f34190b) {
            return;
        }
        LineDataSet lineDataSet = bVar.f34189a;
        if (lineDataSet.getEntryCount() == 0) {
            return;
        }
        bVar.f34190b = true;
        getLineData().addDataSet(lineDataSet);
        getAxisLeft().resetAxisMaximum();
        getAxisLeft().resetAxisMinimum();
    }

    public final void b() {
        clear();
        getXValues().clear();
        for (b bVar : this.f34183c) {
            bVar.f34190b = false;
            bVar.f34189a.clear();
        }
        setup(getContext());
    }

    public final void c() {
        if (getLineData() == null) {
            LineData lineData = new LineData();
            lineData.setDrawValues(true);
            lineData.setHighlightEnabled(true);
            setData(lineData);
        }
        boolean z10 = false;
        for (b bVar : this.f34183c) {
            a(bVar);
            if (bVar.f34191c) {
                z10 = true;
            }
        }
        getLineData().notifyDataChanged();
        notifyDataSetChanged();
        setVisibleXRangeMaximum(100.0f);
        if (z10) {
            ArrayList arrayList = this.f34182b;
            if (arrayList.size() >= 100) {
                moveViewToX(arrayList.size() - 100);
            }
        }
        invalidate();
    }

    public List<b> getDataSets() {
        return this.f34183c;
    }

    public List<String> getXValues() {
        return this.f34182b;
    }
}
