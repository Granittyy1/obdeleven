package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidAccessibilityManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1220g implements InterfaceC1218f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f15044a;

    public C1220g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f15044a = (AccessibilityManager) systemService;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1218f
    public final long a(long j, boolean z10) {
        if (j >= 2147483647L) {
            return j;
        }
        int i10 = z10 ? 7 : 3;
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f15044a;
        if (i11 >= 29) {
            int iA = N.a(accessibilityManager, (int) j, i10);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z10 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
