package Na;

import kotlinx.coroutines.C;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable<Integer>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4689d;

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4687b = i10;
        this.f4688c = C.n(i10, i11, i12);
        this.f4689d = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f4687b != gVar.f4687b || this.f4688c != gVar.f4688c || this.f4689d != gVar.f4689d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4687b * 31) + this.f4688c) * 31) + this.f4689d;
    }

    public boolean isEmpty() {
        int i10 = this.f4689d;
        int i11 = this.f4688c;
        int i12 = this.f4687b;
        if (i10 > 0) {
            if (i12 <= i11) {
                return false;
            }
        } else if (i12 >= i11) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f4688c;
        int i11 = this.f4687b;
        int i12 = this.f4689d;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final h iterator() {
        return new h(this.f4687b, this.f4688c, this.f4689d);
    }
}
