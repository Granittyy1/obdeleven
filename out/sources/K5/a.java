package K5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1286a;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: CheckableImageButton.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f4282a;

    public a(CheckableImageButton checkableImageButton) {
        this.f4282a = checkableImageButton;
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f4282a.f27237e);
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        CheckableImageButton checkableImageButton = this.f4282a;
        sVar.f1411a.setCheckable(checkableImageButton.f27238f);
        sVar.f1411a.setChecked(checkableImageButton.f27237e);
    }
}
