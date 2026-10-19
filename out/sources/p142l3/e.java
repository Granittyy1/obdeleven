package p142l3;

import A0.b;

/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes.dex */
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44355b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        if (this.f44354a != null) {
            throw null;
        }
        if (this.f44355b == null) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        String str = this.f44354a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f44355b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f44354a) + " " + ((Object) this.f44355b) + "}";
    }
}
