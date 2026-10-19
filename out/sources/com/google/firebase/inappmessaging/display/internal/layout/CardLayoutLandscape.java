package com.google.firebase.inappmessaging.display.internal.layout;

import H3.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.voltasit.obdeleven.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p008a7.a;
import p020b7.b;

/* JADX INFO: loaded from: classes3.dex */
public class CardLayoutLandscape extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f28178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f28179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f28180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28181i;

    public CardLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        c.j();
        int iE = a.e(this.f28178f);
        a.f(this.f28178f, 0, 0, iE, a.d(this.f28178f));
        c.j();
        int iD = a.d(this.f28179g);
        a.f(this.f28179g, iE, 0, measuredWidth, iD);
        c.j();
        a.f(this.f28180h, iE, iD, measuredWidth, a.d(this.f28180h) + iD);
        c.j();
        a.f(this.f28181i, iE, measuredHeight - a.d(this.f28181i), measuredWidth, measuredHeight);
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28178f = c(R.id.image_view);
        this.f28179g = c(R.id.message_title);
        this.f28180h = c(R.id.body_scroll);
        View viewC = c(R.id.action_bar);
        this.f28181i = viewC;
        List listAsList = Arrays.asList(this.f28179g, this.f28180h, viewC);
        int iB = b(i10);
        int iA = a(i11);
        int iRound = Math.round(((int) (0.6d * ((double) iB))) / 4) * 4;
        c.j();
        b.a(this.f28178f, iB, iA, Integer.MIN_VALUE, 1073741824);
        if (a.e(this.f28178f) > iRound) {
            c.j();
            b.a(this.f28178f, iRound, iA, 1073741824, Integer.MIN_VALUE);
        }
        int iD = a.d(this.f28178f);
        int iE = a.e(this.f28178f);
        int i12 = iB - iE;
        c.j();
        c.j();
        b.b(this.f28179g, i12, iD);
        c.j();
        b.b(this.f28181i, i12, iD);
        c.j();
        b.a(this.f28180h, i12, (iD - a.d(this.f28179g)) - a.d(this.f28181i), Integer.MIN_VALUE, 1073741824);
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(a.e((View) it.next()), iMax);
        }
        c.j();
        c.j();
        setMeasuredDimension(iE + iMax, iD);
    }
}
