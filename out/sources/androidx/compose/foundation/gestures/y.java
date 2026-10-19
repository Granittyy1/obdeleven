package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Orientation f10056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10057b;

    public y(long j, Orientation orientation) {
        this.f10056a = orientation;
        this.f10057b = j;
    }

    public final long a(androidx.compose.ui.input.pointer.q qVar, float f10) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long jG = I.d.g(this.f10057b, I.d.f(qVar.f14102c, qVar.f14106g));
        this.f10057b = jG;
        Orientation orientation = this.f10056a;
        if ((orientation == null ? I.d.c(jG) : Math.abs(b(jG))) < f10) {
            return 9205357640488583168L;
        }
        if (orientation == null) {
            long j = this.f10057b;
            float fC = I.d.c(j);
            return I.d.f(this.f10057b, I.d.h(f10, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / fC))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / fC)) << 32)));
        }
        float fB = b(this.f10057b) - (Math.signum(b(this.f10057b)) * f10);
        long j10 = this.f10057b;
        Orientation orientation2 = Orientation.f9958c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j10 & 4294967295L : j10 >> 32));
        if (orientation == orientation2) {
            jFloatToRawIntBits = Float.floatToRawIntBits(fB);
            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            iFloatToRawIntBits = Float.floatToRawIntBits(fB);
        }
        return (jFloatToRawIntBits << 32) | (4294967295L & ((long) iFloatToRawIntBits));
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.f10056a == Orientation.f9958c ? j >> 32 : j & 4294967295L));
    }
}
