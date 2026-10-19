package androidx.compose.material3.internal;

import A1.C0575j;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.f.b f12522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.f.b f12523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12524c;

    public d(androidx.compose.ui.f.b bVar, androidx.compose.ui.f.b bVar2, int i10) {
        this.f12522a = bVar;
        this.f12523b = bVar2;
        this.f12524c = i10;
    }

    @Override // androidx.compose.material3.internal.y
    public final int a(p013b0.k kVar, long j, int i10) {
        int iA = this.f12523b.a(0, kVar.b());
        return kVar.f20487b + iA + (-this.f12522a.a(0, i10)) + this.f12524c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12522a.equals(dVar.f12522a) && this.f12523b.equals(dVar.f12523b) && this.f12524c == dVar.f12524c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12524c) + O.a.d(this.f12523b.f13405a, Float.hashCode(this.f12522a.f13405a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f12522a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f12523b);
        sb2.append(", offset=");
        return C0575j.b(sb2, this.f12524c, ')');
    }
}
