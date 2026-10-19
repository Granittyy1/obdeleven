package p004a3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC1363f;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.jvm.internal.i;
import p029c3.d;

/* JADX INFO: compiled from: ImageViewTarget.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c<ImageView>, d, InterfaceC1363f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8013c;

    public a(ImageView imageView) {
        this.f8013c = imageView;
    }

    @Override // p004a3.c
    public final View a() {
        return this.f8013c;
    }

    @Override // p029c3.d
    public final Drawable d() {
        return this.f8013c.getDrawable();
    }

    public final void e() {
        Object drawable = this.f8013c.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f8012b) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (i.a(this.f8013c, ((a) obj).f8013c)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Drawable drawable) {
        ImageView imageView = this.f8013c;
        Object drawable2 = imageView.getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        e();
    }

    public final int hashCode() {
        return this.f8013c.hashCode();
    }

    @Override // p004a3.b
    public final void onError(Drawable drawable) {
        f(drawable);
    }

    @Override // p004a3.b
    public final void onStart(Drawable drawable) {
        f(drawable);
    }

    @Override // p004a3.b
    public final void onSuccess(Drawable drawable) {
        f(drawable);
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void p(InterfaceC1376t interfaceC1376t) {
        this.f8012b = false;
        e();
    }

    @Override // androidx.lifecycle.InterfaceC1363f
    public final void x(InterfaceC1376t interfaceC1376t) {
        this.f8012b = true;
        e();
    }
}
