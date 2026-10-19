package androidx.compose.ui.node;

import androidx.compose.ui.layout.C1169o;
import androidx.compose.ui.layout.InterfaceC1166l;

/* JADX INFO: renamed from: androidx.compose.ui.node.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1198t extends InterfaceC1184e {
    androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j);

    default int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new NodeMeasuringIntrinsics.a(interfaceC1166l, NodeMeasuringIntrinsics.IntrinsicMinMax.f14540b, NodeMeasuringIntrinsics.IntrinsicWidthHeight.f14543b), p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new NodeMeasuringIntrinsics.a(interfaceC1166l, NodeMeasuringIntrinsics.IntrinsicMinMax.f14540b, NodeMeasuringIntrinsics.IntrinsicWidthHeight.f14544c), p013b0.b.b(i10, 0, 13)).getHeight();
    }

    default int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new NodeMeasuringIntrinsics.a(interfaceC1166l, NodeMeasuringIntrinsics.IntrinsicMinMax.f14541c, NodeMeasuringIntrinsics.IntrinsicWidthHeight.f14543b), p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new NodeMeasuringIntrinsics.a(interfaceC1166l, NodeMeasuringIntrinsics.IntrinsicMinMax.f14541c, NodeMeasuringIntrinsics.IntrinsicWidthHeight.f14544c), p013b0.b.b(i10, 0, 13)).getHeight();
    }
}
