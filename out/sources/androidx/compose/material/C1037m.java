package androidx.compose.material;

import androidx.compose.animation.core.C0907g;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.compose.material.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1037m implements InterfaceC1033i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11918i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11919k;

    public C1037m(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f11910a = j;
        this.f11911b = j10;
        this.f11912c = j11;
        this.f11913d = j12;
        this.f11914e = j13;
        this.f11915f = j14;
        this.f11916g = j15;
        this.f11917h = j16;
        this.f11918i = j17;
        this.j = j18;
        this.f11919k = j19;
    }

    @Override // androidx.compose.material.InterfaceC1033i
    public final N0 a(boolean z10, ToggleableState toggleableState, InterfaceC1084f interfaceC1084f) {
        long j;
        N0 n0I;
        interfaceC1084f.L(840901029);
        if (z10) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j = this.f11912c;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.f11912c;
            } else {
                j = this.f11913d;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0) {
                j = this.f11914e;
            } else if (iOrdinal2 == 1) {
                j = this.f11915f;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.f11916g;
            }
        }
        long j10 = j;
        if (z10) {
            interfaceC1084f.L(507535414);
            n0I = androidx.compose.animation.x.a(j10, C0907g.d(toggleableState == ToggleableState.f15274c ? 100 : 50, 0, null, 6), null, interfaceC1084f, 0, 12);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(507715958);
            n0I = J0.i(new androidx.compose.ui.graphics.H(j10), interfaceC1084f);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return n0I;
    }

    @Override // androidx.compose.material.InterfaceC1033i
    public final N0 b(ToggleableState toggleableState, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(544656267);
        ToggleableState toggleableState2 = ToggleableState.f15274c;
        N0 n0A = androidx.compose.animation.x.a(toggleableState == toggleableState2 ? this.f11911b : this.f11910a, C0907g.d(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6), null, interfaceC1084f, 0, 12);
        interfaceC1084f.D();
        return n0A;
    }

    @Override // androidx.compose.material.InterfaceC1033i
    public final N0 c(boolean z10, ToggleableState toggleableState, InterfaceC1084f interfaceC1084f) {
        long j;
        N0 n0I;
        interfaceC1084f.L(-1568341342);
        if (z10) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j = this.f11917h;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.f11917h;
            } else {
                j = this.f11918i;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                j = this.j;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.f11919k;
            }
        }
        long j10 = j;
        if (z10) {
            interfaceC1084f.L(-840498473);
            n0I = androidx.compose.animation.x.a(j10, C0907g.d(toggleableState == ToggleableState.f15274c ? 100 : 50, 0, null, 6), null, interfaceC1084f, 0, 12);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-840317929);
            n0I = J0.i(new androidx.compose.ui.graphics.H(j10), interfaceC1084f);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return n0I;
    }
}
