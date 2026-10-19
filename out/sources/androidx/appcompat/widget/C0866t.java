package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0866t extends C0863p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0865s f9016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f9017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f9018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f9019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9021i;

    public C0866t(C0865s c0865s) {
        super(c0865s);
        this.f9018f = null;
        this.f9019g = null;
        this.f9020h = false;
        this.f9021i = false;
        this.f9016d = c0865s;
    }

    @Override // androidx.appcompat.widget.C0863p
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        C0865s c0865s = this.f9016d;
        Context context = c0865s.getContext();
        int[] iArr = p088h.a.f35695g;
        c0 c0VarF = c0.f(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        androidx.core.view.O.m(c0865s, c0865s.getContext(), iArr, attributeSet, c0VarF.f8929b, R.attr.seekBarStyle);
        Drawable drawableC = c0VarF.c(0);
        if (drawableC != null) {
            c0865s.setThumb(drawableC);
        }
        Drawable drawableB = c0VarF.b(1);
        Drawable drawable = this.f9017e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f9017e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(c0865s);
            t0.a.b.b(drawableB, c0865s.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(c0865s.getDrawableState());
            }
            c();
        }
        c0865s.invalidate();
        TypedArray typedArray = c0VarF.f8929b;
        if (typedArray.hasValue(3)) {
            this.f9019g = D.b(typedArray.getInt(3, -1), this.f9019g);
            this.f9021i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f9018f = c0VarF.a(2);
            this.f9020h = true;
        }
        c0VarF.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.f9017e;
        if (drawable != null) {
            if (this.f9020h || this.f9021i) {
                Drawable drawableMutate = drawable.mutate();
                this.f9017e = drawableMutate;
                if (this.f9020h) {
                    p234t0.a.C0532a.h(drawableMutate, this.f9018f);
                }
                if (this.f9021i) {
                    p234t0.a.C0532a.i(this.f9017e, this.f9019g);
                }
                if (this.f9017e.isStateful()) {
                    this.f9017e.setState(this.f9016d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f9017e != null) {
            C0865s c0865s = this.f9016d;
            int max = c0865s.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9017e.getIntrinsicWidth();
                int intrinsicHeight = this.f9017e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9017e.setBounds(-i10, -i11, i10, i11);
                float width = ((c0865s.getWidth() - c0865s.getPaddingLeft()) - c0865s.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c0865s.getPaddingLeft(), c0865s.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f9017e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
