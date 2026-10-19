package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C0852e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C0860m mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.a();
        }
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            c0860m.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        a0 a0Var;
        C0860m c0860m = this.mImageHelper;
        if (c0860m == null || (a0Var = c0860m.f9005b) == null) {
            return null;
        }
        return a0Var.f8898a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        a0 a0Var;
        C0860m c0860m = this.mImageHelper;
        if (c0860m == null || (a0Var = c0860m.f9005b) == null) {
            return null;
        }
        return a0Var.f8899b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f9004a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            c0860m.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null && drawable != null && !this.mHasLevel) {
            c0860m.f9006c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C0860m c0860m2 = this.mImageHelper;
        if (c0860m2 != null) {
            c0860m2.a();
            if (this.mHasLevel) {
                return;
            }
            C0860m c0860m3 = this.mImageHelper;
            ImageView imageView = c0860m3.f9004a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0860m3.f9006c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            c0860m.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            c0860m.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            if (c0860m.f9005b == null) {
                c0860m.f9005b = new a0();
            }
            a0 a0Var = c0860m.f9005b;
            a0Var.f8898a = colorStateList;
            a0Var.f8901d = true;
            c0860m.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0860m c0860m = this.mImageHelper;
        if (c0860m != null) {
            if (c0860m.f9005b == null) {
                c0860m.f9005b = new a0();
            }
            a0 a0Var = c0860m.f9005b;
            a0Var.f8899b = mode;
            a0Var.f8900c = true;
            c0860m.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z.a(context);
        this.mHasLevel = false;
        X.a(this, getContext());
        C0852e c0852e = new C0852e(this);
        this.mBackgroundTintHelper = c0852e;
        c0852e.d(attributeSet, i10);
        C0860m c0860m = new C0860m(this);
        this.mImageHelper = c0860m;
        c0860m.b(attributeSet, i10);
    }
}
