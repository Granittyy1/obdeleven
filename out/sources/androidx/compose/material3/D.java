package androidx.compose.material3;

import android.view.View;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f12127a;

    public D(E e10) {
        this.f12127a = e10;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        E e10 = this.f12127a;
        boolean z10 = e10.f12161b;
        View view = e10.f12162c;
        if (z10) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(e10);
            e10.f12161b = false;
        }
        view.removeOnAttachStateChangeListener(e10);
    }
}
