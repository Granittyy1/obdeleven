package com.voltasit.obdeleven.presentation.components;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.S;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.T;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: LabeledSwitch.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LabeledSwitchKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x016f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0171  */
    /* JADX WARN: Code duplicated, block: B:110:0x0176  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x0180  */
    /* JADX WARN: Code duplicated, block: B:116:0x0184  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:125:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final void a(final String label, final boolean z10, final l<? super Boolean, r> onCheckedChange, S s10, androidx.compose.ui.text.font.l lVar, long j, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        S sA;
        androidx.compose.ui.text.font.l lVar2;
        long j11;
        final long j12;
        int i13;
        androidx.compose.ui.text.font.l lVar3;
        long jG;
        long j13;
        S s11;
        androidx.compose.ui.text.font.l lVar4;
        long j14;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objF;
        int i15;
        Ia.a<ComposeUiNode> aVar;
        p<ComposeUiNode, Integer, r> pVar;
        C1086g c1086g;
        final S s12;
        final androidx.compose.ui.text.font.l lVar5;
        final long j15;
        C1105p0 c1105p0V;
        i.e(label, "label");
        i.e(onCheckedChange, "onCheckedChange");
        C1086g c1086gP = interfaceC1084f.p(1352635336);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(label) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onCheckedChange) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                sA = s10;
                int i16 = c1086gP.K(sA) ? 2048 : 1024;
                i12 |= i16;
            } else {
                sA = s10;
            }
            i12 |= i16;
        } else {
            sA = s10;
        }
        int i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= 24576;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((57344 & i10) == 0) {
                i12 |= c1086gP.K(lVar2) ? 16384 : 8192;
            }
        }
        int i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= 196608;
            j11 = j;
        } else {
            j11 = j;
            if ((i10 & 458752) == 0) {
                i12 |= c1086gP.i(j11) ? 131072 : 65536;
            }
        }
        int i19 = i11 & 64;
        if (i19 == 0) {
            if ((3670016 & i10) == 0) {
                j12 = j10;
                i12 |= c1086gP.i(j12) ? 1048576 : 524288;
            }
            if ((2995931 & i12) == 599186 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        i13 = 256;
                        sA = T.a(e.a.f32293q, e.a.f32294r, 1.0f, c1086gP, 967);
                    } else {
                        i13 = 256;
                    }
                    if (i17 != 0) {
                        lVar3 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar3 = lVar;
                    }
                    if (i18 != 0) {
                        jG = G0.a.g(16);
                    } else {
                        jG = j;
                    }
                    if (i19 != 0) {
                        s11 = sA;
                        lVar4 = lVar3;
                        j14 = jG;
                        j13 = H.f13504l;
                    } else {
                        j13 = j10;
                        s11 = sA;
                        lVar4 = lVar3;
                        j14 = jG;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    s11 = sA;
                    j13 = j12;
                    j14 = j11;
                    lVar4 = lVar2;
                    i13 = 256;
                }
                i14 = i12;
                c1086gP.U();
                h hVarD = W.d(h.a.f13984b, 1.0f);
                c1086gP.L(-1637591554);
                if ((i14 & 896) == i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | z11;
                objF = c1086gP.f();
                if (z13 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onCheckedChange.invoke(Boolean.valueOf(!z10));
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                h hVarC = ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7);
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                TextKt.b(label, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), j13, j14, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i14 & 14) | ((i14 >> 12) & 896) | ((i14 >> 6) & 7168) | ((i14 << 3) & 458752), 0, 131024);
                SwitchKt.a(z10, onCheckedChange, null, false, null, s11, c1086gP, ((i14 >> 3) & R.styleable.AppCompatTheme_windowNoTitle) | ((i14 << 6) & 458752), 28);
                c1086g = c1086gP;
                c1086g.T(true);
                s12 = s11;
                lVar5 = lVar4;
                j15 = j14;
                j12 = j13;
            } else {
                c1086gP.w();
                s12 = sA;
                c1086g = c1086gP;
                j15 = j11;
                lVar5 = lVar2;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        LabeledSwitchKt.a(label, z10, onCheckedChange, s12, lVar5, j15, j12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 1572864;
        j12 = j10;
        if ((2995931 & i12) == 599186) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    i13 = 256;
                    sA = T.a(e.a.f32293q, e.a.f32294r, 1.0f, c1086gP, 967);
                } else {
                    i13 = 256;
                }
                if (i17 != 0) {
                    lVar3 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar3 = lVar;
                }
                if (i18 != 0) {
                    jG = G0.a.g(16);
                } else {
                    jG = j;
                }
                if (i19 != 0) {
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                    j13 = H.f13504l;
                } else {
                    j13 = j10;
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                }
            } else {
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    i13 = 256;
                    sA = T.a(e.a.f32293q, e.a.f32294r, 1.0f, c1086gP, 967);
                } else {
                    i13 = 256;
                }
                if (i17 != 0) {
                    lVar3 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar3 = lVar;
                }
                if (i18 != 0) {
                    jG = G0.a.g(16);
                } else {
                    jG = j;
                }
                if (i19 != 0) {
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                    j13 = H.f13504l;
                } else {
                    j13 = j10;
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                }
            }
            i14 = i12;
            c1086gP.U();
            h hVarD2 = W.d(h.a.f13984b, 1.0f);
            c1086gP.L(-1637591554);
            if ((i14 & 896) == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | z11;
            objF = c1086gP.f();
            if (z13) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckedChange.invoke(Boolean.valueOf(!z10));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckedChange.invoke(Boolean.valueOf(!z10));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            h hVarC3 = ClickableKt.c(hVarD2, false, null, (Ia.a) objF, 7);
            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC4 = ComposedModifierKt.c(c1086gP, hVarC3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(label, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), j13, j14, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i14 & 14) | ((i14 >> 12) & 896) | ((i14 >> 6) & 7168) | ((i14 << 3) & 458752), 0, 131024);
            SwitchKt.a(z10, onCheckedChange, null, false, null, s11, c1086gP, ((i14 >> 3) & R.styleable.AppCompatTheme_windowNoTitle) | ((i14 << 6) & 458752), 28);
            c1086g = c1086gP;
            c1086g.T(true);
            s12 = s11;
            lVar5 = lVar4;
            j15 = j14;
            j12 = j13;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    i13 = 256;
                    sA = T.a(e.a.f32293q, e.a.f32294r, 1.0f, c1086gP, 967);
                } else {
                    i13 = 256;
                }
                if (i17 != 0) {
                    lVar3 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar3 = lVar;
                }
                if (i18 != 0) {
                    jG = G0.a.g(16);
                } else {
                    jG = j;
                }
                if (i19 != 0) {
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                    j13 = H.f13504l;
                } else {
                    j13 = j10;
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                }
            } else {
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    i13 = 256;
                    sA = T.a(e.a.f32293q, e.a.f32294r, 1.0f, c1086gP, 967);
                } else {
                    i13 = 256;
                }
                if (i17 != 0) {
                    lVar3 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar3 = lVar;
                }
                if (i18 != 0) {
                    jG = G0.a.g(16);
                } else {
                    jG = j;
                }
                if (i19 != 0) {
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                    j13 = H.f13504l;
                } else {
                    j13 = j10;
                    s11 = sA;
                    lVar4 = lVar3;
                    j14 = jG;
                }
            }
            i14 = i12;
            c1086gP.U();
            h hVarD3 = W.d(h.a.f13984b, 1.0f);
            c1086gP.L(-1637591554);
            if ((i14 & 896) == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | z11;
            objF = c1086gP.f();
            if (z13) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckedChange.invoke(Boolean.valueOf(!z10));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckedChange.invoke(Boolean.valueOf(!z10));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            h hVarC5 = ClickableKt.c(hVarD3, false, null, (Ia.a) objF, 7);
            androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC6 = ComposedModifierKt.c(c1086gP, hVarC5);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(label, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), j13, j14, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i14 & 14) | ((i14 >> 12) & 896) | ((i14 >> 6) & 7168) | ((i14 << 3) & 458752), 0, 131024);
            SwitchKt.a(z10, onCheckedChange, null, false, null, s11, c1086gP, ((i14 >> 3) & R.styleable.AppCompatTheme_windowNoTitle) | ((i14 << 6) & 458752), 28);
            c1086g = c1086gP;
            c1086g.T(true);
            s12 = s11;
            lVar5 = lVar4;
            j15 = j14;
            j12 = j13;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.LabeledSwitchKt$LabeledSwitch$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LabeledSwitchKt.a(label, z10, onCheckedChange, s12, lVar5, j15, j12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
