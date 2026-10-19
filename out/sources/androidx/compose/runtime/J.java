package androidx.compose.runtime;

/* JADX INFO: compiled from: JoinedKey.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12858b;

    public J(Integer num, Object obj) {
        this.f12857a = num;
        this.f12858b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return this.f12857a.equals(j.f12857a) && kotlin.jvm.internal.i.a(this.f12858b, j.f12858b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f12857a.hashCode() * 31;
        Object obj = this.f12858b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JoinedKey(left=");
        sb2.append(this.f12857a);
        sb2.append(", right=");
        return B6.c.e(sb2, this.f12858b, ')');
    }
}
