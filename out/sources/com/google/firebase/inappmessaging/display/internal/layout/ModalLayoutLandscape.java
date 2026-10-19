package com.google.firebase.inappmessaging.display.internal.layout;

import H3.c;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.voltasit.obdeleven.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p008a7.a;
import p020b7.b;

/* JADX INFO: loaded from: classes3.dex */
public class ModalLayoutLandscape extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f28189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f28190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f28191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28192i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28195m;

    public ModalLayoutLandscape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i16 = this.f28194l;
        int i17 = this.f28195m;
        if (i16 < i17) {
            i15 = (i17 - i16) / 2;
            i14 = 0;
        } else {
            i14 = (i16 - i17) / 2;
            i15 = 0;
        }
        c.j();
        int i18 = i15 + paddingTop;
        int iE = a.e(this.f28189f) + paddingLeft;
        a.f(this.f28189f, paddingLeft, i18, iE, a.d(this.f28189f) + i18);
        int i19 = iE + this.j;
        c.j();
        int i20 = paddingTop + i14;
        int iD = a.d(this.f28190g) + i20;
        a.f(this.f28190g, i19, i20, measuredWidth, iD);
        c.j();
        int i21 = iD + (this.f28190g.getVisibility() == 8 ? 0 : this.f28193k);
        int iD2 = a.d(this.f28191h) + i21;
        a.f(this.f28191h, i19, i21, measuredWidth, iD2);
        c.j();
        int i22 = iD2 + (this.f28191h.getVisibility() != 8 ? this.f28193k : 0);
        View view = this.f28192i;
        a.f(view, i19, i22, a.e(view) + i19, a.d(view) + i22);
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28189f = c(R.id.image_view);
        this.f28190g = c(R.id.message_title);
        this.f28191h = c(R.id.body_scroll);
        this.f28192i = c(R.id.button);
        int iMax = 0;
        this.j = this.f28189f.getVisibility() == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24, this.f8063d));
        this.f28193k = (int) Math.floor(TypedValue.applyDimension(1, 24, this.f8063d));
        List listAsList = Arrays.asList(this.f28190g, this.f28191h, this.f28192i);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i10);
        int iA = a(i11) - paddingTop;
        int i12 = iB - paddingRight;
        c.j();
        b.b(this.f28189f, (int) (i12 * 0.4f), iA);
        int iE = a.e(this.f28189f);
        int i13 = i12 - (this.j + iE);
        c.j();
        Iterator it = listAsList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i14++;
            }
        }
        int iMax2 = Math.max(0, (i14 - 1) * this.f28193k);
        int i15 = iA - iMax2;
        c.j();
        b.b(this.f28190g, i13, i15);
        c.j();
        b.b(this.f28192i, i13, i15);
        c.j();
        b.b(this.f28191h, i13, (i15 - a.d(this.f28190g)) - a.d(this.f28192i));
        this.f28194l = a.d(this.f28189f);
        this.f28195m = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.f28195m = a.d((View) it2.next()) + this.f28195m;
        }
        int iMax3 = Math.max(this.f28194l + paddingTop, this.f28195m + paddingTop);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(a.e((View) it3.next()), iMax);
        }
        c.j();
        int i16 = iE + iMax + this.j + paddingRight;
        c.j();
        setMeasuredDimension(i16, iMax3);
    }
}
