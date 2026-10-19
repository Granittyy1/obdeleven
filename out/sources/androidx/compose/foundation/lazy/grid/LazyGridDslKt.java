package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.C;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.foundation.E;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.N;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Code duplicated, block: B:102:0x010f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0114  */
    /* JADX WARN: Code duplicated, block: B:106:0x0118  */
    /* JADX WARN: Code duplicated, block: B:108:0x0120  */
    /* JADX WARN: Code duplicated, block: B:109:0x0123  */
    /* JADX WARN: Code duplicated, block: B:113:0x0134  */
    /* JADX WARN: Code duplicated, block: B:114:0x0137  */
    /* JADX WARN: Code duplicated, block: B:117:0x0140  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x017a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0180  */
    /* JADX WARN: Code duplicated, block: B:138:0x0188  */
    /* JADX WARN: Code duplicated, block: B:140:0x018c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x0197  */
    /* JADX WARN: Code duplicated, block: B:146:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x019e  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:156:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:164:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:165:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0209  */
    /* JADX WARN: Code duplicated, block: B:170:0x021e  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0102  */
    /* JADX WARN: Code duplicated, block: B:98:0x0105  */
    @p293xa.d
    public static final void a(final b bVar, androidx.compose.ui.h hVar, LazyGridState lazyGridState, L l10, boolean z10, C0945e.l lVar, C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.foundation.gestures.j jVar, boolean z11, final Ia.l lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        C0945e.l lVar3;
        int i17;
        C0945e.InterfaceC0129e interfaceC0129e2;
        int i18;
        androidx.compose.foundation.gestures.j jVar2;
        int i19;
        int i20;
        int i21;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final LazyGridState lazyGridState2;
        final L l11;
        final boolean z14;
        final C0945e.l lVar4;
        final C0945e.InterfaceC0129e interfaceC0129e3;
        final androidx.compose.foundation.gestures.j jVar3;
        final boolean z15;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        LazyGridState lazyGridStateA;
        L n10;
        C0945e.InterfaceC0129e interfaceC0129e4;
        androidx.compose.foundation.gestures.j jVar4;
        boolean z16;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1485410512);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            if ((i10 & 384) != 0) {
                i12 |= ((i11 & 4) == 0 || !c1086gP.K(lazyGridState)) ? 128 : 256;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(l10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        z12 = z10;
                        if (c1086gP.c(z12)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            lVar3 = lVar;
                            int i23 = c1086gP.K(lVar3) ? 131072 : 65536;
                            i12 |= i23;
                        } else {
                            lVar3 = lVar;
                        }
                        i12 |= i23;
                    } else {
                        lVar3 = lVar;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i10) == 0) {
                            interfaceC0129e2 = interfaceC0129e;
                            if (c1086gP.K(interfaceC0129e2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        if ((12582912 & i10) == 0) {
                            if ((i11 & 128) == 0) {
                                jVar2 = jVar;
                                int i24 = c1086gP.K(jVar2) ? 8388608 : 4194304;
                                i12 |= i24;
                            } else {
                                jVar2 = jVar;
                            }
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.c(z11)) {
                                i20 = 67108864;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            if ((i10 & 805306368) == 0) {
                                if (c1086gP.k(lVar2)) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i12 |= i21;
                            }
                            if ((i12 & 306783379) != 306783378) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c1086gP.C(i12 & 1, z13)) {
                                c1086gP.r0();
                                if ((i10 & 1) != 0 || c1086gP.a0()) {
                                    if (i22 != 0) {
                                        hVar3 = androidx.compose.ui.h.a.f13984b;
                                    } else {
                                        hVar3 = hVar;
                                    }
                                    if ((i11 & 4) != 0) {
                                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                        i12 &= -897;
                                    } else {
                                        lazyGridStateA = lazyGridState;
                                    }
                                    if (i13 != 0) {
                                        float f10 = 0;
                                        n10 = new N(f10, f10, f10, f10);
                                    } else {
                                        n10 = l10;
                                    }
                                    if (i15 != 0) {
                                        z12 = false;
                                    }
                                    if ((i11 & 32) != 0) {
                                        if (z12) {
                                            lVar4 = C0945e.f10287d;
                                        } else {
                                            lVar4 = C0945e.f10286c;
                                        }
                                        i12 &= -458753;
                                    } else {
                                        lVar4 = lVar3;
                                    }
                                    if (i17 != 0) {
                                        interfaceC0129e4 = C0945e.f10284a;
                                    } else {
                                        interfaceC0129e4 = interfaceC0129e2;
                                    }
                                    if ((i11 & 128) != 0) {
                                        interfaceC0918sA = C.a(c1086gP);
                                        zK = c1086gP.K(interfaceC0918sA);
                                        objF = c1086gP.f();
                                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                            c1086gP.E(objF);
                                        }
                                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                        i12 &= -29360129;
                                    } else {
                                        jVar4 = jVar2;
                                    }
                                    if (i19 != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = z11;
                                    }
                                } else {
                                    c1086gP.w();
                                    if ((i11 & 4) != 0) {
                                        i12 &= -897;
                                    }
                                    if ((i11 & 32) != 0) {
                                        i12 &= -458753;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    hVar3 = hVar;
                                    lazyGridStateA = lazyGridState;
                                    n10 = l10;
                                    z16 = z11;
                                    lVar4 = lVar3;
                                    interfaceC0129e4 = interfaceC0129e2;
                                    jVar4 = jVar2;
                                }
                                c1086gP.U();
                                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                                hVar2 = hVar3;
                                lazyGridState2 = lazyGridStateA;
                                l11 = n10;
                                interfaceC0129e3 = interfaceC0129e4;
                                z14 = z12;
                                jVar3 = jVar4;
                                z15 = z16;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                lazyGridState2 = lazyGridState;
                                l11 = l10;
                                z14 = z12;
                                lVar4 = lVar3;
                                interfaceC0129e3 = interfaceC0129e2;
                                jVar3 = jVar2;
                                z15 = z11;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i12 |= 805306368;
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f11 = 0;
                                    n10 = new N(f11, f11, f11, f11);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            } else {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f12 = 0;
                                    n10 = new N(f12, f12, f12, f12);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            }
                            c1086gP.U();
                            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                            hVar2 = hVar3;
                            lazyGridState2 = lazyGridStateA;
                            l11 = n10;
                            interfaceC0129e3 = interfaceC0129e4;
                            z14 = z12;
                            jVar3 = jVar4;
                            z15 = z16;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyGridState2 = lazyGridState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            interfaceC0129e3 = interfaceC0129e2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 1572864;
                    interfaceC0129e2 = interfaceC0129e;
                    if ((12582912 & i10) == 0) {
                        if ((i11 & 128) == 0) {
                            jVar2 = jVar;
                            if (c1086gP.K(jVar2)) {
                            }
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.c(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar2)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f13 = 0;
                                    n10 = new N(f13, f13, f13, f13);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            } else {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f14 = 0;
                                    n10 = new N(f14, f14, f14, f14);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            }
                            c1086gP.U();
                            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                            hVar2 = hVar3;
                            lazyGridState2 = lazyGridStateA;
                            l11 = n10;
                            interfaceC0129e3 = interfaceC0129e4;
                            z14 = z12;
                            jVar3 = jVar4;
                            z15 = z16;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyGridState2 = lazyGridState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            interfaceC0129e3 = interfaceC0129e2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f15 = 0;
                                n10 = new N(f15, f15, f15, f15);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f16 = 0;
                                n10 = new N(f16, f16, f16, f16);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                z12 = z10;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar3 = lVar;
                        if (c1086gP.K(lVar3)) {
                        }
                        i12 |= i23;
                    } else {
                        lVar3 = lVar;
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        interfaceC0129e2 = interfaceC0129e;
                        if (c1086gP.K(interfaceC0129e2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((12582912 & i10) == 0) {
                        if ((i11 & 128) == 0) {
                            jVar2 = jVar;
                            if (c1086gP.K(jVar2)) {
                            }
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.c(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar2)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f17 = 0;
                                    n10 = new N(f17, f17, f17, f17);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            } else {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f18 = 0;
                                    n10 = new N(f18, f18, f18, f18);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            }
                            c1086gP.U();
                            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                            hVar2 = hVar3;
                            lazyGridState2 = lazyGridStateA;
                            l11 = n10;
                            interfaceC0129e3 = interfaceC0129e4;
                            z14 = z12;
                            jVar3 = jVar4;
                            z15 = z16;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyGridState2 = lazyGridState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            interfaceC0129e3 = interfaceC0129e2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f19 = 0;
                                n10 = new N(f19, f19, f19, f19);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f110 = 0;
                                n10 = new N(f110, f110, f110, f110);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                interfaceC0129e2 = interfaceC0129e;
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f111 = 0;
                                n10 = new N(f111, f111, f111, f111);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f112 = 0;
                                n10 = new N(f112, f112, f112, f112);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f113 = 0;
                            n10 = new N(f113, f113, f113, f113);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f114 = 0;
                            n10 = new N(f114, f114, f114, f114);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar3 = lVar;
                        if (c1086gP.K(lVar3)) {
                        }
                        i12 |= i23;
                    } else {
                        lVar3 = lVar;
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        interfaceC0129e2 = interfaceC0129e;
                        if (c1086gP.K(interfaceC0129e2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((12582912 & i10) == 0) {
                        if ((i11 & 128) == 0) {
                            jVar2 = jVar;
                            if (c1086gP.K(jVar2)) {
                            }
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.c(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar2)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f115 = 0;
                                    n10 = new N(f115, f115, f115, f115);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            } else {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f116 = 0;
                                    n10 = new N(f116, f116, f116, f116);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            }
                            c1086gP.U();
                            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                            hVar2 = hVar3;
                            lazyGridState2 = lazyGridStateA;
                            l11 = n10;
                            interfaceC0129e3 = interfaceC0129e4;
                            z14 = z12;
                            jVar3 = jVar4;
                            z15 = z16;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyGridState2 = lazyGridState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            interfaceC0129e3 = interfaceC0129e2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f117 = 0;
                                n10 = new N(f117, f117, f117, f117);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f118 = 0;
                                n10 = new N(f118, f118, f118, f118);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                interfaceC0129e2 = interfaceC0129e;
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f119 = 0;
                                n10 = new N(f119, f119, f119, f119);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f1110 = 0;
                                n10 = new N(f1110, f1110, f1110, f1110);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111 = 0;
                            n10 = new N(f1111, f1111, f1111, f1111);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1112 = 0;
                            n10 = new N(f1112, f1112, f1112, f1112);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            z12 = z10;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar3 = lVar;
                    if (c1086gP.K(lVar3)) {
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i12 |= i23;
            } else {
                lVar3 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f1113 = 0;
                                n10 = new N(f1113, f1113, f1113, f1113);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f1114 = 0;
                                n10 = new N(f1114, f1114, f1114, f1114);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1115 = 0;
                            n10 = new N(f1115, f1115, f1115, f1115);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1116 = 0;
                            n10 = new N(f1116, f1116, f1116, f1116);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            interfaceC0129e2 = interfaceC0129e;
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i24;
            } else {
                jVar2 = jVar;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1117 = 0;
                            n10 = new N(f1117, f1117, f1117, f1117);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1118 = 0;
                            n10 = new N(f1118, f1118, f1118, f1118);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1119 = 0;
                        n10 = new N(f1119, f1119, f1119, f1119);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f11110 = 0;
                        n10 = new N(f11110, f11110, f11110, f11110);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                hVar2 = hVar3;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                interfaceC0129e3 = interfaceC0129e4;
                z14 = z12;
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyGridState2 = lazyGridState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                interfaceC0129e3 = interfaceC0129e2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        if ((i10 & 384) != 0) {
            i12 |= ((i11 & 4) == 0 || !c1086gP.K(lazyGridState)) ? 128 : 256;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                if (c1086gP.K(l10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        lVar3 = lVar;
                        if (c1086gP.K(lVar3)) {
                        }
                        i12 |= i23;
                    } else {
                        lVar3 = lVar;
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        interfaceC0129e2 = interfaceC0129e;
                        if (c1086gP.K(interfaceC0129e2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((12582912 & i10) == 0) {
                        if ((i11 & 128) == 0) {
                            jVar2 = jVar;
                            if (c1086gP.K(jVar2)) {
                            }
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.c(z11)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar2)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f11111 = 0;
                                    n10 = new N(f11111, f11111, f11111, f11111);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            } else {
                                if (i22 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i11 & 4) != 0) {
                                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                    i12 &= -897;
                                } else {
                                    lazyGridStateA = lazyGridState;
                                }
                                if (i13 != 0) {
                                    float f11112 = 0;
                                    n10 = new N(f11112, f11112, f11112, f11112);
                                } else {
                                    n10 = l10;
                                }
                                if (i15 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 32) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10286c;
                                    } else {
                                        lVar4 = C0945e.f10287d;
                                    }
                                    i12 &= -458753;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i17 != 0) {
                                    interfaceC0129e4 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e4 = interfaceC0129e2;
                                }
                                if ((i11 & 128) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    } else {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -29360129;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                            }
                            c1086gP.U();
                            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                            hVar2 = hVar3;
                            lazyGridState2 = lazyGridStateA;
                            l11 = n10;
                            interfaceC0129e3 = interfaceC0129e4;
                            z14 = z12;
                            jVar3 = jVar4;
                            z15 = z16;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyGridState2 = lazyGridState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            interfaceC0129e3 = interfaceC0129e2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f11113 = 0;
                                n10 = new N(f11113, f11113, f11113, f11113);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f11114 = 0;
                                n10 = new N(f11114, f11114, f11114, f11114);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                interfaceC0129e2 = interfaceC0129e;
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f11115 = 0;
                                n10 = new N(f11115, f11115, f11115, f11115);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f11116 = 0;
                                n10 = new N(f11116, f11116, f11116, f11116);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f11117 = 0;
                            n10 = new N(f11117, f11117, f11117, f11117);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f11118 = 0;
                            n10 = new N(f11118, f11118, f11118, f11118);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            z12 = z10;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar3 = lVar;
                    if (c1086gP.K(lVar3)) {
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i12 |= i23;
            } else {
                lVar3 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f11119 = 0;
                                n10 = new N(f11119, f11119, f11119, f11119);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f111110 = 0;
                                n10 = new N(f111110, f111110, f111110, f111110);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f111111 = 0;
                            n10 = new N(f111111, f111111, f111111, f111111);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f111112 = 0;
                            n10 = new N(f111112, f111112, f111112, f111112);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            interfaceC0129e2 = interfaceC0129e;
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i24;
            } else {
                jVar2 = jVar;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f111113 = 0;
                            n10 = new N(f111113, f111113, f111113, f111113);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f111114 = 0;
                            n10 = new N(f111114, f111114, f111114, f111114);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f111115 = 0;
                        n10 = new N(f111115, f111115, f111115, f111115);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f111116 = 0;
                        n10 = new N(f111116, f111116, f111116, f111116);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                hVar2 = hVar3;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                interfaceC0129e3 = interfaceC0129e4;
                z14 = z12;
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyGridState2 = lazyGridState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                interfaceC0129e3 = interfaceC0129e2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    lVar3 = lVar;
                    if (c1086gP.K(lVar3)) {
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i12 |= i23;
            } else {
                lVar3 = lVar;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((12582912 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        jVar2 = jVar;
                        if (c1086gP.K(jVar2)) {
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f111117 = 0;
                                n10 = new N(f111117, f111117, f111117, f111117);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i22 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i11 & 4) != 0) {
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i12 &= -897;
                            } else {
                                lazyGridStateA = lazyGridState;
                            }
                            if (i13 != 0) {
                                float f111118 = 0;
                                n10 = new N(f111118, f111118, f111118, f111118);
                            } else {
                                n10 = l10;
                            }
                            if (i15 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 32) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -458753;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i17 != 0) {
                                interfaceC0129e4 = C0945e.f10284a;
                            } else {
                                interfaceC0129e4 = interfaceC0129e2;
                            }
                            if ((i11 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                } else {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                i12 &= -29360129;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                        hVar2 = hVar3;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        interfaceC0129e3 = interfaceC0129e4;
                        z14 = z12;
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyGridState2 = lazyGridState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        interfaceC0129e3 = interfaceC0129e2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f111119 = 0;
                            n10 = new N(f111119, f111119, f111119, f111119);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111110 = 0;
                            n10 = new N(f1111110, f1111110, f1111110, f1111110);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            interfaceC0129e2 = interfaceC0129e;
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i24;
            } else {
                jVar2 = jVar;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111111 = 0;
                            n10 = new N(f1111111, f1111111, f1111111, f1111111);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111112 = 0;
                            n10 = new N(f1111112, f1111112, f1111112, f1111112);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1111113 = 0;
                        n10 = new N(f1111113, f1111113, f1111113, f1111113);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1111114 = 0;
                        n10 = new N(f1111114, f1111114, f1111114, f1111114);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                hVar2 = hVar3;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                interfaceC0129e3 = interfaceC0129e4;
                z14 = z12;
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyGridState2 = lazyGridState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                interfaceC0129e3 = interfaceC0129e2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        z12 = z10;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                lVar3 = lVar;
                if (c1086gP.K(lVar3)) {
                }
                i12 |= i23;
            } else {
                lVar3 = lVar;
            }
            i12 |= i23;
        } else {
            lVar3 = lVar;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((1572864 & i10) == 0) {
                interfaceC0129e2 = interfaceC0129e;
                if (c1086gP.K(interfaceC0129e2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    jVar2 = jVar;
                    if (c1086gP.K(jVar2)) {
                    }
                    i12 |= i24;
                } else {
                    jVar2 = jVar;
                }
                i12 |= i24;
            } else {
                jVar2 = jVar;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111115 = 0;
                            n10 = new N(f1111115, f1111115, f1111115, f1111115);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i11 & 4) != 0) {
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i12 &= -897;
                        } else {
                            lazyGridStateA = lazyGridState;
                        }
                        if (i13 != 0) {
                            float f1111116 = 0;
                            n10 = new N(f1111116, f1111116, f1111116, f1111116);
                        } else {
                            n10 = l10;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 32) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -458753;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i17 != 0) {
                            interfaceC0129e4 = C0945e.f10284a;
                        } else {
                            interfaceC0129e4 = interfaceC0129e2;
                        }
                        if ((i11 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            } else {
                                objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(objF);
                            }
                            jVar4 = (androidx.compose.foundation.gestures.e) objF;
                            i12 &= -29360129;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                    hVar2 = hVar3;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    interfaceC0129e3 = interfaceC0129e4;
                    z14 = z12;
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyGridState2 = lazyGridState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    interfaceC0129e3 = interfaceC0129e2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1111117 = 0;
                        n10 = new N(f1111117, f1111117, f1111117, f1111117);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1111118 = 0;
                        n10 = new N(f1111118, f1111118, f1111118, f1111118);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                hVar2 = hVar3;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                interfaceC0129e3 = interfaceC0129e4;
                z14 = z12;
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyGridState2 = lazyGridState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                interfaceC0129e3 = interfaceC0129e2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 1572864;
        interfaceC0129e2 = interfaceC0129e;
        if ((12582912 & i10) == 0) {
            if ((i11 & 128) == 0) {
                jVar2 = jVar;
                if (c1086gP.K(jVar2)) {
                }
                i12 |= i24;
            } else {
                jVar2 = jVar;
            }
            i12 |= i24;
        } else {
            jVar2 = jVar;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.c(z11)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(lVar2)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f1111119 = 0;
                        n10 = new N(f1111119, f1111119, f1111119, f1111119);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i11 & 4) != 0) {
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i12 &= -897;
                    } else {
                        lazyGridStateA = lazyGridState;
                    }
                    if (i13 != 0) {
                        float f11111110 = 0;
                        n10 = new N(f11111110, f11111110, f11111110, f11111110);
                    } else {
                        n10 = l10;
                    }
                    if (i15 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 32) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -458753;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i17 != 0) {
                        interfaceC0129e4 = C0945e.f10284a;
                    } else {
                        interfaceC0129e4 = interfaceC0129e2;
                    }
                    if ((i11 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        } else {
                            objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(objF);
                        }
                        jVar4 = (androidx.compose.foundation.gestures.e) objF;
                        i12 &= -29360129;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
                hVar2 = hVar3;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                interfaceC0129e3 = interfaceC0129e4;
                z14 = z12;
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyGridState2 = lazyGridState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                interfaceC0129e3 = interfaceC0129e2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) != 306783378) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c1086gP.C(i12 & 1, z13)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState;
                }
                if (i13 != 0) {
                    float f11111111 = 0;
                    n10 = new N(f11111111, f11111111, f11111111, f11111111);
                } else {
                    n10 = l10;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                if ((i11 & 32) != 0) {
                    if (z12) {
                        lVar4 = C0945e.f10286c;
                    } else {
                        lVar4 = C0945e.f10287d;
                    }
                    i12 &= -458753;
                } else {
                    lVar4 = lVar3;
                }
                if (i17 != 0) {
                    interfaceC0129e4 = C0945e.f10284a;
                } else {
                    interfaceC0129e4 = interfaceC0129e2;
                }
                if ((i11 & 128) != 0) {
                    interfaceC0918sA = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA);
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(objF);
                    }
                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                    i12 &= -29360129;
                } else {
                    jVar4 = jVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
            } else {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i11 & 4) != 0) {
                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                    i12 &= -897;
                } else {
                    lazyGridStateA = lazyGridState;
                }
                if (i13 != 0) {
                    float f11111112 = 0;
                    n10 = new N(f11111112, f11111112, f11111112, f11111112);
                } else {
                    n10 = l10;
                }
                if (i15 != 0) {
                    z12 = false;
                }
                if ((i11 & 32) != 0) {
                    if (z12) {
                        lVar4 = C0945e.f10286c;
                    } else {
                        lVar4 = C0945e.f10287d;
                    }
                    i12 &= -458753;
                } else {
                    lVar4 = lVar3;
                }
                if (i17 != 0) {
                    interfaceC0129e4 = C0945e.f10284a;
                } else {
                    interfaceC0129e4 = interfaceC0129e2;
                }
                if ((i11 & 128) != 0) {
                    interfaceC0918sA = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA);
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(objF);
                    } else {
                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(objF);
                    }
                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                    i12 &= -29360129;
                } else {
                    jVar4 = jVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
            }
            c1086gP.U();
            b(bVar, hVar3, lazyGridStateA, n10, z12, lVar4, interfaceC0129e4, jVar4, z16, OverscrollKt.a(c1086gP), lVar2, c1086gP, i12 & 268435454, (i12 >> 27) & 14, 0);
            hVar2 = hVar3;
            lazyGridState2 = lazyGridStateA;
            l11 = n10;
            interfaceC0129e3 = interfaceC0129e4;
            z14 = z12;
            jVar3 = jVar4;
            z15 = z16;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            lazyGridState2 = lazyGridState;
            l11 = l10;
            z14 = z12;
            lVar4 = lVar3;
            interfaceC0129e3 = interfaceC0129e2;
            jVar3 = jVar2;
            z15 = z11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyGridDslKt.a(bVar, hVar2, lazyGridState2, l11, z14, lVar4, interfaceC0129e3, jVar3, z15, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0124  */
    /* JADX WARN: Code duplicated, block: B:111:0x012a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0135  */
    /* JADX WARN: Code duplicated, block: B:116:0x013d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0140  */
    /* JADX WARN: Code duplicated, block: B:119:0x0145  */
    /* JADX WARN: Code duplicated, block: B:122:0x0155  */
    /* JADX WARN: Code duplicated, block: B:126:0x015d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0167  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a5 A[PHI: r2 r3 r4 r5 r8 r9 r10 r11 r13
      0x01a5: PHI (r2v36 int) = (r2v28 int), (r2v41 int) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r3v8 boolean) = (r3v4 boolean), (r3v13 boolean) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r4v19 androidx.compose.ui.h) = (r4v15 androidx.compose.ui.h), (r4v21 androidx.compose.ui.h) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r5v15 androidx.compose.foundation.gestures.j) = (r5v7 androidx.compose.foundation.gestures.j), (r5v16 androidx.compose.foundation.gestures.j) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r8v13 androidx.compose.foundation.lazy.grid.LazyGridState) = (r8v9 androidx.compose.foundation.lazy.grid.LazyGridState), (r8v6 androidx.compose.foundation.lazy.grid.LazyGridState) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r9v12 androidx.compose.foundation.layout.e$l) = (r9v5 androidx.compose.foundation.layout.e$l), (r9v13 androidx.compose.foundation.layout.e$l) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r10v9 androidx.compose.foundation.layout.L) = (r10v5 androidx.compose.foundation.layout.L), (r10v2 androidx.compose.foundation.layout.L) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r11v10 androidx.compose.foundation.layout.e$e) = (r11v7 androidx.compose.foundation.layout.e$e), (r11v11 androidx.compose.foundation.layout.e$e) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r13v7 ??) = (r13v11 ??), (r13v12 ??) binds: [B:181:0x020b, B:146:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:150:0x01af  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:167:0x01da  */
    /* JADX WARN: Code duplicated, block: B:168:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:176:0x0200  */
    /* JADX WARN: Code duplicated, block: B:178:0x0204  */
    /* JADX WARN: Code duplicated, block: B:179:0x0207  */
    /* JADX WARN: Code duplicated, block: B:182:0x020d  */
    /* JADX WARN: Code duplicated, block: B:185:0x022a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0230  */
    /* JADX WARN: Code duplicated, block: B:193:0x0240  */
    /* JADX WARN: Code duplicated, block: B:195:0x0246  */
    /* JADX WARN: Code duplicated, block: B:201:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0257  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public static final void b(final b bVar, androidx.compose.ui.h hVar, LazyGridState lazyGridState, L l10, boolean z10, C0945e.l lVar, C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.foundation.gestures.j jVar, boolean z11, E e10, final Ia.l<? super v, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        LazyGridState lazyGridStateA;
        int i14;
        L n10;
        int i15;
        int i16;
        boolean z12;
        int i17;
        ?? r13;
        C0945e.l lVar3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z13;
        boolean z14;
        final androidx.compose.ui.h hVar2;
        final C0945e.InterfaceC0129e interfaceC0129e2;
        final boolean z15;
        final LazyGridState lazyGridState2;
        final L l11;
        final ?? r10;
        final C0945e.l lVar4;
        final androidx.compose.foundation.gestures.j jVar2;
        final E e11;
        C1105p0 c1105p0V;
        int i24;
        androidx.compose.ui.h hVar3;
        int i25;
        C0945e.l lVar5;
        C0945e.InterfaceC0129e interfaceC0129e3;
        androidx.compose.foundation.gestures.j jVar3;
        boolean z16;
        int i26;
        E eA;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        Object obj;
        ?? r14;
        int i27;
        boolean z17;
        Object obj2;
        ?? r15;
        int i28;
        C1086g c1086gP = interfaceC1084f.p(-2072102870);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.K(bVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i29 = i12 & 2;
        if (i29 == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.K(hVar) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i12 & 4) == 0) {
                    lazyGridStateA = lazyGridState;
                    int i30 = c1086gP.K(lazyGridStateA) ? 256 : 128;
                    i13 |= i30;
                } else {
                    lazyGridStateA = lazyGridState;
                }
                i13 |= i30;
            } else {
                lazyGridStateA = lazyGridState;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    n10 = l10;
                    if (c1086gP.K(n10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z12 = z10;
                        if (c1086gP.c(z12)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                        r13 = z12;
                    }
                    if ((i10 & 196608) == 0) {
                        lVar3 = lVar;
                        if ((i12 & 32) == 0 || !c1086gP.K(lVar3)) {
                            i28 = 65536;
                        } else {
                            i28 = 131072;
                        }
                        i13 |= i28;
                    } else {
                        lVar3 = lVar;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(interfaceC0129e)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    if ((i10 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
                    }
                    i20 = i12 & 256;
                    if (i20 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.c(z11)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                        i13 |= i21;
                    }
                    if ((i10 & 805306368) != 0) {
                        i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    z13 = true;
                    if ((i13 & 306783379) == 306783378 || (i22 & 3) != 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c1086gP.C(i13 & 1, z14)) {
                        c1086gP.r0();
                        i24 = i10 & 1;
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (i24 != 0 || c1086gP.a0()) {
                            if (i29 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i12 & 4) != 0) {
                                i25 = 0;
                                lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                                i13 &= -897;
                            } else {
                                i25 = 0;
                            }
                            if (i14 != 0) {
                                float f10 = i25;
                                n10 = new N(f10, f10, f10, f10);
                            }
                            if (i16 != 0) {
                                r13 = i25;
                            }
                            if ((i12 & 32) != 0) {
                                if (r13 == 0) {
                                    lVar5 = C0945e.f10286c;
                                } else {
                                    lVar5 = C0945e.f10287d;
                                }
                                i13 &= -458753;
                            } else {
                                lVar5 = lVar3;
                            }
                            if (i18 != 0) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = interfaceC0129e;
                            }
                            if ((i12 & 128) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK || objF == c0153a) {
                                    obj = objF;
                                    androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(eVar);
                                    obj = eVar;
                                }
                                jVar3 = (androidx.compose.foundation.gestures.e) obj;
                                i13 &= -29360129;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i20 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            r15 = r13;
                            if ((i12 & 512) != 0) {
                                i26 = i13 & (-1879048193);
                                eA = OverscrollKt.a(c1086gP);
                                r14 = r13;
                            }
                            c1086gP.U();
                            i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            boolean z18 = (((i27 & 14) ^ 6) <= 4 && c1086gP.K(bVar)) || (i27 & 6) == 4;
                            if ((((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 || !c1086gP.K(interfaceC0129e3)) && (i27 & 48) != 32) {
                            }
                            z17 = z18 | z13;
                            Object objF2 = c1086gP.f();
                            obj2 = objF2;
                            if (z17 || objF2 == c0153a) {
                                d dVar = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                                c1086gP.E(dVar);
                                obj2 = dVar;
                            }
                            int i31 = i26 >> 3;
                            LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i31 & 234881024) | (i31 & 14) | 196608 | (i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i31) | (29360128 & i31) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                            lVar4 = lVar5;
                            interfaceC0129e2 = interfaceC0129e3;
                            z15 = z16;
                            lazyGridState2 = lazyGridStateA;
                            jVar2 = jVar3;
                            r10 = r14;
                            L l12 = n10;
                            e11 = eA;
                            hVar2 = hVar3;
                            l11 = l12;
                        } else {
                            c1086gP.w();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            if ((i12 & 512) != 0) {
                                i13 &= -1879048193;
                            }
                            hVar3 = hVar;
                            interfaceC0129e3 = interfaceC0129e;
                            jVar3 = jVar;
                            z16 = z11;
                            lVar5 = lVar3;
                            r15 = r13;
                        }
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                        c1086gP.U();
                        i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        if (((i27 & 14) ^ 6) <= 4) {
                        }
                        z13 = ((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 ? false : false;
                        z17 = z18 | z13;
                        Object objF3 = c1086gP.f();
                        obj2 = objF3;
                        if (z17) {
                            d dVar2 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                            c1086gP.E(dVar2);
                            obj2 = dVar2;
                        } else {
                            d dVar3 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                            c1086gP.E(dVar3);
                            obj2 = dVar3;
                        }
                        int i32 = i26 >> 3;
                        LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i32 & 234881024) | (i32 & 14) | 196608 | (i32 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i32) | (29360128 & i32) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        lVar4 = lVar5;
                        interfaceC0129e2 = interfaceC0129e3;
                        z15 = z16;
                        lazyGridState2 = lazyGridStateA;
                        jVar2 = jVar3;
                        r10 = r14;
                        L l13 = n10;
                        e11 = eA;
                        hVar2 = hVar3;
                        l11 = l13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        z15 = z11;
                        lazyGridState2 = lazyGridStateA;
                        l11 = n10;
                        r10 = r13 == true ? 1 : 0;
                        lVar4 = lVar3;
                        jVar2 = jVar;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                r13 = z10;
                if ((i10 & 196608) == 0) {
                    lVar3 = lVar;
                    if ((i12 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i13 |= i28;
                } else {
                    lVar3 = lVar;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(interfaceC0129e)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
                }
                i20 = i12 & 256;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                if ((i10 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                z13 = true;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i13 & 1, z14)) {
                    c1086gP.r0();
                    i24 = i10 & 1;
                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f11 = i25;
                            n10 = new N(f11, f11, f11, f11);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar2 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar2);
                                obj = eVar2;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar3 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar3);
                                obj = eVar3;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f12 = i25;
                            n10 = new N(f12, f12, f12, f12);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar4 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar4);
                                obj = eVar4;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar5 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar5);
                                obj = eVar5;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    }
                    c1086gP.U();
                    i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i27 & 14) ^ 6) <= 4) {
                    }
                    if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    Object objF4 = c1086gP.f();
                    obj2 = objF4;
                    if (z17) {
                        d dVar4 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar4);
                        obj2 = dVar4;
                    } else {
                        d dVar5 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar5);
                        obj2 = dVar5;
                    }
                    int i33 = i26 >> 3;
                    LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i33 & 234881024) | (i33 & 14) | 196608 | (i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i33) | (29360128 & i33) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    lVar4 = lVar5;
                    interfaceC0129e2 = interfaceC0129e3;
                    z15 = z16;
                    lazyGridState2 = lazyGridStateA;
                    jVar2 = jVar3;
                    r10 = r14;
                    L l14 = n10;
                    e11 = eA;
                    hVar2 = hVar3;
                    l11 = l14;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    z15 = z11;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    r10 = r13 == true ? 1 : 0;
                    lVar4 = lVar3;
                    jVar2 = jVar;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            n10 = l10;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                    r13 = z12;
                }
                if ((i10 & 196608) == 0) {
                    lVar3 = lVar;
                    if ((i12 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i13 |= i28;
                } else {
                    lVar3 = lVar;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(interfaceC0129e)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
                }
                i20 = i12 & 256;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                if ((i10 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                z13 = true;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i13 & 1, z14)) {
                    c1086gP.r0();
                    i24 = i10 & 1;
                    InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f13 = i25;
                            n10 = new N(f13, f13, f13, f13);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar6 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar6);
                                obj = eVar6;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar7 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar7);
                                obj = eVar7;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f14 = i25;
                            n10 = new N(f14, f14, f14, f14);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar8 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar8);
                                obj = eVar8;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar9 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar9);
                                obj = eVar9;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    }
                    c1086gP.U();
                    i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i27 & 14) ^ 6) <= 4) {
                    }
                    if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    Object objF5 = c1086gP.f();
                    obj2 = objF5;
                    if (z17) {
                        d dVar6 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar6);
                        obj2 = dVar6;
                    } else {
                        d dVar7 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar7);
                        obj2 = dVar7;
                    }
                    int i34 = i26 >> 3;
                    LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i34 & 234881024) | (i34 & 14) | 196608 | (i34 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i34) | (29360128 & i34) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    lVar4 = lVar5;
                    interfaceC0129e2 = interfaceC0129e3;
                    z15 = z16;
                    lazyGridState2 = lazyGridStateA;
                    jVar2 = jVar3;
                    r10 = r14;
                    L l15 = n10;
                    e11 = eA;
                    hVar2 = hVar3;
                    l11 = l15;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    z15 = z11;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    r10 = r13 == true ? 1 : 0;
                    lVar4 = lVar3;
                    jVar2 = jVar;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            r13 = z10;
            if ((i10 & 196608) == 0) {
                lVar3 = lVar;
                if ((i12 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i13 |= i28;
            } else {
                lVar3 = lVar;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(interfaceC0129e)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            z13 = true;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i13 & 1, z14)) {
                c1086gP.r0();
                i24 = i10 & 1;
                InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                if (i24 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f15 = i25;
                        n10 = new N(f15, f15, f15, f15);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar10 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar10);
                            obj = eVar10;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar11 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar11);
                            obj = eVar11;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f16 = i25;
                        n10 = new N(f16, f16, f16, f16);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar12 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar12);
                            obj = eVar12;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar13 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar13);
                            obj = eVar13;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                }
                c1086gP.U();
                i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i27 & 14) ^ 6) <= 4) {
                }
                if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                }
                z17 = z18 | z13;
                Object objF6 = c1086gP.f();
                obj2 = objF6;
                if (z17) {
                    d dVar8 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar8);
                    obj2 = dVar8;
                } else {
                    d dVar9 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar9);
                    obj2 = dVar9;
                }
                int i35 = i26 >> 3;
                LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i35 & 234881024) | (i35 & 14) | 196608 | (i35 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i35) | (29360128 & i35) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                lVar4 = lVar5;
                interfaceC0129e2 = interfaceC0129e3;
                z15 = z16;
                lazyGridState2 = lazyGridStateA;
                jVar2 = jVar3;
                r10 = r14;
                L l16 = n10;
                e11 = eA;
                hVar2 = hVar3;
                l11 = l16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                z15 = z11;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                r10 = r13 == true ? 1 : 0;
                lVar4 = lVar3;
                jVar2 = jVar;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        if ((i10 & 384) == 0) {
            if ((i12 & 4) == 0) {
                lazyGridStateA = lazyGridState;
                if (c1086gP.K(lazyGridStateA)) {
                }
                i13 |= i30;
            } else {
                lazyGridStateA = lazyGridState;
            }
            i13 |= i30;
        } else {
            lazyGridStateA = lazyGridState;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                n10 = l10;
                if (c1086gP.K(n10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                    r13 = z12;
                }
                if ((i10 & 196608) == 0) {
                    lVar3 = lVar;
                    if ((i12 & 32) == 0) {
                        i28 = 65536;
                    } else {
                        i28 = 65536;
                    }
                    i13 |= i28;
                } else {
                    lVar3 = lVar;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(interfaceC0129e)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
                }
                i20 = i12 & 256;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.c(z11)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                if ((i10 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                z13 = true;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c1086gP.C(i13 & 1, z14)) {
                    c1086gP.r0();
                    i24 = i10 & 1;
                    InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                    if (i24 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f17 = i25;
                            n10 = new N(f17, f17, f17, f17);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar14 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar14);
                                obj = eVar14;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar15 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar15);
                                obj = eVar15;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            i25 = 0;
                            lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                            i13 &= -897;
                        } else {
                            i25 = 0;
                        }
                        if (i14 != 0) {
                            float f18 = i25;
                            n10 = new N(f18, f18, f18, f18);
                        }
                        if (i16 != 0) {
                            r13 = i25;
                        }
                        if ((i12 & 32) != 0) {
                            if (r13 == 0) {
                                lVar5 = C0945e.f10286c;
                            } else {
                                lVar5 = C0945e.f10287d;
                            }
                            i13 &= -458753;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i18 != 0) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = interfaceC0129e;
                        }
                        if ((i12 & 128) != 0) {
                            interfaceC0918sA = C.a(c1086gP);
                            zK = c1086gP.K(interfaceC0918sA);
                            objF = c1086gP.f();
                            if (zK) {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar16 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar16);
                                obj = eVar16;
                            } else {
                                obj = objF;
                                androidx.compose.foundation.gestures.e eVar17 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                c1086gP.E(eVar17);
                                obj = eVar17;
                            }
                            jVar3 = (androidx.compose.foundation.gestures.e) obj;
                            i13 &= -29360129;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i20 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        r15 = r13;
                        if ((i12 & 512) != 0) {
                            i26 = i13 & (-1879048193);
                            eA = OverscrollKt.a(c1086gP);
                            r14 = r13;
                        } else {
                            i26 = i13;
                            eA = e10;
                            r14 = r15;
                        }
                    }
                    c1086gP.U();
                    i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i27 & 14) ^ 6) <= 4) {
                    }
                    if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    }
                    z17 = z18 | z13;
                    Object objF7 = c1086gP.f();
                    obj2 = objF7;
                    if (z17) {
                        d dVar10 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar10);
                        obj2 = dVar10;
                    } else {
                        d dVar11 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                        c1086gP.E(dVar11);
                        obj2 = dVar11;
                    }
                    int i36 = i26 >> 3;
                    LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i36 & 234881024) | (i36 & 14) | 196608 | (i36 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i36) | (29360128 & i36) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    lVar4 = lVar5;
                    interfaceC0129e2 = interfaceC0129e3;
                    z15 = z16;
                    lazyGridState2 = lazyGridStateA;
                    jVar2 = jVar3;
                    r10 = r14;
                    L l17 = n10;
                    e11 = eA;
                    hVar2 = hVar3;
                    l11 = l17;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    z15 = z11;
                    lazyGridState2 = lazyGridStateA;
                    l11 = n10;
                    r10 = r13 == true ? 1 : 0;
                    lVar4 = lVar3;
                    jVar2 = jVar;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            r13 = z10;
            if ((i10 & 196608) == 0) {
                lVar3 = lVar;
                if ((i12 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i13 |= i28;
            } else {
                lVar3 = lVar;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(interfaceC0129e)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            z13 = true;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i13 & 1, z14)) {
                c1086gP.r0();
                i24 = i10 & 1;
                InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
                if (i24 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f19 = i25;
                        n10 = new N(f19, f19, f19, f19);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar18 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar18);
                            obj = eVar18;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar19 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar19);
                            obj = eVar19;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f110 = i25;
                        n10 = new N(f110, f110, f110, f110);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar110 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar110);
                            obj = eVar110;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar111 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar111);
                            obj = eVar111;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                }
                c1086gP.U();
                i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i27 & 14) ^ 6) <= 4) {
                }
                if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                }
                z17 = z18 | z13;
                Object objF8 = c1086gP.f();
                obj2 = objF8;
                if (z17) {
                    d dVar12 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar12);
                    obj2 = dVar12;
                } else {
                    d dVar13 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar13);
                    obj2 = dVar13;
                }
                int i37 = i26 >> 3;
                LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i37 & 234881024) | (i37 & 14) | 196608 | (i37 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i37) | (29360128 & i37) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                lVar4 = lVar5;
                interfaceC0129e2 = interfaceC0129e3;
                z15 = z16;
                lazyGridState2 = lazyGridStateA;
                jVar2 = jVar3;
                r10 = r14;
                L l18 = n10;
                e11 = eA;
                hVar2 = hVar3;
                l11 = l18;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                z15 = z11;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                r10 = r13 == true ? 1 : 0;
                lVar4 = lVar3;
                jVar2 = jVar;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        n10 = l10;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
                r13 = z12;
            }
            if ((i10 & 196608) == 0) {
                lVar3 = lVar;
                if ((i12 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i13 |= i28;
            } else {
                lVar3 = lVar;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(interfaceC0129e)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.c(z11)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(lVar2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            z13 = true;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c1086gP.C(i13 & 1, z14)) {
                c1086gP.r0();
                i24 = i10 & 1;
                InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
                if (i24 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f111 = i25;
                        n10 = new N(f111, f111, f111, f111);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar112 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar112);
                            obj = eVar112;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar113 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar113);
                            obj = eVar113;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        i25 = 0;
                        lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                        i13 &= -897;
                    } else {
                        i25 = 0;
                    }
                    if (i14 != 0) {
                        float f112 = i25;
                        n10 = new N(f112, f112, f112, f112);
                    }
                    if (i16 != 0) {
                        r13 = i25;
                    }
                    if ((i12 & 32) != 0) {
                        if (r13 == 0) {
                            lVar5 = C0945e.f10286c;
                        } else {
                            lVar5 = C0945e.f10287d;
                        }
                        i13 &= -458753;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i18 != 0) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = interfaceC0129e;
                    }
                    if ((i12 & 128) != 0) {
                        interfaceC0918sA = C.a(c1086gP);
                        zK = c1086gP.K(interfaceC0918sA);
                        objF = c1086gP.f();
                        if (zK) {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar114 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar114);
                            obj = eVar114;
                        } else {
                            obj = objF;
                            androidx.compose.foundation.gestures.e eVar115 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                            c1086gP.E(eVar115);
                            obj = eVar115;
                        }
                        jVar3 = (androidx.compose.foundation.gestures.e) obj;
                        i13 &= -29360129;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i20 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    r15 = r13;
                    if ((i12 & 512) != 0) {
                        i26 = i13 & (-1879048193);
                        eA = OverscrollKt.a(c1086gP);
                        r14 = r13;
                    } else {
                        i26 = i13;
                        eA = e10;
                        r14 = r15;
                    }
                }
                c1086gP.U();
                i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i27 & 14) ^ 6) <= 4) {
                }
                if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                }
                z17 = z18 | z13;
                Object objF9 = c1086gP.f();
                obj2 = objF9;
                if (z17) {
                    d dVar14 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar14);
                    obj2 = dVar14;
                } else {
                    d dVar15 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                    c1086gP.E(dVar15);
                    obj2 = dVar15;
                }
                int i38 = i26 >> 3;
                LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i38 & 234881024) | (i38 & 14) | 196608 | (i38 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i38) | (29360128 & i38) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                lVar4 = lVar5;
                interfaceC0129e2 = interfaceC0129e3;
                z15 = z16;
                lazyGridState2 = lazyGridStateA;
                jVar2 = jVar3;
                r10 = r14;
                L l19 = n10;
                e11 = eA;
                hVar2 = hVar3;
                l11 = l19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                z15 = z11;
                lazyGridState2 = lazyGridStateA;
                l11 = n10;
                r10 = r13 == true ? 1 : 0;
                lVar4 = lVar3;
                jVar2 = jVar;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        r13 = z10;
        if ((i10 & 196608) == 0) {
            lVar3 = lVar;
            if ((i12 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i13 |= i28;
        } else {
            lVar3 = lVar;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.K(interfaceC0129e)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i10 & 12582912) != 0) {
            i13 |= ((i12 & 128) == 0 || !c1086gP.K(jVar)) ? 4194304 : 8388608;
        }
        i20 = i12 & 256;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.c(z11)) {
                i21 = 67108864;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        if ((i10 & 805306368) != 0) {
            i13 |= ((i12 & 512) == 0 || !c1086gP.K(e10)) ? 268435456 : 536870912;
        }
        if ((i12 & 1024) != 0) {
            i22 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.k(lVar2)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i11 | i23;
        } else {
            i22 = i11;
        }
        z13 = true;
        if ((i13 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c1086gP.C(i13 & 1, z14)) {
            c1086gP.r0();
            i24 = i10 & 1;
            InterfaceC1084f.a.C0153a c0153a8 = InterfaceC1084f.a.f12980a;
            if (i24 != 0) {
                if (i29 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    i25 = 0;
                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                    i13 &= -897;
                } else {
                    i25 = 0;
                }
                if (i14 != 0) {
                    float f113 = i25;
                    n10 = new N(f113, f113, f113, f113);
                }
                if (i16 != 0) {
                    r13 = i25;
                }
                if ((i12 & 32) != 0) {
                    if (r13 == 0) {
                        lVar5 = C0945e.f10286c;
                    } else {
                        lVar5 = C0945e.f10287d;
                    }
                    i13 &= -458753;
                } else {
                    lVar5 = lVar3;
                }
                if (i18 != 0) {
                    interfaceC0129e3 = C0945e.f10284a;
                } else {
                    interfaceC0129e3 = interfaceC0129e;
                }
                if ((i12 & 128) != 0) {
                    interfaceC0918sA = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA);
                    objF = c1086gP.f();
                    if (zK) {
                        obj = objF;
                        androidx.compose.foundation.gestures.e eVar116 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(eVar116);
                        obj = eVar116;
                    } else {
                        obj = objF;
                        androidx.compose.foundation.gestures.e eVar117 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(eVar117);
                        obj = eVar117;
                    }
                    jVar3 = (androidx.compose.foundation.gestures.e) obj;
                    i13 &= -29360129;
                } else {
                    jVar3 = jVar;
                }
                if (i20 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                r15 = r13;
                if ((i12 & 512) != 0) {
                    i26 = i13 & (-1879048193);
                    eA = OverscrollKt.a(c1086gP);
                    r14 = r13;
                } else {
                    i26 = i13;
                    eA = e10;
                    r14 = r15;
                }
            } else {
                if (i29 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    i25 = 0;
                    lazyGridStateA = LazyGridStateKt.a(0, c1086gP, 3);
                    i13 &= -897;
                } else {
                    i25 = 0;
                }
                if (i14 != 0) {
                    float f114 = i25;
                    n10 = new N(f114, f114, f114, f114);
                }
                if (i16 != 0) {
                    r13 = i25;
                }
                if ((i12 & 32) != 0) {
                    if (r13 == 0) {
                        lVar5 = C0945e.f10286c;
                    } else {
                        lVar5 = C0945e.f10287d;
                    }
                    i13 &= -458753;
                } else {
                    lVar5 = lVar3;
                }
                if (i18 != 0) {
                    interfaceC0129e3 = C0945e.f10284a;
                } else {
                    interfaceC0129e3 = interfaceC0129e;
                }
                if ((i12 & 128) != 0) {
                    interfaceC0918sA = C.a(c1086gP);
                    zK = c1086gP.K(interfaceC0918sA);
                    objF = c1086gP.f();
                    if (zK) {
                        obj = objF;
                        androidx.compose.foundation.gestures.e eVar118 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(eVar118);
                        obj = eVar118;
                    } else {
                        obj = objF;
                        androidx.compose.foundation.gestures.e eVar119 = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                        c1086gP.E(eVar119);
                        obj = eVar119;
                    }
                    jVar3 = (androidx.compose.foundation.gestures.e) obj;
                    i13 &= -29360129;
                } else {
                    jVar3 = jVar;
                }
                if (i20 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                r15 = r13;
                if ((i12 & 512) != 0) {
                    i26 = i13 & (-1879048193);
                    eA = OverscrollKt.a(c1086gP);
                    r14 = r13;
                } else {
                    i26 = i13;
                    eA = e10;
                    r14 = r15;
                }
            }
            c1086gP.U();
            i27 = (i26 & 14) | ((i26 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            if (((i27 & 14) ^ 6) <= 4) {
            }
            if (((i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
            }
            z17 = z18 | z13;
            Object objF10 = c1086gP.f();
            obj2 = objF10;
            if (z17) {
                d dVar16 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                c1086gP.E(dVar16);
                obj2 = dVar16;
            } else {
                d dVar17 = new d(new LazyGridDslKt$rememberColumnWidthSums$1$1(bVar, interfaceC0129e3));
                c1086gP.E(dVar17);
                obj2 = dVar17;
            }
            int i39 = i26 >> 3;
            LazyGridKt.a(hVar3, lazyGridStateA, (y) obj2, n10, r14, true, jVar3, z16, eA, lVar5, interfaceC0129e3, lVar2, c1086gP, (i39 & 234881024) | (i39 & 14) | 196608 | (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 7168) | (57344 & i26) | (3670016 & i39) | (29360128 & i39) | ((i26 << 12) & 1879048192), ((i26 >> 18) & 14) | ((i22 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            lVar4 = lVar5;
            interfaceC0129e2 = interfaceC0129e3;
            z15 = z16;
            lazyGridState2 = lazyGridStateA;
            jVar2 = jVar3;
            r10 = r14;
            L l110 = n10;
            e11 = eA;
            hVar2 = hVar3;
            l11 = l110;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            interfaceC0129e2 = interfaceC0129e;
            z15 = z11;
            lazyGridState2 = lazyGridStateA;
            l11 = n10;
            r10 = r13 == true ? 1 : 0;
            lVar4 = lVar3;
            jVar2 = jVar;
            e11 = e10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyGridDslKt.b(bVar, hVar2, lazyGridState2, l11, r10, lVar4, interfaceC0129e2, jVar2, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
