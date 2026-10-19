package kotlin.collections;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f43023b;

    public s(int i10, T t8) {
        this.f43022a = i10;
        this.f43023b = t8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f43022a == sVar.f43022a && kotlin.jvm.internal.i.a(this.f43023b, sVar.f43023b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f43022a) * 31;
        T t8 = this.f43023b;
        return iHashCode + (t8 == null ? 0 : t8.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndexedValue(index=");
        sb2.append(this.f43022a);
        sb2.append(", value=");
        return B6.c.e(sb2, this.f43023b, ')');
    }
}
