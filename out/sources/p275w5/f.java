package p275w5;

import B0.s;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.C1286a;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f47756a;

    public f(b bVar) {
        this.f47756a = bVar;
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        if (!this.f47756a.f26830k) {
            sVar.f1411a.setDismissable(false);
        } else {
            sVar.a(1048576);
            sVar.f1411a.setDismissable(true);
        }
    }

    @Override // androidx.core.view.C1286a
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            b bVar = this.f47756a;
            if (bVar.f26830k) {
                bVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
