package androidx.compose.foundation.layout;

import androidx.collection.C0880h;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.C1174u;
import androidx.compose.ui.node.ComposeUiNode;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlowLayoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10123a = 0;

    static {
        int i10 = r.f10313a;
        new r.e(androidx.compose.ui.d.a.j);
        new r.c(androidx.compose.ui.d.a.f13346m);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0107  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0101  */
    /* JADX WARN: Code duplicated, block: B:99:0x0103  */
    public static final void a(androidx.compose.ui.h hVar, C0945e.InterfaceC0129e interfaceC0129e, C0945e.l lVar, androidx.compose.ui.d.c cVar, int i10, int i11, final Ia.q<? super InterfaceC0965z, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i12, final int i13) {
        int i14;
        int i15;
        C0945e.l lVar2;
        int i16;
        int i17;
        androidx.compose.ui.d.c cVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final C0945e.InterfaceC0129e interfaceC0129e2;
        final C0945e.l lVar3;
        final androidx.compose.ui.d.c cVar3;
        final int i26;
        final int i27;
        C1105p0 c1105p0V;
        int i28;
        int i29;
        C1086g c1086gP = interfaceC1084f.p(-2070229740);
        int i30 = i13 & 1;
        if (i30 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (c1086gP.K(hVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i31 = i13 & 2;
        if (i31 == 0) {
            if ((i12 & 48) == 0) {
                i14 |= c1086gP.K(interfaceC0129e) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 384) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.K(lVar2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        cVar2 = cVar;
                        if (c1086gP.K(cVar2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            i20 = i10;
                            if (c1086gP.h(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            if ((196608 & i12) == 0) {
                                i23 = i11;
                                if (c1086gP.h(i23)) {
                                    i24 = 131072;
                                } else {
                                    i24 = 65536;
                                }
                                i14 |= i24;
                            }
                            if ((i13 & 64) != 0) {
                                if ((i12 & 1572864) == 0) {
                                    if (c1086gP.k(qVar)) {
                                        i25 = 1048576;
                                    } else {
                                        i25 = 524288;
                                    }
                                    i14 |= i25;
                                }
                                if ((i14 & 599187) != 599186) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (c1086gP.C(i14 & 1, z10)) {
                                    if (i30 != 0) {
                                        hVar2 = androidx.compose.ui.h.a.f13984b;
                                    } else {
                                        hVar2 = hVar;
                                    }
                                    if (i31 != 0) {
                                        interfaceC0129e2 = C0945e.f10284a;
                                    } else {
                                        interfaceC0129e2 = interfaceC0129e;
                                    }
                                    if (i15 != 0) {
                                        lVar2 = C0945e.f10286c;
                                    }
                                    if (i17 != 0) {
                                        cVar3 = androidx.compose.ui.d.a.j;
                                    } else {
                                        cVar3 = cVar2;
                                    }
                                    i28 = BrazeLogger.SUPPRESS;
                                    if (i19 != 0) {
                                        i29 = Integer.MAX_VALUE;
                                    } else {
                                        i29 = i20;
                                    }
                                    if (i22 == 0) {
                                        i28 = i23;
                                    }
                                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                    lVar3 = lVar2;
                                    int i32 = i29;
                                    i27 = i28;
                                    i26 = i32;
                                } else {
                                    c1086gP.w();
                                    hVar2 = hVar;
                                    interfaceC0129e2 = interfaceC0129e;
                                    lVar3 = lVar2;
                                    cVar3 = cVar2;
                                    i26 = i20;
                                    i27 = i23;
                                }
                                c1105p0V = c1086gP.V();
                                if (c1105p0V != null) {
                                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            num.intValue();
                                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                }
                            }
                            i14 |= 1572864;
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i33 = i29;
                                i27 = i28;
                                i26 = i33;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 196608;
                        i23 = i11;
                        if ((i13 & 64) != 0) {
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i34 = i29;
                                i27 = i28;
                                i26 = i34;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 1572864;
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i35 = i29;
                            i27 = i28;
                            i26 = i35;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c1086gP.h(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i36 = i29;
                                i27 = i28;
                                i26 = i36;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 1572864;
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i37 = i29;
                            i27 = i28;
                            i26 = i37;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 196608;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i38 = i29;
                            i27 = i28;
                            i26 = i38;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i39 = i29;
                        i27 = i28;
                        i26 = i39;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 3072;
                cVar2 = cVar;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c1086gP.h(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c1086gP.h(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i310 = i29;
                                i27 = i28;
                                i26 = i310;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 1572864;
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i311 = i29;
                            i27 = i28;
                            i26 = i311;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 196608;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i312 = i29;
                            i27 = i28;
                            i26 = i312;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i313 = i29;
                        i27 = i28;
                        i26 = i313;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i314 = i29;
                            i27 = i28;
                            i26 = i314;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i315 = i29;
                        i27 = i28;
                        i26 = i315;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i316 = i29;
                        i27 = i28;
                        i26 = i316;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i317 = i29;
                    i27 = i28;
                    i26 = i317;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 384;
            lVar2 = lVar;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c1086gP.h(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c1086gP.h(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i318 = i29;
                                i27 = i28;
                                i26 = i318;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 1572864;
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i319 = i29;
                            i27 = i28;
                            i26 = i319;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 196608;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i3110 = i29;
                            i27 = i28;
                            i26 = i3110;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3111 = i29;
                        i27 = i28;
                        i26 = i3111;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i3112 = i29;
                            i27 = i28;
                            i26 = i3112;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3113 = i29;
                        i27 = i28;
                        i26 = i3113;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3114 = i29;
                        i27 = i28;
                        i26 = i3114;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3115 = i29;
                    i27 = i28;
                    i26 = i3115;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            cVar2 = cVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c1086gP.h(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i3116 = i29;
                            i27 = i28;
                            i26 = i3116;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3117 = i29;
                        i27 = i28;
                        i26 = i3117;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3118 = i29;
                        i27 = i28;
                        i26 = i3118;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3119 = i29;
                    i27 = i28;
                    i26 = i3119;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c1086gP.h(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i31110 = i29;
                        i27 = i28;
                        i26 = i31110;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i31111 = i29;
                    i27 = i28;
                    i26 = i31111;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 196608;
            i23 = i11;
            if ((i13 & 64) != 0) {
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i31112 = i29;
                    i27 = i28;
                    i26 = i31112;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 1572864;
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i31113 = i29;
                i27 = i28;
                i26 = i31113;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 48;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 384) == 0) {
                lVar2 = lVar;
                if (c1086gP.K(lVar2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c1086gP.h(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c1086gP.h(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.k(qVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i14 & 1, z10)) {
                                if (i30 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i31 != 0) {
                                    interfaceC0129e2 = C0945e.f10284a;
                                } else {
                                    interfaceC0129e2 = interfaceC0129e;
                                }
                                if (i15 != 0) {
                                    lVar2 = C0945e.f10286c;
                                }
                                if (i17 != 0) {
                                    cVar3 = androidx.compose.ui.d.a.j;
                                } else {
                                    cVar3 = cVar2;
                                }
                                i28 = BrazeLogger.SUPPRESS;
                                if (i19 != 0) {
                                    i29 = Integer.MAX_VALUE;
                                } else {
                                    i29 = i20;
                                }
                                if (i22 == 0) {
                                    i28 = i23;
                                }
                                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                lVar3 = lVar2;
                                int i31114 = i29;
                                i27 = i28;
                                i26 = i31114;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                interfaceC0129e2 = interfaceC0129e;
                                lVar3 = lVar2;
                                cVar3 = cVar2;
                                i26 = i20;
                                i27 = i23;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i14 |= 1572864;
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i31115 = i29;
                            i27 = i28;
                            i26 = i31115;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 196608;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i31116 = i29;
                            i27 = i28;
                            i26 = i31116;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i31117 = i29;
                        i27 = i28;
                        i26 = i31117;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i31118 = i29;
                            i27 = i28;
                            i26 = i31118;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i31119 = i29;
                        i27 = i28;
                        i26 = i31119;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i311110 = i29;
                        i27 = i28;
                        i26 = i311110;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i311111 = i29;
                    i27 = i28;
                    i26 = i311111;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            cVar2 = cVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c1086gP.h(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i311112 = i29;
                            i27 = i28;
                            i26 = i311112;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i311113 = i29;
                        i27 = i28;
                        i26 = i311113;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i311114 = i29;
                        i27 = i28;
                        i26 = i311114;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i311115 = i29;
                    i27 = i28;
                    i26 = i311115;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c1086gP.h(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i311116 = i29;
                        i27 = i28;
                        i26 = i311116;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i311117 = i29;
                    i27 = i28;
                    i26 = i311117;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 196608;
            i23 = i11;
            if ((i13 & 64) != 0) {
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i311118 = i29;
                    i27 = i28;
                    i26 = i311118;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 1572864;
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i311119 = i29;
                i27 = i28;
                i26 = i311119;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 384;
        lVar2 = lVar;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                cVar2 = cVar;
                if (c1086gP.K(cVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c1086gP.h(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c1086gP.h(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i30 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i31 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            } else {
                                interfaceC0129e2 = interfaceC0129e;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar3 = androidx.compose.ui.d.a.j;
                            } else {
                                cVar3 = cVar2;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i20;
                            }
                            if (i22 == 0) {
                                i28 = i23;
                            }
                            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            lVar3 = lVar2;
                            int i3111110 = i29;
                            i27 = i28;
                            i26 = i3111110;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            interfaceC0129e2 = interfaceC0129e;
                            lVar3 = lVar2;
                            cVar3 = cVar2;
                            i26 = i20;
                            i27 = i23;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 1572864;
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3111111 = i29;
                        i27 = i28;
                        i26 = i3111111;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 196608;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3111112 = i29;
                        i27 = i28;
                        i26 = i3111112;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3111113 = i29;
                    i27 = i28;
                    i26 = i3111113;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c1086gP.h(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3111114 = i29;
                        i27 = i28;
                        i26 = i3111114;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3111115 = i29;
                    i27 = i28;
                    i26 = i3111115;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 196608;
            i23 = i11;
            if ((i13 & 64) != 0) {
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3111116 = i29;
                    i27 = i28;
                    i26 = i3111116;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 1572864;
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i3111117 = i29;
                i27 = i28;
                i26 = i3111117;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 3072;
        cVar2 = cVar;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                i20 = i10;
                if (c1086gP.h(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c1086gP.h(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i30 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i31 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        } else {
                            interfaceC0129e2 = interfaceC0129e;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar3 = androidx.compose.ui.d.a.j;
                        } else {
                            cVar3 = cVar2;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i20;
                        }
                        if (i22 == 0) {
                            i28 = i23;
                        }
                        b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        lVar3 = lVar2;
                        int i3111118 = i29;
                        i27 = i28;
                        i26 = i3111118;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        interfaceC0129e2 = interfaceC0129e;
                        lVar3 = lVar2;
                        cVar3 = cVar2;
                        i26 = i20;
                        i27 = i23;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 1572864;
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i3111119 = i29;
                    i27 = i28;
                    i26 = i3111119;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 196608;
            i23 = i11;
            if ((i13 & 64) != 0) {
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i31111110 = i29;
                    i27 = i28;
                    i26 = i31111110;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 1572864;
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i31111111 = i29;
                i27 = i28;
                i26 = i31111111;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            if ((196608 & i12) == 0) {
                i23 = i11;
                if (c1086gP.h(i23)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i14 |= i24;
            }
            if ((i13 & 64) != 0) {
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i30 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i31 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    } else {
                        interfaceC0129e2 = interfaceC0129e;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar3 = androidx.compose.ui.d.a.j;
                    } else {
                        cVar3 = cVar2;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i20;
                    }
                    if (i22 == 0) {
                        i28 = i23;
                    }
                    b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    lVar3 = lVar2;
                    int i31111112 = i29;
                    i27 = i28;
                    i26 = i31111112;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    interfaceC0129e2 = interfaceC0129e;
                    lVar3 = lVar2;
                    cVar3 = cVar2;
                    i26 = i20;
                    i27 = i23;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 1572864;
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i31111113 = i29;
                i27 = i28;
                i26 = i31111113;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 196608;
        i23 = i11;
        if ((i13 & 64) != 0) {
            if ((i12 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i30 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i31 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                } else {
                    interfaceC0129e2 = interfaceC0129e;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar3 = androidx.compose.ui.d.a.j;
                } else {
                    cVar3 = cVar2;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i20;
                }
                if (i22 == 0) {
                    i28 = i23;
                }
                b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                lVar3 = lVar2;
                int i31111114 = i29;
                i27 = i28;
                i26 = i31111114;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                interfaceC0129e2 = interfaceC0129e;
                lVar3 = lVar2;
                cVar3 = cVar2;
                i26 = i20;
                i27 = i23;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 1572864;
        if ((i14 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i14 & 1, z10)) {
            if (i30 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i31 != 0) {
                interfaceC0129e2 = C0945e.f10284a;
            } else {
                interfaceC0129e2 = interfaceC0129e;
            }
            if (i15 != 0) {
                lVar2 = C0945e.f10286c;
            }
            if (i17 != 0) {
                cVar3 = androidx.compose.ui.d.a.j;
            } else {
                cVar3 = cVar2;
            }
            i28 = BrazeLogger.SUPPRESS;
            if (i19 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i20;
            }
            if (i22 == 0) {
                i28 = i23;
            }
            b(hVar2, interfaceC0129e2, lVar2, cVar3, i29, i28, C0964y.f10346f, qVar, c1086gP, (i14 & 14) | 1572864 | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
            lVar3 = lVar2;
            int i31111115 = i29;
            i27 = i28;
            i26 = i31111115;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            interfaceC0129e2 = interfaceC0129e;
            lVar3 = lVar2;
            cVar3 = cVar2;
            i26 = i20;
            i27 = i23;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    FlowLayoutKt.a(hVar2, interfaceC0129e2, lVar3, cVar3, i26, i27, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0142  */
    /* JADX WARN: Code duplicated, block: B:117:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x020e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0210  */
    /* JADX WARN: Code duplicated, block: B:169:0x0219  */
    /* JADX WARN: Code duplicated, block: B:170:0x021b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0225  */
    /* JADX WARN: Code duplicated, block: B:174:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0232  */
    /* JADX WARN: Code duplicated, block: B:180:0x024d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0254  */
    /* JADX WARN: Code duplicated, block: B:184:0x0259  */
    /* JADX WARN: Code duplicated, block: B:187:0x0269  */
    /* JADX WARN: Code duplicated, block: B:190:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x026f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0274  */
    /* JADX WARN: Code duplicated, block: B:194:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x027a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x0292  */
    /* JADX WARN: Code duplicated, block: B:203:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:207:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:209:0x02db  */
    /* JADX WARN: Code duplicated, block: B:211:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0306  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    /* JADX WARN: Instruction removed from duplicated block: B:178:0x0232, please report this as an issue */
    @p293xa.d
    public static final void b(androidx.compose.ui.h hVar, C0945e.InterfaceC0129e interfaceC0129e, C0945e.l lVar, androidx.compose.ui.d.c cVar, int i10, int i11, C0964y c0964y, final Ia.q<? super InterfaceC0965z, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i12, final int i13) {
        androidx.compose.ui.h hVar2;
        int i14;
        C0945e.InterfaceC0129e interfaceC0129e2;
        int i15;
        C0945e.l lVar2;
        int i16;
        int i17;
        androidx.compose.ui.d.c cVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C0964y c0964y2;
        int i24;
        int i25;
        boolean z10;
        final int i26;
        final C0945e.l lVar3;
        final androidx.compose.ui.h hVar3;
        final C0945e.InterfaceC0129e interfaceC0129e3;
        final C0964y c0964y3;
        final int i27;
        C1105p0 c1105p0V;
        int i28;
        int i29;
        int i30;
        boolean z11;
        Object objF;
        C0962w c0962w;
        boolean zK;
        Object objF2;
        FlowMeasurePolicy flowMeasurePolicy;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList;
        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar4;
        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVarInvoke;
        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVarInvoke2;
        int iOrdinal;
        Object obj;
        boolean zK2;
        Object objF3;
        int i31;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        C1086g c1086gP = interfaceC1084f.p(-218661582);
        int i32 = i13 & 1;
        if (i32 != 0) {
            i14 = i12 | 6;
            hVar2 = hVar;
        } else if ((i12 & 6) == 0) {
            hVar2 = hVar;
            i14 = (c1086gP.K(hVar2) ? 4 : 2) | i12;
        } else {
            hVar2 = hVar;
            i14 = i12;
        }
        int i33 = i13 & 2;
        if (i33 == 0) {
            if ((i12 & 48) == 0) {
                interfaceC0129e2 = interfaceC0129e;
                i14 |= c1086gP.K(interfaceC0129e2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 384) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.K(lVar2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        cVar2 = cVar;
                        if (c1086gP.K(cVar2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = 16 & i13;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            if (c1086gP.h(i10)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            i14 |= 196608;
                        } else if ((i12 & 196608) == 0) {
                            if (c1086gP.h(i11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            c0964y2 = c0964y;
                        } else {
                            c0964y2 = c0964y;
                            if ((i12 & 1572864) == 0) {
                                if (c1086gP.K(c0964y2)) {
                                    i24 = 1048576;
                                } else {
                                    i24 = 524288;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((128 & i13) != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (c1086gP.k(qVar)) {
                                i25 = 8388608;
                            } else {
                                i25 = 4194304;
                            }
                            i14 |= i25;
                        }
                        if ((4793491 & i14) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i14 & 1, z10)) {
                            if (i32 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i33 != 0) {
                                interfaceC0129e2 = C0945e.f10284a;
                            }
                            if (i15 != 0) {
                                lVar2 = C0945e.f10286c;
                            }
                            if (i17 != 0) {
                                cVar2 = androidx.compose.ui.d.a.j;
                            }
                            i28 = BrazeLogger.SUPPRESS;
                            if (i19 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i10;
                            }
                            if (i21 == 0) {
                                i28 = i11;
                            }
                            if (i23 != 0) {
                                c0964y2 = C0964y.f10346f;
                            }
                            i30 = 3670016 & i14;
                            if (i30 == 1048576) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                            if (z11 || objF == c0153a) {
                                objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                                c1086gP.E(objF);
                            }
                            c0962w = (C0962w) objF;
                            int i34 = i14 >> 3;
                            androidx.compose.ui.h hVar4 = hVar2;
                            zK = ((((i34 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i34 & 6) == 4) | ((((i34 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i34 & 48) == 32) | ((((i34 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i34 & 384) == 256) | ((((i34 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i34 & 3072) == 2048) | ((((57344 & i34) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i34 & 24576) == 16384) | c1086gP.K(c0962w);
                            objF2 = c1086gP.f();
                            if (zK || objF2 == c0153a) {
                                float fMo1getSpacingD9Ej5fM = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                                int i35 = r.f10313a;
                                objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                                c1086gP.E(objF2);
                            }
                            flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                            if (i30 == 1048576) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((29360128 & i14) == 8388608) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z16 = z12 | z13;
                            if ((458752 & i14) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z16 | z14;
                            Object objF4 = c1086gP.f();
                            obj = objF4;
                            if (z15 || objF4 == c0153a) {
                                arrayList = new ArrayList();
                                arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        int iIntValue = num.intValue();
                                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                        } else {
                                            interfaceC1084f3.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }));
                                lVar4 = c0964y2.f10127d;
                                if (lVar4 != null) {
                                    pVarInvoke = lVar4.invoke(c0962w);
                                } else {
                                    pVarInvoke = null;
                                }
                                Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar5 = c0964y2.f10128e;
                                pVarInvoke2 = lVar5 != null ? lVar5.invoke(c0962w) : null;
                                iOrdinal = c0964y2.f10124a.ordinal();
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        if (pVarInvoke != null) {
                                            arrayList.add(pVarInvoke);
                                        }
                                        if (pVarInvoke2 != null) {
                                            arrayList.add(pVarInvoke2);
                                        }
                                    }
                                } else if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                c1086gP.E(arrayList);
                                obj = arrayList;
                            }
                            ComposableLambdaImpl composableLambdaImplA = C1174u.a((List) obj);
                            zK2 = c1086gP.K(flowMeasurePolicy);
                            objF3 = c1086gP.f();
                            if (zK2 || objF3 == c0153a) {
                                objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                                c1086gP.E(objF3);
                            }
                            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF3;
                            i31 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar4);
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e10);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i31))) {
                                J4.i.d(i31, c1086gP, i31, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                            composableLambdaImplA.invoke(c1086gP, 0);
                            c1086gP.T(true);
                            i26 = i28;
                            lVar3 = lVar2;
                            interfaceC0129e3 = interfaceC0129e2;
                            c0964y3 = c0964y2;
                            i27 = i29;
                            hVar3 = hVar4;
                        } else {
                            c1086gP.w();
                            i26 = i11;
                            lVar3 = lVar2;
                            hVar3 = hVar2;
                            interfaceC0129e3 = interfaceC0129e2;
                            c0964y3 = c0964y2;
                            i27 = i10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final androidx.compose.ui.d.c cVar3 = cVar2;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar3, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i14 |= 24576;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (c1086gP.h(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        c0964y2 = c0964y;
                    } else {
                        c0964y2 = c0964y;
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.K(c0964y2)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((128 & i13) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((4793491 & i14) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i32 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i33 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar2 = androidx.compose.ui.d.a.j;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i10;
                        }
                        if (i21 == 0) {
                            i28 = i11;
                        }
                        if (i23 != 0) {
                            c0964y2 = C0964y.f10346f;
                        }
                        i30 = 3670016 & i14;
                        if (i30 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                        if (z11) {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        } else {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        }
                        c0962w = (C0962w) objF;
                        int i36 = i14 >> 3;
                        androidx.compose.ui.h hVar5 = hVar2;
                        zK = ((((i36 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i36 & 6) == 4) | ((((i36 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i36 & 48) == 32) | ((((i36 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i36 & 384) == 256) | ((((i36 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i36 & 3072) == 2048) | ((((57344 & i36) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i36 & 24576) == 16384) | c1086gP.K(c0962w);
                        objF2 = c1086gP.f();
                        if (zK) {
                            float fMo1getSpacingD9Ej5fM2 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i37 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM2, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        } else {
                            float fMo1getSpacingD9Ej5fM3 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i38 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM3, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        }
                        flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                        if (i30 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z17 = z12 | z13;
                        if ((458752 & i14) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z17 | z14;
                        Object objF5 = c1086gP.f();
                        obj = objF5;
                        if (z15) {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar6 = c0964y2.f10128e;
                            if (lVar6 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        } else {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar7 = c0964y2.f10128e;
                            if (lVar7 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        }
                        ComposableLambdaImpl composableLambdaImplA2 = C1174u.a((List) obj);
                        zK2 = c1086gP.K(flowMeasurePolicy);
                        objF3 = c1086gP.f();
                        if (zK2) {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        }
                        androidx.compose.ui.layout.E e11 = (androidx.compose.ui.layout.E) objF3;
                        i31 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e11);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        } else {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                        composableLambdaImplA2.invoke(c1086gP, 0);
                        c1086gP.T(true);
                        i26 = i28;
                        lVar3 = lVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i29;
                        hVar3 = hVar5;
                    } else {
                        c1086gP.w();
                        i26 = i11;
                        lVar3 = lVar2;
                        hVar3 = hVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.d.c cVar4 = cVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar4, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 3072;
                cVar2 = cVar;
                i19 = 16 & i13;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        if (c1086gP.h(i10)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (c1086gP.h(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        c0964y2 = c0964y;
                    } else {
                        c0964y2 = c0964y;
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.K(c0964y2)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((128 & i13) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((4793491 & i14) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i32 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i33 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar2 = androidx.compose.ui.d.a.j;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i10;
                        }
                        if (i21 == 0) {
                            i28 = i11;
                        }
                        if (i23 != 0) {
                            c0964y2 = C0964y.f10346f;
                        }
                        i30 = 3670016 & i14;
                        if (i30 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                        if (z11) {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        } else {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        }
                        c0962w = (C0962w) objF;
                        int i39 = i14 >> 3;
                        androidx.compose.ui.h hVar6 = hVar2;
                        zK = ((((i39 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i39 & 6) == 4) | ((((i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i39 & 48) == 32) | ((((i39 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i39 & 384) == 256) | ((((i39 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i39 & 3072) == 2048) | ((((57344 & i39) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i39 & 24576) == 16384) | c1086gP.K(c0962w);
                        objF2 = c1086gP.f();
                        if (zK) {
                            float fMo1getSpacingD9Ej5fM4 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i310 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM4, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        } else {
                            float fMo1getSpacingD9Ej5fM5 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i311 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM5, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        }
                        flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                        if (i30 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z18 = z12 | z13;
                        if ((458752 & i14) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z18 | z14;
                        Object objF6 = c1086gP.f();
                        obj = objF6;
                        if (z15) {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar8 = c0964y2.f10128e;
                            if (lVar8 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        } else {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar9 = c0964y2.f10128e;
                            if (lVar9 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        }
                        ComposableLambdaImpl composableLambdaImplA3 = C1174u.a((List) obj);
                        zK2 = c1086gP.K(flowMeasurePolicy);
                        objF3 = c1086gP.f();
                        if (zK2) {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        }
                        androidx.compose.ui.layout.E e12 = (androidx.compose.ui.layout.E) objF3;
                        i31 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar6);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e12);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        } else {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                        composableLambdaImplA3.invoke(c1086gP, 0);
                        c1086gP.T(true);
                        i26 = i28;
                        lVar3 = lVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i29;
                        hVar3 = hVar6;
                    } else {
                        c1086gP.w();
                        i26 = i11;
                        lVar3 = lVar2;
                        hVar3 = hVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.d.c cVar5 = cVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar5, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i312 = i14 >> 3;
                    androidx.compose.ui.h hVar7 = hVar2;
                    zK = ((((i312 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i312 & 6) == 4) | ((((i312 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i312 & 48) == 32) | ((((i312 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i312 & 384) == 256) | ((((i312 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i312 & 3072) == 2048) | ((((57344 & i312) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i312 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM6 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i313 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM6, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM7 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i314 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM7, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z19 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z19 | z14;
                    Object objF7 = c1086gP.f();
                    obj = objF7;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar10 = c0964y2.f10128e;
                        if (lVar10 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar11 = c0964y2.f10128e;
                        if (lVar11 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA4 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e13 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVar7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                    composableLambdaImplA4.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar7;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar6 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar6, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 384;
            lVar2 = lVar;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = 16 & i13;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        if (c1086gP.h(i10)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (c1086gP.h(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        c0964y2 = c0964y;
                    } else {
                        c0964y2 = c0964y;
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.K(c0964y2)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((128 & i13) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((4793491 & i14) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i32 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i33 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar2 = androidx.compose.ui.d.a.j;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i10;
                        }
                        if (i21 == 0) {
                            i28 = i11;
                        }
                        if (i23 != 0) {
                            c0964y2 = C0964y.f10346f;
                        }
                        i30 = 3670016 & i14;
                        if (i30 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                        if (z11) {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        } else {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        }
                        c0962w = (C0962w) objF;
                        int i315 = i14 >> 3;
                        androidx.compose.ui.h hVar8 = hVar2;
                        zK = ((((i315 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i315 & 6) == 4) | ((((i315 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i315 & 48) == 32) | ((((i315 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i315 & 384) == 256) | ((((i315 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i315 & 3072) == 2048) | ((((57344 & i315) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i315 & 24576) == 16384) | c1086gP.K(c0962w);
                        objF2 = c1086gP.f();
                        if (zK) {
                            float fMo1getSpacingD9Ej5fM8 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i316 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM8, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        } else {
                            float fMo1getSpacingD9Ej5fM9 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i317 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM9, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        }
                        flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                        if (i30 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z110 = z12 | z13;
                        if ((458752 & i14) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z110 | z14;
                        Object objF8 = c1086gP.f();
                        obj = objF8;
                        if (z15) {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar12 = c0964y2.f10128e;
                            if (lVar12 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        } else {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar13 = c0964y2.f10128e;
                            if (lVar13 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        }
                        ComposableLambdaImpl composableLambdaImplA5 = C1174u.a((List) obj);
                        zK2 = c1086gP.K(flowMeasurePolicy);
                        objF3 = c1086gP.f();
                        if (zK2) {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        }
                        androidx.compose.ui.layout.E e14 = (androidx.compose.ui.layout.E) objF3;
                        i31 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVar8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e14);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        } else {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                        composableLambdaImplA5.invoke(c1086gP, 0);
                        c1086gP.T(true);
                        i26 = i28;
                        lVar3 = lVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i29;
                        hVar3 = hVar8;
                    } else {
                        c1086gP.w();
                        i26 = i11;
                        lVar3 = lVar2;
                        hVar3 = hVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.d.c cVar7 = cVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar7, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i318 = i14 >> 3;
                    androidx.compose.ui.h hVar9 = hVar2;
                    zK = ((((i318 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i318 & 6) == 4) | ((((i318 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i318 & 48) == 32) | ((((i318 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i318 & 384) == 256) | ((((i318 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i318 & 3072) == 2048) | ((((57344 & i318) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i318 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM10 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i319 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM10, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM11 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i3110 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM11, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z111 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z111 | z14;
                    Object objF9 = c1086gP.f();
                    obj = objF9;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar14 = c0964y2.f10128e;
                        if (lVar14 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar15 = c0964y2.f10128e;
                        if (lVar15 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA6 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e15 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVar9);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e15);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                    composableLambdaImplA6.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar9;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar8 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar8, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            cVar2 = cVar;
            i19 = 16 & i13;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.h(i10)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i3111 = i14 >> 3;
                    androidx.compose.ui.h hVar10 = hVar2;
                    zK = ((((i3111 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i3111 & 6) == 4) | ((((i3111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i3111 & 48) == 32) | ((((i3111 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i3111 & 384) == 256) | ((((i3111 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i3111 & 3072) == 2048) | ((((57344 & i3111) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i3111 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM12 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i3112 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM12, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM13 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i3113 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM13, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z112 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z112 | z14;
                    Object objF10 = c1086gP.f();
                    obj = objF10;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar16 = c0964y2.f10128e;
                        if (lVar16 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar17 = c0964y2.f10128e;
                        if (lVar17 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA7 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e16 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar10);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e16);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                    composableLambdaImplA7.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar10;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar9 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar9, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.h(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                c0964y2 = c0964y;
            } else {
                c0964y2 = c0964y;
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.K(c0964y2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
            }
            if ((128 & i13) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(qVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((4793491 & i14) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i32 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i33 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar2 = androidx.compose.ui.d.a.j;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i10;
                }
                if (i21 == 0) {
                    i28 = i11;
                }
                if (i23 != 0) {
                    c0964y2 = C0964y.f10346f;
                }
                i30 = 3670016 & i14;
                if (i30 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a8 = InterfaceC1084f.a.f12980a;
                if (z11) {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                } else {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                }
                c0962w = (C0962w) objF;
                int i3114 = i14 >> 3;
                androidx.compose.ui.h hVar11 = hVar2;
                zK = ((((i3114 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i3114 & 6) == 4) | ((((i3114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i3114 & 48) == 32) | ((((i3114 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i3114 & 384) == 256) | ((((i3114 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i3114 & 3072) == 2048) | ((((57344 & i3114) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i3114 & 24576) == 16384) | c1086gP.K(c0962w);
                objF2 = c1086gP.f();
                if (zK) {
                    float fMo1getSpacingD9Ej5fM14 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i3115 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM14, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                } else {
                    float fMo1getSpacingD9Ej5fM15 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i3116 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM15, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                }
                flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                if (i30 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z113 = z12 | z13;
                if ((458752 & i14) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z113 | z14;
                Object objF11 = c1086gP.f();
                obj = objF11;
                if (z15) {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar18 = c0964y2.f10128e;
                    if (lVar18 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar19 = c0964y2.f10128e;
                    if (lVar19 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                }
                ComposableLambdaImpl composableLambdaImplA8 = C1174u.a((List) obj);
                zK2 = c1086gP.K(flowMeasurePolicy);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.layout.E e17 = (androidx.compose.ui.layout.E) objF3;
                i31 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVar11);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e17);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i31, c1086gP, i31, pVar);
                } else {
                    J4.i.d(i31, c1086gP, i31, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                composableLambdaImplA8.invoke(c1086gP, 0);
                c1086gP.T(true);
                i26 = i28;
                lVar3 = lVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i29;
                hVar3 = hVar11;
            } else {
                c1086gP.w();
                i26 = i11;
                lVar3 = lVar2;
                hVar3 = hVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar10 = cVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar10, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 48;
        interfaceC0129e2 = interfaceC0129e;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 384) == 0) {
                lVar2 = lVar;
                if (c1086gP.K(lVar2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVar2 = cVar;
                    if (c1086gP.K(cVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = 16 & i13;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        if (c1086gP.h(i10)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= 196608;
                    } else if ((i12 & 196608) == 0) {
                        if (c1086gP.h(i11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        c0964y2 = c0964y;
                    } else {
                        c0964y2 = c0964y;
                        if ((i12 & 1572864) == 0) {
                            if (c1086gP.K(c0964y2)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((128 & i13) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(qVar)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    if ((4793491 & i14) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i14 & 1, z10)) {
                        if (i32 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i33 != 0) {
                            interfaceC0129e2 = C0945e.f10284a;
                        }
                        if (i15 != 0) {
                            lVar2 = C0945e.f10286c;
                        }
                        if (i17 != 0) {
                            cVar2 = androidx.compose.ui.d.a.j;
                        }
                        i28 = BrazeLogger.SUPPRESS;
                        if (i19 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i10;
                        }
                        if (i21 == 0) {
                            i28 = i11;
                        }
                        if (i23 != 0) {
                            c0964y2 = C0964y.f10346f;
                        }
                        i30 = 3670016 & i14;
                        if (i30 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        InterfaceC1084f.a.C0153a c0153a9 = InterfaceC1084f.a.f12980a;
                        if (z11) {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        } else {
                            objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                            c1086gP.E(objF);
                        }
                        c0962w = (C0962w) objF;
                        int i3117 = i14 >> 3;
                        androidx.compose.ui.h hVar12 = hVar2;
                        zK = ((((i3117 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i3117 & 6) == 4) | ((((i3117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i3117 & 48) == 32) | ((((i3117 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i3117 & 384) == 256) | ((((i3117 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i3117 & 3072) == 2048) | ((((57344 & i3117) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i3117 & 24576) == 16384) | c1086gP.K(c0962w);
                        objF2 = c1086gP.f();
                        if (zK) {
                            float fMo1getSpacingD9Ej5fM16 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i3118 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM16, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        } else {
                            float fMo1getSpacingD9Ej5fM17 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                            int i3119 = r.f10313a;
                            objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM17, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                            c1086gP.E(objF2);
                        }
                        flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                        if (i30 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z114 = z12 | z13;
                        if ((458752 & i14) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z114 | z14;
                        Object objF12 = c1086gP.f();
                        obj = objF12;
                        if (z15) {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar110 = c0964y2.f10128e;
                            if (lVar110 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        } else {
                            arrayList = new ArrayList();
                            arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }));
                            lVar4 = c0964y2.f10127d;
                            if (lVar4 != null) {
                                pVarInvoke = lVar4.invoke(c0962w);
                            } else {
                                pVarInvoke = null;
                            }
                            Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar111 = c0964y2.f10128e;
                            if (lVar111 != null) {
                            }
                            iOrdinal = c0964y2.f10124a.ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (pVarInvoke != null) {
                                        arrayList.add(pVarInvoke);
                                    }
                                    if (pVarInvoke2 != null) {
                                        arrayList.add(pVarInvoke2);
                                    }
                                }
                            } else if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            c1086gP.E(arrayList);
                            obj = arrayList;
                        }
                        ComposableLambdaImpl composableLambdaImplA9 = C1174u.a((List) obj);
                        zK2 = c1086gP.K(flowMeasurePolicy);
                        objF3 = c1086gP.f();
                        if (zK2) {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                            c1086gP.E(objF3);
                        }
                        androidx.compose.ui.layout.E e18 = (androidx.compose.ui.layout.E) objF3;
                        i31 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                        androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVar12);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e18);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        } else {
                            J4.i.d(i31, c1086gP, i31, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                        composableLambdaImplA9.invoke(c1086gP, 0);
                        c1086gP.T(true);
                        i26 = i28;
                        lVar3 = lVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i29;
                        hVar3 = hVar12;
                    } else {
                        c1086gP.w();
                        i26 = i11;
                        lVar3 = lVar2;
                        hVar3 = hVar2;
                        interfaceC0129e3 = interfaceC0129e2;
                        c0964y3 = c0964y2;
                        i27 = i10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.d.c cVar11 = cVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar11, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a10 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i31110 = i14 >> 3;
                    androidx.compose.ui.h hVar13 = hVar2;
                    zK = ((((i31110 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i31110 & 6) == 4) | ((((i31110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i31110 & 48) == 32) | ((((i31110 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i31110 & 384) == 256) | ((((i31110 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i31110 & 3072) == 2048) | ((((57344 & i31110) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i31110 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM18 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i31111 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM18, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM19 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i31112 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM19, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z115 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z115 | z14;
                    Object objF13 = c1086gP.f();
                    obj = objF13;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar112 = c0964y2.f10128e;
                        if (lVar112 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar113 = c0964y2.f10128e;
                        if (lVar113 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA10 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e19 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVar13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                    composableLambdaImplA10.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar13;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar12 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar12, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            cVar2 = cVar;
            i19 = 16 & i13;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.h(i10)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a11 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i31113 = i14 >> 3;
                    androidx.compose.ui.h hVar14 = hVar2;
                    zK = ((((i31113 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i31113 & 6) == 4) | ((((i31113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i31113 & 48) == 32) | ((((i31113 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i31113 & 384) == 256) | ((((i31113 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i31113 & 3072) == 2048) | ((((57344 & i31113) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i31113 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM110 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i31114 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM110, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM111 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i31115 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM111, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z116 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z116 | z14;
                    Object objF14 = c1086gP.f();
                    obj = objF14;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar114 = c0964y2.f10128e;
                        if (lVar114 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar115 = c0964y2.f10128e;
                        if (lVar115 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA11 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e110 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVar14);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                    composableLambdaImplA11.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar14;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar13 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar13, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.h(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                c0964y2 = c0964y;
            } else {
                c0964y2 = c0964y;
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.K(c0964y2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
            }
            if ((128 & i13) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(qVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((4793491 & i14) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i32 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i33 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar2 = androidx.compose.ui.d.a.j;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i10;
                }
                if (i21 == 0) {
                    i28 = i11;
                }
                if (i23 != 0) {
                    c0964y2 = C0964y.f10346f;
                }
                i30 = 3670016 & i14;
                if (i30 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a12 = InterfaceC1084f.a.f12980a;
                if (z11) {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                } else {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                }
                c0962w = (C0962w) objF;
                int i31116 = i14 >> 3;
                androidx.compose.ui.h hVar15 = hVar2;
                zK = ((((i31116 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i31116 & 6) == 4) | ((((i31116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i31116 & 48) == 32) | ((((i31116 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i31116 & 384) == 256) | ((((i31116 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i31116 & 3072) == 2048) | ((((57344 & i31116) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i31116 & 24576) == 16384) | c1086gP.K(c0962w);
                objF2 = c1086gP.f();
                if (zK) {
                    float fMo1getSpacingD9Ej5fM112 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i31117 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM112, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                } else {
                    float fMo1getSpacingD9Ej5fM113 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i31118 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM113, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                }
                flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                if (i30 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z117 = z12 | z13;
                if ((458752 & i14) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z117 | z14;
                Object objF15 = c1086gP.f();
                obj = objF15;
                if (z15) {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar116 = c0964y2.f10128e;
                    if (lVar116 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar117 = c0964y2.f10128e;
                    if (lVar117 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                }
                ComposableLambdaImpl composableLambdaImplA12 = C1174u.a((List) obj);
                zK2 = c1086gP.K(flowMeasurePolicy);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.layout.E e111 = (androidx.compose.ui.layout.E) objF3;
                i31 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVar15);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e111);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i31, c1086gP, i31, pVar);
                } else {
                    J4.i.d(i31, c1086gP, i31, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                composableLambdaImplA12.invoke(c1086gP, 0);
                c1086gP.T(true);
                i26 = i28;
                lVar3 = lVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i29;
                hVar3 = hVar15;
            } else {
                c1086gP.w();
                i26 = i11;
                lVar3 = lVar2;
                hVar3 = hVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar14 = cVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar14, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 384;
        lVar2 = lVar;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                cVar2 = cVar;
                if (c1086gP.K(cVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = 16 & i13;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.h(i10)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= 196608;
                } else if ((i12 & 196608) == 0) {
                    if (c1086gP.h(i11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    c0964y2 = c0964y;
                } else {
                    c0964y2 = c0964y;
                    if ((i12 & 1572864) == 0) {
                        if (c1086gP.K(c0964y2)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                }
                if ((128 & i13) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(qVar)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                if ((4793491 & i14) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i14 & 1, z10)) {
                    if (i32 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i33 != 0) {
                        interfaceC0129e2 = C0945e.f10284a;
                    }
                    if (i15 != 0) {
                        lVar2 = C0945e.f10286c;
                    }
                    if (i17 != 0) {
                        cVar2 = androidx.compose.ui.d.a.j;
                    }
                    i28 = BrazeLogger.SUPPRESS;
                    if (i19 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i10;
                    }
                    if (i21 == 0) {
                        i28 = i11;
                    }
                    if (i23 != 0) {
                        c0964y2 = C0964y.f10346f;
                    }
                    i30 = 3670016 & i14;
                    if (i30 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a13 = InterfaceC1084f.a.f12980a;
                    if (z11) {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    } else {
                        objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                        c1086gP.E(objF);
                    }
                    c0962w = (C0962w) objF;
                    int i31119 = i14 >> 3;
                    androidx.compose.ui.h hVar16 = hVar2;
                    zK = ((((i31119 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i31119 & 6) == 4) | ((((i31119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i31119 & 48) == 32) | ((((i31119 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i31119 & 384) == 256) | ((((i31119 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i31119 & 3072) == 2048) | ((((57344 & i31119) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i31119 & 24576) == 16384) | c1086gP.K(c0962w);
                    objF2 = c1086gP.f();
                    if (zK) {
                        float fMo1getSpacingD9Ej5fM114 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i311110 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM114, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    } else {
                        float fMo1getSpacingD9Ej5fM115 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                        int i311111 = r.f10313a;
                        objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM115, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                        c1086gP.E(objF2);
                    }
                    flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                    if (i30 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z118 = z12 | z13;
                    if ((458752 & i14) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z118 | z14;
                    Object objF16 = c1086gP.f();
                    obj = objF16;
                    if (z15) {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar118 = c0964y2.f10128e;
                        if (lVar118 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    } else {
                        arrayList = new ArrayList();
                        arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        lVar4 = c0964y2.f10127d;
                        if (lVar4 != null) {
                            pVarInvoke = lVar4.invoke(c0962w);
                        } else {
                            pVarInvoke = null;
                        }
                        Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar119 = c0964y2.f10128e;
                        if (lVar119 != null) {
                        }
                        iOrdinal = c0964y2.f10124a.ordinal();
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                if (pVarInvoke != null) {
                                    arrayList.add(pVarInvoke);
                                }
                                if (pVarInvoke2 != null) {
                                    arrayList.add(pVarInvoke2);
                                }
                            }
                        } else if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        c1086gP.E(arrayList);
                        obj = arrayList;
                    }
                    ComposableLambdaImpl composableLambdaImplA13 = C1174u.a((List) obj);
                    zK2 = c1086gP.K(flowMeasurePolicy);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.layout.E e112 = (androidx.compose.ui.layout.E) objF3;
                    i31 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVar16);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e112);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    } else {
                        J4.i.d(i31, c1086gP, i31, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                    composableLambdaImplA13.invoke(c1086gP, 0);
                    c1086gP.T(true);
                    i26 = i28;
                    lVar3 = lVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i29;
                    hVar3 = hVar16;
                } else {
                    c1086gP.w();
                    i26 = i11;
                    lVar3 = lVar2;
                    hVar3 = hVar2;
                    interfaceC0129e3 = interfaceC0129e2;
                    c0964y3 = c0964y2;
                    i27 = i10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.d.c cVar15 = cVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar15, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.h(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                c0964y2 = c0964y;
            } else {
                c0964y2 = c0964y;
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.K(c0964y2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
            }
            if ((128 & i13) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(qVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((4793491 & i14) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i32 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i33 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar2 = androidx.compose.ui.d.a.j;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i10;
                }
                if (i21 == 0) {
                    i28 = i11;
                }
                if (i23 != 0) {
                    c0964y2 = C0964y.f10346f;
                }
                i30 = 3670016 & i14;
                if (i30 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a14 = InterfaceC1084f.a.f12980a;
                if (z11) {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                } else {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                }
                c0962w = (C0962w) objF;
                int i311112 = i14 >> 3;
                androidx.compose.ui.h hVar17 = hVar2;
                zK = ((((i311112 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i311112 & 6) == 4) | ((((i311112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i311112 & 48) == 32) | ((((i311112 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i311112 & 384) == 256) | ((((i311112 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i311112 & 3072) == 2048) | ((((57344 & i311112) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i311112 & 24576) == 16384) | c1086gP.K(c0962w);
                objF2 = c1086gP.f();
                if (zK) {
                    float fMo1getSpacingD9Ej5fM116 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i311113 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM116, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                } else {
                    float fMo1getSpacingD9Ej5fM117 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i311114 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM117, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                }
                flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                if (i30 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z119 = z12 | z13;
                if ((458752 & i14) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z119 | z14;
                Object objF17 = c1086gP.f();
                obj = objF17;
                if (z15) {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1110 = c0964y2.f10128e;
                    if (lVar1110 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1111 = c0964y2.f10128e;
                    if (lVar1111 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                }
                ComposableLambdaImpl composableLambdaImplA14 = C1174u.a((List) obj);
                zK2 = c1086gP.K(flowMeasurePolicy);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.layout.E e113 = (androidx.compose.ui.layout.E) objF3;
                i31 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVar17);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e113);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i31, c1086gP, i31, pVar);
                } else {
                    J4.i.d(i31, c1086gP, i31, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                composableLambdaImplA14.invoke(c1086gP, 0);
                c1086gP.T(true);
                i26 = i28;
                lVar3 = lVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i29;
                hVar3 = hVar17;
            } else {
                c1086gP.w();
                i26 = i11;
                lVar3 = lVar2;
                hVar3 = hVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar16 = cVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar16, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 3072;
        cVar2 = cVar;
        i19 = 16 & i13;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                if (c1086gP.h(i10)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= 196608;
            } else if ((i12 & 196608) == 0) {
                if (c1086gP.h(i11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                c0964y2 = c0964y;
            } else {
                c0964y2 = c0964y;
                if ((i12 & 1572864) == 0) {
                    if (c1086gP.K(c0964y2)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
            }
            if ((128 & i13) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(qVar)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            if ((4793491 & i14) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i14 & 1, z10)) {
                if (i32 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i33 != 0) {
                    interfaceC0129e2 = C0945e.f10284a;
                }
                if (i15 != 0) {
                    lVar2 = C0945e.f10286c;
                }
                if (i17 != 0) {
                    cVar2 = androidx.compose.ui.d.a.j;
                }
                i28 = BrazeLogger.SUPPRESS;
                if (i19 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i10;
                }
                if (i21 == 0) {
                    i28 = i11;
                }
                if (i23 != 0) {
                    c0964y2 = C0964y.f10346f;
                }
                i30 = 3670016 & i14;
                if (i30 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a15 = InterfaceC1084f.a.f12980a;
                if (z11) {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                } else {
                    objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                    c1086gP.E(objF);
                }
                c0962w = (C0962w) objF;
                int i311115 = i14 >> 3;
                androidx.compose.ui.h hVar18 = hVar2;
                zK = ((((i311115 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i311115 & 6) == 4) | ((((i311115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i311115 & 48) == 32) | ((((i311115 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i311115 & 384) == 256) | ((((i311115 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i311115 & 3072) == 2048) | ((((57344 & i311115) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i311115 & 24576) == 16384) | c1086gP.K(c0962w);
                objF2 = c1086gP.f();
                if (zK) {
                    float fMo1getSpacingD9Ej5fM118 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i311116 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM118, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                } else {
                    float fMo1getSpacingD9Ej5fM119 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                    int i311117 = r.f10313a;
                    objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM119, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                    c1086gP.E(objF2);
                }
                flowMeasurePolicy = (FlowMeasurePolicy) objF2;
                if (i30 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1110 = z12 | z13;
                if ((458752 & i14) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z1110 | z14;
                Object objF18 = c1086gP.f();
                obj = objF18;
                if (z15) {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1112 = c0964y2.f10128e;
                    if (lVar1112 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                } else {
                    arrayList = new ArrayList();
                    arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }));
                    lVar4 = c0964y2.f10127d;
                    if (lVar4 != null) {
                        pVarInvoke = lVar4.invoke(c0962w);
                    } else {
                        pVarInvoke = null;
                    }
                    Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1113 = c0964y2.f10128e;
                    if (lVar1113 != null) {
                    }
                    iOrdinal = c0964y2.f10124a.ordinal();
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (pVarInvoke != null) {
                                arrayList.add(pVarInvoke);
                            }
                            if (pVarInvoke2 != null) {
                                arrayList.add(pVarInvoke2);
                            }
                        }
                    } else if (pVarInvoke != null) {
                        arrayList.add(pVarInvoke);
                    }
                    c1086gP.E(arrayList);
                    obj = arrayList;
                }
                ComposableLambdaImpl composableLambdaImplA15 = C1174u.a((List) obj);
                zK2 = c1086gP.K(flowMeasurePolicy);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.layout.E e114 = (androidx.compose.ui.layout.E) objF3;
                i31 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVar18);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e114);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i31, c1086gP, i31, pVar);
                } else {
                    J4.i.d(i31, c1086gP, i31, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                composableLambdaImplA15.invoke(c1086gP, 0);
                c1086gP.T(true);
                i26 = i28;
                lVar3 = lVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i29;
                hVar3 = hVar18;
            } else {
                c1086gP.w();
                i26 = i11;
                lVar3 = lVar2;
                hVar3 = hVar2;
                interfaceC0129e3 = interfaceC0129e2;
                c0964y3 = c0964y2;
                i27 = i10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.d.c cVar17 = cVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar17, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 24576;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= 196608;
        } else if ((i12 & 196608) == 0) {
            if (c1086gP.h(i11)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
            c0964y2 = c0964y;
        } else {
            c0964y2 = c0964y;
            if ((i12 & 1572864) == 0) {
                if (c1086gP.K(c0964y2)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
        }
        if ((128 & i13) != 0) {
            i14 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c1086gP.k(qVar)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i14 |= i25;
        }
        if ((4793491 & i14) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i14 & 1, z10)) {
            if (i32 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            }
            if (i33 != 0) {
                interfaceC0129e2 = C0945e.f10284a;
            }
            if (i15 != 0) {
                lVar2 = C0945e.f10286c;
            }
            if (i17 != 0) {
                cVar2 = androidx.compose.ui.d.a.j;
            }
            i28 = BrazeLogger.SUPPRESS;
            if (i19 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i10;
            }
            if (i21 == 0) {
                i28 = i11;
            }
            if (i23 != 0) {
                c0964y2 = C0964y.f10346f;
            }
            i30 = 3670016 & i14;
            if (i30 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a16 = InterfaceC1084f.a.f12980a;
            if (z11) {
                objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                c1086gP.E(objF);
            } else {
                objF = new C0962w(c0964y2.f10124a, c0964y2.f10125b, c0964y2.f10126c);
                c1086gP.E(objF);
            }
            c0962w = (C0962w) objF;
            int i311118 = i14 >> 3;
            androidx.compose.ui.h hVar19 = hVar2;
            zK = ((((i311118 & 14) ^ 6) <= 4 && c1086gP.K(interfaceC0129e2)) || (i311118 & 6) == 4) | ((((i311118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.K(lVar2)) || (i311118 & 48) == 32) | ((((i311118 & 896) ^ 384) <= 256 && c1086gP.K(cVar2)) || (i311118 & 384) == 256) | ((((i311118 & 7168) ^ 3072) <= 2048 && c1086gP.h(i29)) || (i311118 & 3072) == 2048) | ((((57344 & i311118) ^ 24576) <= 16384 && c1086gP.h(i28)) || (i311118 & 24576) == 16384) | c1086gP.K(c0962w);
            objF2 = c1086gP.f();
            if (zK) {
                float fMo1getSpacingD9Ej5fM1110 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                int i311119 = r.f10313a;
                objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM1110, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                c1086gP.E(objF2);
            } else {
                float fMo1getSpacingD9Ej5fM1111 = interfaceC0129e2.mo1getSpacingD9Ej5fM();
                int i3111110 = r.f10313a;
                objF2 = new FlowMeasurePolicy(interfaceC0129e2, lVar2, fMo1getSpacingD9Ej5fM1111, new r.e(cVar2), lVar2.mo1getSpacingD9Ej5fM(), i29, i28, c0962w);
                c1086gP.E(objF2);
            }
            flowMeasurePolicy = (FlowMeasurePolicy) objF2;
            if (i30 == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((29360128 & i14) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z1111 = z12 | z13;
            if ((458752 & i14) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z1111 | z14;
            Object objF19 = c1086gP.f();
            obj = objF19;
            if (z15) {
                arrayList = new ArrayList();
                arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }));
                lVar4 = c0964y2.f10127d;
                if (lVar4 != null) {
                    pVarInvoke = lVar4.invoke(c0962w);
                } else {
                    pVarInvoke = null;
                }
                Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1114 = c0964y2.f10128e;
                if (lVar1114 != null) {
                }
                iOrdinal = c0964y2.f10124a.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        if (pVarInvoke2 != null) {
                            arrayList.add(pVarInvoke2);
                        }
                    }
                } else if (pVarInvoke != null) {
                    arrayList.add(pVarInvoke);
                }
                c1086gP.E(arrayList);
                obj = arrayList;
            } else {
                arrayList = new ArrayList();
                arrayList.add(new ComposableLambdaImpl(true, 702094978, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$list$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            qVar.invoke(A.f10080a, interfaceC1084f3, 6);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }));
                lVar4 = c0964y2.f10127d;
                if (lVar4 != null) {
                    pVarInvoke = lVar4.invoke(c0962w);
                } else {
                    pVarInvoke = null;
                }
                Ia.l<C0962w, Ia.p<InterfaceC1084f, Integer, p293xa.r>> lVar1115 = c0964y2.f10128e;
                if (lVar1115 != null) {
                }
                iOrdinal = c0964y2.f10124a.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (pVarInvoke != null) {
                            arrayList.add(pVarInvoke);
                        }
                        if (pVarInvoke2 != null) {
                            arrayList.add(pVarInvoke2);
                        }
                    }
                } else if (pVarInvoke != null) {
                    arrayList.add(pVarInvoke);
                }
                c1086gP.E(arrayList);
                obj = arrayList;
            }
            ComposableLambdaImpl composableLambdaImplA16 = C1174u.a((List) obj);
            zK2 = c1086gP.K(flowMeasurePolicy);
            objF3 = c1086gP.f();
            if (zK2) {
                objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                c1086gP.E(objF3);
            } else {
                objF3 = new androidx.compose.ui.layout.L(flowMeasurePolicy);
                c1086gP.E(objF3);
            }
            androidx.compose.ui.layout.E e115 = (androidx.compose.ui.layout.E) objF3;
            i31 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
            androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVar19);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e115);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i31, c1086gP, i31, pVar);
            } else {
                J4.i.d(i31, c1086gP, i31, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
            composableLambdaImplA16.invoke(c1086gP, 0);
            c1086gP.T(true);
            i26 = i28;
            lVar3 = lVar2;
            interfaceC0129e3 = interfaceC0129e2;
            c0964y3 = c0964y2;
            i27 = i29;
            hVar3 = hVar19;
        } else {
            c1086gP.w();
            i26 = i11;
            lVar3 = lVar2;
            hVar3 = hVar2;
            interfaceC0129e3 = interfaceC0129e2;
            c0964y3 = c0964y2;
            i27 = i10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.d.c cVar18 = cVar2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$FlowRow$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    FlowLayoutKt.b(hVar3, interfaceC0129e3, lVar3, cVar18, i27, i26, c0964y3, qVar, interfaceC1084f2, L4.b.l(i12 | 1), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final long c(androidx.compose.ui.layout.D d10, FlowMeasurePolicy flowMeasurePolicy, long j, Ia.l lVar) {
        if (com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(d10)) != 0.0f) {
            int I10 = d10.I(BrazeLogger.SUPPRESS);
            return C0880h.a(I10, d10.k0(I10));
        }
        com.google.android.gms.internal.measurement.Y.g(d10);
        androidx.compose.ui.layout.Y yQ = d10.Q(j);
        lVar.invoke(yQ);
        return C0880h.a(flowMeasurePolicy.c(yQ), flowMeasurePolicy.e(yQ));
    }

    public static final androidx.compose.ui.layout.D d(Iterator<? extends androidx.compose.ui.layout.D> it, C.e eVar) {
        try {
            if (!(it instanceof C0957q)) {
                return it.next();
            }
            kotlin.jvm.internal.i.b(eVar);
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
