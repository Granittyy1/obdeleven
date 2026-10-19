package androidx.compose.ui.layout;

import androidx.compose.ui.node.C1199u;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.layout.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ApproachMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1159e implements InterfaceC1156b, H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1199u f14239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1157c f14240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14241d;

    public C1159e(C1199u c1199u, InterfaceC1157c interfaceC1157c) {
        this.f14239b = c1199u;
        this.f14240c = interfaceC1157c;
    }

    @Override // p013b0.c
    public final long A0(float f10) {
        return this.f14239b.A0(f10);
    }

    @Override // androidx.compose.ui.layout.H
    public final F L0(int i10, int i11, Map map, Ia.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            R.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1158d(i10, i11, map, lVar, this);
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14239b.P0();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final boolean S0() {
        return false;
    }

    @Override // p013b0.c
    public final float T0(float f10) {
        return this.f14239b.getDensity() * f10;
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return this.f14239b.W(f10);
    }

    @Override // p013b0.c
    public final int Z0(long j) {
        return this.f14239b.Z0(j);
    }

    @Override // p013b0.c
    public final float e0(long j) {
        return this.f14239b.e0(j);
    }

    @Override // p013b0.c
    public final int e1(float f10) {
        return this.f14239b.e1(f10);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14239b.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final LayoutDirection getLayoutDirection() {
        return this.f14239b.f14525n.f14383A;
    }

    @Override // p013b0.c
    public final long o1(long j) {
        return this.f14239b.o1(j);
    }

    @Override // p013b0.c
    public final long p(long j) {
        return this.f14239b.p(j);
    }

    @Override // p013b0.c
    public final float s1(long j) {
        return this.f14239b.s1(j);
    }

    @Override // p013b0.c
    public final float u(int i10) {
        return this.f14239b.u(i10);
    }

    @Override // p013b0.c
    public final float v(float f10) {
        return f10 / this.f14239b.getDensity();
    }

    @Override // p013b0.c
    public final long w0(int i10) {
        return this.f14239b.w0(i10);
    }

    @Override // androidx.compose.ui.layout.H
    public final F y1(int i10, int i11, Map<AbstractC1155a, Integer> map, Ia.l<? super Y.a, p293xa.r> lVar) {
        return this.f14239b.L0(i10, i11, map, lVar);
    }
}
