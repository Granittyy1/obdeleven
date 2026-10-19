package androidx.compose.ui.node;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.node.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelegatableNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1186g {
    public static final View a(InterfaceC1184e interfaceC1184e) {
        if (!interfaceC1184e.getNode().f13997o) {
            R.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) C1203y.a(C1185f.f(interfaceC1184e));
    }
}
