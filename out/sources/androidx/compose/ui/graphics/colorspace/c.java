package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13566c;

    public c(int i10, long j, String str) {
        this.f13564a = str;
        this.f13565b = j;
        this.f13566c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i10);

    public abstract float c(int i10);

    public boolean d() {
        return false;
    }

    public long e(float f10, float f11, float f12) {
        float[] fArrF = f(new float[]{f10, f11, f12});
        return (((long) Float.floatToRawIntBits(fArrF[0])) << 32) | (((long) Float.floatToRawIntBits(fArrF[1])) & 4294967295L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13566c == cVar.f13566c && kotlin.jvm.internal.i.a(this.f13564a, cVar.f13564a)) {
            return b.a(this.f13565b, cVar.f13565b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f10, float f11, float f12) {
        return f(new float[]{f10, f11, f12})[2];
    }

    public long h(float f10, float f11, float f12, float f13, c cVar) {
        int i10 = b.f13563e;
        float[] fArr = new float[(int) (this.f13565b >> 32)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        float[] fArrA = a(fArr);
        return Q3.d.c(fArrA[0], fArrA[1], fArrA[2], f13, cVar);
    }

    public int hashCode() {
        int iHashCode = this.f13564a.hashCode() * 31;
        int i10 = b.f13563e;
        return C4.b.c(this.f13565b, iHashCode, 31) + this.f13566c;
    }

    public final String toString() {
        return this.f13564a + " (id=" + this.f13566c + ", model=" + ((Object) b.b(this.f13565b)) + ')';
    }
}
