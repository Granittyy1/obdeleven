package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.C1190k;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends HoverIconModifierNode {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14011t;

    public A(C1151b c1151b, C1190k c1190k) {
        super(c1151b, false, c1190k);
        this.f14011t = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return this.f14011t;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final void R1(m mVar) {
        n nVar = (n) C1183d.a(this, CompositionLocalsKt.f14859u);
        if (nVar != null) {
            nVar.b(mVar);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final boolean T1(int i10) {
        return y.a(i10, 3) || y.a(i10, 4);
    }
}
