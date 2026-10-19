package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BoxedTextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoxedTextLayoutKt {
    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:110:0x021c  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[PHI: r5 r6 r7 r10
      0x00e5: PHI (r5v18 androidx.compose.ui.h) = (r5v4 androidx.compose.ui.h), (r5v3 androidx.compose.ui.h), (r5v3 androidx.compose.ui.h) binds: [B:89:0x0105, B:78:0x00e1, B:79:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r6v21 int) = (r6v16 int), (r6v15 int), (r6v22 int) binds: [B:89:0x0105, B:78:0x00e1, B:79:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r7v25 long) = (r7v15 long), (r7v14 long), (r7v14 long) binds: [B:89:0x0105, B:78:0x00e1, B:79:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r10v9 Ia.q<? super androidx.compose.foundation.layout.U, ? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>) = 
      (r10v4 Ia.q<? super androidx.compose.foundation.layout.U, ? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r10v3 Ia.q<? super androidx.compose.foundation.layout.U, ? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r10v3 Ia.q<? super androidx.compose.foundation.layout.U, ? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
     binds: [B:89:0x0105, B:78:0x00e1, B:79:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    /* JADX INFO: renamed from: BoxedTextLayout-Y0xEhic, reason: not valid java name */
    public static final void m506BoxedTextLayoutY0xEhic(androidx.compose.ui.h hVar, final String text, final long j, long j10, Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long jM645getPrimaryText0d7_KjU;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        int i13;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        int i14;
        int i15;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        int i16;
        long j11;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar5;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar6;
        int i17;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        V v10;
        int i18;
        int i19;
        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar7;
        C1086g c1086g;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-1728859823);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(text) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.i(j) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM645getPrimaryText0d7_KjU = j10;
                int i21 = c1086gP.i(jM645getPrimaryText0d7_KjU) ? 2048 : 1024;
                i12 |= i21;
            } else {
                jM645getPrimaryText0d7_KjU = j10;
            }
            i12 |= i21;
        } else {
            jM645getPrimaryText0d7_KjU = j10;
        }
        int i22 = i11 & 16;
        if (i22 == 0) {
            if ((57344 & i10) == 0) {
                qVar3 = qVar;
                i12 |= c1086gP.k(qVar3) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    qVar4 = qVar2;
                    if (c1086gP.k(qVar4)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((374491 & i12) == 74898 || !c1086gP.s()) {
                    c1086gP.r0();
                    i15 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i15 != 0 || c1086gP.a0()) {
                        if (i20 != 0) {
                            hVar2 = aVar;
                        }
                        if ((i11 & 8) != 0) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                            i12 &= -7169;
                        }
                        if (i22 != 0) {
                            qVar3 = null;
                        }
                        if (i13 != 0) {
                            hVar3 = hVar2;
                            i16 = i12;
                            j11 = jM645getPrimaryText0d7_KjU;
                            qVar5 = qVar3;
                            qVar6 = null;
                        }
                        c1086gP.U();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        float f10 = 8;
                        androidx.compose.ui.h hVarF = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f10);
                        T tA = S.a(C0945e.g(f10), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                            J4.i.d(i17, c1086gP, i17, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        v10 = V.f10222a;
                        c1086gP.L(581650633);
                        if (qVar5 != null) {
                            i18 = 6;
                            qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        } else {
                            i18 = 6;
                        }
                        c1086gP.T(false);
                        i19 = i18;
                        Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar8 = qVar5;
                        qVar7 = qVar6;
                        androidx.compose.ui.h hVar4 = hVar3;
                        TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                        c1086g = c1086gP;
                        c1086g.L(581663143);
                        if (qVar7 != null) {
                            qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                        }
                        c1086g.T(false);
                        c1086g.T(true);
                        qVar4 = qVar7;
                        jM645getPrimaryText0d7_KjU = j11;
                        qVar3 = qVar8;
                        hVar2 = hVar4;
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                    }
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar2;
                    c1086gP.U();
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    float f11 = 8;
                    androidx.compose.ui.h hVarF2 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme2.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f11);
                    T tA2 = S.a(C0945e.g(f11), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarF2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                    v10 = V.f10222a;
                    c1086gP.L(581650633);
                    if (qVar5 != null) {
                        i18 = 6;
                        qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    } else {
                        i18 = 6;
                    }
                    c1086gP.T(false);
                    i19 = i18;
                    Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar9 = qVar5;
                    qVar7 = qVar6;
                    androidx.compose.ui.h hVar5 = hVar3;
                    TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme2.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                    c1086g = c1086gP;
                    c1086g.L(581663143);
                    if (qVar7 != null) {
                        qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    qVar4 = qVar7;
                    jM645getPrimaryText0d7_KjU = j11;
                    qVar3 = qVar9;
                    hVar2 = hVar5;
                } else {
                    c1086gP.w();
                    c1086g = c1086gP;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar6 = hVar2;
                    final long j12 = jM645getPrimaryText0d7_KjU;
                    final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar10 = qVar3;
                    final Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11 = qVar4;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.a
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(hVar6, text, j, j12, qVar10, qVar11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 196608;
            qVar4 = qVar2;
            if ((374491 & i12) == 74898) {
                c1086gP.r0();
                i15 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                } else {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                }
                c1086gP.U();
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                float f12 = 8;
                androidx.compose.ui.h hVarF3 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme3.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f12);
                T tA3 = S.a(C0945e.g(f12), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarF3);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                v10 = V.f10222a;
                c1086gP.L(581650633);
                if (qVar5 != null) {
                    i18 = 6;
                    qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                } else {
                    i18 = 6;
                }
                c1086gP.T(false);
                i19 = i18;
                Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar12 = qVar5;
                qVar7 = qVar6;
                androidx.compose.ui.h hVar7 = hVar3;
                TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme3.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                c1086g = c1086gP;
                c1086g.L(581663143);
                if (qVar7 != null) {
                    qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                }
                c1086g.T(false);
                c1086g.T(true);
                qVar4 = qVar7;
                jM645getPrimaryText0d7_KjU = j11;
                qVar3 = qVar12;
                hVar2 = hVar7;
            } else {
                c1086gP.r0();
                i15 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                } else {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                }
                c1086gP.U();
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                float f13 = 8;
                androidx.compose.ui.h hVarF4 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme4.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f13);
                T tA4 = S.a(C0945e.g(f13), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarF4);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                v10 = V.f10222a;
                c1086gP.L(581650633);
                if (qVar5 != null) {
                    i18 = 6;
                    qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                } else {
                    i18 = 6;
                }
                c1086gP.T(false);
                i19 = i18;
                Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar13 = qVar5;
                qVar7 = qVar6;
                androidx.compose.ui.h hVar8 = hVar3;
                TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme4.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                c1086g = c1086gP;
                c1086g.L(581663143);
                if (qVar7 != null) {
                    qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                }
                c1086g.T(false);
                c1086g.T(true);
                qVar4 = qVar7;
                jM645getPrimaryText0d7_KjU = j11;
                qVar3 = qVar13;
                hVar2 = hVar8;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar9 = hVar2;
                final long j13 = jM645getPrimaryText0d7_KjU;
                final Ia.q qVar14 = qVar3;
                final Ia.q qVar15 = qVar4;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.a
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(hVar9, text, j, j13, qVar14, qVar15, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        qVar3 = qVar;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                qVar4 = qVar2;
                if (c1086gP.k(qVar4)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((374491 & i12) == 74898) {
                c1086gP.r0();
                i15 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                } else {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                }
                c1086gP.U();
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                float f14 = 8;
                androidx.compose.ui.h hVarF5 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme5.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f14);
                T tA5 = S.a(C0945e.g(f14), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarF5);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                v10 = V.f10222a;
                c1086gP.L(581650633);
                if (qVar5 != null) {
                    i18 = 6;
                    qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                } else {
                    i18 = 6;
                }
                c1086gP.T(false);
                i19 = i18;
                Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar16 = qVar5;
                qVar7 = qVar6;
                androidx.compose.ui.h hVar10 = hVar3;
                TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme5.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                c1086g = c1086gP;
                c1086g.L(581663143);
                if (qVar7 != null) {
                    qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                }
                c1086g.T(false);
                c1086g.T(true);
                qVar4 = qVar7;
                jM645getPrimaryText0d7_KjU = j11;
                qVar3 = qVar16;
                hVar2 = hVar10;
            } else {
                c1086gP.r0();
                i15 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i15 != 0) {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                } else {
                    if (i20 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 8) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    }
                    if (i22 != 0) {
                        qVar3 = null;
                    }
                    if (i13 != 0) {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = null;
                    } else {
                        hVar3 = hVar2;
                        i16 = i12;
                        j11 = jM645getPrimaryText0d7_KjU;
                        qVar5 = qVar3;
                        qVar6 = qVar2;
                    }
                }
                c1086gP.U();
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                float f15 = 8;
                androidx.compose.ui.h hVarF6 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme6.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f15);
                T tA6 = S.a(C0945e.g(f15), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarF6);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                v10 = V.f10222a;
                c1086gP.L(581650633);
                if (qVar5 != null) {
                    i18 = 6;
                    qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                } else {
                    i18 = 6;
                }
                c1086gP.T(false);
                i19 = i18;
                Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar17 = qVar5;
                qVar7 = qVar6;
                androidx.compose.ui.h hVar11 = hVar3;
                TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme6.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
                c1086g = c1086gP;
                c1086g.L(581663143);
                if (qVar7 != null) {
                    qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
                }
                c1086g.T(false);
                c1086g.T(true);
                qVar4 = qVar7;
                jM645getPrimaryText0d7_KjU = j11;
                qVar3 = qVar17;
                hVar2 = hVar11;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar12 = hVar2;
                final long j14 = jM645getPrimaryText0d7_KjU;
                final Ia.q qVar18 = qVar3;
                final Ia.q qVar19 = qVar4;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.a
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(hVar12, text, j, j14, qVar18, qVar19, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 196608;
        qVar4 = qVar2;
        if ((374491 & i12) == 74898) {
            c1086gP.r0();
            i15 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                if (i20 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 8) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                    i12 &= -7169;
                }
                if (i22 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = null;
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar2;
                }
            } else {
                if (i20 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 8) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                    i12 &= -7169;
                }
                if (i22 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = null;
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar2;
                }
            }
            c1086gP.U();
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            float f16 = 8;
            androidx.compose.ui.h hVarF7 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme7.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f16);
            T tA7 = S.a(C0945e.g(f16), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarF7);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA7);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            v10 = V.f10222a;
            c1086gP.L(581650633);
            if (qVar5 != null) {
                i18 = 6;
                qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            } else {
                i18 = 6;
            }
            c1086gP.T(false);
            i19 = i18;
            Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar110 = qVar5;
            qVar7 = qVar6;
            androidx.compose.ui.h hVar13 = hVar3;
            TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme7.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
            c1086g = c1086gP;
            c1086g.L(581663143);
            if (qVar7 != null) {
                qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            }
            c1086g.T(false);
            c1086g.T(true);
            qVar4 = qVar7;
            jM645getPrimaryText0d7_KjU = j11;
            qVar3 = qVar110;
            hVar2 = hVar13;
        } else {
            c1086gP.r0();
            i15 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i15 != 0) {
                if (i20 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 8) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                    i12 &= -7169;
                }
                if (i22 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = null;
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar2;
                }
            } else {
                if (i20 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 8) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m645getPrimaryText0d7_KjU();
                    i12 &= -7169;
                }
                if (i22 != 0) {
                    qVar3 = null;
                }
                if (i13 != 0) {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = null;
                } else {
                    hVar3 = hVar2;
                    i16 = i12;
                    j11 = jM645getPrimaryText0d7_KjU;
                    qVar5 = qVar3;
                    qVar6 = qVar2;
                }
            }
            c1086gP.U();
            IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
            float f17 = 8;
            androidx.compose.ui.h hVarF8 = PaddingKt.f(A8.p.r(C0935g.a(hVar3, 1, j, intercomTheme8.getShapes(c1086gP, 6).f12430b), p270w.g.a(2)), f17);
            T tA8 = S.a(C0945e.g(f17), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarF8);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA8);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i17, c1086gP, i17, pVar);
            } else {
                J4.i.d(i17, c1086gP, i17, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
            v10 = V.f10222a;
            c1086gP.L(581650633);
            if (qVar5 != null) {
                i18 = 6;
                qVar5.invoke(v10, c1086gP, Integer.valueOf(((i16 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            } else {
                i18 = 6;
            }
            c1086gP.T(false);
            i19 = i18;
            Ia.q<? super U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111 = qVar5;
            qVar7 = qVar6;
            androidx.compose.ui.h hVar14 = hVar3;
            TextKt.b(text, v10.b(aVar, false), j11, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, intercomTheme8.getTypography(c1086gP, i18).getType04(), c1086gP, (i16 >> 3) & 910, 3120, 55288);
            c1086g = c1086gP;
            c1086g.L(581663143);
            if (qVar7 != null) {
                qVar7.invoke(v10, c1086g, Integer.valueOf(i19 | ((i16 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)));
            }
            c1086g.T(false);
            c1086g.T(true);
            qVar4 = qVar7;
            jM645getPrimaryText0d7_KjU = j11;
            qVar3 = qVar111;
            hVar2 = hVar14;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar15 = hVar2;
            final long j15 = jM645getPrimaryText0d7_KjU;
            final Ia.q qVar112 = qVar3;
            final Ia.q qVar113 = qVar4;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(hVar15, text, j, j15, qVar112, qVar113, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BoxedTextLayout_Y0xEhic$lambda$1(androidx.compose.ui.h hVar, String text, long j, long j10, Ia.q qVar, Ia.q qVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        m506BoxedTextLayoutY0xEhic(hVar, text, j, j10, qVar, qVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
