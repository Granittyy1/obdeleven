package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class F extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IntrinsicSize f10117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10118q;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long Q1(androidx.compose.ui.layout.D d10, long j) {
        int iK0 = this.f10117p == IntrinsicSize.f10155b ? d10.k0(p013b0.a.h(j)) : d10.s(p013b0.a.h(j));
        if (iK0 < 0) {
            iK0 = 0;
        }
        if (iK0 < 0) {
            p013b0.i.a("height must be >= 0");
        }
        return p013b0.b.h(0, BrazeLogger.SUPPRESS, iK0, iK0);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean R1() {
        return this.f10118q;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f10117p == IntrinsicSize.f10155b ? interfaceC1166l.k0(i10) : interfaceC1166l.s(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f10117p == IntrinsicSize.f10155b ? interfaceC1166l.k0(i10) : interfaceC1166l.s(i10);
    }
}
