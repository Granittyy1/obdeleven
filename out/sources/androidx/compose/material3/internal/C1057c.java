package androidx.compose.material3.internal;

import A1.C0575j;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.material3.internal.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1057c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.f.a f12519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.f.a f12520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12521c;

    public C1057c(androidx.compose.ui.f.a aVar, androidx.compose.ui.f.a aVar2, int i10) {
        this.f12519a = aVar;
        this.f12520b = aVar2;
        this.f12521c = i10;
    }

    @Override // androidx.compose.material3.internal.x
    public final int a(p013b0.k kVar, long j, int i10, LayoutDirection layoutDirection) {
        int iA = this.f12520b.a(0, kVar.d(), layoutDirection);
        int i11 = -this.f12519a.a(0, i10, layoutDirection);
        LayoutDirection layoutDirection2 = LayoutDirection.f15717b;
        int i12 = this.f12521c;
        if (layoutDirection != layoutDirection2) {
            i12 = -i12;
        }
        return kVar.f20486a + iA + i11 + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1057c)) {
            return false;
        }
        C1057c c1057c = (C1057c) obj;
        return this.f12519a.equals(c1057c.f12519a) && this.f12520b.equals(c1057c.f12520b) && this.f12521c == c1057c.f12521c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12521c) + O.a.d(this.f12520b.f13404a, Float.hashCode(this.f12519a.f13404a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f12519a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f12520b);
        sb2.append(", offset=");
        return C0575j.b(sb2, this.f12521c, ')');
    }
}
