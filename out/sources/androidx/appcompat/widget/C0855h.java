package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0855h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f8958b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8959c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8960d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8961e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8962f;

    public C0855h(CompoundButton compoundButton) {
        this.f8957a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f8957a;
        Drawable drawableA = H0.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f8960d || this.f8961e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f8960d) {
                    p234t0.a.C0532a.h(drawableMutate, this.f8958b);
                }
                if (this.f8961e) {
                    p234t0.a.C0532a.i(drawableMutate, this.f8959c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f8957a;
        Context context = compoundButton.getContext();
        int[] iArr = p088h.a.f35700m;
        c0 c0VarF = c0.f(context, attributeSet, iArr, i10, 0);
        TypedArray typedArray = c0VarF.f8929b;
        androidx.core.view.O.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0VarF.f8929b, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                H0.b.c(compoundButton, c0VarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                H0.b.d(compoundButton, D.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0VarF.g();
        }
    }
}
