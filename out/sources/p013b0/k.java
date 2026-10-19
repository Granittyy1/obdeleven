package p013b0;

import A1.C0575j;
import p005a4.q;

/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f20485e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20489d;

    public k(int i10, int i11, int i12, int i13) {
        this.f20486a = i10;
        this.f20487b = i11;
        this.f20488c = i12;
        this.f20489d = i13;
    }

    public final long a() {
        int iD = (d() / 2) + this.f20486a;
        return (((long) ((b() / 2) + this.f20487b)) & 4294967295L) | (((long) iD) << 32);
    }

    public final int b() {
        return this.f20489d - this.f20487b;
    }

    public final long c() {
        return (((long) this.f20486a) << 32) | (((long) this.f20487b) & 4294967295L);
    }

    public final int d() {
        return this.f20488c - this.f20486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f20486a == kVar.f20486a && this.f20487b == kVar.f20487b && this.f20488c == kVar.f20488c && this.f20489d == kVar.f20489d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20489d) + q.b(this.f20488c, q.b(this.f20487b, Integer.hashCode(this.f20486a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f20486a);
        sb2.append(", ");
        sb2.append(this.f20487b);
        sb2.append(", ");
        sb2.append(this.f20488c);
        sb2.append(", ");
        return C0575j.b(sb2, this.f20489d, ')');
    }
}
