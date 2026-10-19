package D2;

import android.graphics.Path;

/* JADX INFO: renamed from: D2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ArcMotion.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0674a extends AbstractC0697y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2582d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2585c;

    public static float b(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // D2.AbstractC0697y
    public final Path a(float f10, float f11, float f12, float f13) {
        float fB;
        float fB2;
        float f14;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = (f10 + f12) / 2.0f;
        float f19 = (f11 + f13) / 2.0f;
        float f20 = 0.25f * f17;
        boolean z10 = f11 > f13;
        if (Math.abs(f15) < Math.abs(f16)) {
            float fAbs = Math.abs(f17 / (f16 * 2.0f));
            if (z10) {
                fB2 = fAbs + f13;
                fB = f12;
            } else {
                fB2 = fAbs + f11;
                fB = f10;
            }
            f14 = this.f2584b;
        } else {
            float f21 = f17 / (f15 * 2.0f);
            if (z10) {
                fB2 = f11;
                fB = f21 + f10;
            } else {
                fB = f12 - f21;
                fB2 = f13;
            }
            f14 = this.f2583a;
        }
        float f22 = f20 * f14 * f14;
        float f23 = f18 - fB;
        float f24 = f19 - fB2;
        float f25 = (f24 * f24) + (f23 * f23);
        float f26 = this.f2585c;
        float f27 = f20 * f26 * f26;
        if (f25 >= f22) {
            f22 = f25 > f27 ? f27 : 0.0f;
        }
        if (f22 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f22 / f25);
            fB = Z3.n.b(fB, f18, fSqrt, f18);
            fB2 = Z3.n.b(fB2, f19, fSqrt, f19);
        }
        path.cubicTo((f10 + fB) / 2.0f, (f11 + fB2) / 2.0f, (fB + f12) / 2.0f, (fB2 + f13) / 2.0f, f12, f13);
        return path;
    }
}
