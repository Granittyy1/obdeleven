package androidx.compose.ui.window;

import androidx.compose.runtime.A;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogWrapper f15824a;

    public a(DialogWrapper dialogWrapper) {
        this.f15824a = dialogWrapper;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        DialogWrapper dialogWrapper = this.f15824a;
        dialogWrapper.dismiss();
        dialogWrapper.f15800h.disposeComposition();
    }
}
