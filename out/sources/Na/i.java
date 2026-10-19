package Na;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends g implements f<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4694e = new i(1, 0, 1);

    public final boolean A(int i10) {
        return this.f4687b <= i10 && i10 <= this.f4688c;
    }

    @Override // Na.g
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (this.f4687b == iVar.f4687b) {
                    if (this.f4688c == iVar.f4688c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // Na.g
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4687b * 31) + this.f4688c;
    }

    @Override // Na.g, Na.f
    public final boolean isEmpty() {
        return this.f4687b > this.f4688c;
    }

    @Override // Na.f
    public final Comparable k() {
        return Integer.valueOf(this.f4687b);
    }

    @Override // Na.f
    public final Comparable q() {
        return Integer.valueOf(this.f4688c);
    }

    @Override // Na.g
    public final String toString() {
        return this.f4687b + ".." + this.f4688c;
    }
}
