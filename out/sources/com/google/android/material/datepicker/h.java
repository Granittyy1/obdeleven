package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f27060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27061c;

    public h(MaterialCalendar materialCalendar, x xVar) {
        this.f27061c = materialCalendar;
        this.f27060b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f27061c;
        int iR0 = ((LinearLayoutManager) materialCalendar.f27019k.getLayoutManager()).R0() - 1;
        if (iR0 >= 0) {
            Calendar calendarC = D.c(this.f27060b.f27132a.f27032b.f27115b);
            calendarC.add(2, iR0);
            materialCalendar.p(new u(calendarC));
        }
    }
}
