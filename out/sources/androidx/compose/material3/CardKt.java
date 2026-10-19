package androidx.compose.material3;

import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CardKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:120:0x014f A[PHI: r1 r2 r6 r7 r8 r12 r14
      0x014f: PHI (r1v19 androidx.compose.ui.h) = (r1v16 androidx.compose.ui.h), (r1v24 androidx.compose.ui.h) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r2v28 int) = (r2v22 int), (r2v31 int) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r6v7 boolean) = (r6v3 boolean), (r6v2 boolean) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r7v11 androidx.compose.ui.graphics.l0) = (r7v7 androidx.compose.ui.graphics.l0), (r7v6 androidx.compose.ui.graphics.l0) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r8v7 androidx.compose.material3.j) = (r8v3 androidx.compose.material3.j), (r8v2 androidx.compose.material3.j) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r12v28 androidx.compose.material3.l) = (r12v4 androidx.compose.material3.l), (r12v3 androidx.compose.material3.l) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r14v9 androidx.compose.foundation.i) = (r14v4 androidx.compose.foundation.i), (r14v3 androidx.compose.foundation.i) binds: [B:139:0x0191, B:119:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x015a  */
    /* JADX WARN: Code duplicated, block: B:126:0x015e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0164  */
    /* JADX WARN: Code duplicated, block: B:132:0x0171  */
    /* JADX WARN: Code duplicated, block: B:135:0x0184  */
    /* JADX WARN: Code duplicated, block: B:138:0x0190  */
    /* JADX WARN: Code duplicated, block: B:140:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x021a  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    public static final void a(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, C1058j c1058j, C1060l c1060l, C0937i c0937i, androidx.compose.foundation.interaction.k kVar, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0VarA;
        C1058j c1058jC;
        C1060l c1060lB;
        int i15;
        C0937i c0937i2;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.h hVar2;
        int i20;
        androidx.compose.foundation.interaction.k kVar2;
        androidx.compose.foundation.interaction.k kVar3;
        long j;
        long j10;
        final C1058j c1058j2;
        final androidx.compose.foundation.interaction.k kVar4;
        final androidx.compose.ui.graphics.l0 l0Var2;
        final C0937i c0937i3;
        final boolean z12;
        final C1060l c1060l2;
        final androidx.compose.ui.h hVar3;
        Object objF;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-2024281376);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0VarA = l0Var;
                        int i22 = c1086gP.K(l0VarA) ? 2048 : 1024;
                        i12 |= i22;
                    } else {
                        l0VarA = l0Var;
                    }
                    i12 |= i22;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        c1058jC = c1058j;
                        int i23 = c1086gP.K(c1058jC) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        c1058jC = c1058j;
                    }
                    i12 |= i23;
                } else {
                    c1058jC = c1058j;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        c1060lB = c1060l;
                        int i24 = c1086gP.K(c1060lB) ? 131072 : 65536;
                        i12 |= i24;
                    } else {
                        c1060lB = c1060l;
                    }
                    i12 |= i24;
                } else {
                    c1060lB = c1060l;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((1572864 & i10) == 0) {
                        c0937i2 = c0937i;
                        if (c1086gP.K(c0937i2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(kVar)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((38347923 & i12) == 38347922 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                c1060lB = C1059k.b(0.0f, 63);
                            }
                            if (i15 != 0) {
                                c0937i2 = null;
                            }
                            if (i17 != 0) {
                                i20 = i12;
                                kVar2 = null;
                            }
                            C1060l c1060l3 = c1060lB;
                            C0937i c0937i4 = c0937i2;
                            c1086gP.U();
                            c1086gP.L(1976524431);
                            if (kVar2 == null) {
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                kVar3 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                kVar3 = kVar2;
                            }
                            c1086gP.T(false);
                            if (z11) {
                                j = c1058jC.f12587a;
                            } else {
                                j = c1058jC.f12589c;
                            }
                            long j11 = j;
                            if (z11) {
                                j10 = c1058jC.f12588b;
                            } else {
                                j10 = c1058jC.f12590d;
                            }
                            SurfaceKt.c(aVar, hVar2, z11, l0VarA, j11, j10, 0.0f, ((p013b0.f) c1060l3.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i4, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f3.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f3.r();
                                        if (interfaceC1084f3.m()) {
                                            interfaceC1084f3.v(aVar3);
                                        } else {
                                            interfaceC1084f3.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                        interfaceC1084f3.J();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                            c1058j2 = c1058jC;
                            kVar4 = kVar2;
                            l0Var2 = l0VarA;
                            c0937i3 = c0937i4;
                            z12 = z11;
                            c1060l2 = c1060l3;
                            hVar3 = hVar2;
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
                            hVar2 = hVar;
                        }
                        kVar2 = kVar;
                        i20 = i12;
                        C1060l c1060l4 = c1060lB;
                        C0937i c0937i5 = c0937i2;
                        c1086gP.U();
                        c1086gP.L(1976524431);
                        if (kVar2 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar3 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar3 = kVar2;
                        }
                        c1086gP.T(false);
                        if (z11) {
                            j = c1058jC.f12587a;
                        } else {
                            j = c1058jC.f12589c;
                        }
                        long j12 = j;
                        if (z11) {
                            j10 = c1058jC.f12588b;
                        } else {
                            j10 = c1058jC.f12590d;
                        }
                        SurfaceKt.c(aVar, hVar2, z11, l0VarA, j12, j10, 0.0f, ((p013b0.f) c1060l4.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i5, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                    Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar3);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                    interfaceC1084f3.J();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                        c1058j2 = c1058jC;
                        kVar4 = kVar2;
                        l0Var2 = l0VarA;
                        c0937i3 = c0937i5;
                        z12 = z11;
                        c1060l2 = c1060l4;
                        hVar3 = hVar2;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        c1058j2 = c1058jC;
                        c1060l2 = c1060lB;
                        c0937i3 = c0937i2;
                        kVar4 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                c0937i2 = c0937i;
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((38347923 & i12) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l5 = c1060lB;
                    C0937i c0937i6 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j13 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j13, j10, 0.0f, ((p013b0.f) c1060l5.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i6, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i6;
                    z12 = z11;
                    c1060l2 = c1060l5;
                    hVar3 = hVar2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l6 = c1060lB;
                    C0937i c0937i7 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j14 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j14, j10, 0.0f, ((p013b0.f) c1060l6.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i7, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i7;
                    z12 = z11;
                    c1060l2 = c1060l6;
                    hVar3 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i22;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i22;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1058jC = c1058j;
                    if (c1086gP.K(c1058jC)) {
                    }
                    i12 |= i23;
                } else {
                    c1058jC = c1058j;
                }
                i12 |= i23;
            } else {
                c1058jC = c1058j;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    c1060lB = c1060l;
                    if (c1086gP.K(c1060lB)) {
                    }
                    i12 |= i24;
                } else {
                    c1060lB = c1060l;
                }
                i12 |= i24;
            } else {
                c1060lB = c1060l;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    c0937i2 = c0937i;
                    if (c1086gP.K(c0937i2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((38347923 & i12) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l7 = c1060lB;
                    C0937i c0937i8 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j15 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j15, j10, 0.0f, ((p013b0.f) c1060l7.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i8, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i8;
                    z12 = z11;
                    c1060l2 = c1060l7;
                    hVar3 = hVar2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l8 = c1060lB;
                    C0937i c0937i9 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j16 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j16, j10, 0.0f, ((p013b0.f) c1060l8.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i9, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i9;
                    z12 = z11;
                    c1060l2 = c1060l8;
                    hVar3 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            c0937i2 = c0937i;
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(kVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((38347923 & i12) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l9 = c1060lB;
                C0937i c0937i10 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j17 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j17, j10, 0.0f, ((p013b0.f) c1060l9.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i10, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i10;
                z12 = z11;
                c1060l2 = c1060l9;
                hVar3 = hVar2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l10 = c1060lB;
                C0937i c0937i11 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j18 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j18, j10, 0.0f, ((p013b0.f) c1060l10.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i11, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i11;
                z12 = z11;
                c1060l2 = c1060l10;
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i22;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i22;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    c1058jC = c1058j;
                    if (c1086gP.K(c1058jC)) {
                    }
                    i12 |= i23;
                } else {
                    c1058jC = c1058j;
                }
                i12 |= i23;
            } else {
                c1058jC = c1058j;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    c1060lB = c1060l;
                    if (c1086gP.K(c1060lB)) {
                    }
                    i12 |= i24;
                } else {
                    c1060lB = c1060l;
                }
                i12 |= i24;
            } else {
                c1060lB = c1060l;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    c0937i2 = c0937i;
                    if (c1086gP.K(c0937i2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(kVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((38347923 & i12) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l11 = c1060lB;
                    C0937i c0937i12 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j19 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j19, j10, 0.0f, ((p013b0.f) c1060l11.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i12, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i12;
                    z12 = z11;
                    c1060l2 = c1060l11;
                    hVar3 = hVar2;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            c1060lB = C1059k.b(0.0f, 63);
                        }
                        if (i15 != 0) {
                            c0937i2 = null;
                        }
                        if (i17 != 0) {
                            i20 = i12;
                            kVar2 = null;
                        } else {
                            kVar2 = kVar;
                            i20 = i12;
                        }
                    }
                    C1060l c1060l12 = c1060lB;
                    C0937i c0937i13 = c0937i2;
                    c1086gP.U();
                    c1086gP.L(1976524431);
                    if (kVar2 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar3 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar3 = kVar2;
                    }
                    c1086gP.T(false);
                    if (z11) {
                        j = c1058jC.f12587a;
                    } else {
                        j = c1058jC.f12589c;
                    }
                    long j110 = j;
                    if (z11) {
                        j10 = c1058jC.f12588b;
                    } else {
                        j10 = c1058jC.f12590d;
                    }
                    SurfaceKt.c(aVar, hVar2, z11, l0VarA, j110, j10, 0.0f, ((p013b0.f) c1060l12.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i13, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar3);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                    c1058j2 = c1058jC;
                    kVar4 = kVar2;
                    l0Var2 = l0VarA;
                    c0937i3 = c0937i13;
                    z12 = z11;
                    c1060l2 = c1060l12;
                    hVar3 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            c0937i2 = c0937i;
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(kVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((38347923 & i12) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l13 = c1060lB;
                C0937i c0937i14 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j111 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j111, j10, 0.0f, ((p013b0.f) c1060l13.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i14, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i14;
                z12 = z11;
                c1060l2 = c1060l13;
                hVar3 = hVar2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l14 = c1060lB;
                C0937i c0937i15 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j112 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j112, j10, 0.0f, ((p013b0.f) c1060l14.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i15, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i15;
                z12 = z11;
                c1060l2 = c1060l14;
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0VarA = l0Var;
                if (c1086gP.K(l0VarA)) {
                }
                i12 |= i22;
            } else {
                l0VarA = l0Var;
            }
            i12 |= i22;
        } else {
            l0VarA = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                c1058jC = c1058j;
                if (c1086gP.K(c1058jC)) {
                }
                i12 |= i23;
            } else {
                c1058jC = c1058j;
            }
            i12 |= i23;
        } else {
            c1058jC = c1058j;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                c1060lB = c1060l;
                if (c1086gP.K(c1060lB)) {
                }
                i12 |= i24;
            } else {
                c1060lB = c1060l;
            }
            i12 |= i24;
        } else {
            c1060lB = c1060l;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((1572864 & i10) == 0) {
                c0937i2 = c0937i;
                if (c1086gP.K(c0937i2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(kVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((38347923 & i12) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l15 = c1060lB;
                C0937i c0937i16 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j113 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j113, j10, 0.0f, ((p013b0.f) c1060l15.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i16, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i16;
                z12 = z11;
                c1060l2 = c1060l15;
                hVar3 = hVar2;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i15 != 0) {
                        c0937i2 = null;
                    }
                    if (i17 != 0) {
                        i20 = i12;
                        kVar2 = null;
                    } else {
                        kVar2 = kVar;
                        i20 = i12;
                    }
                }
                C1060l c1060l16 = c1060lB;
                C0937i c0937i17 = c0937i2;
                c1086gP.U();
                c1086gP.L(1976524431);
                if (kVar2 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar3 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar3 = kVar2;
                }
                c1086gP.T(false);
                if (z11) {
                    j = c1058jC.f12587a;
                } else {
                    j = c1058jC.f12589c;
                }
                long j114 = j;
                if (z11) {
                    j10 = c1058jC.f12588b;
                } else {
                    j10 = c1058jC.f12590d;
                }
                SurfaceKt.c(aVar, hVar2, z11, l0VarA, j114, j10, 0.0f, ((p013b0.f) c1060l16.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i17, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
                c1058j2 = c1058jC;
                kVar4 = kVar2;
                l0Var2 = l0VarA;
                c0937i3 = c0937i17;
                z12 = z11;
                c1060l2 = c1060l16;
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 1572864;
        c0937i2 = c0937i;
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(kVar)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.k(qVar)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i12 |= i19;
        }
        if ((38347923 & i12) == 38347922) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i15 != 0) {
                    c0937i2 = null;
                }
                if (i17 != 0) {
                    i20 = i12;
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                    i20 = i12;
                }
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i15 != 0) {
                    c0937i2 = null;
                }
                if (i17 != 0) {
                    i20 = i12;
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                    i20 = i12;
                }
            }
            C1060l c1060l17 = c1060lB;
            C0937i c0937i18 = c0937i2;
            c1086gP.U();
            c1086gP.L(1976524431);
            if (kVar2 == null) {
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                kVar3 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                kVar3 = kVar2;
            }
            c1086gP.T(false);
            if (z11) {
                j = c1058jC.f12587a;
            } else {
                j = c1058jC.f12589c;
            }
            long j115 = j;
            if (z11) {
                j10 = c1058jC.f12588b;
            } else {
                j10 = c1058jC.f12590d;
            }
            SurfaceKt.c(aVar, hVar2, z11, l0VarA, j115, j10, 0.0f, ((p013b0.f) c1060l17.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i18, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar3);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
            c1058j2 = c1058jC;
            kVar4 = kVar2;
            l0Var2 = l0VarA;
            c0937i3 = c0937i18;
            z12 = z11;
            c1060l2 = c1060l17;
            hVar3 = hVar2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i15 != 0) {
                    c0937i2 = null;
                }
                if (i17 != 0) {
                    i20 = i12;
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                    i20 = i12;
                }
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i15 != 0) {
                    c0937i2 = null;
                }
                if (i17 != 0) {
                    i20 = i12;
                    kVar2 = null;
                } else {
                    kVar2 = kVar;
                    i20 = i12;
                }
            }
            C1060l c1060l18 = c1060lB;
            C0937i c0937i19 = c0937i2;
            c1086gP.U();
            c1086gP.L(1976524431);
            if (kVar2 == null) {
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                kVar3 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                kVar3 = kVar2;
            }
            c1086gP.T(false);
            if (z11) {
                j = c1058jC.f12587a;
            } else {
                j = c1058jC.f12589c;
            }
            long j116 = j;
            if (z11) {
                j10 = c1058jC.f12588b;
            } else {
                j10 = c1058jC.f12590d;
            }
            SurfaceKt.c(aVar, hVar2, z11, l0VarA, j116, j10, 0.0f, ((p013b0.f) c1060l18.a(z11, kVar3, c1086gP, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue()).f20481b, c0937i19, kVar3, androidx.compose.runtime.internal.a.b(776921067, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$3
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
                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar3);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i20 & 8190) | ((i20 << 6) & 234881024), 64);
            c1058j2 = c1058jC;
            kVar4 = kVar2;
            l0Var2 = l0VarA;
            c0937i3 = c0937i19;
            z12 = z11;
            c1060l2 = c1060l18;
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CardKt.a(aVar, hVar3, z12, l0Var2, c1058j2, c1060l2, c0937i3, kVar4, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x017d  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0 A[PHI: r1 r2 r3 r4 r8
      0x00f0: PHI (r1v6 androidx.compose.ui.h) = (r1v3 androidx.compose.ui.h), (r1v10 androidx.compose.ui.h) binds: [B:104:0x012d, B:87:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r2v10 androidx.compose.ui.graphics.l0) = (r2v6 androidx.compose.ui.graphics.l0), (r2v11 androidx.compose.ui.graphics.l0) binds: [B:104:0x012d, B:87:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r3v23 int) = (r3v16 int), (r3v26 int) binds: [B:104:0x012d, B:87:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r4v12 androidx.compose.material3.j) = (r4v5 androidx.compose.material3.j), (r4v13 androidx.compose.material3.j) binds: [B:104:0x012d, B:87:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r8v11 androidx.compose.material3.l) = (r8v3 androidx.compose.material3.l), (r8v2 androidx.compose.material3.l) binds: [B:104:0x012d, B:87:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    public static final void b(androidx.compose.ui.h hVar, androidx.compose.ui.graphics.l0 l0Var, C1058j c1058j, C1060l c1060l, C0937i c0937i, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        androidx.compose.ui.graphics.l0 l0Var2;
        C1058j c1058j2;
        C1060l c1060lB;
        C0937i c0937i2;
        int i13;
        final androidx.compose.ui.h hVar3;
        final androidx.compose.ui.graphics.l0 l0VarA;
        C1058j c1058jC;
        final C0937i c0937i3;
        final C1060l c1060l2;
        final C1058j c1058j3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1179621553);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                l0Var2 = l0Var;
                int i15 = c1086gP.K(l0Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i15;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                c1058j2 = c1058j;
                int i16 = c1086gP.K(c1058j2) ? 256 : 128;
                i12 |= i16;
            } else {
                c1058j2 = c1058j;
            }
            i12 |= i16;
        } else {
            c1058j2 = c1058j;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                c1060lB = c1060l;
                int i17 = c1086gP.K(c1060lB) ? 2048 : 1024;
                i12 |= i17;
            } else {
                c1060lB = c1060l;
            }
            i12 |= i17;
        } else {
            c1060lB = c1060l;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                c0937i2 = c0937i;
                i12 |= c1086gP.K(c0937i2) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i12 |= i13;
            }
            if ((74899 & i12) == 74898 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 2) != 0) {
                        l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                        i12 &= -113;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 &= -897;
                    } else {
                        c1058jC = c1058j2;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        c1060lB = C1059k.b(0.0f, 63);
                    }
                    if (i18 != 0) {
                        c0937i3 = null;
                    }
                    C1060l c1060l3 = c1060lB;
                    int i19 = i12;
                    c1086gP.U();
                    SurfaceKt.a(hVar3, l0VarA, c1058jC.f12587a, c1058jC.f12588b, 0.0f, ((p013b0.f) c1060l3.a(true, null, c1086gP, ((i19 >> 3) & 896) | 54).getValue()).f20481b, c0937i3, androidx.compose.runtime.internal.a.b(664103990, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$1
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
                                Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i19 & 14) | 12582912 | (i19 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i19 << 6) & 3670016), 16);
                    C1058j c1058j4 = c1058jC;
                    c1060l2 = c1060l3;
                    c1058j3 = c1058j4;
                } else {
                    c1086gP.w();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    hVar3 = hVar2;
                    l0VarA = l0Var2;
                    c1058jC = c1058j2;
                }
                c0937i3 = c0937i2;
                C1060l c1060l4 = c1060lB;
                int i110 = i12;
                c1086gP.U();
                SurfaceKt.a(hVar3, l0VarA, c1058jC.f12587a, c1058jC.f12588b, 0.0f, ((p013b0.f) c1060l4.a(true, null, c1086gP, ((i110 >> 3) & 896) | 54).getValue()).f20481b, c0937i3, androidx.compose.runtime.internal.a.b(664103990, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$1
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
                            Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i110 & 14) | 12582912 | (i110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i110 << 6) & 3670016), 16);
                C1058j c1058j5 = c1058jC;
                c1060l2 = c1060l4;
                c1058j3 = c1058j5;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                l0VarA = l0Var2;
                c1058j3 = c1058j2;
                c1060l2 = c1060lB;
                c0937i3 = c0937i2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        CardKt.b(hVar3, l0VarA, c1058j3, c1060l2, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        c0937i2 = c0937i;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(qVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
        }
        if ((74899 & i12) == 74898) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 2) != 0) {
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -897;
                } else {
                    c1058jC = c1058j2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i18 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i2;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 2) != 0) {
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -897;
                } else {
                    c1058jC = c1058j2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i18 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i2;
                }
            }
            C1060l c1060l5 = c1060lB;
            int i111 = i12;
            c1086gP.U();
            SurfaceKt.a(hVar3, l0VarA, c1058jC.f12587a, c1058jC.f12588b, 0.0f, ((p013b0.f) c1060l5.a(true, null, c1086gP, ((i111 >> 3) & 896) | 54).getValue()).f20481b, c0937i3, androidx.compose.runtime.internal.a.b(664103990, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$1
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
                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i111 & 14) | 12582912 | (i111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i111 << 6) & 3670016), 16);
            C1058j c1058j6 = c1058jC;
            c1060l2 = c1060l5;
            c1058j3 = c1058j6;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 2) != 0) {
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -897;
                } else {
                    c1058jC = c1058j2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i18 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i2;
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 2) != 0) {
                    l0VarA = ShapesKt.a(B.l.f1289b, c1086gP);
                    i12 &= -113;
                } else {
                    l0VarA = l0Var2;
                }
                if ((i11 & 4) != 0) {
                    c1058jC = C1059k.c((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 &= -897;
                } else {
                    c1058jC = c1058j2;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    c1060lB = C1059k.b(0.0f, 63);
                }
                if (i18 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i2;
                }
            }
            C1060l c1060l6 = c1060lB;
            int i112 = i12;
            c1086gP.U();
            SurfaceKt.a(hVar3, l0VarA, c1058jC.f12587a, c1058jC.f12588b, 0.0f, ((p013b0.f) c1060l6.a(true, null, c1086gP, ((i112 >> 3) & 896) | 54).getValue()).f20481b, c0937i3, androidx.compose.runtime.internal.a.b(664103990, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$1
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
                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i112 & 14) | 12582912 | (i112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i112 << 6) & 3670016), 16);
            C1058j c1058j7 = c1058jC;
            c1060l2 = c1060l6;
            c1058j3 = c1058j7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.CardKt$Card$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CardKt.b(hVar3, l0VarA, c1058j3, c1060l2, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
