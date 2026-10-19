package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H extends IntrinsicSizeModifier {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IntrinsicSize f10144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10145q;

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long Q1(androidx.compose.ui.layout.D d10, long j) {
        int I10 = this.f10144p == IntrinsicSize.f10155b ? d10.I(p013b0.a.g(j)) : d10.J(p013b0.a.g(j));
        if (I10 < 0) {
            I10 = 0;
        }
        if (I10 < 0) {
            p013b0.i.a("width must be >= 0");
        }
        return p013b0.b.h(I10, I10, 0, BrazeLogger.SUPPRESS);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final boolean R1() {
        return this.f10145q;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f10144p == IntrinsicSize.f10155b ? interfaceC1166l.I(i10) : interfaceC1166l.J(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f10144p == IntrinsicSize.f10155b ? interfaceC1166l.I(i10) : interfaceC1166l.J(i10);
    }
}
