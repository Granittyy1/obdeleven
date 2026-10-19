package androidx.compose.ui.window;

import androidx.compose.runtime.A;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f15825a;

    public b(PopupLayout popupLayout) {
        this.f15825a = popupLayout;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        PopupLayout popupLayout = this.f15825a;
        popupLayout.disposeComposition();
        popupLayout.getClass();
        P3.d.u(popupLayout, null);
        popupLayout.f15807g.removeViewImmediate(popupLayout);
    }
}
