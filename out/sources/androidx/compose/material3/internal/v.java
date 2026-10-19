package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements AccessibilityManager.AccessibilityStateChangeListener, N0<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f12579b = J0.f(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f12580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f12581d;

    /* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class a {
        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    /* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1085f0 f12582a = J0.f(Boolean.FALSE);

        public b() {
        }

        public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            v.this.getClass();
            this.f12582a.setValue(Boolean.valueOf(v.e(accessibilityManager)));
        }
    }

    /* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1085f0 f12584a = J0.f(Boolean.FALSE);

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z10) {
            this.f12584a.setValue(Boolean.valueOf(z10));
        }
    }

    public v(boolean z10, boolean z11) {
        b bVar = null;
        this.f12580c = z10 ? new c() : null;
        if (z11 && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.f12581d = bVar;
    }

    public static boolean e(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && kotlin.text.n.J(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.N0
    public final Boolean getValue() {
        boolean z10 = false;
        if (((Boolean) this.f12579b.getValue()).booleanValue()) {
            c cVar = this.f12580c;
            if (cVar != null ? ((Boolean) cVar.f12584a.getValue()).booleanValue() : false) {
                z10 = true;
            } else {
                b bVar = this.f12581d;
                if (bVar != null ? ((Boolean) bVar.f12582a.getValue()).booleanValue() : false) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f12579b.setValue(Boolean.valueOf(z10));
    }
}
