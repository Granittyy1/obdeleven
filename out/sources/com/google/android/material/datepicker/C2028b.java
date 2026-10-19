package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2028b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f27042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f27043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f27044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f27045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S5.i f27047f;

    public C2028b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, S5.i iVar, Rect rect) {
        A0.f.d(rect.left);
        A0.f.d(rect.top);
        A0.f.d(rect.right);
        A0.f.d(rect.bottom);
        this.f27042a = rect;
        this.f27043b = colorStateList2;
        this.f27044c = colorStateList;
        this.f27045d = colorStateList3;
        this.f27046e = i10;
        this.f27047f = iVar;
    }

    public static C2028b a(Context context, int i10) {
        A0.f.c("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p204q5.a.f46124r);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListA = P5.c.a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListA2 = P5.c.a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListA3 = P5.c.a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        S5.i iVarA = S5.i.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new S5.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C2028b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, iVarA, rect);
    }

    public final void b(TextView textView) {
        S5.f fVar = new S5.f();
        S5.f fVar2 = new S5.f();
        S5.i iVar = this.f27047f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.k(this.f27044c);
        fVar.f5566b.j = this.f27046e;
        fVar.invalidateSelf();
        S5.f.b bVar = fVar.f5566b;
        ColorStateList colorStateList = bVar.f5592d;
        ColorStateList colorStateList2 = this.f27045d;
        if (colorStateList != colorStateList2) {
            bVar.f5592d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f27043b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f27042a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        textView.setBackground(insetDrawable);
    }
}
