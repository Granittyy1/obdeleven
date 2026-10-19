package p114j1;

import p241t7.b;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f41065c = new s(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41067b;

    static {
        new s(0, 0);
    }

    public s(int i10, int i11) {
        b.e((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f41066a = i10;
        this.f41067b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f41066a == sVar.f41066a && this.f41067b == sVar.f41067b;
    }

    public final int hashCode() {
        int i10 = this.f41066a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f41067b;
    }

    public final String toString() {
        return this.f41066a + "x" + this.f41067b;
    }
}
