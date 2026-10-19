package androidx.compose.ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.C1286a;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1234n extends C1286a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f15069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f15070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f15071c;

    public C1234n(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.f15069a = androidComposeView;
        this.f15070b = layoutNode;
        this.f15071c = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // androidx.core.view.C1286a
    public final void onInitializeAccessibilityNodeInfo(View view, B0.s sVar) {
        super.onInitializeAccessibilityNodeInfo(view, sVar);
        AndroidComposeView androidComposeView = this.f15069a;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.f14709s;
        if (androidComposeViewAccessibilityDelegateCompat.l()) {
            sVar.f1411a.setVisibleToUser(false);
        }
        LayoutNode layoutNode = this.f15070b;
        LayoutNode layoutNodeG = layoutNode.G();
        while (true) {
            if (layoutNodeG == null) {
                layoutNodeG = null;
                break;
            } else if (layoutNodeG.f14389G.d(8)) {
                break;
            } else {
                layoutNodeG = layoutNodeG.G();
            }
        }
        Integer numValueOf = layoutNodeG != null ? Integer.valueOf(layoutNodeG.f14401c) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f15245g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        AndroidComposeView androidComposeView2 = this.f15071c;
        sVar.f1412b = iIntValue;
        AccessibilityNodeInfo accessibilityNodeInfo = sVar.f1411a;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i10 = layoutNode.f14401c;
        int iB = androidComposeViewAccessibilityDelegateCompat.f14735B.b(i10);
        if (iB != -1) {
            AndroidViewHolder androidViewHolderG = K0.g(androidComposeView.getAndroidViewsHandler$ui_release(), iB);
            if (androidViewHolderG != null) {
                accessibilityNodeInfo.setTraversalBefore(androidViewHolderG);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iB);
            }
            AndroidComposeView.j(androidComposeView, i10, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.f14737D);
        }
        int iB2 = androidComposeViewAccessibilityDelegateCompat.f14736C.b(i10);
        if (iB2 != -1) {
            AndroidViewHolder androidViewHolderG2 = K0.g(androidComposeView.getAndroidViewsHandler$ui_release(), iB2);
            if (androidViewHolderG2 != null) {
                accessibilityNodeInfo.setTraversalAfter(androidViewHolderG2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iB2);
            }
            AndroidComposeView.j(androidComposeView, i10, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.f14738E);
        }
    }
}
