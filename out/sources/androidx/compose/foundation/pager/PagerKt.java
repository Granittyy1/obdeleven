package androidx.compose.foundation.pager;

import androidx.compose.animation.C;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.animation.core.P;
import androidx.compose.animation.core.s0;
import androidx.compose.foundation.E;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.x;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.N;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PagerKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:132:0x017d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0181  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189  */
    /* JADX WARN: Code duplicated, block: B:137:0x018c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0191  */
    /* JADX WARN: Code duplicated, block: B:142:0x0197  */
    /* JADX WARN: Code duplicated, block: B:144:0x019f  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01af  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:169:0x01de  */
    /* JADX WARN: Code duplicated, block: B:172:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:187:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x022e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0233  */
    /* JADX WARN: Code duplicated, block: B:191:0x023b  */
    /* JADX WARN: Code duplicated, block: B:193:0x023e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0241  */
    /* JADX WARN: Code duplicated, block: B:196:0x0245  */
    /* JADX WARN: Code duplicated, block: B:197:0x0247  */
    /* JADX WARN: Code duplicated, block: B:200:0x024e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0250  */
    /* JADX WARN: Code duplicated, block: B:203:0x0254  */
    /* JADX WARN: Code duplicated, block: B:205:0x0259  */
    /* JADX WARN: Code duplicated, block: B:208:0x0263  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:218:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:223:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:226:0x0301  */
    /* JADX WARN: Code duplicated, block: B:227:0x0303  */
    /* JADX WARN: Code duplicated, block: B:229:0x0307  */
    /* JADX WARN: Code duplicated, block: B:231:0x030b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0311  */
    /* JADX WARN: Code duplicated, block: B:236:0x031e  */
    /* JADX WARN: Code duplicated, block: B:238:0x0324  */
    /* JADX WARN: Code duplicated, block: B:244:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x0333  */
    /* JADX WARN: Code duplicated, block: B:247:0x0341  */
    /* JADX WARN: Code duplicated, block: B:249:0x0347  */
    /* JADX WARN: Code duplicated, block: B:251:0x034c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0352  */
    /* JADX WARN: Code duplicated, block: B:256:0x0374  */
    /* JADX WARN: Code duplicated, block: B:258:0x0423  */
    /* JADX WARN: Code duplicated, block: B:261:0x0446  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121 A[PHI: r33
      0x0121: PHI (r33v12 int) = (r33v0 int), (r33v3 int), (r33v4 int) binds: [B:98:0x011f, B:106:0x0135, B:105:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(final PagerState pagerState, androidx.compose.ui.h hVar, L l10, e eVar, int i10, float f10, androidx.compose.ui.d.c cVar, x xVar, boolean z10, boolean z11, Ia.l<? super Integer, ? extends Object> lVar, androidx.compose.ui.input.nestedscroll.a aVar, androidx.compose.foundation.gestures.snapping.k kVar, E e10, final Ia.r<? super n, ? super Integer, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar, InterfaceC1084f interfaceC1084f, final int i11, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.h hVar2;
        L l11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z12;
        C1086g c1086g;
        final e eVar2;
        final int i33;
        final float f11;
        final androidx.compose.ui.d.c cVar2;
        final boolean z13;
        final boolean z14;
        final Ia.l<? super Integer, ? extends Object> lVar2;
        final androidx.compose.ui.input.nestedscroll.a aVar2;
        final E e11;
        final L l12;
        final androidx.compose.ui.h hVar3;
        final x xVar2;
        final androidx.compose.foundation.gestures.snapping.k kVar2;
        C1105p0 c1105p0V;
        L n10;
        e eVar3;
        int i34;
        L l13;
        float f12;
        androidx.compose.ui.d.c cVar3;
        int i35;
        float f13;
        x xVar3;
        boolean z15;
        boolean z16;
        Ia.l<? super Integer, ? extends Object> lVar3;
        androidx.compose.ui.input.nestedscroll.a aVar3;
        int i36;
        androidx.compose.foundation.gestures.snapping.k kVar3;
        E eA;
        androidx.compose.ui.d.c cVar4;
        boolean z17;
        Object objF;
        r rVar2;
        InterfaceC0918s interfaceC0918sA;
        P pC;
        final LayoutDirection layoutDirection;
        boolean zK;
        Object objF2;
        int i37;
        int i38;
        C1086g c1086gP = interfaceC1084f.p(-1372972868);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c1086gP.K(pagerState) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i39 = i13 & 2;
        if (i39 != 0) {
            i14 |= 48;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            if ((i11 & 48) == 0) {
                i14 |= c1086gP.K(hVar2) ? 32 : 16;
            }
        }
        int i40 = i13 & 4;
        if (i40 == 0) {
            if ((i11 & 384) == 0) {
                l11 = l10;
                i14 |= c1086gP.K(l11) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.K(eVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (c1086gP.h(i10)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 32;
                    if (i19 != 0) {
                        i14 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.g(f10)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 64;
                    if (i21 != 0) {
                        i14 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c1086gP.K(cVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i14 |= i22;
                    }
                    if ((i11 & 12582912) != 0) {
                        i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c1086gP.c(z10)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 512;
                    i26 = 805306368;
                    if (i25 == 0) {
                        i14 |= i26;
                    } else if ((i11 & 805306368) == 0) {
                        if (c1086gP.c(z11)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i14 |= i26;
                    }
                    i27 = i13 & 1024;
                    if (i27 != 0) {
                        i28 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (c1086gP.k(lVar)) {
                            i29 = 4;
                        } else {
                            i29 = 2;
                        }
                        i28 = i12 | i29;
                    } else {
                        i28 = i12;
                    }
                    if ((i12 & 48) != 0) {
                        if ((i13 & 2048) == 0 || !c1086gP.k(aVar)) {
                            i38 = 16;
                        } else {
                            i38 = 32;
                        }
                        i28 |= i38;
                    }
                    i30 = i28;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                        i30 |= 384;
                    } else if ((i12 & 384) != 0) {
                        if (c1086gP.K(kVar)) {
                            i32 = 256;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    if ((i12 & 3072) != 0) {
                        if ((i13 & 8192) == 0 || !c1086gP.K(e10)) {
                            i37 = 1024;
                        } else {
                            i37 = 2048;
                        }
                        i30 |= i37;
                    }
                    if ((i13 & 16384) != 0) {
                        if ((i12 & 24576) == 0) {
                            i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                        }
                        if ((306783379 & i14) == 306783378 || (i30 & 9363) != 9362) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c1086gP.C(i14 & 1, z12)) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0 || c1086gP.a0()) {
                                if (i39 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i40 != 0) {
                                    float f14 = 0;
                                    n10 = new N(f14, f14, f14, f14);
                                } else {
                                    n10 = l11;
                                }
                                if (i15 != 0) {
                                    eVar3 = e.a.f10971a;
                                } else {
                                    eVar3 = eVar;
                                }
                                if (i17 != 0) {
                                    i34 = 0;
                                } else {
                                    i34 = i10;
                                }
                                l13 = n10;
                                if (i19 != 0) {
                                    f12 = 0;
                                } else {
                                    f12 = f10;
                                }
                                if (i21 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.f13344k;
                                } else {
                                    cVar3 = cVar;
                                }
                                i35 = 128 & i13;
                                f13 = f12;
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (i35 != 0) {
                                    int i41 = (i14 & 14) | 196608;
                                    rVar2 = new r();
                                    interfaceC0918sA = C.a(c1086gP);
                                    Object obj = s0.f9633a;
                                    pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                    p013b0.c cVar5 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                    zK = c1086gP.K(interfaceC0918sA) | ((((i41 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar5) | c1086gP.K(layoutDirection);
                                    objF2 = c1086gP.f();
                                    if (zK || objF2 == c0153a) {
                                        final float f15 = 0.5f;
                                        androidx.compose.foundation.gestures.snapping.g gVar = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // Ia.q
                                            public final Float invoke(Float f16, Float f17, Float f18) {
                                                int i42;
                                                float fFloatValue = f16.floatValue();
                                                float fFloatValue2 = f17.floatValue();
                                                float fFloatValue3 = f18.floatValue();
                                                PagerState pagerState2 = pagerState;
                                                LayoutDirection layoutDirection2 = layoutDirection;
                                                float f19 = f15;
                                                boolean zL = I2.e.l(pagerState2, fFloatValue);
                                                if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                    zL = !zL;
                                                }
                                                int iF = pagerState2.l().f();
                                                float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                                float f21 = f20 - ((int) f20);
                                                if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                    i42 = 0;
                                                } else {
                                                    i42 = fFloatValue > 0.0f ? 1 : 2;
                                                }
                                                if (androidx.compose.foundation.gestures.snapping.d.a(i42, 0)) {
                                                    fFloatValue2 = Math.abs(f21) > f19 ? fFloatValue3 : fFloatValue3;
                                                } else if (!androidx.compose.foundation.gestures.snapping.d.a(i42, 1)) {
                                                    if (!androidx.compose.foundation.gestures.snapping.d.a(i42, 2)) {
                                                        fFloatValue2 = 0.0f;
                                                    }
                                                }
                                                return Float.valueOf(fFloatValue2);
                                            }
                                        }, rVar2);
                                        float f16 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                        androidx.compose.foundation.gestures.snapping.h hVar4 = new androidx.compose.foundation.gestures.snapping.h(gVar, interfaceC0918sA, pC);
                                        c1086gP.E(hVar4);
                                        objF2 = hVar4;
                                    }
                                    xVar3 = (x) objF2;
                                    i14 &= -29360129;
                                } else {
                                    xVar3 = xVar;
                                }
                                if (i23 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = z10;
                                }
                                if (i25 != 0) {
                                    z16 = false;
                                } else {
                                    z16 = z11;
                                }
                                if (i27 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                if ((2048 & i13) != 0) {
                                    Orientation orientation = Orientation.f9957b;
                                    int i42 = (i14 & 14) | 432;
                                    z17 = (((i42 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i42 & 6) == 4;
                                    objF = c1086gP.f();
                                    if (z17 || objF == c0153a) {
                                        objF = new a(pagerState);
                                        c1086gP.E(objF);
                                    }
                                    aVar3 = (a) objF;
                                    i36 = i30 & (-113);
                                } else {
                                    aVar3 = aVar;
                                    i36 = i30;
                                }
                                if (i31 != 0) {
                                    kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                                } else {
                                    kVar3 = kVar;
                                }
                                if ((8192 & i13) != 0) {
                                    i30 = i36 & (-7169);
                                    eA = OverscrollKt.a(c1086gP);
                                } else {
                                    eA = e10;
                                    i30 = i36;
                                }
                                cVar4 = cVar3;
                            } else {
                                c1086gP.w();
                                if ((128 & i13) != 0) {
                                    i14 &= -29360129;
                                }
                                if ((2048 & i13) != 0) {
                                    i30 &= -113;
                                }
                                if ((8192 & i13) != 0) {
                                    i30 &= -7169;
                                }
                                eVar3 = eVar;
                                i34 = i10;
                                f13 = f10;
                                cVar4 = cVar;
                                xVar3 = xVar;
                                z15 = z10;
                                z16 = z11;
                                lVar3 = lVar;
                                aVar3 = aVar;
                                kVar3 = kVar;
                                eA = e10;
                                l13 = l11;
                                hVar2 = hVar2;
                            }
                            c1086gP.U();
                            Orientation orientation2 = Orientation.f9958c;
                            androidx.compose.ui.f.a aVar4 = androidx.compose.ui.d.a.f13347n;
                            int i43 = i14 >> 6;
                            int i44 = i14 << 12;
                            int i45 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i43) | (3670016 & i43) | ((i30 << 12) & 29360128) | (234881024 & i44) | (i44 & 1879048192);
                            int i46 = i30 << 6;
                            c1086g = c1086gP;
                            LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation2, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar4, cVar4, kVar3, rVar, c1086g, i45, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i46 & 896) | (i43 & 57344) | ((i30 << 9) & 458752) | (3670016 & i46), 0);
                            hVar3 = hVar2;
                            l12 = l13;
                            eVar2 = eVar3;
                            i33 = i34;
                            f11 = f13;
                            cVar2 = cVar4;
                            xVar2 = xVar3;
                            z13 = z15;
                            z14 = z16;
                            lVar2 = lVar3;
                            aVar2 = aVar3;
                            kVar2 = kVar3;
                            e11 = eA;
                        } else {
                            c1086g = c1086gP;
                            c1086g.w();
                            eVar2 = eVar;
                            i33 = i10;
                            f11 = f10;
                            cVar2 = cVar;
                            z13 = z10;
                            z14 = z11;
                            lVar2 = lVar;
                            aVar2 = aVar;
                            e11 = e10;
                            l12 = l11;
                            hVar3 = hVar2;
                            xVar2 = xVar;
                            kVar2 = kVar;
                        }
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i30 |= 24576;
                    if ((306783379 & i14) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f17 = 0;
                                n10 = new N(f17, f17, f17, f17);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i47 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj2 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar6 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i47 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i47 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar6) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f18 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar2 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f19, Float f110, Float f111) {
                                            int i48;
                                            float fFloatValue = f19.floatValue();
                                            float fFloatValue2 = f110.floatValue();
                                            float fFloatValue3 = f111.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f112 = f18;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i48 = 0;
                                            } else {
                                                i48 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i48, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f112 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i48, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i48, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f19 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar5 = new androidx.compose.foundation.gestures.snapping.h(gVar2, interfaceC0918sA, pC);
                                    c1086gP.E(hVar5);
                                    objF2 = hVar5;
                                } else {
                                    final float f110 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar3 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f111, Float f112, Float f113) {
                                            int i48;
                                            float fFloatValue = f111.floatValue();
                                            float fFloatValue2 = f112.floatValue();
                                            float fFloatValue3 = f113.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f114 = f110;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i48 = 0;
                                            } else {
                                                i48 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i48, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f114 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i48, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i48, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar6 = new androidx.compose.foundation.gestures.snapping.h(gVar3, interfaceC0918sA, pC);
                                    c1086gP.E(hVar6);
                                    objF2 = hVar6;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation3 = Orientation.f9957b;
                                int i48 = (i14 & 14) | 432;
                                if (((i48 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        } else {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f112 = 0;
                                n10 = new N(f112, f112, f112, f112);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i49 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj3 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar7 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i49 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i49 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar7) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f113 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar4 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f114, Float f115, Float f116) {
                                            int i410;
                                            float fFloatValue = f114.floatValue();
                                            float fFloatValue2 = f115.floatValue();
                                            float fFloatValue3 = f116.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f117 = f113;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i410 = 0;
                                            } else {
                                                i410 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i410, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f117 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i410, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i410, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar7 = new androidx.compose.foundation.gestures.snapping.h(gVar4, interfaceC0918sA, pC);
                                    c1086gP.E(hVar7);
                                    objF2 = hVar7;
                                } else {
                                    final float f115 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar5 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f116, Float f117, Float f118) {
                                            int i410;
                                            float fFloatValue = f116.floatValue();
                                            float fFloatValue2 = f117.floatValue();
                                            float fFloatValue3 = f118.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f119 = f115;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i410 = 0;
                                            } else {
                                                i410 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i410, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f119 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i410, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i410, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar8 = new androidx.compose.foundation.gestures.snapping.h(gVar5, interfaceC0918sA, pC);
                                    c1086gP.E(hVar8);
                                    objF2 = hVar8;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation4 = Orientation.f9957b;
                                int i410 = (i14 & 14) | 432;
                                if (((i410 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        }
                        c1086gP.U();
                        Orientation orientation5 = Orientation.f9958c;
                        androidx.compose.ui.f.a aVar5 = androidx.compose.ui.d.a.f13347n;
                        int i411 = i14 >> 6;
                        int i412 = i14 << 12;
                        int i413 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i411) | (3670016 & i411) | ((i30 << 12) & 29360128) | (234881024 & i412) | (i412 & 1879048192);
                        int i414 = i30 << 6;
                        c1086g = c1086gP;
                        LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation5, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar5, cVar4, kVar3, rVar, c1086g, i413, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i414 & 896) | (i411 & 57344) | ((i30 << 9) & 458752) | (3670016 & i414), 0);
                        hVar3 = hVar2;
                        l12 = l13;
                        eVar2 = eVar3;
                        i33 = i34;
                        f11 = f13;
                        cVar2 = cVar4;
                        xVar2 = xVar3;
                        z13 = z15;
                        z14 = z16;
                        lVar2 = lVar3;
                        aVar2 = aVar3;
                        kVar2 = kVar3;
                        e11 = eA;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        eVar2 = eVar;
                        i33 = i10;
                        f11 = f10;
                        cVar2 = cVar;
                        z13 = z10;
                        z14 = z11;
                        lVar2 = lVar;
                        aVar2 = aVar;
                        e11 = e10;
                        l12 = l11;
                        hVar3 = hVar2;
                        xVar2 = xVar;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.K(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i14 |= i22;
                }
                if ((i11 & 12582912) != 0) {
                    i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 512;
                i26 = 805306368;
                if (i25 == 0) {
                    i14 |= i26;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 1024;
                if (i27 != 0) {
                    i28 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.k(lVar)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i12 | i29;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 16;
                    } else {
                        i38 = 16;
                    }
                    i28 |= i38;
                }
                i30 = i28;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i30 |= 384;
                } else if ((i12 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i37 = 1024;
                    } else {
                        i37 = 1024;
                    }
                    i30 |= i37;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                    }
                    if ((306783379 & i14) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f117 = 0;
                                n10 = new N(f117, f117, f117, f117);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i415 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj4 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar8 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i415 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i415 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar8) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f118 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar6 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f119, Float f1110, Float f1111) {
                                            int i416;
                                            float fFloatValue = f119.floatValue();
                                            float fFloatValue2 = f1110.floatValue();
                                            float fFloatValue3 = f1111.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1112 = f118;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i416 = 0;
                                            } else {
                                                i416 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i416, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1112 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i416, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i416, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar9 = new androidx.compose.foundation.gestures.snapping.h(gVar6, interfaceC0918sA, pC);
                                    c1086gP.E(hVar9);
                                    objF2 = hVar9;
                                } else {
                                    final float f1110 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar7 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1111, Float f1112, Float f1113) {
                                            int i416;
                                            float fFloatValue = f1111.floatValue();
                                            float fFloatValue2 = f1112.floatValue();
                                            float fFloatValue3 = f1113.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1114 = f1110;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i416 = 0;
                                            } else {
                                                i416 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i416, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1114 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i416, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i416, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar10 = new androidx.compose.foundation.gestures.snapping.h(gVar7, interfaceC0918sA, pC);
                                    c1086gP.E(hVar10);
                                    objF2 = hVar10;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation6 = Orientation.f9957b;
                                int i416 = (i14 & 14) | 432;
                                if (((i416 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        } else {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f1112 = 0;
                                n10 = new N(f1112, f1112, f1112, f1112);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i417 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj5 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar9 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i417 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i417 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar9) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f1113 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar8 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1114, Float f1115, Float f1116) {
                                            int i418;
                                            float fFloatValue = f1114.floatValue();
                                            float fFloatValue2 = f1115.floatValue();
                                            float fFloatValue3 = f1116.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1117 = f1113;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i418 = 0;
                                            } else {
                                                i418 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i418, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1117 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i418, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i418, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar11 = new androidx.compose.foundation.gestures.snapping.h(gVar8, interfaceC0918sA, pC);
                                    c1086gP.E(hVar11);
                                    objF2 = hVar11;
                                } else {
                                    final float f1115 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar9 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1116, Float f1117, Float f1118) {
                                            int i418;
                                            float fFloatValue = f1116.floatValue();
                                            float fFloatValue2 = f1117.floatValue();
                                            float fFloatValue3 = f1118.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1119 = f1115;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i418 = 0;
                                            } else {
                                                i418 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i418, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1119 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i418, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i418, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar12 = new androidx.compose.foundation.gestures.snapping.h(gVar9, interfaceC0918sA, pC);
                                    c1086gP.E(hVar12);
                                    objF2 = hVar12;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation7 = Orientation.f9957b;
                                int i418 = (i14 & 14) | 432;
                                if (((i418 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        }
                        c1086gP.U();
                        Orientation orientation8 = Orientation.f9958c;
                        androidx.compose.ui.f.a aVar6 = androidx.compose.ui.d.a.f13347n;
                        int i419 = i14 >> 6;
                        int i4110 = i14 << 12;
                        int i4111 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i419) | (3670016 & i419) | ((i30 << 12) & 29360128) | (234881024 & i4110) | (i4110 & 1879048192);
                        int i4112 = i30 << 6;
                        c1086g = c1086gP;
                        LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation8, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar6, cVar4, kVar3, rVar, c1086g, i4111, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4112 & 896) | (i419 & 57344) | ((i30 << 9) & 458752) | (3670016 & i4112), 0);
                        hVar3 = hVar2;
                        l12 = l13;
                        eVar2 = eVar3;
                        i33 = i34;
                        f11 = f13;
                        cVar2 = cVar4;
                        xVar2 = xVar3;
                        z13 = z15;
                        z14 = z16;
                        lVar2 = lVar3;
                        aVar2 = aVar3;
                        kVar2 = kVar3;
                        e11 = eA;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        eVar2 = eVar;
                        i33 = i10;
                        f11 = f10;
                        cVar2 = cVar;
                        z13 = z10;
                        z14 = z11;
                        lVar2 = lVar;
                        aVar2 = aVar;
                        e11 = e10;
                        l12 = l11;
                        hVar3 = hVar2;
                        xVar2 = xVar;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 24576;
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f1117 = 0;
                            n10 = new N(f1117, f1117, f1117, f1117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i4113 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj6 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar10 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i4113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar10) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f1118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar10 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1119, Float f11110, Float f11111) {
                                        int i4114;
                                        float fFloatValue = f1119.floatValue();
                                        float fFloatValue2 = f11110.floatValue();
                                        float fFloatValue3 = f11111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11112 = f1118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4114 = 0;
                                        } else {
                                            i4114 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4114, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4114, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4114, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar13 = new androidx.compose.foundation.gestures.snapping.h(gVar10, interfaceC0918sA, pC);
                                c1086gP.E(hVar13);
                                objF2 = hVar13;
                            } else {
                                final float f11110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111, Float f11112, Float f11113) {
                                        int i4114;
                                        float fFloatValue = f11111.floatValue();
                                        float fFloatValue2 = f11112.floatValue();
                                        float fFloatValue3 = f11113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11114 = f11110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4114 = 0;
                                        } else {
                                            i4114 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4114, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4114, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4114, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar14 = new androidx.compose.foundation.gestures.snapping.h(gVar11, interfaceC0918sA, pC);
                                c1086gP.E(hVar14);
                                objF2 = hVar14;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation9 = Orientation.f9957b;
                            int i4114 = (i14 & 14) | 432;
                            if (((i4114 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f11112 = 0;
                            n10 = new N(f11112, f11112, f11112, f11112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i4115 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj7 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar11 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i4115 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4115 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar11) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f11113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar12 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11114, Float f11115, Float f11116) {
                                        int i4116;
                                        float fFloatValue = f11114.floatValue();
                                        float fFloatValue2 = f11115.floatValue();
                                        float fFloatValue3 = f11116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11117 = f11113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4116 = 0;
                                        } else {
                                            i4116 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4116, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4116, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4116, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar15 = new androidx.compose.foundation.gestures.snapping.h(gVar12, interfaceC0918sA, pC);
                                c1086gP.E(hVar15);
                                objF2 = hVar15;
                            } else {
                                final float f11115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar13 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11116, Float f11117, Float f11118) {
                                        int i4116;
                                        float fFloatValue = f11116.floatValue();
                                        float fFloatValue2 = f11117.floatValue();
                                        float fFloatValue3 = f11118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11119 = f11115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4116 = 0;
                                        } else {
                                            i4116 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4116, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4116, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4116, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar16 = new androidx.compose.foundation.gestures.snapping.h(gVar13, interfaceC0918sA, pC);
                                c1086gP.E(hVar16);
                                objF2 = hVar16;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation10 = Orientation.f9957b;
                            int i4116 = (i14 & 14) | 432;
                            if (((i4116 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation11 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar7 = androidx.compose.ui.d.a.f13347n;
                    int i4117 = i14 >> 6;
                    int i4118 = i14 << 12;
                    int i4119 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i4117) | (3670016 & i4117) | ((i30 << 12) & 29360128) | (234881024 & i4118) | (i4118 & 1879048192);
                    int i41110 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation11, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar7, cVar4, kVar3, rVar, c1086g, i4119, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i41110 & 896) | (i4117 & 57344) | ((i30 << 9) & 458752) | (3670016 & i41110), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.h(i10)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.K(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i14 |= i22;
                }
                if ((i11 & 12582912) != 0) {
                    i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 512;
                i26 = 805306368;
                if (i25 == 0) {
                    i14 |= i26;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 1024;
                if (i27 != 0) {
                    i28 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.k(lVar)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i12 | i29;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 16;
                    } else {
                        i38 = 16;
                    }
                    i28 |= i38;
                }
                i30 = i28;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i30 |= 384;
                } else if ((i12 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i37 = 1024;
                    } else {
                        i37 = 1024;
                    }
                    i30 |= i37;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                    }
                    if ((306783379 & i14) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f11117 = 0;
                                n10 = new N(f11117, f11117, f11117, f11117);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a8 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i41111 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj8 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar12 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i41111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar12) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f11118 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar14 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f11119, Float f111110, Float f111111) {
                                            int i41112;
                                            float fFloatValue = f11119.floatValue();
                                            float fFloatValue2 = f111110.floatValue();
                                            float fFloatValue3 = f111111.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f111112 = f11118;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41112 = 0;
                                            } else {
                                                i41112 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41112, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f111112 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41112, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41112, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f11119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar17 = new androidx.compose.foundation.gestures.snapping.h(gVar14, interfaceC0918sA, pC);
                                    c1086gP.E(hVar17);
                                    objF2 = hVar17;
                                } else {
                                    final float f111110 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar15 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f111111, Float f111112, Float f111113) {
                                            int i41112;
                                            float fFloatValue = f111111.floatValue();
                                            float fFloatValue2 = f111112.floatValue();
                                            float fFloatValue3 = f111113.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f111114 = f111110;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41112 = 0;
                                            } else {
                                                i41112 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41112, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f111114 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41112, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41112, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar18 = new androidx.compose.foundation.gestures.snapping.h(gVar15, interfaceC0918sA, pC);
                                    c1086gP.E(hVar18);
                                    objF2 = hVar18;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation12 = Orientation.f9957b;
                                int i41112 = (i14 & 14) | 432;
                                if (((i41112 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        } else {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f111112 = 0;
                                n10 = new N(f111112, f111112, f111112, f111112);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a9 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i41113 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj9 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar13 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i41113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar13) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f111113 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar16 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f111114, Float f111115, Float f111116) {
                                            int i41114;
                                            float fFloatValue = f111114.floatValue();
                                            float fFloatValue2 = f111115.floatValue();
                                            float fFloatValue3 = f111116.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f111117 = f111113;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41114 = 0;
                                            } else {
                                                i41114 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41114, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f111117 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41114, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41114, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar19 = new androidx.compose.foundation.gestures.snapping.h(gVar16, interfaceC0918sA, pC);
                                    c1086gP.E(hVar19);
                                    objF2 = hVar19;
                                } else {
                                    final float f111115 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar17 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f111116, Float f111117, Float f111118) {
                                            int i41114;
                                            float fFloatValue = f111116.floatValue();
                                            float fFloatValue2 = f111117.floatValue();
                                            float fFloatValue3 = f111118.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f111119 = f111115;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41114 = 0;
                                            } else {
                                                i41114 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41114, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f111119 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41114, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41114, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar110 = new androidx.compose.foundation.gestures.snapping.h(gVar17, interfaceC0918sA, pC);
                                    c1086gP.E(hVar110);
                                    objF2 = hVar110;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation13 = Orientation.f9957b;
                                int i41114 = (i14 & 14) | 432;
                                if (((i41114 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        }
                        c1086gP.U();
                        Orientation orientation14 = Orientation.f9958c;
                        androidx.compose.ui.f.a aVar8 = androidx.compose.ui.d.a.f13347n;
                        int i41115 = i14 >> 6;
                        int i41116 = i14 << 12;
                        int i41117 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i41115) | (3670016 & i41115) | ((i30 << 12) & 29360128) | (234881024 & i41116) | (i41116 & 1879048192);
                        int i41118 = i30 << 6;
                        c1086g = c1086gP;
                        LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation14, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar8, cVar4, kVar3, rVar, c1086g, i41117, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i41118 & 896) | (i41115 & 57344) | ((i30 << 9) & 458752) | (3670016 & i41118), 0);
                        hVar3 = hVar2;
                        l12 = l13;
                        eVar2 = eVar3;
                        i33 = i34;
                        f11 = f13;
                        cVar2 = cVar4;
                        xVar2 = xVar3;
                        z13 = z15;
                        z14 = z16;
                        lVar2 = lVar3;
                        aVar2 = aVar3;
                        kVar2 = kVar3;
                        e11 = eA;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        eVar2 = eVar;
                        i33 = i10;
                        f11 = f10;
                        cVar2 = cVar;
                        z13 = z10;
                        z14 = z11;
                        lVar2 = lVar;
                        aVar2 = aVar;
                        e11 = e10;
                        l12 = l11;
                        hVar3 = hVar2;
                        xVar2 = xVar;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 24576;
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f111117 = 0;
                            n10 = new N(f111117, f111117, f111117, f111117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a10 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i41119 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj10 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar14 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i41119 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41119 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar14) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f111118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar18 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f111119, Float f1111110, Float f1111111) {
                                        int i411110;
                                        float fFloatValue = f111119.floatValue();
                                        float fFloatValue2 = f1111110.floatValue();
                                        float fFloatValue3 = f1111111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f1111112 = f111118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411110 = 0;
                                        } else {
                                            i411110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f1111112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar111 = new androidx.compose.foundation.gestures.snapping.h(gVar18, interfaceC0918sA, pC);
                                c1086gP.E(hVar111);
                                objF2 = hVar111;
                            } else {
                                final float f1111110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar19 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111111, Float f1111112, Float f1111113) {
                                        int i411110;
                                        float fFloatValue = f1111111.floatValue();
                                        float fFloatValue2 = f1111112.floatValue();
                                        float fFloatValue3 = f1111113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f1111114 = f1111110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411110 = 0;
                                        } else {
                                            i411110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f1111114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar112 = new androidx.compose.foundation.gestures.snapping.h(gVar19, interfaceC0918sA, pC);
                                c1086gP.E(hVar112);
                                objF2 = hVar112;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation15 = Orientation.f9957b;
                            int i411110 = (i14 & 14) | 432;
                            if (((i411110 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f1111112 = 0;
                            n10 = new N(f1111112, f1111112, f1111112, f1111112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a11 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411111 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj11 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar15 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar15) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f1111113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar110 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111114, Float f1111115, Float f1111116) {
                                        int i411112;
                                        float fFloatValue = f1111114.floatValue();
                                        float fFloatValue2 = f1111115.floatValue();
                                        float fFloatValue3 = f1111116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f1111117 = f1111113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411112 = 0;
                                        } else {
                                            i411112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f1111117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar113 = new androidx.compose.foundation.gestures.snapping.h(gVar110, interfaceC0918sA, pC);
                                c1086gP.E(hVar113);
                                objF2 = hVar113;
                            } else {
                                final float f1111115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar111 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111116, Float f1111117, Float f1111118) {
                                        int i411112;
                                        float fFloatValue = f1111116.floatValue();
                                        float fFloatValue2 = f1111117.floatValue();
                                        float fFloatValue3 = f1111118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f1111119 = f1111115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411112 = 0;
                                        } else {
                                            i411112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f1111119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar114 = new androidx.compose.foundation.gestures.snapping.h(gVar111, interfaceC0918sA, pC);
                                c1086gP.E(hVar114);
                                objF2 = hVar114;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation16 = Orientation.f9957b;
                            int i411112 = (i14 & 14) | 432;
                            if (((i411112 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation17 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar9 = androidx.compose.ui.d.a.f13347n;
                    int i411113 = i14 >> 6;
                    int i411114 = i14 << 12;
                    int i411115 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i411113) | (3670016 & i411113) | ((i30 << 12) & 29360128) | (234881024 & i411114) | (i411114 & 1879048192);
                    int i411116 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation17, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar9, cVar4, kVar3, rVar, c1086g, i411115, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i411116 & 896) | (i411113 & 57344) | ((i30 << 9) & 458752) | (3670016 & i411116), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.K(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            if ((i11 & 12582912) != 0) {
                i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            i26 = 805306368;
            if (i25 == 0) {
                i14 |= i26;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.k(lVar)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 16;
                } else {
                    i38 = 16;
                }
                i28 |= i38;
            }
            i30 = i28;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i30 |= 384;
            } else if ((i12 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i37 = 1024;
                } else {
                    i37 = 1024;
                }
                i30 |= i37;
            }
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f1111117 = 0;
                            n10 = new N(f1111117, f1111117, f1111117, f1111117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a12 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411117 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj12 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar16 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411117 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411117 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar16) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f1111118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar112 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111119, Float f11111110, Float f11111111) {
                                        int i411118;
                                        float fFloatValue = f1111119.floatValue();
                                        float fFloatValue2 = f11111110.floatValue();
                                        float fFloatValue3 = f11111111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111112 = f1111118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411118 = 0;
                                        } else {
                                            i411118 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411118, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411118, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411118, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar115 = new androidx.compose.foundation.gestures.snapping.h(gVar112, interfaceC0918sA, pC);
                                c1086gP.E(hVar115);
                                objF2 = hVar115;
                            } else {
                                final float f11111110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar113 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111, Float f11111112, Float f11111113) {
                                        int i411118;
                                        float fFloatValue = f11111111.floatValue();
                                        float fFloatValue2 = f11111112.floatValue();
                                        float fFloatValue3 = f11111113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111114 = f11111110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411118 = 0;
                                        } else {
                                            i411118 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411118, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411118, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411118, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar116 = new androidx.compose.foundation.gestures.snapping.h(gVar113, interfaceC0918sA, pC);
                                c1086gP.E(hVar116);
                                objF2 = hVar116;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation18 = Orientation.f9957b;
                            int i411118 = (i14 & 14) | 432;
                            if (((i411118 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f11111112 = 0;
                            n10 = new N(f11111112, f11111112, f11111112, f11111112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a13 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411119 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj13 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar17 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411119 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411119 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar17) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f11111113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar114 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111114, Float f11111115, Float f11111116) {
                                        int i4111110;
                                        float fFloatValue = f11111114.floatValue();
                                        float fFloatValue2 = f11111115.floatValue();
                                        float fFloatValue3 = f11111116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111117 = f11111113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111110 = 0;
                                        } else {
                                            i4111110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar117 = new androidx.compose.foundation.gestures.snapping.h(gVar114, interfaceC0918sA, pC);
                                c1086gP.E(hVar117);
                                objF2 = hVar117;
                            } else {
                                final float f11111115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar115 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111116, Float f11111117, Float f11111118) {
                                        int i4111110;
                                        float fFloatValue = f11111116.floatValue();
                                        float fFloatValue2 = f11111117.floatValue();
                                        float fFloatValue3 = f11111118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111119 = f11111115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111110 = 0;
                                        } else {
                                            i4111110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar118 = new androidx.compose.foundation.gestures.snapping.h(gVar115, interfaceC0918sA, pC);
                                c1086gP.E(hVar118);
                                objF2 = hVar118;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation19 = Orientation.f9957b;
                            int i4111110 = (i14 & 14) | 432;
                            if (((i4111110 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation110 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar10 = androidx.compose.ui.d.a.f13347n;
                    int i4111111 = i14 >> 6;
                    int i4111112 = i14 << 12;
                    int i4111113 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i4111111) | (3670016 & i4111111) | ((i30 << 12) & 29360128) | (234881024 & i4111112) | (i4111112 & 1879048192);
                    int i4111114 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation110, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar10, cVar4, kVar3, rVar, c1086g, i4111113, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4111114 & 896) | (i4111111 & 57344) | ((i30 << 9) & 458752) | (3670016 & i4111114), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 24576;
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f11111117 = 0;
                        n10 = new N(f11111117, f11111117, f11111117, f11111117);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a14 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111115 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj14 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar18 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111115 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111115 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar18) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f11111118 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar116 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f11111119, Float f111111110, Float f111111111) {
                                    int i4111116;
                                    float fFloatValue = f11111119.floatValue();
                                    float fFloatValue2 = f111111110.floatValue();
                                    float fFloatValue3 = f111111111.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111112 = f11111118;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111116 = 0;
                                    } else {
                                        i4111116 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111116, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111112 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111116, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111116, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f11111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar119 = new androidx.compose.foundation.gestures.snapping.h(gVar116, interfaceC0918sA, pC);
                            c1086gP.E(hVar119);
                            objF2 = hVar119;
                        } else {
                            final float f111111110 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar117 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111, Float f111111112, Float f111111113) {
                                    int i4111116;
                                    float fFloatValue = f111111111.floatValue();
                                    float fFloatValue2 = f111111112.floatValue();
                                    float fFloatValue3 = f111111113.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111114 = f111111110;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111116 = 0;
                                    } else {
                                        i4111116 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111116, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111114 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111116, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111116, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar1110 = new androidx.compose.foundation.gestures.snapping.h(gVar117, interfaceC0918sA, pC);
                            c1086gP.E(hVar1110);
                            objF2 = hVar1110;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation111 = Orientation.f9957b;
                        int i4111116 = (i14 & 14) | 432;
                        if (((i4111116 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f111111112 = 0;
                        n10 = new N(f111111112, f111111112, f111111112, f111111112);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a15 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111117 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj15 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar19 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111117 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111117 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar19) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f111111113 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar118 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111114, Float f111111115, Float f111111116) {
                                    int i4111118;
                                    float fFloatValue = f111111114.floatValue();
                                    float fFloatValue2 = f111111115.floatValue();
                                    float fFloatValue3 = f111111116.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111117 = f111111113;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111118 = 0;
                                    } else {
                                        i4111118 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111118, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111117 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111118, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111118, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar1111 = new androidx.compose.foundation.gestures.snapping.h(gVar118, interfaceC0918sA, pC);
                            c1086gP.E(hVar1111);
                            objF2 = hVar1111;
                        } else {
                            final float f111111115 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar119 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111116, Float f111111117, Float f111111118) {
                                    int i4111118;
                                    float fFloatValue = f111111116.floatValue();
                                    float fFloatValue2 = f111111117.floatValue();
                                    float fFloatValue3 = f111111118.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111119 = f111111115;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111118 = 0;
                                    } else {
                                        i4111118 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111118, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111119 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111118, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111118, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar1112 = new androidx.compose.foundation.gestures.snapping.h(gVar119, interfaceC0918sA, pC);
                            c1086gP.E(hVar1112);
                            objF2 = hVar1112;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation112 = Orientation.f9957b;
                        int i4111118 = (i14 & 14) | 432;
                        if (((i4111118 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                }
                c1086gP.U();
                Orientation orientation113 = Orientation.f9958c;
                androidx.compose.ui.f.a aVar11 = androidx.compose.ui.d.a.f13347n;
                int i4111119 = i14 >> 6;
                int i41111110 = i14 << 12;
                int i41111111 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i4111119) | (3670016 & i4111119) | ((i30 << 12) & 29360128) | (234881024 & i41111110) | (i41111110 & 1879048192);
                int i41111112 = i30 << 6;
                c1086g = c1086gP;
                LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation113, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar11, cVar4, kVar3, rVar, c1086g, i41111111, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i41111112 & 896) | (i4111119 & 57344) | ((i30 << 9) & 458752) | (3670016 & i41111112), 0);
                hVar3 = hVar2;
                l12 = l13;
                eVar2 = eVar3;
                i33 = i34;
                f11 = f13;
                cVar2 = cVar4;
                xVar2 = xVar3;
                z13 = z15;
                z14 = z16;
                lVar2 = lVar3;
                aVar2 = aVar3;
                kVar2 = kVar3;
                e11 = eA;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                eVar2 = eVar;
                i33 = i10;
                f11 = f10;
                cVar2 = cVar;
                z13 = z10;
                z14 = z11;
                lVar2 = lVar;
                aVar2 = aVar;
                e11 = e10;
                l12 = l11;
                hVar3 = hVar2;
                xVar2 = xVar;
                kVar2 = kVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 384;
        l11 = l10;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                if (c1086gP.K(eVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.h(i10)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.K(cVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i14 |= i22;
                }
                if ((i11 & 12582912) != 0) {
                    i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 512;
                i26 = 805306368;
                if (i25 == 0) {
                    i14 |= i26;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 1024;
                if (i27 != 0) {
                    i28 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.k(lVar)) {
                        i29 = 4;
                    } else {
                        i29 = 2;
                    }
                    i28 = i12 | i29;
                } else {
                    i28 = i12;
                }
                if ((i12 & 48) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 16;
                    } else {
                        i38 = 16;
                    }
                    i28 |= i38;
                }
                i30 = i28;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i30 |= 384;
                } else if ((i12 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i32 = 256;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i37 = 1024;
                    } else {
                        i37 = 1024;
                    }
                    i30 |= i37;
                }
                if ((i13 & 16384) != 0) {
                    if ((i12 & 24576) == 0) {
                        i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                    }
                    if ((306783379 & i14) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f111111117 = 0;
                                n10 = new N(f111111117, f111111117, f111111117, f111111117);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a16 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i41111113 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj16 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar110 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i41111113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar110) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f111111118 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar1110 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f111111119, Float f1111111110, Float f1111111111) {
                                            int i41111114;
                                            float fFloatValue = f111111119.floatValue();
                                            float fFloatValue2 = f1111111110.floatValue();
                                            float fFloatValue3 = f1111111111.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1111111112 = f111111118;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41111114 = 0;
                                            } else {
                                                i41111114 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41111114, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1111111112 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111114, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41111114, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar1113 = new androidx.compose.foundation.gestures.snapping.h(gVar1110, interfaceC0918sA, pC);
                                    c1086gP.E(hVar1113);
                                    objF2 = hVar1113;
                                } else {
                                    final float f1111111110 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar1111 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1111111111, Float f1111111112, Float f1111111113) {
                                            int i41111114;
                                            float fFloatValue = f1111111111.floatValue();
                                            float fFloatValue2 = f1111111112.floatValue();
                                            float fFloatValue3 = f1111111113.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1111111114 = f1111111110;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41111114 = 0;
                                            } else {
                                                i41111114 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41111114, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1111111114 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111114, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41111114, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar1114 = new androidx.compose.foundation.gestures.snapping.h(gVar1111, interfaceC0918sA, pC);
                                    c1086gP.E(hVar1114);
                                    objF2 = hVar1114;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation114 = Orientation.f9957b;
                                int i41111114 = (i14 & 14) | 432;
                                if (((i41111114 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        } else {
                            if (i39 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i40 != 0) {
                                float f1111111112 = 0;
                                n10 = new N(f1111111112, f1111111112, f1111111112, f1111111112);
                            } else {
                                n10 = l11;
                            }
                            if (i15 != 0) {
                                eVar3 = e.a.f10971a;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i17 != 0) {
                                i34 = 0;
                            } else {
                                i34 = i10;
                            }
                            l13 = n10;
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 != 0) {
                                cVar3 = androidx.compose.ui.d.a.f13344k;
                            } else {
                                cVar3 = cVar;
                            }
                            i35 = 128 & i13;
                            f13 = f12;
                            InterfaceC1084f.a.C0153a c0153a17 = InterfaceC1084f.a.f12980a;
                            if (i35 != 0) {
                                int i41111115 = (i14 & 14) | 196608;
                                rVar2 = new r();
                                interfaceC0918sA = C.a(c1086gP);
                                Object obj17 = s0.f9633a;
                                pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                                p013b0.c cVar111 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                                zK = c1086gP.K(interfaceC0918sA) | ((((i41111115 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111115 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar111) | c1086gP.K(layoutDirection);
                                objF2 = c1086gP.f();
                                if (zK) {
                                    final float f1111111113 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar1112 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1111111114, Float f1111111115, Float f1111111116) {
                                            int i41111116;
                                            float fFloatValue = f1111111114.floatValue();
                                            float fFloatValue2 = f1111111115.floatValue();
                                            float fFloatValue3 = f1111111116.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1111111117 = f1111111113;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41111116 = 0;
                                            } else {
                                                i41111116 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41111116, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1111111117 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111116, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41111116, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar1115 = new androidx.compose.foundation.gestures.snapping.h(gVar1112, interfaceC0918sA, pC);
                                    c1086gP.E(hVar1115);
                                    objF2 = hVar1115;
                                } else {
                                    final float f1111111115 = 0.5f;
                                    androidx.compose.foundation.gestures.snapping.g gVar1113 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final Float invoke(Float f1111111116, Float f1111111117, Float f1111111118) {
                                            int i41111116;
                                            float fFloatValue = f1111111116.floatValue();
                                            float fFloatValue2 = f1111111117.floatValue();
                                            float fFloatValue3 = f1111111118.floatValue();
                                            PagerState pagerState2 = pagerState;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            float f1111111119 = f1111111115;
                                            boolean zL = I2.e.l(pagerState2, fFloatValue);
                                            if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                                zL = !zL;
                                            }
                                            int iF = pagerState2.l().f();
                                            float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                            float f21 = f20 - ((int) f20);
                                            if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                                i41111116 = 0;
                                            } else {
                                                i41111116 = fFloatValue > 0.0f ? 1 : 2;
                                            }
                                            if (androidx.compose.foundation.gestures.snapping.d.a(i41111116, 0)) {
                                                fFloatValue2 = Math.abs(f21) > f1111111119 ? fFloatValue3 : fFloatValue3;
                                            } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111116, 1)) {
                                                if (!androidx.compose.foundation.gestures.snapping.d.a(i41111116, 2)) {
                                                    fFloatValue2 = 0.0f;
                                                }
                                            }
                                            return Float.valueOf(fFloatValue2);
                                        }
                                    }, rVar2);
                                    float f1111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                    androidx.compose.foundation.gestures.snapping.h hVar1116 = new androidx.compose.foundation.gestures.snapping.h(gVar1113, interfaceC0918sA, pC);
                                    c1086gP.E(hVar1116);
                                    objF2 = hVar1116;
                                }
                                xVar3 = (x) objF2;
                                i14 &= -29360129;
                            } else {
                                xVar3 = xVar;
                            }
                            if (i23 != 0) {
                                z15 = true;
                            } else {
                                z15 = z10;
                            }
                            if (i25 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i27 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            if ((2048 & i13) != 0) {
                                Orientation orientation115 = Orientation.f9957b;
                                int i41111116 = (i14 & 14) | 432;
                                if (((i41111116 & 14) ^ 6) <= 4) {
                                }
                                objF = c1086gP.f();
                                if (z17) {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new a(pagerState);
                                    c1086gP.E(objF);
                                }
                                aVar3 = (a) objF;
                                i36 = i30 & (-113);
                            } else {
                                aVar3 = aVar;
                                i36 = i30;
                            }
                            if (i31 != 0) {
                                kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((8192 & i13) != 0) {
                                i30 = i36 & (-7169);
                                eA = OverscrollKt.a(c1086gP);
                            } else {
                                eA = e10;
                                i30 = i36;
                            }
                            cVar4 = cVar3;
                        }
                        c1086gP.U();
                        Orientation orientation116 = Orientation.f9958c;
                        androidx.compose.ui.f.a aVar12 = androidx.compose.ui.d.a.f13347n;
                        int i41111117 = i14 >> 6;
                        int i41111118 = i14 << 12;
                        int i41111119 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i41111117) | (3670016 & i41111117) | ((i30 << 12) & 29360128) | (234881024 & i41111118) | (i41111118 & 1879048192);
                        int i411111110 = i30 << 6;
                        c1086g = c1086gP;
                        LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation116, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar12, cVar4, kVar3, rVar, c1086g, i41111119, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i411111110 & 896) | (i41111117 & 57344) | ((i30 << 9) & 458752) | (3670016 & i411111110), 0);
                        hVar3 = hVar2;
                        l12 = l13;
                        eVar2 = eVar3;
                        i33 = i34;
                        f11 = f13;
                        cVar2 = cVar4;
                        xVar2 = xVar3;
                        z13 = z15;
                        z14 = z16;
                        lVar2 = lVar3;
                        aVar2 = aVar3;
                        kVar2 = kVar3;
                        e11 = eA;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        eVar2 = eVar;
                        i33 = i10;
                        f11 = f10;
                        cVar2 = cVar;
                        z13 = z10;
                        z14 = z11;
                        lVar2 = lVar;
                        aVar2 = aVar;
                        e11 = e10;
                        l12 = l11;
                        hVar3 = hVar2;
                        xVar2 = xVar;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i30 |= 24576;
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f1111111117 = 0;
                            n10 = new N(f1111111117, f1111111117, f1111111117, f1111111117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a18 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411111111 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj18 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar112 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411111111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar112) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f1111111118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1114 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111111119, Float f11111111110, Float f11111111111) {
                                        int i411111112;
                                        float fFloatValue = f1111111119.floatValue();
                                        float fFloatValue2 = f11111111110.floatValue();
                                        float fFloatValue3 = f11111111111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111112 = f1111111118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411111112 = 0;
                                        } else {
                                            i411111112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411111112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411111112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar1117 = new androidx.compose.foundation.gestures.snapping.h(gVar1114, interfaceC0918sA, pC);
                                c1086gP.E(hVar1117);
                                objF2 = hVar1117;
                            } else {
                                final float f11111111110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1115 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111111, Float f11111111112, Float f11111111113) {
                                        int i411111112;
                                        float fFloatValue = f11111111111.floatValue();
                                        float fFloatValue2 = f11111111112.floatValue();
                                        float fFloatValue3 = f11111111113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111114 = f11111111110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411111112 = 0;
                                        } else {
                                            i411111112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411111112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411111112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar1118 = new androidx.compose.foundation.gestures.snapping.h(gVar1115, interfaceC0918sA, pC);
                                c1086gP.E(hVar1118);
                                objF2 = hVar1118;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation117 = Orientation.f9957b;
                            int i411111112 = (i14 & 14) | 432;
                            if (((i411111112 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f11111111112 = 0;
                            n10 = new N(f11111111112, f11111111112, f11111111112, f11111111112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a19 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411111113 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj19 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar113 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411111113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar113) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f11111111113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1116 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111114, Float f11111111115, Float f11111111116) {
                                        int i411111114;
                                        float fFloatValue = f11111111114.floatValue();
                                        float fFloatValue2 = f11111111115.floatValue();
                                        float fFloatValue3 = f11111111116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111117 = f11111111113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411111114 = 0;
                                        } else {
                                            i411111114 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411111114, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111114, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411111114, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar1119 = new androidx.compose.foundation.gestures.snapping.h(gVar1116, interfaceC0918sA, pC);
                                c1086gP.E(hVar1119);
                                objF2 = hVar1119;
                            } else {
                                final float f11111111115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1117 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111116, Float f11111111117, Float f11111111118) {
                                        int i411111114;
                                        float fFloatValue = f11111111116.floatValue();
                                        float fFloatValue2 = f11111111117.floatValue();
                                        float fFloatValue3 = f11111111118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111119 = f11111111115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i411111114 = 0;
                                        } else {
                                            i411111114 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i411111114, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111114, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i411111114, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11110 = new androidx.compose.foundation.gestures.snapping.h(gVar1117, interfaceC0918sA, pC);
                                c1086gP.E(hVar11110);
                                objF2 = hVar11110;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation118 = Orientation.f9957b;
                            int i411111114 = (i14 & 14) | 432;
                            if (((i411111114 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation119 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar13 = androidx.compose.ui.d.a.f13347n;
                    int i411111115 = i14 >> 6;
                    int i411111116 = i14 << 12;
                    int i411111117 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i411111115) | (3670016 & i411111115) | ((i30 << 12) & 29360128) | (234881024 & i411111116) | (i411111116 & 1879048192);
                    int i411111118 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation119, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar13, cVar4, kVar3, rVar, c1086g, i411111117, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i411111118 & 896) | (i411111115 & 57344) | ((i30 << 9) & 458752) | (3670016 & i411111118), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.K(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            if ((i11 & 12582912) != 0) {
                i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            i26 = 805306368;
            if (i25 == 0) {
                i14 |= i26;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.k(lVar)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 16;
                } else {
                    i38 = 16;
                }
                i28 |= i38;
            }
            i30 = i28;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i30 |= 384;
            } else if ((i12 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i37 = 1024;
                } else {
                    i37 = 1024;
                }
                i30 |= i37;
            }
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f11111111117 = 0;
                            n10 = new N(f11111111117, f11111111117, f11111111117, f11111111117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a110 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i411111119 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj110 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar114 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i411111119 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111119 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar114) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f11111111118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1118 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111119, Float f111111111110, Float f111111111111) {
                                        int i4111111110;
                                        float fFloatValue = f11111111119.floatValue();
                                        float fFloatValue2 = f111111111110.floatValue();
                                        float fFloatValue3 = f111111111111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f111111111112 = f11111111118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111111110 = 0;
                                        } else {
                                            i4111111110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f111111111112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11111 = new androidx.compose.foundation.gestures.snapping.h(gVar1118, interfaceC0918sA, pC);
                                c1086gP.E(hVar11111);
                                objF2 = hVar11111;
                            } else {
                                final float f111111111110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar1119 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f111111111111, Float f111111111112, Float f111111111113) {
                                        int i4111111110;
                                        float fFloatValue = f111111111111.floatValue();
                                        float fFloatValue2 = f111111111112.floatValue();
                                        float fFloatValue3 = f111111111113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f111111111114 = f111111111110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111111110 = 0;
                                        } else {
                                            i4111111110 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f111111111114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111110, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11112 = new androidx.compose.foundation.gestures.snapping.h(gVar1119, interfaceC0918sA, pC);
                                c1086gP.E(hVar11112);
                                objF2 = hVar11112;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation1110 = Orientation.f9957b;
                            int i4111111110 = (i14 & 14) | 432;
                            if (((i4111111110 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f111111111112 = 0;
                            n10 = new N(f111111111112, f111111111112, f111111111112, f111111111112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a111 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i4111111111 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj111 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar115 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i4111111111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar115) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f111111111113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11110 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f111111111114, Float f111111111115, Float f111111111116) {
                                        int i4111111112;
                                        float fFloatValue = f111111111114.floatValue();
                                        float fFloatValue2 = f111111111115.floatValue();
                                        float fFloatValue3 = f111111111116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f111111111117 = f111111111113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111111112 = 0;
                                        } else {
                                            i4111111112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f111111111117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11113 = new androidx.compose.foundation.gestures.snapping.h(gVar11110, interfaceC0918sA, pC);
                                c1086gP.E(hVar11113);
                                objF2 = hVar11113;
                            } else {
                                final float f111111111115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11111 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f111111111116, Float f111111111117, Float f111111111118) {
                                        int i4111111112;
                                        float fFloatValue = f111111111116.floatValue();
                                        float fFloatValue2 = f111111111117.floatValue();
                                        float fFloatValue3 = f111111111118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f111111111119 = f111111111115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i4111111112 = 0;
                                        } else {
                                            i4111111112 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f111111111119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111112, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11114 = new androidx.compose.foundation.gestures.snapping.h(gVar11111, interfaceC0918sA, pC);
                                c1086gP.E(hVar11114);
                                objF2 = hVar11114;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation1111 = Orientation.f9957b;
                            int i4111111112 = (i14 & 14) | 432;
                            if (((i4111111112 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation1112 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar14 = androidx.compose.ui.d.a.f13347n;
                    int i4111111113 = i14 >> 6;
                    int i4111111114 = i14 << 12;
                    int i4111111115 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i4111111113) | (3670016 & i4111111113) | ((i30 << 12) & 29360128) | (234881024 & i4111111114) | (i4111111114 & 1879048192);
                    int i4111111116 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation1112, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar14, cVar4, kVar3, rVar, c1086g, i4111111115, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4111111116 & 896) | (i4111111113 & 57344) | ((i30 << 9) & 458752) | (3670016 & i4111111116), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 24576;
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f111111111117 = 0;
                        n10 = new N(f111111111117, f111111111117, f111111111117, f111111111117);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a112 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111111117 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj112 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar116 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111111117 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111117 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar116) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f111111111118 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar11112 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111119, Float f1111111111110, Float f1111111111111) {
                                    int i4111111118;
                                    float fFloatValue = f111111111119.floatValue();
                                    float fFloatValue2 = f1111111111110.floatValue();
                                    float fFloatValue3 = f1111111111111.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111112 = f111111111118;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111118 = 0;
                                    } else {
                                        i4111111118 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111112 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar11115 = new androidx.compose.foundation.gestures.snapping.h(gVar11112, interfaceC0918sA, pC);
                            c1086gP.E(hVar11115);
                            objF2 = hVar11115;
                        } else {
                            final float f1111111111110 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar11113 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111111, Float f1111111111112, Float f1111111111113) {
                                    int i4111111118;
                                    float fFloatValue = f1111111111111.floatValue();
                                    float fFloatValue2 = f1111111111112.floatValue();
                                    float fFloatValue3 = f1111111111113.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111114 = f1111111111110;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111118 = 0;
                                    } else {
                                        i4111111118 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111114 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111118, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar11116 = new androidx.compose.foundation.gestures.snapping.h(gVar11113, interfaceC0918sA, pC);
                            c1086gP.E(hVar11116);
                            objF2 = hVar11116;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation1113 = Orientation.f9957b;
                        int i4111111118 = (i14 & 14) | 432;
                        if (((i4111111118 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f1111111111112 = 0;
                        n10 = new N(f1111111111112, f1111111111112, f1111111111112, f1111111111112);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a113 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111111119 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj113 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar117 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111111119 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111119 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar117) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f1111111111113 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar11114 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111114, Float f1111111111115, Float f1111111111116) {
                                    int i41111111110;
                                    float fFloatValue = f1111111111114.floatValue();
                                    float fFloatValue2 = f1111111111115.floatValue();
                                    float fFloatValue3 = f1111111111116.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111117 = f1111111111113;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i41111111110 = 0;
                                    } else {
                                        i41111111110 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111117 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar11117 = new androidx.compose.foundation.gestures.snapping.h(gVar11114, interfaceC0918sA, pC);
                            c1086gP.E(hVar11117);
                            objF2 = hVar11117;
                        } else {
                            final float f1111111111115 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar11115 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111116, Float f1111111111117, Float f1111111111118) {
                                    int i41111111110;
                                    float fFloatValue = f1111111111116.floatValue();
                                    float fFloatValue2 = f1111111111117.floatValue();
                                    float fFloatValue3 = f1111111111118.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111119 = f1111111111115;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i41111111110 = 0;
                                    } else {
                                        i41111111110 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111119 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111110, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar11118 = new androidx.compose.foundation.gestures.snapping.h(gVar11115, interfaceC0918sA, pC);
                            c1086gP.E(hVar11118);
                            objF2 = hVar11118;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation1114 = Orientation.f9957b;
                        int i41111111110 = (i14 & 14) | 432;
                        if (((i41111111110 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                }
                c1086gP.U();
                Orientation orientation1115 = Orientation.f9958c;
                androidx.compose.ui.f.a aVar15 = androidx.compose.ui.d.a.f13347n;
                int i41111111111 = i14 >> 6;
                int i41111111112 = i14 << 12;
                int i41111111113 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i41111111111) | (3670016 & i41111111111) | ((i30 << 12) & 29360128) | (234881024 & i41111111112) | (i41111111112 & 1879048192);
                int i41111111114 = i30 << 6;
                c1086g = c1086gP;
                LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation1115, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar15, cVar4, kVar3, rVar, c1086g, i41111111113, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i41111111114 & 896) | (i41111111111 & 57344) | ((i30 << 9) & 458752) | (3670016 & i41111111114), 0);
                hVar3 = hVar2;
                l12 = l13;
                eVar2 = eVar3;
                i33 = i34;
                f11 = f13;
                cVar2 = cVar4;
                xVar2 = xVar3;
                z13 = z15;
                z14 = z16;
                lVar2 = lVar3;
                aVar2 = aVar3;
                kVar2 = kVar3;
                e11 = eA;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                eVar2 = eVar;
                i33 = i10;
                f11 = f10;
                cVar2 = cVar;
                z13 = z10;
                z14 = z11;
                lVar2 = lVar;
                aVar2 = aVar;
                e11 = e10;
                l12 = l11;
                hVar3 = hVar2;
                xVar2 = xVar;
                kVar2 = kVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 3072;
        i17 = i13 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                if (c1086gP.h(i10)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.K(cVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            if ((i11 & 12582912) != 0) {
                i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
            i25 = i13 & 512;
            i26 = 805306368;
            if (i25 == 0) {
                i14 |= i26;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i14 |= i26;
            }
            i27 = i13 & 1024;
            if (i27 != 0) {
                i28 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.k(lVar)) {
                    i29 = 4;
                } else {
                    i29 = 2;
                }
                i28 = i12 | i29;
            } else {
                i28 = i12;
            }
            if ((i12 & 48) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 16;
                } else {
                    i38 = 16;
                }
                i28 |= i38;
            }
            i30 = i28;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i30 |= 384;
            } else if ((i12 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i32 = 256;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i37 = 1024;
                } else {
                    i37 = 1024;
                }
                i30 |= i37;
            }
            if ((i13 & 16384) != 0) {
                if ((i12 & 24576) == 0) {
                    i30 |= c1086gP.k(rVar) ? 16384 : 8192;
                }
                if ((306783379 & i14) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f1111111111117 = 0;
                            n10 = new N(f1111111111117, f1111111111117, f1111111111117, f1111111111117);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a114 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i41111111115 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj114 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar118 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i41111111115 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111111115 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar118) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f1111111111118 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11116 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f1111111111119, Float f11111111111110, Float f11111111111111) {
                                        int i41111111116;
                                        float fFloatValue = f1111111111119.floatValue();
                                        float fFloatValue2 = f11111111111110.floatValue();
                                        float fFloatValue3 = f11111111111111.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111111112 = f1111111111118;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i41111111116 = 0;
                                        } else {
                                            i41111111116 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111111112 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f1111111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar11119 = new androidx.compose.foundation.gestures.snapping.h(gVar11116, interfaceC0918sA, pC);
                                c1086gP.E(hVar11119);
                                objF2 = hVar11119;
                            } else {
                                final float f11111111111110 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11117 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111111111, Float f11111111111112, Float f11111111111113) {
                                        int i41111111116;
                                        float fFloatValue = f11111111111111.floatValue();
                                        float fFloatValue2 = f11111111111112.floatValue();
                                        float fFloatValue3 = f11111111111113.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111111114 = f11111111111110;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i41111111116 = 0;
                                        } else {
                                            i41111111116 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111111114 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111116, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar111110 = new androidx.compose.foundation.gestures.snapping.h(gVar11117, interfaceC0918sA, pC);
                                c1086gP.E(hVar111110);
                                objF2 = hVar111110;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation1116 = Orientation.f9957b;
                            int i41111111116 = (i14 & 14) | 432;
                            if (((i41111111116 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    } else {
                        if (i39 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i40 != 0) {
                            float f11111111111112 = 0;
                            n10 = new N(f11111111111112, f11111111111112, f11111111111112, f11111111111112);
                        } else {
                            n10 = l11;
                        }
                        if (i15 != 0) {
                            eVar3 = e.a.f10971a;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i17 != 0) {
                            i34 = 0;
                        } else {
                            i34 = i10;
                        }
                        l13 = n10;
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 != 0) {
                            cVar3 = androidx.compose.ui.d.a.f13344k;
                        } else {
                            cVar3 = cVar;
                        }
                        i35 = 128 & i13;
                        f13 = f12;
                        InterfaceC1084f.a.C0153a c0153a115 = InterfaceC1084f.a.f12980a;
                        if (i35 != 0) {
                            int i41111111117 = (i14 & 14) | 196608;
                            rVar2 = new r();
                            interfaceC0918sA = C.a(c1086gP);
                            Object obj115 = s0.f9633a;
                            pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                            p013b0.c cVar119 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            zK = c1086gP.K(interfaceC0918sA) | ((((i41111111117 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111111117 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar119) | c1086gP.K(layoutDirection);
                            objF2 = c1086gP.f();
                            if (zK) {
                                final float f11111111111113 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11118 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111111114, Float f11111111111115, Float f11111111111116) {
                                        int i41111111118;
                                        float fFloatValue = f11111111111114.floatValue();
                                        float fFloatValue2 = f11111111111115.floatValue();
                                        float fFloatValue3 = f11111111111116.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111111117 = f11111111111113;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i41111111118 = 0;
                                        } else {
                                            i41111111118 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111111117 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar111111 = new androidx.compose.foundation.gestures.snapping.h(gVar11118, interfaceC0918sA, pC);
                                c1086gP.E(hVar111111);
                                objF2 = hVar111111;
                            } else {
                                final float f11111111111115 = 0.5f;
                                androidx.compose.foundation.gestures.snapping.g gVar11119 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final Float invoke(Float f11111111111116, Float f11111111111117, Float f11111111111118) {
                                        int i41111111118;
                                        float fFloatValue = f11111111111116.floatValue();
                                        float fFloatValue2 = f11111111111117.floatValue();
                                        float fFloatValue3 = f11111111111118.floatValue();
                                        PagerState pagerState2 = pagerState;
                                        LayoutDirection layoutDirection2 = layoutDirection;
                                        float f11111111111119 = f11111111111115;
                                        boolean zL = I2.e.l(pagerState2, fFloatValue);
                                        if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                            zL = !zL;
                                        }
                                        int iF = pagerState2.l().f();
                                        float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                        float f21 = f20 - ((int) f20);
                                        if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                            i41111111118 = 0;
                                        } else {
                                            i41111111118 = fFloatValue > 0.0f ? 1 : 2;
                                        }
                                        if (androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 0)) {
                                            fFloatValue2 = Math.abs(f21) > f11111111111119 ? fFloatValue3 : fFloatValue3;
                                        } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 1)) {
                                            if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111118, 2)) {
                                                fFloatValue2 = 0.0f;
                                            }
                                        }
                                        return Float.valueOf(fFloatValue2);
                                    }
                                }, rVar2);
                                float f11111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                                androidx.compose.foundation.gestures.snapping.h hVar111112 = new androidx.compose.foundation.gestures.snapping.h(gVar11119, interfaceC0918sA, pC);
                                c1086gP.E(hVar111112);
                                objF2 = hVar111112;
                            }
                            xVar3 = (x) objF2;
                            i14 &= -29360129;
                        } else {
                            xVar3 = xVar;
                        }
                        if (i23 != 0) {
                            z15 = true;
                        } else {
                            z15 = z10;
                        }
                        if (i25 != 0) {
                            z16 = false;
                        } else {
                            z16 = z11;
                        }
                        if (i27 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        if ((2048 & i13) != 0) {
                            Orientation orientation1117 = Orientation.f9957b;
                            int i41111111118 = (i14 & 14) | 432;
                            if (((i41111111118 & 14) ^ 6) <= 4) {
                            }
                            objF = c1086gP.f();
                            if (z17) {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            } else {
                                objF = new a(pagerState);
                                c1086gP.E(objF);
                            }
                            aVar3 = (a) objF;
                            i36 = i30 & (-113);
                        } else {
                            aVar3 = aVar;
                            i36 = i30;
                        }
                        if (i31 != 0) {
                            kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((8192 & i13) != 0) {
                            i30 = i36 & (-7169);
                            eA = OverscrollKt.a(c1086gP);
                        } else {
                            eA = e10;
                            i30 = i36;
                        }
                        cVar4 = cVar3;
                    }
                    c1086gP.U();
                    Orientation orientation1118 = Orientation.f9958c;
                    androidx.compose.ui.f.a aVar16 = androidx.compose.ui.d.a.f13347n;
                    int i41111111119 = i14 >> 6;
                    int i411111111110 = i14 << 12;
                    int i411111111111 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i41111111119) | (3670016 & i41111111119) | ((i30 << 12) & 29360128) | (234881024 & i411111111110) | (i411111111110 & 1879048192);
                    int i411111111112 = i30 << 6;
                    c1086g = c1086gP;
                    LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation1118, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar16, cVar4, kVar3, rVar, c1086g, i411111111111, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i411111111112 & 896) | (i41111111119 & 57344) | ((i30 << 9) & 458752) | (3670016 & i411111111112), 0);
                    hVar3 = hVar2;
                    l12 = l13;
                    eVar2 = eVar3;
                    i33 = i34;
                    f11 = f13;
                    cVar2 = cVar4;
                    xVar2 = xVar3;
                    z13 = z15;
                    z14 = z16;
                    lVar2 = lVar3;
                    aVar2 = aVar3;
                    kVar2 = kVar3;
                    e11 = eA;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    eVar2 = eVar;
                    i33 = i10;
                    f11 = f10;
                    cVar2 = cVar;
                    z13 = z10;
                    z14 = z11;
                    lVar2 = lVar;
                    aVar2 = aVar;
                    e11 = e10;
                    l12 = l11;
                    hVar3 = hVar2;
                    xVar2 = xVar;
                    kVar2 = kVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i30 |= 24576;
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f11111111111117 = 0;
                        n10 = new N(f11111111111117, f11111111111117, f11111111111117, f11111111111117);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a116 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i411111111113 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj116 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar1110 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i411111111113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111111113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1110) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f11111111111118 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111110 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f11111111111119, Float f111111111111110, Float f111111111111111) {
                                    int i411111111114;
                                    float fFloatValue = f11111111111119.floatValue();
                                    float fFloatValue2 = f111111111111110.floatValue();
                                    float fFloatValue3 = f111111111111111.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111111111112 = f11111111111118;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i411111111114 = 0;
                                    } else {
                                        i411111111114 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111111111112 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f11111111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111113 = new androidx.compose.foundation.gestures.snapping.h(gVar111110, interfaceC0918sA, pC);
                            c1086gP.E(hVar111113);
                            objF2 = hVar111113;
                        } else {
                            final float f111111111111110 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111111 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111111111, Float f111111111111112, Float f111111111111113) {
                                    int i411111111114;
                                    float fFloatValue = f111111111111111.floatValue();
                                    float fFloatValue2 = f111111111111112.floatValue();
                                    float fFloatValue3 = f111111111111113.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111111111114 = f111111111111110;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i411111111114 = 0;
                                    } else {
                                        i411111111114 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111111111114 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111114, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111114 = new androidx.compose.foundation.gestures.snapping.h(gVar111111, interfaceC0918sA, pC);
                            c1086gP.E(hVar111114);
                            objF2 = hVar111114;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation1119 = Orientation.f9957b;
                        int i411111111114 = (i14 & 14) | 432;
                        if (((i411111111114 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f111111111111112 = 0;
                        n10 = new N(f111111111111112, f111111111111112, f111111111111112, f111111111111112);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a117 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i411111111115 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj117 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar1111 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i411111111115 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i411111111115 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1111) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f111111111111113 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111112 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111111114, Float f111111111111115, Float f111111111111116) {
                                    int i411111111116;
                                    float fFloatValue = f111111111111114.floatValue();
                                    float fFloatValue2 = f111111111111115.floatValue();
                                    float fFloatValue3 = f111111111111116.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111111111117 = f111111111111113;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i411111111116 = 0;
                                    } else {
                                        i411111111116 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111111111117 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111115 = new androidx.compose.foundation.gestures.snapping.h(gVar111112, interfaceC0918sA, pC);
                            c1086gP.E(hVar111115);
                            objF2 = hVar111115;
                        } else {
                            final float f111111111111115 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111113 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111111116, Float f111111111111117, Float f111111111111118) {
                                    int i411111111116;
                                    float fFloatValue = f111111111111116.floatValue();
                                    float fFloatValue2 = f111111111111117.floatValue();
                                    float fFloatValue3 = f111111111111118.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f111111111111119 = f111111111111115;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i411111111116 = 0;
                                    } else {
                                        i411111111116 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f111111111111119 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i411111111116, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111116 = new androidx.compose.foundation.gestures.snapping.h(gVar111113, interfaceC0918sA, pC);
                            c1086gP.E(hVar111116);
                            objF2 = hVar111116;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation11110 = Orientation.f9957b;
                        int i411111111116 = (i14 & 14) | 432;
                        if (((i411111111116 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                }
                c1086gP.U();
                Orientation orientation11111 = Orientation.f9958c;
                androidx.compose.ui.f.a aVar17 = androidx.compose.ui.d.a.f13347n;
                int i411111111117 = i14 >> 6;
                int i411111111118 = i14 << 12;
                int i411111111119 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i411111111117) | (3670016 & i411111111117) | ((i30 << 12) & 29360128) | (234881024 & i411111111118) | (i411111111118 & 1879048192);
                int i4111111111110 = i30 << 6;
                c1086g = c1086gP;
                LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation11111, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar17, cVar4, kVar3, rVar, c1086g, i411111111119, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4111111111110 & 896) | (i411111111117 & 57344) | ((i30 << 9) & 458752) | (3670016 & i4111111111110), 0);
                hVar3 = hVar2;
                l12 = l13;
                eVar2 = eVar3;
                i33 = i34;
                f11 = f13;
                cVar2 = cVar4;
                xVar2 = xVar3;
                z13 = z15;
                z14 = z16;
                lVar2 = lVar3;
                aVar2 = aVar3;
                kVar2 = kVar3;
                e11 = eA;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                eVar2 = eVar;
                i33 = i10;
                f11 = f10;
                cVar2 = cVar;
                z13 = z10;
                z14 = z11;
                lVar2 = lVar;
                aVar2 = aVar;
                e11 = e10;
                l12 = l11;
                hVar3 = hVar2;
                xVar2 = xVar;
                kVar2 = kVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 24576;
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (c1086gP.g(f10)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i14 |= i20;
        }
        i21 = i13 & 64;
        if (i21 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c1086gP.K(cVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i14 |= i22;
        }
        if ((i11 & 12582912) != 0) {
            i14 |= ((i13 & 128) == 0 || !c1086gP.K(xVar)) ? 4194304 : 8388608;
        }
        i23 = i13 & 256;
        if (i23 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (c1086gP.c(z10)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i14 |= i24;
        }
        i25 = i13 & 512;
        i26 = 805306368;
        if (i25 == 0) {
            i14 |= i26;
        } else if ((i11 & 805306368) == 0) {
            if (c1086gP.c(z11)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i14 |= i26;
        }
        i27 = i13 & 1024;
        if (i27 != 0) {
            i28 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (c1086gP.k(lVar)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i12 | i29;
        } else {
            i28 = i12;
        }
        if ((i12 & 48) != 0) {
            if ((i13 & 2048) == 0) {
                i38 = 16;
            } else {
                i38 = 16;
            }
            i28 |= i38;
        }
        i30 = i28;
        i31 = i13 & 4096;
        if (i31 != 0) {
            i30 |= 384;
        } else if ((i12 & 384) != 0) {
            if (c1086gP.K(kVar)) {
                i32 = 256;
            } else {
                i32 = 128;
            }
            i30 |= i32;
        }
        if ((i12 & 3072) != 0) {
            if ((i13 & 8192) == 0) {
                i37 = 1024;
            } else {
                i37 = 1024;
            }
            i30 |= i37;
        }
        if ((i13 & 16384) != 0) {
            if ((i12 & 24576) == 0) {
                i30 |= c1086gP.k(rVar) ? 16384 : 8192;
            }
            if ((306783379 & i14) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f111111111111117 = 0;
                        n10 = new N(f111111111111117, f111111111111117, f111111111111117, f111111111111117);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a118 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111111111111 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj118 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar1112 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111111111111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111111111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1112) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f111111111111118 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111114 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f111111111111119, Float f1111111111111110, Float f1111111111111111) {
                                    int i4111111111112;
                                    float fFloatValue = f111111111111119.floatValue();
                                    float fFloatValue2 = f1111111111111110.floatValue();
                                    float fFloatValue3 = f1111111111111111.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111111112 = f111111111111118;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111111112 = 0;
                                    } else {
                                        i4111111111112 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111111112 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f111111111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111117 = new androidx.compose.foundation.gestures.snapping.h(gVar111114, interfaceC0918sA, pC);
                            c1086gP.E(hVar111117);
                            objF2 = hVar111117;
                        } else {
                            final float f1111111111111110 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111115 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111111111, Float f1111111111111112, Float f1111111111111113) {
                                    int i4111111111112;
                                    float fFloatValue = f1111111111111111.floatValue();
                                    float fFloatValue2 = f1111111111111112.floatValue();
                                    float fFloatValue3 = f1111111111111113.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111111114 = f1111111111111110;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111111112 = 0;
                                    } else {
                                        i4111111111112 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111111114 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111112, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111118 = new androidx.compose.foundation.gestures.snapping.h(gVar111115, interfaceC0918sA, pC);
                            c1086gP.E(hVar111118);
                            objF2 = hVar111118;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation11112 = Orientation.f9957b;
                        int i4111111111112 = (i14 & 14) | 432;
                        if (((i4111111111112 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                } else {
                    if (i39 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i40 != 0) {
                        float f1111111111111112 = 0;
                        n10 = new N(f1111111111111112, f1111111111111112, f1111111111111112, f1111111111111112);
                    } else {
                        n10 = l11;
                    }
                    if (i15 != 0) {
                        eVar3 = e.a.f10971a;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i17 != 0) {
                        i34 = 0;
                    } else {
                        i34 = i10;
                    }
                    l13 = n10;
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 != 0) {
                        cVar3 = androidx.compose.ui.d.a.f13344k;
                    } else {
                        cVar3 = cVar;
                    }
                    i35 = 128 & i13;
                    f13 = f12;
                    InterfaceC1084f.a.C0153a c0153a119 = InterfaceC1084f.a.f12980a;
                    if (i35 != 0) {
                        int i4111111111113 = (i14 & 14) | 196608;
                        rVar2 = new r();
                        interfaceC0918sA = C.a(c1086gP);
                        Object obj119 = s0.f9633a;
                        pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                        p013b0.c cVar1113 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        zK = c1086gP.K(interfaceC0918sA) | ((((i4111111111113 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111111113 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1113) | c1086gP.K(layoutDirection);
                        objF2 = c1086gP.f();
                        if (zK) {
                            final float f1111111111111113 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111116 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111111114, Float f1111111111111115, Float f1111111111111116) {
                                    int i4111111111114;
                                    float fFloatValue = f1111111111111114.floatValue();
                                    float fFloatValue2 = f1111111111111115.floatValue();
                                    float fFloatValue3 = f1111111111111116.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111111117 = f1111111111111113;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111111114 = 0;
                                    } else {
                                        i4111111111114 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111111117 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar111119 = new androidx.compose.foundation.gestures.snapping.h(gVar111116, interfaceC0918sA, pC);
                            c1086gP.E(hVar111119);
                            objF2 = hVar111119;
                        } else {
                            final float f1111111111111115 = 0.5f;
                            androidx.compose.foundation.gestures.snapping.g gVar111117 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final Float invoke(Float f1111111111111116, Float f1111111111111117, Float f1111111111111118) {
                                    int i4111111111114;
                                    float fFloatValue = f1111111111111116.floatValue();
                                    float fFloatValue2 = f1111111111111117.floatValue();
                                    float fFloatValue3 = f1111111111111118.floatValue();
                                    PagerState pagerState2 = pagerState;
                                    LayoutDirection layoutDirection2 = layoutDirection;
                                    float f1111111111111119 = f1111111111111115;
                                    boolean zL = I2.e.l(pagerState2, fFloatValue);
                                    if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                        zL = !zL;
                                    }
                                    int iF = pagerState2.l().f();
                                    float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                    float f21 = f20 - ((int) f20);
                                    if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                        i4111111111114 = 0;
                                    } else {
                                        i4111111111114 = fFloatValue > 0.0f ? 1 : 2;
                                    }
                                    if (androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 0)) {
                                        fFloatValue2 = Math.abs(f21) > f1111111111111119 ? fFloatValue3 : fFloatValue3;
                                    } else if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 1)) {
                                        if (!androidx.compose.foundation.gestures.snapping.d.a(i4111111111114, 2)) {
                                            fFloatValue2 = 0.0f;
                                        }
                                    }
                                    return Float.valueOf(fFloatValue2);
                                }
                            }, rVar2);
                            float f1111111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar1111110 = new androidx.compose.foundation.gestures.snapping.h(gVar111117, interfaceC0918sA, pC);
                            c1086gP.E(hVar1111110);
                            objF2 = hVar1111110;
                        }
                        xVar3 = (x) objF2;
                        i14 &= -29360129;
                    } else {
                        xVar3 = xVar;
                    }
                    if (i23 != 0) {
                        z15 = true;
                    } else {
                        z15 = z10;
                    }
                    if (i25 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i27 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    if ((2048 & i13) != 0) {
                        Orientation orientation11113 = Orientation.f9957b;
                        int i4111111111114 = (i14 & 14) | 432;
                        if (((i4111111111114 & 14) ^ 6) <= 4) {
                        }
                        objF = c1086gP.f();
                        if (z17) {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        } else {
                            objF = new a(pagerState);
                            c1086gP.E(objF);
                        }
                        aVar3 = (a) objF;
                        i36 = i30 & (-113);
                    } else {
                        aVar3 = aVar;
                        i36 = i30;
                    }
                    if (i31 != 0) {
                        kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((8192 & i13) != 0) {
                        i30 = i36 & (-7169);
                        eA = OverscrollKt.a(c1086gP);
                    } else {
                        eA = e10;
                        i30 = i36;
                    }
                    cVar4 = cVar3;
                }
                c1086gP.U();
                Orientation orientation11114 = Orientation.f9958c;
                androidx.compose.ui.f.a aVar18 = androidx.compose.ui.d.a.f13347n;
                int i4111111111115 = i14 >> 6;
                int i4111111111116 = i14 << 12;
                int i4111111111117 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i4111111111115) | (3670016 & i4111111111115) | ((i30 << 12) & 29360128) | (234881024 & i4111111111116) | (i4111111111116 & 1879048192);
                int i4111111111118 = i30 << 6;
                c1086g = c1086gP;
                LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation11114, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar18, cVar4, kVar3, rVar, c1086g, i4111111111117, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4111111111118 & 896) | (i4111111111115 & 57344) | ((i30 << 9) & 458752) | (3670016 & i4111111111118), 0);
                hVar3 = hVar2;
                l12 = l13;
                eVar2 = eVar3;
                i33 = i34;
                f11 = f13;
                cVar2 = cVar4;
                xVar2 = xVar3;
                z13 = z15;
                z14 = z16;
                lVar2 = lVar3;
                aVar2 = aVar3;
                kVar2 = kVar3;
                e11 = eA;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                eVar2 = eVar;
                i33 = i10;
                f11 = f10;
                cVar2 = cVar;
                z13 = z10;
                z14 = z11;
                lVar2 = lVar;
                aVar2 = aVar;
                e11 = e10;
                l12 = l11;
                hVar3 = hVar2;
                xVar2 = xVar;
                kVar2 = kVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i30 |= 24576;
        if ((306783379 & i14) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c1086gP.C(i14 & 1, z12)) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i39 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i40 != 0) {
                    float f1111111111111117 = 0;
                    n10 = new N(f1111111111111117, f1111111111111117, f1111111111111117, f1111111111111117);
                } else {
                    n10 = l11;
                }
                if (i15 != 0) {
                    eVar3 = e.a.f10971a;
                } else {
                    eVar3 = eVar;
                }
                if (i17 != 0) {
                    i34 = 0;
                } else {
                    i34 = i10;
                }
                l13 = n10;
                if (i19 != 0) {
                    f12 = 0;
                } else {
                    f12 = f10;
                }
                if (i21 != 0) {
                    cVar3 = androidx.compose.ui.d.a.f13344k;
                } else {
                    cVar3 = cVar;
                }
                i35 = 128 & i13;
                f13 = f12;
                InterfaceC1084f.a.C0153a c0153a1110 = InterfaceC1084f.a.f12980a;
                if (i35 != 0) {
                    int i4111111111119 = (i14 & 14) | 196608;
                    rVar2 = new r();
                    interfaceC0918sA = C.a(c1086gP);
                    Object obj1110 = s0.f9633a;
                    pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                    p013b0.c cVar1114 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    zK = c1086gP.K(interfaceC0918sA) | ((((i4111111111119 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i4111111111119 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1114) | c1086gP.K(layoutDirection);
                    objF2 = c1086gP.f();
                    if (zK) {
                        final float f1111111111111118 = 0.5f;
                        androidx.compose.foundation.gestures.snapping.g gVar111118 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final Float invoke(Float f1111111111111119, Float f11111111111111110, Float f11111111111111111) {
                                int i41111111111110;
                                float fFloatValue = f1111111111111119.floatValue();
                                float fFloatValue2 = f11111111111111110.floatValue();
                                float fFloatValue3 = f11111111111111111.floatValue();
                                PagerState pagerState2 = pagerState;
                                LayoutDirection layoutDirection2 = layoutDirection;
                                float f11111111111111112 = f1111111111111118;
                                boolean zL = I2.e.l(pagerState2, fFloatValue);
                                if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                    zL = !zL;
                                }
                                int iF = pagerState2.l().f();
                                float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                float f21 = f20 - ((int) f20);
                                if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                    i41111111111110 = 0;
                                } else {
                                    i41111111111110 = fFloatValue > 0.0f ? 1 : 2;
                                }
                                if (androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 0)) {
                                    fFloatValue2 = Math.abs(f21) > f11111111111111112 ? fFloatValue3 : fFloatValue3;
                                } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 1)) {
                                    if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 2)) {
                                        fFloatValue2 = 0.0f;
                                    }
                                }
                                return Float.valueOf(fFloatValue2);
                            }
                        }, rVar2);
                        float f1111111111111119 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                        androidx.compose.foundation.gestures.snapping.h hVar1111111 = new androidx.compose.foundation.gestures.snapping.h(gVar111118, interfaceC0918sA, pC);
                        c1086gP.E(hVar1111111);
                        objF2 = hVar1111111;
                    } else {
                        final float f11111111111111110 = 0.5f;
                        androidx.compose.foundation.gestures.snapping.g gVar111119 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final Float invoke(Float f11111111111111111, Float f11111111111111112, Float f11111111111111113) {
                                int i41111111111110;
                                float fFloatValue = f11111111111111111.floatValue();
                                float fFloatValue2 = f11111111111111112.floatValue();
                                float fFloatValue3 = f11111111111111113.floatValue();
                                PagerState pagerState2 = pagerState;
                                LayoutDirection layoutDirection2 = layoutDirection;
                                float f11111111111111114 = f11111111111111110;
                                boolean zL = I2.e.l(pagerState2, fFloatValue);
                                if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                    zL = !zL;
                                }
                                int iF = pagerState2.l().f();
                                float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                float f21 = f20 - ((int) f20);
                                if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                    i41111111111110 = 0;
                                } else {
                                    i41111111111110 = fFloatValue > 0.0f ? 1 : 2;
                                }
                                if (androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 0)) {
                                    fFloatValue2 = Math.abs(f21) > f11111111111111114 ? fFloatValue3 : fFloatValue3;
                                } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 1)) {
                                    if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111110, 2)) {
                                        fFloatValue2 = 0.0f;
                                    }
                                }
                                return Float.valueOf(fFloatValue2);
                            }
                        }, rVar2);
                        float f11111111111111111 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                        androidx.compose.foundation.gestures.snapping.h hVar1111112 = new androidx.compose.foundation.gestures.snapping.h(gVar111119, interfaceC0918sA, pC);
                        c1086gP.E(hVar1111112);
                        objF2 = hVar1111112;
                    }
                    xVar3 = (x) objF2;
                    i14 &= -29360129;
                } else {
                    xVar3 = xVar;
                }
                if (i23 != 0) {
                    z15 = true;
                } else {
                    z15 = z10;
                }
                if (i25 != 0) {
                    z16 = false;
                } else {
                    z16 = z11;
                }
                if (i27 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if ((2048 & i13) != 0) {
                    Orientation orientation11115 = Orientation.f9957b;
                    int i41111111111110 = (i14 & 14) | 432;
                    if (((i41111111111110 & 14) ^ 6) <= 4) {
                    }
                    objF = c1086gP.f();
                    if (z17) {
                        objF = new a(pagerState);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(pagerState);
                        c1086gP.E(objF);
                    }
                    aVar3 = (a) objF;
                    i36 = i30 & (-113);
                } else {
                    aVar3 = aVar;
                    i36 = i30;
                }
                if (i31 != 0) {
                    kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                } else {
                    kVar3 = kVar;
                }
                if ((8192 & i13) != 0) {
                    i30 = i36 & (-7169);
                    eA = OverscrollKt.a(c1086gP);
                } else {
                    eA = e10;
                    i30 = i36;
                }
                cVar4 = cVar3;
            } else {
                if (i39 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i40 != 0) {
                    float f11111111111111112 = 0;
                    n10 = new N(f11111111111111112, f11111111111111112, f11111111111111112, f11111111111111112);
                } else {
                    n10 = l11;
                }
                if (i15 != 0) {
                    eVar3 = e.a.f10971a;
                } else {
                    eVar3 = eVar;
                }
                if (i17 != 0) {
                    i34 = 0;
                } else {
                    i34 = i10;
                }
                l13 = n10;
                if (i19 != 0) {
                    f12 = 0;
                } else {
                    f12 = f10;
                }
                if (i21 != 0) {
                    cVar3 = androidx.compose.ui.d.a.f13344k;
                } else {
                    cVar3 = cVar;
                }
                i35 = 128 & i13;
                f13 = f12;
                InterfaceC1084f.a.C0153a c0153a1111 = InterfaceC1084f.a.f12980a;
                if (i35 != 0) {
                    int i41111111111111 = (i14 & 14) | 196608;
                    rVar2 = new r();
                    interfaceC0918sA = C.a(c1086gP);
                    Object obj1111 = s0.f9633a;
                    pC = C0907g.c(0.0f, 400.0f, Float.valueOf(1), 1);
                    p013b0.c cVar1115 = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    zK = c1086gP.K(interfaceC0918sA) | ((((i41111111111111 & 14) ^ 6) <= 4 && c1086gP.K(pagerState)) || (i41111111111111 & 6) == 4) | c1086gP.K(pC) | c1086gP.K(rVar2) | c1086gP.K(cVar1115) | c1086gP.K(layoutDirection);
                    objF2 = c1086gP.f();
                    if (zK) {
                        final float f11111111111111113 = 0.5f;
                        androidx.compose.foundation.gestures.snapping.g gVar1111110 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final Float invoke(Float f11111111111111114, Float f11111111111111115, Float f11111111111111116) {
                                int i41111111111112;
                                float fFloatValue = f11111111111111114.floatValue();
                                float fFloatValue2 = f11111111111111115.floatValue();
                                float fFloatValue3 = f11111111111111116.floatValue();
                                PagerState pagerState2 = pagerState;
                                LayoutDirection layoutDirection2 = layoutDirection;
                                float f11111111111111117 = f11111111111111113;
                                boolean zL = I2.e.l(pagerState2, fFloatValue);
                                if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                    zL = !zL;
                                }
                                int iF = pagerState2.l().f();
                                float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                float f21 = f20 - ((int) f20);
                                if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                    i41111111111112 = 0;
                                } else {
                                    i41111111111112 = fFloatValue > 0.0f ? 1 : 2;
                                }
                                if (androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 0)) {
                                    fFloatValue2 = Math.abs(f21) > f11111111111111117 ? fFloatValue3 : fFloatValue3;
                                } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 1)) {
                                    if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 2)) {
                                        fFloatValue2 = 0.0f;
                                    }
                                }
                                return Float.valueOf(fFloatValue2);
                            }
                        }, rVar2);
                        float f11111111111111114 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                        androidx.compose.foundation.gestures.snapping.h hVar1111113 = new androidx.compose.foundation.gestures.snapping.h(gVar1111110, interfaceC0918sA, pC);
                        c1086gP.E(hVar1111113);
                        objF2 = hVar1111113;
                    } else {
                        final float f11111111111111115 = 0.5f;
                        androidx.compose.foundation.gestures.snapping.g gVar1111111 = new androidx.compose.foundation.gestures.snapping.g(pagerState, new Ia.q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final Float invoke(Float f11111111111111116, Float f11111111111111117, Float f11111111111111118) {
                                int i41111111111112;
                                float fFloatValue = f11111111111111116.floatValue();
                                float fFloatValue2 = f11111111111111117.floatValue();
                                float fFloatValue3 = f11111111111111118.floatValue();
                                PagerState pagerState2 = pagerState;
                                LayoutDirection layoutDirection2 = layoutDirection;
                                float f11111111111111119 = f11111111111111115;
                                boolean zL = I2.e.l(pagerState2, fFloatValue);
                                if (pagerState2.l().getOrientation() != Orientation.f9957b && layoutDirection2 != LayoutDirection.f15717b) {
                                    zL = !zL;
                                }
                                int iF = pagerState2.l().f();
                                float f20 = iF == 0 ? 0.0f : I2.e.f(pagerState2) / iF;
                                float f21 = f20 - ((int) f20);
                                if (Math.abs(fFloatValue) < pagerState2.f10944q.T0(androidx.compose.foundation.gestures.snapping.i.f10049a)) {
                                    i41111111111112 = 0;
                                } else {
                                    i41111111111112 = fFloatValue > 0.0f ? 1 : 2;
                                }
                                if (androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 0)) {
                                    fFloatValue2 = Math.abs(f21) > f11111111111111119 ? fFloatValue3 : fFloatValue3;
                                } else if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 1)) {
                                    if (!androidx.compose.foundation.gestures.snapping.d.a(i41111111111112, 2)) {
                                        fFloatValue2 = 0.0f;
                                    }
                                }
                                return Float.valueOf(fFloatValue2);
                            }
                        }, rVar2);
                        float f11111111111111116 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                        androidx.compose.foundation.gestures.snapping.h hVar1111114 = new androidx.compose.foundation.gestures.snapping.h(gVar1111111, interfaceC0918sA, pC);
                        c1086gP.E(hVar1111114);
                        objF2 = hVar1111114;
                    }
                    xVar3 = (x) objF2;
                    i14 &= -29360129;
                } else {
                    xVar3 = xVar;
                }
                if (i23 != 0) {
                    z15 = true;
                } else {
                    z15 = z10;
                }
                if (i25 != 0) {
                    z16 = false;
                } else {
                    z16 = z11;
                }
                if (i27 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                if ((2048 & i13) != 0) {
                    Orientation orientation11116 = Orientation.f9957b;
                    int i41111111111112 = (i14 & 14) | 432;
                    if (((i41111111111112 & 14) ^ 6) <= 4) {
                    }
                    objF = c1086gP.f();
                    if (z17) {
                        objF = new a(pagerState);
                        c1086gP.E(objF);
                    } else {
                        objF = new a(pagerState);
                        c1086gP.E(objF);
                    }
                    aVar3 = (a) objF;
                    i36 = i30 & (-113);
                } else {
                    aVar3 = aVar;
                    i36 = i30;
                }
                if (i31 != 0) {
                    kVar3 = androidx.compose.foundation.gestures.snapping.k.b.f10051a;
                } else {
                    kVar3 = kVar;
                }
                if ((8192 & i13) != 0) {
                    i30 = i36 & (-7169);
                    eA = OverscrollKt.a(c1086gP);
                } else {
                    eA = e10;
                    i30 = i36;
                }
                cVar4 = cVar3;
            }
            c1086gP.U();
            Orientation orientation11117 = Orientation.f9958c;
            androidx.compose.ui.f.a aVar19 = androidx.compose.ui.d.a.f13347n;
            int i41111111111113 = i14 >> 6;
            int i41111111111114 = i14 << 12;
            int i41111111111115 = ((i14 >> 3) & 14) | 24576 | ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | ((i14 >> 18) & 7168) | (458752 & i41111111111113) | (3670016 & i41111111111113) | ((i30 << 12) & 29360128) | (234881024 & i41111111111114) | (i41111111111114 & 1879048192);
            int i41111111111116 = i30 << 6;
            c1086g = c1086gP;
            LazyLayoutPagerKt.a(hVar2, pagerState, l13, z16, orientation11117, xVar3, z15, eA, i34, f13, eVar3, aVar3, lVar3, aVar19, cVar4, kVar3, rVar, c1086g, i41111111111115, ((i14 >> 9) & 14) | 3072 | (i30 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i41111111111116 & 896) | (i41111111111113 & 57344) | ((i30 << 9) & 458752) | (3670016 & i41111111111116), 0);
            hVar3 = hVar2;
            l12 = l13;
            eVar2 = eVar3;
            i33 = i34;
            f11 = f13;
            cVar2 = cVar4;
            xVar2 = xVar3;
            z13 = z15;
            z14 = z16;
            lVar2 = lVar3;
            aVar2 = aVar3;
            kVar2 = kVar3;
            e11 = eA;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            eVar2 = eVar;
            i33 = i10;
            f11 = f10;
            cVar2 = cVar;
            z13 = z10;
            z14 = z11;
            lVar2 = lVar;
            aVar2 = aVar;
            e11 = e10;
            l12 = l11;
            hVar3 = hVar2;
            xVar2 = xVar;
            kVar2 = kVar;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PagerKt.a(pagerState, hVar3, l12, eVar2, i33, f11, cVar2, xVar2, z13, z14, lVar2, aVar2, kVar2, e11, rVar, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
