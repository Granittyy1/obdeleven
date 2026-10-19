package androidx.compose.ui.graphics;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final void a(C1144u c1144u, b0 b0Var) {
        if (b0Var instanceof b0.b) {
            c1144u.n(((b0.b) b0Var).f13540a, Path.Direction.f13511b);
        } else if (b0Var instanceof b0.c) {
            c1144u.q(((b0.c) b0Var).f13541a, Path.Direction.f13511b);
        } else {
            if (!(b0Var instanceof b0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c1144u.s(((b0.a) b0Var).f13539a, 0L);
        }
    }

    public static void b(J.c cVar, b0 b0Var, C c10, float f10) {
        C1144u c1144u;
        J.h hVar = J.h.f3954a;
        if (b0Var instanceof b0.b) {
            I.f fVar = ((b0.b) b0Var).f13540a;
            cVar.z1(c10, (((long) Float.floatToRawIntBits(fVar.f3757a)) << 32) | (((long) Float.floatToRawIntBits(fVar.f3758b)) & 4294967295L), d(fVar), f10, hVar, null, 3);
            return;
        }
        if (b0Var instanceof b0.c) {
            b0.c cVar2 = (b0.c) b0Var;
            c1144u = cVar2.f13542b;
            if (c1144u == null) {
                I.g gVar = cVar2.f13541a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f3768h >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(gVar.f3761a)) << 32) | (((long) Float.floatToRawIntBits(gVar.f3762b)) & 4294967295L);
                float fB = gVar.b();
                float fA = gVar.a();
                cVar.d1(c10, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f10, hVar, null, 3);
                return;
            }
        } else {
            if (!(b0Var instanceof b0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c1144u = ((b0.a) b0Var).f13539a;
        }
        cVar.m1(c1144u, c10, f10, hVar, null, 3);
    }

    public static void c(J.e eVar, b0 b0Var, long j) {
        C1144u c1144u;
        J.h hVar = J.h.f3954a;
        if (b0Var instanceof b0.b) {
            I.f fVar = ((b0.b) b0Var).f13540a;
            eVar.x1(j, (((long) Float.floatToRawIntBits(fVar.f3757a)) << 32) | (((long) Float.floatToRawIntBits(fVar.f3758b)) & 4294967295L), d(fVar), 1.0f, hVar, null, 3);
            return;
        }
        if (b0Var instanceof b0.c) {
            b0.c cVar = (b0.c) b0Var;
            c1144u = cVar.f13542b;
            if (c1144u == null) {
                I.g gVar = cVar.f13541a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f3768h >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(gVar.f3761a)) << 32) | (((long) Float.floatToRawIntBits(gVar.f3762b)) & 4294967295L);
                float fB = gVar.b();
                float fA = gVar.a();
                eVar.R(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), hVar, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(b0Var instanceof b0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c1144u = ((b0.a) b0Var).f13539a;
        }
        eVar.J0(c1144u, j, 1.0f, hVar, null, 3);
    }

    public static final long d(I.f fVar) {
        float f10 = fVar.f3759c - fVar.f3757a;
        return (((long) Float.floatToRawIntBits(fVar.f3760d - fVar.f3758b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }
}
