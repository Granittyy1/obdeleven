package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.layout.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1169o implements H, InterfaceC1167m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutDirection f14255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1167m f14256c;

    public C1169o(InterfaceC1167m interfaceC1167m, LayoutDirection layoutDirection) {
        this.f14255b = layoutDirection;
        this.f14256c = interfaceC1167m;
    }

    @Override // p013b0.c
    public final long A0(float f10) {
        return this.f14256c.A0(f10);
    }

    @Override // androidx.compose.ui.layout.H
    public final F L0(int i10, int i11, Map map, Ia.l lVar) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            R.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1168n(i10, i11, map);
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14256c.P0();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final boolean S0() {
        return this.f14256c.S0();
    }

    @Override // p013b0.c
    public final float T0(float f10) {
        return this.f14256c.T0(f10);
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return this.f14256c.W(f10);
    }

    @Override // p013b0.c
    public final int Z0(long j) {
        return this.f14256c.Z0(j);
    }

    @Override // p013b0.c
    public final float e0(long j) {
        return this.f14256c.e0(j);
    }

    @Override // p013b0.c
    public final int e1(float f10) {
        return this.f14256c.e1(f10);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14256c.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final LayoutDirection getLayoutDirection() {
        return this.f14255b;
    }

    @Override // p013b0.c
    public final long o1(long j) {
        return this.f14256c.o1(j);
    }

    @Override // p013b0.c
    public final long p(long j) {
        return this.f14256c.p(j);
    }

    @Override // p013b0.c
    public final float s1(long j) {
        return this.f14256c.s1(j);
    }

    @Override // p013b0.c
    public final float u(int i10) {
        return this.f14256c.u(i10);
    }

    @Override // p013b0.c
    public final float v(float f10) {
        return this.f14256c.v(f10);
    }

    @Override // p013b0.c
    public final long w0(int i10) {
        return this.f14256c.w0(i10);
    }
}
