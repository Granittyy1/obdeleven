package B0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f1434a;

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f1435a;

        public a(t tVar) {
            this.f1435a = tVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            s sVarB = this.f1435a.b(i10);
            if (sVarB == null) {
                return null;
            }
            return sVarB.f1411a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f1435a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            s sVarC = this.f1435a.c(i10);
            if (sVarC == null) {
                return null;
            }
            return sVarC.f1411a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f1435a.d(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f1435a.a(i10, new s(accessibilityNodeInfo), str, bundle);
        }
    }

    public t() {
        this.f1434a = new b(this);
    }

    public s b(int i10) {
        return null;
    }

    public s c(int i10) {
        return null;
    }

    public boolean d(int i10, int i11, Bundle bundle) {
        return false;
    }

    public t(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f1434a = accessibilityNodeProvider;
    }

    public void a(int i10, s sVar, String str, Bundle bundle) {
    }
}
