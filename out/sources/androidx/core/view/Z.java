package androidx.core.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f16887a;

    public Z(View view) {
        this.f16887a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f16887a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f16887a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = this.f16887a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(a0 a0Var) {
        View view = this.f16887a.get();
        if (view != null) {
            if (a0Var != null) {
                view.animate().setListener(new Y(a0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f16887a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
