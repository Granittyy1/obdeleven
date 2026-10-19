package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f27067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f27068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27069c;

    public l(MaterialCalendar materialCalendar, x xVar, MaterialButton materialButton) {
        this.f27069c = materialCalendar;
        this.f27067a = xVar;
        this.f27068b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f27068b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(int i10, int i11, RecyclerView recyclerView) {
        MaterialCalendar materialCalendar = this.f27069c;
        int iQ0 = i10 < 0 ? ((LinearLayoutManager) materialCalendar.f27019k.getLayoutManager()).Q0() : ((LinearLayoutManager) materialCalendar.f27019k.getLayoutManager()).R0();
        C2027a c2027a = this.f27067a.f27132a;
        Calendar calendarC = D.c(c2027a.f27032b.f27115b);
        calendarC.add(2, iQ0);
        materialCalendar.f27016g = new u(calendarC);
        Calendar calendarC2 = D.c(c2027a.f27032b.f27115b);
        calendarC2.add(2, iQ0);
        calendarC2.set(5, 1);
        Calendar calendarC3 = D.c(calendarC2);
        calendarC3.get(2);
        calendarC3.get(1);
        calendarC3.getMaximum(7);
        calendarC3.getActualMaximum(5);
        calendarC3.getTimeInMillis();
        this.f27068b.setText(D.b("yMMMM", Locale.getDefault()).format(new Date(calendarC3.getTimeInMillis())));
    }
}
