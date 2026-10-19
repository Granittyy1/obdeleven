package androidx.compose.material3;

import android.view.View;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0163  */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172  */
    /* JADX WARN: Code duplicated, block: B:133:0x0180  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0207  */
    /* JADX WARN: Code duplicated, block: B:171:0x020b  */
    /* JADX WARN: Code duplicated, block: B:172:0x020e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0211  */
    /* JADX WARN: Code duplicated, block: B:175:0x0214  */
    /* JADX WARN: Code duplicated, block: B:177:0x0217  */
    /* JADX WARN: Code duplicated, block: B:178:0x0219  */
    /* JADX WARN: Code duplicated, block: B:181:0x0226  */
    /* JADX WARN: Code duplicated, block: B:184:0x025b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0261  */
    /* JADX WARN: Code duplicated, block: B:190:0x027a  */
    /* JADX WARN: Code duplicated, block: B:193:0x029b  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02af  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:205:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:206:0x0300  */
    /* JADX WARN: Code duplicated, block: B:209:0x030a  */
    /* JADX WARN: Code duplicated, block: B:213:0x031e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0383  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final boolean z10, final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, ScrollState scrollState, boolean z11, androidx.compose.ui.graphics.l0 l0Var, long j, float f10, float f11, C0937i c0937i, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.h hVar2;
        int i15;
        ScrollState scrollStateA;
        int i16;
        boolean z12;
        int i17;
        androidx.compose.ui.graphics.l0 l0VarA;
        int i18;
        float f12;
        int i19;
        int i20;
        float f13;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.ui.h hVar3;
        boolean z13;
        long jD;
        float f14;
        float f15;
        C0937i c0937i2;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final androidx.compose.runtime.X x10;
        View view;
        p013b0.c cVar;
        int i28;
        Object objF2;
        final androidx.compose.animation.core.K k10;
        Object objF3;
        final androidx.compose.runtime.X x11;
        boolean zK;
        Object objF4;
        String strC;
        androidx.compose.material3.internal.v vVarB;
        int i29;
        final float f16;
        final float f17;
        final androidx.compose.ui.graphics.l0 l0Var2;
        final androidx.compose.ui.h hVar4;
        final boolean z14;
        final ScrollState scrollState2;
        final C0937i c0937i3;
        Object objF5;
        C1105p0 c1105p0V;
        int i30;
        int i31;
        C1086g c1086gP = interfaceC1084f.p(720925481);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.k(aVar) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & 384) == 0) {
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i10 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        scrollStateA = scrollState;
                        int i32 = c1086gP.K(scrollStateA) ? 2048 : 1024;
                        i13 |= i32;
                    } else {
                        scrollStateA = scrollState;
                    }
                    i13 |= i32;
                } else {
                    scrollStateA = scrollState;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z12 = z11;
                        if (c1086gP.c(z12)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((i10 & 196608) == 0) {
                        l0VarA = l0Var;
                        if ((i12 & 32) == 0 || !c1086gP.K(l0VarA)) {
                            i31 = 65536;
                        } else {
                            i31 = 131072;
                        }
                        i13 |= i31;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i12 & 64) == 0 || !c1086gP.i(j)) {
                            i30 = 524288;
                        } else {
                            i30 = 1048576;
                        }
                        i13 |= i30;
                    }
                    i18 = 128 & i12;
                    if (i18 != 0) {
                        i13 |= 12582912;
                        f12 = f10;
                    } else {
                        f12 = f10;
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.g(f12)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                    }
                    i20 = 256 & i12;
                    if (i20 != 0) {
                        i13 |= 100663296;
                        f13 = f11;
                    } else {
                        f13 = f11;
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.g(f13)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 512;
                    if (i22 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(c0937i)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((1024 & i12) != 0) {
                        i24 = i11 | 6;
                        i25 = 2048;
                    } else {
                        if ((i11 & 6) == 0) {
                            if (c1086gP.k(qVar)) {
                                i26 = 4;
                            } else {
                                i26 = 2;
                            }
                            i24 = i11 | i26;
                        } else {
                            i24 = i11;
                        }
                        i25 = 2048;
                    }
                    if ((i25 & i12) != 0) {
                        if ((i11 & 48) == 0) {
                            if (c1086gP.K(this)) {
                                i27 = 32;
                            } else {
                                i27 = 16;
                            }
                            i24 |= i27;
                        }
                        if ((i13 & 306783379) != 306783378 && (i24 & 19) == 18 && c1086gP.s()) {
                            c1086gP.w();
                            jD = j;
                            f16 = f12;
                            hVar4 = hVar2;
                            l0Var2 = l0VarA;
                            f17 = f13;
                            z14 = z12;
                            scrollState2 = scrollStateA;
                            c0937i3 = c0937i;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i14 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if ((i12 & 8) != 0) {
                                    z13 = true;
                                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                    i13 &= -7169;
                                } else {
                                    z13 = true;
                                }
                                if (i16 != 0) {
                                    z12 = z13;
                                }
                                if ((32 & i12) != 0) {
                                    float f18 = N.f12244a;
                                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    float f19 = N.f12244a;
                                    float f20 = B.p.f1311a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                    i13 &= -3670017;
                                } else {
                                    jD = j;
                                }
                                if (i18 != 0) {
                                    f14 = N.f12244a;
                                } else {
                                    f14 = f12;
                                }
                                if (i20 != 0) {
                                    f15 = N.f12245b;
                                } else {
                                    f15 = f13;
                                }
                                if (i22 != 0) {
                                    c0937i2 = null;
                                } else {
                                    c0937i2 = c0937i;
                                }
                            } else {
                                c1086gP.w();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                if ((32 & i12) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                jD = j;
                                c0937i2 = c0937i;
                                f14 = f12;
                                f15 = f13;
                                hVar3 = hVar2;
                            }
                            c1086gP.U();
                            objF = c1086gP.f();
                            c0153a = InterfaceC1084f.a.f12980a;
                            if (objF == c0153a) {
                                C1085f0 c1085f0 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                                c1086gP.E(c1085f0);
                                objF = c1085f0;
                            }
                            x10 = (androidx.compose.runtime.X) objF;
                            view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap = androidx.compose.foundation.layout.c0.f10254v;
                            i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                            c1086gP.L(321499814);
                            if (z10) {
                                objF5 = c1086gP.f();
                                if (objF5 == c0153a) {
                                    objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                            p293xa.r rVar = p293xa.r.f47939a;
                                            x12.setValue(rVar);
                                            return rVar;
                                        }
                                    };
                                    c1086gP.E(objF5);
                                }
                                ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                            }
                            c1086gP.T(false);
                            objF2 = c1086gP.f();
                            if (objF2 == c0153a) {
                                objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                                c1086gP.E(objF2);
                            }
                            k10 = (androidx.compose.animation.core.K) objF2;
                            k10.f(Boolean.valueOf(z10));
                            if (((Boolean) k10.f9381b.getValue()).booleanValue() || ((Boolean) k10.f9382c.getValue()).booleanValue()) {
                                objF3 = c1086gP.f();
                                if (objF3 == c0153a) {
                                    objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                    c1086gP.E(objF3);
                                }
                                x11 = (androidx.compose.runtime.X) objF3;
                                zK = c1086gP.K(cVar) | c1086gP.h(i28);
                                objF4 = c1086gP.f();
                                if (zK || objF4 == c0153a) {
                                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    c1086gP.E(objF4);
                                }
                                C c10 = (C) objF4;
                                int i33 = B.f12050a;
                                strC = c();
                                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                                if (((Boolean) vVarB.getValue()).booleanValue()) {
                                    i29 = 393216;
                                } else {
                                    i29 = 393248;
                                }
                                if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable") || (kotlin.jvm.internal.i.a(strC, "SecondaryEditable") && !((Boolean) vVarB.getValue()).booleanValue())) {
                                    i29 |= 8;
                                }
                                final androidx.compose.ui.h hVar5 = hVar3;
                                final boolean z15 = z12;
                                final ScrollState scrollState3 = scrollStateA;
                                final androidx.compose.ui.graphics.l0 l0Var3 = l0VarA;
                                final long j10 = jD;
                                final float f21 = f14;
                                final float f22 = f15;
                                final C0937i c0937i4 = c0937i2;
                                AndroidPopup_androidKt.a(c10, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            MenuKt.a(this.this$0.b(hVar5, z15), k10, x11, scrollState3, l0Var3, j10, f21, f22, c0937i4, qVar, interfaceC1084f3, 384);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                            }
                            f16 = f14;
                            f17 = f15;
                            l0Var2 = l0VarA;
                            hVar4 = hVar3;
                            z14 = z12;
                            scrollState2 = scrollStateA;
                            c0937i3 = c0937i2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final long j11 = jD;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j11, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i24 |= 48;
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f110 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f111 = N.f12244a;
                                float f23 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f112 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f113 = N.f12244a;
                                float f24 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f1 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f1);
                            objF = c1085f1;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap2 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c11 = (C) objF4;
                            int i34 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar6 = hVar3;
                            final boolean z16 = z12;
                            final ScrollState scrollState4 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var4 = l0VarA;
                            final long j12 = jD;
                            final float f25 = f14;
                            final float f26 = f15;
                            final C0937i c0937i5 = c0937i2;
                            AndroidPopup_androidKt.a(c11, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar6, z16), k10, x11, scrollState4, l0Var4, j12, f25, f26, c0937i5, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c12 = (C) objF4;
                            int i35 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar7 = hVar3;
                            final boolean z17 = z12;
                            final ScrollState scrollState5 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var5 = l0VarA;
                            final long j13 = jD;
                            final float f27 = f14;
                            final float f28 = f15;
                            final C0937i c0937i6 = c0937i2;
                            AndroidPopup_androidKt.a(c12, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar7, z17), k10, x11, scrollState5, l0Var5, j13, f27, f28, c0937i6, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f114 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f115 = N.f12244a;
                                float f29 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f116 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f117 = N.f12244a;
                                float f210 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f2 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f2);
                            objF = c1085f2;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap3 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c13 = (C) objF4;
                            int i36 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar8 = hVar3;
                            final boolean z18 = z12;
                            final ScrollState scrollState6 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var6 = l0VarA;
                            final long j14 = jD;
                            final float f211 = f14;
                            final float f212 = f15;
                            final C0937i c0937i7 = c0937i2;
                            AndroidPopup_androidKt.a(c13, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar8, z18), k10, x11, scrollState6, l0Var6, j14, f211, f212, c0937i7, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c14 = (C) objF4;
                            int i37 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar9 = hVar3;
                            final boolean z19 = z12;
                            final ScrollState scrollState7 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var7 = l0VarA;
                            final long j15 = jD;
                            final float f213 = f14;
                            final float f214 = f15;
                            final C0937i c0937i8 = c0937i2;
                            AndroidPopup_androidKt.a(c14, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar9, z19), k10, x11, scrollState7, l0Var7, j15, f213, f214, c0937i8, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j16 = jD;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j16, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                z12 = z11;
                if ((i10 & 196608) == 0) {
                    l0VarA = l0Var;
                    if ((i12 & 32) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i13 |= i31;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i30 = 524288;
                    } else {
                        i30 = 524288;
                    }
                    i13 |= i30;
                }
                i18 = 128 & i12;
                if (i18 != 0) {
                    i13 |= 12582912;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.g(f12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                }
                i20 = 256 & i12;
                if (i20 != 0) {
                    i13 |= 100663296;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.g(f13)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 512;
                if (i22 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1024 & i12) != 0) {
                    i24 = i11 | 6;
                    i25 = 2048;
                } else {
                    if ((i11 & 6) == 0) {
                        if (c1086gP.k(qVar)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i24 = i11 | i26;
                    } else {
                        i24 = i11;
                    }
                    i25 = 2048;
                }
                if ((i25 & i12) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c1086gP.K(this)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f118 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f119 = N.f12244a;
                                float f215 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f1110 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f1111 = N.f12244a;
                                float f216 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f3 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f3);
                            objF = c1085f3;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap4 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c15 = (C) objF4;
                            int i38 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar10 = hVar3;
                            final boolean z110 = z12;
                            final ScrollState scrollState8 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var8 = l0VarA;
                            final long j17 = jD;
                            final float f217 = f14;
                            final float f218 = f15;
                            final C0937i c0937i9 = c0937i2;
                            AndroidPopup_androidKt.a(c15, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar10, z110), k10, x11, scrollState8, l0Var8, j17, f217, f218, c0937i9, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c16 = (C) objF4;
                            int i39 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar11 = hVar3;
                            final boolean z111 = z12;
                            final ScrollState scrollState9 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var9 = l0VarA;
                            final long j18 = jD;
                            final float f219 = f14;
                            final float f2110 = f15;
                            final C0937i c0937i10 = c0937i2;
                            AndroidPopup_androidKt.a(c16, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar11, z111), k10, x11, scrollState9, l0Var9, j18, f219, f2110, c0937i10, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f1112 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f1113 = N.f12244a;
                                float f2111 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f1114 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f1115 = N.f12244a;
                                float f2112 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f4 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f4);
                            objF = c1085f4;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap5 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c17 = (C) objF4;
                            int i310 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar12 = hVar3;
                            final boolean z112 = z12;
                            final ScrollState scrollState10 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var10 = l0VarA;
                            final long j19 = jD;
                            final float f2113 = f14;
                            final float f2114 = f15;
                            final C0937i c0937i11 = c0937i2;
                            AndroidPopup_androidKt.a(c17, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar12, z112), k10, x11, scrollState10, l0Var10, j19, f2113, f2114, c0937i11, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c18 = (C) objF4;
                            int i311 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar13 = hVar3;
                            final boolean z113 = z12;
                            final ScrollState scrollState11 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var11 = l0VarA;
                            final long j110 = jD;
                            final float f2115 = f14;
                            final float f2116 = f15;
                            final C0937i c0937i12 = c0937i2;
                            AndroidPopup_androidKt.a(c18, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar13, z113), k10, x11, scrollState11, l0Var11, j110, f2115, f2116, c0937i12, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j111 = jD;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i24 |= 48;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1116 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1117 = N.f12244a;
                            float f2117 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1118 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1119 = N.f12244a;
                            float f2118 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f5 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f5);
                        objF = c1085f5;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap6 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c19 = (C) objF4;
                        int i312 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar14 = hVar3;
                        final boolean z114 = z12;
                        final ScrollState scrollState12 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var12 = l0VarA;
                        final long j112 = jD;
                        final float f2119 = f14;
                        final float f21110 = f15;
                        final C0937i c0937i13 = c0937i2;
                        AndroidPopup_androidKt.a(c19, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar14, z114), k10, x11, scrollState12, l0Var12, j112, f2119, f21110, c0937i13, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c110 = (C) objF4;
                        int i313 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar15 = hVar3;
                        final boolean z115 = z12;
                        final ScrollState scrollState13 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var13 = l0VarA;
                        final long j113 = jD;
                        final float f21111 = f14;
                        final float f21112 = f15;
                        final C0937i c0937i14 = c0937i2;
                        AndroidPopup_androidKt.a(c110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar15, z115), k10, x11, scrollState13, l0Var13, j113, f21111, f21112, c0937i14, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f11110 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f11111 = N.f12244a;
                            float f21113 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f11112 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f11113 = N.f12244a;
                            float f21114 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f6 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f6);
                        objF = c1085f6;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap7 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111 = (C) objF4;
                        int i314 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar16 = hVar3;
                        final boolean z116 = z12;
                        final ScrollState scrollState14 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var14 = l0VarA;
                        final long j114 = jD;
                        final float f21115 = f14;
                        final float f21116 = f15;
                        final C0937i c0937i15 = c0937i2;
                        AndroidPopup_androidKt.a(c111, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar16, z116), k10, x11, scrollState14, l0Var14, j114, f21115, f21116, c0937i15, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c112 = (C) objF4;
                        int i315 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar17 = hVar3;
                        final boolean z117 = z12;
                        final ScrollState scrollState15 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var15 = l0VarA;
                        final long j115 = jD;
                        final float f21117 = f14;
                        final float f21118 = f15;
                        final C0937i c0937i16 = c0937i2;
                        AndroidPopup_androidKt.a(c112, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar17, z117), k10, x11, scrollState15, l0Var15, j115, f21117, f21118, c0937i16, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j116 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            hVar2 = hVar;
            if ((i10 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    scrollStateA = scrollState;
                    if (c1086gP.K(scrollStateA)) {
                    }
                    i13 |= i32;
                } else {
                    scrollStateA = scrollState;
                }
                i13 |= i32;
            } else {
                scrollStateA = scrollState;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z11;
                    if (c1086gP.c(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i10 & 196608) == 0) {
                    l0VarA = l0Var;
                    if ((i12 & 32) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i13 |= i31;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i30 = 524288;
                    } else {
                        i30 = 524288;
                    }
                    i13 |= i30;
                }
                i18 = 128 & i12;
                if (i18 != 0) {
                    i13 |= 12582912;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.g(f12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                }
                i20 = 256 & i12;
                if (i20 != 0) {
                    i13 |= 100663296;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.g(f13)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 512;
                if (i22 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1024 & i12) != 0) {
                    i24 = i11 | 6;
                    i25 = 2048;
                } else {
                    if ((i11 & 6) == 0) {
                        if (c1086gP.k(qVar)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i24 = i11 | i26;
                    } else {
                        i24 = i11;
                    }
                    i25 = 2048;
                }
                if ((i25 & i12) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c1086gP.K(this)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f11114 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f11115 = N.f12244a;
                                float f21119 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f11116 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f11117 = N.f12244a;
                                float f211110 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f7 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f7);
                            objF = c1085f7;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap8 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c113 = (C) objF4;
                            int i316 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar18 = hVar3;
                            final boolean z118 = z12;
                            final ScrollState scrollState16 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var16 = l0VarA;
                            final long j117 = jD;
                            final float f211111 = f14;
                            final float f211112 = f15;
                            final C0937i c0937i17 = c0937i2;
                            AndroidPopup_androidKt.a(c113, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar18, z118), k10, x11, scrollState16, l0Var16, j117, f211111, f211112, c0937i17, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c114 = (C) objF4;
                            int i317 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar19 = hVar3;
                            final boolean z119 = z12;
                            final ScrollState scrollState17 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var17 = l0VarA;
                            final long j118 = jD;
                            final float f211113 = f14;
                            final float f211114 = f15;
                            final C0937i c0937i18 = c0937i2;
                            AndroidPopup_androidKt.a(c114, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar19, z119), k10, x11, scrollState17, l0Var17, j118, f211113, f211114, c0937i18, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f11118 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f11119 = N.f12244a;
                                float f211115 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f111110 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f111111 = N.f12244a;
                                float f211116 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f8 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f8);
                            objF = c1085f8;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap9 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c115 = (C) objF4;
                            int i318 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar110 = hVar3;
                            final boolean z1110 = z12;
                            final ScrollState scrollState18 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var18 = l0VarA;
                            final long j119 = jD;
                            final float f211117 = f14;
                            final float f211118 = f15;
                            final C0937i c0937i19 = c0937i2;
                            AndroidPopup_androidKt.a(c115, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar110, z1110), k10, x11, scrollState18, l0Var18, j119, f211117, f211118, c0937i19, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c116 = (C) objF4;
                            int i319 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar111 = hVar3;
                            final boolean z1111 = z12;
                            final ScrollState scrollState19 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var19 = l0VarA;
                            final long j1110 = jD;
                            final float f211119 = f14;
                            final float f2111110 = f15;
                            final C0937i c0937i110 = c0937i2;
                            AndroidPopup_androidKt.a(c116, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar111, z1111), k10, x11, scrollState19, l0Var19, j1110, f211119, f2111110, c0937i110, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j1111 = jD;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j1111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i24 |= 48;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111112 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111113 = N.f12244a;
                            float f2111111 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111114 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111115 = N.f12244a;
                            float f2111112 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f9 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f9);
                        objF = c1085f9;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap10 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c117 = (C) objF4;
                        int i3110 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar112 = hVar3;
                        final boolean z1112 = z12;
                        final ScrollState scrollState110 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var110 = l0VarA;
                        final long j1112 = jD;
                        final float f2111113 = f14;
                        final float f2111114 = f15;
                        final C0937i c0937i111 = c0937i2;
                        AndroidPopup_androidKt.a(c117, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar112, z1112), k10, x11, scrollState110, l0Var110, j1112, f2111113, f2111114, c0937i111, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c118 = (C) objF4;
                        int i3111 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar113 = hVar3;
                        final boolean z1113 = z12;
                        final ScrollState scrollState111 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var111 = l0VarA;
                        final long j1113 = jD;
                        final float f2111115 = f14;
                        final float f2111116 = f15;
                        final C0937i c0937i112 = c0937i2;
                        AndroidPopup_androidKt.a(c118, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar113, z1113), k10, x11, scrollState111, l0Var111, j1113, f2111115, f2111116, c0937i112, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111116 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111117 = N.f12244a;
                            float f2111117 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111118 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111119 = N.f12244a;
                            float f2111118 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f10 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f10);
                        objF = c1085f10;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c119 = (C) objF4;
                        int i3112 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar114 = hVar3;
                        final boolean z1114 = z12;
                        final ScrollState scrollState112 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var112 = l0VarA;
                        final long j1114 = jD;
                        final float f2111119 = f14;
                        final float f21111110 = f15;
                        final C0937i c0937i113 = c0937i2;
                        AndroidPopup_androidKt.a(c119, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar114, z1114), k10, x11, scrollState112, l0Var112, j1114, f2111119, f21111110, c0937i113, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c1110 = (C) objF4;
                        int i3113 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar115 = hVar3;
                        final boolean z1115 = z12;
                        final ScrollState scrollState113 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var113 = l0VarA;
                        final long j1115 = jD;
                        final float f21111111 = f14;
                        final float f21111112 = f15;
                        final C0937i c0937i114 = c0937i2;
                        AndroidPopup_androidKt.a(c1110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar115, z1115), k10, x11, scrollState113, l0Var113, j1115, f21111111, f21111112, c0937i114, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j1116 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j1116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i10 & 196608) == 0) {
                l0VarA = l0Var;
                if ((i12 & 32) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i13 |= i31;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i30 = 524288;
                } else {
                    i30 = 524288;
                }
                i13 |= i30;
            }
            i18 = 128 & i12;
            if (i18 != 0) {
                i13 |= 12582912;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
            }
            i20 = 256 & i12;
            if (i20 != 0) {
                i13 |= 100663296;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.g(f13)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(c0937i)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1024 & i12) != 0) {
                i24 = i11 | 6;
                i25 = 2048;
            } else {
                if ((i11 & 6) == 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i24 = i11 | i26;
                } else {
                    i24 = i11;
                }
                i25 = 2048;
            }
            if ((i25 & i12) != 0) {
                if ((i11 & 48) == 0) {
                    if (c1086gP.K(this)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111110 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111 = N.f12244a;
                            float f21111113 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111112 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111113 = N.f12244a;
                            float f21111114 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f11 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f11);
                        objF = c1085f11;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap12 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c1111 = (C) objF4;
                        int i3114 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar116 = hVar3;
                        final boolean z1116 = z12;
                        final ScrollState scrollState114 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var114 = l0VarA;
                        final long j1117 = jD;
                        final float f21111115 = f14;
                        final float f21111116 = f15;
                        final C0937i c0937i115 = c0937i2;
                        AndroidPopup_androidKt.a(c1111, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar116, z1116), k10, x11, scrollState114, l0Var114, j1117, f21111115, f21111116, c0937i115, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c1112 = (C) objF4;
                        int i3115 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar117 = hVar3;
                        final boolean z1117 = z12;
                        final ScrollState scrollState115 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var115 = l0VarA;
                        final long j1118 = jD;
                        final float f21111117 = f14;
                        final float f21111118 = f15;
                        final C0937i c0937i116 = c0937i2;
                        AndroidPopup_androidKt.a(c1112, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar117, z1117), k10, x11, scrollState115, l0Var115, j1118, f21111117, f21111118, c0937i116, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111114 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111115 = N.f12244a;
                            float f21111119 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111116 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111117 = N.f12244a;
                            float f211111110 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f12 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f12);
                        objF = c1085f12;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap13 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c1113 = (C) objF4;
                        int i3116 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar118 = hVar3;
                        final boolean z1118 = z12;
                        final ScrollState scrollState116 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var116 = l0VarA;
                        final long j1119 = jD;
                        final float f211111111 = f14;
                        final float f211111112 = f15;
                        final C0937i c0937i117 = c0937i2;
                        AndroidPopup_androidKt.a(c1113, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar118, z1118), k10, x11, scrollState116, l0Var116, j1119, f211111111, f211111112, c0937i117, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c1114 = (C) objF4;
                        int i3117 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar119 = hVar3;
                        final boolean z1119 = z12;
                        final ScrollState scrollState117 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var117 = l0VarA;
                        final long j11110 = jD;
                        final float f211111113 = f14;
                        final float f211111114 = f15;
                        final C0937i c0937i118 = c0937i2;
                        AndroidPopup_androidKt.a(c1114, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar119, z1119), k10, x11, scrollState117, l0Var117, j11110, f211111113, f211111114, c0937i118, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j11111 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j11111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i24 |= 48;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111118 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111119 = N.f12244a;
                        float f211111115 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111110 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111 = N.f12244a;
                        float f211111116 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f13 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f13);
                    objF = c1085f13;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap14 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1115 = (C) objF4;
                    int i3118 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1110 = hVar3;
                    final boolean z11110 = z12;
                    final ScrollState scrollState118 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var118 = l0VarA;
                    final long j11112 = jD;
                    final float f211111117 = f14;
                    final float f211111118 = f15;
                    final C0937i c0937i119 = c0937i2;
                    AndroidPopup_androidKt.a(c1115, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1110, z11110), k10, x11, scrollState118, l0Var118, j11112, f211111117, f211111118, c0937i119, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1116 = (C) objF4;
                    int i3119 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1111 = hVar3;
                    final boolean z11111 = z12;
                    final ScrollState scrollState119 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var119 = l0VarA;
                    final long j11113 = jD;
                    final float f211111119 = f14;
                    final float f2111111110 = f15;
                    final C0937i c0937i1110 = c0937i2;
                    AndroidPopup_androidKt.a(c1116, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1111, z11111), k10, x11, scrollState119, l0Var119, j11113, f211111119, f2111111110, c0937i1110, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111112 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111113 = N.f12244a;
                        float f2111111111 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111114 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111115 = N.f12244a;
                        float f2111111112 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f14 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f14);
                    objF = c1085f14;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap15 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1117 = (C) objF4;
                    int i31110 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1112 = hVar3;
                    final boolean z11112 = z12;
                    final ScrollState scrollState1110 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var1110 = l0VarA;
                    final long j11114 = jD;
                    final float f2111111113 = f14;
                    final float f2111111114 = f15;
                    final C0937i c0937i1111 = c0937i2;
                    AndroidPopup_androidKt.a(c1117, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1112, z11112), k10, x11, scrollState1110, l0Var1110, j11114, f2111111113, f2111111114, c0937i1111, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1118 = (C) objF4;
                    int i31111 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1113 = hVar3;
                    final boolean z11113 = z12;
                    final ScrollState scrollState1111 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var1111 = l0VarA;
                    final long j11115 = jD;
                    final float f2111111115 = f14;
                    final float f2111111116 = f15;
                    final C0937i c0937i1112 = c0937i2;
                    AndroidPopup_androidKt.a(c1118, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1113, z11113), k10, x11, scrollState1111, l0Var1111, j11115, f2111111115, f2111111116, c0937i1112, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j11116 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j11116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i10 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    scrollStateA = scrollState;
                    if (c1086gP.K(scrollStateA)) {
                    }
                    i13 |= i32;
                } else {
                    scrollStateA = scrollState;
                }
                i13 |= i32;
            } else {
                scrollStateA = scrollState;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z11;
                    if (c1086gP.c(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i10 & 196608) == 0) {
                    l0VarA = l0Var;
                    if ((i12 & 32) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i13 |= i31;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i30 = 524288;
                    } else {
                        i30 = 524288;
                    }
                    i13 |= i30;
                }
                i18 = 128 & i12;
                if (i18 != 0) {
                    i13 |= 12582912;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.g(f12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                }
                i20 = 256 & i12;
                if (i20 != 0) {
                    i13 |= 100663296;
                    f13 = f11;
                } else {
                    f13 = f11;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.g(f13)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 512;
                if (i22 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1024 & i12) != 0) {
                    i24 = i11 | 6;
                    i25 = 2048;
                } else {
                    if ((i11 & 6) == 0) {
                        if (c1086gP.k(qVar)) {
                            i26 = 4;
                        } else {
                            i26 = 2;
                        }
                        i24 = i11 | i26;
                    } else {
                        i24 = i11;
                    }
                    i25 = 2048;
                }
                if ((i25 & i12) != 0) {
                    if ((i11 & 48) == 0) {
                        if (c1086gP.K(this)) {
                            i27 = 32;
                        } else {
                            i27 = 16;
                        }
                        i24 |= i27;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f11111116 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f11111117 = N.f12244a;
                                float f2111111117 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f11111118 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f11111119 = N.f12244a;
                                float f2111111118 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f15 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f15);
                            objF = c1085f15;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap16 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c1119 = (C) objF4;
                            int i31112 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar1114 = hVar3;
                            final boolean z11114 = z12;
                            final ScrollState scrollState1112 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var1112 = l0VarA;
                            final long j11117 = jD;
                            final float f2111111119 = f14;
                            final float f21111111110 = f15;
                            final C0937i c0937i1113 = c0937i2;
                            AndroidPopup_androidKt.a(c1119, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar1114, z11114), k10, x11, scrollState1112, l0Var1112, j11117, f2111111119, f21111111110, c0937i1113, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c11110 = (C) objF4;
                            int i31113 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar1115 = hVar3;
                            final boolean z11115 = z12;
                            final ScrollState scrollState1113 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var1113 = l0VarA;
                            final long j11118 = jD;
                            final float f21111111111 = f14;
                            final float f21111111112 = f15;
                            final C0937i c0937i1114 = c0937i2;
                            AndroidPopup_androidKt.a(c11110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar1115, z11115), k10, x11, scrollState1113, l0Var1113, j11118, f21111111111, f21111111112, c0937i1114, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f111111110 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f111111111 = N.f12244a;
                                float f21111111113 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if ((i12 & 8) != 0) {
                                z13 = true;
                                scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                                i13 &= -7169;
                            } else {
                                z13 = true;
                            }
                            if (i16 != 0) {
                                z12 = z13;
                            }
                            if ((32 & i12) != 0) {
                                float f111111112 = N.f12244a;
                                l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                float f111111113 = N.f12244a;
                                float f21111111114 = B.p.f1311a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                                i13 &= -3670017;
                            } else {
                                jD = j;
                            }
                            if (i18 != 0) {
                                f14 = N.f12244a;
                            } else {
                                f14 = f12;
                            }
                            if (i20 != 0) {
                                f15 = N.f12245b;
                            } else {
                                f15 = f13;
                            }
                            if (i22 != 0) {
                                c0937i2 = null;
                            } else {
                                c0937i2 = c0937i;
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1085f0 c1085f16 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                            c1086gP.E(c1085f16);
                            objF = c1085f16;
                        }
                        x10 = (androidx.compose.runtime.X) objF;
                        view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap17 = androidx.compose.foundation.layout.c0.f10254v;
                        i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                        c1086gP.L(321499814);
                        if (z10) {
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                        p293xa.r rVar = p293xa.r.f47939a;
                                        x12.setValue(rVar);
                                        return rVar;
                                    }
                                };
                                c1086gP.E(objF5);
                            }
                            ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                        }
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        k10 = (androidx.compose.animation.core.K) objF2;
                        k10.f(Boolean.valueOf(z10));
                        if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c11111 = (C) objF4;
                            int i31114 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar1116 = hVar3;
                            final boolean z11116 = z12;
                            final ScrollState scrollState1114 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var1114 = l0VarA;
                            final long j11119 = jD;
                            final float f21111111115 = f14;
                            final float f21111111116 = f15;
                            final C0937i c0937i1115 = c0937i2;
                            AndroidPopup_androidKt.a(c11111, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar1116, z11116), k10, x11, scrollState1114, l0Var1114, j11119, f21111111115, f21111111116, c0937i1115, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        } else {
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                                c1086gP.E(objF3);
                            }
                            x11 = (androidx.compose.runtime.X) objF3;
                            zK = c1086gP.K(cVar) | c1086gP.h(i28);
                            objF4 = c1086gP.f();
                            if (zK) {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            } else {
                                objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                        x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                        return p293xa.r.f47939a;
                                    }
                                });
                                c1086gP.E(objF4);
                            }
                            C c11112 = (C) objF4;
                            int i31115 = B.f12050a;
                            strC = c();
                            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                            if (((Boolean) vVarB.getValue()).booleanValue()) {
                                i29 = 393248;
                            } else {
                                i29 = 393216;
                            }
                            if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                                i29 |= 8;
                            } else {
                                i29 |= 8;
                            }
                            final androidx.compose.ui.h hVar1117 = hVar3;
                            final boolean z11117 = z12;
                            final ScrollState scrollState1115 = scrollStateA;
                            final androidx.compose.ui.graphics.l0 l0Var1115 = l0VarA;
                            final long j111110 = jD;
                            final float f21111111117 = f14;
                            final float f21111111118 = f15;
                            final C0937i c0937i1116 = c0937i2;
                            AndroidPopup_androidKt.a(c11112, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        MenuKt.a(this.this$0.b(hVar1117, z11117), k10, x11, scrollState1115, l0Var1115, j111110, f21111111117, f21111111118, c0937i1116, qVar, interfaceC1084f3, 384);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                        }
                        f16 = f14;
                        f17 = f15;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        z14 = z12;
                        scrollState2 = scrollStateA;
                        c0937i3 = c0937i2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j111111 = jD;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j111111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i24 |= 48;
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111114 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111115 = N.f12244a;
                            float f21111111119 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111116 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111117 = N.f12244a;
                            float f211111111110 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f17 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f17);
                        objF = c1085f17;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap18 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11113 = (C) objF4;
                        int i31116 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar1118 = hVar3;
                        final boolean z11118 = z12;
                        final ScrollState scrollState1116 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var1116 = l0VarA;
                        final long j111112 = jD;
                        final float f211111111111 = f14;
                        final float f211111111112 = f15;
                        final C0937i c0937i1117 = c0937i2;
                        AndroidPopup_androidKt.a(c11113, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar1118, z11118), k10, x11, scrollState1116, l0Var1116, j111112, f211111111111, f211111111112, c0937i1117, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11114 = (C) objF4;
                        int i31117 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar1119 = hVar3;
                        final boolean z11119 = z12;
                        final ScrollState scrollState1117 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var1117 = l0VarA;
                        final long j111113 = jD;
                        final float f211111111113 = f14;
                        final float f211111111114 = f15;
                        final C0937i c0937i1118 = c0937i2;
                        AndroidPopup_androidKt.a(c11114, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar1119, z11119), k10, x11, scrollState1117, l0Var1117, j111113, f211111111113, f211111111114, c0937i1118, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111118 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111119 = N.f12244a;
                            float f211111111115 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111111110 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111111 = N.f12244a;
                            float f211111111116 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f18 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f18);
                        objF = c1085f18;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap19 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11115 = (C) objF4;
                        int i31118 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11110 = hVar3;
                        final boolean z111110 = z12;
                        final ScrollState scrollState1118 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var1118 = l0VarA;
                        final long j111114 = jD;
                        final float f211111111117 = f14;
                        final float f211111111118 = f15;
                        final C0937i c0937i1119 = c0937i2;
                        AndroidPopup_androidKt.a(c11115, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11110, z111110), k10, x11, scrollState1118, l0Var1118, j111114, f211111111117, f211111111118, c0937i1119, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11116 = (C) objF4;
                        int i31119 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11111 = hVar3;
                        final boolean z111111 = z12;
                        final ScrollState scrollState1119 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var1119 = l0VarA;
                        final long j111115 = jD;
                        final float f211111111119 = f14;
                        final float f2111111111110 = f15;
                        final C0937i c0937i11110 = c0937i2;
                        AndroidPopup_androidKt.a(c11116, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11111, z111111), k10, x11, scrollState1119, l0Var1119, j111115, f211111111119, f2111111111110, c0937i11110, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j111116 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j111116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i10 & 196608) == 0) {
                l0VarA = l0Var;
                if ((i12 & 32) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i13 |= i31;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i30 = 524288;
                } else {
                    i30 = 524288;
                }
                i13 |= i30;
            }
            i18 = 128 & i12;
            if (i18 != 0) {
                i13 |= 12582912;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
            }
            i20 = 256 & i12;
            if (i20 != 0) {
                i13 |= 100663296;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.g(f13)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(c0937i)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1024 & i12) != 0) {
                i24 = i11 | 6;
                i25 = 2048;
            } else {
                if ((i11 & 6) == 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i24 = i11 | i26;
                } else {
                    i24 = i11;
                }
                i25 = 2048;
            }
            if ((i25 & i12) != 0) {
                if ((i11 & 48) == 0) {
                    if (c1086gP.K(this)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111111112 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111113 = N.f12244a;
                            float f2111111111111 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111111114 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111115 = N.f12244a;
                            float f2111111111112 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f19 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f19);
                        objF = c1085f19;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap110 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11117 = (C) objF4;
                        int i311110 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11112 = hVar3;
                        final boolean z111112 = z12;
                        final ScrollState scrollState11110 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11110 = l0VarA;
                        final long j111117 = jD;
                        final float f2111111111113 = f14;
                        final float f2111111111114 = f15;
                        final C0937i c0937i11111 = c0937i2;
                        AndroidPopup_androidKt.a(c11117, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11112, z111112), k10, x11, scrollState11110, l0Var11110, j111117, f2111111111113, f2111111111114, c0937i11111, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11118 = (C) objF4;
                        int i311111 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11113 = hVar3;
                        final boolean z111113 = z12;
                        final ScrollState scrollState11111 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11111 = l0VarA;
                        final long j111118 = jD;
                        final float f2111111111115 = f14;
                        final float f2111111111116 = f15;
                        final C0937i c0937i11112 = c0937i2;
                        AndroidPopup_androidKt.a(c11118, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11113, z111113), k10, x11, scrollState11111, l0Var11111, j111118, f2111111111115, f2111111111116, c0937i11112, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111111116 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111117 = N.f12244a;
                            float f2111111111117 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f1111111118 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f1111111119 = N.f12244a;
                            float f2111111111118 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f110 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f110);
                        objF = c1085f110;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c11119 = (C) objF4;
                        int i311112 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11114 = hVar3;
                        final boolean z111114 = z12;
                        final ScrollState scrollState11112 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11112 = l0VarA;
                        final long j111119 = jD;
                        final float f2111111111119 = f14;
                        final float f21111111111110 = f15;
                        final C0937i c0937i11113 = c0937i2;
                        AndroidPopup_androidKt.a(c11119, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11114, z111114), k10, x11, scrollState11112, l0Var11112, j111119, f2111111111119, f21111111111110, c0937i11113, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111110 = (C) objF4;
                        int i311113 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar11115 = hVar3;
                        final boolean z111115 = z12;
                        final ScrollState scrollState11113 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11113 = l0VarA;
                        final long j1111110 = jD;
                        final float f21111111111111 = f14;
                        final float f21111111111112 = f15;
                        final C0937i c0937i11114 = c0937i2;
                        AndroidPopup_androidKt.a(c111110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar11115, z111115), k10, x11, scrollState11113, l0Var11113, j1111110, f21111111111111, f21111111111112, c0937i11114, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j1111111 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j1111111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i24 |= 48;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111111110 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111111 = N.f12244a;
                        float f21111111111113 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111111112 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111113 = N.f12244a;
                        float f21111111111114 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f111 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f111);
                    objF = c1085f111;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap112 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c111111 = (C) objF4;
                    int i311114 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar11116 = hVar3;
                    final boolean z111116 = z12;
                    final ScrollState scrollState11114 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var11114 = l0VarA;
                    final long j1111112 = jD;
                    final float f21111111111115 = f14;
                    final float f21111111111116 = f15;
                    final C0937i c0937i11115 = c0937i2;
                    AndroidPopup_androidKt.a(c111111, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar11116, z111116), k10, x11, scrollState11114, l0Var11114, j1111112, f21111111111115, f21111111111116, c0937i11115, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c111112 = (C) objF4;
                    int i311115 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar11117 = hVar3;
                    final boolean z111117 = z12;
                    final ScrollState scrollState11115 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var11115 = l0VarA;
                    final long j1111113 = jD;
                    final float f21111111111117 = f14;
                    final float f21111111111118 = f15;
                    final C0937i c0937i11116 = c0937i2;
                    AndroidPopup_androidKt.a(c111112, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar11117, z111117), k10, x11, scrollState11115, l0Var11115, j1111113, f21111111111117, f21111111111118, c0937i11116, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111111114 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111115 = N.f12244a;
                        float f21111111111119 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111111116 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111117 = N.f12244a;
                        float f211111111111110 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f112 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f112);
                    objF = c1085f112;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap113 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c111113 = (C) objF4;
                    int i311116 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar11118 = hVar3;
                    final boolean z111118 = z12;
                    final ScrollState scrollState11116 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var11116 = l0VarA;
                    final long j1111114 = jD;
                    final float f211111111111111 = f14;
                    final float f211111111111112 = f15;
                    final C0937i c0937i11117 = c0937i2;
                    AndroidPopup_androidKt.a(c111113, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar11118, z111118), k10, x11, scrollState11116, l0Var11116, j1111114, f211111111111111, f211111111111112, c0937i11117, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c111114 = (C) objF4;
                    int i311117 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar11119 = hVar3;
                    final boolean z111119 = z12;
                    final ScrollState scrollState11117 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var11117 = l0VarA;
                    final long j1111115 = jD;
                    final float f211111111111113 = f14;
                    final float f211111111111114 = f15;
                    final C0937i c0937i11118 = c0937i2;
                    AndroidPopup_androidKt.a(c111114, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar11119, z111119), k10, x11, scrollState11117, l0Var11117, j1111115, f211111111111113, f211111111111114, c0937i11118, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j1111116 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j1111116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        hVar2 = hVar;
        if ((i10 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                scrollStateA = scrollState;
                if (c1086gP.K(scrollStateA)) {
                }
                i13 |= i32;
            } else {
                scrollStateA = scrollState;
            }
            i13 |= i32;
        } else {
            scrollStateA = scrollState;
        }
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z11;
                if (c1086gP.c(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i10 & 196608) == 0) {
                l0VarA = l0Var;
                if ((i12 & 32) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i13 |= i31;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i30 = 524288;
                } else {
                    i30 = 524288;
                }
                i13 |= i30;
            }
            i18 = 128 & i12;
            if (i18 != 0) {
                i13 |= 12582912;
                f12 = f10;
            } else {
                f12 = f10;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
            }
            i20 = 256 & i12;
            if (i20 != 0) {
                i13 |= 100663296;
                f13 = f11;
            } else {
                f13 = f11;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.g(f13)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(c0937i)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1024 & i12) != 0) {
                i24 = i11 | 6;
                i25 = 2048;
            } else {
                if ((i11 & 6) == 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i24 = i11 | i26;
                } else {
                    i24 = i11;
                }
                i25 = 2048;
            }
            if ((i25 & i12) != 0) {
                if ((i11 & 48) == 0) {
                    if (c1086gP.K(this)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                if ((i13 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f11111111118 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f11111111119 = N.f12244a;
                            float f211111111111115 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111111110 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111111111 = N.f12244a;
                            float f211111111111116 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f113 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f113);
                        objF = c1085f113;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap114 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111115 = (C) objF4;
                        int i311118 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar111110 = hVar3;
                        final boolean z1111110 = z12;
                        final ScrollState scrollState11118 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11118 = l0VarA;
                        final long j1111117 = jD;
                        final float f211111111111117 = f14;
                        final float f211111111111118 = f15;
                        final C0937i c0937i11119 = c0937i2;
                        AndroidPopup_androidKt.a(c111115, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar111110, z1111110), k10, x11, scrollState11118, l0Var11118, j1111117, f211111111111117, f211111111111118, c0937i11119, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111116 = (C) objF4;
                        int i311119 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar111111 = hVar3;
                        final boolean z1111111 = z12;
                        final ScrollState scrollState11119 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var11119 = l0VarA;
                        final long j1111118 = jD;
                        final float f211111111111119 = f14;
                        final float f2111111111111110 = f15;
                        final C0937i c0937i111110 = c0937i2;
                        AndroidPopup_androidKt.a(c111116, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar111111, z1111111), k10, x11, scrollState11119, l0Var11119, j1111118, f211111111111119, f2111111111111110, c0937i111110, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111111112 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111111113 = N.f12244a;
                            float f2111111111111111 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i12 & 8) != 0) {
                            z13 = true;
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -7169;
                        } else {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z12 = z13;
                        }
                        if ((32 & i12) != 0) {
                            float f111111111114 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            float f111111111115 = N.f12244a;
                            float f2111111111111112 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 &= -3670017;
                        } else {
                            jD = j;
                        }
                        if (i18 != 0) {
                            f14 = N.f12244a;
                        } else {
                            f14 = f12;
                        }
                        if (i20 != 0) {
                            f15 = N.f12245b;
                        } else {
                            f15 = f13;
                        }
                        if (i22 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        C1085f0 c1085f114 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                        c1086gP.E(c1085f114);
                        objF = c1085f114;
                    }
                    x10 = (androidx.compose.runtime.X) objF;
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap115 = androidx.compose.foundation.layout.c0.f10254v;
                    i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                    c1086gP.L(321499814);
                    if (z10) {
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                    p293xa.r rVar = p293xa.r.f47939a;
                                    x12.setValue(rVar);
                                    return rVar;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                    }
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    k10 = (androidx.compose.animation.core.K) objF2;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111117 = (C) objF4;
                        int i3111110 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar111112 = hVar3;
                        final boolean z1111112 = z12;
                        final ScrollState scrollState111110 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var111110 = l0VarA;
                        final long j1111119 = jD;
                        final float f2111111111111113 = f14;
                        final float f2111111111111114 = f15;
                        final C0937i c0937i111111 = c0937i2;
                        AndroidPopup_androidKt.a(c111117, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar111112, z1111112), k10, x11, scrollState111110, l0Var111110, j1111119, f2111111111111113, f2111111111111114, c0937i111111, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    } else {
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF3);
                        }
                        x11 = (androidx.compose.runtime.X) objF3;
                        zK = c1086gP.K(cVar) | c1086gP.h(i28);
                        objF4 = c1086gP.f();
                        if (zK) {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF4);
                        }
                        C c111118 = (C) objF4;
                        int i3111111 = B.f12050a;
                        strC = c();
                        vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                        if (((Boolean) vVarB.getValue()).booleanValue()) {
                            i29 = 393248;
                        } else {
                            i29 = 393216;
                        }
                        if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                            i29 |= 8;
                        } else {
                            i29 |= 8;
                        }
                        final androidx.compose.ui.h hVar111113 = hVar3;
                        final boolean z1111113 = z12;
                        final ScrollState scrollState111111 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var111111 = l0VarA;
                        final long j11111110 = jD;
                        final float f2111111111111115 = f14;
                        final float f2111111111111116 = f15;
                        final C0937i c0937i111112 = c0937i2;
                        AndroidPopup_androidKt.a(c111118, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    MenuKt.a(this.this$0.b(hVar111113, z1111113), k10, x11, scrollState111111, l0Var111111, j11111110, f2111111111111115, f2111111111111116, c0937i111112, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                    }
                    f16 = f14;
                    f17 = f15;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    z14 = z12;
                    scrollState2 = scrollStateA;
                    c0937i3 = c0937i2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j11111111 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j11111111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i24 |= 48;
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f111111111116 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f111111111117 = N.f12244a;
                        float f2111111111111117 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f111111111118 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f111111111119 = N.f12244a;
                        float f2111111111111118 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f115 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f115);
                    objF = c1085f115;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap116 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c111119 = (C) objF4;
                    int i3111112 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111114 = hVar3;
                    final boolean z1111114 = z12;
                    final ScrollState scrollState111112 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111112 = l0VarA;
                    final long j11111112 = jD;
                    final float f2111111111111119 = f14;
                    final float f21111111111111110 = f15;
                    final C0937i c0937i111113 = c0937i2;
                    AndroidPopup_androidKt.a(c111119, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111114, z1111114), k10, x11, scrollState111112, l0Var111112, j11111112, f2111111111111119, f21111111111111110, c0937i111113, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111110 = (C) objF4;
                    int i3111113 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111115 = hVar3;
                    final boolean z1111115 = z12;
                    final ScrollState scrollState111113 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111113 = l0VarA;
                    final long j11111113 = jD;
                    final float f21111111111111111 = f14;
                    final float f21111111111111112 = f15;
                    final C0937i c0937i111114 = c0937i2;
                    AndroidPopup_androidKt.a(c1111110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111115, z1111115), k10, x11, scrollState111113, l0Var111113, j11111113, f21111111111111111, f21111111111111112, c0937i111114, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111111111110 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111111111111 = N.f12244a;
                        float f21111111111111113 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111111111112 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111111111113 = N.f12244a;
                        float f21111111111111114 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f116 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f116);
                    objF = c1085f116;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap117 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111111 = (C) objF4;
                    int i3111114 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111116 = hVar3;
                    final boolean z1111116 = z12;
                    final ScrollState scrollState111114 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111114 = l0VarA;
                    final long j11111114 = jD;
                    final float f21111111111111115 = f14;
                    final float f21111111111111116 = f15;
                    final C0937i c0937i111115 = c0937i2;
                    AndroidPopup_androidKt.a(c1111111, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111116, z1111116), k10, x11, scrollState111114, l0Var111114, j11111114, f21111111111111115, f21111111111111116, c0937i111115, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111112 = (C) objF4;
                    int i3111115 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111117 = hVar3;
                    final boolean z1111117 = z12;
                    final ScrollState scrollState111115 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111115 = l0VarA;
                    final long j11111115 = jD;
                    final float f21111111111111117 = f14;
                    final float f21111111111111118 = f15;
                    final C0937i c0937i111116 = c0937i2;
                    AndroidPopup_androidKt.a(c1111112, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111117, z1111117), k10, x11, scrollState111115, l0Var111115, j11111115, f21111111111111117, f21111111111111118, c0937i111116, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j11111116 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j11111116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        z12 = z11;
        if ((i10 & 196608) == 0) {
            l0VarA = l0Var;
            if ((i12 & 32) == 0) {
                i31 = 65536;
            } else {
                i31 = 65536;
            }
            i13 |= i31;
        } else {
            l0VarA = l0Var;
        }
        if ((i10 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i30 = 524288;
            } else {
                i30 = 524288;
            }
            i13 |= i30;
        }
        i18 = 128 & i12;
        if (i18 != 0) {
            i13 |= 12582912;
            f12 = f10;
        } else {
            f12 = f10;
            if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f12)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
        }
        i20 = 256 & i12;
        if (i20 != 0) {
            i13 |= 100663296;
            f13 = f11;
        } else {
            f13 = f11;
            if ((i10 & 100663296) == 0) {
                if (c1086gP.g(f13)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
        }
        i22 = i12 & 512;
        if (i22 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.K(c0937i)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        if ((1024 & i12) != 0) {
            i24 = i11 | 6;
            i25 = 2048;
        } else {
            if ((i11 & 6) == 0) {
                if (c1086gP.k(qVar)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i24 = i11 | i26;
            } else {
                i24 = i11;
            }
            i25 = 2048;
        }
        if ((i25 & i12) != 0) {
            if ((i11 & 48) == 0) {
                if (c1086gP.K(this)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            if ((i13 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111111111114 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111111111115 = N.f12244a;
                        float f21111111111111119 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111111111116 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111111111117 = N.f12244a;
                        float f211111111111111110 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f117 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f117);
                    objF = c1085f117;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap118 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111113 = (C) objF4;
                    int i3111116 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111118 = hVar3;
                    final boolean z1111118 = z12;
                    final ScrollState scrollState111116 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111116 = l0VarA;
                    final long j11111117 = jD;
                    final float f211111111111111111 = f14;
                    final float f211111111111111112 = f15;
                    final C0937i c0937i111117 = c0937i2;
                    AndroidPopup_androidKt.a(c1111113, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111118, z1111118), k10, x11, scrollState111116, l0Var111116, j11111117, f211111111111111111, f211111111111111112, c0937i111117, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111114 = (C) objF4;
                    int i3111117 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar111119 = hVar3;
                    final boolean z1111119 = z12;
                    final ScrollState scrollState111117 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111117 = l0VarA;
                    final long j11111118 = jD;
                    final float f211111111111111113 = f14;
                    final float f211111111111111114 = f15;
                    final C0937i c0937i111118 = c0937i2;
                    AndroidPopup_androidKt.a(c1111114, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar111119, z1111119), k10, x11, scrollState111117, l0Var111117, j11111118, f211111111111111113, f211111111111111114, c0937i111118, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f1111111111118 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f1111111111119 = N.f12244a;
                        float f211111111111111115 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 8) != 0) {
                        z13 = true;
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -7169;
                    } else {
                        z13 = true;
                    }
                    if (i16 != 0) {
                        z12 = z13;
                    }
                    if ((32 & i12) != 0) {
                        float f11111111111110 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111111111111 = N.f12244a;
                        float f211111111111111116 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 &= -3670017;
                    } else {
                        jD = j;
                    }
                    if (i18 != 0) {
                        f14 = N.f12244a;
                    } else {
                        f14 = f12;
                    }
                    if (i20 != 0) {
                        f15 = N.f12245b;
                    } else {
                        f15 = f13;
                    }
                    if (i22 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    C1085f0 c1085f118 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                    c1086gP.E(c1085f118);
                    objF = c1085f118;
                }
                x10 = (androidx.compose.runtime.X) objF;
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap119 = androidx.compose.foundation.layout.c0.f10254v;
                i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
                c1086gP.L(321499814);
                if (z10) {
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<p293xa.r> x12 = x10;
                                p293xa.r rVar = p293xa.r.f47939a;
                                x12.setValue(rVar);
                                return rVar;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
                }
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                k10 = (androidx.compose.animation.core.K) objF2;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111115 = (C) objF4;
                    int i3111118 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1111110 = hVar3;
                    final boolean z11111110 = z12;
                    final ScrollState scrollState111118 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111118 = l0VarA;
                    final long j11111119 = jD;
                    final float f211111111111111117 = f14;
                    final float f211111111111111118 = f15;
                    final C0937i c0937i111119 = c0937i2;
                    AndroidPopup_androidKt.a(c1111115, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1111110, z11111110), k10, x11, scrollState111118, l0Var111118, j11111119, f211111111111111117, f211111111111111118, c0937i111119, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                } else {
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF3);
                    }
                    x11 = (androidx.compose.runtime.X) objF3;
                    zK = c1086gP.K(cVar) | c1086gP.h(i28);
                    objF4 = c1086gP.f();
                    if (zK) {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF4);
                    }
                    C c1111116 = (C) objF4;
                    int i3111119 = B.f12050a;
                    strC = c();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if (((Boolean) vVarB.getValue()).booleanValue()) {
                        i29 = 393248;
                    } else {
                        i29 = 393216;
                    }
                    if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                        i29 |= 8;
                    } else {
                        i29 |= 8;
                    }
                    final androidx.compose.ui.h hVar1111111 = hVar3;
                    final boolean z11111111 = z12;
                    final ScrollState scrollState111119 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var111119 = l0VarA;
                    final long j111111110 = jD;
                    final float f211111111111111119 = f14;
                    final float f2111111111111111110 = f15;
                    final C0937i c0937i1111110 = c0937i2;
                    AndroidPopup_androidKt.a(c1111116, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                MenuKt.a(this.this$0.b(hVar1111111, z11111111), k10, x11, scrollState111119, l0Var111119, j111111110, f211111111111111119, f2111111111111111110, c0937i1111110, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
                }
                f16 = f14;
                f17 = f15;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                z14 = z12;
                scrollState2 = scrollStateA;
                c0937i3 = c0937i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j111111111 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j111111111, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i24 |= 48;
        if ((i13 & 306783379) != 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 8) != 0) {
                    z13 = true;
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -7169;
                } else {
                    z13 = true;
                }
                if (i16 != 0) {
                    z12 = z13;
                }
                if ((32 & i12) != 0) {
                    float f11111111111112 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    float f11111111111113 = N.f12244a;
                    float f2111111111111111111 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 &= -3670017;
                } else {
                    jD = j;
                }
                if (i18 != 0) {
                    f14 = N.f12244a;
                } else {
                    f14 = f12;
                }
                if (i20 != 0) {
                    f15 = N.f12245b;
                } else {
                    f15 = f13;
                }
                if (i22 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 8) != 0) {
                    z13 = true;
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -7169;
                } else {
                    z13 = true;
                }
                if (i16 != 0) {
                    z12 = z13;
                }
                if ((32 & i12) != 0) {
                    float f11111111111114 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    float f11111111111115 = N.f12244a;
                    float f2111111111111111112 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 &= -3670017;
                } else {
                    jD = j;
                }
                if (i18 != 0) {
                    f14 = N.f12244a;
                } else {
                    f14 = f12;
                }
                if (i20 != 0) {
                    f15 = N.f12245b;
                } else {
                    f15 = f13;
                }
                if (i22 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                C1085f0 c1085f119 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                c1086gP.E(c1085f119);
                objF = c1085f119;
            }
            x10 = (androidx.compose.runtime.X) objF;
            view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1110 = androidx.compose.foundation.layout.c0.f10254v;
            i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
            c1086gP.L(321499814);
            if (z10) {
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<p293xa.r> x12 = x10;
                            p293xa.r rVar = p293xa.r.f47939a;
                            x12.setValue(rVar);
                            return rVar;
                        }
                    };
                    c1086gP.E(objF5);
                }
                ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
            }
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                c1086gP.E(objF2);
            }
            k10 = (androidx.compose.animation.core.K) objF2;
            k10.f(Boolean.valueOf(z10));
            if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF3);
                }
                x11 = (androidx.compose.runtime.X) objF3;
                zK = c1086gP.K(cVar) | c1086gP.h(i28);
                objF4 = c1086gP.f();
                if (zK) {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                } else {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                }
                C c1111117 = (C) objF4;
                int i31111110 = B.f12050a;
                strC = c();
                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                if (((Boolean) vVarB.getValue()).booleanValue()) {
                    i29 = 393248;
                } else {
                    i29 = 393216;
                }
                if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                    i29 |= 8;
                } else {
                    i29 |= 8;
                }
                final androidx.compose.ui.h hVar1111112 = hVar3;
                final boolean z11111112 = z12;
                final ScrollState scrollState1111110 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var1111110 = l0VarA;
                final long j111111112 = jD;
                final float f2111111111111111113 = f14;
                final float f2111111111111111114 = f15;
                final C0937i c0937i1111111 = c0937i2;
                AndroidPopup_androidKt.a(c1111117, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            MenuKt.a(this.this$0.b(hVar1111112, z11111112), k10, x11, scrollState1111110, l0Var1111110, j111111112, f2111111111111111113, f2111111111111111114, c0937i1111111, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
            } else {
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF3);
                }
                x11 = (androidx.compose.runtime.X) objF3;
                zK = c1086gP.K(cVar) | c1086gP.h(i28);
                objF4 = c1086gP.f();
                if (zK) {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                } else {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                }
                C c1111118 = (C) objF4;
                int i31111111 = B.f12050a;
                strC = c();
                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                if (((Boolean) vVarB.getValue()).booleanValue()) {
                    i29 = 393248;
                } else {
                    i29 = 393216;
                }
                if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                    i29 |= 8;
                } else {
                    i29 |= 8;
                }
                final androidx.compose.ui.h hVar1111113 = hVar3;
                final boolean z11111113 = z12;
                final ScrollState scrollState1111111 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var1111111 = l0VarA;
                final long j111111113 = jD;
                final float f2111111111111111115 = f14;
                final float f2111111111111111116 = f15;
                final C0937i c0937i1111112 = c0937i2;
                AndroidPopup_androidKt.a(c1111118, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            MenuKt.a(this.this$0.b(hVar1111113, z11111113), k10, x11, scrollState1111111, l0Var1111111, j111111113, f2111111111111111115, f2111111111111111116, c0937i1111112, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
            }
            f16 = f14;
            f17 = f15;
            l0Var2 = l0VarA;
            hVar4 = hVar3;
            z14 = z12;
            scrollState2 = scrollStateA;
            c0937i3 = c0937i2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 8) != 0) {
                    z13 = true;
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -7169;
                } else {
                    z13 = true;
                }
                if (i16 != 0) {
                    z12 = z13;
                }
                if ((32 & i12) != 0) {
                    float f11111111111116 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    float f11111111111117 = N.f12244a;
                    float f2111111111111111117 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 &= -3670017;
                } else {
                    jD = j;
                }
                if (i18 != 0) {
                    f14 = N.f12244a;
                } else {
                    f14 = f12;
                }
                if (i20 != 0) {
                    f15 = N.f12245b;
                } else {
                    f15 = f13;
                }
                if (i22 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 8) != 0) {
                    z13 = true;
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -7169;
                } else {
                    z13 = true;
                }
                if (i16 != 0) {
                    z12 = z13;
                }
                if ((32 & i12) != 0) {
                    float f11111111111118 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    float f11111111111119 = N.f12244a;
                    float f2111111111111111118 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 &= -3670017;
                } else {
                    jD = j;
                }
                if (i18 != 0) {
                    f14 = N.f12244a;
                } else {
                    f14 = f12;
                }
                if (i20 != 0) {
                    f15 = N.f12245b;
                } else {
                    f15 = f13;
                }
                if (i22 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                C1085f0 c1085f1110 = new C1085f0(p293xa.r.f47939a, androidx.compose.runtime.Z.f12934a);
                c1086gP.E(c1085f1110);
                objF = c1085f1110;
            }
            x10 = (androidx.compose.runtime.X) objF;
            view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111 = androidx.compose.foundation.layout.c0.f10254v;
            i28 = androidx.compose.foundation.layout.c0.a.c(c1086gP).f10260f.e().f46852b;
            c1086gP.L(321499814);
            if (z10) {
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<p293xa.r> x12 = x10;
                            p293xa.r rVar = p293xa.r.f47939a;
                            x12.setValue(rVar);
                            return rVar;
                        }
                    };
                    c1086gP.E(objF5);
                }
                ExposedDropdownMenu_androidKt.b(view, cVar, (Ia.a) objF5, c1086gP, 384);
            }
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new androidx.compose.animation.core.K(Boolean.FALSE);
                c1086gP.E(objF2);
            }
            k10 = (androidx.compose.animation.core.K) objF2;
            k10.f(Boolean.valueOf(z10));
            if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF3);
                }
                x11 = (androidx.compose.runtime.X) objF3;
                zK = c1086gP.K(cVar) | c1086gP.h(i28);
                objF4 = c1086gP.f();
                if (zK) {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                } else {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                }
                C c1111119 = (C) objF4;
                int i31111112 = B.f12050a;
                strC = c();
                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                if (((Boolean) vVarB.getValue()).booleanValue()) {
                    i29 = 393248;
                } else {
                    i29 = 393216;
                }
                if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                    i29 |= 8;
                } else {
                    i29 |= 8;
                }
                final androidx.compose.ui.h hVar1111114 = hVar3;
                final boolean z11111114 = z12;
                final ScrollState scrollState1111112 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var1111112 = l0VarA;
                final long j111111114 = jD;
                final float f2111111111111111119 = f14;
                final float f21111111111111111110 = f15;
                final C0937i c0937i1111113 = c0937i2;
                AndroidPopup_androidKt.a(c1111119, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            MenuKt.a(this.this$0.b(hVar1111114, z11111114), k10, x11, scrollState1111112, l0Var1111112, j111111114, f2111111111111111119, f21111111111111111110, c0937i1111113, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
            } else {
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF3);
                }
                x11 = (androidx.compose.runtime.X) objF3;
                zK = c1086gP.K(cVar) | c1086gP.h(i28);
                objF4 = c1086gP.f();
                if (zK) {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                } else {
                    objF4 = new C(cVar, i28, x10, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x11.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF4);
                }
                C c11111110 = (C) objF4;
                int i31111113 = B.f12050a;
                strC = c();
                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                if (((Boolean) vVarB.getValue()).booleanValue()) {
                    i29 = 393248;
                } else {
                    i29 = 393216;
                }
                if (kotlin.jvm.internal.i.a(strC, "PrimaryEditable")) {
                    i29 |= 8;
                } else {
                    i29 |= 8;
                }
                final androidx.compose.ui.h hVar1111115 = hVar3;
                final boolean z11111115 = z12;
                final ScrollState scrollState1111113 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var1111113 = l0VarA;
                final long j111111115 = jD;
                final float f21111111111111111111 = f14;
                final float f21111111111111111112 = f15;
                final C0937i c0937i1111114 = c0937i2;
                AndroidPopup_androidKt.a(c11111110, aVar, new androidx.compose.ui.window.n(i29, true, true, true, true, false), androidx.compose.runtime.internal.a.b(-1082380263, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            MenuKt.a(this.this$0.b(hVar1111115, z11111115), k10, x11, scrollState1111113, l0Var1111113, j111111115, f21111111111111111111, f21111111111111111112, c0937i1111114, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072, 0);
            }
            f16 = f14;
            f17 = f15;
            l0Var2 = l0VarA;
            hVar4 = hVar3;
            z14 = z12;
            scrollState2 = scrollStateA;
            c0937i3 = c0937i2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j111111116 = jD;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp5_rcvr.a(z10, aVar, hVar4, scrollState2, z14, l0Var2, j111111116, f16, f17, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public abstract androidx.compose.ui.h b(androidx.compose.ui.h hVar, boolean z10);

    public abstract String c();

    public abstract androidx.compose.ui.h d(androidx.compose.ui.h hVar, boolean z10);
}
