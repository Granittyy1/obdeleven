package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0917q;
import androidx.compose.animation.core.C0922w;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.material3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1049d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12435b;

    static {
        new C0917q(0.8f, 0.0f, 0.8f, 0.15f);
        float f10 = 4;
        f12434a = f10;
        f12435b = 16 - f10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0112  */
    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0119  */
    /* JADX WARN: Code duplicated, block: B:105:0x0120  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:114:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0141  */
    /* JADX WARN: Code duplicated, block: B:117:0x0143  */
    /* JADX WARN: Code duplicated, block: B:120:0x014a  */
    /* JADX WARN: Code duplicated, block: B:143:0x023b  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    public static final void a(androidx.compose.ui.h hVar, final Ia.p pVar, final androidx.compose.ui.text.F f10, final boolean z10, final Ia.p pVar2, final Ia.q qVar, final float f11, final androidx.compose.foundation.layout.a0 a0Var, final n0 n0Var, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        C1086g c1086g;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-342194911);
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((2 & i11) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.k(pVar) ? 32 : 16;
            }
            if ((4 & i11) != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.K(f10)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i11 & 8) != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c1086gP.c(z10)) {
                            i14 = 2048;
                        } else {
                            i14 = 1024;
                        }
                        i12 |= i14;
                    }
                    if ((16 & i11) != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c1086gP.k(pVar2)) {
                                i15 = 16384;
                            } else {
                                i15 = 8192;
                            }
                            i12 |= i15;
                        }
                        if ((32 & i11) != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.k(qVar)) {
                                i16 = 131072;
                            } else {
                                i16 = 65536;
                            }
                            i12 |= i16;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c1086gP.g(f11)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((128 & i11) != 0) {
                            if ((i10 & 12582912) == 0) {
                                if (c1086gP.K(a0Var)) {
                                    i18 = 8388608;
                                } else {
                                    i18 = 4194304;
                                }
                                i12 |= i18;
                            }
                            if ((256 & i11) != 0) {
                                i12 |= 100663296;
                            } else if ((i10 & 100663296) == 0) {
                                if (c1086gP.K(n0Var)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i12 |= i19;
                            }
                            if ((i11 & 512) != 0) {
                                i12 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                if (c1086gP.K(null)) {
                                    i20 = 536870912;
                                } else {
                                    i20 = 268435456;
                                }
                                i12 |= i20;
                            }
                            if ((306783379 & i12) == 306783378 || !c1086gP.s()) {
                                aVar = androidx.compose.ui.h.a.f13984b;
                                if (i21 != 0) {
                                    hVar3 = aVar;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (!Float.isNaN(f11) || f11 == Float.POSITIVE_INFINITY) {
                                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                                }
                                final float fX = Na.l.x(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f11), 0.0f);
                                int i22 = i12 & 1879048192;
                                boolean zG = (i22 == 536870912) | c1086gP.g(fX);
                                Object objF = c1086gP.f();
                                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                if (zG || objF == c0153a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
                                        final /* synthetic */ p0 $scrollBehavior;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke() {
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    c1086gP.E(objF);
                                }
                                androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                                c1086gP.l((Ia.a) objF);
                                boolean z11 = i22 == 536870912;
                                Object objF2 = c1086gP.f();
                                if (z11 || objF2 == c0153a) {
                                    objF2 = J0.d(new AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1(0));
                                    c1086gP.E(objF2);
                                }
                                float fFloatValue = ((Number) ((N0) objF2).getValue()).floatValue();
                                n0Var.getClass();
                                N0 n0A = androidx.compose.animation.x.a(Q3.d.A(C0922w.f9637c.b(fFloatValue), n0Var.f12651a, n0Var.f12652b), C0907g.c(0.0f, 400.0f, null, 5), null, c1086gP, 48, 12);
                                final ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(1370231018, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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
                                            C0945e.d dVar = C0945e.f10285b;
                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(dVar, bVar, interfaceC1084f3, 54);
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
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                            qVar2.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f3, 6);
                                            interfaceC1084f3.J();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                                c1086gP.L(-1193605157);
                                c1086gP.T(false);
                                c1086g = c1086gP;
                                SurfaceKt.a(hVar3.i(aVar), null, ((androidx.compose.ui.graphics.H) n0A.getValue()).f13506a, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1943739546, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$3
                                    final /* synthetic */ p0 $scrollBehavior;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            androidx.compose.ui.h hVarG = androidx.compose.foundation.layout.W.g(A8.p.s(WindowInsetsPaddingKt.c(androidx.compose.ui.h.a.f13984b, a0Var)), 0.0f, f11, 1);
                                            boolean zK = interfaceC1084f3.K(null);
                                            Object objF3 = interfaceC1084f3.f();
                                            if (zK || objF3 == InterfaceC1084f.a.f12980a) {
                                                objF3 = new C1048c();
                                                interfaceC1084f3.E(objF3);
                                            }
                                            Y y10 = (Y) objF3;
                                            n0 n0Var2 = n0Var;
                                            long j = n0Var2.f12653c;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar3 = pVar;
                                            androidx.compose.ui.text.F f12 = f10;
                                            C0945e.c cVar = C0945e.f10288e;
                                            C1049d.c(hVarG, y10, j, n0Var2.f12654d, n0Var2.f12655e, pVar3, f12, 1.0f, cVar, z10 ? cVar : C0945e.f10284a, 0, false, pVar2, composableLambdaImplB, interfaceC1084f3, 113246208, 3126);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086g), c1086g, 12582912, R.styleable.AppCompatTheme_windowFixedWidthMajor);
                                hVar4 = hVar3;
                            } else {
                                c1086gP.w();
                                c1086g = c1086gP;
                                hVar4 = hVar2;
                            }
                            c1105p0V = c1086g.V();
                            if (c1105p0V != null) {
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                    final /* synthetic */ p0 $scrollBehavior;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i12 |= 12582912;
                        if ((256 & i11) != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(n0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(null)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((306783379 & i12) == 306783378) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (Float.isNaN(f11)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    if ((32 & i11) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.g(f11)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((128 & i11) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(a0Var)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                        if ((256 & i11) != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(n0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(null)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((306783379 & i12) == 306783378) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (Float.isNaN(f11)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                if ((16 & i11) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((32 & i11) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.g(f11)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((128 & i11) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(a0Var)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                        if ((256 & i11) != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(n0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(null)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((306783379 & i12) == 306783378) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (Float.isNaN(f11)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((16 & i11) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((32 & i11) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.g(f11)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((128 & i11) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(a0Var)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                        if ((256 & i11) != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(n0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(null)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((306783379 & i12) == 306783378) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (Float.isNaN(f11)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((16 & i11) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((32 & i11) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.g(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((128 & i11) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(a0Var)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((256 & i11) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(n0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(null)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((306783379 & i12) == 306783378) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        if ((4 & i11) != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.K(f10)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((16 & i11) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    if ((32 & i11) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.g(f11)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((128 & i11) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(a0Var)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                        if ((256 & i11) != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(n0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(null)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((306783379 & i12) == 306783378) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (Float.isNaN(f11)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 12582912;
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((16 & i11) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((32 & i11) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.g(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((128 & i11) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(a0Var)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((256 & i11) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(n0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(null)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((306783379 & i12) == 306783378) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i11 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                if (c1086gP.c(z10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((16 & i11) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((32 & i11) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((128 & i11) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(a0Var)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((256 & i11) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(n0Var)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(null)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((306783379 & i12) == 306783378) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (Float.isNaN(f11)) {
                        }
                        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    }
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 12582912;
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((32 & i11) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.g(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((128 & i11) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(a0Var)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((256 & i11) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(n0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(null)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((306783379 & i12) == 306783378) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        if ((16 & i11) != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.k(pVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((32 & i11) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.g(f11)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((128 & i11) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(a0Var)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((256 & i11) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(n0Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i12 |= i19;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(null)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((306783379 & i12) == 306783378) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (Float.isNaN(f11)) {
                    }
                    throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                }
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 12582912;
            if ((256 & i11) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(n0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(null)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((306783379 & i12) == 306783378) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        if ((32 & i11) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(qVar)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.g(f11)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((128 & i11) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c1086gP.K(a0Var)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((256 & i11) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(n0Var)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(null)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((306783379 & i12) == 306783378) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (Float.isNaN(f11)) {
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 12582912;
        if ((256 & i11) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(n0Var)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i12 |= i19;
        }
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.K(null)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i12 |= i20;
        }
        if ((306783379 & i12) == 306783378) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (Float.isNaN(f11)) {
            }
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
        }
        aVar = androidx.compose.ui.h.a.f13984b;
        if (i21 != 0) {
            hVar3 = aVar;
        } else {
            hVar3 = hVar2;
        }
        if (Float.isNaN(f11)) {
        }
        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
                final /* synthetic */ p0 $scrollBehavior;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    C1049d.a(hVar4, pVar, f10, z10, pVar2, qVar, f11, a0Var, n0Var, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0196  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    public static final void b(final Ia.p pVar, androidx.compose.ui.h hVar, Ia.p pVar2, Ia.q qVar, float f10, androidx.compose.foundation.layout.a0 a0Var, n0 n0Var, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        Ia.p pVar3;
        int i14;
        int i15;
        Ia.q qVar2;
        int i16;
        int i17;
        float f11;
        int i18;
        n0 n0Var2;
        int i19;
        androidx.compose.foundation.layout.a0 j;
        n0 n0VarA;
        androidx.compose.foundation.layout.a0 a0Var2;
        Ia.p pVar4;
        Ia.q qVar3;
        float f12;
        n0 n0Var3;
        androidx.compose.ui.h hVar3;
        int i20;
        float f13;
        n0 n0Var4;
        final Ia.p pVar5;
        androidx.compose.foundation.layout.a0 a0Var3;
        final Ia.q qVar4;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        int i21;
        int i22;
        C1086g c1086gP = interfaceC1084f.p(226148675);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = 2 & i11;
        if (i23 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    pVar3 = pVar2;
                    if (c1086gP.k(pVar3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        qVar2 = qVar;
                        if (c1086gP.k(qVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            f11 = f10;
                            if (c1086gP.g(f11)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 196608) != 0) {
                            if ((i11 & 32) == 0 || !c1086gP.K(a0Var)) {
                                i22 = 65536;
                            } else {
                                i22 = 131072;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 1572864) == 0) {
                            n0Var2 = n0Var;
                            if ((i11 & 64) == 0 || !c1086gP.K(n0Var2)) {
                                i21 = 524288;
                            } else {
                                i21 = 1048576;
                            }
                            i12 |= i21;
                        } else {
                            n0Var2 = n0Var;
                        }
                        if ((128 & i11) != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(null)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i12 |= i19;
                        }
                        if ((4793491 & i12) == 4793490 || !c1086gP.s()) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i23 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i13 != 0) {
                                    pVar3 = ComposableSingletons$AppBarKt.f12091a;
                                }
                                if (i15 != 0) {
                                    qVar2 = ComposableSingletons$AppBarKt.f12092b;
                                }
                                if (i17 != 0) {
                                    f11 = o0.f12663a;
                                }
                                if ((32 & i11) != 0) {
                                    float f14 = o0.f12663a;
                                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap = androidx.compose.foundation.layout.c0.f10254v;
                                    j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                    i12 &= -458753;
                                } else {
                                    j = a0Var;
                                }
                                if ((i11 & 64) != 0) {
                                    float f15 = o0.f12663a;
                                    n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                    i12 = (-3670017) & i12;
                                } else {
                                    n0VarA = n0Var2;
                                }
                                a0Var2 = j;
                                pVar4 = pVar3;
                                qVar3 = qVar2;
                                f12 = f11;
                                int i24 = i12;
                                n0Var3 = n0VarA;
                                hVar3 = hVar2;
                                i20 = i24;
                            } else {
                                c1086gP.w();
                                if ((32 & i11) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                hVar3 = hVar2;
                                pVar4 = pVar3;
                                qVar3 = qVar2;
                                f12 = f11;
                                i20 = i12;
                                n0Var3 = n0Var2;
                                a0Var2 = a0Var;
                            }
                            c1086gP.U();
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.B.f1072c, c1086gP);
                            if (!p013b0.f.a(f12, Float.NaN) || p013b0.f.a(f12, Float.POSITIVE_INFINITY)) {
                                f13 = o0.f12663a;
                            } else {
                                f13 = f12;
                            }
                            int i25 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            int i26 = i20 << 6;
                            a(hVar3, pVar, fA, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i25 | (57344 & i26) | (458752 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 0);
                            f11 = f12;
                            n0Var4 = n0Var3;
                            pVar5 = pVar4;
                            a0Var3 = a0Var2;
                            qVar4 = qVar3;
                            hVar4 = hVar3;
                        } else {
                            c1086gP.w();
                            a0Var3 = a0Var;
                            hVar4 = hVar2;
                            pVar5 = pVar3;
                            n0Var4 = n0Var2;
                            qVar4 = qVar2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final float f16 = f11;
                            final androidx.compose.foundation.layout.a0 a0Var4 = a0Var3;
                            final n0 n0Var5 = n0Var4;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                                final /* synthetic */ p0 $scrollBehavior;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    C1049d.b(pVar, hVar4, pVar5, qVar4, f16, a0Var4, n0Var5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    f11 = f10;
                    if ((i10 & 196608) != 0) {
                        if ((i11 & 32) == 0) {
                            i22 = 65536;
                        } else {
                            i22 = 65536;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 1572864) == 0) {
                        n0Var2 = n0Var;
                        if ((i11 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    } else {
                        n0Var2 = n0Var;
                    }
                    if ((128 & i11) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(null)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((4793491 & i12) == 4793490) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f17 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap2 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f18 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i27 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i27;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f19 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap3 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f110 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i28 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i28;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA2 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i29 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i210 = i20 << 6;
                        a(hVar3, pVar, fA2, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i29 | (57344 & i210) | (458752 & i210) | (29360128 & i210) | (234881024 & i210) | (i210 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap4 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f112 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i211 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i211;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f113 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap5 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f114 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i212 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i212;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA3 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i213 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i214 = i20 << 6;
                        a(hVar3, pVar, fA3, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i213 | (57344 & i214) | (458752 & i214) | (29360128 & i214) | (234881024 & i214) | (i214 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final float f115 = f11;
                        final androidx.compose.foundation.layout.a0 a0Var5 = a0Var3;
                        final n0 n0Var6 = n0Var4;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.b(pVar, hVar4, pVar5, qVar4, f115, a0Var5, n0Var6, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                qVar2 = qVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 196608) != 0) {
                        if ((i11 & 32) == 0) {
                            i22 = 65536;
                        } else {
                            i22 = 65536;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 1572864) == 0) {
                        n0Var2 = n0Var;
                        if ((i11 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    } else {
                        n0Var2 = n0Var;
                    }
                    if ((128 & i11) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(null)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((4793491 & i12) == 4793490) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f116 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap6 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f117 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i215 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i215;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f118 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap7 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f119 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i216 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i216;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA4 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i217 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i218 = i20 << 6;
                        a(hVar3, pVar, fA4, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i217 | (57344 & i218) | (458752 & i218) | (29360128 & i218) | (234881024 & i218) | (i218 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f1110 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap8 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f1111 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i219 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i219;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f1112 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap9 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f1113 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i2110 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i2110;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA5 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i2111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i2112 = i20 << 6;
                        a(hVar3, pVar, fA5, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111 | (57344 & i2112) | (458752 & i2112) | (29360128 & i2112) | (234881024 & i2112) | (i2112 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final float f1114 = f11;
                        final androidx.compose.foundation.layout.a0 a0Var6 = a0Var3;
                        final n0 n0Var7 = n0Var4;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.b(pVar, hVar4, pVar5, qVar4, f1114, a0Var6, n0Var7, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                f11 = f10;
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1115 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap10 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1116 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2113 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2113;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1117 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1118 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2114 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2114;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA6 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i2115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i2116 = i20 << 6;
                    a(hVar3, pVar, fA6, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2115 | (57344 & i2116) | (458752 & i2116) | (29360128 & i2116) | (234881024 & i2116) | (i2116 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1119 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap12 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f11110 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2117 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2117;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f11111 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap13 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f11112 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2118 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2118;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA7 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i2119 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i21110 = i20 << 6;
                    a(hVar3, pVar, fA7, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2119 | (57344 & i21110) | (458752 & i21110) | (29360128 & i21110) | (234881024 & i21110) | (i21110 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f11113 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var7 = a0Var3;
                    final n0 n0Var8 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f11113, a0Var7, n0Var8, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            pVar3 = pVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    qVar2 = qVar;
                    if (c1086gP.k(qVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 196608) != 0) {
                        if ((i11 & 32) == 0) {
                            i22 = 65536;
                        } else {
                            i22 = 65536;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 1572864) == 0) {
                        n0Var2 = n0Var;
                        if ((i11 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    } else {
                        n0Var2 = n0Var;
                    }
                    if ((128 & i11) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(null)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((4793491 & i12) == 4793490) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f11114 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap14 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f11115 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21111 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21111;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f11116 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap15 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f11117 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21112 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21112;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA8 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i21113 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i21114 = i20 << 6;
                        a(hVar3, pVar, fA8, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21113 | (57344 & i21114) | (458752 & i21114) | (29360128 & i21114) | (234881024 & i21114) | (i21114 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f11118 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap16 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f11119 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21115 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21115;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111110 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap17 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f111111 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21116 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21116;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA9 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i21117 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i21118 = i20 << 6;
                        a(hVar3, pVar, fA9, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21117 | (57344 & i21118) | (458752 & i21118) | (29360128 & i21118) | (234881024 & i21118) | (i21118 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final float f111112 = f11;
                        final androidx.compose.foundation.layout.a0 a0Var8 = a0Var3;
                        final n0 n0Var9 = n0Var4;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.b(pVar, hVar4, pVar5, qVar4, f111112, a0Var8, n0Var9, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                f11 = f10;
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111113 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap18 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f111114 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i21119 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i21119;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111115 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap19 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f111116 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211110 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211110;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA10 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i211112 = i20 << 6;
                    a(hVar3, pVar, fA10, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111 | (57344 & i211112) | (458752 & i211112) | (29360128 & i211112) | (234881024 & i211112) | (i211112 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111117 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap110 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f111118 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211113 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211113;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111119 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111110 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211114 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211114;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA11 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i211116 = i20 << 6;
                    a(hVar3, pVar, fA11, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211115 | (57344 & i211116) | (458752 & i211116) | (29360128 & i211116) | (234881024 & i211116) | (i211116 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f1111111 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var9 = a0Var3;
                    final n0 n0Var10 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f1111111, a0Var9, n0Var10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            qVar2 = qVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111112 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap112 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111113 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211117 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211117;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111114 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap113 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111115 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211118 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211118;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA12 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211119 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i2111110 = i20 << 6;
                    a(hVar3, pVar, fA12, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211119 | (57344 & i2111110) | (458752 & i2111110) | (29360128 & i2111110) | (234881024 & i2111110) | (i2111110 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111116 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap114 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111117 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2111111 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2111111;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111118 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap115 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111119 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2111112 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2111112;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA13 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i2111113 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i2111114 = i20 << 6;
                    a(hVar3, pVar, fA13, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111113 | (57344 & i2111114) | (458752 & i2111114) | (29360128 & i2111114) | (234881024 & i2111114) | (i2111114 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f11111110 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var10 = a0Var3;
                    final n0 n0Var11 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f11111110, a0Var10, n0Var11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            f11 = f10;
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i12 |= i22;
            }
            if ((i10 & 1572864) == 0) {
                n0Var2 = n0Var;
                if ((i11 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            } else {
                n0Var2 = n0Var;
            }
            if ((128 & i11) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(null)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap116 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111112 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111115 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111115;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111113 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap117 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111114 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111116 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111116;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA14 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i2111117 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i2111118 = i20 << 6;
                a(hVar3, pVar, fA14, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111117 | (57344 & i2111118) | (458752 & i2111118) | (29360128 & i2111118) | (234881024 & i2111118) | (i2111118 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111115 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap118 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111116 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111119 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111119;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111117 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap119 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111118 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i21111110 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i21111110;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA15 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i21111111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i21111112 = i20 << 6;
                a(hVar3, pVar, fA15, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111111 | (57344 & i21111112) | (458752 & i21111112) | (29360128 & i21111112) | (234881024 & i21111112) | (i21111112 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f11111119 = f11;
                final androidx.compose.foundation.layout.a0 a0Var11 = a0Var3;
                final n0 n0Var12 = n0Var4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.b(pVar, hVar4, pVar5, qVar4, f11111119, a0Var11, n0Var12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                pVar3 = pVar2;
                if (c1086gP.k(pVar3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    qVar2 = qVar;
                    if (c1086gP.k(qVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 196608) != 0) {
                        if ((i11 & 32) == 0) {
                            i22 = 65536;
                        } else {
                            i22 = 65536;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 1572864) == 0) {
                        n0Var2 = n0Var;
                        if ((i11 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    } else {
                        n0Var2 = n0Var;
                    }
                    if ((128 & i11) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(null)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                    if ((4793491 & i12) == 4793490) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111111110 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1110 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f111111111 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21111113 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21111113;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111111112 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f111111113 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21111114 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21111114;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA16 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i21111115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i21111116 = i20 << 6;
                        a(hVar3, pVar, fA16, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111115 | (57344 & i21111116) | (458752 & i21111116) | (29360128 & i21111116) | (234881024 & i21111116) | (i21111116 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111111114 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1112 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f111111115 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21111117 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21111117;
                        } else {
                            if (i23 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                pVar3 = ComposableSingletons$AppBarKt.f12091a;
                            }
                            if (i15 != 0) {
                                qVar2 = ComposableSingletons$AppBarKt.f12092b;
                            }
                            if (i17 != 0) {
                                f11 = o0.f12663a;
                            }
                            if ((32 & i11) != 0) {
                                float f111111116 = o0.f12663a;
                                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1113 = androidx.compose.foundation.layout.c0.f10254v;
                                j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                                i12 &= -458753;
                            } else {
                                j = a0Var;
                            }
                            if ((i11 & 64) != 0) {
                                float f111111117 = o0.f12663a;
                                n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                                i12 = (-3670017) & i12;
                            } else {
                                n0VarA = n0Var2;
                            }
                            a0Var2 = j;
                            pVar4 = pVar3;
                            qVar3 = qVar2;
                            f12 = f11;
                            int i21111118 = i12;
                            n0Var3 = n0VarA;
                            hVar3 = hVar2;
                            i20 = i21111118;
                        }
                        c1086gP.U();
                        androidx.compose.ui.text.F fA17 = TypographyKt.a(B.B.f1072c, c1086gP);
                        if (p013b0.f.a(f12, Float.NaN)) {
                            f13 = o0.f12663a;
                        } else {
                            f13 = o0.f12663a;
                        }
                        int i21111119 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                        int i211111110 = i20 << 6;
                        a(hVar3, pVar, fA17, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111119 | (57344 & i211111110) | (458752 & i211111110) | (29360128 & i211111110) | (234881024 & i211111110) | (i211111110 & 1879048192), 0);
                        f11 = f12;
                        n0Var4 = n0Var3;
                        pVar5 = pVar4;
                        a0Var3 = a0Var2;
                        qVar4 = qVar3;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final float f111111118 = f11;
                        final androidx.compose.foundation.layout.a0 a0Var12 = a0Var3;
                        final n0 n0Var13 = n0Var4;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                            final /* synthetic */ p0 $scrollBehavior;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                C1049d.b(pVar, hVar4, pVar5, qVar4, f111111118, a0Var12, n0Var13, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                f11 = f10;
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111111119 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1114 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111110 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111111 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111111;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111111 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1115 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111112 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111112 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111112;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA18 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211111113 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i211111114 = i20 << 6;
                    a(hVar3, pVar, fA18, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111113 | (57344 & i211111114) | (458752 & i211111114) | (29360128 & i211111114) | (234881024 & i211111114) | (i211111114 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111113 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1116 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111114 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111115 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111115;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111115 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1117 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111116 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111116 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111116;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA19 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211111117 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i211111118 = i20 << 6;
                    a(hVar3, pVar, fA19, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111117 | (57344 & i211111118) | (458752 & i211111118) | (29360128 & i211111118) | (234881024 & i211111118) | (i211111118 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f1111111117 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var13 = a0Var3;
                    final n0 n0Var14 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f1111111117, a0Var13, n0Var14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            qVar2 = qVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111118 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1118 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111119 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111119 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111119;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f11111111110 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1119 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f11111111111 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2111111110 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2111111110;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA110 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i2111111111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i2111111112 = i20 << 6;
                    a(hVar3, pVar, fA110, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111111111 | (57344 & i2111111112) | (458752 & i2111111112) | (29360128 & i2111111112) | (234881024 & i2111111112) | (i2111111112 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f11111111112 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11110 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f11111111113 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2111111113 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2111111113;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f11111111114 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11111 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f11111111115 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i2111111114 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i2111111114;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA111 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i2111111115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i2111111116 = i20 << 6;
                    a(hVar3, pVar, fA111, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111111115 | (57344 & i2111111116) | (458752 & i2111111116) | (29360128 & i2111111116) | (234881024 & i2111111116) | (i2111111116 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f11111111116 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var14 = a0Var3;
                    final n0 n0Var15 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f11111111116, a0Var14, n0Var15, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            f11 = f10;
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i12 |= i22;
            }
            if ((i10 & 1572864) == 0) {
                n0Var2 = n0Var;
                if ((i11 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            } else {
                n0Var2 = n0Var;
            }
            if ((128 & i11) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(null)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111117 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11112 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111118 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111117 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111117;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111119 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11113 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f111111111110 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111118 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111118;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA112 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i2111111119 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i21111111110 = i20 << 6;
                a(hVar3, pVar, fA112, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111111119 | (57344 & i21111111110) | (458752 & i21111111110) | (29360128 & i21111111110) | (234881024 & i21111111110) | (i21111111110 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f111111111111 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11114 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f111111111112 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i21111111111 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i21111111111;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f111111111113 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11115 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f111111111114 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i21111111112 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i21111111112;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA113 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i21111111113 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i21111111114 = i20 << 6;
                a(hVar3, pVar, fA113, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111111113 | (57344 & i21111111114) | (458752 & i21111111114) | (29360128 & i21111111114) | (234881024 & i21111111114) | (i21111111114 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f111111111115 = f11;
                final androidx.compose.foundation.layout.a0 a0Var15 = a0Var3;
                final n0 n0Var16 = n0Var4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.b(pVar, hVar4, pVar5, qVar4, f111111111115, a0Var15, n0Var16, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        pVar3 = pVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                qVar2 = qVar;
                if (c1086gP.k(qVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 196608) != 0) {
                    if ((i11 & 32) == 0) {
                        i22 = 65536;
                    } else {
                        i22 = 65536;
                    }
                    i12 |= i22;
                }
                if ((i10 & 1572864) == 0) {
                    n0Var2 = n0Var;
                    if ((i11 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                } else {
                    n0Var2 = n0Var;
                }
                if ((128 & i11) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(null)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((4793491 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111111111116 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11116 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f111111111117 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i21111111115 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i21111111115;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f111111111118 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11117 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f111111111119 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i21111111116 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i21111111116;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA114 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i21111111117 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i21111111118 = i20 << 6;
                    a(hVar3, pVar, fA114, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111111117 | (57344 & i21111111118) | (458752 & i21111111118) | (29360128 & i21111111118) | (234881024 & i21111111118) | (i21111111118 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111111110 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11118 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111111111 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i21111111119 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i21111111119;
                    } else {
                        if (i23 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            pVar3 = ComposableSingletons$AppBarKt.f12091a;
                        }
                        if (i15 != 0) {
                            qVar2 = ComposableSingletons$AppBarKt.f12092b;
                        }
                        if (i17 != 0) {
                            f11 = o0.f12663a;
                        }
                        if ((32 & i11) != 0) {
                            float f1111111111112 = o0.f12663a;
                            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11119 = androidx.compose.foundation.layout.c0.f10254v;
                            j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                            i12 &= -458753;
                        } else {
                            j = a0Var;
                        }
                        if ((i11 & 64) != 0) {
                            float f1111111111113 = o0.f12663a;
                            n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                            i12 = (-3670017) & i12;
                        } else {
                            n0VarA = n0Var2;
                        }
                        a0Var2 = j;
                        pVar4 = pVar3;
                        qVar3 = qVar2;
                        f12 = f11;
                        int i211111111110 = i12;
                        n0Var3 = n0VarA;
                        hVar3 = hVar2;
                        i20 = i211111111110;
                    }
                    c1086gP.U();
                    androidx.compose.ui.text.F fA115 = TypographyKt.a(B.B.f1072c, c1086gP);
                    if (p013b0.f.a(f12, Float.NaN)) {
                        f13 = o0.f12663a;
                    } else {
                        f13 = o0.f12663a;
                    }
                    int i211111111111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                    int i211111111112 = i20 << 6;
                    a(hVar3, pVar, fA115, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111111111 | (57344 & i211111111112) | (458752 & i211111111112) | (29360128 & i211111111112) | (234881024 & i211111111112) | (i211111111112 & 1879048192), 0);
                    f11 = f12;
                    n0Var4 = n0Var3;
                    pVar5 = pVar4;
                    a0Var3 = a0Var2;
                    qVar4 = qVar3;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f1111111111114 = f11;
                    final androidx.compose.foundation.layout.a0 a0Var16 = a0Var3;
                    final n0 n0Var17 = n0Var4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                        final /* synthetic */ p0 $scrollBehavior;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            C1049d.b(pVar, hVar4, pVar5, qVar4, f1111111111114, a0Var16, n0Var17, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            f11 = f10;
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i12 |= i22;
            }
            if ((i10 & 1572864) == 0) {
                n0Var2 = n0Var;
                if ((i11 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            } else {
                n0Var2 = n0Var;
            }
            if ((128 & i11) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(null)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f1111111111115 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111110 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f1111111111116 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i211111111113 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i211111111113;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f1111111111117 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111111 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f1111111111118 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i211111111114 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i211111111114;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA116 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i211111111115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i211111111116 = i20 << 6;
                a(hVar3, pVar, fA116, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111111115 | (57344 & i211111111116) | (458752 & i211111111116) | (29360128 & i211111111116) | (234881024 & i211111111116) | (i211111111116 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f1111111111119 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111112 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111111110 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i211111111117 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i211111111117;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111111111 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111113 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111111112 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i211111111118 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i211111111118;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA117 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i211111111119 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i2111111111110 = i20 << 6;
                a(hVar3, pVar, fA117, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i211111111119 | (57344 & i2111111111110) | (458752 & i2111111111110) | (29360128 & i2111111111110) | (234881024 & i2111111111110) | (i2111111111110 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f11111111111113 = f11;
                final androidx.compose.foundation.layout.a0 a0Var17 = a0Var3;
                final n0 n0Var18 = n0Var4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.b(pVar, hVar4, pVar5, qVar4, f11111111111113, a0Var17, n0Var18, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        qVar2 = qVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i10 & 196608) != 0) {
                if ((i11 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i12 |= i22;
            }
            if ((i10 & 1572864) == 0) {
                n0Var2 = n0Var;
                if ((i11 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            } else {
                n0Var2 = n0Var;
            }
            if ((128 & i11) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(null)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((4793491 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111111114 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111114 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111111115 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111111111 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111111111;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111111116 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111115 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111111117 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111111112 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111111112;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA118 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i2111111111113 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i2111111111114 = i20 << 6;
                a(hVar3, pVar, fA118, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111111111113 | (57344 & i2111111111114) | (458752 & i2111111111114) | (29360128 & i2111111111114) | (234881024 & i2111111111114) | (i2111111111114 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f11111111111118 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111116 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f11111111111119 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111111115 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111111115;
                } else {
                    if (i23 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        pVar3 = ComposableSingletons$AppBarKt.f12091a;
                    }
                    if (i15 != 0) {
                        qVar2 = ComposableSingletons$AppBarKt.f12092b;
                    }
                    if (i17 != 0) {
                        f11 = o0.f12663a;
                    }
                    if ((32 & i11) != 0) {
                        float f111111111111110 = o0.f12663a;
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111117 = androidx.compose.foundation.layout.c0.f10254v;
                        j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                        i12 &= -458753;
                    } else {
                        j = a0Var;
                    }
                    if ((i11 & 64) != 0) {
                        float f111111111111111 = o0.f12663a;
                        n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                        i12 = (-3670017) & i12;
                    } else {
                        n0VarA = n0Var2;
                    }
                    a0Var2 = j;
                    pVar4 = pVar3;
                    qVar3 = qVar2;
                    f12 = f11;
                    int i2111111111116 = i12;
                    n0Var3 = n0VarA;
                    hVar3 = hVar2;
                    i20 = i2111111111116;
                }
                c1086gP.U();
                androidx.compose.ui.text.F fA119 = TypographyKt.a(B.B.f1072c, c1086gP);
                if (p013b0.f.a(f12, Float.NaN)) {
                    f13 = o0.f12663a;
                } else {
                    f13 = o0.f12663a;
                }
                int i2111111111117 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                int i2111111111118 = i20 << 6;
                a(hVar3, pVar, fA119, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i2111111111117 | (57344 & i2111111111118) | (458752 & i2111111111118) | (29360128 & i2111111111118) | (234881024 & i2111111111118) | (i2111111111118 & 1879048192), 0);
                f11 = f12;
                n0Var4 = n0Var3;
                pVar5 = pVar4;
                a0Var3 = a0Var2;
                qVar4 = qVar3;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f111111111111112 = f11;
                final androidx.compose.foundation.layout.a0 a0Var18 = a0Var3;
                final n0 n0Var19 = n0Var4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                    final /* synthetic */ p0 $scrollBehavior;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        C1049d.b(pVar, hVar4, pVar5, qVar4, f111111111111112, a0Var18, n0Var19, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        f11 = f10;
        if ((i10 & 196608) != 0) {
            if ((i11 & 32) == 0) {
                i22 = 65536;
            } else {
                i22 = 65536;
            }
            i12 |= i22;
        }
        if ((i10 & 1572864) == 0) {
            n0Var2 = n0Var;
            if ((i11 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i12 |= i21;
        } else {
            n0Var2 = n0Var;
        }
        if ((128 & i11) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(null)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((4793491 & i12) == 4793490) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    pVar3 = ComposableSingletons$AppBarKt.f12091a;
                }
                if (i15 != 0) {
                    qVar2 = ComposableSingletons$AppBarKt.f12092b;
                }
                if (i17 != 0) {
                    f11 = o0.f12663a;
                }
                if ((32 & i11) != 0) {
                    float f111111111111113 = o0.f12663a;
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111118 = androidx.compose.foundation.layout.c0.f10254v;
                    j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                    i12 &= -458753;
                } else {
                    j = a0Var;
                }
                if ((i11 & 64) != 0) {
                    float f111111111111114 = o0.f12663a;
                    n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 = (-3670017) & i12;
                } else {
                    n0VarA = n0Var2;
                }
                a0Var2 = j;
                pVar4 = pVar3;
                qVar3 = qVar2;
                f12 = f11;
                int i2111111111119 = i12;
                n0Var3 = n0VarA;
                hVar3 = hVar2;
                i20 = i2111111111119;
            } else {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    pVar3 = ComposableSingletons$AppBarKt.f12091a;
                }
                if (i15 != 0) {
                    qVar2 = ComposableSingletons$AppBarKt.f12092b;
                }
                if (i17 != 0) {
                    f11 = o0.f12663a;
                }
                if ((32 & i11) != 0) {
                    float f111111111111115 = o0.f12663a;
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap111119 = androidx.compose.foundation.layout.c0.f10254v;
                    j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                    i12 &= -458753;
                } else {
                    j = a0Var;
                }
                if ((i11 & 64) != 0) {
                    float f111111111111116 = o0.f12663a;
                    n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 = (-3670017) & i12;
                } else {
                    n0VarA = n0Var2;
                }
                a0Var2 = j;
                pVar4 = pVar3;
                qVar3 = qVar2;
                f12 = f11;
                int i21111111111110 = i12;
                n0Var3 = n0VarA;
                hVar3 = hVar2;
                i20 = i21111111111110;
            }
            c1086gP.U();
            androidx.compose.ui.text.F fA1110 = TypographyKt.a(B.B.f1072c, c1086gP);
            if (p013b0.f.a(f12, Float.NaN)) {
                f13 = o0.f12663a;
            } else {
                f13 = o0.f12663a;
            }
            int i21111111111111 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            int i21111111111112 = i20 << 6;
            a(hVar3, pVar, fA1110, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111111111111 | (57344 & i21111111111112) | (458752 & i21111111111112) | (29360128 & i21111111111112) | (234881024 & i21111111111112) | (i21111111111112 & 1879048192), 0);
            f11 = f12;
            n0Var4 = n0Var3;
            pVar5 = pVar4;
            a0Var3 = a0Var2;
            qVar4 = qVar3;
            hVar4 = hVar3;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    pVar3 = ComposableSingletons$AppBarKt.f12091a;
                }
                if (i15 != 0) {
                    qVar2 = ComposableSingletons$AppBarKt.f12092b;
                }
                if (i17 != 0) {
                    f11 = o0.f12663a;
                }
                if ((32 & i11) != 0) {
                    float f111111111111117 = o0.f12663a;
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111110 = androidx.compose.foundation.layout.c0.f10254v;
                    j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                    i12 &= -458753;
                } else {
                    j = a0Var;
                }
                if ((i11 & 64) != 0) {
                    float f111111111111118 = o0.f12663a;
                    n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 = (-3670017) & i12;
                } else {
                    n0VarA = n0Var2;
                }
                a0Var2 = j;
                pVar4 = pVar3;
                qVar3 = qVar2;
                f12 = f11;
                int i21111111111113 = i12;
                n0Var3 = n0VarA;
                hVar3 = hVar2;
                i20 = i21111111111113;
            } else {
                if (i23 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    pVar3 = ComposableSingletons$AppBarKt.f12091a;
                }
                if (i15 != 0) {
                    qVar2 = ComposableSingletons$AppBarKt.f12092b;
                }
                if (i17 != 0) {
                    f11 = o0.f12663a;
                }
                if ((32 & i11) != 0) {
                    float f111111111111119 = o0.f12663a;
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap1111111 = androidx.compose.foundation.layout.c0.f10254v;
                    j = new androidx.compose.foundation.layout.J(androidx.compose.foundation.layout.c0.a.c(c1086gP).f10261g, androidx.compose.foundation.layout.d0.f10283e | 16);
                    i12 &= -458753;
                } else {
                    j = a0Var;
                }
                if ((i11 & 64) != 0) {
                    float f1111111111111110 = o0.f12663a;
                    n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
                    i12 = (-3670017) & i12;
                } else {
                    n0VarA = n0Var2;
                }
                a0Var2 = j;
                pVar4 = pVar3;
                qVar3 = qVar2;
                f12 = f11;
                int i21111111111114 = i12;
                n0Var3 = n0VarA;
                hVar3 = hVar2;
                i20 = i21111111111114;
            }
            c1086gP.U();
            androidx.compose.ui.text.F fA1111 = TypographyKt.a(B.B.f1072c, c1086gP);
            if (p013b0.f.a(f12, Float.NaN)) {
                f13 = o0.f12663a;
            } else {
                f13 = o0.f12663a;
            }
            int i21111111111115 = ((i20 >> 3) & 14) | 3072 | ((i20 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            int i21111111111116 = i20 << 6;
            a(hVar3, pVar, fA1111, false, pVar4, qVar3, f13, a0Var2, n0Var3, c1086gP, i21111111111115 | (57344 & i21111111111116) | (458752 & i21111111111116) | (29360128 & i21111111111116) | (234881024 & i21111111111116) | (i21111111111116 & 1879048192), 0);
            f11 = f12;
            n0Var4 = n0Var3;
            pVar5 = pVar4;
            a0Var3 = a0Var2;
            qVar4 = qVar3;
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f1111111111111111 = f11;
            final androidx.compose.foundation.layout.a0 a0Var19 = a0Var3;
            final n0 n0Var110 = n0Var4;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
                final /* synthetic */ p0 $scrollBehavior;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    C1049d.b(pVar, hVar4, pVar5, qVar4, f1111111111111111, a0Var19, n0Var110, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.h hVar, final Y y10, final long j, final long j10, final long j11, final Ia.p pVar, final androidx.compose.ui.text.F f10, final float f11, final C0945e.l lVar, final C0945e.InterfaceC0129e interfaceC0129e, final int i10, final boolean z10, final Ia.p pVar2, final Ia.p pVar3, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        C1086g c1086gP = interfaceC1084f.p(-742442296);
        if ((i11 & 6) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? c1086gP.K(y10) : c1086gP.k(y10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c1086gP.i(j) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c1086gP.i(j10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c1086gP.i(j11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c1086gP.k(pVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= c1086gP.K(f10) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= c1086gP.g(f11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= c1086gP.K(lVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= c1086gP.K(interfaceC0129e) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = (c1086gP.h(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c1086gP.k(pVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c1086gP.k(pVar3) ? 2048 : 1024;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean z11 = ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 || ((i13 & 64) != 0 && c1086gP.k(y10))) | ((1879048192 & i13) == 536870912) | ((234881024 & i13) == 67108864) | ((i14 & 14) == 4);
            Object objF = c1086gP.f();
            if (z11 || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, final long j12) {
                        int iH;
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            androidx.compose.ui.layout.D d10 = list.get(i15);
                            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "navigationIcon")) {
                                final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.a.a(j12, 0, 0, 0, 0, 14));
                                int size2 = list.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    androidx.compose.ui.layout.D d11 = list.get(i16);
                                    if (kotlin.jvm.internal.i.a(C1171q.a(d11), "actionIcons")) {
                                        final androidx.compose.ui.layout.Y yQ2 = d11.Q(p013b0.a.a(j12, 0, 0, 0, 0, 14));
                                        if (p013b0.a.h(j12) == Integer.MAX_VALUE) {
                                            iH = p013b0.a.h(j12);
                                        } else {
                                            iH = (p013b0.a.h(j12) - yQ.f14220b) - yQ2.f14220b;
                                            if (iH < 0) {
                                                iH = 0;
                                            }
                                        }
                                        int i17 = iH;
                                        int size3 = list.size();
                                        for (int i18 = 0; i18 < size3; i18++) {
                                            androidx.compose.ui.layout.D d12 = list.get(i18);
                                            if (kotlin.jvm.internal.i.a(C1171q.a(d12), "title")) {
                                                final androidx.compose.ui.layout.Y yQ3 = d12.Q(p013b0.a.a(j12, 0, i17, 0, 0, 12));
                                                C1165k c1165k = AlignmentLineKt.f14166b;
                                                final int iV = yQ3.V(c1165k) != Integer.MIN_VALUE ? yQ3.V(c1165k) : 0;
                                                y10.getClass();
                                                int iG = p013b0.a.g(j12) == Integer.MAX_VALUE ? p013b0.a.g(j12) : p013b0.a.g(j12) + (Float.isNaN(0.0f) ? 0 : Ka.a.b(0.0f));
                                                int iH2 = p013b0.a.h(j12);
                                                final int i19 = i10;
                                                final C0945e.InterfaceC0129e interfaceC0129e2 = interfaceC0129e;
                                                final C0945e.l lVar2 = lVar;
                                                final int i20 = iG;
                                                return h8.y1(iH2, iG, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                                                        int iH3;
                                                        androidx.compose.ui.layout.Y.a aVar2 = aVar;
                                                        androidx.compose.ui.layout.Y y11 = yQ;
                                                        int iMax = 0;
                                                        androidx.compose.ui.layout.Y.a.g(aVar2, y11, 0, (i20 - y11.f14221c) / 2);
                                                        androidx.compose.ui.layout.Y y12 = yQ3;
                                                        C0945e.InterfaceC0129e interfaceC0129e3 = interfaceC0129e2;
                                                        C0945e.c cVar = C0945e.f10288e;
                                                        if (kotlin.jvm.internal.i.a(interfaceC0129e3, cVar)) {
                                                            int iH4 = p013b0.a.h(j12);
                                                            int i21 = yQ3.f14220b;
                                                            iH3 = (iH4 - i21) / 2;
                                                            int i22 = yQ.f14220b;
                                                            if (iH3 < i22) {
                                                                iH3 += i22 - iH3;
                                                            } else if (i21 + iH3 > p013b0.a.h(j12) - yQ2.f14220b) {
                                                                iH3 += (p013b0.a.h(j12) - yQ2.f14220b) - (yQ3.f14220b + iH3);
                                                            }
                                                        } else {
                                                            iH3 = kotlin.jvm.internal.i.a(interfaceC0129e3, C0945e.f10285b) ? (p013b0.a.h(j12) - yQ3.f14220b) - yQ2.f14220b : Math.max(h8.e1(C1049d.f12435b), yQ.f14220b);
                                                        }
                                                        C0945e.l lVar3 = lVar2;
                                                        if (kotlin.jvm.internal.i.a(lVar3, cVar)) {
                                                            iMax = (i20 - yQ3.f14221c) / 2;
                                                        } else if (kotlin.jvm.internal.i.a(lVar3, C0945e.f10287d)) {
                                                            int i23 = i19;
                                                            if (i23 == 0) {
                                                                iMax = i20 - yQ3.f14221c;
                                                            } else {
                                                                int i24 = yQ3.f14221c;
                                                                int iG2 = i23 - (i24 - iV);
                                                                int i25 = i24 + iG2;
                                                                if (i25 > p013b0.a.g(j12)) {
                                                                    iG2 -= i25 - p013b0.a.g(j12);
                                                                }
                                                                iMax = (i20 - yQ3.f14221c) - Math.max(0, iG2);
                                                            }
                                                        }
                                                        androidx.compose.ui.layout.Y.a.g(aVar2, y12, iH3, iMax);
                                                        androidx.compose.ui.layout.Y y13 = yQ2;
                                                        int iH5 = p013b0.a.h(j12);
                                                        androidx.compose.ui.layout.Y y14 = yQ2;
                                                        androidx.compose.ui.layout.Y.a.g(aVar2, y13, iH5 - y14.f14220b, (i20 - y14.f14221c) / 2);
                                                        return p293xa.r.f47939a;
                                                    }
                                                });
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar4, c1086gP, e10);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar5, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar6);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarB = C1171q.b(aVar2, "navigationIcon");
            float f12 = f12434a;
            androidx.compose.ui.h hVarJ = PaddingKt.j(hVarB, f12, 0.0f, 0.0f, 0.0f, 14);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
            int i16 = c1086gP.f12996P;
            int i17 = i13;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD);
            R0.a(pVar5, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                J4.i.d(i16, c1086gP, i16, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC2);
            androidx.compose.runtime.C c10 = ContentColorKt.f12125a;
            CompositionLocalKt.a(B7.b.b(j, c10), pVar2, c1086gP, 8 | ((i14 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c1086gP.T(true);
            androidx.compose.ui.h hVarB2 = androidx.compose.ui.graphics.T.b(PaddingKt.h(C1171q.b(aVar2, "title"), f12, 0.0f, 2).i(z10 ? androidx.compose.ui.semantics.p.a(aVar2, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    return p293xa.r.f47939a;
                }
            }) : aVar2), 0.0f, 0.0f, f11, 0.0f, 0.0f, null, false, 131067);
            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
            int i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD2);
            R0.a(pVar5, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
                J4.i.d(i18, c1086gP, i18, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC3);
            int i19 = i17 >> 9;
            ProvideContentColorTextStyleKt.a(j10, f10, pVar, c1086gP, (i19 & 14) | ((i17 >> 15) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i19 & 896));
            c1086gP.T(true);
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(C1171q.b(aVar2, "actionIcons"), 0.0f, 0.0f, f12, 0.0f, 11);
            androidx.compose.ui.layout.E eD3 = BoxKt.d(fVar, false);
            int i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD3);
            R0.a(pVar5, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                J4.i.d(i20, c1086gP, i20, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC4);
            CompositionLocalKt.a(c10.b(new androidx.compose.ui.graphics.H(j11)), pVar3, c1086gP, 8 | ((i14 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c1086gP.T(true);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    C1049d.c(hVar, y10, j, j10, j11, pVar, f10, f11, lVar, interfaceC0129e, i10, z10, pVar2, pVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
