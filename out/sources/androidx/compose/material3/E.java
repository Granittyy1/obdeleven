package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.a<p293xa.r> f12163d;

    public E(View view, Ia.a<p293xa.r> aVar) {
        this.f12162c = view;
        this.f12163d = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f12161b || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f12161b = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12163d.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f12161b) {
            return;
        }
        View view2 = this.f12162c;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f12161b = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f12161b) {
            this.f12162c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f12161b = false;
        }
    }
}
