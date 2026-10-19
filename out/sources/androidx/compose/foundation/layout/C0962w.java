package androidx.compose.foundation.layout;

import A1.C0575j;
import androidx.collection.C0880h;
import androidx.compose.ui.layout.InterfaceC1166l;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0962w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowLayoutOverflow.OverflowType f10337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.ui.layout.D f10340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.ui.layout.Y f10341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.ui.layout.D f10342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.ui.layout.Y f10343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0880h f10344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0880h f10345i;

    public C0962w(FlowLayoutOverflow.OverflowType overflowType, int i10, int i11) {
        this.f10337a = overflowType;
        this.f10338b = i10;
        this.f10339c = i11;
    }

    public final C0880h a(int i10, int i11, boolean z10) {
        int iOrdinal = this.f10337a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z10) {
                return this.f10344h;
            }
            return null;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z10) {
            return this.f10344h;
        }
        if (i10 + 1 < this.f10338b || i11 < this.f10339c) {
            return null;
        }
        return this.f10345i;
    }

    public final void b(InterfaceC1166l interfaceC1166l, InterfaceC1166l interfaceC1166l2, long j) {
        long jA = K.a(j, LayoutOrientation.f10163b);
        if (interfaceC1166l != null) {
            int iG = p013b0.a.g(jA);
            int i10 = FlowLayoutKt.f10123a;
            int I10 = interfaceC1166l.I(iG);
            this.f10344h = new C0880h(C0880h.a(I10, interfaceC1166l.k0(I10)));
            this.f10340d = interfaceC1166l instanceof androidx.compose.ui.layout.D ? (androidx.compose.ui.layout.D) interfaceC1166l : null;
            this.f10341e = null;
        }
        if (interfaceC1166l2 != null) {
            int iG2 = p013b0.a.g(jA);
            int i11 = FlowLayoutKt.f10123a;
            int I11 = interfaceC1166l2.I(iG2);
            this.f10345i = new C0880h(C0880h.a(I11, interfaceC1166l2.k0(I11)));
            this.f10342f = interfaceC1166l2 instanceof androidx.compose.ui.layout.D ? (androidx.compose.ui.layout.D) interfaceC1166l2 : null;
            this.f10343g = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962w)) {
            return false;
        }
        C0962w c0962w = (C0962w) obj;
        return this.f10337a == c0962w.f10337a && this.f10338b == c0962w.f10338b && this.f10339c == c0962w.f10339c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10339c) + p005a4.q.b(this.f10338b, this.f10337a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowLayoutOverflowState(type=");
        sb2.append(this.f10337a);
        sb2.append(", minLinesToShowCollapse=");
        sb2.append(this.f10338b);
        sb2.append(", minCrossAxisSizeToShowCollapse=");
        return C0575j.b(sb2, this.f10339c, ')');
    }
}
