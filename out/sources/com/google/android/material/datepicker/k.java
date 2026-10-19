package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends RecyclerView.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f27064a = D.e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f27065b = D.e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f27066c;

    public k(MaterialCalendar materialCalendar) {
        this.f27066c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if ((recyclerView.getAdapter() instanceof F) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<A0.b<Long, Long>> it = this.f27066c.f27013d.s().iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw null;
            }
        }
    }
}
