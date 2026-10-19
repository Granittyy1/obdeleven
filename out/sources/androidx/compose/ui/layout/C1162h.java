package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1162h implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1166l f14249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntrinsicMinMax f14250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntrinsicWidthHeight f14251d;

    public C1162h(InterfaceC1166l interfaceC1166l, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f14249b = interfaceC1166l;
        this.f14250c = intrinsicMinMax;
        this.f14251d = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        return this.f14249b.I(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        return this.f14249b.J(i10);
    }

    @Override // androidx.compose.ui.layout.D
    public final Y Q(long j) {
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f14184b;
        IntrinsicMinMax intrinsicMinMax = this.f14250c;
        IntrinsicWidthHeight intrinsicWidthHeight2 = this.f14251d;
        InterfaceC1166l interfaceC1166l = this.f14249b;
        if (intrinsicWidthHeight2 == intrinsicWidthHeight) {
            return new C1164j(intrinsicMinMax == IntrinsicMinMax.f14182c ? interfaceC1166l.J(p013b0.a.g(j)) : interfaceC1166l.I(p013b0.a.g(j)), p013b0.a.c(j) ? p013b0.a.g(j) : 32767);
        }
        return new C1164j(p013b0.a.d(j) ? p013b0.a.h(j) : 32767, intrinsicMinMax == IntrinsicMinMax.f14182c ? interfaceC1166l.s(p013b0.a.h(j)) : interfaceC1166l.k0(p013b0.a.h(j)));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        return this.f14249b.k0(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        return this.f14249b.q();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        return this.f14249b.s(i10);
    }
}
