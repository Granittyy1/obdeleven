package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.O;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f27030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27031c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f27030b = D.e(null);
        if (q.y(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.voltasit.obdeleven.R.id.cancel_button);
            setNextFocusRightId(com.voltasit.obdeleven.R.id.confirm_button);
        }
        this.f27031c = q.y(getContext(), com.voltasit.obdeleven.R.attr.nestedScrollable);
        O.n(this, new o());
    }

    public final v a() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((v) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v vVar = (v) super.getAdapter();
        InterfaceC2030d<?> interfaceC2030d = vVar.f27125c;
        int iMax = Math.max(vVar.b(), getFirstVisiblePosition());
        int iMin = Math.min(vVar.d(), getLastVisiblePosition());
        vVar.getItem(iMax);
        vVar.getItem(iMin);
        Iterator<A0.b<Long, Long>> it = interfaceC2030d.s().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((v) super.getAdapter()).d());
        } else if (i10 == 130) {
            setSelection(((v) super.getAdapter()).b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((v) super.getAdapter()).b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((v) super.getAdapter()).b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f27031c) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < ((v) super.getAdapter()).b()) {
            super.setSelection(((v) super.getAdapter()).b());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (v) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof v)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
