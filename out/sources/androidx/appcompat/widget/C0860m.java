package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0860m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f9004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f9005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9006c = 0;

    public C0860m(ImageView imageView) {
        this.f9004a = imageView;
    }

    public final void a() {
        a0 a0Var;
        ImageView imageView = this.f9004a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            D.a(drawable);
        }
        if (drawable == null || (a0Var = this.f9005b) == null) {
            return;
        }
        C0856i.e(drawable, a0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = this.f9004a;
        Context context = imageView.getContext();
        int[] iArr = p088h.a.f35694f;
        c0 c0VarF = c0.f(context, attributeSet, iArr, i10, 0);
        androidx.core.view.O.m(imageView, imageView.getContext(), iArr, attributeSet, c0VarF.f8929b, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = c0VarF.f8929b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.voltasit.obdeleven.domain.usecases.device.v.e(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                D.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                H0.e.c(imageView, c0VarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                H0.e.d(imageView, D.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0VarF.g();
        }
    }

    public final void c(int i10) {
        ImageView imageView = this.f9004a;
        if (i10 != 0) {
            Drawable drawableE = com.voltasit.obdeleven.domain.usecases.device.v.e(imageView.getContext(), i10);
            if (drawableE != null) {
                D.a(drawableE);
            }
            imageView.setImageDrawable(drawableE);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
