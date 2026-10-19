package p222s0;

import A1.C0575j;
import android.graphics.Insets;

/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f46850e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46854d;

    /* JADX INFO: compiled from: Insets.java */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f46851a = i10;
        this.f46852b = i11;
        this.f46853c = i12;
        this.f46854d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f46851a, bVar2.f46851a), Math.max(bVar.f46852b, bVar2.f46852b), Math.max(bVar.f46853c, bVar2.f46853c), Math.max(bVar.f46854d, bVar2.f46854d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f46850e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f46851a, this.f46852b, this.f46853c, this.f46854d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f46854d == bVar.f46854d && this.f46851a == bVar.f46851a && this.f46853c == bVar.f46853c && this.f46852b == bVar.f46852b;
    }

    public final int hashCode() {
        return (((((this.f46851a * 31) + this.f46852b) * 31) + this.f46853c) * 31) + this.f46854d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f46851a);
        sb2.append(", top=");
        sb2.append(this.f46852b);
        sb2.append(", right=");
        sb2.append(this.f46853c);
        sb2.append(", bottom=");
        return C0575j.b(sb2, this.f46854d, '}');
    }
}
