package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f27009c;

    public E(F f10, int i10) {
        this.f27009c = f10;
        this.f27008b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        F f10 = this.f27009c;
        u uVarA = u.a(this.f27008b, f10.f27010a.f27016g.f27116c);
        MaterialCalendar<?> materialCalendar = f10.f27010a;
        C2027a c2027a = materialCalendar.f27014e;
        u uVar = c2027a.f27032b;
        Calendar calendar = uVar.f27115b;
        Calendar calendar2 = uVarA.f27115b;
        if (calendar2.compareTo(calendar) < 0) {
            uVarA = uVar;
        } else {
            u uVar2 = c2027a.f27033c;
            if (calendar2.compareTo(uVar2.f27115b) > 0) {
                uVarA = uVar2;
            }
        }
        materialCalendar.p(uVarA);
        materialCalendar.q(MaterialCalendar.CalendarSelector.f27024b);
    }
}
