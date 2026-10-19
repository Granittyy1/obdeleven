package com.google.firebase.inappmessaging.display.internal.layout;

import H3.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.voltasit.obdeleven.R;
import p008a7.a;
import p020b7.b;

/* JADX INFO: loaded from: classes3.dex */
public class CardLayoutPortrait extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f28182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f28183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f28184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28185i;

    public CardLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i14 = 0; i14 < size; i14++) {
            View view = getVisibleChildren().get(i14);
            int measuredHeight2 = view.getMeasuredHeight();
            c.j();
            c.j();
            c.j();
            view.layout(0, measuredHeight, view.getMeasuredWidth(), measuredHeight2 + measuredHeight);
            view.getMeasuredWidth();
            view.getMeasuredHeight();
            c.j();
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28182f = c(R.id.image_view);
        this.f28183g = c(R.id.message_title);
        this.f28184h = c(R.id.body_scroll);
        this.f28185i = c(R.id.action_bar);
        int iB = b(i10);
        int iA = a(i11);
        int iRound = Math.round(((int) (0.8d * ((double) iA))) / 4) * 4;
        c.j();
        b.a(this.f28182f, iB, iA, 1073741824, Integer.MIN_VALUE);
        if (a.d(this.f28182f) > iRound) {
            c.j();
            b.a(this.f28182f, iB, iRound, Integer.MIN_VALUE, 1073741824);
        }
        int iE = a.e(this.f28182f);
        c.j();
        b.a(this.f28183g, iE, iA, 1073741824, Integer.MIN_VALUE);
        c.j();
        b.a(this.f28185i, iE, iA, 1073741824, Integer.MIN_VALUE);
        c.j();
        b.a(this.f28184h, iE, ((iA - a.d(this.f28182f)) - a.d(this.f28183g)) - a.d(this.f28185i), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int iD = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iD += a.d(getVisibleChildren().get(i12));
        }
        setMeasuredDimension(iE, iD);
    }
}
