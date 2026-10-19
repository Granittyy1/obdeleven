package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f27130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f27131c;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f27131c = xVar;
        this.f27130b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f27130b;
        v vVarA = materialCalendarGridView.a();
        if (i10 < vVarA.b() || i10 > vVarA.d()) {
            return;
        }
        MaterialCalendar.c cVar = this.f27131c.f27135d;
        long jLongValue = materialCalendarGridView.a().getItem(i10).longValue();
        MaterialCalendar materialCalendar = MaterialCalendar.this;
        if (materialCalendar.f27014e.f27034d.I(jLongValue)) {
            materialCalendar.f27013d.g();
            Iterator it = materialCalendar.f27139b.iterator();
            while (it.hasNext()) {
                ((y) it.next()).a(materialCalendar.f27013d.M());
            }
            materialCalendar.f27019k.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = materialCalendar.j;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
