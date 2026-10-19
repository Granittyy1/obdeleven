package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.C;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.foundation.E;
import androidx.compose.foundation.K;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.C0974i;
import androidx.compose.foundation.lazy.layout.C0977l;
import androidx.compose.foundation.lazy.layout.InterfaceC0988x;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1108r0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0122  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0133  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x013e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x0147  */
    /* JADX WARN: Code duplicated, block: B:119:0x014c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0152  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155  */
    /* JADX WARN: Code duplicated, block: B:125:0x0159  */
    /* JADX WARN: Code duplicated, block: B:127:0x015f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0162  */
    /* JADX WARN: Code duplicated, block: B:132:0x0173  */
    /* JADX WARN: Code duplicated, block: B:136:0x017a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0184  */
    /* JADX WARN: Code duplicated, block: B:141:0x018d  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0200  */
    /* JADX WARN: Code duplicated, block: B:175:0x020c  */
    /* JADX WARN: Code duplicated, block: B:178:0x022c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0232  */
    /* JADX WARN: Code duplicated, block: B:186:0x0240 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0242  */
    /* JADX WARN: Code duplicated, block: B:190:0x0271  */
    /* JADX WARN: Code duplicated, block: B:193:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:195:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:217:0x0300  */
    /* JADX WARN: Code duplicated, block: B:219:0x0306  */
    /* JADX WARN: Code duplicated, block: B:225:0x0318  */
    /* JADX WARN: Code duplicated, block: B:227:0x031e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0330  */
    /* JADX WARN: Code duplicated, block: B:235:0x0336  */
    /* JADX WARN: Code duplicated, block: B:241:0x0348  */
    /* JADX WARN: Code duplicated, block: B:243:0x034e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:252:0x0374  */
    /* JADX WARN: Code duplicated, block: B:255:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:263:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:271:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:274:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:278:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:280:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:282:0x0402  */
    /* JADX WARN: Code duplicated, block: B:288:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0412  */
    /* JADX WARN: Code duplicated, block: B:292:0x0428  */
    /* JADX WARN: Code duplicated, block: B:294:0x048a  */
    /* JADX WARN: Code duplicated, block: B:297:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    public static final void a(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final a aVar, androidx.compose.ui.h hVar, L l10, boolean z10, androidx.compose.foundation.gestures.j jVar, boolean z11, final E e10, float f10, float f11, final Ia.l<? super q, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
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
        boolean z13;
        C1086g c1086g;
        final androidx.compose.ui.h hVar2;
        final L l11;
        final boolean z14;
        final float f12;
        float f13;
        final boolean z15;
        final androidx.compose.foundation.gestures.j jVar2;
        C1105p0 c1105p0V;
        int i27;
        InterfaceC1084f.a.C0153a c0153a;
        L n10;
        androidx.compose.foundation.gestures.j jVar3;
        boolean z16;
        float f14;
        final L l12;
        boolean z17;
        InterfaceC0918s interfaceC0918sA;
        boolean zK;
        Object objF;
        int i28;
        final X xI;
        boolean z18;
        Object objF2;
        final Oa.i iVar;
        Object objF3;
        final A a10;
        final S s10;
        boolean zK2;
        Object objF4;
        final boolean z19;
        boolean z20;
        boolean z21;
        Object objF5;
        InterfaceC1084f.a.C0153a c0153a2;
        androidx.compose.ui.h hVarA;
        boolean z22;
        Object objF6;
        int i29;
        C1086g c1086gP = interfaceC1084f.p(-1904835166);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.K(lazyStaggeredGridState) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c1086gP.K(orientation) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= (i10 & 512) == 0 ? c1086gP.K(aVar) : c1086gP.k(aVar) ? 256 : 128;
        }
        int i30 = i12 & 8;
        if (i30 == 0) {
            if ((i10 & 3072) == 0) {
                i13 |= c1086gP.K(hVar) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(l10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= 196608;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i10 & 196608) == 0) {
                        if (c1086gP.c(z12)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0 || !c1086gP.K(jVar)) {
                        i29 = 524288;
                    } else {
                        i29 = 1048576;
                    }
                    i13 |= i29;
                }
                i18 = i12 & 128;
                if (i18 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.c(z11)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(e10)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 512;
                    if (i21 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.g(f10)) {
                            i22 = 536870912;
                        } else {
                            i22 = 268435456;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 1024;
                    if (i23 != 0) {
                        i24 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.g(f11)) {
                            i25 = 4;
                        } else {
                            i25 = 2;
                        }
                        i24 = i11 | i25;
                    } else {
                        i24 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i24 |= 48;
                    } else if ((i11 & 48) == 0) {
                        if (c1086gP.k(lVar)) {
                            i26 = 32;
                        } else {
                            i26 = 16;
                        }
                        i24 |= i26;
                    }
                    if ((306783379 & i13) == 306783378 || (i24 & 19) != 18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        i27 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i27 != 0 || c1086gP.a0()) {
                            if (i30 != 0) {
                                hVar = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar = hVar;
                            }
                            if (i14 != 0) {
                                float f15 = 0;
                                n10 = new N(f15, f15, f15, f15);
                            } else {
                                n10 = l10;
                            }
                            if (i16 != 0) {
                                z12 = false;
                            }
                            if ((i12 & 64) != 0) {
                                interfaceC0918sA = C.a(c1086gP);
                                zK = c1086gP.K(interfaceC0918sA);
                                objF = c1086gP.f();
                                if (zK || objF == c0153a) {
                                    objF = new androidx.compose.foundation.gestures.e(interfaceC0918sA);
                                    c1086gP.E(objF);
                                }
                                jVar3 = (androidx.compose.foundation.gestures.e) objF;
                                i13 &= -3670017;
                            } else {
                                jVar3 = jVar;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if (i21 != 0) {
                                f14 = 0;
                            } else {
                                f14 = f10;
                            }
                            if (i23 != 0) {
                                f13 = 0;
                            } else {
                                f13 = f11;
                            }
                            l12 = n10;
                            z17 = z12;
                        } else {
                            c1086gP.w();
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            l12 = l10;
                            jVar3 = jVar;
                            z16 = z11;
                            f14 = f10;
                            f13 = f11;
                            i13 = i13;
                            z17 = z12;
                        }
                        androidx.compose.ui.h hVar3 = hVar;
                        c1086gP.U();
                        i28 = i13 & 14;
                        int i31 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        xI = J0.i(lVar, c1086gP);
                        z18 = (((i31 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i31 & 6) == 4;
                        objF2 = c1086gP.f();
                        if (z18 || objF2 == c0153a) {
                            C1108r0 c1108r0 = C1108r0.f13116a;
                            final DerivedSnapshotState derivedSnapshotStateE = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final d invoke() {
                                    return new d(xI.getValue());
                                }
                            }, c1108r0);
                            objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final g invoke() {
                                    d value = derivedSnapshotStateE.getValue();
                                    return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                                }
                            }, c1108r0), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                            c1086gP.E(objF2);
                        }
                        iVar = (Oa.i) objF2;
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF3);
                        }
                        a10 = (A) objF3;
                        s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                        int i32 = i13 >> 6;
                        int i33 = i13 >> 12;
                        int i34 = (i32 & 7168) | i28 | (i32 & 896) | ((i13 << 9) & 57344) | (i33 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                        zK2 = ((((234881024 & i34) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i34 & 100663296) == 67108864) | ((((i34 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i34 & 6) == 4) | c1086gP.K(iVar) | ((((i34 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i34 & 384) == 256) | ((((i34 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i34 & 3072) == 2048) | ((((i34 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i34 & 24576) == 16384) | ((((458752 & i34) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i34 & 196608) == 131072) | ((((3670016 & i34) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i34 & 1572864) == 1048576) | c1086gP.K(s10);
                        objF4 = c1086gP.f();
                        if (!zK2 || objF4 == c0153a) {
                            f12 = f14;
                            z19 = z17;
                            c1086g = c1086gP;
                            Ia.p<InterfaceC0988x, p013b0.a, n> pVar = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.p
                                public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                    float fA;
                                    float fD;
                                    float fD2;
                                    long j;
                                    long j10;
                                    boolean z23;
                                    int iC;
                                    InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                    long j11 = aVar2.f20475a;
                                    lazyStaggeredGridState.f10809v.getValue();
                                    boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                    Lb.a.b(j11, orientation);
                                    u uVarA = aVar.a(interfaceC0988x2, j11);
                                    boolean z25 = orientation == Orientation.f9957b;
                                    f fVarInvoke = iVar.invoke();
                                    L l13 = l12;
                                    Orientation orientation2 = orientation;
                                    boolean z26 = z19;
                                    LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                    int iOrdinal = orientation2.ordinal();
                                    if (iOrdinal == 0) {
                                        fA = z26 ? l13.a() : l13.d();
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                    }
                                    int iE1 = interfaceC0988x2.e1(fA);
                                    L l14 = l12;
                                    Orientation orientation3 = orientation;
                                    boolean z27 = z19;
                                    LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                    int iOrdinal2 = orientation3.ordinal();
                                    if (iOrdinal2 == 0) {
                                        fD = z27 ? l14.d() : l14.a();
                                    } else {
                                        if (iOrdinal2 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                    }
                                    int iE2 = interfaceC0988x2.e1(fD);
                                    L l15 = l12;
                                    Orientation orientation4 = orientation;
                                    LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                    int iOrdinal3 = orientation4.ordinal();
                                    if (iOrdinal3 == 0) {
                                        fD2 = PaddingKt.d(l15, layoutDirection3);
                                    } else {
                                        if (iOrdinal3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fD2 = l15.d();
                                    }
                                    int iE3 = interfaceC0988x2.e1(fD2);
                                    int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                    if (z25) {
                                        j = ((long) iE3) << 32;
                                        j10 = iE1;
                                    } else {
                                        j = ((long) iE1) << 32;
                                        j10 = iE3;
                                    }
                                    long j12 = j | (j10 & 4294967295L);
                                    L l16 = l12;
                                    int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                    L l17 = l12;
                                    int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                    LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                    List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                    long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                    int iE6 = interfaceC0988x2.e1(f12);
                                    boolean zS0 = interfaceC0988x2.S0();
                                    LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                    l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                    r rVar = lazyStaggeredGridState3.f10791c;
                                    int[] iArr = rVar.f10888b;
                                    Object obj = rVar.f10893g;
                                    kotlin.jvm.internal.i.e(iArr, "<this>");
                                    Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                    int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                    int length = iArr.length;
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 >= length) {
                                            i35 = -1;
                                            break;
                                        }
                                        if (iK == iArr[i35]) {
                                            break;
                                        }
                                        i35++;
                                    }
                                    if (!(i35 >= 0)) {
                                        rVar.f10894h.e(iK);
                                        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                        try {
                                            iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                            rVar.f10888b = iArr;
                                            rVar.f10889c.m(r.a(iArr));
                                        } catch (Throwable th) {
                                            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                            throw th;
                                        }
                                    }
                                    int[] iArr2 = rVar.f10890d;
                                    int length2 = iArr.length;
                                    int i36 = lVar2.f10841t;
                                    if (length2 == i36) {
                                        z23 = true;
                                    } else {
                                        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                        lazyStaggeredGridLaneInfo.g();
                                        int[] iArr3 = new int[i36];
                                        for (int i37 = 0; i37 < i36; i37++) {
                                            if (i37 >= iArr.length || (iC = iArr[i37]) == -1) {
                                                if (i37 == 0) {
                                                    iC = 0;
                                                } else {
                                                    iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i37) & 4294967295L)) + 1;
                                                }
                                            }
                                            iArr3[i37] = iC;
                                            lazyStaggeredGridLaneInfo.h(iC, i37);
                                        }
                                        z23 = true;
                                        iArr = iArr3;
                                    }
                                    if (iArr2.length != i36) {
                                        int[] iArr4 = new int[i36];
                                        int i38 = 0;
                                        while (i38 < i36) {
                                            iArr4[i38] = i38 < iArr2.length ? iArr2[i38] : i38 == 0 ? 0 : iArr4[i38 - 1];
                                            i38++;
                                        }
                                        iArr2 = iArr4;
                                    }
                                    n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                    lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                    return nVarD;
                                }
                            };
                            c1086g.E(pVar);
                            objF4 = pVar;
                        } else {
                            f12 = f14;
                            z19 = z17;
                            c1086g = c1086gP;
                        }
                        Ia.p pVar2 = (Ia.p) objF4;
                        int i35 = i28 | (i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        z20 = z19;
                        z21 = ((((i35 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i35 & 48) == 32) | ((((i35 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i35 & 6) == 4);
                        objF5 = c1086g.f();
                        if (z21) {
                            c0153a2 = c0153a;
                        } else {
                            c0153a2 = c0153a;
                            if (objF5 == c0153a2) {
                            }
                            s sVar = (s) objF5;
                            if (z16) {
                                c1086g.L(1913386186);
                                z22 = ((i28 ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i13 & 6) == 4;
                                objF6 = c1086g.f();
                                if (z22 || objF6 == c0153a2) {
                                    objF6 = new b(lazyStaggeredGridState);
                                    c1086g.E(objF6);
                                }
                                hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                                c1086g.T(false);
                            } else {
                                c1086g.L(1913691040);
                                c1086g.T(false);
                                hVarA = androidx.compose.ui.h.a.f13984b;
                            }
                            LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar3.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar2, c1086g, 0, 0);
                            jVar2 = jVar3;
                            l11 = l12;
                            hVar2 = hVar3;
                            z15 = z20;
                            z14 = z16;
                        }
                        objF5 = new s(lazyStaggeredGridState);
                        c1086g.E(objF5);
                        s sVar2 = (s) objF5;
                        if (z16) {
                            c1086g.L(1913386186);
                            if ((i28 ^ 6) <= 4) {
                            }
                            objF6 = c1086g.f();
                            if (z22) {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            } else {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            }
                            hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                            c1086g.T(false);
                        } else {
                            c1086g.L(1913691040);
                            c1086g.T(false);
                            hVarA = androidx.compose.ui.h.a.f13984b;
                        }
                        LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar3.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar2, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar2, c1086g, 0, 0);
                        jVar2 = jVar3;
                        l11 = l12;
                        hVar2 = hVar3;
                        z15 = z20;
                        z14 = z16;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        hVar2 = hVar;
                        l11 = l10;
                        z14 = z11;
                        f12 = f10;
                        f13 = f11;
                        z15 = z12;
                        jVar2 = jVar;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        final float f16 = f12;
                        final float f17 = f13;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f16, f17, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 100663296;
                i21 = i12 & 512;
                if (i21 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.g(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.g(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c1086gP.k(lVar)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                if ((306783379 & i13) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    i27 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i27 != 0) {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f18 = 0;
                            n10 = new N(f18, f18, f18, f18);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    } else {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f19 = 0;
                            n10 = new N(f19, f19, f19, f19);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    }
                    androidx.compose.ui.h hVar4 = hVar;
                    c1086gP.U();
                    i28 = i13 & 14;
                    int i36 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar, c1086gP);
                    if (((i36 & 14) ^ 6) <= 4) {
                    }
                    objF2 = c1086gP.f();
                    if (z18) {
                        C1108r0 c1108r1 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE2 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r1);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE2.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r1), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    } else {
                        C1108r0 c1108r2 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE3 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r2);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE3.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r2), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    }
                    iVar = (Oa.i) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    int i37 = i13 >> 6;
                    int i38 = i13 >> 12;
                    int i39 = (i37 & 7168) | i28 | (i37 & 896) | ((i13 << 9) & 57344) | (i38 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                    zK2 = ((((234881024 & i39) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i39 & 100663296) == 67108864) | ((((i39 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i39 & 6) == 4) | c1086gP.K(iVar) | ((((i39 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i39 & 384) == 256) | ((((i39 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i39 & 3072) == 2048) | ((((i39 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i39 & 24576) == 16384) | ((((458752 & i39) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i39 & 196608) == 131072) | ((((3670016 & i39) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i39 & 1572864) == 1048576) | c1086gP.K(s10);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar3 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i310 = 0;
                                while (true) {
                                    if (i310 >= length) {
                                        i310 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i310]) {
                                        break;
                                    }
                                    i310++;
                                }
                                if (!(i310 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i311 = lVar2.f10841t;
                                if (length2 == i311) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i311];
                                    for (int i312 = 0; i312 < i311; i312++) {
                                        if (i312 >= iArr.length || (iC = iArr[i312]) == -1) {
                                            if (i312 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i312) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i312] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i312);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i311) {
                                    int[] iArr4 = new int[i311];
                                    int i313 = 0;
                                    while (i313 < i311) {
                                        iArr4[i313] = i313 < iArr2.length ? iArr2[i313] : i313 == 0 ? 0 : iArr4[i313 - 1];
                                        i313++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar3);
                        objF4 = pVar3;
                    } else {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar4 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i310 = 0;
                                while (true) {
                                    if (i310 >= length) {
                                        i310 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i310]) {
                                        break;
                                    }
                                    i310++;
                                }
                                if (!(i310 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i311 = lVar2.f10841t;
                                if (length2 == i311) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i311];
                                    for (int i312 = 0; i312 < i311; i312++) {
                                        if (i312 >= iArr.length || (iC = iArr[i312]) == -1) {
                                            if (i312 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i312) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i312] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i312);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i311) {
                                    int[] iArr4 = new int[i311];
                                    int i313 = 0;
                                    while (i313 < i311) {
                                        iArr4[i313] = i313 < iArr2.length ? iArr2[i313] : i313 == 0 ? 0 : iArr4[i313 - 1];
                                        i313++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar4);
                        objF4 = pVar4;
                    }
                    Ia.p pVar5 = (Ia.p) objF4;
                    int i310 = i28 | (i38 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i310 & 14) ^ 6) <= 4) {
                    }
                    z20 = z19;
                    z21 = ((((i310 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i310 & 48) == 32) | ((((i310 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i310 & 6) == 4);
                    objF5 = c1086g.f();
                    if (z21) {
                        c0153a2 = c0153a;
                        if (objF5 == c0153a2) {
                        }
                        s sVar3 = (s) objF5;
                        if (z16) {
                            c1086g.L(1913386186);
                            if ((i28 ^ 6) <= 4) {
                            }
                            objF6 = c1086g.f();
                            if (z22) {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            } else {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            }
                            hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                            c1086g.T(false);
                        } else {
                            c1086g.L(1913691040);
                            c1086g.T(false);
                            hVarA = androidx.compose.ui.h.a.f13984b;
                        }
                        LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar4.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar3, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar5, c1086g, 0, 0);
                        jVar2 = jVar3;
                        l11 = l12;
                        hVar2 = hVar4;
                        z15 = z20;
                        z14 = z16;
                    } else {
                        c0153a2 = c0153a;
                    }
                    objF5 = new s(lazyStaggeredGridState);
                    c1086g.E(objF5);
                    s sVar4 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar4.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar4, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar5, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar4;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    l11 = l10;
                    z14 = z11;
                    f12 = f10;
                    f13 = f11;
                    z15 = z12;
                    jVar2 = jVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final float f110 = f12;
                    final float f111 = f13;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f110, f111, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 196608;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(e10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.g(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.g(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c1086gP.k(lVar)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                if ((306783379 & i13) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    i27 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i27 != 0) {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f112 = 0;
                            n10 = new N(f112, f112, f112, f112);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    } else {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f113 = 0;
                            n10 = new N(f113, f113, f113, f113);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    }
                    androidx.compose.ui.h hVar5 = hVar;
                    c1086gP.U();
                    i28 = i13 & 14;
                    int i311 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar, c1086gP);
                    if (((i311 & 14) ^ 6) <= 4) {
                    }
                    objF2 = c1086gP.f();
                    if (z18) {
                        C1108r0 c1108r3 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE4 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r3);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE4.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r3), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    } else {
                        C1108r0 c1108r4 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE5 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r4);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE5.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r4), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    }
                    iVar = (Oa.i) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    int i312 = i13 >> 6;
                    int i313 = i13 >> 12;
                    int i314 = (i312 & 7168) | i28 | (i312 & 896) | ((i13 << 9) & 57344) | (i313 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                    zK2 = ((((234881024 & i314) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i314 & 100663296) == 67108864) | ((((i314 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i314 & 6) == 4) | c1086gP.K(iVar) | ((((i314 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i314 & 384) == 256) | ((((i314 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i314 & 3072) == 2048) | ((((i314 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i314 & 24576) == 16384) | ((((458752 & i314) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i314 & 196608) == 131072) | ((((3670016 & i314) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i314 & 1572864) == 1048576) | c1086gP.K(s10);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar6 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i315 = 0;
                                while (true) {
                                    if (i315 >= length) {
                                        i315 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i315]) {
                                        break;
                                    }
                                    i315++;
                                }
                                if (!(i315 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i316 = lVar2.f10841t;
                                if (length2 == i316) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i316];
                                    for (int i317 = 0; i317 < i316; i317++) {
                                        if (i317 >= iArr.length || (iC = iArr[i317]) == -1) {
                                            if (i317 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i317) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i317] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i317);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i316) {
                                    int[] iArr4 = new int[i316];
                                    int i318 = 0;
                                    while (i318 < i316) {
                                        iArr4[i318] = i318 < iArr2.length ? iArr2[i318] : i318 == 0 ? 0 : iArr4[i318 - 1];
                                        i318++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar6);
                        objF4 = pVar6;
                    } else {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar7 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i315 = 0;
                                while (true) {
                                    if (i315 >= length) {
                                        i315 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i315]) {
                                        break;
                                    }
                                    i315++;
                                }
                                if (!(i315 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i316 = lVar2.f10841t;
                                if (length2 == i316) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i316];
                                    for (int i317 = 0; i317 < i316; i317++) {
                                        if (i317 >= iArr.length || (iC = iArr[i317]) == -1) {
                                            if (i317 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i317) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i317] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i317);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i316) {
                                    int[] iArr4 = new int[i316];
                                    int i318 = 0;
                                    while (i318 < i316) {
                                        iArr4[i318] = i318 < iArr2.length ? iArr2[i318] : i318 == 0 ? 0 : iArr4[i318 - 1];
                                        i318++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar7);
                        objF4 = pVar7;
                    }
                    Ia.p pVar8 = (Ia.p) objF4;
                    int i315 = i28 | (i313 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i315 & 14) ^ 6) <= 4) {
                    }
                    z20 = z19;
                    z21 = ((((i315 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i315 & 48) == 32) | ((((i315 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i315 & 6) == 4);
                    objF5 = c1086g.f();
                    if (z21) {
                        c0153a2 = c0153a;
                        if (objF5 == c0153a2) {
                        }
                        s sVar5 = (s) objF5;
                        if (z16) {
                            c1086g.L(1913386186);
                            if ((i28 ^ 6) <= 4) {
                            }
                            objF6 = c1086g.f();
                            if (z22) {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            } else {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            }
                            hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                            c1086g.T(false);
                        } else {
                            c1086g.L(1913691040);
                            c1086g.T(false);
                            hVarA = androidx.compose.ui.h.a.f13984b;
                        }
                        LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar5.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar5, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar8, c1086g, 0, 0);
                        jVar2 = jVar3;
                        l11 = l12;
                        hVar2 = hVar5;
                        z15 = z20;
                        z14 = z16;
                    } else {
                        c0153a2 = c0153a;
                    }
                    objF5 = new s(lazyStaggeredGridState);
                    c1086g.E(objF5);
                    s sVar6 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar5.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar6, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar8, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar5;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    l11 = l10;
                    z14 = z11;
                    f12 = f10;
                    f13 = f11;
                    z15 = z12;
                    jVar2 = jVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final float f114 = f12;
                    final float f115 = f13;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f114, f115, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 100663296;
            i21 = i12 & 512;
            if (i21 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.g(f10)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.g(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(lVar)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            if ((306783379 & i13) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                i27 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i27 != 0) {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f116 = 0;
                        n10 = new N(f116, f116, f116, f116);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                } else {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f117 = 0;
                        n10 = new N(f117, f117, f117, f117);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                }
                androidx.compose.ui.h hVar6 = hVar;
                c1086gP.U();
                i28 = i13 & 14;
                int i316 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar, c1086gP);
                if (((i316 & 14) ^ 6) <= 4) {
                }
                objF2 = c1086gP.f();
                if (z18) {
                    C1108r0 c1108r5 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE6 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r5);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE6.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r5), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                } else {
                    C1108r0 c1108r6 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE7 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r6);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE7.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r6), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                }
                iVar = (Oa.i) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                int i317 = i13 >> 6;
                int i318 = i13 >> 12;
                int i319 = (i317 & 7168) | i28 | (i317 & 896) | ((i13 << 9) & 57344) | (i318 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                zK2 = ((((234881024 & i319) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i319 & 100663296) == 67108864) | ((((i319 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i319 & 6) == 4) | c1086gP.K(iVar) | ((((i319 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i319 & 384) == 256) | ((((i319 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i319 & 3072) == 2048) | ((((i319 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i319 & 24576) == 16384) | ((((458752 & i319) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i319 & 196608) == 131072) | ((((3670016 & i319) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i319 & 1572864) == 1048576) | c1086gP.K(s10);
                objF4 = c1086gP.f();
                if (zK2) {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar9 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i3110 = 0;
                            while (true) {
                                if (i3110 >= length) {
                                    i3110 = -1;
                                    break;
                                }
                                if (iK == iArr[i3110]) {
                                    break;
                                }
                                i3110++;
                            }
                            if (!(i3110 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i3111 = lVar2.f10841t;
                            if (length2 == i3111) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i3111];
                                for (int i3112 = 0; i3112 < i3111; i3112++) {
                                    if (i3112 >= iArr.length || (iC = iArr[i3112]) == -1) {
                                        if (i3112 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i3112) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i3112] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i3112);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i3111) {
                                int[] iArr4 = new int[i3111];
                                int i3113 = 0;
                                while (i3113 < i3111) {
                                    iArr4[i3113] = i3113 < iArr2.length ? iArr2[i3113] : i3113 == 0 ? 0 : iArr4[i3113 - 1];
                                    i3113++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar9);
                    objF4 = pVar9;
                } else {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar10 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i3110 = 0;
                            while (true) {
                                if (i3110 >= length) {
                                    i3110 = -1;
                                    break;
                                }
                                if (iK == iArr[i3110]) {
                                    break;
                                }
                                i3110++;
                            }
                            if (!(i3110 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i3111 = lVar2.f10841t;
                            if (length2 == i3111) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i3111];
                                for (int i3112 = 0; i3112 < i3111; i3112++) {
                                    if (i3112 >= iArr.length || (iC = iArr[i3112]) == -1) {
                                        if (i3112 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i3112) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i3112] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i3112);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i3111) {
                                int[] iArr4 = new int[i3111];
                                int i3113 = 0;
                                while (i3113 < i3111) {
                                    iArr4[i3113] = i3113 < iArr2.length ? iArr2[i3113] : i3113 == 0 ? 0 : iArr4[i3113 - 1];
                                    i3113++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar10);
                    objF4 = pVar10;
                }
                Ia.p pVar11 = (Ia.p) objF4;
                int i3110 = i28 | (i318 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i3110 & 14) ^ 6) <= 4) {
                }
                z20 = z19;
                z21 = ((((i3110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i3110 & 48) == 32) | ((((i3110 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i3110 & 6) == 4);
                objF5 = c1086g.f();
                if (z21) {
                    c0153a2 = c0153a;
                    if (objF5 == c0153a2) {
                    }
                    s sVar7 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar6.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar7, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar11, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar6;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c0153a2 = c0153a;
                }
                objF5 = new s(lazyStaggeredGridState);
                c1086g.E(objF5);
                s sVar8 = (s) objF5;
                if (z16) {
                    c1086g.L(1913386186);
                    if ((i28 ^ 6) <= 4) {
                    }
                    objF6 = c1086g.f();
                    if (z22) {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    } else {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    }
                    hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                    c1086g.T(false);
                } else {
                    c1086g.L(1913691040);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar6.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar8, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar11, c1086g, 0, 0);
                jVar2 = jVar3;
                l11 = l12;
                hVar2 = hVar6;
                z15 = z20;
                z14 = z16;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                l11 = l10;
                z14 = z11;
                f12 = f10;
                f13 = f11;
                z15 = z12;
                jVar2 = jVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final float f118 = f12;
                final float f119 = f13;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f118, f119, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.K(l10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 196608;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            }
            i18 = i12 & 128;
            if (i18 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.c(z11)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(e10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.g(f10)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 1024;
                if (i23 != 0) {
                    i24 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.g(f11)) {
                        i25 = 4;
                    } else {
                        i25 = 2;
                    }
                    i24 = i11 | i25;
                } else {
                    i24 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i24 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c1086gP.k(lVar)) {
                        i26 = 32;
                    } else {
                        i26 = 16;
                    }
                    i24 |= i26;
                }
                if ((306783379 & i13) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    i27 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i27 != 0) {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f1110 = 0;
                            n10 = new N(f1110, f1110, f1110, f1110);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    } else {
                        if (i30 != 0) {
                            hVar = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar = hVar;
                        }
                        if (i14 != 0) {
                            float f1111 = 0;
                            n10 = new N(f1111, f1111, f1111, f1111);
                        } else {
                            n10 = l10;
                        }
                        if (i16 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 64) != 0) {
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
                            jVar3 = (androidx.compose.foundation.gestures.e) objF;
                            i13 &= -3670017;
                        } else {
                            jVar3 = jVar;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if (i21 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f10;
                        }
                        if (i23 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f11;
                        }
                        l12 = n10;
                        z17 = z12;
                    }
                    androidx.compose.ui.h hVar7 = hVar;
                    c1086gP.U();
                    i28 = i13 & 14;
                    int i3111 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    xI = J0.i(lVar, c1086gP);
                    if (((i3111 & 14) ^ 6) <= 4) {
                    }
                    objF2 = c1086gP.f();
                    if (z18) {
                        C1108r0 c1108r7 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE8 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r7);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE8.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r7), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    } else {
                        C1108r0 c1108r8 = C1108r0.f13116a;
                        final DerivedSnapshotState derivedSnapshotStateE9 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final d invoke() {
                                return new d(xI.getValue());
                            }
                        }, c1108r8);
                        objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final g invoke() {
                                d value = derivedSnapshotStateE9.getValue();
                                return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                            }
                        }, c1108r8), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                        c1086gP.E(objF2);
                    }
                    iVar = (Oa.i) objF2;
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF3);
                    }
                    a10 = (A) objF3;
                    s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                    int i3112 = i13 >> 6;
                    int i3113 = i13 >> 12;
                    int i3114 = (i3112 & 7168) | i28 | (i3112 & 896) | ((i13 << 9) & 57344) | (i3113 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                    zK2 = ((((234881024 & i3114) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i3114 & 100663296) == 67108864) | ((((i3114 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i3114 & 6) == 4) | c1086gP.K(iVar) | ((((i3114 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i3114 & 384) == 256) | ((((i3114 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i3114 & 3072) == 2048) | ((((i3114 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i3114 & 24576) == 16384) | ((((458752 & i3114) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i3114 & 196608) == 131072) | ((((3670016 & i3114) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i3114 & 1572864) == 1048576) | c1086gP.K(s10);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar12 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i3115 = 0;
                                while (true) {
                                    if (i3115 >= length) {
                                        i3115 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i3115]) {
                                        break;
                                    }
                                    i3115++;
                                }
                                if (!(i3115 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i3116 = lVar2.f10841t;
                                if (length2 == i3116) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i3116];
                                    for (int i3117 = 0; i3117 < i3116; i3117++) {
                                        if (i3117 >= iArr.length || (iC = iArr[i3117]) == -1) {
                                            if (i3117 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i3117) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i3117] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i3117);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i3116) {
                                    int[] iArr4 = new int[i3116];
                                    int i3118 = 0;
                                    while (i3118 < i3116) {
                                        iArr4[i3118] = i3118 < iArr2.length ? iArr2[i3118] : i3118 == 0 ? 0 : iArr4[i3118 - 1];
                                        i3118++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar12);
                        objF4 = pVar12;
                    } else {
                        f12 = f14;
                        z19 = z17;
                        c1086g = c1086gP;
                        Ia.p<InterfaceC0988x, p013b0.a, n> pVar13 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.p
                            public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                                float fA;
                                float fD;
                                float fD2;
                                long j;
                                long j10;
                                boolean z23;
                                int iC;
                                InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                                long j11 = aVar2.f20475a;
                                lazyStaggeredGridState.f10809v.getValue();
                                boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                                Lb.a.b(j11, orientation);
                                u uVarA = aVar.a(interfaceC0988x2, j11);
                                boolean z25 = orientation == Orientation.f9957b;
                                f fVarInvoke = iVar.invoke();
                                L l13 = l12;
                                Orientation orientation2 = orientation;
                                boolean z26 = z19;
                                LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal = orientation2.ordinal();
                                if (iOrdinal == 0) {
                                    fA = z26 ? l13.a() : l13.d();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                                }
                                int iE1 = interfaceC0988x2.e1(fA);
                                L l14 = l12;
                                Orientation orientation3 = orientation;
                                boolean z27 = z19;
                                LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal2 = orientation3.ordinal();
                                if (iOrdinal2 == 0) {
                                    fD = z27 ? l14.d() : l14.a();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                                }
                                int iE2 = interfaceC0988x2.e1(fD);
                                L l15 = l12;
                                Orientation orientation4 = orientation;
                                LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                                int iOrdinal3 = orientation4.ordinal();
                                if (iOrdinal3 == 0) {
                                    fD2 = PaddingKt.d(l15, layoutDirection3);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fD2 = l15.d();
                                }
                                int iE3 = interfaceC0988x2.e1(fD2);
                                int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                                if (z25) {
                                    j = ((long) iE3) << 32;
                                    j10 = iE1;
                                } else {
                                    j = ((long) iE1) << 32;
                                    j10 = iE3;
                                }
                                long j12 = j | (j10 & 4294967295L);
                                L l16 = l12;
                                int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                                L l17 = l12;
                                int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                                LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                                List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                                long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                                int iE6 = interfaceC0988x2.e1(f12);
                                boolean zS0 = interfaceC0988x2.S0();
                                LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                                l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                                r rVar = lazyStaggeredGridState3.f10791c;
                                int[] iArr = rVar.f10888b;
                                Object obj = rVar.f10893g;
                                kotlin.jvm.internal.i.e(iArr, "<this>");
                                Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                                int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                                int length = iArr.length;
                                int i3115 = 0;
                                while (true) {
                                    if (i3115 >= length) {
                                        i3115 = -1;
                                        break;
                                    }
                                    if (iK == iArr[i3115]) {
                                        break;
                                    }
                                    i3115++;
                                }
                                if (!(i3115 >= 0)) {
                                    rVar.f10894h.e(iK);
                                    androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                    Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                    androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                    try {
                                        iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        rVar.f10888b = iArr;
                                        rVar.f10889c.m(r.a(iArr));
                                    } catch (Throwable th) {
                                        androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                        throw th;
                                    }
                                }
                                int[] iArr2 = rVar.f10890d;
                                int length2 = iArr.length;
                                int i3116 = lVar2.f10841t;
                                if (length2 == i3116) {
                                    z23 = true;
                                } else {
                                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                    lazyStaggeredGridLaneInfo.g();
                                    int[] iArr3 = new int[i3116];
                                    for (int i3117 = 0; i3117 < i3116; i3117++) {
                                        if (i3117 >= iArr.length || (iC = iArr[i3117]) == -1) {
                                            if (i3117 == 0) {
                                                iC = 0;
                                            } else {
                                                iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i3117) & 4294967295L)) + 1;
                                            }
                                        }
                                        iArr3[i3117] = iC;
                                        lazyStaggeredGridLaneInfo.h(iC, i3117);
                                    }
                                    z23 = true;
                                    iArr = iArr3;
                                }
                                if (iArr2.length != i3116) {
                                    int[] iArr4 = new int[i3116];
                                    int i3118 = 0;
                                    while (i3118 < i3116) {
                                        iArr4[i3118] = i3118 < iArr2.length ? iArr2[i3118] : i3118 == 0 ? 0 : iArr4[i3118 - 1];
                                        i3118++;
                                    }
                                    iArr2 = iArr4;
                                }
                                n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                                lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                                return nVarD;
                            }
                        };
                        c1086g.E(pVar13);
                        objF4 = pVar13;
                    }
                    Ia.p pVar14 = (Ia.p) objF4;
                    int i3115 = i28 | (i3113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    if (((i3115 & 14) ^ 6) <= 4) {
                    }
                    z20 = z19;
                    z21 = ((((i3115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i3115 & 48) == 32) | ((((i3115 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i3115 & 6) == 4);
                    objF5 = c1086g.f();
                    if (z21) {
                        c0153a2 = c0153a;
                        if (objF5 == c0153a2) {
                        }
                        s sVar9 = (s) objF5;
                        if (z16) {
                            c1086g.L(1913386186);
                            if ((i28 ^ 6) <= 4) {
                            }
                            objF6 = c1086g.f();
                            if (z22) {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            } else {
                                objF6 = new b(lazyStaggeredGridState);
                                c1086g.E(objF6);
                            }
                            hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                            c1086g.T(false);
                        } else {
                            c1086g.L(1913691040);
                            c1086g.T(false);
                            hVarA = androidx.compose.ui.h.a.f13984b;
                        }
                        LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar7.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar9, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar14, c1086g, 0, 0);
                        jVar2 = jVar3;
                        l11 = l12;
                        hVar2 = hVar7;
                        z15 = z20;
                        z14 = z16;
                    } else {
                        c0153a2 = c0153a;
                    }
                    objF5 = new s(lazyStaggeredGridState);
                    c1086g.E(objF5);
                    s sVar10 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar7.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar10, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar14, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar7;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    l11 = l10;
                    z14 = z11;
                    f12 = f10;
                    f13 = f11;
                    z15 = z12;
                    jVar2 = jVar;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final float f1112 = f12;
                    final float f1113 = f13;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f1112, f1113, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 100663296;
            i21 = i12 & 512;
            if (i21 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.g(f10)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.g(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(lVar)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            if ((306783379 & i13) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                i27 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i27 != 0) {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f1114 = 0;
                        n10 = new N(f1114, f1114, f1114, f1114);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                } else {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f1115 = 0;
                        n10 = new N(f1115, f1115, f1115, f1115);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                }
                androidx.compose.ui.h hVar8 = hVar;
                c1086gP.U();
                i28 = i13 & 14;
                int i3116 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar, c1086gP);
                if (((i3116 & 14) ^ 6) <= 4) {
                }
                objF2 = c1086gP.f();
                if (z18) {
                    C1108r0 c1108r9 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE10 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r9);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE10.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r9), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                } else {
                    C1108r0 c1108r10 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE11 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r10);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE11.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r10), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                }
                iVar = (Oa.i) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                int i3117 = i13 >> 6;
                int i3118 = i13 >> 12;
                int i3119 = (i3117 & 7168) | i28 | (i3117 & 896) | ((i13 << 9) & 57344) | (i3118 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                zK2 = ((((234881024 & i3119) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i3119 & 100663296) == 67108864) | ((((i3119 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i3119 & 6) == 4) | c1086gP.K(iVar) | ((((i3119 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i3119 & 384) == 256) | ((((i3119 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i3119 & 3072) == 2048) | ((((i3119 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i3119 & 24576) == 16384) | ((((458752 & i3119) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i3119 & 196608) == 131072) | ((((3670016 & i3119) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i3119 & 1572864) == 1048576) | c1086gP.K(s10);
                objF4 = c1086gP.f();
                if (zK2) {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar15 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i31110 = 0;
                            while (true) {
                                if (i31110 >= length) {
                                    i31110 = -1;
                                    break;
                                }
                                if (iK == iArr[i31110]) {
                                    break;
                                }
                                i31110++;
                            }
                            if (!(i31110 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i31111 = lVar2.f10841t;
                            if (length2 == i31111) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i31111];
                                for (int i31112 = 0; i31112 < i31111; i31112++) {
                                    if (i31112 >= iArr.length || (iC = iArr[i31112]) == -1) {
                                        if (i31112 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i31112) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i31112] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i31112);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i31111) {
                                int[] iArr4 = new int[i31111];
                                int i31113 = 0;
                                while (i31113 < i31111) {
                                    iArr4[i31113] = i31113 < iArr2.length ? iArr2[i31113] : i31113 == 0 ? 0 : iArr4[i31113 - 1];
                                    i31113++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar15);
                    objF4 = pVar15;
                } else {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar16 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i31110 = 0;
                            while (true) {
                                if (i31110 >= length) {
                                    i31110 = -1;
                                    break;
                                }
                                if (iK == iArr[i31110]) {
                                    break;
                                }
                                i31110++;
                            }
                            if (!(i31110 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i31111 = lVar2.f10841t;
                            if (length2 == i31111) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i31111];
                                for (int i31112 = 0; i31112 < i31111; i31112++) {
                                    if (i31112 >= iArr.length || (iC = iArr[i31112]) == -1) {
                                        if (i31112 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i31112) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i31112] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i31112);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i31111) {
                                int[] iArr4 = new int[i31111];
                                int i31113 = 0;
                                while (i31113 < i31111) {
                                    iArr4[i31113] = i31113 < iArr2.length ? iArr2[i31113] : i31113 == 0 ? 0 : iArr4[i31113 - 1];
                                    i31113++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar16);
                    objF4 = pVar16;
                }
                Ia.p pVar17 = (Ia.p) objF4;
                int i31110 = i28 | (i3118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i31110 & 14) ^ 6) <= 4) {
                }
                z20 = z19;
                z21 = ((((i31110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i31110 & 48) == 32) | ((((i31110 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i31110 & 6) == 4);
                objF5 = c1086g.f();
                if (z21) {
                    c0153a2 = c0153a;
                    if (objF5 == c0153a2) {
                    }
                    s sVar11 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar8.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar11, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar17, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar8;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c0153a2 = c0153a;
                }
                objF5 = new s(lazyStaggeredGridState);
                c1086g.E(objF5);
                s sVar12 = (s) objF5;
                if (z16) {
                    c1086g.L(1913386186);
                    if ((i28 ^ 6) <= 4) {
                    }
                    objF6 = c1086g.f();
                    if (z22) {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    } else {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    }
                    hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                    c1086g.T(false);
                } else {
                    c1086g.L(1913691040);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar8.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar12, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar17, c1086g, 0, 0);
                jVar2 = jVar3;
                l11 = l12;
                hVar2 = hVar8;
                z15 = z20;
                z14 = z16;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                l11 = l10;
                z14 = z11;
                f12 = f10;
                f13 = f11;
                z15 = z12;
                jVar2 = jVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final float f1116 = f12;
                final float f1117 = f13;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f1116, f1117, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= 196608;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 196608) == 0) {
                if (c1086gP.c(z12)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
        }
        if ((i10 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i13 |= i29;
        }
        i18 = i12 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.c(z11)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        if ((i12 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c1086gP.K(e10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i13 |= i20;
            }
            i21 = i12 & 512;
            if (i21 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.g(f10)) {
                    i22 = 536870912;
                } else {
                    i22 = 268435456;
                }
                i13 |= i22;
            }
            i23 = i12 & 1024;
            if (i23 != 0) {
                i24 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.g(f11)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i11 | i25;
            } else {
                i24 = i11;
            }
            if ((i12 & 2048) != 0) {
                i24 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(lVar)) {
                    i26 = 32;
                } else {
                    i26 = 16;
                }
                i24 |= i26;
            }
            if ((306783379 & i13) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                i27 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i27 != 0) {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f1118 = 0;
                        n10 = new N(f1118, f1118, f1118, f1118);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                } else {
                    if (i30 != 0) {
                        hVar = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar = hVar;
                    }
                    if (i14 != 0) {
                        float f1119 = 0;
                        n10 = new N(f1119, f1119, f1119, f1119);
                    } else {
                        n10 = l10;
                    }
                    if (i16 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 64) != 0) {
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
                        jVar3 = (androidx.compose.foundation.gestures.e) objF;
                        i13 &= -3670017;
                    } else {
                        jVar3 = jVar;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i21 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f10;
                    }
                    if (i23 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f11;
                    }
                    l12 = n10;
                    z17 = z12;
                }
                androidx.compose.ui.h hVar9 = hVar;
                c1086gP.U();
                i28 = i13 & 14;
                int i31111 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                xI = J0.i(lVar, c1086gP);
                if (((i31111 & 14) ^ 6) <= 4) {
                }
                objF2 = c1086gP.f();
                if (z18) {
                    C1108r0 c1108r11 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE12 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r11);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE12.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r11), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                } else {
                    C1108r0 c1108r12 = C1108r0.f13116a;
                    final DerivedSnapshotState derivedSnapshotStateE13 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final d invoke() {
                            return new d(xI.getValue());
                        }
                    }, c1108r12);
                    objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final g invoke() {
                            d value = derivedSnapshotStateE13.getValue();
                            return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                        }
                    }, c1108r12), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    c1086gP.E(objF2);
                }
                iVar = (Oa.i) objF2;
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF3);
                }
                a10 = (A) objF3;
                s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
                int i31112 = i13 >> 6;
                int i31113 = i13 >> 12;
                int i31114 = (i31112 & 7168) | i28 | (i31112 & 896) | ((i13 << 9) & 57344) | (i31113 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
                zK2 = ((((234881024 & i31114) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i31114 & 100663296) == 67108864) | ((((i31114 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i31114 & 6) == 4) | c1086gP.K(iVar) | ((((i31114 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i31114 & 384) == 256) | ((((i31114 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i31114 & 3072) == 2048) | ((((i31114 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i31114 & 24576) == 16384) | ((((458752 & i31114) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i31114 & 196608) == 131072) | ((((3670016 & i31114) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i31114 & 1572864) == 1048576) | c1086gP.K(s10);
                objF4 = c1086gP.f();
                if (zK2) {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar18 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i31115 = 0;
                            while (true) {
                                if (i31115 >= length) {
                                    i31115 = -1;
                                    break;
                                }
                                if (iK == iArr[i31115]) {
                                    break;
                                }
                                i31115++;
                            }
                            if (!(i31115 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i31116 = lVar2.f10841t;
                            if (length2 == i31116) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i31116];
                                for (int i31117 = 0; i31117 < i31116; i31117++) {
                                    if (i31117 >= iArr.length || (iC = iArr[i31117]) == -1) {
                                        if (i31117 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i31117) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i31117] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i31117);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i31116) {
                                int[] iArr4 = new int[i31116];
                                int i31118 = 0;
                                while (i31118 < i31116) {
                                    iArr4[i31118] = i31118 < iArr2.length ? iArr2[i31118] : i31118 == 0 ? 0 : iArr4[i31118 - 1];
                                    i31118++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar18);
                    objF4 = pVar18;
                } else {
                    f12 = f14;
                    z19 = z17;
                    c1086g = c1086gP;
                    Ia.p<InterfaceC0988x, p013b0.a, n> pVar19 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.p
                        public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                            float fA;
                            float fD;
                            float fD2;
                            long j;
                            long j10;
                            boolean z23;
                            int iC;
                            InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                            long j11 = aVar2.f20475a;
                            lazyStaggeredGridState.f10809v.getValue();
                            boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                            Lb.a.b(j11, orientation);
                            u uVarA = aVar.a(interfaceC0988x2, j11);
                            boolean z25 = orientation == Orientation.f9957b;
                            f fVarInvoke = iVar.invoke();
                            L l13 = l12;
                            Orientation orientation2 = orientation;
                            boolean z26 = z19;
                            LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal = orientation2.ordinal();
                            if (iOrdinal == 0) {
                                fA = z26 ? l13.a() : l13.d();
                            } else {
                                if (iOrdinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                            }
                            int iE1 = interfaceC0988x2.e1(fA);
                            L l14 = l12;
                            Orientation orientation3 = orientation;
                            boolean z27 = z19;
                            LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal2 = orientation3.ordinal();
                            if (iOrdinal2 == 0) {
                                fD = z27 ? l14.d() : l14.a();
                            } else {
                                if (iOrdinal2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                            }
                            int iE2 = interfaceC0988x2.e1(fD);
                            L l15 = l12;
                            Orientation orientation4 = orientation;
                            LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                            int iOrdinal3 = orientation4.ordinal();
                            if (iOrdinal3 == 0) {
                                fD2 = PaddingKt.d(l15, layoutDirection3);
                            } else {
                                if (iOrdinal3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fD2 = l15.d();
                            }
                            int iE3 = interfaceC0988x2.e1(fD2);
                            int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                            if (z25) {
                                j = ((long) iE3) << 32;
                                j10 = iE1;
                            } else {
                                j = ((long) iE1) << 32;
                                j10 = iE3;
                            }
                            long j12 = j | (j10 & 4294967295L);
                            L l16 = l12;
                            int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                            L l17 = l12;
                            int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                            LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                            List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                            long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                            int iE6 = interfaceC0988x2.e1(f12);
                            boolean zS0 = interfaceC0988x2.S0();
                            LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                            l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                            r rVar = lazyStaggeredGridState3.f10791c;
                            int[] iArr = rVar.f10888b;
                            Object obj = rVar.f10893g;
                            kotlin.jvm.internal.i.e(iArr, "<this>");
                            Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                            int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                            int length = iArr.length;
                            int i31115 = 0;
                            while (true) {
                                if (i31115 >= length) {
                                    i31115 = -1;
                                    break;
                                }
                                if (iK == iArr[i31115]) {
                                    break;
                                }
                                i31115++;
                            }
                            if (!(i31115 >= 0)) {
                                rVar.f10894h.e(iK);
                                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                                try {
                                    iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    rVar.f10888b = iArr;
                                    rVar.f10889c.m(r.a(iArr));
                                } catch (Throwable th) {
                                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                    throw th;
                                }
                            }
                            int[] iArr2 = rVar.f10890d;
                            int length2 = iArr.length;
                            int i31116 = lVar2.f10841t;
                            if (length2 == i31116) {
                                z23 = true;
                            } else {
                                LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                                lazyStaggeredGridLaneInfo.g();
                                int[] iArr3 = new int[i31116];
                                for (int i31117 = 0; i31117 < i31116; i31117++) {
                                    if (i31117 >= iArr.length || (iC = iArr[i31117]) == -1) {
                                        if (i31117 == 0) {
                                            iC = 0;
                                        } else {
                                            iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i31117) & 4294967295L)) + 1;
                                        }
                                    }
                                    iArr3[i31117] = iC;
                                    lazyStaggeredGridLaneInfo.h(iC, i31117);
                                }
                                z23 = true;
                                iArr = iArr3;
                            }
                            if (iArr2.length != i31116) {
                                int[] iArr4 = new int[i31116];
                                int i31118 = 0;
                                while (i31118 < i31116) {
                                    iArr4[i31118] = i31118 < iArr2.length ? iArr2[i31118] : i31118 == 0 ? 0 : iArr4[i31118 - 1];
                                    i31118++;
                                }
                                iArr2 = iArr4;
                            }
                            n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                            lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                            return nVarD;
                        }
                    };
                    c1086g.E(pVar19);
                    objF4 = pVar19;
                }
                Ia.p pVar110 = (Ia.p) objF4;
                int i31115 = i28 | (i31113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                if (((i31115 & 14) ^ 6) <= 4) {
                }
                z20 = z19;
                z21 = ((((i31115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i31115 & 48) == 32) | ((((i31115 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i31115 & 6) == 4);
                objF5 = c1086g.f();
                if (z21) {
                    c0153a2 = c0153a;
                    if (objF5 == c0153a2) {
                    }
                    s sVar13 = (s) objF5;
                    if (z16) {
                        c1086g.L(1913386186);
                        if ((i28 ^ 6) <= 4) {
                        }
                        objF6 = c1086g.f();
                        if (z22) {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        } else {
                            objF6 = new b(lazyStaggeredGridState);
                            c1086g.E(objF6);
                        }
                        hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                        c1086g.T(false);
                    } else {
                        c1086g.L(1913691040);
                        c1086g.T(false);
                        hVarA = androidx.compose.ui.h.a.f13984b;
                    }
                    LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar9.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar13, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar110, c1086g, 0, 0);
                    jVar2 = jVar3;
                    l11 = l12;
                    hVar2 = hVar9;
                    z15 = z20;
                    z14 = z16;
                } else {
                    c0153a2 = c0153a;
                }
                objF5 = new s(lazyStaggeredGridState);
                c1086g.E(objF5);
                s sVar14 = (s) objF5;
                if (z16) {
                    c1086g.L(1913386186);
                    if ((i28 ^ 6) <= 4) {
                    }
                    objF6 = c1086g.f();
                    if (z22) {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    } else {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    }
                    hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                    c1086g.T(false);
                } else {
                    c1086g.L(1913691040);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar9.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar14, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar110, c1086g, 0, 0);
                jVar2 = jVar3;
                l11 = l12;
                hVar2 = hVar9;
                z15 = z20;
                z14 = z16;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                l11 = l10;
                z14 = z11;
                f12 = f10;
                f13 = f11;
                z15 = z12;
                jVar2 = jVar;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final float f11110 = f12;
                final float f11111 = f13;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f11110, f11111, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 100663296;
        i21 = i12 & 512;
        if (i21 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.g(f10)) {
                i22 = 536870912;
            } else {
                i22 = 268435456;
            }
            i13 |= i22;
        }
        i23 = i12 & 1024;
        if (i23 != 0) {
            i24 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.g(f11)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i11 | i25;
        } else {
            i24 = i11;
        }
        if ((i12 & 2048) != 0) {
            i24 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c1086gP.k(lVar)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i24 |= i26;
        }
        if ((306783379 & i13) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c1086gP.C(i13 & 1, z13)) {
            c1086gP.r0();
            i27 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i27 != 0) {
                if (i30 != 0) {
                    hVar = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar = hVar;
                }
                if (i14 != 0) {
                    float f11112 = 0;
                    n10 = new N(f11112, f11112, f11112, f11112);
                } else {
                    n10 = l10;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if ((i12 & 64) != 0) {
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
                    jVar3 = (androidx.compose.foundation.gestures.e) objF;
                    i13 &= -3670017;
                } else {
                    jVar3 = jVar;
                }
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if (i21 != 0) {
                    f14 = 0;
                } else {
                    f14 = f10;
                }
                if (i23 != 0) {
                    f13 = 0;
                } else {
                    f13 = f11;
                }
                l12 = n10;
                z17 = z12;
            } else {
                if (i30 != 0) {
                    hVar = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar = hVar;
                }
                if (i14 != 0) {
                    float f11113 = 0;
                    n10 = new N(f11113, f11113, f11113, f11113);
                } else {
                    n10 = l10;
                }
                if (i16 != 0) {
                    z12 = false;
                }
                if ((i12 & 64) != 0) {
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
                    jVar3 = (androidx.compose.foundation.gestures.e) objF;
                    i13 &= -3670017;
                } else {
                    jVar3 = jVar;
                }
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if (i21 != 0) {
                    f14 = 0;
                } else {
                    f14 = f10;
                }
                if (i23 != 0) {
                    f13 = 0;
                } else {
                    f13 = f11;
                }
                l12 = n10;
                z17 = z12;
            }
            androidx.compose.ui.h hVar10 = hVar;
            c1086gP.U();
            i28 = i13 & 14;
            int i31116 = i28 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            xI = J0.i(lVar, c1086gP);
            if (((i31116 & 14) ^ 6) <= 4) {
            }
            objF2 = c1086gP.f();
            if (z18) {
                C1108r0 c1108r13 = C1108r0.f13116a;
                final DerivedSnapshotState derivedSnapshotStateE14 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final d invoke() {
                        return new d(xI.getValue());
                    }
                }, c1108r13);
                objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final g invoke() {
                        d value = derivedSnapshotStateE14.getValue();
                        return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                    }
                }, c1108r13), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                c1086gP.E(objF2);
            } else {
                C1108r0 c1108r14 = C1108r0.f13116a;
                final DerivedSnapshotState derivedSnapshotStateE15 = J0.e(new Ia.a<d>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$intervalContentState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final d invoke() {
                        return new d(xI.getValue());
                    }
                }, c1108r14);
                objF2 = new LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$1(J0.e(new Ia.a<g>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProviderLambda$1$itemProviderState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final g invoke() {
                        d value = derivedSnapshotStateE15.getValue();
                        return new g(lazyStaggeredGridState, value, new NearestRangeKeyIndexMap((Na.i) lazyStaggeredGridState.f10791c.f10894h.getValue(), value));
                    }
                }, c1108r14), N0.class, "value", "getValue()Ljava/lang/Object;", 0);
                c1086gP.E(objF2);
            }
            iVar = (Oa.i) objF2;
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF3);
            }
            a10 = (A) objF3;
            s10 = (S) c1086gP.x(CompositionLocalsKt.f14846g);
            int i31117 = i13 >> 6;
            int i31118 = i13 >> 12;
            int i31119 = (i31117 & 7168) | i28 | (i31117 & 896) | ((i13 << 9) & 57344) | (i31118 & 458752) | ((i24 << 18) & 3670016) | ((i13 << 18) & 234881024);
            zK2 = ((((234881024 & i31119) ^ 100663296) <= 67108864 && c1086gP.K(aVar)) || (i31119 & 100663296) == 67108864) | ((((i31119 & 14) ^ 6) <= 4 && c1086gP.K(lazyStaggeredGridState)) || (i31119 & 6) == 4) | c1086gP.K(iVar) | ((((i31119 & 896) ^ 384) <= 256 && c1086gP.K(l12)) || (i31119 & 384) == 256) | ((((i31119 & 7168) ^ 3072) <= 2048 && c1086gP.c(z17)) || (i31119 & 3072) == 2048) | ((((i31119 & 57344) ^ 24576) <= 16384 && c1086gP.K(orientation)) || (i31119 & 24576) == 16384) | ((((458752 & i31119) ^ 196608) <= 131072 && c1086gP.g(f14)) || (i31119 & 196608) == 131072) | ((((3670016 & i31119) ^ 1572864) <= 1048576 && c1086gP.g(f13)) || (i31119 & 1572864) == 1048576) | c1086gP.K(s10);
            objF4 = c1086gP.f();
            if (zK2) {
                f12 = f14;
                z19 = z17;
                c1086g = c1086gP;
                Ia.p<InterfaceC0988x, p013b0.a, n> pVar111 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.p
                    public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                        float fA;
                        float fD;
                        float fD2;
                        long j;
                        long j10;
                        boolean z23;
                        int iC;
                        InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                        long j11 = aVar2.f20475a;
                        lazyStaggeredGridState.f10809v.getValue();
                        boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                        Lb.a.b(j11, orientation);
                        u uVarA = aVar.a(interfaceC0988x2, j11);
                        boolean z25 = orientation == Orientation.f9957b;
                        f fVarInvoke = iVar.invoke();
                        L l13 = l12;
                        Orientation orientation2 = orientation;
                        boolean z26 = z19;
                        LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal = orientation2.ordinal();
                        if (iOrdinal == 0) {
                            fA = z26 ? l13.a() : l13.d();
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                        }
                        int iE1 = interfaceC0988x2.e1(fA);
                        L l14 = l12;
                        Orientation orientation3 = orientation;
                        boolean z27 = z19;
                        LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal2 = orientation3.ordinal();
                        if (iOrdinal2 == 0) {
                            fD = z27 ? l14.d() : l14.a();
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                        }
                        int iE2 = interfaceC0988x2.e1(fD);
                        L l15 = l12;
                        Orientation orientation4 = orientation;
                        LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal3 = orientation4.ordinal();
                        if (iOrdinal3 == 0) {
                            fD2 = PaddingKt.d(l15, layoutDirection3);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fD2 = l15.d();
                        }
                        int iE3 = interfaceC0988x2.e1(fD2);
                        int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                        if (z25) {
                            j = ((long) iE3) << 32;
                            j10 = iE1;
                        } else {
                            j = ((long) iE1) << 32;
                            j10 = iE3;
                        }
                        long j12 = j | (j10 & 4294967295L);
                        L l16 = l12;
                        int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                        L l17 = l12;
                        int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                        List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                        long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                        int iE6 = interfaceC0988x2.e1(f12);
                        boolean zS0 = interfaceC0988x2.S0();
                        LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                        l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                        r rVar = lazyStaggeredGridState3.f10791c;
                        int[] iArr = rVar.f10888b;
                        Object obj = rVar.f10893g;
                        kotlin.jvm.internal.i.e(iArr, "<this>");
                        Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                        int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                        int length = iArr.length;
                        int i311110 = 0;
                        while (true) {
                            if (i311110 >= length) {
                                i311110 = -1;
                                break;
                            }
                            if (iK == iArr[i311110]) {
                                break;
                            }
                            i311110++;
                        }
                        if (!(i311110 >= 0)) {
                            rVar.f10894h.e(iK);
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                rVar.f10888b = iArr;
                                rVar.f10889c.m(r.a(iArr));
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                        int[] iArr2 = rVar.f10890d;
                        int length2 = iArr.length;
                        int i311111 = lVar2.f10841t;
                        if (length2 == i311111) {
                            z23 = true;
                        } else {
                            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                            lazyStaggeredGridLaneInfo.g();
                            int[] iArr3 = new int[i311111];
                            for (int i311112 = 0; i311112 < i311111; i311112++) {
                                if (i311112 >= iArr.length || (iC = iArr[i311112]) == -1) {
                                    if (i311112 == 0) {
                                        iC = 0;
                                    } else {
                                        iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i311112) & 4294967295L)) + 1;
                                    }
                                }
                                iArr3[i311112] = iC;
                                lazyStaggeredGridLaneInfo.h(iC, i311112);
                            }
                            z23 = true;
                            iArr = iArr3;
                        }
                        if (iArr2.length != i311111) {
                            int[] iArr4 = new int[i311111];
                            int i311113 = 0;
                            while (i311113 < i311111) {
                                iArr4[i311113] = i311113 < iArr2.length ? iArr2[i311113] : i311113 == 0 ? 0 : iArr4[i311113 - 1];
                                i311113++;
                            }
                            iArr2 = iArr4;
                        }
                        n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                        lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                        return nVarD;
                    }
                };
                c1086g.E(pVar111);
                objF4 = pVar111;
            } else {
                f12 = f14;
                z19 = z17;
                c1086g = c1086gP;
                Ia.p<InterfaceC0988x, p013b0.a, n> pVar112 = new Ia.p<InterfaceC0988x, p013b0.a, n>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.p
                    public final n invoke(InterfaceC0988x interfaceC0988x, p013b0.a aVar2) {
                        float fA;
                        float fD;
                        float fD2;
                        long j;
                        long j10;
                        boolean z23;
                        int iC;
                        InterfaceC0988x interfaceC0988x2 = interfaceC0988x;
                        long j11 = aVar2.f20475a;
                        lazyStaggeredGridState.f10809v.getValue();
                        boolean z24 = lazyStaggeredGridState.f10789a || interfaceC0988x2.S0();
                        Lb.a.b(j11, orientation);
                        u uVarA = aVar.a(interfaceC0988x2, j11);
                        boolean z25 = orientation == Orientation.f9957b;
                        f fVarInvoke = iVar.invoke();
                        L l13 = l12;
                        Orientation orientation2 = orientation;
                        boolean z26 = z19;
                        LayoutDirection layoutDirection = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal = orientation2.ordinal();
                        if (iOrdinal == 0) {
                            fA = z26 ? l13.a() : l13.d();
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fA = z26 ? PaddingKt.c(l13, layoutDirection) : PaddingKt.d(l13, layoutDirection);
                        }
                        int iE1 = interfaceC0988x2.e1(fA);
                        L l14 = l12;
                        Orientation orientation3 = orientation;
                        boolean z27 = z19;
                        LayoutDirection layoutDirection2 = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal2 = orientation3.ordinal();
                        if (iOrdinal2 == 0) {
                            fD = z27 ? l14.d() : l14.a();
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fD = z27 ? PaddingKt.d(l14, layoutDirection2) : PaddingKt.c(l14, layoutDirection2);
                        }
                        int iE2 = interfaceC0988x2.e1(fD);
                        L l15 = l12;
                        Orientation orientation4 = orientation;
                        LayoutDirection layoutDirection3 = interfaceC0988x2.getLayoutDirection();
                        int iOrdinal3 = orientation4.ordinal();
                        if (iOrdinal3 == 0) {
                            fD2 = PaddingKt.d(l15, layoutDirection3);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fD2 = l15.d();
                        }
                        int iE3 = interfaceC0988x2.e1(fD2);
                        int iG = ((z25 ? p013b0.a.g(j11) : p013b0.a.h(j11)) - iE1) - iE2;
                        if (z25) {
                            j = ((long) iE3) << 32;
                            j10 = iE1;
                        } else {
                            j = ((long) iE1) << 32;
                            j10 = iE3;
                        }
                        long j12 = j | (j10 & 4294967295L);
                        L l16 = l12;
                        int iE4 = interfaceC0988x2.e1(PaddingKt.c(l16, interfaceC0988x2.getLayoutDirection()) + PaddingKt.d(l16, interfaceC0988x2.getLayoutDirection()));
                        L l17 = l12;
                        int iE5 = interfaceC0988x2.e1(l17.a() + l17.d());
                        LazyStaggeredGridState lazyStaggeredGridState2 = lazyStaggeredGridState;
                        List<Integer> listA = C0977l.a(fVarInvoke, lazyStaggeredGridState2.f10806s, lazyStaggeredGridState2.f10798k);
                        long jA = p013b0.a.a(j11, p013b0.b.g(iE4, j11), 0, p013b0.b.f(iE5, j11), 0, 10);
                        int iE6 = interfaceC0988x2.e1(f12);
                        boolean zS0 = interfaceC0988x2.S0();
                        LazyStaggeredGridState lazyStaggeredGridState3 = lazyStaggeredGridState;
                        l lVar2 = new l(lazyStaggeredGridState3, listA, fVarInvoke, uVarA, jA, z25, interfaceC0988x2, iG, j12, iE1, iE2, z19, iE6, a10, z24, lazyStaggeredGridState3.f10790b, s10);
                        r rVar = lazyStaggeredGridState3.f10791c;
                        int[] iArr = rVar.f10888b;
                        Object obj = rVar.f10893g;
                        kotlin.jvm.internal.i.e(iArr, "<this>");
                        Integer numValueOf = iArr.length > 0 ? Integer.valueOf(iArr[0]) : null;
                        int iK = kotlinx.coroutines.C.k(numValueOf != null ? numValueOf.intValue() : 0, fVarInvoke, obj);
                        int length = iArr.length;
                        int i311110 = 0;
                        while (true) {
                            if (i311110 >= length) {
                                i311110 = -1;
                                break;
                            }
                            if (iK == iArr[i311110]) {
                                break;
                            }
                            i311110++;
                        }
                        if (!(i311110 >= 0)) {
                            rVar.f10894h.e(iK);
                            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                            try {
                                iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(iK), Integer.valueOf(iArr.length));
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                rVar.f10888b = iArr;
                                rVar.f10889c.m(r.a(iArr));
                            } catch (Throwable th) {
                                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                                throw th;
                            }
                        }
                        int[] iArr2 = rVar.f10890d;
                        int length2 = iArr.length;
                        int i311111 = lVar2.f10841t;
                        if (length2 == i311111) {
                            z23 = true;
                        } else {
                            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lVar2.f10840s;
                            lazyStaggeredGridLaneInfo.g();
                            int[] iArr3 = new int[i311111];
                            for (int i311112 = 0; i311112 < i311111; i311112++) {
                                if (i311112 >= iArr.length || (iC = iArr[i311112]) == -1) {
                                    if (i311112 == 0) {
                                        iC = 0;
                                    } else {
                                        iC = LazyStaggeredGridMeasureKt.c(iArr3, (((long) 0) << 32) | (((long) i311112) & 4294967295L)) + 1;
                                    }
                                }
                                iArr3[i311112] = iC;
                                lazyStaggeredGridLaneInfo.h(iC, i311112);
                            }
                            z23 = true;
                            iArr = iArr3;
                        }
                        if (iArr2.length != i311111) {
                            int[] iArr4 = new int[i311111];
                            int i311113 = 0;
                            while (i311113 < i311111) {
                                iArr4[i311113] = i311113 < iArr2.length ? iArr2[i311113] : i311113 == 0 ? 0 : iArr4[i311113 - 1];
                                i311113++;
                            }
                            iArr2 = iArr4;
                        }
                        n nVarD = LazyStaggeredGridMeasureKt.d(lVar2, Math.round((zS0 || !lazyStaggeredGridState3.f10789a) ? lazyStaggeredGridState3.f10802o : ((Number) lazyStaggeredGridState3.f10810w.f10646a.f9544c.getValue()).floatValue()), iArr, iArr2, z23);
                        lazyStaggeredGridState.f(nVarD, interfaceC0988x2.S0(), false);
                        return nVarD;
                    }
                };
                c1086g.E(pVar112);
                objF4 = pVar112;
            }
            Ia.p pVar113 = (Ia.p) objF4;
            int i311110 = i28 | (i31118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            if (((i311110 & 14) ^ 6) <= 4) {
            }
            z20 = z19;
            z21 = ((((i311110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086g.c(z20)) || (i311110 & 48) == 32) | ((((i311110 & 14) ^ 6) <= 4 && c1086g.K(lazyStaggeredGridState)) || (i311110 & 6) == 4);
            objF5 = c1086g.f();
            if (z21) {
                c0153a2 = c0153a;
                if (objF5 == c0153a2) {
                }
                s sVar15 = (s) objF5;
                if (z16) {
                    c1086g.L(1913386186);
                    if ((i28 ^ 6) <= 4) {
                    }
                    objF6 = c1086g.f();
                    if (z22) {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    } else {
                        objF6 = new b(lazyStaggeredGridState);
                        c1086g.E(objF6);
                    }
                    hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                    c1086g.T(false);
                } else {
                    c1086g.L(1913691040);
                    c1086g.T(false);
                    hVarA = androidx.compose.ui.h.a.f13984b;
                }
                LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar10.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar15, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar113, c1086g, 0, 0);
                jVar2 = jVar3;
                l11 = l12;
                hVar2 = hVar10;
                z15 = z20;
                z14 = z16;
            } else {
                c0153a2 = c0153a;
            }
            objF5 = new s(lazyStaggeredGridState);
            c1086g.E(objF5);
            s sVar16 = (s) objF5;
            if (z16) {
                c1086g.L(1913386186);
                if ((i28 ^ 6) <= 4) {
                }
                objF6 = c1086g.f();
                if (z22) {
                    objF6 = new b(lazyStaggeredGridState);
                    c1086g.E(objF6);
                } else {
                    objF6 = new b(lazyStaggeredGridState);
                    c1086g.E(objF6);
                }
                hVarA = C0974i.a((b) objF6, lazyStaggeredGridState.f10798k, z20, orientation);
                c1086g.T(false);
            } else {
                c1086g.L(1913691040);
                c1086g.T(false);
                hVarA = androidx.compose.ui.h.a.f13984b;
            }
            LazyLayoutKt.a(iVar, K.a(androidx.compose.foundation.lazy.layout.N.a(hVar10.i(lazyStaggeredGridState.f10797i).i(lazyStaggeredGridState.j), iVar, sVar16, orientation, z16, z20).i(hVarA).i(lazyStaggeredGridState.f10807t.f10635k), lazyStaggeredGridState, orientation, z16, z20, jVar3, lazyStaggeredGridState.f10805r, false, e10, null), lazyStaggeredGridState.f10800m, pVar113, c1086g, 0, 0);
            jVar2 = jVar3;
            l11 = l12;
            hVar2 = hVar10;
            z15 = z20;
            z14 = z16;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            hVar2 = hVar;
            l11 = l10;
            z14 = z11;
            f12 = f10;
            f13 = f11;
            z15 = z12;
            jVar2 = jVar;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final float f11114 = f12;
            final float f11115 = f13;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyStaggeredGridKt.a(lazyStaggeredGridState, orientation, aVar, hVar2, l11, z15, jVar2, z14, e10, f11114, f11115, lVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
