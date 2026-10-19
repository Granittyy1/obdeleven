package androidx.compose.material3.internal;

import A1.C0575j;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.f.b f12484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12485b;

    public C(androidx.compose.ui.f.b bVar, int i10) {
        this.f12484a = bVar;
        this.f12485b = i10;
    }

    @Override // androidx.compose.material3.internal.y
    public final int a(p013b0.k kVar, long j, int i10) {
        int i11 = (int) (j & 4294967295L);
        int i12 = this.f12485b;
        if (i10 < i11 - (i12 * 2)) {
            return Na.l.D(this.f12484a.a(i10, i11), i12, (i11 - i12) - i10);
        }
        return C1293h.f(1, 0.0f, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f12484a.equals(c10.f12484a) && this.f12485b == c10.f12485b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12485b) + (Float.hashCode(this.f12484a.f13405a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f12484a);
        sb2.append(", margin=");
        return C0575j.b(sb2, this.f12485b, ')');
    }
}
