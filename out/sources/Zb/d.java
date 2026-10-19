package Zb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Matrix.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final d j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f7978k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f7979l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f7980m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f7982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f7983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f7984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f7985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f7986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f7987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f7988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f7989i;

    public d(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f7981a = d14;
        this.f7982b = d15;
        this.f7983c = d16;
        this.f7984d = d10;
        this.f7985e = d11;
        this.f7986f = d12;
        this.f7987g = d13;
        this.f7988h = d17;
        this.f7989i = d18;
    }

    public final void a(ByteBuffer byteBuffer) {
        C6.b.g(byteBuffer, this.f7984d);
        C6.b.g(byteBuffer, this.f7985e);
        C6.b.f(byteBuffer, this.f7981a);
        C6.b.g(byteBuffer, this.f7986f);
        C6.b.g(byteBuffer, this.f7987g);
        C6.b.f(byteBuffer, this.f7982b);
        C6.b.g(byteBuffer, this.f7988h);
        C6.b.g(byteBuffer, this.f7989i);
        C6.b.f(byteBuffer, this.f7983c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Double.compare(dVar.f7984d, this.f7984d) == 0 && Double.compare(dVar.f7985e, this.f7985e) == 0 && Double.compare(dVar.f7986f, this.f7986f) == 0 && Double.compare(dVar.f7987g, this.f7987g) == 0 && Double.compare(dVar.f7988h, this.f7988h) == 0 && Double.compare(dVar.f7989i, this.f7989i) == 0 && Double.compare(dVar.f7981a, this.f7981a) == 0 && Double.compare(dVar.f7982b, this.f7982b) == 0 && Double.compare(dVar.f7983c, this.f7983c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f7981a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f7982b);
        int i10 = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f7983c);
        int i11 = (i10 * 31) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f7984d);
        int i12 = (i11 * 31) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f7985e);
        int i13 = (i12 * 31) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f7986f);
        int i14 = (i13 * 31) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)));
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f7987g);
        int i15 = (i14 * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f7988h);
        int i16 = (i15 * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)));
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f7989i);
        return (i16 * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(f7978k)) {
            return "Rotate 90°";
        }
        if (equals(f7979l)) {
            return "Rotate 180°";
        }
        if (equals(f7980m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f7981a + ", v=" + this.f7982b + ", w=" + this.f7983c + ", a=" + this.f7984d + ", b=" + this.f7985e + ", c=" + this.f7986f + ", d=" + this.f7987g + ", tx=" + this.f7988h + ", ty=" + this.f7989i + '}';
    }
}
