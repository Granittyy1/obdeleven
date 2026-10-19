package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.C;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.foundation.E;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.N;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:104:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0124  */
    /* JADX WARN: Code duplicated, block: B:110:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:113:0x0135  */
    /* JADX WARN: Code duplicated, block: B:115:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0140  */
    /* JADX WARN: Code duplicated, block: B:118:0x0145  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:125:0x015e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0168  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:158:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x0209  */
    /* JADX WARN: Code duplicated, block: B:161:0x020b  */
    /* JADX WARN: Code duplicated, block: B:163:0x020f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0211  */
    /* JADX WARN: Code duplicated, block: B:166:0x0215  */
    /* JADX WARN: Code duplicated, block: B:167:0x021b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0220  */
    /* JADX WARN: Code duplicated, block: B:172:0x022e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x0243  */
    /* JADX WARN: Code duplicated, block: B:180:0x0249  */
    /* JADX WARN: Code duplicated, block: B:181:0x024c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0252  */
    /* JADX WARN: Code duplicated, block: B:186:0x025f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0282  */
    /* JADX WARN: Code duplicated, block: B:191:0x0288  */
    /* JADX WARN: Code duplicated, block: B:197:0x029a  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:216:0x032a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0342  */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:99:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    public static final void a(final w wVar, androidx.compose.ui.h hVar, LazyStaggeredGridState lazyStaggeredGridState, L l10, boolean z10, float f10, C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.foundation.gestures.j jVar, boolean z11, E e10, final Ia.l<? super q, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        LazyStaggeredGridState lazyStaggeredGridState2;
        int i14;
        L l11;
        int i15;
        int i16;
        int i17;
        int i18;
        float f11;
        int i19;
        int i20;
        C0945e.InterfaceC0129e interfaceC0129e2;
        int i21;
        androidx.compose.foundation.gestures.j jVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z12;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final ?? r10;
        final androidx.compose.foundation.gestures.j jVar3;
        final boolean z14;
        final E e11;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final C0945e.InterfaceC0129e interfaceC0129e3;
        final L l12;
        final float f12;
        C1105p0 c1105p0V;
        int i26;
        InterfaceC1084f.a.C0153a c0153a;
        androidx.compose.ui.h hVar3;
        int i27;
        int i28;
        LazyStaggeredGridState lazyStaggeredGridState4;
        L n10;
        ?? r11;
        float f13;
        C0945e.InterfaceC0129e interfaceC0129eG;
        InterfaceC1084f.a.C0153a c0153a2;
        E eA;
        int i29;
        C0945e.InterfaceC0129e interfaceC0129e4;
        boolean zK;
        Object objF;
        boolean zH;
        Object objF2;
        final int i30;
        ?? r12;
        int i31;
        boolean z15;
        Object objF3;
        C1086g c1086gP = interfaceC1084f.p(-578931208);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.K(wVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i32 = i12 & 2;
        if (i32 == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.K(hVar) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i12 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                    int i33 = c1086gP.K(lazyStaggeredGridState2) ? 256 : 128;
                    i13 |= i33;
                } else {
                    lazyStaggeredGridState2 = lazyStaggeredGridState;
                }
                i13 |= i33;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                i13 |= 3072;
                l11 = l10;
            } else {
                l11 = l10;
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(l11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.c(z10)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    i13 |= 1572864;
                    interfaceC0129e2 = interfaceC0129e;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(interfaceC0129e2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i12 & 128) == 0) {
                        jVar2 = jVar;
                        int i34 = c1086gP.K(jVar2) ? 8388608 : 4194304;
                        i13 |= i34;
                    } else {
                        jVar2 = jVar;
                    }
                    i13 |= i34;
                } else {
                    jVar2 = jVar;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
                if ((i10 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
                }
                if ((i12 & 1024) != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(lVar)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                z12 = true;
                if ((i13 & 306783379) == 306783378 || (i24 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    i26 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i26 != 0 || c1086gP.a0()) {
                        if (i32 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            Object[] objArr = new Object[0];
                            W.f fVar = LazyStaggeredGridState.f10788x;
                            zH = c1086gP.h(0) | c1086gP.h(0);
                            objF2 = c1086gP.f();
                            if (!zH || objF2 == c0153a) {
                                i30 = 0;
                                objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final LazyStaggeredGridState invoke() {
                                        return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                    }
                                };
                                c1086gP.E(objF2);
                            } else {
                                i30 = 0;
                            }
                            int i35 = i13;
                            i28 = i30;
                            lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr, fVar, null, (Ia.a) objF2, c1086gP, 0, 4);
                            i27 = i35 & (-897);
                        } else {
                            i27 = i13;
                            i28 = 0;
                            lazyStaggeredGridState4 = lazyStaggeredGridState2;
                        }
                        if (i14 != 0) {
                            float f14 = i28;
                            n10 = new N(f14, f14, f14, f14);
                        } else {
                            n10 = l11;
                        }
                        if (i16 != 0) {
                            r11 = i28;
                        } else {
                            r11 = z10;
                        }
                        if (i18 != 0) {
                            f13 = i28;
                        } else {
                            f13 = f10;
                        }
                        if (i20 != 0) {
                            interfaceC0129eG = C0945e.g(i28);
                        } else {
                            interfaceC0129eG = interfaceC0129e2;
                        }
                        if ((i12 & 128) != 0) {
                            InterfaceC0918s interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                c0153a2 = c0153a;
                            } else {
                                c0153a2 = c0153a;
                                if (objF == c0153a2) {
                                }
                                jVar3 = (androidx.compose.foundation.gestures.e) objF;
                                i27 &= -29360129;
                            }
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i27 &= -29360129;
                        } else {
                            c0153a2 = c0153a;
                            jVar3 = jVar;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if ((i12 & 512) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i27 &= -1879048193;
                        } else {
                            eA = e10;
                        }
                        i29 = i27;
                        interfaceC0129e4 = interfaceC0129eG;
                        f11 = f13;
                        lazyStaggeredGridState2 = lazyStaggeredGridState4;
                        hVar2 = hVar3;
                        r12 = r11;
                    } else {
                        c1086gP.w();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        if ((i12 & 512) != 0) {
                            i13 &= -1879048193;
                        }
                        r12 = z10;
                        z14 = z11;
                        eA = e10;
                        interfaceC0129e4 = interfaceC0129e2;
                        c0153a2 = c0153a;
                        n10 = l11;
                        i29 = i13;
                        hVar2 = hVar;
                        jVar3 = jVar2;
                    }
                    c1086gP.U();
                    Orientation orientation = Orientation.f9957b;
                    float fMo1getSpacingD9Ej5fM = interfaceC0129e4.mo1getSpacingD9Ej5fM();
                    int i36 = i29 >> 3;
                    i31 = (i29 & 14) | ((i29 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i36 & 896);
                    float f15 = f11;
                    E e12 = eA;
                    boolean z16 = ((((i31 & 14) ^ 6) <= 4 && c1086gP.K(wVar)) || (i31 & 6) == 4) | ((((i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(interfaceC0129e4)) || (i31 & 48) == 32);
                    if ((((i31 & 896) ^ 384) > 256 || !c1086gP.K(n10)) && (i31 & 384) != 256) {
                    }
                    z15 = z16 | z12;
                    objF3 = c1086gP.f();
                    if (z15 || objF3 == c0153a2) {
                        objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                        c1086gP.E(objF3);
                    }
                    int i37 = i29 << 3;
                    LazyStaggeredGridKt.a(lazyStaggeredGridState2, orientation, (a) objF3, hVar2, n10, r12, jVar3, z14, e12, f15, fMo1getSpacingD9Ej5fM, lVar, c1086gP, ((i29 >> 6) & 14) | 48 | ((i29 << 6) & 7168) | (57344 & i37) | (i37 & 458752) | (3670016 & i36) | (29360128 & i36) | (i36 & 234881024) | ((i29 << 12) & 1879048192), (i24 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
                    e11 = e12;
                    interfaceC0129e3 = interfaceC0129e4;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    f12 = f15;
                    L l13 = n10;
                    r10 = r12;
                    l12 = l13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    r10 = z10;
                    jVar3 = jVar;
                    z14 = z11;
                    e11 = e10;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    interfaceC0129e3 = interfaceC0129e2;
                    l12 = l11;
                    f12 = f10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyStaggeredGridDslKt.a(wVar, hVar2, lazyStaggeredGridState3, l12, r10, f12, interfaceC0129e3, jVar3, z14, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f10;
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                interfaceC0129e2 = interfaceC0129e;
            } else {
                interfaceC0129e2 = interfaceC0129e;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(interfaceC0129e2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i13 |= i34;
                } else {
                    jVar2 = jVar;
                }
                i13 |= i34;
            } else {
                jVar2 = jVar;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
            }
            if ((i12 & 1024) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            z12 = true;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                i26 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i26 != 0) {
                    if (i32 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        Object[] objArr2 = new Object[0];
                        W.f fVar2 = LazyStaggeredGridState.f10788x;
                        zH = c1086gP.h(0) | c1086gP.h(0);
                        objF2 = c1086gP.f();
                        if (zH) {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        int i38 = i13;
                        i28 = i30;
                        lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr2, fVar2, null, (Ia.a) objF2, c1086gP, 0, 4);
                        i27 = i38 & (-897);
                    } else {
                        i27 = i13;
                        i28 = 0;
                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                    }
                    if (i14 != 0) {
                        float f16 = i28;
                        n10 = new N(f16, f16, f16, f16);
                    } else {
                        n10 = l11;
                    }
                    if (i16 != 0) {
                        r11 = i28;
                    } else {
                        r11 = z10;
                    }
                    if (i18 != 0) {
                        f13 = i28;
                    } else {
                        f13 = f10;
                    }
                    if (i20 != 0) {
                        interfaceC0129eG = C0945e.g(i28);
                    } else {
                        interfaceC0129eG = interfaceC0129e2;
                    }
                    if ((i12 & 128) != 0) {
                        InterfaceC0918s interfaceC0918sA2 = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA2);
                        objF = c1086gP.f();
                        if (zK) {
                            c0153a2 = c0153a;
                            if (objF == c0153a2) {
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i27 &= -29360129;
                        } else {
                            c0153a2 = c0153a;
                        }
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA2);
                        c1086gP.E(objF);
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if ((i12 & 512) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i27 &= -1879048193;
                    } else {
                        eA = e10;
                    }
                    i29 = i27;
                    interfaceC0129e4 = interfaceC0129eG;
                    f11 = f13;
                    lazyStaggeredGridState2 = lazyStaggeredGridState4;
                    hVar2 = hVar3;
                    r12 = r11;
                } else {
                    if (i32 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        Object[] objArr3 = new Object[0];
                        W.f fVar3 = LazyStaggeredGridState.f10788x;
                        zH = c1086gP.h(0) | c1086gP.h(0);
                        objF2 = c1086gP.f();
                        if (zH) {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        int i39 = i13;
                        i28 = i30;
                        lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr3, fVar3, null, (Ia.a) objF2, c1086gP, 0, 4);
                        i27 = i39 & (-897);
                    } else {
                        i27 = i13;
                        i28 = 0;
                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                    }
                    if (i14 != 0) {
                        float f17 = i28;
                        n10 = new N(f17, f17, f17, f17);
                    } else {
                        n10 = l11;
                    }
                    if (i16 != 0) {
                        r11 = i28;
                    } else {
                        r11 = z10;
                    }
                    if (i18 != 0) {
                        f13 = i28;
                    } else {
                        f13 = f10;
                    }
                    if (i20 != 0) {
                        interfaceC0129eG = C0945e.g(i28);
                    } else {
                        interfaceC0129eG = interfaceC0129e2;
                    }
                    if ((i12 & 128) != 0) {
                        InterfaceC0918s interfaceC0918sA3 = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA3);
                        objF = c1086gP.f();
                        if (zK) {
                            c0153a2 = c0153a;
                            if (objF == c0153a2) {
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i27 &= -29360129;
                        } else {
                            c0153a2 = c0153a;
                        }
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA3);
                        c1086gP.E(objF);
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if ((i12 & 512) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i27 &= -1879048193;
                    } else {
                        eA = e10;
                    }
                    i29 = i27;
                    interfaceC0129e4 = interfaceC0129eG;
                    f11 = f13;
                    lazyStaggeredGridState2 = lazyStaggeredGridState4;
                    hVar2 = hVar3;
                    r12 = r11;
                }
                c1086gP.U();
                Orientation orientation2 = Orientation.f9957b;
                float fMo1getSpacingD9Ej5fM2 = interfaceC0129e4.mo1getSpacingD9Ej5fM();
                int i310 = i29 >> 3;
                i31 = (i29 & 14) | ((i29 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i310 & 896);
                float f18 = f11;
                E e13 = eA;
                boolean z17 = ((((i31 & 14) ^ 6) <= 4 && c1086gP.K(wVar)) || (i31 & 6) == 4) | ((((i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(interfaceC0129e4)) || (i31 & 48) == 32);
                z12 = ((i31 & 896) ^ 384) > 256 ? false : false;
                z15 = z17 | z12;
                objF3 = c1086gP.f();
                if (z15) {
                    objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                    c1086gP.E(objF3);
                } else {
                    objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                    c1086gP.E(objF3);
                }
                int i311 = i29 << 3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, orientation2, (a) objF3, hVar2, n10, r12, jVar3, z14, e13, f18, fMo1getSpacingD9Ej5fM2, lVar, c1086gP, ((i29 >> 6) & 14) | 48 | ((i29 << 6) & 7168) | (57344 & i311) | (i311 & 458752) | (3670016 & i310) | (29360128 & i310) | (i310 & 234881024) | ((i29 << 12) & 1879048192), (i24 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
                e11 = e13;
                interfaceC0129e3 = interfaceC0129e4;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                f12 = f18;
                L l14 = n10;
                r10 = r12;
                l12 = l14;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                r10 = z10;
                jVar3 = jVar;
                z14 = z11;
                e11 = e10;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                interfaceC0129e3 = interfaceC0129e2;
                l12 = l11;
                f12 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyStaggeredGridDslKt.a(wVar, hVar2, lazyStaggeredGridState3, l12, r10, f12, interfaceC0129e3, jVar3, z14, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        if ((i10 & 384) == 0) {
            if ((i12 & 4) == 0) {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
                if (c1086gP.K(lazyStaggeredGridState2)) {
                }
                i13 |= i33;
            } else {
                lazyStaggeredGridState2 = lazyStaggeredGridState;
            }
            i13 |= i33;
        } else {
            lazyStaggeredGridState2 = lazyStaggeredGridState;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
            l11 = l10;
        } else {
            l11 = l10;
            if ((i10 & 3072) == 0) {
                if (c1086gP.K(l11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
        }
        i16 = i12 & 16;
        if (i16 != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.c(z10)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i13 |= i17;
        }
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((196608 & i10) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                i13 |= 1572864;
                interfaceC0129e2 = interfaceC0129e;
            } else {
                interfaceC0129e2 = interfaceC0129e;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(interfaceC0129e2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i12 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i13 |= i34;
                } else {
                    jVar2 = jVar;
                }
                i13 |= i34;
            } else {
                jVar2 = jVar;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
            }
            if ((i12 & 1024) != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            z12 = true;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                i26 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i26 != 0) {
                    if (i32 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        Object[] objArr4 = new Object[0];
                        W.f fVar4 = LazyStaggeredGridState.f10788x;
                        zH = c1086gP.h(0) | c1086gP.h(0);
                        objF2 = c1086gP.f();
                        if (zH) {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        int i312 = i13;
                        i28 = i30;
                        lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr4, fVar4, null, (Ia.a) objF2, c1086gP, 0, 4);
                        i27 = i312 & (-897);
                    } else {
                        i27 = i13;
                        i28 = 0;
                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                    }
                    if (i14 != 0) {
                        float f19 = i28;
                        n10 = new N(f19, f19, f19, f19);
                    } else {
                        n10 = l11;
                    }
                    if (i16 != 0) {
                        r11 = i28;
                    } else {
                        r11 = z10;
                    }
                    if (i18 != 0) {
                        f13 = i28;
                    } else {
                        f13 = f10;
                    }
                    if (i20 != 0) {
                        interfaceC0129eG = C0945e.g(i28);
                    } else {
                        interfaceC0129eG = interfaceC0129e2;
                    }
                    if ((i12 & 128) != 0) {
                        InterfaceC0918s interfaceC0918sA4 = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA4);
                        objF = c1086gP.f();
                        if (zK) {
                            c0153a2 = c0153a;
                            if (objF == c0153a2) {
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i27 &= -29360129;
                        } else {
                            c0153a2 = c0153a;
                        }
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA4);
                        c1086gP.E(objF);
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if ((i12 & 512) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i27 &= -1879048193;
                    } else {
                        eA = e10;
                    }
                    i29 = i27;
                    interfaceC0129e4 = interfaceC0129eG;
                    f11 = f13;
                    lazyStaggeredGridState2 = lazyStaggeredGridState4;
                    hVar2 = hVar3;
                    r12 = r11;
                } else {
                    if (i32 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        Object[] objArr5 = new Object[0];
                        W.f fVar5 = LazyStaggeredGridState.f10788x;
                        zH = c1086gP.h(0) | c1086gP.h(0);
                        objF2 = c1086gP.f();
                        if (zH) {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        } else {
                            i30 = 0;
                            objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final LazyStaggeredGridState invoke() {
                                    return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        int i313 = i13;
                        i28 = i30;
                        lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr5, fVar5, null, (Ia.a) objF2, c1086gP, 0, 4);
                        i27 = i313 & (-897);
                    } else {
                        i27 = i13;
                        i28 = 0;
                        lazyStaggeredGridState4 = lazyStaggeredGridState2;
                    }
                    if (i14 != 0) {
                        float f110 = i28;
                        n10 = new N(f110, f110, f110, f110);
                    } else {
                        n10 = l11;
                    }
                    if (i16 != 0) {
                        r11 = i28;
                    } else {
                        r11 = z10;
                    }
                    if (i18 != 0) {
                        f13 = i28;
                    } else {
                        f13 = f10;
                    }
                    if (i20 != 0) {
                        interfaceC0129eG = C0945e.g(i28);
                    } else {
                        interfaceC0129eG = interfaceC0129e2;
                    }
                    if ((i12 & 128) != 0) {
                        InterfaceC0918s interfaceC0918sA5 = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA5);
                        objF = c1086gP.f();
                        if (zK) {
                            c0153a2 = c0153a;
                            if (objF == c0153a2) {
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i27 &= -29360129;
                        } else {
                            c0153a2 = c0153a;
                        }
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA5);
                        c1086gP.E(objF);
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                        jVar3 = jVar;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if ((i12 & 512) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i27 &= -1879048193;
                    } else {
                        eA = e10;
                    }
                    i29 = i27;
                    interfaceC0129e4 = interfaceC0129eG;
                    f11 = f13;
                    lazyStaggeredGridState2 = lazyStaggeredGridState4;
                    hVar2 = hVar3;
                    r12 = r11;
                }
                c1086gP.U();
                Orientation orientation3 = Orientation.f9957b;
                float fMo1getSpacingD9Ej5fM3 = interfaceC0129e4.mo1getSpacingD9Ej5fM();
                int i314 = i29 >> 3;
                i31 = (i29 & 14) | ((i29 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i314 & 896);
                float f111 = f11;
                E e14 = eA;
                boolean z18 = ((((i31 & 14) ^ 6) <= 4 && c1086gP.K(wVar)) || (i31 & 6) == 4) | ((((i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(interfaceC0129e4)) || (i31 & 48) == 32);
                if (((i31 & 896) ^ 384) > 256) {
                }
                z15 = z18 | z12;
                objF3 = c1086gP.f();
                if (z15) {
                    objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                    c1086gP.E(objF3);
                } else {
                    objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                    c1086gP.E(objF3);
                }
                int i315 = i29 << 3;
                LazyStaggeredGridKt.a(lazyStaggeredGridState2, orientation3, (a) objF3, hVar2, n10, r12, jVar3, z14, e14, f111, fMo1getSpacingD9Ej5fM3, lVar, c1086gP, ((i29 >> 6) & 14) | 48 | ((i29 << 6) & 7168) | (57344 & i315) | (i315 & 458752) | (3670016 & i314) | (29360128 & i314) | (i314 & 234881024) | ((i29 << 12) & 1879048192), (i24 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
                e11 = e14;
                interfaceC0129e3 = interfaceC0129e4;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                f12 = f111;
                L l15 = n10;
                r10 = r12;
                l12 = l15;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                r10 = z10;
                jVar3 = jVar;
                z14 = z11;
                e11 = e10;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                interfaceC0129e3 = interfaceC0129e2;
                l12 = l11;
                f12 = f10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyStaggeredGridDslKt.a(wVar, hVar2, lazyStaggeredGridState3, l12, r10, f12, interfaceC0129e3, jVar3, z14, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 196608;
        f11 = f10;
        i20 = i12 & 64;
        if (i20 != 0) {
            i13 |= 1572864;
            interfaceC0129e2 = interfaceC0129e;
        } else {
            interfaceC0129e2 = interfaceC0129e;
            if ((i10 & 1572864) == 0) {
                if (c1086gP.K(interfaceC0129e2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
        }
        if ((i10 & 12582912) == 0) {
            if ((i12 & 128) == 0) {
                jVar2 = jVar;
                if (c1086gP.K(jVar2)) {
                }
                i13 |= i34;
            } else {
                jVar2 = jVar;
            }
            i13 |= i34;
        } else {
            jVar2 = jVar;
        }
        i22 = i12 & 256;
        if (i22 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.c(z11)) {
                i23 = 67108864;
            } else {
                i23 = 33554432;
            }
            i13 |= i23;
        }
        if ((i10 & 805306368) != 0) {
            i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
        }
        if ((i12 & 1024) != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.k(lVar)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        z12 = true;
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c1086gP.C(i13 & 1, z13)) {
            c1086gP.r0();
            i26 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i26 != 0) {
                if (i32 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    Object[] objArr6 = new Object[0];
                    W.f fVar6 = LazyStaggeredGridState.f10788x;
                    zH = c1086gP.h(0) | c1086gP.h(0);
                    objF2 = c1086gP.f();
                    if (zH) {
                        i30 = 0;
                        objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyStaggeredGridState invoke() {
                                return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        i30 = 0;
                        objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyStaggeredGridState invoke() {
                                return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    int i316 = i13;
                    i28 = i30;
                    lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr6, fVar6, null, (Ia.a) objF2, c1086gP, 0, 4);
                    i27 = i316 & (-897);
                } else {
                    i27 = i13;
                    i28 = 0;
                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                }
                if (i14 != 0) {
                    float f112 = i28;
                    n10 = new N(f112, f112, f112, f112);
                } else {
                    n10 = l11;
                }
                if (i16 != 0) {
                    r11 = i28;
                } else {
                    r11 = z10;
                }
                if (i18 != 0) {
                    f13 = i28;
                } else {
                    f13 = f10;
                }
                if (i20 != 0) {
                    interfaceC0129eG = C0945e.g(i28);
                } else {
                    interfaceC0129eG = interfaceC0129e2;
                }
                if ((i12 & 128) != 0) {
                    InterfaceC0918s interfaceC0918sA6 = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA6);
                    objF = c1086gP.f();
                    if (zK) {
                        c0153a2 = c0153a;
                        if (objF == c0153a2) {
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                    }
                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA6);
                    c1086gP.E(objF);
                    jVar3 = (androidx.compose.foundation.gestures.e) objF;
                    i27 &= -29360129;
                } else {
                    c0153a2 = c0153a;
                    jVar3 = jVar;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if ((i12 & 512) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i27 &= -1879048193;
                } else {
                    eA = e10;
                }
                i29 = i27;
                interfaceC0129e4 = interfaceC0129eG;
                f11 = f13;
                lazyStaggeredGridState2 = lazyStaggeredGridState4;
                hVar2 = hVar3;
                r12 = r11;
            } else {
                if (i32 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    Object[] objArr7 = new Object[0];
                    W.f fVar7 = LazyStaggeredGridState.f10788x;
                    zH = c1086gP.h(0) | c1086gP.h(0);
                    objF2 = c1086gP.f();
                    if (zH) {
                        i30 = 0;
                        objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyStaggeredGridState invoke() {
                                return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        i30 = 0;
                        objF2 = new Ia.a<LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final LazyStaggeredGridState invoke() {
                                return new LazyStaggeredGridState(new int[]{i30}, new int[]{i30});
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    int i317 = i13;
                    i28 = i30;
                    lazyStaggeredGridState4 = (LazyStaggeredGridState) androidx.compose.runtime.saveable.b.c(objArr7, fVar7, null, (Ia.a) objF2, c1086gP, 0, 4);
                    i27 = i317 & (-897);
                } else {
                    i27 = i13;
                    i28 = 0;
                    lazyStaggeredGridState4 = lazyStaggeredGridState2;
                }
                if (i14 != 0) {
                    float f113 = i28;
                    n10 = new N(f113, f113, f113, f113);
                } else {
                    n10 = l11;
                }
                if (i16 != 0) {
                    r11 = i28;
                } else {
                    r11 = z10;
                }
                if (i18 != 0) {
                    f13 = i28;
                } else {
                    f13 = f10;
                }
                if (i20 != 0) {
                    interfaceC0129eG = C0945e.g(i28);
                } else {
                    interfaceC0129eG = interfaceC0129e2;
                }
                if ((i12 & 128) != 0) {
                    InterfaceC0918s interfaceC0918sA7 = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA7);
                    objF = c1086gP.f();
                    if (zK) {
                        c0153a2 = c0153a;
                        if (objF == c0153a2) {
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i27 &= -29360129;
                    } else {
                        c0153a2 = c0153a;
                    }
                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA7);
                    c1086gP.E(objF);
                    jVar3 = (androidx.compose.foundation.gestures.e) objF;
                    i27 &= -29360129;
                } else {
                    c0153a2 = c0153a;
                    jVar3 = jVar;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if ((i12 & 512) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i27 &= -1879048193;
                } else {
                    eA = e10;
                }
                i29 = i27;
                interfaceC0129e4 = interfaceC0129eG;
                f11 = f13;
                lazyStaggeredGridState2 = lazyStaggeredGridState4;
                hVar2 = hVar3;
                r12 = r11;
            }
            c1086gP.U();
            Orientation orientation4 = Orientation.f9957b;
            float fMo1getSpacingD9Ej5fM4 = interfaceC0129e4.mo1getSpacingD9Ej5fM();
            int i318 = i29 >> 3;
            i31 = (i29 & 14) | ((i29 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i318 & 896);
            float f114 = f11;
            E e15 = eA;
            boolean z19 = ((((i31 & 14) ^ 6) <= 4 && c1086gP.K(wVar)) || (i31 & 6) == 4) | ((((i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(interfaceC0129e4)) || (i31 & 48) == 32);
            if (((i31 & 896) ^ 384) > 256) {
            }
            z15 = z19 | z12;
            objF3 = c1086gP.f();
            if (z15) {
                objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                c1086gP.E(objF3);
            } else {
                objF3 = new t(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(n10, wVar, interfaceC0129e4));
                c1086gP.E(objF3);
            }
            int i319 = i29 << 3;
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, orientation4, (a) objF3, hVar2, n10, r12, jVar3, z14, e15, f114, fMo1getSpacingD9Ej5fM4, lVar, c1086gP, ((i29 >> 6) & 14) | 48 | ((i29 << 6) & 7168) | (57344 & i319) | (i319 & 458752) | (3670016 & i318) | (29360128 & i318) | (i318 & 234881024) | ((i29 << 12) & 1879048192), (i24 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
            e11 = e15;
            interfaceC0129e3 = interfaceC0129e4;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            f12 = f114;
            L l16 = n10;
            r10 = r12;
            l12 = l16;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            r10 = z10;
            jVar3 = jVar;
            z14 = z11;
            e11 = e10;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            interfaceC0129e3 = interfaceC0129e2;
            l12 = l11;
            f12 = f10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyStaggeredGridDslKt.a(wVar, hVar2, lazyStaggeredGridState3, l12, r10, f12, interfaceC0129e3, jVar3, z14, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
