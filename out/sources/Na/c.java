package Na;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a implements f<Character> {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f4678b != cVar.f4678b || this.f4679c != cVar.f4679c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4678b * 31) + this.f4679c;
    }

    @Override // Na.f
    public final boolean isEmpty() {
        return kotlin.jvm.internal.i.g(this.f4678b, this.f4679c) > 0;
    }

    @Override // Na.f
    public final Comparable k() {
        return Character.valueOf(this.f4678b);
    }

    @Override // Na.f
    public final Comparable q() {
        return Character.valueOf(this.f4679c);
    }

    public final String toString() {
        return this.f4678b + ".." + this.f4679c;
    }
}
