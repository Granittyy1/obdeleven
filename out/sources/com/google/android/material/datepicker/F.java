package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCalendar<?> f27010a;

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f27011b;

        public a(TextView textView) {
            super(textView);
            this.f27011b = textView;
        }
    }

    public F(MaterialCalendar<?> materialCalendar) {
        this.f27010a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27010a.f27014e.f27037g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        MaterialCalendar<?> materialCalendar = this.f27010a;
        int i11 = materialCalendar.f27014e.f27032b.f27117d + i10;
        aVar.f27011b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = aVar.f27011b;
        Context context = textView.getContext();
        textView.setContentDescription(D.d().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        C2029c c2029c = materialCalendar.f27018i;
        Calendar calendarD = D.d();
        C2028b c2028b = calendarD.get(1) == i11 ? c2029c.f27053f : c2029c.f27051d;
        Iterator<Long> it = materialCalendar.f27013d.L().iterator();
        while (it.hasNext()) {
            calendarD.setTimeInMillis(it.next().longValue());
            if (calendarD.get(1) == i11) {
                c2028b = c2029c.f27052e;
            }
        }
        c2028b.b(textView);
        textView.setOnClickListener(new E(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
