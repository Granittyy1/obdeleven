package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.ComposeUiNode;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11748a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11749b = 48;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11750c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11751d = 20;

    /* JADX WARN: Code duplicated, block: B:101:0x010a  */
    /* JADX WARN: Code duplicated, block: B:102:0x010c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0115  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:124:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0155  */
    /* JADX WARN: Code duplicated, block: B:126:0x0158  */
    /* JADX WARN: Code duplicated, block: B:129:0x015d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0161  */
    /* JADX WARN: Code duplicated, block: B:135:0x0167  */
    /* JADX WARN: Code duplicated, block: B:136:0x0180  */
    /* JADX WARN: Code duplicated, block: B:139:0x0186  */
    /* JADX WARN: Code duplicated, block: B:142:0x0198  */
    /* JADX WARN: Code duplicated, block: B:143:0x019f  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x020f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0220  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
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
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x00fe  */
    public static final void a(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, androidx.compose.foundation.interaction.k kVar, l0 l0Var, long j, long j10, C c10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3;
        int i16;
        int i17;
        int i18;
        long jG;
        final long j11;
        final C c11;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final androidx.compose.foundation.interaction.k kVar2;
        final l0 l0Var2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        final long j12;
        C1105p0 c1105p0V;
        androidx.compose.foundation.interaction.k kVar3;
        l0 l0VarA;
        long jB;
        C cV;
        long j13;
        int i19;
        int i20;
        C1086g c1086gP = interfaceC1084f.p(-1555720195);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.k(aVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.K(hVar)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        pVar3 = pVar2;
                        if (c1086gP.k(pVar3)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c1086gP.K(kVar)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((196608 & i10) != 0) {
                            i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                        }
                        if ((1572864 & i10) == 0) {
                            jG = j;
                            if ((i11 & 64) == 0 || !c1086gP.i(jG)) {
                                i20 = 524288;
                            } else {
                                i20 = 1048576;
                            }
                            i12 |= i20;
                        } else {
                            jG = j;
                        }
                        if ((i10 & 12582912) == 0) {
                            j11 = j10;
                            if ((i11 & 128) == 0 || !c1086gP.i(j11)) {
                                i19 = 4194304;
                            } else {
                                i19 = 8388608;
                            }
                            i12 |= i19;
                        } else {
                            j11 = j10;
                        }
                        if ((100663296 & i10) == 0) {
                            if ((i11 & 256) == 0) {
                                c11 = c10;
                                int i21 = c1086gP.K(c11) ? 67108864 : 33554432;
                                i12 |= i21;
                            } else {
                                c11 = c10;
                            }
                            i12 |= i21;
                        } else {
                            c11 = c10;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i13 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i15 != 0) {
                                    pVar3 = null;
                                }
                                kVar3 = i17 == 0 ? kVar : null;
                                if ((i11 & 32) != 0) {
                                    p270w.a aVar2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    p270w.e eVar = new p270w.e(50);
                                    l0VarA = aVar2.a(eVar, eVar, eVar, eVar);
                                    i12 &= -458753;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((i11 & 64) != 0) {
                                    jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    jB = ColorsKt.b(jG, c1086gP);
                                    i12 &= -29360129;
                                } else {
                                    jB = j11;
                                }
                                if ((i11 & 256) != 0) {
                                    cV = A8.p.v(c1086gP);
                                    i12 &= -234881025;
                                } else {
                                    cV = c11;
                                }
                                j13 = jB;
                            } else {
                                c1086gP.w();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                hVar2 = hVar;
                                kVar3 = kVar;
                                l0VarA = l0Var;
                                cV = c11;
                                j13 = j11;
                            }
                            long j14 = jG;
                            c1086gP.U();
                            float f10 = f11749b;
                            int i22 = ((i12 >> 3) & 14) | 12582912;
                            int i23 = i12 >> 6;
                            b(aVar, W.p(hVar2, f10, f10, 0.0f, 0.0f, 12), kVar3, l0VarA, j14, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                        float f11 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                                        androidx.compose.ui.h hVarJ = PaddingKt.j(aVar3, f11, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f3.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f3.r();
                                        if (interfaceC1084f3.m()) {
                                            interfaceC1084f3.v(aVar4);
                                        } else {
                                            interfaceC1084f3.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        if (pVar5 != null) {
                                            interfaceC1084f3.L(-565217870);
                                            pVar5.invoke(interfaceC1084f3, 0);
                                            Lb.a.a(interfaceC1084f3, W.q(aVar3, FloatingActionButtonKt.f11750c));
                                            interfaceC1084f3.D();
                                        } else {
                                            interfaceC1084f3.L(-565120809);
                                            interfaceC1084f3.D();
                                        }
                                        pVar6.invoke(interfaceC1084f3, 0);
                                        interfaceC1084f3.J();
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, i22 | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016), 0);
                            l0 l0Var3 = l0VarA;
                            kVar2 = kVar3;
                            pVar4 = pVar3;
                            j12 = j14;
                            j11 = j13;
                            c11 = cV;
                            l0Var2 = l0Var3;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            kVar2 = kVar;
                            l0Var2 = l0Var;
                            pVar4 = pVar3;
                            j12 = jG;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jG = j;
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    } else {
                        jG = j;
                    }
                    if ((i10 & 12582912) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i19 = 4194304;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    } else {
                        j11 = j10;
                    }
                    if ((100663296 & i10) == 0) {
                        if ((i11 & 256) == 0) {
                            c11 = c10;
                            if (c1086gP.K(c11)) {
                            }
                            i12 |= i21;
                        } else {
                            c11 = c10;
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar2 = new p270w.e(50);
                                l0VarA = aVar3.a(eVar2, eVar2, eVar2, eVar2);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar4 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar3 = new p270w.e(50);
                                l0VarA = aVar4.a(eVar3, eVar3, eVar3, eVar3);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        }
                        long j15 = jG;
                        c1086gP.U();
                        float f11 = f11749b;
                        int i24 = ((i12 >> 3) & 14) | 12582912;
                        int i25 = i12 >> 6;
                        b(aVar, W.p(hVar2, f11, f11, 0.0f, 0.0f, 12), kVar3, l0VarA, j15, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                    float f12 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                                    androidx.compose.ui.h hVarJ = PaddingKt.j(aVar5, f12, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar6);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    if (pVar5 != null) {
                                        interfaceC1084f3.L(-565217870);
                                        pVar5.invoke(interfaceC1084f3, 0);
                                        Lb.a.a(interfaceC1084f3, W.q(aVar5, FloatingActionButtonKt.f11750c));
                                        interfaceC1084f3.D();
                                    } else {
                                        interfaceC1084f3.L(-565120809);
                                        interfaceC1084f3.D();
                                    }
                                    pVar6.invoke(interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i24 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                        l0 l0Var4 = l0VarA;
                        kVar2 = kVar3;
                        pVar4 = pVar3;
                        j12 = j15;
                        j11 = j13;
                        c11 = cV;
                        l0Var2 = l0Var4;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        kVar2 = kVar;
                        l0Var2 = l0Var;
                        pVar4 = pVar3;
                        j12 = jG;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                pVar3 = pVar2;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(kVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jG = j;
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    } else {
                        jG = j;
                    }
                    if ((i10 & 12582912) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i19 = 4194304;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    } else {
                        j11 = j10;
                    }
                    if ((100663296 & i10) == 0) {
                        if ((i11 & 256) == 0) {
                            c11 = c10;
                            if (c1086gP.K(c11)) {
                            }
                            i12 |= i21;
                        } else {
                            c11 = c10;
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar5 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar4 = new p270w.e(50);
                                l0VarA = aVar5.a(eVar4, eVar4, eVar4, eVar4);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar6 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar5 = new p270w.e(50);
                                l0VarA = aVar6.a(eVar5, eVar5, eVar5, eVar5);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        }
                        long j16 = jG;
                        c1086gP.U();
                        float f12 = f11749b;
                        int i26 = ((i12 >> 3) & 14) | 12582912;
                        int i27 = i12 >> 6;
                        b(aVar, W.p(hVar2, f12, f12, 0.0f, 0.0f, 12), kVar3, l0VarA, j16, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                    float f13 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                    androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                                    androidx.compose.ui.h hVarJ = PaddingKt.j(aVar7, f13, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar8);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    if (pVar5 != null) {
                                        interfaceC1084f3.L(-565217870);
                                        pVar5.invoke(interfaceC1084f3, 0);
                                        Lb.a.a(interfaceC1084f3, W.q(aVar7, FloatingActionButtonKt.f11750c));
                                        interfaceC1084f3.D();
                                    } else {
                                        interfaceC1084f3.L(-565120809);
                                        interfaceC1084f3.D();
                                    }
                                    pVar6.invoke(interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i26 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                        l0 l0Var5 = l0VarA;
                        kVar2 = kVar3;
                        pVar4 = pVar3;
                        j12 = j16;
                        j11 = j13;
                        c11 = cV;
                        l0Var2 = l0Var5;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        kVar2 = kVar;
                        l0Var2 = l0Var;
                        pVar4 = pVar3;
                        j12 = jG;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar7 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar6 = new p270w.e(50);
                            l0VarA = aVar7.a(eVar6, eVar6, eVar6, eVar6);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar8 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar7 = new p270w.e(50);
                            l0VarA = aVar8.a(eVar7, eVar7, eVar7, eVar7);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j17 = jG;
                    c1086gP.U();
                    float f13 = f11749b;
                    int i28 = ((i12 >> 3) & 14) | 12582912;
                    int i29 = i12 >> 6;
                    b(aVar, W.p(hVar2, f13, f13, 0.0f, 0.0f, 12), kVar3, l0VarA, j17, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f14 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar9, f14, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar10 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar10);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar9, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i28 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                    l0 l0Var6 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j17;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var6;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar3 = pVar2;
                    if (c1086gP.k(pVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(kVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jG = j;
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    } else {
                        jG = j;
                    }
                    if ((i10 & 12582912) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i19 = 4194304;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    } else {
                        j11 = j10;
                    }
                    if ((100663296 & i10) == 0) {
                        if ((i11 & 256) == 0) {
                            c11 = c10;
                            if (c1086gP.K(c11)) {
                            }
                            i12 |= i21;
                        } else {
                            c11 = c10;
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar9 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar8 = new p270w.e(50);
                                l0VarA = aVar9.a(eVar8, eVar8, eVar8, eVar8);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar10 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar9 = new p270w.e(50);
                                l0VarA = aVar10.a(eVar9, eVar9, eVar9, eVar9);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        }
                        long j18 = jG;
                        c1086gP.U();
                        float f14 = f11749b;
                        int i210 = ((i12 >> 3) & 14) | 12582912;
                        int i211 = i12 >> 6;
                        b(aVar, W.p(hVar2, f14, f14, 0.0f, 0.0f, 12), kVar3, l0VarA, j18, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                    float f15 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                    androidx.compose.ui.h.a aVar11 = androidx.compose.ui.h.a.f13984b;
                                    androidx.compose.ui.h hVarJ = PaddingKt.j(aVar11, f15, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar12 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar12);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    if (pVar5 != null) {
                                        interfaceC1084f3.L(-565217870);
                                        pVar5.invoke(interfaceC1084f3, 0);
                                        Lb.a.a(interfaceC1084f3, W.q(aVar11, FloatingActionButtonKt.f11750c));
                                        interfaceC1084f3.D();
                                    } else {
                                        interfaceC1084f3.L(-565120809);
                                        interfaceC1084f3.D();
                                    }
                                    pVar6.invoke(interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i210 | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                        l0 l0Var7 = l0VarA;
                        kVar2 = kVar3;
                        pVar4 = pVar3;
                        j12 = j18;
                        j11 = j13;
                        c11 = cV;
                        l0Var2 = l0Var7;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        kVar2 = kVar;
                        l0Var2 = l0Var;
                        pVar4 = pVar3;
                        j12 = jG;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar11 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar10 = new p270w.e(50);
                            l0VarA = aVar11.a(eVar10, eVar10, eVar10, eVar10);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar12 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar11 = new p270w.e(50);
                            l0VarA = aVar12.a(eVar11, eVar11, eVar11, eVar11);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j19 = jG;
                    c1086gP.U();
                    float f15 = f11749b;
                    int i212 = ((i12 >> 3) & 14) | 12582912;
                    int i213 = i12 >> 6;
                    b(aVar, W.p(hVar2, f15, f15, 0.0f, 0.0f, 12), kVar3, l0VarA, j19, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f16 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar13 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar13, f16, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar14 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar14);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar13, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i212 | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (458752 & i213) | (i213 & 3670016), 0);
                    l0 l0Var8 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j19;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var8;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar3 = pVar2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar13 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar12 = new p270w.e(50);
                            l0VarA = aVar13.a(eVar12, eVar12, eVar12, eVar12);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar14 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar13 = new p270w.e(50);
                            l0VarA = aVar14.a(eVar13, eVar13, eVar13, eVar13);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j110 = jG;
                    c1086gP.U();
                    float f16 = f11749b;
                    int i214 = ((i12 >> 3) & 14) | 12582912;
                    int i215 = i12 >> 6;
                    b(aVar, W.p(hVar2, f16, f16, 0.0f, 0.0f, 12), kVar3, l0VarA, j110, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f17 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar15 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar15, f17, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar16 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar16);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar15, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i214 | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                    l0 l0Var9 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j110;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var9;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jG = j;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                jG = j;
            }
            if ((i10 & 12582912) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            } else {
                j11 = j10;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar15 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar14 = new p270w.e(50);
                        l0VarA = aVar15.a(eVar14, eVar14, eVar14, eVar14);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar16 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar15 = new p270w.e(50);
                        l0VarA = aVar16.a(eVar15, eVar15, eVar15, eVar15);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                }
                long j111 = jG;
                c1086gP.U();
                float f17 = f11749b;
                int i216 = ((i12 >> 3) & 14) | 12582912;
                int i217 = i12 >> 6;
                b(aVar, W.p(hVar2, f17, f17, 0.0f, 0.0f, 12), kVar3, l0VarA, j111, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                            float f18 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                            androidx.compose.ui.h.a aVar17 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar17, f18, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar18 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar18);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            if (pVar5 != null) {
                                interfaceC1084f3.L(-565217870);
                                pVar5.invoke(interfaceC1084f3, 0);
                                Lb.a.a(interfaceC1084f3, W.q(aVar17, FloatingActionButtonKt.f11750c));
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(-565120809);
                                interfaceC1084f3.D();
                            }
                            pVar6.invoke(interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i216 | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (458752 & i217) | (i217 & 3670016), 0);
                l0 l0Var10 = l0VarA;
                kVar2 = kVar3;
                pVar4 = pVar3;
                j12 = j111;
                j11 = j13;
                c11 = cV;
                l0Var2 = l0Var10;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var2 = l0Var;
                pVar4 = pVar3;
                j12 = jG;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.K(hVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar3 = pVar2;
                    if (c1086gP.k(pVar3)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(kVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jG = j;
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    } else {
                        jG = j;
                    }
                    if ((i10 & 12582912) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i19 = 4194304;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    } else {
                        j11 = j10;
                    }
                    if ((100663296 & i10) == 0) {
                        if ((i11 & 256) == 0) {
                            c11 = c10;
                            if (c1086gP.K(c11)) {
                            }
                            i12 |= i21;
                        } else {
                            c11 = c10;
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar17 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar16 = new p270w.e(50);
                                l0VarA = aVar17.a(eVar16, eVar16, eVar16, eVar16);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                p270w.a aVar18 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                p270w.e eVar17 = new p270w.e(50);
                                l0VarA = aVar18.a(eVar17, eVar17, eVar17, eVar17);
                                i12 &= -458753;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jG, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if ((i11 & 256) != 0) {
                                cV = A8.p.v(c1086gP);
                                i12 &= -234881025;
                            } else {
                                cV = c11;
                            }
                            j13 = jB;
                        }
                        long j112 = jG;
                        c1086gP.U();
                        float f18 = f11749b;
                        int i218 = ((i12 >> 3) & 14) | 12582912;
                        int i219 = i12 >> 6;
                        b(aVar, W.p(hVar2, f18, f18, 0.0f, 0.0f, 12), kVar3, l0VarA, j112, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                    float f19 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                    androidx.compose.ui.h.a aVar19 = androidx.compose.ui.h.a.f13984b;
                                    androidx.compose.ui.h hVarJ = PaddingKt.j(aVar19, f19, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar110 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar110);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    if (pVar5 != null) {
                                        interfaceC1084f3.L(-565217870);
                                        pVar5.invoke(interfaceC1084f3, 0);
                                        Lb.a.a(interfaceC1084f3, W.q(aVar19, FloatingActionButtonKt.f11750c));
                                        interfaceC1084f3.D();
                                    } else {
                                        interfaceC1084f3.L(-565120809);
                                        interfaceC1084f3.D();
                                    }
                                    pVar6.invoke(interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i218 | (i219 & 896) | (i219 & 7168) | (57344 & i219) | (458752 & i219) | (i219 & 3670016), 0);
                        l0 l0Var11 = l0VarA;
                        kVar2 = kVar3;
                        pVar4 = pVar3;
                        j12 = j112;
                        j11 = j13;
                        c11 = cV;
                        l0Var2 = l0Var11;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        kVar2 = kVar;
                        l0Var2 = l0Var;
                        pVar4 = pVar3;
                        j12 = jG;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar19 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar18 = new p270w.e(50);
                            l0VarA = aVar19.a(eVar18, eVar18, eVar18, eVar18);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar110 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar19 = new p270w.e(50);
                            l0VarA = aVar110.a(eVar19, eVar19, eVar19, eVar19);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j113 = jG;
                    c1086gP.U();
                    float f19 = f11749b;
                    int i2110 = ((i12 >> 3) & 14) | 12582912;
                    int i2111 = i12 >> 6;
                    b(aVar, W.p(hVar2, f19, f19, 0.0f, 0.0f, 12), kVar3, l0VarA, j113, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f110 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar111 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar111, f110, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar112 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar112);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar111, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2110 | (i2111 & 896) | (i2111 & 7168) | (57344 & i2111) | (458752 & i2111) | (i2111 & 3670016), 0);
                    l0 l0Var12 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j113;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var12;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar3 = pVar2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar110 = new p270w.e(50);
                            l0VarA = aVar111.a(eVar110, eVar110, eVar110, eVar110);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar112 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar111 = new p270w.e(50);
                            l0VarA = aVar112.a(eVar111, eVar111, eVar111, eVar111);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j114 = jG;
                    c1086gP.U();
                    float f110 = f11749b;
                    int i2112 = ((i12 >> 3) & 14) | 12582912;
                    int i2113 = i12 >> 6;
                    b(aVar, W.p(hVar2, f110, f110, 0.0f, 0.0f, 12), kVar3, l0VarA, j114, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f111 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar113 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar113, f111, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar114 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar114);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar113, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2112 | (i2113 & 896) | (i2113 & 7168) | (57344 & i2113) | (458752 & i2113) | (i2113 & 3670016), 0);
                    l0 l0Var13 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j114;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jG = j;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                jG = j;
            }
            if ((i10 & 12582912) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            } else {
                j11 = j10;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar112 = new p270w.e(50);
                        l0VarA = aVar113.a(eVar112, eVar112, eVar112, eVar112);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar114 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar113 = new p270w.e(50);
                        l0VarA = aVar114.a(eVar113, eVar113, eVar113, eVar113);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                }
                long j115 = jG;
                c1086gP.U();
                float f111 = f11749b;
                int i2114 = ((i12 >> 3) & 14) | 12582912;
                int i2115 = i12 >> 6;
                b(aVar, W.p(hVar2, f111, f111, 0.0f, 0.0f, 12), kVar3, l0VarA, j115, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                            float f112 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                            androidx.compose.ui.h.a aVar115 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar115, f112, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar116 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar116);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            if (pVar5 != null) {
                                interfaceC1084f3.L(-565217870);
                                pVar5.invoke(interfaceC1084f3, 0);
                                Lb.a.a(interfaceC1084f3, W.q(aVar115, FloatingActionButtonKt.f11750c));
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(-565120809);
                                interfaceC1084f3.D();
                            }
                            pVar6.invoke(interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i2114 | (i2115 & 896) | (i2115 & 7168) | (57344 & i2115) | (458752 & i2115) | (i2115 & 3670016), 0);
                l0 l0Var14 = l0VarA;
                kVar2 = kVar3;
                pVar4 = pVar3;
                j12 = j115;
                j11 = j13;
                c11 = cV;
                l0Var2 = l0Var14;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var2 = l0Var;
                pVar4 = pVar3;
                j12 = jG;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                pVar3 = pVar2;
                if (c1086gP.k(pVar3)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jG = j;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    jG = j;
                }
                if ((i10 & 12582912) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                } else {
                    j11 = j10;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        c11 = c10;
                        if (c1086gP.K(c11)) {
                        }
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar114 = new p270w.e(50);
                            l0VarA = aVar115.a(eVar114, eVar114, eVar114, eVar114);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            p270w.a aVar116 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar115 = new p270w.e(50);
                            l0VarA = aVar116.a(eVar115, eVar115, eVar115, eVar115);
                            i12 &= -458753;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if ((i11 & 256) != 0) {
                            cV = A8.p.v(c1086gP);
                            i12 &= -234881025;
                        } else {
                            cV = c11;
                        }
                        j13 = jB;
                    }
                    long j116 = jG;
                    c1086gP.U();
                    float f112 = f11749b;
                    int i2116 = ((i12 >> 3) & 14) | 12582912;
                    int i2117 = i12 >> 6;
                    b(aVar, W.p(hVar2, f112, f112, 0.0f, 0.0f, 12), kVar3, l0VarA, j116, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                                float f113 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                                androidx.compose.ui.h.a aVar117 = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar117, f113, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar118 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar118);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                if (pVar5 != null) {
                                    interfaceC1084f3.L(-565217870);
                                    pVar5.invoke(interfaceC1084f3, 0);
                                    Lb.a.a(interfaceC1084f3, W.q(aVar117, FloatingActionButtonKt.f11750c));
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(-565120809);
                                    interfaceC1084f3.D();
                                }
                                pVar6.invoke(interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2116 | (i2117 & 896) | (i2117 & 7168) | (57344 & i2117) | (458752 & i2117) | (i2117 & 3670016), 0);
                    l0 l0Var15 = l0VarA;
                    kVar2 = kVar3;
                    pVar4 = pVar3;
                    j12 = j116;
                    j11 = j13;
                    c11 = cV;
                    l0Var2 = l0Var15;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var2 = l0Var;
                    pVar4 = pVar3;
                    j12 = jG;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jG = j;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                jG = j;
            }
            if ((i10 & 12582912) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            } else {
                j11 = j10;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar116 = new p270w.e(50);
                        l0VarA = aVar117.a(eVar116, eVar116, eVar116, eVar116);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar118 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar117 = new p270w.e(50);
                        l0VarA = aVar118.a(eVar117, eVar117, eVar117, eVar117);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                }
                long j117 = jG;
                c1086gP.U();
                float f113 = f11749b;
                int i2118 = ((i12 >> 3) & 14) | 12582912;
                int i2119 = i12 >> 6;
                b(aVar, W.p(hVar2, f113, f113, 0.0f, 0.0f, 12), kVar3, l0VarA, j117, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                            float f114 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                            androidx.compose.ui.h.a aVar119 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar119, f114, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar1110 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar1110);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            if (pVar5 != null) {
                                interfaceC1084f3.L(-565217870);
                                pVar5.invoke(interfaceC1084f3, 0);
                                Lb.a.a(interfaceC1084f3, W.q(aVar119, FloatingActionButtonKt.f11750c));
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(-565120809);
                                interfaceC1084f3.D();
                            }
                            pVar6.invoke(interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i2118 | (i2119 & 896) | (i2119 & 7168) | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                l0 l0Var16 = l0VarA;
                kVar2 = kVar3;
                pVar4 = pVar3;
                j12 = j117;
                j11 = j13;
                c11 = cV;
                l0Var2 = l0Var16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var2 = l0Var;
                pVar4 = pVar3;
                j12 = jG;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVar3 = pVar2;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.K(kVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jG = j;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                jG = j;
            }
            if ((i10 & 12582912) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            } else {
                j11 = j10;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar118 = new p270w.e(50);
                        l0VarA = aVar119.a(eVar118, eVar118, eVar118, eVar118);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        p270w.a aVar1110 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar119 = new p270w.e(50);
                        l0VarA = aVar1110.a(eVar119, eVar119, eVar119, eVar119);
                        i12 &= -458753;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if ((i11 & 256) != 0) {
                        cV = A8.p.v(c1086gP);
                        i12 &= -234881025;
                    } else {
                        cV = c11;
                    }
                    j13 = jB;
                }
                long j118 = jG;
                c1086gP.U();
                float f114 = f11749b;
                int i21110 = ((i12 >> 3) & 14) | 12582912;
                int i21111 = i12 >> 6;
                b(aVar, W.p(hVar2, f114, f114, 0.0f, 0.0f, 12), kVar3, l0VarA, j118, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                            float f115 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                            androidx.compose.ui.h.a aVar1111 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar1111, f115, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar1112 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar1112);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            if (pVar5 != null) {
                                interfaceC1084f3.L(-565217870);
                                pVar5.invoke(interfaceC1084f3, 0);
                                Lb.a.a(interfaceC1084f3, W.q(aVar1111, FloatingActionButtonKt.f11750c));
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(-565120809);
                                interfaceC1084f3.D();
                            }
                            pVar6.invoke(interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i21110 | (i21111 & 896) | (i21111 & 7168) | (57344 & i21111) | (458752 & i21111) | (i21111 & 3670016), 0);
                l0 l0Var17 = l0VarA;
                kVar2 = kVar3;
                pVar4 = pVar3;
                j12 = j118;
                j11 = j13;
                c11 = cV;
                l0Var2 = l0Var17;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var2 = l0Var;
                pVar4 = pVar3;
                j12 = jG;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        if ((196608 & i10) != 0) {
            i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
        }
        if ((1572864 & i10) == 0) {
            jG = j;
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        } else {
            jG = j;
        }
        if ((i10 & 12582912) == 0) {
            j11 = j10;
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        } else {
            j11 = j10;
        }
        if ((100663296 & i10) == 0) {
            if ((i11 & 256) == 0) {
                c11 = c10;
                if (c1086gP.K(c11)) {
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            i12 |= i21;
        } else {
            c11 = c10;
        }
        if ((i12 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 32) != 0) {
                    p270w.a aVar1111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    p270w.e eVar1110 = new p270w.e(50);
                    l0VarA = aVar1111.a(eVar1110, eVar1110, eVar1110, eVar1110);
                    i12 &= -458753;
                } else {
                    l0VarA = l0Var;
                }
                if ((i11 & 64) != 0) {
                    jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = ColorsKt.b(jG, c1086gP);
                    i12 &= -29360129;
                } else {
                    jB = j11;
                }
                if ((i11 & 256) != 0) {
                    cV = A8.p.v(c1086gP);
                    i12 &= -234881025;
                } else {
                    cV = c11;
                }
                j13 = jB;
            } else {
                if (i13 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 32) != 0) {
                    p270w.a aVar1112 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    p270w.e eVar1111 = new p270w.e(50);
                    l0VarA = aVar1112.a(eVar1111, eVar1111, eVar1111, eVar1111);
                    i12 &= -458753;
                } else {
                    l0VarA = l0Var;
                }
                if ((i11 & 64) != 0) {
                    jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = ColorsKt.b(jG, c1086gP);
                    i12 &= -29360129;
                } else {
                    jB = j11;
                }
                if ((i11 & 256) != 0) {
                    cV = A8.p.v(c1086gP);
                    i12 &= -234881025;
                } else {
                    cV = c11;
                }
                j13 = jB;
            }
            long j119 = jG;
            c1086gP.U();
            float f115 = f11749b;
            int i21112 = ((i12 >> 3) & 14) | 12582912;
            int i21113 = i12 >> 6;
            b(aVar, W.p(hVar2, f115, f115, 0.0f, 0.0f, 12), kVar3, l0VarA, j119, j13, cV, androidx.compose.runtime.internal.a.b(1418981691, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
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
                        float f116 = pVar3 == null ? FloatingActionButtonKt.f11751d : FloatingActionButtonKt.f11750c;
                        androidx.compose.ui.h.a aVar1113 = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarJ = PaddingKt.j(aVar1113, f116, 0.0f, FloatingActionButtonKt.f11751d, 0.0f, 10);
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar3;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar;
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, interfaceC1084f3, 48);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar1114 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar1114);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        if (pVar5 != null) {
                            interfaceC1084f3.L(-565217870);
                            pVar5.invoke(interfaceC1084f3, 0);
                            Lb.a.a(interfaceC1084f3, W.q(aVar1113, FloatingActionButtonKt.f11750c));
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(-565120809);
                            interfaceC1084f3.D();
                        }
                        pVar6.invoke(interfaceC1084f3, 0);
                        interfaceC1084f3.J();
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i21112 | (i21113 & 896) | (i21113 & 7168) | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
            l0 l0Var18 = l0VarA;
            kVar2 = kVar3;
            pVar4 = pVar3;
            j12 = j119;
            j11 = j13;
            c11 = cV;
            l0Var2 = l0Var18;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            kVar2 = kVar;
            l0Var2 = l0Var;
            pVar4 = pVar3;
            j12 = jG;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    FloatingActionButtonKt.a(pVar, aVar, hVar2, pVar4, kVar2, l0Var2, j12, j11, c11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x013f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0143  */
    /* JADX WARN: Code duplicated, block: B:119:0x0145  */
    /* JADX WARN: Code duplicated, block: B:122:0x014b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0164  */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:130:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:138:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x021c  */
    /* JADX WARN: Code duplicated, block: B:147:0x022d  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, androidx.compose.foundation.interaction.k kVar, l0 l0Var, long j, long j10, C c10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        l0 l0Var2;
        long j11;
        long j12;
        C c11;
        int i15;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final androidx.compose.foundation.interaction.k kVar2;
        final l0 l0Var3;
        final long j13;
        final long j14;
        final C c12;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        l0 l0VarA;
        long jG;
        final long jB;
        int i16;
        C cV;
        boolean z11;
        androidx.compose.foundation.interaction.k kVar3;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1028985328);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.K(kVar)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0Var2 = l0Var;
                        int i18 = c1086gP.K(l0Var2) ? 2048 : 1024;
                        i12 |= i18;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j11 = j;
                        int i19 = c1086gP.i(j11) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        j11 = j;
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j10;
                        int i20 = c1086gP.i(j12) ? 131072 : 65536;
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c11 = c10;
                        int i21 = c1086gP.K(c11) ? 1048576 : 524288;
                        i12 |= i21;
                    } else {
                        c11 = c10;
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                        }
                        if ((i11 & 8) != 0) {
                            p270w.a aVar2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            p270w.e eVar = new p270w.e(50);
                            l0VarA = aVar2.a(eVar, eVar, eVar, eVar);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                            i12 &= -57345;
                        } else {
                            jG = j11;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jG, c1086gP);
                            i12 &= -458753;
                        } else {
                            jB = j12;
                        }
                        if ((i11 & 64) != 0) {
                            i16 = i12 & (-3670017);
                            cV = A8.p.v(c1086gP);
                        } else {
                            i16 = i12;
                        }
                        c1086gP.U();
                        if (kVar2 == null) {
                            c1086gP.L(-1991740377);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            z11 = false;
                            c1086gP.T(false);
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            z11 = false;
                            c1086gP.L(628486320);
                            c1086gP.T(false);
                            kVar3 = kVar2;
                        }
                        C c13 = cV;
                        SurfaceKt.b(aVar, androidx.compose.ui.semantics.p.b(hVar3, z11, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.k(wVar, 0);
                                return p293xa.r.f47939a;
                            }
                        }), false, l0VarA, jG, jB, null, ((p013b0.f) cV.a(kVar3, c1086gP, (i16 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle).f9544c.getValue()).f20481b, kVar3, androidx.compose.runtime.internal.a.b(1972871863, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                                    C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(jB)));
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1867794295, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                androidx.compose.ui.text.F f10 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar2;
                                                TextKt.a(f10, androidx.compose.runtime.internal.a.b(-1567914264, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                                                            float f11 = FloatingActionButtonKt.f11748a;
                                                            androidx.compose.ui.h hVarA = W.a(f11, f11, aVar3);
                                                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar3;
                                                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                                            int iF = interfaceC1084f7.F();
                                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarA);
                                                            ComposeUiNode.f14331c0.getClass();
                                                            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                                            if (interfaceC1084f7.u() == null) {
                                                                I.b.k();
                                                                throw null;
                                                            }
                                                            interfaceC1084f7.r();
                                                            if (interfaceC1084f7.m()) {
                                                                interfaceC1084f7.v(aVar4);
                                                            } else {
                                                                interfaceC1084f7.A();
                                                            }
                                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, eD);
                                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                                                            if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                                androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar5);
                                                            }
                                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                            androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 48);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i16 & 14) | 805306368 | (i16 & 7168) | (57344 & i16) | (458752 & i16), 68);
                        hVar2 = hVar3;
                        l0Var3 = l0VarA;
                        j13 = jG;
                        j14 = jB;
                        c12 = c13;
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        hVar3 = hVar;
                        kVar2 = kVar;
                        i16 = i12;
                        l0VarA = l0Var2;
                        jG = j11;
                        jB = j12;
                    }
                    cV = c11;
                    c1086gP.U();
                    if (kVar2 == null) {
                        c1086gP.L(-1991740377);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        z11 = false;
                        c1086gP.T(false);
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        z11 = false;
                        c1086gP.L(628486320);
                        c1086gP.T(false);
                        kVar3 = kVar2;
                    }
                    C c14 = cV;
                    SurfaceKt.b(aVar, androidx.compose.ui.semantics.p.b(hVar3, z11, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    }), false, l0VarA, jG, jB, null, ((p013b0.f) cV.a(kVar3, c1086gP, (i16 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle).f9544c.getValue()).f20481b, kVar3, androidx.compose.runtime.internal.a.b(1972871863, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                                C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(jB)));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1867794295, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            androidx.compose.ui.text.F f10 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3 = pVar2;
                                            TextKt.a(f10, androidx.compose.runtime.internal.a.b(-1567914264, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                                                        float f11 = FloatingActionButtonKt.f11748a;
                                                        androidx.compose.ui.h hVarA = W.a(f11, f11, aVar3);
                                                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar3;
                                                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                                        int iF = interfaceC1084f7.F();
                                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarA);
                                                        ComposeUiNode.f14331c0.getClass();
                                                        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                                        if (interfaceC1084f7.u() == null) {
                                                            I.b.k();
                                                            throw null;
                                                        }
                                                        interfaceC1084f7.r();
                                                        if (interfaceC1084f7.m()) {
                                                            interfaceC1084f7.v(aVar4);
                                                        } else {
                                                            interfaceC1084f7.A();
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, eD);
                                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                                                        if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                            androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar5);
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                        androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 48);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i16 & 14) | 805306368 | (i16 & 7168) | (57344 & i16) | (458752 & i16), 68);
                    hVar2 = hVar3;
                    l0Var3 = l0VarA;
                    j13 = jG;
                    j14 = jB;
                    c12 = c14;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    kVar2 = kVar;
                    l0Var3 = l0Var2;
                    j13 = j11;
                    j14 = j12;
                    c12 = c11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            FloatingActionButtonKt.b(aVar, hVar2, kVar2, l0Var3, j13, j14, c12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j11 = j;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    if ((i11 & 8) != 0) {
                        p270w.a aVar3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar2 = new p270w.e(50);
                        l0VarA = aVar3.a(eVar2, eVar2, eVar2, eVar2);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -57345;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 64) != 0) {
                        i16 = i12 & (-3670017);
                        cV = A8.p.v(c1086gP);
                    } else {
                        i16 = i12;
                        cV = c11;
                    }
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    if ((i11 & 8) != 0) {
                        p270w.a aVar4 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar3 = new p270w.e(50);
                        l0VarA = aVar4.a(eVar3, eVar3, eVar3, eVar3);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -57345;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 64) != 0) {
                        i16 = i12 & (-3670017);
                        cV = A8.p.v(c1086gP);
                    } else {
                        i16 = i12;
                        cV = c11;
                    }
                }
                c1086gP.U();
                if (kVar2 == null) {
                    c1086gP.L(-1991740377);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    z11 = false;
                    c1086gP.T(false);
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    z11 = false;
                    c1086gP.L(628486320);
                    c1086gP.T(false);
                    kVar3 = kVar2;
                }
                C c15 = cV;
                SurfaceKt.b(aVar, androidx.compose.ui.semantics.p.b(hVar3, z11, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), false, l0VarA, jG, jB, null, ((p013b0.f) cV.a(kVar3, c1086gP, (i16 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle).f9544c.getValue()).f20481b, kVar3, androidx.compose.runtime.internal.a.b(1972871863, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                            C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(jB)));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1867794295, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f10 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3 = pVar2;
                                        TextKt.a(f10, androidx.compose.runtime.internal.a.b(-1567914264, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                                                    float f11 = FloatingActionButtonKt.f11748a;
                                                    androidx.compose.ui.h hVarA = W.a(f11, f11, aVar5);
                                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar3;
                                                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                                    int iF = interfaceC1084f7.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarA);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f7.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f7.r();
                                                    if (interfaceC1084f7.m()) {
                                                        interfaceC1084f7.v(aVar6);
                                                    } else {
                                                        interfaceC1084f7.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, eD);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                        androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar5);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                    androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i16 & 14) | 805306368 | (i16 & 7168) | (57344 & i16) | (458752 & i16), 68);
                hVar2 = hVar3;
                l0Var3 = l0VarA;
                j13 = jG;
                j14 = jB;
                c12 = c15;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var3 = l0Var2;
                j13 = j11;
                j14 = j12;
                c12 = c11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.b(aVar, hVar2, kVar2, l0Var3, j13, j14, c12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.K(kVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j11 = j;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c11 = c10;
                    if (c1086gP.K(c11)) {
                    }
                    i12 |= i21;
                } else {
                    c11 = c10;
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    if ((i11 & 8) != 0) {
                        p270w.a aVar5 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar4 = new p270w.e(50);
                        l0VarA = aVar5.a(eVar4, eVar4, eVar4, eVar4);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -57345;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 64) != 0) {
                        i16 = i12 & (-3670017);
                        cV = A8.p.v(c1086gP);
                    } else {
                        i16 = i12;
                        cV = c11;
                    }
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                    }
                    if ((i11 & 8) != 0) {
                        p270w.a aVar6 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        p270w.e eVar5 = new p270w.e(50);
                        l0VarA = aVar6.a(eVar5, eVar5, eVar5, eVar5);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                        i12 &= -57345;
                    } else {
                        jG = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jG, c1086gP);
                        i12 &= -458753;
                    } else {
                        jB = j12;
                    }
                    if ((i11 & 64) != 0) {
                        i16 = i12 & (-3670017);
                        cV = A8.p.v(c1086gP);
                    } else {
                        i16 = i12;
                        cV = c11;
                    }
                }
                c1086gP.U();
                if (kVar2 == null) {
                    c1086gP.L(-1991740377);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    z11 = false;
                    c1086gP.T(false);
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    z11 = false;
                    c1086gP.L(628486320);
                    c1086gP.T(false);
                    kVar3 = kVar2;
                }
                C c16 = cV;
                SurfaceKt.b(aVar, androidx.compose.ui.semantics.p.b(hVar3, z11, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                }), false, l0VarA, jG, jB, null, ((p013b0.f) cV.a(kVar3, c1086gP, (i16 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle).f9544c.getValue()).f20481b, kVar3, androidx.compose.runtime.internal.a.b(1972871863, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                            C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(jB)));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1867794295, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f10 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3 = pVar2;
                                        TextKt.a(f10, androidx.compose.runtime.internal.a.b(-1567914264, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                                                    float f11 = FloatingActionButtonKt.f11748a;
                                                    androidx.compose.ui.h hVarA = W.a(f11, f11, aVar7);
                                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar3;
                                                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                                    int iF = interfaceC1084f7.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarA);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f7.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f7.r();
                                                    if (interfaceC1084f7.m()) {
                                                        interfaceC1084f7.v(aVar8);
                                                    } else {
                                                        interfaceC1084f7.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, eD);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                        androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar5);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                    androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i16 & 14) | 805306368 | (i16 & 7168) | (57344 & i16) | (458752 & i16), 68);
                hVar2 = hVar3;
                l0Var3 = l0VarA;
                j13 = jG;
                j14 = jB;
                c12 = c16;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                kVar2 = kVar;
                l0Var3 = l0Var2;
                j13 = j11;
                j14 = j12;
                c12 = c11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        FloatingActionButtonKt.b(aVar, hVar2, kVar2, l0Var3, j13, j14, c12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i18;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j11 = j;
                if (c1086gP.i(j11)) {
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            i12 |= i19;
        } else {
            j11 = j;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j12 = j10;
                if (c1086gP.i(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                c11 = c10;
                if (c1086gP.K(c11)) {
                }
                i12 |= i21;
            } else {
                c11 = c10;
            }
            i12 |= i21;
        } else {
            c11 = c10;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.k(pVar)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                if ((i11 & 8) != 0) {
                    p270w.a aVar7 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    p270w.e eVar6 = new p270w.e(50);
                    l0VarA = aVar7.a(eVar6, eVar6, eVar6, eVar6);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 16) != 0) {
                    jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                    i12 &= -57345;
                } else {
                    jG = j11;
                }
                if ((i11 & 32) != 0) {
                    jB = ColorsKt.b(jG, c1086gP);
                    i12 &= -458753;
                } else {
                    jB = j12;
                }
                if ((i11 & 64) != 0) {
                    i16 = i12 & (-3670017);
                    cV = A8.p.v(c1086gP);
                } else {
                    i16 = i12;
                    cV = c11;
                }
            } else {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                }
                if ((i11 & 8) != 0) {
                    p270w.a aVar8 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    p270w.e eVar7 = new p270w.e(50);
                    l0VarA = aVar8.a(eVar7, eVar7, eVar7, eVar7);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 16) != 0) {
                    jG = ((C1034j) c1086gP.x(ColorsKt.f11693a)).g();
                    i12 &= -57345;
                } else {
                    jG = j11;
                }
                if ((i11 & 32) != 0) {
                    jB = ColorsKt.b(jG, c1086gP);
                    i12 &= -458753;
                } else {
                    jB = j12;
                }
                if ((i11 & 64) != 0) {
                    i16 = i12 & (-3670017);
                    cV = A8.p.v(c1086gP);
                } else {
                    i16 = i12;
                    cV = c11;
                }
            }
            c1086gP.U();
            if (kVar2 == null) {
                c1086gP.L(-1991740377);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                z11 = false;
                c1086gP.T(false);
                kVar3 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                z11 = false;
                c1086gP.L(628486320);
                c1086gP.T(false);
                kVar3 = kVar2;
            }
            C c17 = cV;
            SurfaceKt.b(aVar, androidx.compose.ui.semantics.p.b(hVar3, z11, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            }), false, l0VarA, jG, jB, null, ((p013b0.f) cV.a(kVar3, c1086gP, (i16 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle).f9544c.getValue()).f20481b, kVar3, androidx.compose.runtime.internal.a.b(1972871863, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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
                        C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(jB)));
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2 = pVar;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1867794295, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    androidx.compose.ui.text.F f10 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3 = pVar2;
                                    TextKt.a(f10, androidx.compose.runtime.internal.a.b(-1567914264, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                            int iIntValue3 = num3.intValue();
                                            if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                                                float f11 = FloatingActionButtonKt.f11748a;
                                                androidx.compose.ui.h hVarA = W.a(f11, f11, aVar9);
                                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar3;
                                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                                int iF = interfaceC1084f7.F();
                                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarA);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar10 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f7.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f7.r();
                                                if (interfaceC1084f7.m()) {
                                                    interfaceC1084f7.v(aVar10);
                                                } else {
                                                    interfaceC1084f7.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, eD);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                    androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar5);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f7, 0);
                                            } else {
                                                interfaceC1084f7.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f5), interfaceC1084f5, 48);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i16 & 14) | 805306368 | (i16 & 7168) | (57344 & i16) | (458752 & i16), 68);
            hVar2 = hVar3;
            l0Var3 = l0VarA;
            j13 = jG;
            j14 = jB;
            c12 = c17;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            kVar2 = kVar;
            l0Var3 = l0Var2;
            j13 = j11;
            j14 = j12;
            c12 = c11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    FloatingActionButtonKt.b(aVar, hVar2, kVar2, l0Var3, j13, j14, c12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
