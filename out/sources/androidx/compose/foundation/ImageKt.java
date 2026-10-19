package androidx.compose.foundation;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0108  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x0116  */
    /* JADX WARN: Code duplicated, block: B:107:0x011d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0121  */
    /* JADX WARN: Code duplicated, block: B:111:0x0133  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x0197  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0100  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void a(final Painter painter, final String str, androidx.compose.ui.h hVar, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, androidx.compose.ui.graphics.I i10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        int i16;
        InterfaceC1161g interfaceC1161g2;
        int i17;
        int i18;
        float f11;
        int i19;
        int i20;
        int i21;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final androidx.compose.ui.graphics.I i22;
        final androidx.compose.ui.d dVar3;
        final InterfaceC1161g interfaceC1161g3;
        final float f12;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVarB;
        androidx.compose.ui.h hVar3;
        androidx.compose.ui.d dVar4;
        InterfaceC1161g interfaceC1161g4;
        float f13;
        androidx.compose.ui.graphics.I i23;
        int i24;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        boolean z11;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1142754848);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c1086gP.k(painter) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= c1086gP.K(str) ? 32 : 16;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & 384) == 0) {
                i13 |= c1086gP.K(hVar) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    dVar2 = dVar;
                    if (c1086gP.K(dVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        interfaceC1161g2 = interfaceC1161g;
                        if (c1086gP.K(interfaceC1161g2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            f11 = f10;
                            if (c1086gP.g(f11)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 64;
                        if (i20 != 0) {
                            if ((1572864 & i11) == 0) {
                                if (c1086gP.K(i10)) {
                                    i21 = 1048576;
                                } else {
                                    i21 = 524288;
                                }
                                i13 |= i21;
                            }
                            if ((i13 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c1086gP.C(i13 & 1, z10)) {
                                hVarB = androidx.compose.ui.h.a.f13984b;
                                if (i25 != 0) {
                                    hVar3 = hVarB;
                                } else {
                                    hVar3 = hVar;
                                }
                                if (i14 != 0) {
                                    dVar4 = androidx.compose.ui.d.a.f13339e;
                                } else {
                                    dVar4 = dVar2;
                                }
                                if (i16 != 0) {
                                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                                } else {
                                    interfaceC1161g4 = interfaceC1161g2;
                                }
                                if (i18 != 0) {
                                    f13 = 1.0f;
                                } else {
                                    f13 = f11;
                                }
                                if (i20 != 0) {
                                    i23 = null;
                                } else {
                                    i23 = i10;
                                }
                                if (str != null) {
                                    c1086gP.L(1040425059);
                                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    objF = c1086gP.f();
                                    if (z11 || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        c1086gP.E(objF);
                                    }
                                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                    c1086gP.T(false);
                                } else {
                                    c1086gP.L(1040583841);
                                    c1086gP.T(false);
                                }
                                androidx.compose.ui.h hVarA = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                                ImageKt$Image$1 imageKt$Image$1 = ImageKt$Image$1.f9772a;
                                i24 = c1086gP.f12996P;
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                                ComposeUiNode.f14331c0.getClass();
                                aVar = ComposeUiNode.Companion.f14333b;
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$1);
                                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                                pVar = ComposeUiNode.Companion.f14338g;
                                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i24))) {
                                    J4.i.d(i24, c1086gP, i24, pVar);
                                }
                                c1086gP.T(true);
                                hVar2 = hVar3;
                                dVar3 = dVar4;
                                interfaceC1161g3 = interfaceC1161g4;
                                f12 = f13;
                                i22 = i23;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                i22 = i10;
                                dVar3 = dVar2;
                                interfaceC1161g3 = interfaceC1161g2;
                                f12 = f11;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i13 |= 1572864;
                        if ((i13 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i13 & 1, z10)) {
                            hVarB = androidx.compose.ui.h.a.f13984b;
                            if (i25 != 0) {
                                hVar3 = hVarB;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i14 != 0) {
                                dVar4 = androidx.compose.ui.d.a.f13339e;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i16 != 0) {
                                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                            } else {
                                interfaceC1161g4 = interfaceC1161g2;
                            }
                            if (i18 != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = f11;
                            }
                            if (i20 != 0) {
                                i23 = null;
                            } else {
                                i23 = i10;
                            }
                            if (str != null) {
                                c1086gP.L(1040425059);
                                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = c1086gP.f();
                                if (z11) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                } else {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(1040583841);
                                c1086gP.T(false);
                            }
                            androidx.compose.ui.h hVarA2 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                            ImageKt$Image$1 imageKt$Image$2 = ImageKt$Image$1.f9772a;
                            i24 = c1086gP.f12996P;
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA2);
                            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$2);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O) {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            } else {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            }
                            c1086gP.T(true);
                            hVar2 = hVar3;
                            dVar3 = dVar4;
                            interfaceC1161g3 = interfaceC1161g4;
                            f12 = f13;
                            i22 = i23;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            i22 = i10;
                            dVar3 = dVar2;
                            interfaceC1161g3 = interfaceC1161g2;
                            f12 = f11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 196608;
                    f11 = f10;
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (c1086gP.K(i10)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i13 & 1, z10)) {
                            hVarB = androidx.compose.ui.h.a.f13984b;
                            if (i25 != 0) {
                                hVar3 = hVarB;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i14 != 0) {
                                dVar4 = androidx.compose.ui.d.a.f13339e;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i16 != 0) {
                                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                            } else {
                                interfaceC1161g4 = interfaceC1161g2;
                            }
                            if (i18 != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = f11;
                            }
                            if (i20 != 0) {
                                i23 = null;
                            } else {
                                i23 = i10;
                            }
                            if (str != null) {
                                c1086gP.L(1040425059);
                                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = c1086gP.f();
                                if (z11) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                } else {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(1040583841);
                                c1086gP.T(false);
                            }
                            androidx.compose.ui.h hVarA3 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                            ImageKt$Image$1 imageKt$Image$3 = ImageKt$Image$1.f9772a;
                            i24 = c1086gP.f12996P;
                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarA3);
                            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$3);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O) {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            } else {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            }
                            c1086gP.T(true);
                            hVar2 = hVar3;
                            dVar3 = dVar4;
                            interfaceC1161g3 = interfaceC1161g4;
                            f12 = f13;
                            i22 = i23;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            i22 = i10;
                            dVar3 = dVar2;
                            interfaceC1161g3 = interfaceC1161g2;
                            f12 = f11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA4 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$4 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA4);
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                interfaceC1161g2 = interfaceC1161g;
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (c1086gP.K(i10)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i13 & 1, z10)) {
                            hVarB = androidx.compose.ui.h.a.f13984b;
                            if (i25 != 0) {
                                hVar3 = hVarB;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i14 != 0) {
                                dVar4 = androidx.compose.ui.d.a.f13339e;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i16 != 0) {
                                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                            } else {
                                interfaceC1161g4 = interfaceC1161g2;
                            }
                            if (i18 != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = f11;
                            }
                            if (i20 != 0) {
                                i23 = null;
                            } else {
                                i23 = i10;
                            }
                            if (str != null) {
                                c1086gP.L(1040425059);
                                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = c1086gP.f();
                                if (z11) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                } else {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(1040583841);
                                c1086gP.T(false);
                            }
                            androidx.compose.ui.h hVarA5 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                            ImageKt$Image$1 imageKt$Image$5 = ImageKt$Image$1.f9772a;
                            i24 = c1086gP.f12996P;
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarA5);
                            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$5);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O) {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            } else {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            }
                            c1086gP.T(true);
                            hVar2 = hVar3;
                            dVar3 = dVar4;
                            interfaceC1161g3 = interfaceC1161g4;
                            f12 = f13;
                            i22 = i23;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            i22 = i10;
                            dVar3 = dVar2;
                            interfaceC1161g3 = interfaceC1161g2;
                            f12 = f11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA6 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$6 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarA6);
                        InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$6);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f10;
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA7 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$7 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarA7);
                        InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$7);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA8 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$8 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarA8);
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$8);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            dVar2 = dVar;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    interfaceC1161g2 = interfaceC1161g;
                    if (c1086gP.K(interfaceC1161g2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (c1086gP.K(i10)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i13 & 1, z10)) {
                            hVarB = androidx.compose.ui.h.a.f13984b;
                            if (i25 != 0) {
                                hVar3 = hVarB;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i14 != 0) {
                                dVar4 = androidx.compose.ui.d.a.f13339e;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i16 != 0) {
                                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                            } else {
                                interfaceC1161g4 = interfaceC1161g2;
                            }
                            if (i18 != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = f11;
                            }
                            if (i20 != 0) {
                                i23 = null;
                            } else {
                                i23 = i10;
                            }
                            if (str != null) {
                                c1086gP.L(1040425059);
                                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = c1086gP.f();
                                if (z11) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                } else {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(1040583841);
                                c1086gP.T(false);
                            }
                            androidx.compose.ui.h hVarA9 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                            ImageKt$Image$1 imageKt$Image$9 = ImageKt$Image$1.f9772a;
                            i24 = c1086gP.f12996P;
                            androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarA9);
                            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$9);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O) {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            } else {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            }
                            c1086gP.T(true);
                            hVar2 = hVar3;
                            dVar3 = dVar4;
                            interfaceC1161g3 = interfaceC1161g4;
                            f12 = f13;
                            i22 = i23;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            i22 = i10;
                            dVar3 = dVar2;
                            interfaceC1161g3 = interfaceC1161g2;
                            f12 = f11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA10 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$10 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarA10);
                        InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$10);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f10;
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA11 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$11 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarA11);
                        InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$11);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA12 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$12 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarA12);
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            interfaceC1161g2 = interfaceC1161g;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA13 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$13 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarA13);
                        InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$13);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA14 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$14 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarA14);
                    InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$14);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f10;
            i20 = i12 & 64;
            if (i20 != 0) {
                if ((1572864 & i11) == 0) {
                    if (c1086gP.K(i10)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA15 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$15 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarA15);
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$15);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                hVarB = androidx.compose.ui.h.a.f13984b;
                if (i25 != 0) {
                    hVar3 = hVarB;
                } else {
                    hVar3 = hVar;
                }
                if (i14 != 0) {
                    dVar4 = androidx.compose.ui.d.a.f13339e;
                } else {
                    dVar4 = dVar2;
                }
                if (i16 != 0) {
                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                } else {
                    interfaceC1161g4 = interfaceC1161g2;
                }
                if (i18 != 0) {
                    f13 = 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != 0) {
                    i23 = null;
                } else {
                    i23 = i10;
                }
                if (str != null) {
                    c1086gP.L(1040425059);
                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1040583841);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarA16 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                ImageKt$Image$1 imageKt$Image$16 = ImageKt$Image$1.f9772a;
                i24 = c1086gP.f12996P;
                androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarA16);
                InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$16);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i24, c1086gP, i24, pVar);
                } else {
                    J4.i.d(i24, c1086gP, i24, pVar);
                }
                c1086gP.T(true);
                hVar2 = hVar3;
                dVar3 = dVar4;
                interfaceC1161g3 = interfaceC1161g4;
                f12 = f13;
                i22 = i23;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                i22 = i10;
                dVar3 = dVar2;
                interfaceC1161g3 = interfaceC1161g2;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                dVar2 = dVar;
                if (c1086gP.K(dVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    interfaceC1161g2 = interfaceC1161g;
                    if (c1086gP.K(interfaceC1161g2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 64;
                    if (i20 != 0) {
                        if ((1572864 & i11) == 0) {
                            if (c1086gP.K(i10)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i13 & 1, z10)) {
                            hVarB = androidx.compose.ui.h.a.f13984b;
                            if (i25 != 0) {
                                hVar3 = hVarB;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i14 != 0) {
                                dVar4 = androidx.compose.ui.d.a.f13339e;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i16 != 0) {
                                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                            } else {
                                interfaceC1161g4 = interfaceC1161g2;
                            }
                            if (i18 != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = f11;
                            }
                            if (i20 != 0) {
                                i23 = null;
                            } else {
                                i23 = i10;
                            }
                            if (str != null) {
                                c1086gP.L(1040425059);
                                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF = c1086gP.f();
                                if (z11) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                } else {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.w wVar2 = wVar;
                                            androidx.compose.ui.semantics.t.g(str, wVar2);
                                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(1040583841);
                                c1086gP.T(false);
                            }
                            androidx.compose.ui.h hVarA17 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                            ImageKt$Image$1 imageKt$Image$17 = ImageKt$Image$1.f9772a;
                            i24 = c1086gP.f12996P;
                            androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarA17);
                            InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$17);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC17);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O) {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            } else {
                                J4.i.d(i24, c1086gP, i24, pVar);
                            }
                            c1086gP.T(true);
                            hVar2 = hVar3;
                            dVar3 = dVar4;
                            interfaceC1161g3 = interfaceC1161g4;
                            f12 = f13;
                            i22 = i23;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            i22 = i10;
                            dVar3 = dVar2;
                            interfaceC1161g3 = interfaceC1161g2;
                            f12 = f11;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA18 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$18 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarA18);
                        InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$18);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 196608;
                f11 = f10;
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA19 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$19 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVarA19);
                        InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$19);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC19);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA110 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$110 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarA110);
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            interfaceC1161g2 = interfaceC1161g;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA111 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$111 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarA111);
                        InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$111);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA112 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$112 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarA112);
                    InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$112);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f10;
            i20 = i12 & 64;
            if (i20 != 0) {
                if ((1572864 & i11) == 0) {
                    if (c1086gP.K(i10)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA113 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$113 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarA113);
                    InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$113);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC113);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                hVarB = androidx.compose.ui.h.a.f13984b;
                if (i25 != 0) {
                    hVar3 = hVarB;
                } else {
                    hVar3 = hVar;
                }
                if (i14 != 0) {
                    dVar4 = androidx.compose.ui.d.a.f13339e;
                } else {
                    dVar4 = dVar2;
                }
                if (i16 != 0) {
                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                } else {
                    interfaceC1161g4 = interfaceC1161g2;
                }
                if (i18 != 0) {
                    f13 = 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != 0) {
                    i23 = null;
                } else {
                    i23 = i10;
                }
                if (str != null) {
                    c1086gP.L(1040425059);
                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1040583841);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarA114 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                ImageKt$Image$1 imageKt$Image$114 = ImageKt$Image$1.f9772a;
                i24 = c1086gP.f12996P;
                androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarA114);
                InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$114);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i24, c1086gP, i24, pVar);
                } else {
                    J4.i.d(i24, c1086gP, i24, pVar);
                }
                c1086gP.T(true);
                hVar2 = hVar3;
                dVar3 = dVar4;
                interfaceC1161g3 = interfaceC1161g4;
                f12 = f13;
                i22 = i23;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                i22 = i10;
                dVar3 = dVar2;
                interfaceC1161g3 = interfaceC1161g2;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        dVar2 = dVar;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                interfaceC1161g2 = interfaceC1161g;
                if (c1086gP.K(interfaceC1161g2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 64;
                if (i20 != 0) {
                    if ((1572864 & i11) == 0) {
                        if (c1086gP.K(i10)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i13 & 1, z10)) {
                        hVarB = androidx.compose.ui.h.a.f13984b;
                        if (i25 != 0) {
                            hVar3 = hVarB;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i14 != 0) {
                            dVar4 = androidx.compose.ui.d.a.f13339e;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i16 != 0) {
                            interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                        } else {
                            interfaceC1161g4 = interfaceC1161g2;
                        }
                        if (i18 != 0) {
                            f13 = 1.0f;
                        } else {
                            f13 = f11;
                        }
                        if (i20 != 0) {
                            i23 = null;
                        } else {
                            i23 = i10;
                        }
                        if (str != null) {
                            c1086gP.L(1040425059);
                            if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF = c1086gP.f();
                            if (z11) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            } else {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.w wVar2 = wVar;
                                        androidx.compose.ui.semantics.t.g(str, wVar2);
                                        androidx.compose.ui.semantics.t.k(wVar2, 5);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1040583841);
                            c1086gP.T(false);
                        }
                        androidx.compose.ui.h hVarA115 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                        ImageKt$Image$1 imageKt$Image$115 = ImageKt$Image$1.f9772a;
                        i24 = c1086gP.f12996P;
                        androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarA115);
                        InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$115);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC115);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        } else {
                            J4.i.d(i24, c1086gP, i24, pVar);
                        }
                        c1086gP.T(true);
                        hVar2 = hVar3;
                        dVar3 = dVar4;
                        interfaceC1161g3 = interfaceC1161g4;
                        f12 = f13;
                        i22 = i23;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        i22 = i10;
                        dVar3 = dVar2;
                        interfaceC1161g3 = interfaceC1161g2;
                        f12 = f11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA116 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$116 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarA116);
                    InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$116);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 196608;
            f11 = f10;
            i20 = i12 & 64;
            if (i20 != 0) {
                if ((1572864 & i11) == 0) {
                    if (c1086gP.K(i10)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA117 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$117 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVarA117);
                    InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$117);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC117);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                hVarB = androidx.compose.ui.h.a.f13984b;
                if (i25 != 0) {
                    hVar3 = hVarB;
                } else {
                    hVar3 = hVar;
                }
                if (i14 != 0) {
                    dVar4 = androidx.compose.ui.d.a.f13339e;
                } else {
                    dVar4 = dVar2;
                }
                if (i16 != 0) {
                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                } else {
                    interfaceC1161g4 = interfaceC1161g2;
                }
                if (i18 != 0) {
                    f13 = 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != 0) {
                    i23 = null;
                } else {
                    i23 = i10;
                }
                if (str != null) {
                    c1086gP.L(1040425059);
                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1040583841);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarA118 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                ImageKt$Image$1 imageKt$Image$118 = ImageKt$Image$1.f9772a;
                i24 = c1086gP.f12996P;
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarA118);
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i24, c1086gP, i24, pVar);
                } else {
                    J4.i.d(i24, c1086gP, i24, pVar);
                }
                c1086gP.T(true);
                hVar2 = hVar3;
                dVar3 = dVar4;
                interfaceC1161g3 = interfaceC1161g4;
                f12 = f13;
                i22 = i23;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                i22 = i10;
                dVar3 = dVar2;
                interfaceC1161g3 = interfaceC1161g2;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        interfaceC1161g2 = interfaceC1161g;
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i20 = i12 & 64;
            if (i20 != 0) {
                if ((1572864 & i11) == 0) {
                    if (c1086gP.K(i10)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    hVarB = androidx.compose.ui.h.a.f13984b;
                    if (i25 != 0) {
                        hVar3 = hVarB;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i14 != 0) {
                        dVar4 = androidx.compose.ui.d.a.f13339e;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i16 != 0) {
                        interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                    } else {
                        interfaceC1161g4 = interfaceC1161g2;
                    }
                    if (i18 != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = f11;
                    }
                    if (i20 != 0) {
                        i23 = null;
                    } else {
                        i23 = i10;
                    }
                    if (str != null) {
                        c1086gP.L(1040425059);
                        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.w wVar2 = wVar;
                                    androidx.compose.ui.semantics.t.g(str, wVar2);
                                    androidx.compose.ui.semantics.t.k(wVar2, 5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1040583841);
                        c1086gP.T(false);
                    }
                    androidx.compose.ui.h hVarA119 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                    ImageKt$Image$1 imageKt$Image$119 = ImageKt$Image$1.f9772a;
                    i24 = c1086gP.f12996P;
                    androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVarA119);
                    InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$119);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC119);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    } else {
                        J4.i.d(i24, c1086gP, i24, pVar);
                    }
                    c1086gP.T(true);
                    hVar2 = hVar3;
                    dVar3 = dVar4;
                    interfaceC1161g3 = interfaceC1161g4;
                    f12 = f13;
                    i22 = i23;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    i22 = i10;
                    dVar3 = dVar2;
                    interfaceC1161g3 = interfaceC1161g2;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                hVarB = androidx.compose.ui.h.a.f13984b;
                if (i25 != 0) {
                    hVar3 = hVarB;
                } else {
                    hVar3 = hVar;
                }
                if (i14 != 0) {
                    dVar4 = androidx.compose.ui.d.a.f13339e;
                } else {
                    dVar4 = dVar2;
                }
                if (i16 != 0) {
                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                } else {
                    interfaceC1161g4 = interfaceC1161g2;
                }
                if (i18 != 0) {
                    f13 = 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != 0) {
                    i23 = null;
                } else {
                    i23 = i10;
                }
                if (str != null) {
                    c1086gP.L(1040425059);
                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1040583841);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarA1110 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                ImageKt$Image$1 imageKt$Image$1110 = ImageKt$Image$1.f9772a;
                i24 = c1086gP.f12996P;
                androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarA1110);
                InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$1110);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i24, c1086gP, i24, pVar);
                } else {
                    J4.i.d(i24, c1086gP, i24, pVar);
                }
                c1086gP.T(true);
                hVar2 = hVar3;
                dVar3 = dVar4;
                interfaceC1161g3 = interfaceC1161g4;
                f12 = f13;
                i22 = i23;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                i22 = i10;
                dVar3 = dVar2;
                interfaceC1161g3 = interfaceC1161g2;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 196608;
        f11 = f10;
        i20 = i12 & 64;
        if (i20 != 0) {
            if ((1572864 & i11) == 0) {
                if (c1086gP.K(i10)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                hVarB = androidx.compose.ui.h.a.f13984b;
                if (i25 != 0) {
                    hVar3 = hVarB;
                } else {
                    hVar3 = hVar;
                }
                if (i14 != 0) {
                    dVar4 = androidx.compose.ui.d.a.f13339e;
                } else {
                    dVar4 = dVar2;
                }
                if (i16 != 0) {
                    interfaceC1161g4 = InterfaceC1161g.a.f14244b;
                } else {
                    interfaceC1161g4 = interfaceC1161g2;
                }
                if (i18 != 0) {
                    f13 = 1.0f;
                } else {
                    f13 = f11;
                }
                if (i20 != 0) {
                    i23 = null;
                } else {
                    i23 = i10;
                }
                if (str != null) {
                    c1086gP.L(1040425059);
                    if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                androidx.compose.ui.semantics.t.g(str, wVar2);
                                androidx.compose.ui.semantics.t.k(wVar2, 5);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1040583841);
                    c1086gP.T(false);
                }
                androidx.compose.ui.h hVarA1111 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
                ImageKt$Image$1 imageKt$Image$1111 = ImageKt$Image$1.f9772a;
                i24 = c1086gP.f12996P;
                androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarA1111);
                InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$1111);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1111);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i24, c1086gP, i24, pVar);
                } else {
                    J4.i.d(i24, c1086gP, i24, pVar);
                }
                c1086gP.T(true);
                hVar2 = hVar3;
                dVar3 = dVar4;
                interfaceC1161g3 = interfaceC1161g4;
                f12 = f13;
                i22 = i23;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                i22 = i10;
                dVar3 = dVar2;
                interfaceC1161g3 = interfaceC1161g2;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 1572864;
        if ((i13 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i13 & 1, z10)) {
            hVarB = androidx.compose.ui.h.a.f13984b;
            if (i25 != 0) {
                hVar3 = hVarB;
            } else {
                hVar3 = hVar;
            }
            if (i14 != 0) {
                dVar4 = androidx.compose.ui.d.a.f13339e;
            } else {
                dVar4 = dVar2;
            }
            if (i16 != 0) {
                interfaceC1161g4 = InterfaceC1161g.a.f14244b;
            } else {
                interfaceC1161g4 = interfaceC1161g2;
            }
            if (i18 != 0) {
                f13 = 1.0f;
            } else {
                f13 = f11;
            }
            if (i20 != 0) {
                i23 = null;
            } else {
                i23 = i10;
            }
            if (str != null) {
                c1086gP.L(1040425059);
                if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                if (z11) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.w wVar2 = wVar;
                            androidx.compose.ui.semantics.t.g(str, wVar2);
                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.w wVar2 = wVar;
                            androidx.compose.ui.semantics.t.g(str, wVar2);
                            androidx.compose.ui.semantics.t.k(wVar2, 5);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                hVarB = androidx.compose.ui.semantics.p.b(hVarB, false, (Ia.l) objF);
                c1086gP.T(false);
            } else {
                c1086gP.L(1040583841);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVarA1112 = androidx.compose.ui.draw.j.a(A8.p.s(hVar3.i(hVarB)), painter, dVar4, interfaceC1161g4, f13, i23, 2);
            ImageKt$Image$1 imageKt$Image$1112 = ImageKt$Image$1.f9772a;
            i24 = c1086gP.f12996P;
            androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, hVarA1112);
            InterfaceC1089h0 interfaceC1089h0P1112 = c1086gP.P();
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, imageKt$Image$1112);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1112);
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1112);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i24, c1086gP, i24, pVar);
            } else {
                J4.i.d(i24, c1086gP, i24, pVar);
            }
            c1086gP.T(true);
            hVar2 = hVar3;
            dVar3 = dVar4;
            interfaceC1161g3 = interfaceC1161g4;
            f12 = f13;
            i22 = i23;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            i22 = i10;
            dVar3 = dVar2;
            interfaceC1161g3 = interfaceC1161g2;
            f12 = f11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.ImageKt$Image$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ImageKt.a(painter, str, hVar2, dVar3, interfaceC1161g3, f12, i22, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
