package U3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: ImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<Z> extends h<ImageView, Z> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animatable f6336d;

    @Override // Q3.f
    public final void a() {
        Animatable animatable = this.f6336d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U3.g
    public final void b(Object obj) {
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.f6336d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f6336d = animatable;
        animatable.start();
    }

    @Override // U3.g
    public final void h(Drawable drawable) {
        l(null);
        this.f6336d = null;
        this.f6337b.setImageDrawable(drawable);
    }

    @Override // U3.g
    public final void i(Drawable drawable) {
        l(null);
        this.f6336d = null;
        this.f6337b.setImageDrawable(drawable);
    }

    @Override // U3.h, U3.g
    public final void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f6336d;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.f6336d = null;
        this.f6337b.setImageDrawable(drawable);
    }

    @Override // Q3.f
    public final void k() {
        Animatable animatable = this.f6336d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Z z10);
}
