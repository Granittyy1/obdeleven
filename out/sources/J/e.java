package J;

import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.W;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public interface e extends p013b0.c {
    static /* synthetic */ void D0(e eVar, Path path, C c10, float f10, i iVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        f fVar = iVar;
        if ((i10 & 8) != 0) {
            fVar = h.f3954a;
        }
        eVar.m1(path, c10, f11, fVar, null, (i10 & 32) != 0 ? 3 : 0);
    }

    static long K0(long j, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void M(c cVar, C c10, long j, long j10, long j11, f fVar, int i10) {
        long j12 = (i10 & 2) != 0 ? 0L : j;
        cVar.d1(c10, j12, (i10 & 4) != 0 ? K0(cVar.j(), j12) : j10, j11, 1.0f, (i10 & 32) != 0 ? h.f3954a : fVar, null, 3);
    }

    static /* synthetic */ void N(e eVar, Path path, long j, f fVar, A a10, int i10) {
        if ((i10 & 8) != 0) {
            fVar = h.f3954a;
        }
        f fVar2 = fVar;
        if ((i10 & 16) != 0) {
            a10 = null;
        }
        eVar.J0(path, j, 1.0f, fVar2, a10, 3);
    }

    static /* synthetic */ void m0(c cVar, C c10, long j, long j10, float f10, f fVar, int i10) {
        long j11 = (i10 & 2) != 0 ? 0L : j;
        cVar.z1(c10, j11, (i10 & 4) != 0 ? K0(cVar.j(), j11) : j10, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? h.f3954a : fVar, null, 3);
    }

    static /* synthetic */ void s0(e eVar, long j, long j10, long j11, float f10, int i10) {
        long j12 = (i10 & 2) != 0 ? 0L : j10;
        eVar.x1(j, j12, (i10 & 4) != 0 ? K0(eVar.j(), j12) : j11, (i10 & 8) != 0 ? 1.0f : f10, h.f3954a, null, (i10 & 64) != 0 ? 3 : 0);
    }

    static void t1(e eVar, W w3, long j, long j10, long j11, long j12, float f10, f fVar, I i10, int i11, int i12, int i13) {
        eVar.L(w3, (i13 & 2) != 0 ? 0L : j, j10, (i13 & 8) != 0 ? 0L : j11, (i13 & 16) != 0 ? j10 : j12, (i13 & 32) != 0 ? 1.0f : f10, (i13 & 64) != 0 ? h.f3954a : fVar, i10, (i13 & 256) != 0 ? 3 : i11, (i13 & 512) != 0 ? 1 : i12);
    }

    void B0(long j, float f10, float f11, long j10, long j11, float f12, f fVar, I i10, int i11);

    void J0(Path path, long j, float f10, f fVar, I i10, int i11);

    default void L(W w3, long j, long j10, long j11, long j12, float f10, f fVar, I i10, int i11, int i12) {
        t1(this, w3, j, j10, j11, j12, f10, fVar, i10, i11, 0, 512);
    }

    void Q0(long j, long j10, long j11, float f10, int i10, p019b6.d dVar, float f11, I i11, int i12);

    void R(long j, long j10, long j11, long j12, f fVar, float f10, I i10, int i11);

    void S(long j, float f10, long j10, float f11, f fVar, I i10, int i11);

    a.b W0();

    void d1(C c10, long j, long j10, long j11, float f10, f fVar, I i10, int i11);

    void f0(C c10, long j, long j10, float f10, int i10, p019b6.d dVar, float f11, I i11, int i12);

    LayoutDirection getLayoutDirection();

    default long j() {
        return W0().e();
    }

    default long j1() {
        return Cb.a.g(W0().e());
    }

    void k1(W w3, long j, float f10, f fVar, I i10, int i11);

    void m1(Path path, C c10, float f10, f fVar, I i10, int i11);

    void x1(long j, long j10, long j11, float f10, f fVar, I i10, int i11);

    void z1(C c10, long j, long j10, float f10, f fVar, I i10, int i11);
}
