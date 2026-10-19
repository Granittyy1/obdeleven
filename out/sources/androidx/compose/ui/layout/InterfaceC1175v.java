package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1175v extends androidx.compose.ui.h.b {
    F B(H h8, D d10, long j);

    default int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new J(interfaceC1166l, MeasuringIntrinsics$IntrinsicMinMax.f14194b, MeasuringIntrinsics$IntrinsicWidthHeight.f14197b), p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new J(interfaceC1166l, MeasuringIntrinsics$IntrinsicMinMax.f14194b, MeasuringIntrinsics$IntrinsicWidthHeight.f14198c), p013b0.b.b(i10, 0, 13)).getHeight();
    }

    default int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new J(interfaceC1166l, MeasuringIntrinsics$IntrinsicMinMax.f14195c, MeasuringIntrinsics$IntrinsicWidthHeight.f14197b), p013b0.b.b(0, i10, 7)).getWidth();
    }

    default int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return B(new C1169o(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new J(interfaceC1166l, MeasuringIntrinsics$IntrinsicMinMax.f14195c, MeasuringIntrinsics$IntrinsicWidthHeight.f14198c), p013b0.b.b(i10, 0, 13)).getHeight();
    }
}
