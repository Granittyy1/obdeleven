package U5;

import B0.s;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.C1286a;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6511b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f6510a = i10;
        this.f6511b = obj;
    }

    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
        switch (this.f6510a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, sVar);
                sVar.a(1048576);
                sVar.f1411a.setDismissable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, sVar);
                MaterialCalendar materialCalendar = (MaterialCalendar) this.f6511b;
                sVar.f1411a.setHintText(materialCalendar.f27023o.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }

    @Override // androidx.core.view.C1286a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        switch (this.f6510a) {
            case 0:
                if (i10 != 1048576) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                ((BaseTransientBottomBar) this.f6511b).a();
                return true;
            default:
                return super.performAccessibilityAction(view, i10, bundle);
        }
    }
}
