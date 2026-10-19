package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;

/* JADX INFO: renamed from: androidx.compose.material.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1035k implements InterfaceC1029e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11904d;

    public C1035k(long j, long j10, long j11, long j12) {
        this.f11901a = j;
        this.f11902b = j10;
        this.f11903c = j11;
        this.f11904d = j12;
    }

    @Override // androidx.compose.material.InterfaceC1029e
    public final X a(boolean z10, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-2133647540);
        X xI = J0.i(new androidx.compose.ui.graphics.H(z10 ? this.f11902b : this.f11904d), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.InterfaceC1029e
    public final X b(boolean z10, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-655254499);
        X xI = J0.i(new androidx.compose.ui.graphics.H(z10 ? this.f11901a : this.f11903c), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1035k.class != obj.getClass()) {
            return false;
        }
        C1035k c1035k = (C1035k) obj;
        return androidx.compose.ui.graphics.H.c(this.f11901a, c1035k.f11901a) && androidx.compose.ui.graphics.H.c(this.f11902b, c1035k.f11902b) && androidx.compose.ui.graphics.H.c(this.f11903c, c1035k.f11903c) && androidx.compose.ui.graphics.H.c(this.f11904d, c1035k.f11904d);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f11904d) + C4.b.c(this.f11903c, C4.b.c(this.f11902b, Long.hashCode(this.f11901a) * 31, 31), 31);
    }
}
