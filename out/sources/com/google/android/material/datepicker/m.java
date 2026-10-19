package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27070b;

    public m(MaterialCalendar materialCalendar) {
        this.f27070b = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f27070b;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f27017h;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.f27025c;
        MaterialCalendar.CalendarSelector calendarSelector3 = MaterialCalendar.CalendarSelector.f27024b;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.q(calendarSelector3);
        } else if (calendarSelector == calendarSelector3) {
            materialCalendar.q(calendarSelector2);
        }
    }
}
