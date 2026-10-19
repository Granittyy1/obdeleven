package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractC1104p;

/* JADX INFO: renamed from: androidx.compose.ui.node.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompositionLocalConsumerModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1183d {
    public static final <T> T a(InterfaceC1182c interfaceC1182c, AbstractC1104p<T> abstractC1104p) {
        if (!interfaceC1182c.getNode().f13997o) {
            R.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) C1185f.f(interfaceC1182c).f14385C.a(abstractC1104p);
    }
}
