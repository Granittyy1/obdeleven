package androidx.compose.material3;

import androidx.compose.ui.platform.C1217e0;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12326b;

    public /* synthetic */ T(int i10, Object obj) {
        this.f12325a = i10;
        this.f12326b = obj;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        switch (this.f12325a) {
            case 0:
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = (ModalBottomSheetDialogWrapper) this.f12326b;
                modalBottomSheetDialogWrapper.dismiss();
                modalBottomSheetDialogWrapper.f12234h.disposeComposition();
                break;
            default:
                ((C1217e0) this.f12326b).f15040a.invoke();
                break;
        }
    }
}
