package androidx.compose.foundation.lazy;

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

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0115  */
    /* JADX WARN: Code duplicated, block: B:106:0x0119  */
    /* JADX WARN: Code duplicated, block: B:108:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x0124  */
    /* JADX WARN: Code duplicated, block: B:113:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x0141  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:135:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x0187  */
    /* JADX WARN: Code duplicated, block: B:140:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0195  */
    /* JADX WARN: Code duplicated, block: B:143:0x0199  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01be  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01de  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:175:0x024a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0261  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0108  */
    public static final void a(androidx.compose.ui.h hVar, LazyListState lazyListState, L l10, boolean z10, C0945e.l lVar, androidx.compose.ui.d.b bVar, androidx.compose.foundation.gestures.j jVar, boolean z11, E e10, final Ia.l<? super p, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        C0945e.l lVar3;
        int i15;
        androidx.compose.ui.d.b bVar2;
        int i16;
        androidx.compose.foundation.gestures.j jVar2;
        int i17;
        int i18;
        int i19;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final LazyListState lazyListStateA;
        final L l11;
        final boolean z14;
        final C0945e.l lVar4;
        final androidx.compose.ui.d.b bVar3;
        final androidx.compose.foundation.gestures.j jVar3;
        final boolean z15;
        final E e11;
        C1105p0 c1105p0V;
        L n10;
        androidx.compose.ui.d.b bVar4;
        androidx.compose.foundation.gestures.j jVar4;
        E eA;
        int i20;
        boolean z16;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(53695811);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c1086gP.K(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c1086gP.K(l10) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        lVar3 = lVar;
                        int i23 = c1086gP.K(lVar3) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        lVar3 = lVar;
                    }
                    i12 |= i23;
                } else {
                    lVar3 = lVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        bVar2 = bVar;
                        if (c1086gP.K(bVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            jVar2 = jVar;
                            int i24 = c1086gP.K(jVar2) ? 1048576 : 524288;
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.c(z11)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar2)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i21 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if ((i11 & 2) != 0) {
                                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                                    i12 &= -113;
                                } else {
                                    lazyListStateA = lazyListState;
                                }
                                if (i22 != 0) {
                                    float f10 = 0;
                                    n10 = new N(f10, f10, f10, f10);
                                } else {
                                    n10 = l10;
                                }
                                if (i13 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 16) != 0) {
                                    if (z12) {
                                        lVar4 = C0945e.f10287d;
                                    } else {
                                        lVar4 = C0945e.f10286c;
                                    }
                                    i12 &= -57345;
                                } else {
                                    lVar4 = lVar3;
                                }
                                if (i15 != 0) {
                                    bVar4 = androidx.compose.ui.d.a.f13346m;
                                } else {
                                    bVar4 = bVar2;
                                }
                                if ((i11 & 64) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -3670017;
                                } else {
                                    jVar4 = jVar2;
                                }
                                boolean z17 = i17 == 0 ? z11 : true;
                                if ((i11 & 256) != 0) {
                                    eA = OverscrollKt.a(c1086gP);
                                    i12 &= -234881025;
                                } else {
                                    eA = e10;
                                }
                                i20 = i12;
                                z16 = z17;
                            } else {
                                c1086gP.w();
                                if ((i11 & 2) != 0) {
                                    i12 &= -113;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                hVar2 = hVar;
                                lazyListStateA = lazyListState;
                                n10 = l10;
                                eA = e10;
                                i20 = i12;
                                lVar4 = lVar3;
                                bVar4 = bVar2;
                                jVar4 = jVar2;
                                z16 = z11;
                            }
                            c1086gP.U();
                            int i25 = i20 >> 3;
                            LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                            z14 = z12;
                            z15 = z16;
                            l11 = n10;
                            bVar3 = bVar4;
                            jVar3 = jVar4;
                            e11 = eA;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyListStateA = lazyListState;
                            l11 = l10;
                            z14 = z12;
                            lVar4 = lVar3;
                            bVar3 = bVar2;
                            jVar3 = jVar2;
                            z15 = z11;
                            e11 = e10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f11 = 0;
                                n10 = new N(f11, f11, f11, f11);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f12 = 0;
                                n10 = new N(f12, f12, f12, f12);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i26 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        bVar3 = bVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        bVar3 = bVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                bVar2 = bVar;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f13 = 0;
                                n10 = new N(f13, f13, f13, f13);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f14 = 0;
                                n10 = new N(f14, f14, f14, f14);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i27 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        bVar3 = bVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        bVar3 = bVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f15 = 0;
                            n10 = new N(f15, f15, f15, f15);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f16 = 0;
                            n10 = new N(f16, f16, f16, f16);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i28 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
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
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f17 = 0;
                                n10 = new N(f17, f17, f17, f17);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f18 = 0;
                                n10 = new N(f18, f18, f18, f18);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i29 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        bVar3 = bVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        bVar3 = bVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f19 = 0;
                            n10 = new N(f19, f19, f19, f19);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f110 = 0;
                            n10 = new N(f110, f110, f110, f110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i210 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            bVar2 = bVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f111 = 0;
                            n10 = new N(f111, f111, f111, f111);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f112 = 0;
                            n10 = new N(f112, f112, f112, f112);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i211 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f113 = 0;
                        n10 = new N(f113, f113, f113, f113);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f114 = 0;
                        n10 = new N(f114, f114, f114, f114);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i212 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                bVar3 = bVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                bVar3 = bVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
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
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    bVar2 = bVar;
                    if (c1086gP.K(bVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f115 = 0;
                                n10 = new N(f115, f115, f115, f115);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f116 = 0;
                                n10 = new N(f116, f116, f116, f116);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    lVar4 = C0945e.f10286c;
                                } else {
                                    lVar4 = C0945e.f10287d;
                                }
                                i12 &= -57345;
                            } else {
                                lVar4 = lVar3;
                            }
                            if (i15 != 0) {
                                bVar4 = androidx.compose.ui.d.a.f13346m;
                            } else {
                                bVar4 = bVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i213 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        bVar3 = bVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        lVar4 = lVar3;
                        bVar3 = bVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f117 = 0;
                            n10 = new N(f117, f117, f117, f117);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f118 = 0;
                            n10 = new N(f118, f118, f118, f118);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i214 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i214) | (3670016 & i214) | (i214 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            bVar2 = bVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f119 = 0;
                            n10 = new N(f119, f119, f119, f119);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1110 = 0;
                            n10 = new N(f1110, f1110, f1110, f1110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i215 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1111 = 0;
                        n10 = new N(f1111, f1111, f1111, f1111);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1112 = 0;
                        n10 = new N(f1112, f1112, f1112, f1112);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i216 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i216) | (3670016 & i216) | (i216 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                bVar3 = bVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                bVar3 = bVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
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
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                bVar2 = bVar;
                if (c1086gP.K(bVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1113 = 0;
                            n10 = new N(f1113, f1113, f1113, f1113);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1114 = 0;
                            n10 = new N(f1114, f1114, f1114, f1114);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                lVar4 = C0945e.f10286c;
                            } else {
                                lVar4 = C0945e.f10287d;
                            }
                            i12 &= -57345;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (i15 != 0) {
                            bVar4 = androidx.compose.ui.d.a.f13346m;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i217 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i217) | (3670016 & i217) | (i217 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    bVar3 = bVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    lVar4 = lVar3;
                    bVar3 = bVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1115 = 0;
                        n10 = new N(f1115, f1115, f1115, f1115);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1116 = 0;
                        n10 = new N(f1116, f1116, f1116, f1116);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i218 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i218) | (3670016 & i218) | (i218 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                bVar3 = bVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                bVar3 = bVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        bVar2 = bVar;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
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
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.c(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(lVar2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i12 |= i19;
            }
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1117 = 0;
                        n10 = new N(f1117, f1117, f1117, f1117);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1118 = 0;
                        n10 = new N(f1118, f1118, f1118, f1118);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            lVar4 = C0945e.f10286c;
                        } else {
                            lVar4 = C0945e.f10287d;
                        }
                        i12 &= -57345;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (i15 != 0) {
                        bVar4 = androidx.compose.ui.d.a.f13346m;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i219 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i219) | (3670016 & i219) | (i219 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                bVar3 = bVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                lVar4 = lVar3;
                bVar3 = bVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f1119 = 0;
                    n10 = new N(f1119, f1119, f1119, f1119);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        lVar4 = C0945e.f10286c;
                    } else {
                        lVar4 = C0945e.f10287d;
                    }
                    i12 &= -57345;
                } else {
                    lVar4 = lVar3;
                }
                if (i15 != 0) {
                    bVar4 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar4 = bVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                if (i17 == 0) {
                }
                if ((i11 & 256) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i12 &= -234881025;
                } else {
                    eA = e10;
                }
                i20 = i12;
                z16 = z17;
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f11110 = 0;
                    n10 = new N(f11110, f11110, f11110, f11110);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        lVar4 = C0945e.f10286c;
                    } else {
                        lVar4 = C0945e.f10287d;
                    }
                    i12 &= -57345;
                } else {
                    lVar4 = lVar3;
                }
                if (i15 != 0) {
                    bVar4 = androidx.compose.ui.d.a.f13346m;
                } else {
                    bVar4 = bVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                if (i17 == 0) {
                }
                if ((i11 & 256) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i12 &= -234881025;
                } else {
                    eA = e10;
                }
                i20 = i12;
                z16 = z17;
            }
            c1086gP.U();
            int i2110 = i20 >> 3;
            LazyListKt.a(hVar2, lazyListStateA, n10, z12, true, jVar4, z16, eA, 0, bVar4, lVar4, null, null, lVar2, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i2110) | (3670016 & i2110) | (i2110 & 29360128) | ((i20 << 12) & 1879048192), ((i20 >> 12) & 14) | ((i20 >> 18) & 7168), 6400);
            z14 = z12;
            z15 = z16;
            l11 = n10;
            bVar3 = bVar4;
            jVar3 = jVar4;
            e11 = eA;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            lazyListStateA = lazyListState;
            l11 = l10;
            z14 = z12;
            lVar4 = lVar3;
            bVar3 = bVar2;
            jVar3 = jVar2;
            z15 = z11;
            e11 = e10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyDslKt.a(hVar2, lazyListStateA, l11, z14, lVar4, bVar3, jVar3, z15, e11, lVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0117  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:121:0x0157 A[PHI: r1 r2 r5 r6 r7 r8 r9 r12
      0x0157: PHI (r1v8 androidx.compose.ui.h) = (r1v5 androidx.compose.ui.h), (r1v12 androidx.compose.ui.h) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r2v19 androidx.compose.foundation.lazy.LazyListState) = (r2v16 androidx.compose.foundation.lazy.LazyListState), (r2v21 androidx.compose.foundation.lazy.LazyListState) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r5v11 androidx.compose.foundation.layout.e$e) = (r5v5 androidx.compose.foundation.layout.e$e), (r5v12 androidx.compose.foundation.layout.e$e) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r6v10 androidx.compose.foundation.layout.L) = (r6v6 androidx.compose.foundation.layout.L), (r6v11 androidx.compose.foundation.layout.L) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r7v12 androidx.compose.ui.d$c) = (r7v8 androidx.compose.ui.d$c), (r7v13 androidx.compose.ui.d$c) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r8v9 boolean) = (r8v5 boolean), (r8v2 boolean) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r9v15 androidx.compose.foundation.gestures.j) = (r9v10 androidx.compose.foundation.gestures.j), (r9v16 androidx.compose.foundation.gestures.j) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r12v7 int) = (r12v2 int), (r12v8 int) binds: [B:154:0x01b8, B:120:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0160  */
    /* JADX WARN: Code duplicated, block: B:127:0x0166  */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0171  */
    /* JADX WARN: Code duplicated, block: B:131:0x0178  */
    /* JADX WARN: Code duplicated, block: B:133:0x017c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0183  */
    /* JADX WARN: Code duplicated, block: B:138:0x0186  */
    /* JADX WARN: Code duplicated, block: B:140:0x018b  */
    /* JADX WARN: Code duplicated, block: B:142:0x018e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0191  */
    /* JADX WARN: Code duplicated, block: B:146:0x0196  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x0106  */
    @p293xa.d
    public static final void b(androidx.compose.ui.h hVar, LazyListState lazyListState, L l10, boolean z10, C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.ui.d.c cVar, androidx.compose.foundation.gestures.j jVar, boolean z11, final Ia.l lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        C0945e.InterfaceC0129e interfaceC0129e2;
        int i15;
        androidx.compose.ui.d.c cVar2;
        int i16;
        androidx.compose.foundation.gestures.j jVar2;
        int i17;
        int i18;
        int i19;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final LazyListState lazyListStateA;
        final L l11;
        final boolean z14;
        final C0945e.InterfaceC0129e interfaceC0129e3;
        final androidx.compose.ui.d.c cVar3;
        final androidx.compose.foundation.gestures.j jVar3;
        final boolean z15;
        C1105p0 c1105p0V;
        L n10;
        androidx.compose.ui.d.c cVar4;
        androidx.compose.foundation.gestures.j jVar4;
        int i20;
        boolean z16;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(-1724297413);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c1086gP.K(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c1086gP.K(l10) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        interfaceC0129e2 = interfaceC0129e;
                        int i23 = c1086gP.K(interfaceC0129e2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        cVar2 = cVar;
                        if (c1086gP.K(cVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            jVar2 = jVar;
                            int i24 = c1086gP.K(jVar2) ? 1048576 : 524288;
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.c(z11)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.k(lVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i21 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if ((i11 & 2) != 0) {
                                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                                    i12 &= -113;
                                } else {
                                    lazyListStateA = lazyListState;
                                }
                                if (i22 != 0) {
                                    float f10 = 0;
                                    n10 = new N(f10, f10, f10, f10);
                                } else {
                                    n10 = l10;
                                }
                                if (i13 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 16) != 0) {
                                    if (z12) {
                                        interfaceC0129e3 = C0945e.f10285b;
                                    } else {
                                        interfaceC0129e3 = C0945e.f10284a;
                                    }
                                    i12 &= -57345;
                                } else {
                                    interfaceC0129e3 = interfaceC0129e2;
                                }
                                if (i15 != 0) {
                                    cVar4 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if ((i11 & 64) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -3670017;
                                } else {
                                    jVar4 = jVar2;
                                }
                                i20 = i12;
                                if (i17 != 0) {
                                    z16 = true;
                                }
                                c1086gP.U();
                                c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                                z14 = z12;
                                z15 = z16;
                                l11 = n10;
                                cVar3 = cVar4;
                                jVar3 = jVar4;
                            } else {
                                c1086gP.w();
                                if ((i11 & 2) != 0) {
                                    i12 &= -113;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                hVar2 = hVar;
                                lazyListStateA = lazyListState;
                                n10 = l10;
                                i20 = i12;
                                interfaceC0129e3 = interfaceC0129e2;
                                cVar4 = cVar2;
                                jVar4 = jVar2;
                            }
                            z16 = z11;
                            c1086gP.U();
                            c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                            z14 = z12;
                            z15 = z16;
                            l11 = n10;
                            cVar3 = cVar4;
                            jVar3 = jVar4;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyListStateA = lazyListState;
                            l11 = l10;
                            z14 = z12;
                            interfaceC0129e3 = interfaceC0129e2;
                            cVar3 = cVar2;
                            jVar3 = jVar2;
                            z15 = z11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f11 = 0;
                                n10 = new N(f11, f11, f11, f11);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f12 = 0;
                                n10 = new N(f12, f12, f12, f12);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                cVar2 = cVar;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f13 = 0;
                                n10 = new N(f13, f13, f13, f13);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f14 = 0;
                                n10 = new N(f14, f14, f14, f14);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f15 = 0;
                            n10 = new N(f15, f15, f15, f15);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f16 = 0;
                            n10 = new N(f16, f16, f16, f16);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f17 = 0;
                                n10 = new N(f17, f17, f17, f17);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f18 = 0;
                                n10 = new N(f18, f18, f18, f18);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f19 = 0;
                            n10 = new N(f19, f19, f19, f19);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f110 = 0;
                            n10 = new N(f110, f110, f110, f110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f111 = 0;
                            n10 = new N(f111, f111, f111, f111);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f112 = 0;
                            n10 = new N(f112, f112, f112, f112);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f113 = 0;
                        n10 = new N(f113, f113, f113, f113);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f114 = 0;
                        n10 = new N(f114, f114, f114, f114);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f115 = 0;
                                n10 = new N(f115, f115, f115, f115);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f116 = 0;
                                n10 = new N(f116, f116, f116, f116);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            i20 = i12;
                            if (i17 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                        }
                        c1086gP.U();
                        c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f117 = 0;
                            n10 = new N(f117, f117, f117, f117);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f118 = 0;
                            n10 = new N(f118, f118, f118, f118);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f119 = 0;
                            n10 = new N(f119, f119, f119, f119);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1110 = 0;
                            n10 = new N(f1110, f1110, f1110, f1110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1111 = 0;
                        n10 = new N(f1111, f1111, f1111, f1111);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1112 = 0;
                        n10 = new N(f1112, f1112, f1112, f1112);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                interfaceC0129e2 = interfaceC0129e;
                if (c1086gP.K(interfaceC0129e2)) {
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i12 |= i23;
        } else {
            interfaceC0129e2 = interfaceC0129e;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                cVar2 = cVar;
                if (c1086gP.K(cVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1113 = 0;
                            n10 = new N(f1113, f1113, f1113, f1113);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1114 = 0;
                            n10 = new N(f1114, f1114, f1114, f1114);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        i20 = i12;
                        if (i17 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                    }
                    c1086gP.U();
                    c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1115 = 0;
                        n10 = new N(f1115, f1115, f1115, f1115);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1116 = 0;
                        n10 = new N(f1116, f1116, f1116, f1116);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        cVar2 = cVar;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
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
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.c(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c1086gP.k(lVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1117 = 0;
                        n10 = new N(f1117, f1117, f1117, f1117);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1118 = 0;
                        n10 = new N(f1118, f1118, f1118, f1118);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    i20 = i12;
                    if (i17 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                }
                c1086gP.U();
                c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 100663296;
        if ((i12 & 38347923) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c1086gP.C(i12 & 1, z13)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f1119 = 0;
                    n10 = new N(f1119, f1119, f1119, f1119);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = C0945e.f10285b;
                    }
                    i12 &= -57345;
                } else {
                    interfaceC0129e3 = interfaceC0129e2;
                }
                if (i15 != 0) {
                    cVar4 = androidx.compose.ui.d.a.j;
                } else {
                    cVar4 = cVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                i20 = i12;
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f11110 = 0;
                    n10 = new N(f11110, f11110, f11110, f11110);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = C0945e.f10285b;
                    }
                    i12 &= -57345;
                } else {
                    interfaceC0129e3 = interfaceC0129e2;
                }
                if (i15 != 0) {
                    cVar4 = androidx.compose.ui.d.a.j;
                } else {
                    cVar4 = cVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                i20 = i12;
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
            }
            c1086gP.U();
            c(hVar2, lazyListStateA, n10, z12, interfaceC0129e3, cVar4, jVar4, z16, OverscrollKt.a(c1086gP), lVar, c1086gP, (33554430 & i20) | ((i20 << 3) & 1879048192), 0);
            z14 = z12;
            z15 = z16;
            l11 = n10;
            cVar3 = cVar4;
            jVar3 = jVar4;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            lazyListStateA = lazyListState;
            l11 = l10;
            z14 = z12;
            interfaceC0129e3 = interfaceC0129e2;
            cVar3 = cVar2;
            jVar3 = jVar2;
            z15 = z11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyDslKt.b(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0115  */
    /* JADX WARN: Code duplicated, block: B:106:0x0119  */
    /* JADX WARN: Code duplicated, block: B:108:0x0121  */
    /* JADX WARN: Code duplicated, block: B:109:0x0124  */
    /* JADX WARN: Code duplicated, block: B:113:0x0135  */
    /* JADX WARN: Code duplicated, block: B:114:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x0141  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:135:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x0187  */
    /* JADX WARN: Code duplicated, block: B:140:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0195  */
    /* JADX WARN: Code duplicated, block: B:143:0x0199  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01be  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01de  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:175:0x0249  */
    /* JADX WARN: Code duplicated, block: B:178:0x0260  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0108  */
    public static final void c(androidx.compose.ui.h hVar, LazyListState lazyListState, L l10, boolean z10, C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.ui.d.c cVar, androidx.compose.foundation.gestures.j jVar, boolean z11, E e10, final Ia.l<? super p, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        C0945e.InterfaceC0129e interfaceC0129e2;
        int i15;
        androidx.compose.ui.d.c cVar2;
        int i16;
        androidx.compose.foundation.gestures.j jVar2;
        int i17;
        int i18;
        int i19;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final LazyListState lazyListStateA;
        final L l11;
        final boolean z14;
        final C0945e.InterfaceC0129e interfaceC0129e3;
        final androidx.compose.ui.d.c cVar3;
        final androidx.compose.foundation.gestures.j jVar3;
        final boolean z15;
        final E e11;
        C1105p0 c1105p0V;
        L n10;
        androidx.compose.ui.d.c cVar4;
        androidx.compose.foundation.gestures.j jVar4;
        E eA;
        int i20;
        boolean z16;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(-1884325601);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= ((i11 & 2) == 0 && c1086gP.K(lazyListState)) ? 32 : 16;
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c1086gP.K(l10) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        interfaceC0129e2 = interfaceC0129e;
                        int i23 = c1086gP.K(interfaceC0129e2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        cVar2 = cVar;
                        if (c1086gP.K(cVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            jVar2 = jVar;
                            int i24 = c1086gP.K(jVar2) ? 1048576 : 524288;
                            i12 |= i24;
                        } else {
                            jVar2 = jVar;
                        }
                        i12 |= i24;
                    } else {
                        jVar2 = jVar;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.c(z11)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(lVar)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                            i12 |= i19;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c1086gP.C(i12 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i21 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if ((i11 & 2) != 0) {
                                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                                    i12 &= -113;
                                } else {
                                    lazyListStateA = lazyListState;
                                }
                                if (i22 != 0) {
                                    float f10 = 0;
                                    n10 = new N(f10, f10, f10, f10);
                                } else {
                                    n10 = l10;
                                }
                                if (i13 != 0) {
                                    z12 = false;
                                }
                                if ((i11 & 16) != 0) {
                                    if (z12) {
                                        interfaceC0129e3 = C0945e.f10285b;
                                    } else {
                                        interfaceC0129e3 = C0945e.f10284a;
                                    }
                                    i12 &= -57345;
                                } else {
                                    interfaceC0129e3 = interfaceC0129e2;
                                }
                                if (i15 != 0) {
                                    cVar4 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if ((i11 & 64) != 0) {
                                    interfaceC0918sA = C.a(c1086gP);
                                    zK = c1086gP.K(interfaceC0918sA);
                                    objF = c1086gP.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                        c1086gP.E(objF);
                                    }
                                    jVar4 = (androidx.compose.foundation.gestures.e) objF;
                                    i12 &= -3670017;
                                } else {
                                    jVar4 = jVar2;
                                }
                                boolean z17 = i17 == 0 ? z11 : true;
                                if ((i11 & 256) != 0) {
                                    eA = OverscrollKt.a(c1086gP);
                                    i12 &= -234881025;
                                } else {
                                    eA = e10;
                                }
                                i20 = i12;
                                z16 = z17;
                            } else {
                                c1086gP.w();
                                if ((i11 & 2) != 0) {
                                    i12 &= -113;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                hVar2 = hVar;
                                lazyListStateA = lazyListState;
                                n10 = l10;
                                eA = e10;
                                i20 = i12;
                                interfaceC0129e3 = interfaceC0129e2;
                                cVar4 = cVar2;
                                jVar4 = jVar2;
                                z16 = z11;
                            }
                            c1086gP.U();
                            int i25 = i20 >> 3;
                            LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                            z14 = z12;
                            z15 = z16;
                            l11 = n10;
                            cVar3 = cVar4;
                            jVar3 = jVar4;
                            e11 = eA;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            lazyListStateA = lazyListState;
                            l11 = l10;
                            z14 = z12;
                            interfaceC0129e3 = interfaceC0129e2;
                            cVar3 = cVar2;
                            jVar3 = jVar2;
                            z15 = z11;
                            e11 = e10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f11 = 0;
                                n10 = new N(f11, f11, f11, f11);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f12 = 0;
                                n10 = new N(f12, f12, f12, f12);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i26 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                cVar2 = cVar;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f13 = 0;
                                n10 = new N(f13, f13, f13, f13);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f14 = 0;
                                n10 = new N(f14, f14, f14, f14);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i27 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f15 = 0;
                            n10 = new N(f15, f15, f15, f15);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f16 = 0;
                            n10 = new N(f16, f16, f16, f16);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i28 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f17 = 0;
                                n10 = new N(f17, f17, f17, f17);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f18 = 0;
                                n10 = new N(f18, f18, f18, f18);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i29 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f19 = 0;
                            n10 = new N(f19, f19, f19, f19);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f110 = 0;
                            n10 = new N(f110, f110, f110, f110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i210 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i210) | (3670016 & i210) | (i210 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f111 = 0;
                            n10 = new N(f111, f111, f111, f111);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f112 = 0;
                            n10 = new N(f112, f112, f112, f112);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i211 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f113 = 0;
                        n10 = new N(f113, f113, f113, f113);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f114 = 0;
                        n10 = new N(f114, f114, f114, f114);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i212 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC0129e2 = interfaceC0129e;
                    if (c1086gP.K(interfaceC0129e2)) {
                    }
                    i12 |= i23;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
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
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(lVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i12 |= i19;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f115 = 0;
                                n10 = new N(f115, f115, f115, f115);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if ((i11 & 2) != 0) {
                                lazyListStateA = s.a(0, c1086gP, 0, 3);
                                i12 &= -113;
                            } else {
                                lazyListStateA = lazyListState;
                            }
                            if (i22 != 0) {
                                float f116 = 0;
                                n10 = new N(f116, f116, f116, f116);
                            } else {
                                n10 = l10;
                            }
                            if (i13 != 0) {
                                z12 = false;
                            }
                            if ((i11 & 16) != 0) {
                                if (z12) {
                                    interfaceC0129e3 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e3 = C0945e.f10285b;
                                }
                                i12 &= -57345;
                            } else {
                                interfaceC0129e3 = interfaceC0129e2;
                            }
                            if (i15 != 0) {
                                cVar4 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar4 = cVar2;
                            }
                            if ((i11 & 64) != 0) {
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
                                i12 &= -3670017;
                            } else {
                                jVar4 = jVar2;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 256) != 0) {
                                eA = OverscrollKt.a(c1086gP);
                                i12 &= -234881025;
                            } else {
                                eA = e10;
                            }
                            i20 = i12;
                            z16 = z17;
                        }
                        c1086gP.U();
                        int i213 = i20 >> 3;
                        LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                        z14 = z12;
                        z15 = z16;
                        l11 = n10;
                        cVar3 = cVar4;
                        jVar3 = jVar4;
                        e11 = eA;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        lazyListStateA = lazyListState;
                        l11 = l10;
                        z14 = z12;
                        interfaceC0129e3 = interfaceC0129e2;
                        cVar3 = cVar2;
                        jVar3 = jVar2;
                        z15 = z11;
                        e11 = e10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f117 = 0;
                            n10 = new N(f117, f117, f117, f117);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f118 = 0;
                            n10 = new N(f118, f118, f118, f118);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i214 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i214) | (3670016 & i214) | (i214 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f119 = 0;
                            n10 = new N(f119, f119, f119, f119);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1110 = 0;
                            n10 = new N(f1110, f1110, f1110, f1110);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i215 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1111 = 0;
                        n10 = new N(f1111, f1111, f1111, f1111);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1112 = 0;
                        n10 = new N(f1112, f1112, f1112, f1112);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i216 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i216) | (3670016 & i216) | (i216 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                interfaceC0129e2 = interfaceC0129e;
                if (c1086gP.K(interfaceC0129e2)) {
                }
                i12 |= i23;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            i12 |= i23;
        } else {
            interfaceC0129e2 = interfaceC0129e;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                cVar2 = cVar;
                if (c1086gP.K(cVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
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
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(lVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i12 |= i19;
                }
                if ((i12 & 306783379) != 306783378) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1113 = 0;
                            n10 = new N(f1113, f1113, f1113, f1113);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if ((i11 & 2) != 0) {
                            lazyListStateA = s.a(0, c1086gP, 0, 3);
                            i12 &= -113;
                        } else {
                            lazyListStateA = lazyListState;
                        }
                        if (i22 != 0) {
                            float f1114 = 0;
                            n10 = new N(f1114, f1114, f1114, f1114);
                        } else {
                            n10 = l10;
                        }
                        if (i13 != 0) {
                            z12 = false;
                        }
                        if ((i11 & 16) != 0) {
                            if (z12) {
                                interfaceC0129e3 = C0945e.f10284a;
                            } else {
                                interfaceC0129e3 = C0945e.f10285b;
                            }
                            i12 &= -57345;
                        } else {
                            interfaceC0129e3 = interfaceC0129e2;
                        }
                        if (i15 != 0) {
                            cVar4 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar4 = cVar2;
                        }
                        if ((i11 & 64) != 0) {
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
                            i12 &= -3670017;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 256) != 0) {
                            eA = OverscrollKt.a(c1086gP);
                            i12 &= -234881025;
                        } else {
                            eA = e10;
                        }
                        i20 = i12;
                        z16 = z17;
                    }
                    c1086gP.U();
                    int i217 = i20 >> 3;
                    LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i217) | (3670016 & i217) | (i217 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                    z14 = z12;
                    z15 = z16;
                    l11 = n10;
                    cVar3 = cVar4;
                    jVar3 = jVar4;
                    e11 = eA;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lazyListStateA = lazyListState;
                    l11 = l10;
                    z14 = z12;
                    interfaceC0129e3 = interfaceC0129e2;
                    cVar3 = cVar2;
                    jVar3 = jVar2;
                    z15 = z11;
                    e11 = e10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1115 = 0;
                        n10 = new N(f1115, f1115, f1115, f1115);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1116 = 0;
                        n10 = new N(f1116, f1116, f1116, f1116);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i218 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i218) | (3670016 & i218) | (i218 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        cVar2 = cVar;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
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
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.c(z11)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 256) == 0 || !c1086gP.K(e10)) ? 33554432 : 67108864;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(lVar)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i12 |= i19;
            }
            if ((i12 & 306783379) != 306783378) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1117 = 0;
                        n10 = new N(f1117, f1117, f1117, f1117);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if ((i11 & 2) != 0) {
                        lazyListStateA = s.a(0, c1086gP, 0, 3);
                        i12 &= -113;
                    } else {
                        lazyListStateA = lazyListState;
                    }
                    if (i22 != 0) {
                        float f1118 = 0;
                        n10 = new N(f1118, f1118, f1118, f1118);
                    } else {
                        n10 = l10;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    }
                    if ((i11 & 16) != 0) {
                        if (z12) {
                            interfaceC0129e3 = C0945e.f10284a;
                        } else {
                            interfaceC0129e3 = C0945e.f10285b;
                        }
                        i12 &= -57345;
                    } else {
                        interfaceC0129e3 = interfaceC0129e2;
                    }
                    if (i15 != 0) {
                        cVar4 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar4 = cVar2;
                    }
                    if ((i11 & 64) != 0) {
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
                        i12 &= -3670017;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 256) != 0) {
                        eA = OverscrollKt.a(c1086gP);
                        i12 &= -234881025;
                    } else {
                        eA = e10;
                    }
                    i20 = i12;
                    z16 = z17;
                }
                c1086gP.U();
                int i219 = i20 >> 3;
                LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i219) | (3670016 & i219) | (i219 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
                z14 = z12;
                z15 = z16;
                l11 = n10;
                cVar3 = cVar4;
                jVar3 = jVar4;
                e11 = eA;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lazyListStateA = lazyListState;
                l11 = l10;
                z14 = z12;
                interfaceC0129e3 = interfaceC0129e2;
                cVar3 = cVar2;
                jVar3 = jVar2;
                z15 = z11;
                e11 = e10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f1119 = 0;
                    n10 = new N(f1119, f1119, f1119, f1119);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = C0945e.f10285b;
                    }
                    i12 &= -57345;
                } else {
                    interfaceC0129e3 = interfaceC0129e2;
                }
                if (i15 != 0) {
                    cVar4 = androidx.compose.ui.d.a.j;
                } else {
                    cVar4 = cVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                if (i17 == 0) {
                }
                if ((i11 & 256) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i12 &= -234881025;
                } else {
                    eA = e10;
                }
                i20 = i12;
                z16 = z17;
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if ((i11 & 2) != 0) {
                    lazyListStateA = s.a(0, c1086gP, 0, 3);
                    i12 &= -113;
                } else {
                    lazyListStateA = lazyListState;
                }
                if (i22 != 0) {
                    float f11110 = 0;
                    n10 = new N(f11110, f11110, f11110, f11110);
                } else {
                    n10 = l10;
                }
                if (i13 != 0) {
                    z12 = false;
                }
                if ((i11 & 16) != 0) {
                    if (z12) {
                        interfaceC0129e3 = C0945e.f10284a;
                    } else {
                        interfaceC0129e3 = C0945e.f10285b;
                    }
                    i12 &= -57345;
                } else {
                    interfaceC0129e3 = interfaceC0129e2;
                }
                if (i15 != 0) {
                    cVar4 = androidx.compose.ui.d.a.j;
                } else {
                    cVar4 = cVar2;
                }
                if ((i11 & 64) != 0) {
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
                    i12 &= -3670017;
                } else {
                    jVar4 = jVar2;
                }
                if (i17 == 0) {
                }
                if ((i11 & 256) != 0) {
                    eA = OverscrollKt.a(c1086gP);
                    i12 &= -234881025;
                } else {
                    eA = e10;
                }
                i20 = i12;
                z16 = z17;
            }
            c1086gP.U();
            int i2110 = i20 >> 3;
            LazyListKt.a(hVar2, lazyListStateA, n10, z12, false, jVar4, z16, eA, 0, null, null, cVar4, interfaceC0129e3, lVar, c1086gP, (i20 & 14) | 24576 | (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i20 & 896) | (i20 & 7168) | (458752 & i2110) | (3670016 & i2110) | (i2110 & 29360128), ((i20 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i20 >> 6) & 896) | ((i20 >> 18) & 7168), 1792);
            z14 = z12;
            z15 = z16;
            l11 = n10;
            cVar3 = cVar4;
            jVar3 = jVar4;
            e11 = eA;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            lazyListStateA = lazyListState;
            l11 = l10;
            z14 = z12;
            interfaceC0129e3 = interfaceC0129e2;
            cVar3 = cVar2;
            jVar3 = jVar2;
            z15 = z11;
            e11 = e10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyDslKt.c(hVar2, lazyListStateA, l11, z14, interfaceC0129e3, cVar3, jVar3, z15, e11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
