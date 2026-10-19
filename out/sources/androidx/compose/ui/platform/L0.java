package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.Path;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L0 {
    public static final boolean a(androidx.compose.ui.graphics.b0 b0Var, float f10, float f11, Path path, Path path2) {
        float f12;
        float f13;
        boolean zC;
        float f14 = f10;
        if (!(b0Var instanceof androidx.compose.ui.graphics.b0.b)) {
            if (!(b0Var instanceof androidx.compose.ui.graphics.b0.c)) {
                if (b0Var instanceof androidx.compose.ui.graphics.b0.a) {
                    return b(((androidx.compose.ui.graphics.b0.a) b0Var).f13539a, f14, f11, path, path2);
                }
                throw new NoWhenBranchMatchedException();
            }
            I.g gVar = ((androidx.compose.ui.graphics.b0.c) b0Var).f13541a;
            if (f14 < gVar.f3761a) {
                return false;
            }
            float f15 = gVar.f3763c;
            if (f14 >= f15) {
                return false;
            }
            float f16 = gVar.f3762b;
            if (f11 < f16) {
                return false;
            }
            float f17 = gVar.f3764d;
            if (f11 >= f17) {
                return false;
            }
            long j = gVar.f3765e;
            int i10 = (int) (j >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            long j10 = gVar.f3766f;
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) + fIntBitsToFloat <= gVar.b()) {
                long j11 = gVar.f3768h;
                int i12 = (int) (j11 >> 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i12);
                long j12 = gVar.f3767g;
                int i13 = (int) (j12 >> 32);
                if (Float.intBitsToFloat(i13) + fIntBitsToFloat2 <= gVar.b()) {
                    int i14 = (int) (j & 4294967295L);
                    int i15 = (int) (j11 & 4294967295L);
                    if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= gVar.a()) {
                        int i16 = (int) (j10 & 4294967295L);
                        int i17 = (int) (j12 & 4294967295L);
                        if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= gVar.a()) {
                            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                            float f18 = gVar.f3761a;
                            float f19 = fIntBitsToFloat3 + f18;
                            float fIntBitsToFloat4 = Float.intBitsToFloat(i14) + f16;
                            float fIntBitsToFloat5 = f15 - Float.intBitsToFloat(i11);
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i16) + f16;
                            float fIntBitsToFloat7 = f15 - Float.intBitsToFloat(i13);
                            float fIntBitsToFloat8 = f17 - Float.intBitsToFloat(i17);
                            float fIntBitsToFloat9 = f17 - Float.intBitsToFloat(i15);
                            float fIntBitsToFloat10 = Float.intBitsToFloat(i12) + f18;
                            if (f10 < f19) {
                                f13 = f11;
                                if (f13 < fIntBitsToFloat4) {
                                    zC = c(f10, f11, f19, fIntBitsToFloat4, gVar.f3765e);
                                }
                                return zC;
                            }
                            f13 = f11;
                            if (f10 < fIntBitsToFloat10 && f13 > fIntBitsToFloat9) {
                                zC = c(f10, f11, fIntBitsToFloat10, fIntBitsToFloat9, gVar.f3768h);
                            } else if (f10 > fIntBitsToFloat5 && f13 < fIntBitsToFloat6) {
                                zC = c(f10, f11, fIntBitsToFloat5, fIntBitsToFloat6, gVar.f3766f);
                            } else if (f10 > fIntBitsToFloat7 && f13 > fIntBitsToFloat8) {
                                zC = c(f10, f11, fIntBitsToFloat7, fIntBitsToFloat8, gVar.f3767g);
                            }
                            return zC;
                        }
                    }
                }
                f14 = f10;
                f12 = f11;
            } else {
                f12 = f11;
            }
            Path pathA = path2 == null ? C1146w.a() : path2;
            pathA.q(gVar, Path.Direction.f13511b);
            return b(pathA, f14, f12, path, path2);
        }
        I.f fVar = ((androidx.compose.ui.graphics.b0.b) b0Var).f13540a;
        if (fVar.f3757a > f14 || f14 >= fVar.f3759c || fVar.f3758b > f11 || f11 >= fVar.f3760d) {
            return false;
        }
        return true;
    }

    public static final boolean b(Path path, float f10, float f11, Path path2, Path path3) {
        I.f fVar = new I.f(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (path2 == null) {
            path2 = C1146w.a();
        }
        path2.n(fVar, Path.Direction.f13511b);
        if (path3 == null) {
            path3 = C1146w.a();
        }
        path3.p(path, path2, 1);
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    public static final boolean c(float f10, float f11, float f12, float f13, long j) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}
