package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1248u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15095a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f15096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.graphics.b0 f15097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1144u f15098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f15099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Path f15102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I.g f15103i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15106m;

    public C1248u0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f15096b = outline;
        this.f15104k = 0L;
        this.f15105l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    public final void a(androidx.compose.ui.graphics.E e10) {
        e();
        Path path = this.f15099e;
        if (path != null) {
            e10.l(path, 1);
            return;
        }
        float f10 = this.j;
        if (f10 <= 0.0f) {
            e10.k(Float.intBitsToFloat((int) (this.f15104k >> 32)), Float.intBitsToFloat((int) (this.f15104k & 4294967295L)), Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32)), Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L)), 1);
            return;
        }
        Path pathA = this.f15102h;
        I.g gVar = this.f15103i;
        if (pathA != null) {
            long j = this.f15104k;
            long j10 = this.f15105l;
            if (gVar == null || !kotlinx.coroutines.C.r(gVar)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f15104k >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                float f11 = this.j;
                I.g gVarD = kotlinx.coroutines.C.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f11))));
                if (pathA == null) {
                    pathA = C1146w.a();
                } else {
                    pathA.reset();
                }
                pathA.q(gVarD, Path.Direction.f13511b);
                this.f15103i = gVarD;
                this.f15102h = pathA;
            } else {
                int i10 = (int) (j >> 32);
                if (gVar.f3761a == Float.intBitsToFloat(i10)) {
                    int i11 = (int) (j & 4294967295L);
                    if (gVar.f3762b == Float.intBitsToFloat(i11)) {
                        if (gVar.f3763c == Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10)) {
                            if (gVar.f3764d != Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11) || Float.intBitsToFloat((int) (gVar.f3765e >> 32)) != f10) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.f15104k >> 32));
                                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
                                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                                float f12 = this.j;
                                I.g gVarD2 = kotlinx.coroutines.C.d(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, (((long) Float.floatToRawIntBits(f12)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f12))));
                                if (pathA == null) {
                                    pathA = C1146w.a();
                                } else {
                                    pathA.reset();
                                }
                                pathA.q(gVarD2, Path.Direction.f13511b);
                                this.f15103i = gVarD2;
                                this.f15102h = pathA;
                            }
                        } else {
                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (this.f15104k >> 32));
                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
                            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                            float f13 = this.j;
                            I.g gVarD3 = kotlinx.coroutines.C.d(fIntBitsToFloat9, fIntBitsToFloat10, fIntBitsToFloat11, fIntBitsToFloat12, (((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13))));
                            if (pathA == null) {
                                pathA = C1146w.a();
                            } else {
                                pathA.reset();
                            }
                            pathA.q(gVarD3, Path.Direction.f13511b);
                            this.f15103i = gVarD3;
                            this.f15102h = pathA;
                        }
                    } else {
                        float fIntBitsToFloat13 = Float.intBitsToFloat((int) (this.f15104k >> 32));
                        float fIntBitsToFloat14 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                        float fIntBitsToFloat15 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
                        float fIntBitsToFloat16 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                        float f14 = this.j;
                        I.g gVarD4 = kotlinx.coroutines.C.d(fIntBitsToFloat13, fIntBitsToFloat14, fIntBitsToFloat15, fIntBitsToFloat16, (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14))));
                        if (pathA == null) {
                            pathA = C1146w.a();
                        } else {
                            pathA.reset();
                        }
                        pathA.q(gVarD4, Path.Direction.f13511b);
                        this.f15103i = gVarD4;
                        this.f15102h = pathA;
                    }
                } else {
                    float fIntBitsToFloat17 = Float.intBitsToFloat((int) (this.f15104k >> 32));
                    float fIntBitsToFloat18 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                    float fIntBitsToFloat19 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
                    float fIntBitsToFloat110 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
                    float f15 = this.j;
                    I.g gVarD5 = kotlinx.coroutines.C.d(fIntBitsToFloat17, fIntBitsToFloat18, fIntBitsToFloat19, fIntBitsToFloat110, (((long) Float.floatToRawIntBits(f15)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f15))));
                    if (pathA == null) {
                        pathA = C1146w.a();
                    } else {
                        pathA.reset();
                    }
                    pathA.q(gVarD5, Path.Direction.f13511b);
                    this.f15103i = gVarD5;
                    this.f15102h = pathA;
                }
            }
        } else {
            float fIntBitsToFloat111 = Float.intBitsToFloat((int) (this.f15104k >> 32));
            float fIntBitsToFloat112 = Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
            float fIntBitsToFloat113 = Float.intBitsToFloat((int) (this.f15105l >> 32)) + Float.intBitsToFloat((int) (this.f15104k >> 32));
            float fIntBitsToFloat114 = Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) + Float.intBitsToFloat((int) (this.f15104k & 4294967295L));
            float f16 = this.j;
            I.g gVarD6 = kotlinx.coroutines.C.d(fIntBitsToFloat111, fIntBitsToFloat112, fIntBitsToFloat113, fIntBitsToFloat114, (((long) Float.floatToRawIntBits(f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f16))));
            if (pathA == null) {
                pathA = C1146w.a();
            } else {
                pathA.reset();
            }
            pathA.q(gVarD6, Path.Direction.f13511b);
            this.f15103i = gVarD6;
            this.f15102h = pathA;
        }
        e10.l(pathA, 1);
    }

    public final Outline b() {
        e();
        if (this.f15106m && this.f15095a) {
            return this.f15096b;
        }
        return null;
    }

    public final boolean c(long j) {
        androidx.compose.ui.graphics.b0 b0Var;
        if (this.f15106m && (b0Var = this.f15097c) != null) {
            return L0.a(b0Var, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), null, null);
        }
        return true;
    }

    public final boolean d(androidx.compose.ui.graphics.b0 b0Var, float f10, boolean z10, float f11, long j) {
        this.f15096b.setAlpha(f10);
        boolean zA = kotlin.jvm.internal.i.a(this.f15097c, b0Var);
        boolean z11 = !zA;
        if (!zA) {
            this.f15097c = b0Var;
            this.f15100f = true;
        }
        this.f15105l = j;
        boolean z12 = b0Var != null && (z10 || f11 > 0.0f);
        if (this.f15106m != z12) {
            this.f15106m = z12;
            this.f15100f = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f15100f) {
            this.f15104k = 0L;
            this.j = 0.0f;
            this.f15099e = null;
            this.f15100f = false;
            this.f15101g = false;
            androidx.compose.ui.graphics.b0 b0Var = this.f15097c;
            Outline outline = this.f15096b;
            if (b0Var == null || !this.f15106m || Float.intBitsToFloat((int) (this.f15105l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f15105l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f15095a = true;
            if (b0Var instanceof androidx.compose.ui.graphics.b0.b) {
                I.f fVar = ((androidx.compose.ui.graphics.b0.b) b0Var).f13540a;
                long jFloatToRawIntBits = Float.floatToRawIntBits(fVar.f3757a);
                float f10 = fVar.f3758b;
                this.f15104k = (jFloatToRawIntBits << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                float f11 = fVar.f3759c;
                float f12 = fVar.f3757a;
                float f13 = fVar.f3760d;
                this.f15105l = (((long) Float.floatToRawIntBits(f13 - f10)) & 4294967295L) | (Float.floatToRawIntBits(f11 - f12) << 32);
                outline.setRect(Math.round(f12), Math.round(f10), Math.round(f11), Math.round(f13));
                return;
            }
            if (!(b0Var instanceof androidx.compose.ui.graphics.b0.c)) {
                if (b0Var instanceof androidx.compose.ui.graphics.b0.a) {
                    f(((androidx.compose.ui.graphics.b0.a) b0Var).f13539a);
                    return;
                }
                return;
            }
            I.g gVar = ((androidx.compose.ui.graphics.b0.c) b0Var).f13541a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (gVar.f3765e >> 32));
            float f14 = gVar.f3761a;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f14);
            float f15 = gVar.f3762b;
            this.f15104k = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
            float fB = gVar.b();
            this.f15105l = (((long) Float.floatToRawIntBits(gVar.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (kotlinx.coroutines.C.r(gVar)) {
                this.f15096b.setRoundRect(Math.round(f14), Math.round(f15), Math.round(gVar.f3763c), Math.round(gVar.f3764d), fIntBitsToFloat);
                this.j = fIntBitsToFloat;
                return;
            }
            C1144u c1144uA = this.f15098d;
            if (c1144uA == null) {
                c1144uA = C1146w.a();
                this.f15098d = c1144uA;
            }
            c1144uA.reset();
            c1144uA.q(gVar, Path.Direction.f13511b);
            f(c1144uA);
        }
    }

    public final void f(Path path) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f15096b;
        if (i10 > 28 || path.b()) {
            if (i10 >= 30) {
                C1250v0.f15108a.a(outline, path);
            } else {
                if (!(path instanceof C1144u)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C1144u) path).f13800a);
            }
            this.f15101g = !outline.canClip();
        } else {
            this.f15095a = false;
            outline.setEmpty();
            this.f15101g = true;
        }
        this.f15099e = path;
    }
}
