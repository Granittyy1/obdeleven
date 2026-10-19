package com.google.android.material.timepicker;

import S5.g;
import S5.i;
import Z3.F;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: RadialViewGroup.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends ConstraintLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f27677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S5.f f27679t;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            F f10 = this.f27677r;
            handler.removeCallbacks(f10);
            handler.post(f10);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            F f10 = this.f27677r;
            handler.removeCallbacks(f10);
            handler.post(f10);
        }
    }

    public void q() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.e(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !ActionType.SKIP.equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f27678s * 0.66f) : this.f27678s;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                androidx.constraintlayout.widget.b.C0170b c0170b = bVar.h(((View) it.next()).getId()).f16493e;
                c0170b.f16509A = R.id.circle_center;
                c0170b.f16510B = iRound;
                c0170b.f16511C = size;
                size += 360.0f / list.size();
            }
        }
        bVar.b(this);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f27679t.k(ColorStateList.valueOf(i10));
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        S5.f fVar = new S5.f();
        this.f27679t = fVar;
        g gVar = new g(0.5f);
        i.a aVarE = fVar.f5566b.f5589a.e();
        aVarE.f5622e = gVar;
        aVarE.f5623f = gVar;
        aVarE.f5624g = gVar;
        aVarE.f5625h = gVar;
        fVar.setShapeAppearanceModel(aVarE.a());
        this.f27679t.k(ColorStateList.valueOf(-1));
        S5.f fVar2 = this.f27679t;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setBackground(fVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46132z, i10, 0);
        this.f27678s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f27677r = new F(this);
        typedArrayObtainStyledAttributes.recycle();
    }
}
