package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f27057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27059d;

    public g() {
        Calendar calendarE = D.e(null);
        this.f27057b = calendarE;
        this.f27058c = calendarE.getMaximum(7);
        this.f27059d = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27058c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f27058c;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f27059d;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f27059d;
        int i12 = this.f27058c;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f27057b;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i10) {
        Calendar calendarE = D.e(null);
        this.f27057b = calendarE;
        this.f27058c = calendarE.getMaximum(7);
        this.f27059d = i10;
    }
}
