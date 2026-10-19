package com.google.firebase.inappmessaging.display.internal.layout;

import H3.c;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import p008a7.a;
import p020b7.b;
import p020b7.d;
import p020b7.e;

/* JADX INFO: loaded from: classes3.dex */
public class ModalLayoutPortrait extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f28196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28197g;

    public ModalLayoutPortrait(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d dVar = new d();
        dVar.f20611a = new ArrayList();
        dVar.f20612b = 0;
        this.f28196f = dVar;
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = getVisibleChildren().get(i16);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i17 = measuredHeight + paddingTop;
            if ((layoutParams.gravity & 1) == 1) {
                int i18 = (i12 - i10) / 2;
                int i19 = measuredWidth / 2;
                i15 = i18 - i19;
                i14 = i18 + i19;
            } else {
                i14 = paddingLeft + measuredWidth;
                i15 = paddingLeft;
            }
            c.j();
            c.j();
            c.j();
            view.layout(i15, paddingTop, i14, i17);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i16 < size - 1) {
                measuredHeight2 += this.f28197g;
            }
            paddingTop = measuredHeight2;
        }
    }

    @Override // p008a7.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        super.onMeasure(i10, i11);
        this.f28197g = (int) Math.floor(TypedValue.applyDimension(1, 24, this.f8063d));
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iB = b(i10);
        int iA = a(i11);
        int size = ((getVisibleChildren().size() - 1) * this.f28197g) + paddingTop;
        d dVar = this.f28196f;
        dVar.getClass();
        dVar.f20612b = iA;
        dVar.f20611a = new ArrayList();
        int iA2 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            boolean z10 = childAt.getId() == R.id.body_scroll || childAt.getId() == R.id.image_view;
            e eVar = new e();
            eVar.f20613a = childAt;
            eVar.f20614b = z10;
            eVar.f20615c = dVar.f20612b;
            dVar.f20611a.add(eVar);
        }
        Objects.toString(getDisplayMetrics());
        c.j();
        getMaxWidthPct();
        getMaxHeightPct();
        c.j();
        c.j();
        for (e eVar2 : dVar.f20611a) {
            c.j();
            b.b(eVar2.f20613a, iB, iA);
        }
        Iterator it = dVar.f20611a.iterator();
        int iA3 = 0;
        while (it.hasNext()) {
            iA3 += ((e) it.next()).a();
        }
        int i13 = iA3 + size;
        c.j();
        c.j();
        boolean z11 = i13 > iA;
        c.j();
        if (z11) {
            int i14 = iA - size;
            int iA4 = 0;
            for (e eVar3 : dVar.f20611a) {
                if (!eVar3.f20614b) {
                    iA4 += eVar3.a();
                }
            }
            int i15 = i14 - iA4;
            ArrayList<e> arrayList = new ArrayList();
            for (e eVar4 : dVar.f20611a) {
                if (eVar4.f20614b) {
                    arrayList.add(eVar4);
                }
            }
            Collections.sort(arrayList, new p020b7.c(0));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                iA2 += ((e) it2.next()).a();
            }
            int size2 = arrayList.size();
            if (size2 >= 6) {
                throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
            }
            float f11 = 1.0f - ((size2 - 1) * 0.2f);
            c.j();
            float f12 = 0.0f;
            for (e eVar5 : arrayList) {
                float fA = eVar5.a() / iA2;
                if (fA > f11) {
                    f12 += fA - f11;
                    f10 = f11;
                } else {
                    f10 = fA;
                }
                if (fA < 0.2f) {
                    float fMin = Math.min(0.2f - fA, f12);
                    f12 -= fMin;
                    f10 = fA + fMin;
                }
                c.j();
                eVar5.f20615c = (int) (f10 * i15);
            }
        }
        int i16 = iB - paddingLeft;
        for (e eVar6 : dVar.f20611a) {
            c.j();
            b.b(eVar6.f20613a, i16, eVar6.f20615c);
            size += a.d(eVar6.f20613a);
        }
        c.j();
        setMeasuredDimension(iB, size);
    }
}
