package androidx.compose.ui.spatial;

import C.e;
import android.os.Handler;
import android.os.Trace;
import androidx.collection.B;
import androidx.collection.I;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.T;
import p013b0.j;
import p293xa.r;

/* JADX INFO: compiled from: RectManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I<Ia.a<r>> f15261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.ui.b f15265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ia.a<r> f15267i;
    public final I.c j;

    public b() {
        a aVar = new a();
        aVar.f15256a = new long[192];
        aVar.f15257b = new long[192];
        this.f15259a = aVar;
        this.f15260b = new c();
        this.f15261c = new I<>((Object) null);
        this.f15266h = -1L;
        this.f15267i = new Ia.a<r>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                b bVar = this.this$0;
                bVar.f15265g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    r rVar = r.f47939a;
                    return r.f47939a;
                } finally {
                    Trace.endSection();
                }
            }
        };
        this.j = new I.c();
    }

    public static long g(LayoutNode layoutNode) {
        float[] fArrMo4getUnderlyingMatrixsQKQjiQ;
        int iB;
        K k10 = layoutNode.f14389G;
        NodeCoordinator nodeCoordinator = k10.f14366c;
        NodeCoordinator nodeCoordinator2 = k10.f14365b;
        long jK = 0;
        while (nodeCoordinator2 != null && nodeCoordinator2 != nodeCoordinator) {
            T t8 = nodeCoordinator2.f14523J;
            jK = Cb.a.k(jK, nodeCoordinator2.f14514A);
            nodeCoordinator2 = nodeCoordinator2.f14529r;
            if (t8 != null && (iB = e.b((fArrMo4getUnderlyingMatrixsQKQjiQ = t8.mo4getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iB & 2) == 0) {
                    return 9223372034707292159L;
                }
                jK = a0.b(jK, fArrMo4getUnderlyingMatrixsQKQjiQ);
            }
        }
        return Cb.a.l(jK);
    }

    public final void a() {
        boolean z10;
        long j;
        c.a aVar;
        c cVar;
        int i10;
        int i11;
        Handler handler = androidx.compose.ui.c.f13306a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f15262d;
        boolean z12 = z11 || this.f15263e;
        a aVar2 = this.f15259a;
        c cVar2 = this.f15260b;
        if (z11) {
            this.f15262d = false;
            I<Ia.a<r>> i12 = this.f15261c;
            Object[] objArr = i12.f9108a;
            int i13 = i12.f9109b;
            for (int i14 = 0; i14 < i13; i14++) {
                ((Ia.a) objArr[i14]).invoke();
            }
            long[] jArr = aVar2.f15256a;
            int i15 = aVar2.f15258c;
            int i16 = 0;
            while (i16 < jArr.length - 2 && i16 < i15) {
                boolean z13 = z12;
                long j10 = jArr[i16 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    long j11 = jArr[i16];
                    long j12 = jArr[i16 + 1];
                    for (c.a aVarB = cVar2.f15268a.b(((int) j10) & 67108863); aVarB != null; aVarB = null) {
                        if (jCurrentTimeMillis - aVarB.f15272a >= 0) {
                            aVarB.f15272a = jCurrentTimeMillis;
                            C1185f.d(null, 2);
                            throw null;
                        }
                    }
                }
                i16 += 3;
                z12 = z13;
            }
            z10 = z12;
            long[] jArr2 = aVar2.f15256a;
            int i17 = aVar2.f15258c;
            for (int i18 = 0; i18 < jArr2.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                jArr2[i19] = jArr2[i19] & (-2305843009213693953L);
            }
        } else {
            z10 = z12;
        }
        long j13 = 128;
        long j14 = 255;
        if (this.f15263e) {
            this.f15263e = false;
            long j15 = jCurrentTimeMillis;
            long j16 = cVar2.f15270c;
            B<c.a> b10 = cVar2.f15268a;
            Object[] objArr2 = b10.f9188c;
            long[] jArr3 = b10.f9186a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                cVar = cVar2;
                int i20 = 0;
                while (true) {
                    long j17 = jArr3[i20];
                    long[] jArr4 = jArr3;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8 - ((~(i20 - length)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j17 & j14) < j13) {
                                for (c.a aVar3 = (c.a) objArr2[(i20 << 3) + i22]; aVar3 != null; aVar3 = null) {
                                    if (j15 - aVar3.f15272a > 0) {
                                        aVar3.f15272a = j15;
                                        C1185f.d(null, 2);
                                        throw null;
                                    }
                                }
                            }
                            j17 >>= 8;
                            i22++;
                            j15 = j15;
                            j13 = 128;
                            j14 = 255;
                        }
                        j = j15;
                        aVar = null;
                        if (i21 != 8) {
                            break;
                        }
                    } else {
                        j = j15;
                        aVar = null;
                    }
                    if (i20 == length) {
                        break;
                    }
                    i20++;
                    j15 = j;
                    jArr3 = jArr4;
                    j13 = 128;
                    j14 = 255;
                }
            } else {
                aVar = null;
                cVar = cVar2;
                j = j15;
            }
        } else {
            j = jCurrentTimeMillis;
            aVar = null;
            cVar = cVar2;
        }
        if (z10) {
            cVar.getClass();
        }
        if (this.f15264f) {
            i10 = 0;
            this.f15264f = false;
            long[] jArr5 = aVar2.f15256a;
            int i23 = aVar2.f15258c;
            long[] jArr6 = aVar2.f15257b;
            int i24 = 0;
            for (int i25 = 0; i25 < jArr5.length - 2 && i24 < jArr6.length - 2 && i25 < i23; i25 += 3) {
                int i26 = i25 + 2;
                if (jArr5[i26] != 2305843009213693951L) {
                    jArr6[i24] = jArr5[i25];
                    jArr6[i24 + 1] = jArr5[i25 + 1];
                    jArr6[i24 + 2] = jArr5[i26];
                    i24 += 3;
                }
            }
            aVar2.f15258c = i24;
            aVar2.f15256a = jArr6;
            aVar2.f15257b = jArr5;
        } else {
            i10 = 0;
        }
        c cVar3 = cVar;
        if (cVar3.f15269b > j) {
            return;
        }
        B<c.a> b11 = cVar3.f15268a;
        Object[] objArr3 = b11.f9188c;
        long[] jArr7 = b11.f9186a;
        int length2 = jArr7.length - 2;
        if (length2 >= 0) {
            int i27 = i10;
            while (true) {
                long j18 = jArr7[i27];
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                    long j19 = j18;
                    for (int i29 = i10; i29 < i28; i29++) {
                        if ((j19 & 255) < 128) {
                            for (c.a aVar4 = (c.a) objArr3[(i27 << 3) + i29]; aVar4 != null; aVar4 = aVar) {
                            }
                        }
                        j19 >>= 8;
                    }
                    i11 = 1;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    i11 = 1;
                }
                if (i27 == length2) {
                    break;
                } else {
                    i27 += i11;
                }
            }
        }
        cVar3.f15269b = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00de  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e3  */
    public final void b(LayoutNode layoutNode, long j, boolean z10) {
        LayoutNode layoutNodeG;
        int i10;
        NodeCoordinator nodeCoordinator = layoutNode.f14389G.f14366c;
        MeasurePassDelegate measurePassDelegate = layoutNode.f14390H.f14641p;
        int i11 = (int) (j >> 32);
        float f10 = i11;
        int i12 = (int) (j & 4294967295L);
        float fO0 = i11 + measurePassDelegate.o0();
        float fL0 = i12 + measurePassDelegate.l0();
        I.c cVar = this.j;
        cVar.f3750a = f10;
        cVar.f3751b = i12;
        cVar.f3752c = fO0;
        cVar.f3753d = fL0;
        while (nodeCoordinator != null) {
            T t8 = nodeCoordinator.f14523J;
            long j10 = nodeCoordinator.f14514A;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            cVar.f3750a += fIntBitsToFloat;
            cVar.f3751b += fIntBitsToFloat2;
            cVar.f3752c += fIntBitsToFloat;
            cVar.f3753d += fIntBitsToFloat2;
            nodeCoordinator = nodeCoordinator.f14529r;
            if (t8 != null) {
                float[] fArrMo4getUnderlyingMatrixsQKQjiQ = t8.mo4getUnderlyingMatrixsQKQjiQ();
                if (!F8.a.h(fArrMo4getUnderlyingMatrixsQKQjiQ)) {
                    a0.c(fArrMo4getUnderlyingMatrixsQKQjiQ, cVar);
                }
            }
        }
        int i13 = (int) cVar.f3750a;
        int i14 = (int) cVar.f3751b;
        int i15 = (int) cVar.f3752c;
        int i16 = (int) cVar.f3753d;
        int i17 = layoutNode.f14401c;
        a aVar = this.f15259a;
        if (z10) {
            layoutNodeG = layoutNode.G();
            if (layoutNodeG != null) {
                i10 = layoutNodeG.f14401c;
            } else {
                i10 = -1;
            }
            a.a(aVar, i17, i13, i14, i15, i16, i10);
        } else {
            int i18 = i17 & 67108863;
            long[] jArr = aVar.f15256a;
            int i19 = aVar.f15258c;
            int i20 = 0;
            while (true) {
                if (i20 >= jArr.length - 2 || i20 >= i19) {
                    layoutNodeG = layoutNode.G();
                    if (layoutNodeG != null) {
                        i10 = layoutNodeG.f14401c;
                    } else {
                        i10 = -1;
                    }
                    a.a(aVar, i17, i13, i14, i15, i16, i10);
                } else {
                    int i21 = i20 + 2;
                    long j11 = jArr[i21];
                    if ((((int) j11) & 67108863) == i18) {
                        jArr[i20] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
                        jArr[i20 + 1] = (((long) i15) << 32) | (((long) i16) & 4294967295L);
                        jArr[i21] = j11 | 2305843009213693952L;
                    } else {
                        i20 += 3;
                    }
                }
            }
        }
        this.f15262d = true;
    }

    public final void c(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            b(layoutNode2, layoutNode2.f14389G.f14366c.f14514A, false);
            c(layoutNode2);
        }
    }

    public final void d(LayoutNode layoutNode) {
        this.f15262d = true;
        int i10 = layoutNode.f14401c & 67108863;
        a aVar = this.f15259a;
        long[] jArr = aVar.f15256a;
        int i11 = aVar.f15258c;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j = jArr[i13];
            if ((((int) j) & 67108863) == i10) {
                jArr[i13] = 2305843009213693952L | j;
                break;
            }
        }
        androidx.compose.ui.b bVar = this.f15265g;
        boolean z10 = bVar != null;
        long j10 = this.f15260b.f15269b;
        if (j10 >= 0 || !z10) {
            if (this.f15266h == j10 && z10) {
                return;
            }
            if (bVar != null) {
                Handler handler = androidx.compose.ui.c.f13306a;
                androidx.compose.ui.c.f13306a.removeCallbacks(bVar);
            }
            Handler handler2 = androidx.compose.ui.c.f13306a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j10, ((long) 16) + jCurrentTimeMillis);
            this.f15266h = jMax;
            androidx.compose.ui.b bVar2 = new androidx.compose.ui.b(0, this.f15267i);
            androidx.compose.ui.c.f13306a.postDelayed(bVar2, jMax - jCurrentTimeMillis);
            this.f15265g = bVar2;
        }
    }

    public final void e(LayoutNode layoutNode) {
        long jG = g(layoutNode);
        if (j.b(jG, 9223372034707292159L)) {
            c(layoutNode);
            return;
        }
        layoutNode.f14404f = jG;
        layoutNode.f14405g = false;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            f(layoutNode2, layoutNode2.f14389G.f14366c.f14514A, false);
        }
        d(layoutNode);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0243  */
    /* JADX WARN: Code duplicated, block: B:77:0x0248  */
    public final void f(LayoutNode layoutNode, long j, boolean z10) {
        long j10;
        int i10;
        long jL;
        boolean zB;
        LayoutNode layoutNodeG;
        int i11;
        char c10;
        int i12;
        char c11;
        float[] fArrMo4getUnderlyingMatrixsQKQjiQ;
        int iB;
        MeasurePassDelegate measurePassDelegate = layoutNode.f14390H.f14641p;
        int iO0 = measurePassDelegate.o0();
        int iL0 = measurePassDelegate.l0();
        LayoutNode layoutNodeG2 = layoutNode.G();
        long j11 = layoutNode.f14402d;
        long j12 = layoutNode.f14403e;
        int i13 = (int) (j12 >> 32);
        int i14 = (int) (j12 & 4294967295L);
        if (layoutNodeG2 != null) {
            boolean z11 = layoutNodeG2.f14405g;
            i10 = i13;
            long j13 = layoutNodeG2.f14402d;
            j10 = j11;
            long jG = layoutNodeG2.f14404f;
            if (j.b(j13, 9223372034707292159L)) {
                NodeCoordinator nodeCoordinator = layoutNode.f14389G.f14366c;
                long jK = 0;
                while (true) {
                    if (nodeCoordinator == null) {
                        jL = Cb.a.l(jK);
                        break;
                    }
                    T t8 = nodeCoordinator.f14523J;
                    jK = Cb.a.k(jK, nodeCoordinator.f14514A);
                    nodeCoordinator = nodeCoordinator.f14529r;
                    if (t8 != null && (iB = e.b((fArrMo4getUnderlyingMatrixsQKQjiQ = t8.mo4getUnderlyingMatrixsQKQjiQ()))) != 3) {
                        if ((iB & 2) == 0) {
                            jL = 9223372034707292159L;
                            break;
                        }
                        jK = a0.b(jK, fArrMo4getUnderlyingMatrixsQKQjiQ);
                    }
                }
            } else {
                if (z11) {
                    jG = g(layoutNodeG2);
                    layoutNodeG2.f14404f = jG;
                    layoutNodeG2.f14405g = false;
                }
                zB = j.b(jG, 9223372034707292159L);
                jL = j.d(j.d(j13, jG), j);
            }
            if (!zB || j.b(jL, 9223372034707292159L)) {
                b(layoutNode, j, z10);
            }
            layoutNode.f14402d = jL;
            layoutNode.f14403e = (((long) iO0) << 32) | (((long) iL0) & 4294967295L);
            int i15 = (int) (jL >> 32);
            int i16 = (int) (jL & 4294967295L);
            int i17 = i15 + iO0;
            int i18 = i16 + iL0;
            if (!z10 && j.b(jL, j10) && i10 == iO0 && i14 == iL0) {
                return;
            }
            int i19 = layoutNode.f14401c;
            a aVar = this.f15259a;
            if (z10) {
                int i20 = i16;
                layoutNodeG = layoutNode.G();
                if (layoutNodeG != null) {
                    i11 = layoutNodeG.f14401c;
                } else {
                    i11 = -1;
                }
                a.a(aVar, i19, i15, i20, i17, i18, i11);
            } else {
                int i21 = 67108863;
                int i22 = i19 & 67108863;
                long[] jArr = aVar.f15256a;
                int i23 = aVar.f15258c;
                int i24 = 0;
                while (true) {
                    if (i24 >= jArr.length - 2 || i24 >= i23) {
                        int i25 = i16;
                        layoutNodeG = layoutNode.G();
                        if (layoutNodeG != null) {
                            i11 = layoutNodeG.f14401c;
                        } else {
                            i11 = -1;
                        }
                        a.a(aVar, i19, i15, i25, i17, i18, i11);
                    } else {
                        int i26 = i24 + 2;
                        int i27 = i16;
                        long j14 = jArr[i26];
                        if ((((int) j14) & i21) == i22) {
                            long j15 = jArr[i24];
                            jArr[i24] = (((long) i27) & 4294967295L) | (((long) i15) << 32);
                            jArr[i24 + 1] = (((long) i17) << 32) | (((long) i18) & 4294967295L);
                            jArr[i26] = j14 | 2305843009213693952L;
                            int i28 = i15 - ((int) (j15 >> 32));
                            int i29 = i27 - ((int) j15);
                            if ((i28 != 0) | (i29 != 0)) {
                                char c12 = 26;
                                long j16 = (j14 & (-4503599560261633L)) | (((long) ((i24 + 3) & 67108863)) << 26);
                                long[] jArr2 = aVar.f15256a;
                                long[] jArr3 = aVar.f15257b;
                                int i30 = aVar.f15258c / 3;
                                jArr3[0] = j16;
                                int i31 = 1;
                                while (i31 > 0) {
                                    i31--;
                                    long j17 = jArr3[i31];
                                    int i32 = ((int) j17) & 67108863;
                                    int i33 = ((int) (j17 >> c12)) & 67108863;
                                    int i34 = ((int) (j17 >> 52)) & 511;
                                    int i35 = i34 == 511 ? i30 : i34 + i33;
                                    if (i33 < 0) {
                                        break;
                                    }
                                    while (i33 < jArr2.length - 2 && i33 < i35) {
                                        int i36 = i33 + 2;
                                        long j18 = jArr2[i36];
                                        int i37 = i30;
                                        if ((((int) (j18 >> c12)) & 67108863) == i32) {
                                            long j19 = jArr2[i33];
                                            int i38 = i33 + 1;
                                            long j20 = jArr2[i38];
                                            i12 = i29;
                                            jArr2[i33] = (((long) (((int) j19) + i12)) & 4294967295L) | (((long) (((int) (j19 >> 32)) + i28)) << 32);
                                            jArr2[i38] = (((long) (((int) j20) + i12)) & 4294967295L) | (((long) (((int) (j20 >> 32)) + i28)) << 32);
                                            jArr2[i36] = j18 | 2305843009213693952L;
                                            c11 = '4';
                                            if ((((int) (j18 >> 52)) & 511) > 0) {
                                                c10 = 26;
                                                jArr3[i31] = (j18 & (-4503599560261633L)) | (((long) ((i33 + 3) & 67108863)) << 26);
                                                i31++;
                                            } else {
                                                c10 = 26;
                                            }
                                        } else {
                                            c10 = c12;
                                            i12 = i29;
                                            c11 = '4';
                                        }
                                        i33 += 3;
                                        i29 = i12;
                                        i30 = i37;
                                        c12 = c10;
                                    }
                                    i30 = i30;
                                    c12 = c12;
                                    i29 = i29;
                                }
                            }
                        } else {
                            i24 += 3;
                            i16 = i27;
                            i21 = i21;
                        }
                    }
                }
            }
            this.f15262d = true;
            return;
        }
        j10 = j11;
        i10 = i13;
        jL = j;
        zB = false;
        if (zB) {
        }
        b(layoutNode, j, z10);
    }

    public final void h(LayoutNode layoutNode) {
        int i10 = layoutNode.f14401c & 67108863;
        a aVar = this.f15259a;
        long[] jArr = aVar.f15256a;
        int i11 = aVar.f15258c;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            if ((((int) jArr[i13]) & 67108863) == i10) {
                jArr[i12] = -1;
                jArr[i12 + 1] = -1;
                jArr[i13] = 2305843009213693951L;
                break;
            }
        }
        this.f15262d = true;
        this.f15264f = true;
    }
}
