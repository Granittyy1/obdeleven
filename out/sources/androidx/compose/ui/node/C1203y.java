package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: androidx.compose.ui.node.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1203y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p013b0.d f14626a = p006a5.a.a();

    public static final U a(LayoutNode layoutNode) {
        AndroidComposeView androidComposeView = layoutNode.f14412o;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw C4.v.g("LayoutNode should be attached to an owner");
    }
}
