package androidx.compose.foundation.contextmenu;

import Ia.p;
import Ia.q;
import Na.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.F;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.m;
import androidx.compose.ui.window.n;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuUi_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f9866a = new n(14, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9867b;

    static {
        long j = H.f13499f;
        long j10 = H.f13495b;
        f9867b = new a(j, j10, j10, H.b(0.38f, j10), H.b(0.38f, j10));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(final a aVar, androidx.compose.ui.h hVar, final q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z10;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C1086g c1086gP = interfaceC1084f.p(-921259293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(qVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i15 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                androidx.compose.ui.h hVarB = C0932d.b(P3.d.v(hVar4, f.f9879d, p270w.g.b(f.f9880e), 0L, 0L, 28), aVar.f9868a, h0.f13629a);
                IntrinsicSize intrinsicSize = IntrinsicSize.f10155b;
                androidx.compose.ui.h hVarB2 = ScrollKt.b(PaddingKt.h(G.b(hVarB), 0.0f, f.f9884i, 1), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
                int i16 = (i12 << 3) & 7168;
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                qVar.invoke(C0955o.f10310a, c1086gP, Integer.valueOf(((i16 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                c1086gP.T(true);
                hVar3 = hVar4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.a(aVar, hVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(qVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i15 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            androidx.compose.ui.h hVarB3 = C0932d.b(P3.d.v(hVar4, f.f9879d, p270w.g.b(f.f9880e), 0L, 0L, 28), aVar.f9868a, h0.f13629a);
            IntrinsicSize intrinsicSize2 = IntrinsicSize.f10155b;
            androidx.compose.ui.h hVarB4 = ScrollKt.b(PaddingKt.h(G.b(hVarB3), 0.0f, f.f9884i, 1), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            int i17 = (i12 << 3) & 7168;
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB4);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            qVar.invoke(C0955o.f10310a, c1086gP, Integer.valueOf(((i17 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
            c1086gP.T(true);
            hVar3 = hVar4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuUi_androidKt.a(aVar, hVar3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0169  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x0249  */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d  */
    public static final void b(final String str, final boolean z10, final a aVar, androidx.compose.ui.h hVar, q<? super H, ? super InterfaceC1084f, ? super Integer, r> qVar, final Ia.a<r> aVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        q<? super H, ? super InterfaceC1084f, ? super Integer, r> qVar2;
        int i14;
        int i15;
        boolean z11;
        C1086g c1086g;
        final androidx.compose.ui.h hVar3;
        final q<? super H, ? super InterfaceC1084f, ? super Integer, r> qVar3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h.a aVar3;
        androidx.compose.ui.h hVar4;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objF;
        int i16;
        Ia.a<ComposeUiNode> aVar4;
        p<ComposeUiNode, E, r> pVar;
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2;
        p<ComposeUiNode, Integer, r> pVar3;
        androidx.compose.ui.h hVar5;
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar4;
        int i17;
        long j;
        boolean z15;
        long j10;
        C1086g c1086gP = interfaceC1084f.p(791018367);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(aVar) ? 256 : 128;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 3072) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    qVar2 = qVar;
                    if (c1086gP.k(qVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    aVar3 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        hVar4 = aVar3;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        qVar2 = null;
                    }
                    androidx.compose.ui.f.b bVar = f.f9881f;
                    C0945e.j jVar = C0945e.f10284a;
                    float f10 = f.f9883h;
                    C0945e.i iVarG = C0945e.g(f10);
                    if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((458752 & i12) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z12 | z13;
                    objF = c1086gP.f();
                    if (z14 || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                if (z10) {
                                    aVar2.invoke();
                                }
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    androidx.compose.ui.h hVarD = W.d(ClickableKt.c(hVar4, z10, str, (Ia.a) objF, 4), 1.0f);
                    float f11 = f.f9876a;
                    float f12 = f.f9877b;
                    float f13 = f.f9878c;
                    androidx.compose.ui.h hVarH = PaddingKt.h(W.o(hVarD, f11, f13, f12, f13), f10, 0.0f, 2);
                    T tA = S.a(iVarG, bVar, c1086gP, 54);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
                    ComposeUiNode.f14331c0.getClass();
                    aVar4 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, c1086gP, tA);
                    pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, c1086gP, interfaceC1089h0P);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        hVar5 = hVar4;
                    } else {
                        hVar5 = hVar4;
                        if (!i.a(c1086gP.f(), Integer.valueOf(i16))) {
                        }
                        pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC);
                        if (qVar2 == null) {
                            c1086gP.L(554788141);
                            z15 = false;
                        } else {
                            c1086gP.L(554788142);
                            float f14 = f.j;
                            androidx.compose.ui.h hVarK = W.k(aVar3, f14, 0.0f, f14, f14, 2);
                            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i17 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarK);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar4);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar, c1086gP, eD);
                            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
                            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i17))) {
                                J4.i.d(i17, c1086gP, i17, pVar3);
                            }
                            R0.a(pVar4, c1086gP, hVarC2);
                            if (z10) {
                                j = aVar.f9870c;
                            } else {
                                j = aVar.f9872e;
                            }
                            H h8 = new H(j);
                            z15 = false;
                            qVar2.invoke(h8, c1086gP, 0);
                            c1086gP.T(true);
                            r rVar = r.f47939a;
                        }
                        c1086gP.T(z15);
                        if (z10) {
                            j10 = aVar.f9869b;
                        } else {
                            j10 = aVar.f9871d;
                        }
                        F f15 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                        if (1.0f <= 0.0d) {
                            p258v.a.a("invalid weight; must be greater than zero");
                        }
                        BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f15, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        qVar3 = qVar2;
                        hVar3 = hVar5;
                    }
                    J4.i.d(i16, c1086gP, i16, pVar3);
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC);
                    if (qVar2 == null) {
                        c1086gP.L(554788141);
                        z15 = false;
                    } else {
                        c1086gP.L(554788142);
                        float f16 = f.j;
                        androidx.compose.ui.h hVarK2 = W.k(aVar3, f16, 0.0f, f16, f16, 2);
                        E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarK2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar4);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD2);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC3);
                        if (z10) {
                            j = aVar.f9870c;
                        } else {
                            j = aVar.f9872e;
                        }
                        H h10 = new H(j);
                        z15 = false;
                        qVar2.invoke(h10, c1086gP, 0);
                        c1086gP.T(true);
                        r rVar2 = r.f47939a;
                    }
                    c1086gP.T(z15);
                    if (z10) {
                        j10 = aVar.f9869b;
                    } else {
                        j10 = aVar.f9871d;
                    }
                    F f17 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f17, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    qVar3 = qVar2;
                    hVar3 = hVar5;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar3 = hVar2;
                    qVar3 = qVar2;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuUi_androidKt.b(str, z10, aVar, hVar3, qVar3, aVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            qVar2 = qVar;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(aVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar4 = aVar3;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    qVar2 = null;
                }
                androidx.compose.ui.f.b bVar2 = f.f9881f;
                C0945e.j jVar2 = C0945e.f10284a;
                float f18 = f.f9883h;
                C0945e.i iVarG2 = C0945e.g(f18);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((458752 & i12) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objF = c1086gP.f();
                if (z14) {
                    objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            if (z10) {
                                aVar2.invoke();
                            }
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            if (z10) {
                                aVar2.invoke();
                            }
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                androidx.compose.ui.h hVarD2 = W.d(ClickableKt.c(hVar4, z10, str, (Ia.a) objF, 4), 1.0f);
                float f19 = f.f9876a;
                float f110 = f.f9877b;
                float f111 = f.f9878c;
                androidx.compose.ui.h hVarH2 = PaddingKt.h(W.o(hVarD2, f19, f111, f110, f111), f18, 0.0f, 2);
                T tA2 = S.a(iVarG2, bVar2, c1086gP, 54);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarH2);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, tA2);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P4);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar5 = hVar4;
                    if (!i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC4);
                    if (qVar2 == null) {
                        c1086gP.L(554788141);
                        z15 = false;
                    } else {
                        c1086gP.L(554788142);
                        float f112 = f.j;
                        androidx.compose.ui.h hVarK3 = W.k(aVar3, f112, 0.0f, f112, f112, 2);
                        E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarK3);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar4);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD3);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P5);
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC5);
                        if (z10) {
                            j = aVar.f9870c;
                        } else {
                            j = aVar.f9872e;
                        }
                        H h11 = new H(j);
                        z15 = false;
                        qVar2.invoke(h11, c1086gP, 0);
                        c1086gP.T(true);
                        r rVar3 = r.f47939a;
                    }
                    c1086gP.T(z15);
                    if (z10) {
                        j10 = aVar.f9869b;
                    } else {
                        j10 = aVar.f9871d;
                    }
                    F f113 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f113, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    qVar3 = qVar2;
                    hVar3 = hVar5;
                } else {
                    hVar5 = hVar4;
                }
                J4.i.d(i16, c1086gP, i16, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC4);
                if (qVar2 == null) {
                    c1086gP.L(554788141);
                    z15 = false;
                } else {
                    c1086gP.L(554788142);
                    float f114 = f.j;
                    androidx.compose.ui.h hVarK4 = W.k(aVar3, f114, 0.0f, f114, f114, 2);
                    E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarK4);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD4);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P6);
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC6);
                    if (z10) {
                        j = aVar.f9870c;
                    } else {
                        j = aVar.f9872e;
                    }
                    H h12 = new H(j);
                    z15 = false;
                    qVar2.invoke(h12, c1086gP, 0);
                    c1086gP.T(true);
                    r rVar4 = r.f47939a;
                }
                c1086gP.T(z15);
                if (z10) {
                    j10 = aVar.f9869b;
                } else {
                    j10 = aVar.f9871d;
                }
                F f115 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f115, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                c1086g = c1086gP;
                c1086g.T(true);
                qVar3 = qVar2;
                hVar3 = hVar5;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar3 = hVar2;
                qVar3 = qVar2;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.b(str, z10, aVar, hVar3, qVar3, aVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                qVar2 = qVar;
                if (c1086gP.k(qVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(aVar2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                aVar3 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    hVar4 = aVar3;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    qVar2 = null;
                }
                androidx.compose.ui.f.b bVar3 = f.f9881f;
                C0945e.j jVar3 = C0945e.f10284a;
                float f116 = f.f9883h;
                C0945e.i iVarG3 = C0945e.g(f116);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((458752 & i12) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objF = c1086gP.f();
                if (z14) {
                    objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            if (z10) {
                                aVar2.invoke();
                            }
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            if (z10) {
                                aVar2.invoke();
                            }
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                androidx.compose.ui.h hVarD3 = W.d(ClickableKt.c(hVar4, z10, str, (Ia.a) objF, 4), 1.0f);
                float f117 = f.f9876a;
                float f118 = f.f9877b;
                float f119 = f.f9878c;
                androidx.compose.ui.h hVarH3 = PaddingKt.h(W.o(hVarD3, f117, f119, f118, f119), f116, 0.0f, 2);
                T tA3 = S.a(iVarG3, bVar3, c1086gP, 54);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarH3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, tA3);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P7);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar5 = hVar4;
                    if (!i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    }
                    pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, c1086gP, hVarC7);
                    if (qVar2 == null) {
                        c1086gP.L(554788141);
                        z15 = false;
                    } else {
                        c1086gP.L(554788142);
                        float f1110 = f.j;
                        androidx.compose.ui.h hVarK5 = W.k(aVar3, f1110, 0.0f, f1110, f1110, 2);
                        E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i17 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarK5);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar4);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar, c1086gP, eD5);
                        R0.a(pVar2, c1086gP, interfaceC1089h0P8);
                        if (c1086gP.f12995O) {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        } else {
                            J4.i.d(i17, c1086gP, i17, pVar3);
                        }
                        R0.a(pVar4, c1086gP, hVarC8);
                        if (z10) {
                            j = aVar.f9870c;
                        } else {
                            j = aVar.f9872e;
                        }
                        H h13 = new H(j);
                        z15 = false;
                        qVar2.invoke(h13, c1086gP, 0);
                        c1086gP.T(true);
                        r rVar5 = r.f47939a;
                    }
                    c1086gP.T(z15);
                    if (z10) {
                        j10 = aVar.f9869b;
                    } else {
                        j10 = aVar.f9871d;
                    }
                    F f1111 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                    if (1.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f1111, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    qVar3 = qVar2;
                    hVar3 = hVar5;
                } else {
                    hVar5 = hVar4;
                }
                J4.i.d(i16, c1086gP, i16, pVar3);
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC7);
                if (qVar2 == null) {
                    c1086gP.L(554788141);
                    z15 = false;
                } else {
                    c1086gP.L(554788142);
                    float f1112 = f.j;
                    androidx.compose.ui.h hVarK6 = W.k(aVar3, f1112, 0.0f, f1112, f1112, 2);
                    E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarK6);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD6);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P9);
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC9);
                    if (z10) {
                        j = aVar.f9870c;
                    } else {
                        j = aVar.f9872e;
                    }
                    H h14 = new H(j);
                    z15 = false;
                    qVar2.invoke(h14, c1086gP, 0);
                    c1086gP.T(true);
                    r rVar6 = r.f47939a;
                }
                c1086gP.T(z15);
                if (z10) {
                    j10 = aVar.f9869b;
                } else {
                    j10 = aVar.f9871d;
                }
                F f1113 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f1113, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                c1086g = c1086gP;
                c1086g.T(true);
                qVar3 = qVar2;
                hVar3 = hVar5;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar3 = hVar2;
                qVar3 = qVar2;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.b(str, z10, aVar, hVar3, qVar3, aVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        qVar2 = qVar;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(aVar2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((74899 & i12) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            aVar3 = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                hVar4 = aVar3;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                qVar2 = null;
            }
            androidx.compose.ui.f.b bVar4 = f.f9881f;
            C0945e.j jVar4 = C0945e.f10284a;
            float f1114 = f.f9883h;
            C0945e.i iVarG4 = C0945e.g(f1114);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((458752 & i12) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z12 | z13;
            objF = c1086gP.f();
            if (z14) {
                objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        if (z10) {
                            aVar2.invoke();
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        if (z10) {
                            aVar2.invoke();
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.h hVarD4 = W.d(ClickableKt.c(hVar4, z10, str, (Ia.a) objF, 4), 1.0f);
            float f1115 = f.f9876a;
            float f1116 = f.f9877b;
            float f1117 = f.f9878c;
            androidx.compose.ui.h hVarH4 = PaddingKt.h(W.o(hVarD4, f1115, f1117, f1116, f1117), f1114, 0.0f, 2);
            T tA4 = S.a(iVarG4, bVar4, c1086gP, 54);
            i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
            androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarH4);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, tA4);
            pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P10);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                hVar5 = hVar4;
                if (!i.a(c1086gP.f(), Integer.valueOf(i16))) {
                }
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC10);
                if (qVar2 == null) {
                    c1086gP.L(554788141);
                    z15 = false;
                } else {
                    c1086gP.L(554788142);
                    float f1118 = f.j;
                    androidx.compose.ui.h hVarK7 = W.k(aVar3, f1118, 0.0f, f1118, f1118, 2);
                    E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarK7);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, eD7);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P11);
                    if (c1086gP.f12995O) {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    } else {
                        J4.i.d(i17, c1086gP, i17, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC11);
                    if (z10) {
                        j = aVar.f9870c;
                    } else {
                        j = aVar.f9872e;
                    }
                    H h15 = new H(j);
                    z15 = false;
                    qVar2.invoke(h15, c1086gP, 0);
                    c1086gP.T(true);
                    r rVar7 = r.f47939a;
                }
                c1086gP.T(z15);
                if (z10) {
                    j10 = aVar.f9869b;
                } else {
                    j10 = aVar.f9871d;
                }
                F f1119 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
                if (1.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f1119, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
                c1086g = c1086gP;
                c1086g.T(true);
                qVar3 = qVar2;
                hVar3 = hVar5;
            } else {
                hVar5 = hVar4;
            }
            J4.i.d(i16, c1086gP, i16, pVar3);
            pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC10);
            if (qVar2 == null) {
                c1086gP.L(554788141);
                z15 = false;
            } else {
                c1086gP.L(554788142);
                float f11110 = f.j;
                androidx.compose.ui.h hVarK8 = W.k(aVar3, f11110, 0.0f, f11110, f11110, 2);
                E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarK8);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD8);
                R0.a(pVar2, c1086gP, interfaceC1089h0P12);
                if (c1086gP.f12995O) {
                    J4.i.d(i17, c1086gP, i17, pVar3);
                } else {
                    J4.i.d(i17, c1086gP, i17, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC12);
                if (z10) {
                    j = aVar.f9870c;
                } else {
                    j = aVar.f9872e;
                }
                H h16 = new H(j);
                z15 = false;
                qVar2.invoke(h16, c1086gP, 0);
                c1086gP.T(true);
                r rVar8 = r.f47939a;
            }
            c1086gP.T(z15);
            if (z10) {
                j10 = aVar.f9869b;
            } else {
                j10 = aVar.f9871d;
            }
            F f11111 = new F(j10, f.f9885k, f.f9886l, f.f9888n, f.f9882g, f.f9887m, 16613240);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            BasicTextKt.c(str, new LayoutWeightElement(true, l.z(1.0f, Float.MAX_VALUE)), f11111, null, 0, false, 1, 0, null, c1086gP, (i12 & 14) | 1572864, 952);
            c1086g = c1086gP;
            c1086g.T(true);
            qVar3 = qVar2;
            hVar3 = hVar5;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            hVar3 = hVar2;
            qVar3 = qVar2;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuUi_androidKt.b(str, z10, aVar, hVar3, qVar3, aVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void c(final m mVar, final Ia.a<r> aVar, androidx.compose.ui.h hVar, final Ia.l<? super ContextMenuScope, r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        Context context;
        boolean zK;
        Object objF;
        long jD;
        int iK;
        int color;
        ColorStateList colorStateList;
        long jD2;
        int iK2;
        Integer numValueOf;
        long jD3;
        Integer numValueOf2;
        C1086g c1086gP = interfaceC1084f.p(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(mVar) ? 4 : 2) | i10;
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
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c1086gP.k(lVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    zK = c1086gP.K((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)) | c1086gP.K(context);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        a aVar2 = f9867b;
                        jD = aVar2.f9868a;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                        iK = Q3.d.K(jD);
                        color = typedArrayObtainStyledAttributes.getColor(0, iK);
                        typedArrayObtainStyledAttributes.recycle();
                        if (color != iK) {
                            jD = Q3.d.d(color);
                        }
                        long j = jD;
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                        colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                        typedArrayObtainStyledAttributes2.recycle();
                        jD2 = aVar2.f9869b;
                        iK2 = Q3.d.K(jD2);
                        if (colorStateList != null) {
                            numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null && numValueOf.intValue() != iK2) {
                            jD2 = Q3.d.d(numValueOf.intValue());
                        }
                        long j10 = jD2;
                        jD3 = aVar2.f9871d;
                        int iK3 = Q3.d.K(jD3);
                        numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iK3)) : null;
                        if (numValueOf2 != null && numValueOf2.intValue() != iK3) {
                            jD3 = Q3.d.d(numValueOf2.intValue());
                        }
                        long j11 = jD3;
                        objF = new a(j, j10, j10, j11, j11);
                        c1086gP.E(objF);
                    }
                    d(mVar, aVar, hVar3, (a) objF, lVar, c1086gP, (i12 & 1022) | ((i12 << 3) & 57344), 0);
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar4 = hVar3;
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuUi_androidKt.c(mVar, aVar, hVar4, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            hVar2 = hVar;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(lVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                zK = c1086gP.K((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)) | c1086gP.K(context);
                objF = c1086gP.f();
                if (zK) {
                    a aVar3 = f9867b;
                    jD = aVar3.f9868a;
                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                    iK = Q3.d.K(jD);
                    color = typedArrayObtainStyledAttributes3.getColor(0, iK);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (color != iK) {
                        jD = Q3.d.d(color);
                    }
                    long j12 = jD;
                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                    colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(0);
                    typedArrayObtainStyledAttributes4.recycle();
                    jD2 = aVar3.f9869b;
                    iK2 = Q3.d.K(jD2);
                    if (colorStateList != null) {
                        numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        jD2 = Q3.d.d(numValueOf.intValue());
                    }
                    long j13 = jD2;
                    jD3 = aVar3.f9871d;
                    int iK4 = Q3.d.K(jD3);
                    if (colorStateList != null) {
                    }
                    if (numValueOf2 != null) {
                        jD3 = Q3.d.d(numValueOf2.intValue());
                    }
                    long j14 = jD3;
                    objF = new a(j12, j13, j13, j14, j14);
                    c1086gP.E(objF);
                } else {
                    a aVar4 = f9867b;
                    jD = aVar4.f9868a;
                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                    iK = Q3.d.K(jD);
                    color = typedArrayObtainStyledAttributes5.getColor(0, iK);
                    typedArrayObtainStyledAttributes5.recycle();
                    if (color != iK) {
                        jD = Q3.d.d(color);
                    }
                    long j15 = jD;
                    TypedArray typedArrayObtainStyledAttributes6 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                    colorStateList = typedArrayObtainStyledAttributes6.getColorStateList(0);
                    typedArrayObtainStyledAttributes6.recycle();
                    jD2 = aVar4.f9869b;
                    iK2 = Q3.d.K(jD2);
                    if (colorStateList != null) {
                        numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        jD2 = Q3.d.d(numValueOf.intValue());
                    }
                    long j16 = jD2;
                    jD3 = aVar4.f9871d;
                    int iK5 = Q3.d.K(jD3);
                    if (colorStateList != null) {
                    }
                    if (numValueOf2 != null) {
                        jD3 = Q3.d.d(numValueOf2.intValue());
                    }
                    long j17 = jD3;
                    objF = new a(j15, j16, j16, j17, j17);
                    c1086gP.E(objF);
                }
                d(mVar, aVar, hVar3, (a) objF, lVar, c1086gP, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar3;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.c(mVar, aVar, hVar5, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(lVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                zK = c1086gP.K((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)) | c1086gP.K(context);
                objF = c1086gP.f();
                if (zK) {
                    a aVar5 = f9867b;
                    jD = aVar5.f9868a;
                    TypedArray typedArrayObtainStyledAttributes7 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                    iK = Q3.d.K(jD);
                    color = typedArrayObtainStyledAttributes7.getColor(0, iK);
                    typedArrayObtainStyledAttributes7.recycle();
                    if (color != iK) {
                        jD = Q3.d.d(color);
                    }
                    long j18 = jD;
                    TypedArray typedArrayObtainStyledAttributes8 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                    colorStateList = typedArrayObtainStyledAttributes8.getColorStateList(0);
                    typedArrayObtainStyledAttributes8.recycle();
                    jD2 = aVar5.f9869b;
                    iK2 = Q3.d.K(jD2);
                    if (colorStateList != null) {
                        numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        jD2 = Q3.d.d(numValueOf.intValue());
                    }
                    long j19 = jD2;
                    jD3 = aVar5.f9871d;
                    int iK6 = Q3.d.K(jD3);
                    if (colorStateList != null) {
                    }
                    if (numValueOf2 != null) {
                        jD3 = Q3.d.d(numValueOf2.intValue());
                    }
                    long j110 = jD3;
                    objF = new a(j18, j19, j19, j110, j110);
                    c1086gP.E(objF);
                } else {
                    a aVar6 = f9867b;
                    jD = aVar6.f9868a;
                    TypedArray typedArrayObtainStyledAttributes9 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                    iK = Q3.d.K(jD);
                    color = typedArrayObtainStyledAttributes9.getColor(0, iK);
                    typedArrayObtainStyledAttributes9.recycle();
                    if (color != iK) {
                        jD = Q3.d.d(color);
                    }
                    long j111 = jD;
                    TypedArray typedArrayObtainStyledAttributes10 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                    colorStateList = typedArrayObtainStyledAttributes10.getColorStateList(0);
                    typedArrayObtainStyledAttributes10.recycle();
                    jD2 = aVar6.f9869b;
                    iK2 = Q3.d.K(jD2);
                    if (colorStateList != null) {
                        numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        jD2 = Q3.d.d(numValueOf.intValue());
                    }
                    long j112 = jD2;
                    jD3 = aVar6.f9871d;
                    int iK7 = Q3.d.K(jD3);
                    if (colorStateList != null) {
                    }
                    if (numValueOf2 != null) {
                        jD3 = Q3.d.d(numValueOf2.intValue());
                    }
                    long j113 = jD3;
                    objF = new a(j111, j112, j112, j113, j113);
                    c1086gP.E(objF);
                }
                d(mVar, aVar, hVar3, (a) objF, lVar, c1086gP, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar6 = hVar3;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.c(mVar, aVar, hVar6, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(lVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            zK = c1086gP.K((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)) | c1086gP.K(context);
            objF = c1086gP.f();
            if (zK) {
                a aVar7 = f9867b;
                jD = aVar7.f9868a;
                TypedArray typedArrayObtainStyledAttributes11 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                iK = Q3.d.K(jD);
                color = typedArrayObtainStyledAttributes11.getColor(0, iK);
                typedArrayObtainStyledAttributes11.recycle();
                if (color != iK) {
                    jD = Q3.d.d(color);
                }
                long j114 = jD;
                TypedArray typedArrayObtainStyledAttributes12 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                colorStateList = typedArrayObtainStyledAttributes12.getColorStateList(0);
                typedArrayObtainStyledAttributes12.recycle();
                jD2 = aVar7.f9869b;
                iK2 = Q3.d.K(jD2);
                if (colorStateList != null) {
                    numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    jD2 = Q3.d.d(numValueOf.intValue());
                }
                long j115 = jD2;
                jD3 = aVar7.f9871d;
                int iK8 = Q3.d.K(jD3);
                if (colorStateList != null) {
                }
                if (numValueOf2 != null) {
                    jD3 = Q3.d.d(numValueOf2.intValue());
                }
                long j116 = jD3;
                objF = new a(j114, j115, j115, j116, j116);
                c1086gP.E(objF);
            } else {
                a aVar8 = f9867b;
                jD = aVar8.f9868a;
                TypedArray typedArrayObtainStyledAttributes13 = context.obtainStyledAttributes(android.R.style.Widget.PopupMenu, new int[]{android.R.attr.colorBackground});
                iK = Q3.d.K(jD);
                color = typedArrayObtainStyledAttributes13.getColor(0, iK);
                typedArrayObtainStyledAttributes13.recycle();
                if (color != iK) {
                    jD = Q3.d.d(color);
                }
                long j117 = jD;
                TypedArray typedArrayObtainStyledAttributes14 = context.obtainStyledAttributes(android.R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{android.R.attr.textColorPrimary});
                colorStateList = typedArrayObtainStyledAttributes14.getColorStateList(0);
                typedArrayObtainStyledAttributes14.recycle();
                jD2 = aVar8.f9869b;
                iK2 = Q3.d.K(jD2);
                if (colorStateList != null) {
                    numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{android.R.attr.state_enabled}, iK2));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    jD2 = Q3.d.d(numValueOf.intValue());
                }
                long j118 = jD2;
                jD3 = aVar8.f9871d;
                int iK9 = Q3.d.K(jD3);
                if (colorStateList != null) {
                }
                if (numValueOf2 != null) {
                    jD3 = Q3.d.d(numValueOf2.intValue());
                }
                long j119 = jD3;
                objF = new a(j117, j118, j118, j119, j119);
                c1086gP.E(objF);
            }
            d(mVar, aVar, hVar3, (a) objF, lVar, c1086gP, (i12 & 1022) | ((i12 << 3) & 57344), 0);
        } else {
            c1086gP.w();
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar7 = hVar3;
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuUi_androidKt.c(mVar, aVar, hVar7, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void d(final m mVar, final Ia.a<r> aVar, androidx.compose.ui.h hVar, final a aVar2, final Ia.l<? super ContextMenuScope, r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        int i16;
        boolean z10;
        C1105p0 c1105p0V;
        final androidx.compose.ui.h hVar3;
        C1086g c1086gP = interfaceC1084f.p(1447189339);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(mVar) ? 4 : 2) | i10;
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
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c1086gP.K(aVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c1086gP.k(lVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    AndroidPopup_androidKt.a(mVar, aVar, f9866a, androidx.compose.runtime.internal.a.b(795909757, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final a aVar3 = aVar2;
                                androidx.compose.ui.h hVar4 = hVar3;
                                final Ia.l<ContextMenuScope, r> lVar2 = lVar;
                                ContextMenuUi_androidKt.a(aVar3, hVar4, androidx.compose.runtime.internal.a.b(1156688164, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            Object objF = interfaceC1084f5.f();
                                            if (objF == InterfaceC1084f.a.f12980a) {
                                                objF = new ContextMenuScope();
                                                interfaceC1084f5.E(objF);
                                            }
                                            ContextMenuScope contextMenuScope = (ContextMenuScope) objF;
                                            Ia.l<ContextMenuScope, r> lVar3 = lVar2;
                                            a aVar4 = aVar3;
                                            contextMenuScope.f9865a.clear();
                                            lVar3.invoke(contextMenuScope);
                                            contextMenuScope.a(aVar4, interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 3456 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    hVar2 = hVar3;
                } else {
                    c1086gP.w();
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar4 = hVar2;
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuUi_androidKt.d(mVar, aVar, hVar4, aVar2, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            hVar2 = hVar;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.K(aVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(lVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                AndroidPopup_androidKt.a(mVar, aVar, f9866a, androidx.compose.runtime.internal.a.b(795909757, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final a aVar3 = aVar2;
                            androidx.compose.ui.h hVar5 = hVar3;
                            final Ia.l<? super ContextMenuScope, r> lVar2 = lVar;
                            ContextMenuUi_androidKt.a(aVar3, hVar5, androidx.compose.runtime.internal.a.b(1156688164, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        Object objF = interfaceC1084f5.f();
                                        if (objF == InterfaceC1084f.a.f12980a) {
                                            objF = new ContextMenuScope();
                                            interfaceC1084f5.E(objF);
                                        }
                                        ContextMenuScope contextMenuScope = (ContextMenuScope) objF;
                                        Ia.l<ContextMenuScope, r> lVar3 = lVar2;
                                        a aVar4 = aVar3;
                                        contextMenuScope.f9865a.clear();
                                        lVar3.invoke(contextMenuScope);
                                        contextMenuScope.a(aVar4, interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 3456 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar2;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.d(mVar, aVar, hVar5, aVar2, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.K(aVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(lVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                AndroidPopup_androidKt.a(mVar, aVar, f9866a, androidx.compose.runtime.internal.a.b(795909757, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final a aVar3 = aVar2;
                            androidx.compose.ui.h hVar6 = hVar3;
                            final Ia.l<? super ContextMenuScope, r> lVar2 = lVar;
                            ContextMenuUi_androidKt.a(aVar3, hVar6, androidx.compose.runtime.internal.a.b(1156688164, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        Object objF = interfaceC1084f5.f();
                                        if (objF == InterfaceC1084f.a.f12980a) {
                                            objF = new ContextMenuScope();
                                            interfaceC1084f5.E(objF);
                                        }
                                        ContextMenuScope contextMenuScope = (ContextMenuScope) objF;
                                        Ia.l<ContextMenuScope, r> lVar3 = lVar2;
                                        a aVar4 = aVar3;
                                        contextMenuScope.f9865a.clear();
                                        lVar3.invoke(contextMenuScope);
                                        contextMenuScope.a(aVar4, interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 3456 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar6 = hVar2;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuUi_androidKt.d(mVar, aVar, hVar6, aVar2, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.K(aVar2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.k(lVar)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            AndroidPopup_androidKt.a(mVar, aVar, f9866a, androidx.compose.runtime.internal.a.b(795909757, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final a aVar3 = aVar2;
                        androidx.compose.ui.h hVar7 = hVar3;
                        final Ia.l<? super ContextMenuScope, r> lVar2 = lVar;
                        ContextMenuUi_androidKt.a(aVar3, hVar7, androidx.compose.runtime.internal.a.b(1156688164, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objF = interfaceC1084f5.f();
                                    if (objF == InterfaceC1084f.a.f12980a) {
                                        objF = new ContextMenuScope();
                                        interfaceC1084f5.E(objF);
                                    }
                                    ContextMenuScope contextMenuScope = (ContextMenuScope) objF;
                                    Ia.l<ContextMenuScope, r> lVar3 = lVar2;
                                    a aVar4 = aVar3;
                                    contextMenuScope.f9865a.clear();
                                    lVar3.invoke(contextMenuScope);
                                    contextMenuScope.a(aVar4, interfaceC1084f5, 0);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 384, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 14) | 3456 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            hVar2 = hVar3;
        } else {
            c1086gP.w();
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar7 = hVar2;
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuUi_androidKt.d(mVar, aVar, hVar7, aVar2, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
