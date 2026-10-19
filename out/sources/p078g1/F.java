package p078g1;

import p114j1.A;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f35228d = new F(0, 0, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35231c;

    static {
        A.B(0);
        A.B(1);
        A.B(3);
    }

    public F(int i10, int i11, float f10) {
        this.f35229a = i10;
        this.f35230b = i11;
        this.f35231c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return this.f35229a == f10.f35229a && this.f35230b == f10.f35230b && this.f35231c == f10.f35231c;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f35231c) + ((((217 + this.f35229a) * 31) + this.f35230b) * 31);
    }
}
