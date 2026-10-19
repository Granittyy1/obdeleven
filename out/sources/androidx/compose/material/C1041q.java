package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;

/* JADX INFO: renamed from: androidx.compose.material.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1041q implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11933h;

    public C1041q(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f11926a = j;
        this.f11927b = j10;
        this.f11928c = j11;
        this.f11929d = j12;
        this.f11930e = j13;
        this.f11931f = j14;
        this.f11932g = j15;
        this.f11933h = j16;
    }

    @Override // androidx.compose.material.S
    public final X a(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(-66424183);
        if (z10) {
            j = z11 ? this.f11926a : this.f11928c;
        } else {
            j = z11 ? this.f11930e : this.f11932g;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.S
    public final X b(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(-1176343362);
        if (z10) {
            j = z11 ? this.f11927b : this.f11929d;
        } else {
            j = z11 ? this.f11931f : this.f11933h;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1041q.class != obj.getClass()) {
            return false;
        }
        C1041q c1041q = (C1041q) obj;
        return androidx.compose.ui.graphics.H.c(this.f11926a, c1041q.f11926a) && androidx.compose.ui.graphics.H.c(this.f11927b, c1041q.f11927b) && androidx.compose.ui.graphics.H.c(this.f11928c, c1041q.f11928c) && androidx.compose.ui.graphics.H.c(this.f11929d, c1041q.f11929d) && androidx.compose.ui.graphics.H.c(this.f11930e, c1041q.f11930e) && androidx.compose.ui.graphics.H.c(this.f11931f, c1041q.f11931f) && androidx.compose.ui.graphics.H.c(this.f11932g, c1041q.f11932g) && androidx.compose.ui.graphics.H.c(this.f11933h, c1041q.f11933h);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f11933h) + C4.b.c(this.f11932g, C4.b.c(this.f11931f, C4.b.c(this.f11930e, C4.b.c(this.f11929d, C4.b.c(this.f11928c, C4.b.c(this.f11927b, Long.hashCode(this.f11926a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
