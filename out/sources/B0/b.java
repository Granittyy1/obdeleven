package B0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AccessibilityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.p f1410a;

    public b(X5.p pVar) {
        this.f1410a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f1410a.equals(((b) obj).f1410a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1410a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        X5.r rVar = (X5.r) this.f1410a.f7260b;
        AutoCompleteTextView autoCompleteTextView = rVar.f7265h;
        if (autoCompleteTextView == null || G0.a.h(autoCompleteTextView)) {
            return;
        }
        int i10 = z10 ? 2 : 1;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        rVar.f7278d.setImportantForAccessibility(i10);
    }
}
