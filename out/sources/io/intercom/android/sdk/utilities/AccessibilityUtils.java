package io.intercom.android.sdk.utilities;

import B0.s;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AccessibilityUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityUtils {
    public static final int $stable = 0;
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(View view) {
        i.e(view, "view");
        O.n(view, new C1286a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addClickAbilityAnnouncement.1
            @Override // androidx.core.view.C1286a
            public void onInitializeAccessibilityNodeInfo(View host, s info) {
                i.e(host, "host");
                i.e(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.b(s.a.f1416g);
                info.j(true);
            }
        });
    }

    public final void addHeadingAnnouncement(View view) {
        i.e(view, "view");
        O.n(view, new C1286a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.addHeadingAnnouncement.1
            @Override // androidx.core.view.C1286a
            public void onInitializeAccessibilityNodeInfo(View host, s info) {
                i.e(host, "host");
                i.e(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.m(true);
            }
        });
    }

    public final void removeClickAbilityAnnouncement(View view) {
        i.e(view, "view");
        O.n(view, new C1286a() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils.removeClickAbilityAnnouncement.1
            @Override // androidx.core.view.C1286a
            public void onInitializeAccessibilityNodeInfo(View host, s info) {
                i.e(host, "host");
                i.e(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) s.a.f1416g.f1428a;
                AccessibilityNodeInfo accessibilityNodeInfo = info.f1411a;
                accessibilityNodeInfo.removeAction(accessibilityAction);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) s.a.f1417h.f1428a);
                info.j(false);
                accessibilityNodeInfo.setLongClickable(false);
            }
        });
    }
}
