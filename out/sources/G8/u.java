package G8;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3544b;

    public u(int i10, int i11) {
        this.f3543a = i10;
        this.f3544b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3543a == uVar.f3543a && this.f3544b == uVar.f3544b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3544b) + (Integer.hashCode(this.f3543a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(from=");
        sb2.append(this.f3543a);
        sb2.append(", to=");
        return p005a4.q.c(sb2, this.f3544b, ")");
    }
}
