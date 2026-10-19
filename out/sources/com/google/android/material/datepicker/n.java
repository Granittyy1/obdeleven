package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f27071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27072c;

    public n(MaterialCalendar materialCalendar, x xVar) {
        this.f27072c = materialCalendar;
        this.f27071b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f27072c;
        int iQ0 = ((LinearLayoutManager) materialCalendar.f27019k.getLayoutManager()).Q0() + 1;
        if (iQ0 < materialCalendar.f27019k.getAdapter().getItemCount()) {
            Calendar calendarC = D.c(this.f27071b.f27132a.f27032b.f27115b);
            calendarC.add(2, iQ0);
            materialCalendar.p(new u(calendarC));
        }
    }
}
