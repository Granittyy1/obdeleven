package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.N;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2027a f27132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2030d<?> f27133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2032f f27134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCalendar.c f27135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27136e;

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f27137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MaterialCalendarGridView f27138c;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f27137b = textView;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            new N(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(textView, Boolean.TRUE);
            this.f27138c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public x(ContextThemeWrapper contextThemeWrapper, InterfaceC2030d interfaceC2030d, C2027a c2027a, AbstractC2032f abstractC2032f, MaterialCalendar.c cVar) {
        u uVar = c2027a.f27032b;
        u uVar2 = c2027a.f27035e;
        if (uVar.f27115b.compareTo(uVar2.f27115b) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (uVar2.f27115b.compareTo(c2027a.f27033c.f27115b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f27136e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * v.f27122h) + (q.y(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f27132a = c2027a;
        this.f27133b = interfaceC2030d;
        this.f27134c = abstractC2032f;
        this.f27135d = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27132a.f27038h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        Calendar calendarC = D.c(this.f27132a.f27032b.f27115b);
        calendarC.add(2, i10);
        calendarC.set(5, 1);
        Calendar calendarC2 = D.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        C2027a c2027a = this.f27132a;
        Calendar calendarC = D.c(c2027a.f27032b.f27115b);
        calendarC.add(2, i10);
        u uVar = new u(calendarC);
        aVar.f27137b.setText(uVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f27138c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !uVar.equals(materialCalendarGridView.a().f27124b)) {
            v vVar = new v(uVar, this.f27133b, c2027a, this.f27134c);
            materialCalendarGridView.setNumColumns(uVar.f27118e);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            v vVarA = materialCalendarGridView.a();
            Iterator<Long> it = vVarA.f27126d.iterator();
            while (it.hasNext()) {
                vVarA.f(materialCalendarGridView, it.next().longValue());
            }
            InterfaceC2030d<?> interfaceC2030d = vVarA.f27125c;
            if (interfaceC2030d != null) {
                Iterator<Long> it2 = interfaceC2030d.L().iterator();
                while (it2.hasNext()) {
                    vVarA.f(materialCalendarGridView, it2.next().longValue());
                }
                vVarA.f27126d = interfaceC2030d.L();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!q.y(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f27136e));
        return new a(linearLayout, true);
    }
}
