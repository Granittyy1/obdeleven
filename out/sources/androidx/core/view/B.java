package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class B implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f16843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f16844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f16845d;

    public B(View view, Runnable runnable) {
        this.f16843b = view;
        this.f16844c = view.getViewTreeObserver();
        this.f16845d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        B b10 = new B(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b10);
        view.addOnAttachStateChangeListener(b10);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f16844c.isAlive();
        View view = this.f16843b;
        if (zIsAlive) {
            this.f16844c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f16845d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16844c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f16844c.isAlive();
        View view2 = this.f16843b;
        if (zIsAlive) {
            this.f16844c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
