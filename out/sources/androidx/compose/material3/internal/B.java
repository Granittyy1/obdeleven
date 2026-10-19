package androidx.compose.material3.internal;

import A1.C0575j;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.e.a f12482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12483b;

    public B(androidx.compose.ui.e.a aVar, int i10) {
        this.f12482a = aVar;
        this.f12483b = i10;
    }

    @Override // androidx.compose.material3.internal.x
    public final int a(p013b0.k kVar, long j, int i10, LayoutDirection layoutDirection) {
        int i11 = (int) (j >> 32);
        int i12 = this.f12483b;
        if (i10 < i11 - (i12 * 2)) {
            return Na.l.D(this.f12482a.a(i10, i11, layoutDirection), i12, (i11 - i12) - i10);
        }
        return C1293h.f(1, layoutDirection != LayoutDirection.f15717b ? 0.0f * (-1) : 0.0f, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f12482a.equals(b10.f12482a) && this.f12483b == b10.f12483b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12483b) + (Float.hashCode(this.f12482a.f13401a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(alignment=");
        sb2.append(this.f12482a);
        sb2.append(", margin=");
        return C0575j.b(sb2, this.f12483b, ')');
    }
}
