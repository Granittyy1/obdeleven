package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends BaseAdapter {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27122h = D.e(null).getMaximum(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27123i = (D.e(null).getMaximum(7) + D.e(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f27124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2030d<?> f27125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection<Long> f27126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2029c f27127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2027a f27128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC2032f f27129g;

    public v(u uVar, InterfaceC2030d<?> interfaceC2030d, C2027a c2027a, AbstractC2032f abstractC2032f) {
        this.f27124b = uVar;
        this.f27125c = interfaceC2030d;
        this.f27128f = c2027a;
        this.f27129g = abstractC2032f;
        this.f27126d = interfaceC2030d.L();
    }

    public final int b() {
        int firstDayOfWeek = this.f27128f.f27036f;
        u uVar = this.f27124b;
        Calendar calendar = uVar.f27115b;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + uVar.f27118e : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 < b() || i10 > d()) {
            return null;
        }
        int iB = (i10 - b()) + 1;
        Calendar calendarC = D.c(this.f27124b.f27115b);
        calendarC.set(5, iB);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int d() {
        return (b() + this.f27124b.f27119f) - 1;
    }

    public final void e(TextView textView, long j, int i10) {
        C2028b c2028b;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z10 = false;
        boolean z11 = D.d().getTimeInMillis() == j;
        InterfaceC2030d<?> interfaceC2030d = this.f27125c;
        Iterator<A0.b<Long, Long>> it = interfaceC2030d.s().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        Iterator<A0.b<Long, Long>> it2 = interfaceC2030d.s().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw null;
        }
        Calendar calendarD = D.d();
        Calendar calendarE = D.e(null);
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? D.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : D.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z11) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        textView.setContentDescription(str);
        if (this.f27128f.f27034d.I(j)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC2030d.L().iterator();
            while (it3.hasNext()) {
                if (D.a(j) == D.a(it3.next().longValue())) {
                    z10 = true;
                    break;
                }
            }
            textView.setSelected(z10);
            if (z10) {
                c2028b = this.f27127e.f27049b;
            } else {
                c2028b = D.d().getTimeInMillis() == j ? this.f27127e.f27050c : this.f27127e.f27048a;
            }
        } else {
            textView.setEnabled(false);
            c2028b = this.f27127e.f27054g;
        }
        if (this.f27129g == null || i10 == -1) {
            c2028b.b(textView);
            return;
        }
        int i11 = this.f27124b.f27117d;
        c2028b.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j) {
        u uVarB = u.b(j);
        u uVar = this.f27124b;
        if (uVarB.equals(uVar)) {
            Calendar calendarC = D.c(uVar.f27115b);
            calendarC.setTimeInMillis(j);
            int i10 = calendarC.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f27123i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f27124b.f27118e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        Context context = viewGroup.getContext();
        if (this.f27127e == null) {
            this.f27127e = new C2029c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            u uVar = this.f27124b;
            if (iB >= uVar.f27119f) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(uVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i11 = -1;
        }
        Long item = getItem(i10);
        if (item != null) {
            e(textView, item.longValue(), i11);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
