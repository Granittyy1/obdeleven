package androidx.compose.ui.layout;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1166l f14187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MeasuringIntrinsics$IntrinsicMinMax f14188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MeasuringIntrinsics$IntrinsicWidthHeight f14189d;

    public J(InterfaceC1166l interfaceC1166l, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        this.f14187b = interfaceC1166l;
        this.f14188c = measuringIntrinsics$IntrinsicMinMax;
        this.f14189d = measuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        return this.f14187b.I(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        return this.f14187b.J(i10);
    }

    @Override // androidx.compose.ui.layout.D
    public final Y Q(long j) {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = MeasuringIntrinsics$IntrinsicWidthHeight.f14197b;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.f14188c;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = this.f14189d;
        InterfaceC1166l interfaceC1166l = this.f14187b;
        if (measuringIntrinsics$IntrinsicWidthHeight2 == measuringIntrinsics$IntrinsicWidthHeight) {
            return new K(measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.f14195c ? interfaceC1166l.J(p013b0.a.g(j)) : interfaceC1166l.I(p013b0.a.g(j)), p013b0.a.c(j) ? p013b0.a.g(j) : 32767);
        }
        return new K(p013b0.a.d(j) ? p013b0.a.h(j) : 32767, measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.f14195c ? interfaceC1166l.s(p013b0.a.h(j)) : interfaceC1166l.k0(p013b0.a.h(j)));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        return this.f14187b.k0(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        return this.f14187b.q();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        return this.f14187b.s(i10);
    }
}
