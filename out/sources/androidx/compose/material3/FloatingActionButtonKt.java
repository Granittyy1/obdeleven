package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0917q;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonKt {
    static {
        C0917q c0917q = B.q.f1315c;
        androidx.compose.animation.p pVarF = EnterExitTransitionKt.f(C0907g.d(100, 0, c0917q, 2), 2);
        C0917q c0917q2 = B.q.f1313a;
        pVarF.b(EnterExitTransitionKt.h(C0907g.d(500, 0, c0917q2, 2)));
        EnterExitTransitionKt.e(new androidx.compose.animation.core.c0(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION, 100, c0917q), 0.0f, 2).b(EnterExitTransitionKt.a(C0907g.d(500, 0, c0917q2, 2)));
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x018e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:128:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01df  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:146:0x0205  */
    /* JADX WARN: Code duplicated, block: B:152:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x0215  */
    /* JADX WARN: Code duplicated, block: B:156:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0234  */
    /* JADX WARN: Code duplicated, block: B:161:0x0294  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, long j, long j10, J j11, androidx.compose.foundation.interaction.k kVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.graphics.l0 l0VarA;
        long jD;
        final long jB;
        J j12;
        int i13;
        androidx.compose.foundation.interaction.k kVar2;
        int i14;
        int i15;
        J j13;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.ui.graphics.l0 l0Var2;
        long j14;
        InterfaceC1084f.a.C0153a c0153a;
        androidx.compose.foundation.interaction.k kVar4;
        boolean zK;
        Object objF;
        K k10;
        boolean zK2;
        Object objF2;
        boolean zK3;
        Object objF3;
        final androidx.compose.foundation.interaction.k kVar5;
        final androidx.compose.ui.h hVar3;
        final J j15;
        final androidx.compose.ui.graphics.l0 l0Var3;
        Object objF4;
        C1105p0 c1105p0V;
        int i16;
        int i17;
        C1086g c1086gP = interfaceC1084f.p(-731723913);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = 2 & i11;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                        i17 = 256;
                    }
                    i12 |= i17;
                } else {
                    l0VarA = l0Var;
                }
                i17 = 128;
                i12 |= i17;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jD = j;
                    int i19 = c1086gP.i(jD) ? 2048 : 1024;
                    i12 |= i19;
                } else {
                    jD = j;
                }
                i12 |= i19;
            } else {
                jD = j;
            }
            if ((i10 & 24576) == 0) {
                jB = j10;
                if ((i11 & 16) == 0 || !c1086gP.i(jB)) {
                    i16 = 8192;
                } else {
                    i16 = 16384;
                }
                i12 |= i16;
            } else {
                jB = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j11;
                    int i20 = c1086gP.K(j12) ? 131072 : 65536;
                    i12 |= i20;
                } else {
                    j12 = j11;
                }
                i12 |= i20;
            } else {
                j12 = j11;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            if ((128 & i11) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) == 4793490 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((4 & i11) != 0) {
                        int i21 = I.f12185a;
                        i12 &= -897;
                        l0VarA = ShapesKt.a(B.j.f1274c, c1086gP);
                    }
                    if ((i11 & 8) != 0) {
                        int i22 = I.f12185a;
                        float f10 = B.j.f1272a;
                        i12 &= -7169;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12722o, c1086gP);
                    }
                    if ((16 & i11) != 0) {
                        i12 &= -57345;
                        jB = ColorSchemeKt.b(jD, c1086gP);
                    }
                    if ((i11 & 32) != 0) {
                        int i23 = I.f12185a;
                        j13 = new J(B.j.f1272a, B.j.f1278g, B.j.f1276e, B.j.f1277f);
                        i12 &= -458753;
                    } else {
                        j13 = j12;
                    }
                    if (i13 != 0) {
                        l0Var2 = l0VarA;
                        j14 = jD;
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                        l0Var2 = l0VarA;
                        j14 = jD;
                    }
                } else {
                    c1086gP.w();
                    if ((4 & i11) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((16 & i11) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    l0Var2 = l0VarA;
                    j14 = jD;
                    J j16 = j12;
                    kVar3 = kVar2;
                    j13 = j16;
                }
                c1086gP.U();
                c1086gP.L(519755085);
                c0153a = InterfaceC1084f.a.f12980a;
                if (kVar3 == null) {
                    objF4 = c1086gP.f();
                    if (objF4 == c0153a) {
                        objF4 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF4);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objF4;
                } else {
                    kVar4 = kVar3;
                }
                c1086gP.T(false);
                androidx.compose.foundation.interaction.k kVar6 = kVar3;
                androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar2, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                androidx.compose.ui.h hVar4 = hVar2;
                float f11 = j13.f12191a;
                int i24 = i12 >> 12;
                int i25 = i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                zK = c1086gP.K(kVar4);
                objF = c1086gP.f();
                if (zK || objF == c0153a) {
                    objF = new K(j13.f12191a, j13.f12192b, j13.f12194d, j13.f12193c);
                    c1086gP.E(objF);
                }
                k10 = (K) objF;
                zK2 = c1086gP.k(k10) | (((i25 ^ 48) <= 32 && c1086gP.K(j13)) || (i24 & 48) == 32);
                objF2 = c1086gP.f();
                if (zK2 || objF2 == c0153a) {
                    objF2 = new FloatingActionButtonElevation$animateElevation$1$1(k10, j13, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, j13);
                zK3 = c1086gP.K(kVar4) | c1086gP.k(k10);
                objF3 = c1086gP.f();
                if (zK3 || objF3 == c0153a) {
                    objF3 = new FloatingActionButtonElevation$animateElevation$2$1(kVar4, k10, null);
                    c1086gP.E(objF3);
                }
                androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, kVar4);
                int i26 = i12 & 14;
                int i27 = i12 << 3;
                SurfaceKt.c(aVar, hVarB, false, l0Var2, j14, jB, f11, ((p013b0.f) k10.f12199e.f9338c.f9544c.getValue()).f20481b, null, kVar4, androidx.compose.runtime.internal.a.b(1249316354, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
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
                            long j17 = jB;
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.h.f1270a, interfaceC1084f3);
                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            ProvideContentColorTextStyleKt.a(j17, fA, androidx.compose.runtime.internal.a.b(-1771489750, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(B.j.f1275d, B.j.f1273b, androidx.compose.ui.h.a.f13984b);
                                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarA);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar2);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar4);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i26 | (i27 & 7168) | (57344 & i27) | (i27 & 458752), 260);
                kVar5 = kVar6;
                hVar3 = hVar4;
                jD = j14;
                j15 = j13;
                l0Var3 = l0Var2;
            } else {
                c1086gP.w();
                j15 = j12;
                hVar3 = hVar2;
                kVar5 = kVar2;
                l0Var3 = l0VarA;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j17 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.a(aVar, hVar3, l0Var3, j17, jB, j15, kVar5, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                l0VarA = l0Var;
                if (c1086gP.K(l0VarA)) {
                    i17 = 256;
                }
                i12 |= i17;
            } else {
                l0VarA = l0Var;
            }
            i17 = 128;
            i12 |= i17;
        } else {
            l0VarA = l0Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jD = j;
                if (c1086gP.i(jD)) {
                }
                i12 |= i19;
            } else {
                jD = j;
            }
            i12 |= i19;
        } else {
            jD = j;
        }
        if ((i10 & 24576) == 0) {
            jB = j10;
            if ((i11 & 16) == 0) {
                i16 = 8192;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        } else {
            jB = j10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j12 = j11;
                if (c1086gP.K(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j11;
            }
            i12 |= i20;
        } else {
            j12 = j11;
        }
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if ((i10 & 1572864) == 0) {
                if (c1086gP.K(kVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        if ((128 & i11) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.k(pVar)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((4793491 & i12) == 4793490) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((4 & i11) != 0) {
                    int i28 = I.f12185a;
                    i12 &= -897;
                    l0VarA = ShapesKt.a(B.j.f1274c, c1086gP);
                }
                if ((i11 & 8) != 0) {
                    int i29 = I.f12185a;
                    float f12 = B.j.f1272a;
                    i12 &= -7169;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12722o, c1086gP);
                }
                if ((16 & i11) != 0) {
                    i12 &= -57345;
                    jB = ColorSchemeKt.b(jD, c1086gP);
                }
                if ((i11 & 32) != 0) {
                    int i210 = I.f12185a;
                    j13 = new J(B.j.f1272a, B.j.f1278g, B.j.f1276e, B.j.f1277f);
                    i12 &= -458753;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    l0Var2 = l0VarA;
                    j14 = jD;
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                    l0Var2 = l0VarA;
                    j14 = jD;
                }
            } else {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((4 & i11) != 0) {
                    int i211 = I.f12185a;
                    i12 &= -897;
                    l0VarA = ShapesKt.a(B.j.f1274c, c1086gP);
                }
                if ((i11 & 8) != 0) {
                    int i212 = I.f12185a;
                    float f13 = B.j.f1272a;
                    i12 &= -7169;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12722o, c1086gP);
                }
                if ((16 & i11) != 0) {
                    i12 &= -57345;
                    jB = ColorSchemeKt.b(jD, c1086gP);
                }
                if ((i11 & 32) != 0) {
                    int i213 = I.f12185a;
                    j13 = new J(B.j.f1272a, B.j.f1278g, B.j.f1276e, B.j.f1277f);
                    i12 &= -458753;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    l0Var2 = l0VarA;
                    j14 = jD;
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                    l0Var2 = l0VarA;
                    j14 = jD;
                }
            }
            c1086gP.U();
            c1086gP.L(519755085);
            c0153a = InterfaceC1084f.a.f12980a;
            if (kVar3 == null) {
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    objF4 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF4);
                }
                kVar4 = (androidx.compose.foundation.interaction.k) objF4;
            } else {
                kVar4 = kVar3;
            }
            c1086gP.T(false);
            androidx.compose.foundation.interaction.k kVar7 = kVar3;
            androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVar2, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            });
            androidx.compose.ui.h hVar5 = hVar2;
            float f14 = j13.f12191a;
            int i214 = i12 >> 12;
            int i215 = i214 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            zK = c1086gP.K(kVar4);
            objF = c1086gP.f();
            if (zK) {
                objF = new K(j13.f12191a, j13.f12192b, j13.f12194d, j13.f12193c);
                c1086gP.E(objF);
            } else {
                objF = new K(j13.f12191a, j13.f12192b, j13.f12194d, j13.f12193c);
                c1086gP.E(objF);
            }
            k10 = (K) objF;
            zK2 = c1086gP.k(k10) | (((i215 ^ 48) <= 32 && c1086gP.K(j13)) || (i214 & 48) == 32);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = new FloatingActionButtonElevation$animateElevation$1$1(k10, j13, null);
                c1086gP.E(objF2);
            } else {
                objF2 = new FloatingActionButtonElevation$animateElevation$1$1(k10, j13, null);
                c1086gP.E(objF2);
            }
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, j13);
            zK3 = c1086gP.K(kVar4) | c1086gP.k(k10);
            objF3 = c1086gP.f();
            if (zK3) {
                objF3 = new FloatingActionButtonElevation$animateElevation$2$1(kVar4, k10, null);
                c1086gP.E(objF3);
            } else {
                objF3 = new FloatingActionButtonElevation$animateElevation$2$1(kVar4, k10, null);
                c1086gP.E(objF3);
            }
            androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, kVar4);
            int i216 = i12 & 14;
            int i217 = i12 << 3;
            SurfaceKt.c(aVar, hVarB2, false, l0Var2, j14, jB, f14, ((p013b0.f) k10.f12199e.f9338c.f9544c.getValue()).f20481b, null, kVar4, androidx.compose.runtime.internal.a.b(1249316354, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
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
                        long j18 = jB;
                        androidx.compose.ui.text.F fA = TypographyKt.a(B.h.f1270a, interfaceC1084f3);
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                        ProvideContentColorTextStyleKt.a(j18, fA, androidx.compose.runtime.internal.a.b(-1771489750, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(B.j.f1275d, B.j.f1273b, androidx.compose.ui.h.a.f13984b);
                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar2);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar4);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f5, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 384);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i216 | (i217 & 7168) | (57344 & i217) | (i217 & 458752), 260);
            kVar5 = kVar7;
            hVar3 = hVar5;
            jD = j14;
            j15 = j13;
            l0Var3 = l0Var2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((4 & i11) != 0) {
                    int i218 = I.f12185a;
                    i12 &= -897;
                    l0VarA = ShapesKt.a(B.j.f1274c, c1086gP);
                }
                if ((i11 & 8) != 0) {
                    int i219 = I.f12185a;
                    float f15 = B.j.f1272a;
                    i12 &= -7169;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12722o, c1086gP);
                }
                if ((16 & i11) != 0) {
                    i12 &= -57345;
                    jB = ColorSchemeKt.b(jD, c1086gP);
                }
                if ((i11 & 32) != 0) {
                    int i2110 = I.f12185a;
                    j13 = new J(B.j.f1272a, B.j.f1278g, B.j.f1276e, B.j.f1277f);
                    i12 &= -458753;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    l0Var2 = l0VarA;
                    j14 = jD;
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                    l0Var2 = l0VarA;
                    j14 = jD;
                }
            } else {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((4 & i11) != 0) {
                    int i2111 = I.f12185a;
                    i12 &= -897;
                    l0VarA = ShapesKt.a(B.j.f1274c, c1086gP);
                }
                if ((i11 & 8) != 0) {
                    int i2112 = I.f12185a;
                    float f16 = B.j.f1272a;
                    i12 &= -7169;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12722o, c1086gP);
                }
                if ((16 & i11) != 0) {
                    i12 &= -57345;
                    jB = ColorSchemeKt.b(jD, c1086gP);
                }
                if ((i11 & 32) != 0) {
                    int i2113 = I.f12185a;
                    j13 = new J(B.j.f1272a, B.j.f1278g, B.j.f1276e, B.j.f1277f);
                    i12 &= -458753;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    l0Var2 = l0VarA;
                    j14 = jD;
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                    l0Var2 = l0VarA;
                    j14 = jD;
                }
            }
            c1086gP.U();
            c1086gP.L(519755085);
            c0153a = InterfaceC1084f.a.f12980a;
            if (kVar3 == null) {
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    objF4 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF4);
                }
                kVar4 = (androidx.compose.foundation.interaction.k) objF4;
            } else {
                kVar4 = kVar3;
            }
            c1086gP.T(false);
            androidx.compose.foundation.interaction.k kVar8 = kVar3;
            androidx.compose.ui.h hVarB3 = androidx.compose.ui.semantics.p.b(hVar2, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            });
            androidx.compose.ui.h hVar6 = hVar2;
            float f17 = j13.f12191a;
            int i2114 = i12 >> 12;
            int i2115 = i2114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            zK = c1086gP.K(kVar4);
            objF = c1086gP.f();
            if (zK) {
                objF = new K(j13.f12191a, j13.f12192b, j13.f12194d, j13.f12193c);
                c1086gP.E(objF);
            } else {
                objF = new K(j13.f12191a, j13.f12192b, j13.f12194d, j13.f12193c);
                c1086gP.E(objF);
            }
            k10 = (K) objF;
            zK2 = c1086gP.k(k10) | (((i2115 ^ 48) <= 32 && c1086gP.K(j13)) || (i2114 & 48) == 32);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = new FloatingActionButtonElevation$animateElevation$1$1(k10, j13, null);
                c1086gP.E(objF2);
            } else {
                objF2 = new FloatingActionButtonElevation$animateElevation$1$1(k10, j13, null);
                c1086gP.E(objF2);
            }
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, j13);
            zK3 = c1086gP.K(kVar4) | c1086gP.k(k10);
            objF3 = c1086gP.f();
            if (zK3) {
                objF3 = new FloatingActionButtonElevation$animateElevation$2$1(kVar4, k10, null);
                c1086gP.E(objF3);
            } else {
                objF3 = new FloatingActionButtonElevation$animateElevation$2$1(kVar4, k10, null);
                c1086gP.E(objF3);
            }
            androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, kVar4);
            int i2116 = i12 & 14;
            int i2117 = i12 << 3;
            SurfaceKt.c(aVar, hVarB3, false, l0Var2, j14, jB, f17, ((p013b0.f) k10.f12199e.f9338c.f9544c.getValue()).f20481b, null, kVar4, androidx.compose.runtime.internal.a.b(1249316354, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
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
                        long j18 = jB;
                        androidx.compose.ui.text.F fA = TypographyKt.a(B.h.f1270a, interfaceC1084f3);
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                        ProvideContentColorTextStyleKt.a(j18, fA, androidx.compose.runtime.internal.a.b(-1771489750, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(B.j.f1275d, B.j.f1273b, androidx.compose.ui.h.a.f13984b);
                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar2);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar4);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar3, interfaceC1084f5, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 384);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i2116 | (i2117 & 7168) | (57344 & i2117) | (i2117 & 458752), 260);
            kVar5 = kVar8;
            hVar3 = hVar6;
            jD = j14;
            j15 = j13;
            l0Var3 = l0Var2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j18 = jD;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    FloatingActionButtonKt.a(aVar, hVar3, l0Var3, j18, jB, j15, kVar5, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
