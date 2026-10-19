package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o0<V extends AbstractC0913m> implements i0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.collection.A f9601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.B f9602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a4.p f9604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9605e = h0.f9549a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f9606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V f9607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V f9608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V f9609i;
    public V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f9610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f9611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0915o f9612m;

    public o0(androidx.collection.A a10, androidx.collection.B b10, int i10, p005a4.p pVar) {
        this.f9601a = a10;
        this.f9602b = b10;
        this.f9603c = i10;
        this.f9604d = pVar;
        float[] fArr = h0.f9550b;
        this.f9606f = fArr;
        this.f9610k = fArr;
        this.f9611l = fArr;
        this.f9612m = h0.f9551c;
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        int[] iArr = h0.f9549a;
        long j10 = (j / 1000000) - ((long) 0);
        long j11 = this.f9603c;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 < 0) {
            return v12;
        }
        j(v10, v11, v12);
        V v13 = this.f9608h;
        kotlin.jvm.internal.i.b(v13);
        if (this.f9612m == h0.f9551c) {
            AbstractC0913m abstractC0913mF = f((j12 - 1) * 1000000, v10, v11, v12);
            AbstractC0913m abstractC0913mF2 = f(j12 * 1000000, v10, v11, v12);
            int iB = abstractC0913mF.b();
            for (int i10 = 0; i10 < iB; i10++) {
                v13.e((abstractC0913mF.a(i10) - abstractC0913mF2.a(i10)) * 1000.0f, i10);
            }
            return v13;
        }
        int i11 = (int) j12;
        float fI = i(h(i11), i11, false);
        float[] fArr = this.f9611l;
        C0915o.a[][] aVarArr = this.f9612m.f9583a;
        float f10 = aVarArr[0][0].f9584a;
        float f11 = aVarArr[aVarArr.length - 1][0].f9585b;
        if (fI < f10) {
            fI = f10;
        }
        if (fI <= f11) {
            f11 = fI;
        }
        int length = fArr.length;
        boolean z10 = false;
        for (C0915o.a[] aVarArr2 : aVarArr) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < length - 1) {
                C0915o.a aVar = aVarArr2[i13];
                if (f11 <= aVar.f9585b) {
                    if (aVar.f9598p) {
                        fArr[i12] = aVar.f9599q;
                        fArr[i12 + 1] = aVar.f9600r;
                    } else {
                        aVar.c(f11);
                        fArr[i12] = aVar.a();
                        fArr[i12 + 1] = aVar.b();
                    }
                    z10 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z10) {
                break;
            }
        }
        int length2 = fArr.length;
        for (int i14 = 0; i14 < length2; i14++) {
            v13.e(fArr[i14], i14);
        }
        return v13;
    }

    @Override // androidx.compose.animation.core.i0
    public final int d() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        V v13;
        V v14;
        V v15 = v10;
        V v16 = v11;
        int i10 = 1;
        int[] iArr = h0.f9549a;
        int i11 = 0;
        long j10 = (j / 1000000) - ((long) 0);
        int i12 = this.f9603c;
        long j11 = i12;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 <= j11) {
            j11 = j10;
        }
        int i13 = (int) j11;
        androidx.collection.B b10 = this.f9602b;
        n0 n0Var = (n0) b10.b(i13);
        if (n0Var != null) {
            return n0Var.f9580a;
        }
        if (i13 >= i12) {
            return v16;
        }
        if (i13 <= 0) {
            return v15;
        }
        j(v15, v16, v12);
        V v17 = this.f9607g;
        kotlin.jvm.internal.i.b(v17);
        if (this.f9612m == h0.f9551c) {
            int iH = h(i13);
            float fI = i(iH, i13, true);
            androidx.collection.A a10 = this.f9601a;
            n0 n0Var2 = (n0) b10.b(a10.a(iH));
            if (n0Var2 != null && (v14 = n0Var2.f9580a) != null) {
                v15 = v14;
            }
            n0 n0Var3 = (n0) b10.b(a10.a(iH + 1));
            if (n0Var3 != null && (v13 = n0Var3.f9580a) != null) {
                v16 = v13;
            }
            int iB = v17.b();
            for (int i14 = 0; i14 < iB; i14++) {
                v17.e((v16.a(i14) * fI) + ((1 - fI) * v15.a(i14)), i14);
            }
            return v17;
        }
        float fI2 = i(h(i13), i13, false);
        float[] fArr = this.f9610k;
        C0915o.a[][] aVarArr = this.f9612m.f9583a;
        int length = aVarArr.length - 1;
        float f10 = aVarArr[0][0].f9584a;
        float f11 = aVarArr[length][0].f9585b;
        int length2 = fArr.length;
        if (fI2 < f10 || fI2 > f11) {
            if (fI2 > f11) {
                f10 = f11;
            } else {
                length = 0;
            }
            float f12 = fI2 - f10;
            int i15 = 0;
            int i16 = 0;
            while (i15 < length2 - 1) {
                C0915o.a aVar = aVarArr[length][i16];
                boolean z10 = aVar.f9598p;
                float f13 = aVar.f9600r;
                float f14 = aVar.f9599q;
                if (z10) {
                    float f15 = aVar.f9584a;
                    float f16 = aVar.f9593k;
                    float f17 = aVar.f9588e;
                    float f18 = aVar.f9586c;
                    fArr[i15] = (f14 * f12) + Z3.n.b(f17, f18, (f10 - f15) * f16, f18);
                    float f19 = (f10 - f15) * f16;
                    float f20 = aVar.f9589f;
                    float f21 = aVar.f9587d;
                    fArr[i15 + 1] = (f13 * f12) + Z3.n.b(f20, f21, f19, f21);
                } else {
                    aVar.c(f10);
                    fArr[i15] = (aVar.a() * f12) + (aVar.f9596n * aVar.f9591h) + f14;
                    fArr[i15 + 1] = (aVar.b() * f12) + (aVar.f9597o * aVar.f9592i) + f13;
                }
                i15 += 2;
                i16++;
                aVarArr = aVarArr;
                length = length;
            }
            i10 = 1;
        } else {
            int length3 = aVarArr.length;
            int i17 = 0;
            boolean z11 = false;
            while (i17 < length3) {
                int i18 = i11;
                int i19 = i18;
                while (i18 < length2 - 1) {
                    C0915o.a aVar2 = aVarArr[i17][i19];
                    if (fI2 <= aVar2.f9585b) {
                        if (aVar2.f9598p) {
                            float f22 = aVar2.f9584a;
                            float f23 = aVar2.f9593k;
                            float f24 = aVar2.f9588e;
                            float f25 = aVar2.f9586c;
                            fArr[i18] = Z3.n.b(f24, f25, (fI2 - f22) * f23, f25);
                            float f26 = (fI2 - f22) * f23;
                            float f27 = aVar2.f9589f;
                            float f28 = aVar2.f9587d;
                            fArr[i18 + 1] = Z3.n.b(f27, f28, f26, f28);
                        } else {
                            aVar2.c(fI2);
                            fArr[i18] = (aVar2.f9596n * aVar2.f9591h) + aVar2.f9599q;
                            fArr[i18 + 1] = (aVar2.f9597o * aVar2.f9592i) + aVar2.f9600r;
                        }
                        z11 = true;
                    }
                    i18 += 2;
                    i10 = 1;
                    i19++;
                }
                if (z11) {
                    break;
                }
                i17 += i10;
                i11 = 0;
            }
        }
        int length4 = fArr.length;
        for (int i20 = 0; i20 < length4; i20 += i10) {
            v17.e(fArr[i20], i20);
        }
        return v17;
    }

    @Override // androidx.compose.animation.core.i0
    public final int g() {
        return this.f9603c;
    }

    public final int h(int i10) {
        int i11;
        androidx.collection.A a10 = this.f9601a;
        int i12 = a10.f9184b;
        if (i12 <= 0) {
            D9.o.r("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = a10.f9183a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i(int i10, int i11, boolean z10) {
        InterfaceC0921v interfaceC0921v;
        float f10;
        androidx.collection.A a10 = this.f9601a;
        if (i10 >= a10.f9184b - 1) {
            f10 = i11;
        } else {
            int iA = a10.a(i10);
            int iA2 = a10.a(i10 + 1);
            if (i11 == iA) {
                f10 = iA;
            } else {
                int i12 = iA2 - iA;
                n0 n0Var = (n0) this.f9602b.b(iA);
                if (n0Var == null || (interfaceC0921v = n0Var.f9581b) == null) {
                    interfaceC0921v = this.f9604d;
                }
                float f11 = i12;
                float fB = interfaceC0921v.b((i11 - iA) / f11);
                if (z10) {
                    return fB;
                }
                f10 = (f11 * fB) + iA;
            }
        }
        return f10 / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(V v10, V v11, V v12) {
        float[] fArr;
        boolean z10 = this.f9612m != h0.f9551c;
        V v13 = this.f9607g;
        androidx.collection.B b10 = this.f9602b;
        androidx.collection.A a10 = this.f9601a;
        if (v13 == null) {
            this.f9607g = (V) v10.c();
            this.f9608h = (V) v12.c();
            int i10 = a10.f9184b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = a10.a(i11) / 1000;
            }
            this.f9606f = fArr2;
            int i12 = a10.f9184b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                n0 n0Var = (n0) b10.b(a10.a(i13));
                int i14 = n0Var != null ? n0Var.f9582c : 0;
                if (i14 != 0) {
                    z10 = true;
                }
                iArr[i13] = i14;
            }
            this.f9605e = iArr;
        }
        if (z10) {
            if (this.f9612m != h0.f9551c && kotlin.jvm.internal.i.a(this.f9609i, v10) && kotlin.jvm.internal.i.a(this.j, v11)) {
                return;
            }
            this.f9609i = v10;
            this.j = v11;
            int iB = v10.b() + (v10.b() % 2);
            this.f9610k = new float[iB];
            this.f9611l = new float[iB];
            int i15 = a10.f9184b;
            float[][] fArr3 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int iA = a10.a(i16);
                n0 n0Var2 = (n0) b10.b(iA);
                if (iA == 0 && n0Var2 == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = v10.a(i17);
                    }
                } else if (iA == this.f9603c && n0Var2 == null) {
                    fArr = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr[i18] = v11.a(i18);
                    }
                } else {
                    kotlin.jvm.internal.i.b(n0Var2);
                    fArr = new float[iB];
                    for (int i19 = 0; i19 < iB; i19++) {
                        fArr[i19] = n0Var2.f9580a.a(i19);
                    }
                }
                fArr3[i16] = fArr;
            }
            this.f9612m = new C0915o(this.f9605e, this.f9606f, fArr3);
        }
    }
}
