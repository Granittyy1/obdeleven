package androidx.compose.material;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:112:0x017e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
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
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void a(androidx.compose.ui.h hVar, l0 l0Var, long j, long j10, C0937i c0937i, float f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        long j11;
        int i13;
        C0937i c0937i2;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final l0 l0Var2;
        final long jH;
        final long j12;
        final C0937i c0937i3;
        final float f12;
        C1105p0 c1105p0V;
        long jB;
        C0937i c0937i4;
        C1086g c1086gP = interfaceC1084f.p(1412203386);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(l0Var) ? 32 : 16;
            }
            if ((i10 & 384) != 0) {
                i12 |= ((i11 & 4) == 0 || !c1086gP.i(j)) ? 128 : 256;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j11 = j10;
                    int i20 = c1086gP.i(j11) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    j11 = j10;
                }
                i12 |= i20;
            } else {
                j11 = j10;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    c0937i2 = c0937i;
                    if (c1086gP.K(c0937i2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c1086gP.k(pVar)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i18 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i19 != 0) {
                                    l0Var2 = h0.f13629a;
                                } else {
                                    l0Var2 = l0Var;
                                }
                                if ((i11 & 4) != 0) {
                                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                } else {
                                    jH = j;
                                }
                                if ((i11 & 8) != 0) {
                                    jB = ColorsKt.b(jH, c1086gP);
                                } else {
                                    jB = j11;
                                }
                                if (i13 != 0) {
                                    c0937i4 = null;
                                } else {
                                    c0937i4 = c0937i2;
                                }
                                if (i15 != 0) {
                                    f11 = 0;
                                }
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                l0Var2 = l0Var;
                                jH = j;
                                jB = j11;
                                c0937i4 = c0937i2;
                            }
                            c1086gP.U();
                            androidx.compose.runtime.C c10 = ElevationOverlayKt.f11744b;
                            final float f13 = ((p013b0.f) c1086gP.x(c10)).f20481b + f11;
                            final androidx.compose.ui.h hVar3 = hVar2;
                            final l0 l0Var3 = l0Var2;
                            final long j13 = jH;
                            final C0937i c0937i5 = c0937i4;
                            final float f14 = f11;
                            CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c10.b(new p013b0.f(f13))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                                /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                                /* JADX INFO: compiled from: Surface.kt */
                                @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                                final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                    int label;

                                    public AnonymousClass2() {
                                        throw null;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                        return new AnonymousClass2(2, cVar);
                                    }

                                    @Override // Ia.p
                                    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                        return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                        return p293xa.r.f47939a;
                                    }
                                }

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
                                        androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar3, l0Var3, SurfaceKt.d(j13, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f13, interfaceC1084f3), c0937i5, f14), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.t.f(wVar);
                                                return p293xa.r.f47939a;
                                            }
                                        }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f3.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f3.r();
                                        if (interfaceC1084f3.m()) {
                                            interfaceC1084f3.v(aVar);
                                        } else {
                                            interfaceC1084f3.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, 56);
                            long j14 = jB;
                            c0937i3 = c0937i4;
                            j12 = j14;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            l0Var2 = l0Var;
                            jH = j;
                            j12 = j11;
                            c0937i3 = c0937i2;
                        }
                        f12 = f11;
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 1572864;
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c11 = ElevationOverlayKt.f11744b;
                        final float f15 = ((p013b0.f) c1086gP.x(c11)).f20481b + f11;
                        final androidx.compose.ui.h hVar4 = hVar2;
                        final l0 l0Var4 = l0Var2;
                        final long j15 = jH;
                        final C0937i c0937i6 = c0937i4;
                        final float f16 = f11;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c11.b(new p013b0.f(f15))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                            /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Surface.kt */
                            @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                            final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                int label;

                                public AnonymousClass2() {
                                    throw null;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass2(2, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                    return p293xa.r.f47939a;
                                }
                            }

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
                                    androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar4, l0Var4, SurfaceKt.d(j15, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f15, interfaceC1084f3), c0937i6, f16), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.t.f(wVar);
                                            return p293xa.r.f47939a;
                                        }
                                    }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        long j16 = jB;
                        c0937i3 = c0937i4;
                        j12 = j16;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        l0Var2 = l0Var;
                        jH = j;
                        j12 = j11;
                        c0937i3 = c0937i2;
                    }
                    f12 = f11;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                f11 = f10;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c12 = ElevationOverlayKt.f11744b;
                        final float f17 = ((p013b0.f) c1086gP.x(c12)).f20481b + f11;
                        final androidx.compose.ui.h hVar5 = hVar2;
                        final l0 l0Var5 = l0Var2;
                        final long j17 = jH;
                        final C0937i c0937i7 = c0937i4;
                        final float f18 = f11;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c12.b(new p013b0.f(f17))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                            /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Surface.kt */
                            @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                            final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                int label;

                                public AnonymousClass2() {
                                    throw null;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass2(2, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                    return p293xa.r.f47939a;
                                }
                            }

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
                                    androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar5, l0Var5, SurfaceKt.d(j17, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f17, interfaceC1084f3), c0937i7, f18), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.t.f(wVar);
                                            return p293xa.r.f47939a;
                                        }
                                    }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        long j18 = jB;
                        c0937i3 = c0937i4;
                        j12 = j18;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        l0Var2 = l0Var;
                        jH = j;
                        j12 = j11;
                        c0937i3 = c0937i2;
                    }
                    f12 = f11;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c13 = ElevationOverlayKt.f11744b;
                    final float f19 = ((p013b0.f) c1086gP.x(c13)).f20481b + f11;
                    final androidx.compose.ui.h hVar6 = hVar2;
                    final l0 l0Var6 = l0Var2;
                    final long j19 = jH;
                    final C0937i c0937i8 = c0937i4;
                    final float f110 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c13.b(new p013b0.f(f19))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar6, l0Var6, SurfaceKt.d(j19, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f19, interfaceC1084f3), c0937i8, f110), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j110 = jB;
                    c0937i3 = c0937i4;
                    j12 = j110;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            c0937i2 = c0937i;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c14 = ElevationOverlayKt.f11744b;
                        final float f111 = ((p013b0.f) c1086gP.x(c14)).f20481b + f11;
                        final androidx.compose.ui.h hVar7 = hVar2;
                        final l0 l0Var7 = l0Var2;
                        final long j111 = jH;
                        final C0937i c0937i9 = c0937i4;
                        final float f112 = f11;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c14.b(new p013b0.f(f111))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                            /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Surface.kt */
                            @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                            final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                int label;

                                public AnonymousClass2() {
                                    throw null;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass2(2, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                    return p293xa.r.f47939a;
                                }
                            }

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
                                    androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar7, l0Var7, SurfaceKt.d(j111, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f111, interfaceC1084f3), c0937i9, f112), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.t.f(wVar);
                                            return p293xa.r.f47939a;
                                        }
                                    }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        long j112 = jB;
                        c0937i3 = c0937i4;
                        j12 = j112;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        l0Var2 = l0Var;
                        jH = j;
                        j12 = j11;
                        c0937i3 = c0937i2;
                    }
                    f12 = f11;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c15 = ElevationOverlayKt.f11744b;
                    final float f113 = ((p013b0.f) c1086gP.x(c15)).f20481b + f11;
                    final androidx.compose.ui.h hVar8 = hVar2;
                    final l0 l0Var8 = l0Var2;
                    final long j113 = jH;
                    final C0937i c0937i10 = c0937i4;
                    final float f114 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c15.b(new p013b0.f(f113))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar8, l0Var8, SurfaceKt.d(j113, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f113, interfaceC1084f3), c0937i10, f114), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j114 = jB;
                    c0937i3 = c0937i4;
                    j12 = j114;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            f11 = f10;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c16 = ElevationOverlayKt.f11744b;
                    final float f115 = ((p013b0.f) c1086gP.x(c16)).f20481b + f11;
                    final androidx.compose.ui.h hVar9 = hVar2;
                    final l0 l0Var9 = l0Var2;
                    final long j115 = jH;
                    final C0937i c0937i11 = c0937i4;
                    final float f116 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c16.b(new p013b0.f(f115))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar9, l0Var9, SurfaceKt.d(j115, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f115, interfaceC1084f3), c0937i11, f116), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j116 = jB;
                    c0937i3 = c0937i4;
                    j12 = j116;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                }
                c1086gP.U();
                androidx.compose.runtime.C c17 = ElevationOverlayKt.f11744b;
                final float f117 = ((p013b0.f) c1086gP.x(c17)).f20481b + f11;
                final androidx.compose.ui.h hVar10 = hVar2;
                final l0 l0Var10 = l0Var2;
                final long j117 = jH;
                final C0937i c0937i12 = c0937i4;
                final float f118 = f11;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c17.b(new p013b0.f(f117))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                    /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Surface.kt */
                    @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;

                        public AnonymousClass2() {
                            throw null;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass2(2, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p293xa.r.f47939a;
                        }
                    }

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
                            androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar10, l0Var10, SurfaceKt.d(j117, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f117, interfaceC1084f3), c0937i12, f118), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.f(wVar);
                                    return p293xa.r.f47939a;
                                }
                            }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                long j118 = jB;
                c0937i3 = c0937i4;
                j12 = j118;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                l0Var2 = l0Var;
                jH = j;
                j12 = j11;
                c0937i3 = c0937i2;
            }
            f12 = f11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        if ((i10 & 384) != 0) {
            i12 |= ((i11 & 4) == 0 || !c1086gP.i(j)) ? 128 : 256;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j11 = j10;
                if (c1086gP.i(j11)) {
                }
                i12 |= i20;
            } else {
                j11 = j10;
            }
            i12 |= i20;
        } else {
            j11 = j10;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                c0937i2 = c0937i;
                if (c1086gP.K(c0937i2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        } else {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i19 != 0) {
                                l0Var2 = h0.f13629a;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i11 & 4) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 8) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i13 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i2;
                            }
                            if (i15 != 0) {
                                f11 = 0;
                            }
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c18 = ElevationOverlayKt.f11744b;
                        final float f119 = ((p013b0.f) c1086gP.x(c18)).f20481b + f11;
                        final androidx.compose.ui.h hVar11 = hVar2;
                        final l0 l0Var11 = l0Var2;
                        final long j119 = jH;
                        final C0937i c0937i13 = c0937i4;
                        final float f1110 = f11;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c18.b(new p013b0.f(f119))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                            /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: Surface.kt */
                            @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                            final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                int label;

                                public AnonymousClass2() {
                                    throw null;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass2(2, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                    return p293xa.r.f47939a;
                                }
                            }

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
                                    androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar11, l0Var11, SurfaceKt.d(j119, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f119, interfaceC1084f3), c0937i13, f1110), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.t.f(wVar);
                                            return p293xa.r.f47939a;
                                        }
                                    }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        long j1110 = jB;
                        c0937i3 = c0937i4;
                        j12 = j1110;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        l0Var2 = l0Var;
                        jH = j;
                        j12 = j11;
                        c0937i3 = c0937i2;
                    }
                    f12 = f11;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 1572864;
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c19 = ElevationOverlayKt.f11744b;
                    final float f1111 = ((p013b0.f) c1086gP.x(c19)).f20481b + f11;
                    final androidx.compose.ui.h hVar12 = hVar2;
                    final l0 l0Var12 = l0Var2;
                    final long j1111 = jH;
                    final C0937i c0937i14 = c0937i4;
                    final float f1112 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c19.b(new p013b0.f(f1111))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar12, l0Var12, SurfaceKt.d(j1111, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1111, interfaceC1084f3), c0937i14, f1112), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j1112 = jB;
                    c0937i3 = c0937i4;
                    j12 = j1112;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            f11 = f10;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c110 = ElevationOverlayKt.f11744b;
                    final float f1113 = ((p013b0.f) c1086gP.x(c110)).f20481b + f11;
                    final androidx.compose.ui.h hVar13 = hVar2;
                    final l0 l0Var13 = l0Var2;
                    final long j1113 = jH;
                    final C0937i c0937i15 = c0937i4;
                    final float f1114 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c110.b(new p013b0.f(f1113))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar13, l0Var13, SurfaceKt.d(j1113, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1113, interfaceC1084f3), c0937i15, f1114), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j1114 = jB;
                    c0937i3 = c0937i4;
                    j12 = j1114;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                }
                c1086gP.U();
                androidx.compose.runtime.C c111 = ElevationOverlayKt.f11744b;
                final float f1115 = ((p013b0.f) c1086gP.x(c111)).f20481b + f11;
                final androidx.compose.ui.h hVar14 = hVar2;
                final l0 l0Var14 = l0Var2;
                final long j1115 = jH;
                final C0937i c0937i16 = c0937i4;
                final float f1116 = f11;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c111.b(new p013b0.f(f1115))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                    /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Surface.kt */
                    @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;

                        public AnonymousClass2() {
                            throw null;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass2(2, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p293xa.r.f47939a;
                        }
                    }

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
                            androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar14, l0Var14, SurfaceKt.d(j1115, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1115, interfaceC1084f3), c0937i16, f1116), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.f(wVar);
                                    return p293xa.r.f47939a;
                                }
                            }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                long j1116 = jB;
                c0937i3 = c0937i4;
                j12 = j1116;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                l0Var2 = l0Var;
                jH = j;
                j12 = j11;
                c0937i3 = c0937i2;
            }
            f12 = f11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        c0937i2 = c0937i;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i19 != 0) {
                            l0Var2 = h0.f13629a;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 4) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 8) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i13 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i2;
                        }
                        if (i15 != 0) {
                            f11 = 0;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c112 = ElevationOverlayKt.f11744b;
                    final float f1117 = ((p013b0.f) c1086gP.x(c112)).f20481b + f11;
                    final androidx.compose.ui.h hVar15 = hVar2;
                    final l0 l0Var15 = l0Var2;
                    final long j1117 = jH;
                    final C0937i c0937i17 = c0937i4;
                    final float f1118 = f11;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c112.b(new p013b0.f(f1117))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                        /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Surface.kt */
                        @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;

                            public AnonymousClass2() {
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass2(2, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                return p293xa.r.f47939a;
                            }
                        }

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
                                androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar15, l0Var15, SurfaceKt.d(j1117, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1117, interfaceC1084f3), c0937i17, f1118), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.f(wVar);
                                        return p293xa.r.f47939a;
                                    }
                                }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    long j1118 = jB;
                    c0937i3 = c0937i4;
                    j12 = j1118;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    l0Var2 = l0Var;
                    jH = j;
                    j12 = j11;
                    c0937i3 = c0937i2;
                }
                f12 = f11;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 1572864;
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                }
                c1086gP.U();
                androidx.compose.runtime.C c113 = ElevationOverlayKt.f11744b;
                final float f1119 = ((p013b0.f) c1086gP.x(c113)).f20481b + f11;
                final androidx.compose.ui.h hVar16 = hVar2;
                final l0 l0Var16 = l0Var2;
                final long j1119 = jH;
                final C0937i c0937i18 = c0937i4;
                final float f11110 = f11;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c113.b(new p013b0.f(f1119))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                    /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Surface.kt */
                    @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;

                        public AnonymousClass2() {
                            throw null;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass2(2, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p293xa.r.f47939a;
                        }
                    }

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
                            androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar16, l0Var16, SurfaceKt.d(j1119, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1119, interfaceC1084f3), c0937i18, f11110), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.f(wVar);
                                    return p293xa.r.f47939a;
                                }
                            }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                long j11110 = jB;
                c0937i3 = c0937i4;
                j12 = j11110;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                l0Var2 = l0Var;
                jH = j;
                j12 = j11;
                c0937i3 = c0937i2;
            }
            f12 = f11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        f11 = f10;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i19 != 0) {
                        l0Var2 = h0.f13629a;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 4) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 8) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i13 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i2;
                    }
                    if (i15 != 0) {
                        f11 = 0;
                    }
                }
                c1086gP.U();
                androidx.compose.runtime.C c114 = ElevationOverlayKt.f11744b;
                final float f11111 = ((p013b0.f) c1086gP.x(c114)).f20481b + f11;
                final androidx.compose.ui.h hVar17 = hVar2;
                final l0 l0Var17 = l0Var2;
                final long j11111 = jH;
                final C0937i c0937i19 = c0937i4;
                final float f11112 = f11;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c114.b(new p013b0.f(f11111))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                    /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Surface.kt */
                    @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;

                        public AnonymousClass2() {
                            throw null;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass2(2, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            return p293xa.r.f47939a;
                        }
                    }

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
                            androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar17, l0Var17, SurfaceKt.d(j11111, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f11111, interfaceC1084f3), c0937i19, f11112), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.f(wVar);
                                    return p293xa.r.f47939a;
                                }
                            }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                long j11112 = jB;
                c0937i3 = c0937i4;
                j12 = j11112;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                l0Var2 = l0Var;
                jH = j;
                j12 = j11;
                c0937i3 = c0937i2;
            }
            f12 = f11;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 1572864;
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i19 != 0) {
                    l0Var2 = h0.f13629a;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i11 & 4) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 8) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j11;
                }
                if (i13 != 0) {
                    c0937i4 = null;
                } else {
                    c0937i4 = c0937i2;
                }
                if (i15 != 0) {
                    f11 = 0;
                }
            } else {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i19 != 0) {
                    l0Var2 = h0.f13629a;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i11 & 4) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 8) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j11;
                }
                if (i13 != 0) {
                    c0937i4 = null;
                } else {
                    c0937i4 = c0937i2;
                }
                if (i15 != 0) {
                    f11 = 0;
                }
            }
            c1086gP.U();
            androidx.compose.runtime.C c115 = ElevationOverlayKt.f11744b;
            final float f11113 = ((p013b0.f) c1086gP.x(c115)).f20481b + f11;
            final androidx.compose.ui.h hVar18 = hVar2;
            final l0 l0Var18 = l0Var2;
            final long j11113 = jH;
            final C0937i c0937i110 = c0937i4;
            final float f11114 = f11;
            CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c115.b(new p013b0.f(f11113))}, androidx.compose.runtime.internal.a.b(-1822160838, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1

                /* JADX INFO: renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Surface.kt */
                @Aa.c(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
                final class AnonymousClass2 extends SuspendLambda implements Ia.p<androidx.compose.ui.input.pointer.w, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    int label;

                    public AnonymousClass2() {
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass2(2, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(androidx.compose.ui.input.pointer.w wVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass2) create(wVar, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        return p293xa.r.f47939a;
                    }
                }

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
                        androidx.compose.ui.h hVarI = androidx.compose.ui.semantics.p.b(SurfaceKt.c(hVar18, l0Var18, SurfaceKt.d(j11113, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f11113, interfaceC1084f3), c0937i110, f11114), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.f(wVar);
                                return p293xa.r.f47939a;
                            }
                        }).i(new SuspendPointerInputElement(p293xa.r.f47939a, null, new androidx.compose.ui.input.pointer.B.a(new AnonymousClass2(2, null)), 6));
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
            long j11114 = jB;
            c0937i3 = c0937i4;
            j12 = j11114;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            l0Var2 = l0Var;
            jH = j;
            j12 = j11;
            c0937i3 = c0937i2;
        }
        f12 = f11;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SurfaceKt.a(hVar2, l0Var2, jH, j12, c0937i3, f12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x0127  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0194  */
    /* JADX WARN: Code duplicated, block: B:140:0x0198  */
    /* JADX WARN: Code duplicated, block: B:141:0x019a  */
    /* JADX WARN: Code duplicated, block: B:143:0x019e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x0214  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    public static final void b(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, l0 l0Var, long j, long j10, C0937i c0937i, float f10, androidx.compose.foundation.interaction.k kVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z11;
        final androidx.compose.ui.h hVar2;
        final boolean z12;
        final l0 l0Var2;
        final long jH;
        final C0937i c0937i2;
        final float f11;
        final long j12;
        final androidx.compose.foundation.interaction.k kVar2;
        C1105p0 c1105p0V;
        l0 l0Var3;
        long jB;
        C0937i c0937i3;
        float f12;
        androidx.compose.foundation.interaction.k kVar3;
        float f13;
        boolean z13;
        C1086g c1086gP = interfaceC1084f.p(1560876237);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c1086gP.K(l0Var)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) != 0) {
                        i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            j11 = j10;
                            int i25 = c1086gP.i(j11) ? 131072 : 65536;
                            i12 |= i25;
                        } else {
                            j11 = j10;
                        }
                        i12 |= i25;
                    } else {
                        j11 = j10;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(c0937i)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.g(f10)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 256;
                    if (i21 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(kVar)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(pVar)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i12 |= i23;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c1086gP.C(i12 & 1, z11)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i24 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar2 = hVar;
                                }
                                boolean z14 = i13 == 0 ? z10 : true;
                                if (i15 != 0) {
                                    l0Var3 = h0.f13629a;
                                } else {
                                    l0Var3 = l0Var;
                                }
                                if ((i11 & 16) != 0) {
                                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                } else {
                                    jH = j;
                                }
                                if ((i11 & 32) != 0) {
                                    jB = ColorsKt.b(jH, c1086gP);
                                } else {
                                    jB = j11;
                                }
                                if (i17 != 0) {
                                    c0937i3 = null;
                                } else {
                                    c0937i3 = c0937i;
                                }
                                if (i19 != 0) {
                                    f12 = 0;
                                } else {
                                    f12 = f10;
                                }
                                kVar3 = i21 == 0 ? kVar : null;
                                f13 = f12;
                                z13 = z14;
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                z13 = z10;
                                l0Var3 = l0Var;
                                jH = j;
                                f13 = f10;
                                kVar3 = kVar;
                                jB = j11;
                                c0937i3 = c0937i;
                            }
                            c1086gP.U();
                            androidx.compose.runtime.C c10 = ElevationOverlayKt.f11744b;
                            final float f14 = ((p013b0.f) c1086gP.x(c10)).f20481b + f13;
                            final androidx.compose.ui.h hVar3 = hVar2;
                            final l0 l0Var4 = l0Var3;
                            final long j13 = jH;
                            final C0937i c0937i4 = c0937i3;
                            final float f15 = f13;
                            final androidx.compose.foundation.interaction.k kVar4 = kVar3;
                            final boolean z15 = z13;
                            CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c10.b(new p013b0.f(f14))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                        androidx.compose.ui.h hVar4 = hVar3;
                                        O0 o10 = InteractiveComponentSizeKt.f11762a;
                                        androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar4.i(MinimumInteractiveModifier.f11774b), l0Var4, SurfaceKt.d(j13, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f14, interfaceC1084f3), c0937i4, f15), kVar4, RippleKt.a(0.0f, 7, 0L), z15, null, aVar, 24);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, 56);
                            j12 = jB;
                            c0937i2 = c0937i3;
                            kVar2 = kVar3;
                            f11 = f13;
                            l0Var2 = l0Var3;
                            z12 = z13;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            z12 = z10;
                            l0Var2 = l0Var;
                            jH = j;
                            c0937i2 = c0937i;
                            f11 = f10;
                            j12 = j11;
                            kVar2 = kVar;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 805306368;
                    if ((i12 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        } else {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c11 = ElevationOverlayKt.f11744b;
                        final float f16 = ((p013b0.f) c1086gP.x(c11)).f20481b + f13;
                        final androidx.compose.ui.h hVar4 = hVar2;
                        final l0 l0Var5 = l0Var3;
                        final long j14 = jH;
                        final C0937i c0937i5 = c0937i3;
                        final float f17 = f13;
                        final androidx.compose.foundation.interaction.k kVar5 = kVar3;
                        final boolean z16 = z13;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c11.b(new p013b0.f(f16))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                    androidx.compose.ui.h hVar5 = hVar4;
                                    O0 o10 = InteractiveComponentSizeKt.f11762a;
                                    androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar5.i(MinimumInteractiveModifier.f11774b), l0Var5, SurfaceKt.d(j14, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f16, interfaceC1084f3), c0937i5, f17), kVar5, RippleKt.a(0.0f, 7, 0L), z16, null, aVar, 24);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        j12 = jB;
                        c0937i2 = c0937i3;
                        kVar2 = kVar3;
                        f11 = f13;
                        l0Var2 = l0Var3;
                        z12 = z13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z12 = z10;
                        l0Var2 = l0Var;
                        jH = j;
                        c0937i2 = c0937i;
                        f11 = f10;
                        j12 = j11;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j10;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i25;
                    } else {
                        j11 = j10;
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        } else {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c12 = ElevationOverlayKt.f11744b;
                        final float f18 = ((p013b0.f) c1086gP.x(c12)).f20481b + f13;
                        final androidx.compose.ui.h hVar5 = hVar2;
                        final l0 l0Var6 = l0Var3;
                        final long j15 = jH;
                        final C0937i c0937i6 = c0937i3;
                        final float f19 = f13;
                        final androidx.compose.foundation.interaction.k kVar6 = kVar3;
                        final boolean z17 = z13;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c12.b(new p013b0.f(f18))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                    androidx.compose.ui.h hVar6 = hVar5;
                                    O0 o10 = InteractiveComponentSizeKt.f11762a;
                                    androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar6.i(MinimumInteractiveModifier.f11774b), l0Var6, SurfaceKt.d(j15, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f18, interfaceC1084f3), c0937i6, f19), kVar6, RippleKt.a(0.0f, 7, 0L), z17, null, aVar, 24);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        j12 = jB;
                        c0937i2 = c0937i3;
                        kVar2 = kVar3;
                        f11 = f13;
                        l0Var2 = l0Var3;
                        z12 = z13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z12 = z10;
                        l0Var2 = l0Var;
                        jH = j;
                        c0937i2 = c0937i;
                        f11 = f10;
                        j12 = j11;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c13 = ElevationOverlayKt.f11744b;
                    final float f110 = ((p013b0.f) c1086gP.x(c13)).f20481b + f13;
                    final androidx.compose.ui.h hVar6 = hVar2;
                    final l0 l0Var7 = l0Var3;
                    final long j16 = jH;
                    final C0937i c0937i7 = c0937i3;
                    final float f111 = f13;
                    final androidx.compose.foundation.interaction.k kVar7 = kVar3;
                    final boolean z18 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c13.b(new p013b0.f(f110))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar7 = hVar6;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar7.i(MinimumInteractiveModifier.f11774b), l0Var7, SurfaceKt.d(j16, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f110, interfaceC1084f3), c0937i7, f111), kVar7, RippleKt.a(0.0f, 7, 0L), z18, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(l0Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j10;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i25;
                    } else {
                        j11 = j10;
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        } else {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c14 = ElevationOverlayKt.f11744b;
                        final float f112 = ((p013b0.f) c1086gP.x(c14)).f20481b + f13;
                        final androidx.compose.ui.h hVar7 = hVar2;
                        final l0 l0Var8 = l0Var3;
                        final long j17 = jH;
                        final C0937i c0937i8 = c0937i3;
                        final float f113 = f13;
                        final androidx.compose.foundation.interaction.k kVar8 = kVar3;
                        final boolean z19 = z13;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c14.b(new p013b0.f(f112))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                    androidx.compose.ui.h hVar8 = hVar7;
                                    O0 o10 = InteractiveComponentSizeKt.f11762a;
                                    androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar8.i(MinimumInteractiveModifier.f11774b), l0Var8, SurfaceKt.d(j17, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f112, interfaceC1084f3), c0937i8, f113), kVar8, RippleKt.a(0.0f, 7, 0L), z19, null, aVar, 24);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        j12 = jB;
                        c0937i2 = c0937i3;
                        kVar2 = kVar3;
                        f11 = f13;
                        l0Var2 = l0Var3;
                        z12 = z13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z12 = z10;
                        l0Var2 = l0Var;
                        jH = j;
                        c0937i2 = c0937i;
                        f11 = f10;
                        j12 = j11;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c15 = ElevationOverlayKt.f11744b;
                    final float f114 = ((p013b0.f) c1086gP.x(c15)).f20481b + f13;
                    final androidx.compose.ui.h hVar8 = hVar2;
                    final l0 l0Var9 = l0Var3;
                    final long j18 = jH;
                    final C0937i c0937i9 = c0937i3;
                    final float f115 = f13;
                    final androidx.compose.foundation.interaction.k kVar9 = kVar3;
                    final boolean z110 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c15.b(new p013b0.f(f114))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar9 = hVar8;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar9.i(MinimumInteractiveModifier.f11774b), l0Var9, SurfaceKt.d(j18, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f114, interfaceC1084f3), c0937i9, f115), kVar9, RippleKt.a(0.0f, 7, 0L), z110, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j10;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i12 |= i25;
            } else {
                j11 = j10;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c16 = ElevationOverlayKt.f11744b;
                    final float f116 = ((p013b0.f) c1086gP.x(c16)).f20481b + f13;
                    final androidx.compose.ui.h hVar9 = hVar2;
                    final l0 l0Var10 = l0Var3;
                    final long j19 = jH;
                    final C0937i c0937i10 = c0937i3;
                    final float f117 = f13;
                    final androidx.compose.foundation.interaction.k kVar10 = kVar3;
                    final boolean z111 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c16.b(new p013b0.f(f116))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar10 = hVar9;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar10.i(MinimumInteractiveModifier.f11774b), l0Var10, SurfaceKt.d(j19, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f116, interfaceC1084f3), c0937i10, f117), kVar10, RippleKt.a(0.0f, 7, 0L), z111, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                }
                c1086gP.U();
                androidx.compose.runtime.C c17 = ElevationOverlayKt.f11744b;
                final float f118 = ((p013b0.f) c1086gP.x(c17)).f20481b + f13;
                final androidx.compose.ui.h hVar10 = hVar2;
                final l0 l0Var11 = l0Var3;
                final long j110 = jH;
                final C0937i c0937i11 = c0937i3;
                final float f119 = f13;
                final androidx.compose.foundation.interaction.k kVar11 = kVar3;
                final boolean z112 = z13;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c17.b(new p013b0.f(f118))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                            androidx.compose.ui.h hVar11 = hVar10;
                            O0 o10 = InteractiveComponentSizeKt.f11762a;
                            androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar11.i(MinimumInteractiveModifier.f11774b), l0Var11, SurfaceKt.d(j110, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f118, interfaceC1084f3), c0937i11, f119), kVar11, RippleKt.a(0.0f, 7, 0L), z112, null, aVar, 24);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                j12 = jB;
                c0937i2 = c0937i3;
                kVar2 = kVar3;
                f11 = f13;
                l0Var2 = l0Var3;
                z12 = z13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                jH = j;
                c0937i2 = c0937i;
                f11 = f10;
                j12 = j11;
                kVar2 = kVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(l0Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j10;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i25;
                    } else {
                        j11 = j10;
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 256;
                if (i21 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i12 |= i23;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        } else {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 == 0) {
                            }
                            if (i15 != 0) {
                                l0Var3 = h0.f13629a;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 16) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 32) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                            } else {
                                jB = j11;
                            }
                            if (i17 != 0) {
                                c0937i3 = null;
                            } else {
                                c0937i3 = c0937i;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            if (i21 == 0) {
                            }
                            f13 = f12;
                            z13 = z14;
                        }
                        c1086gP.U();
                        androidx.compose.runtime.C c18 = ElevationOverlayKt.f11744b;
                        final float f1110 = ((p013b0.f) c1086gP.x(c18)).f20481b + f13;
                        final androidx.compose.ui.h hVar11 = hVar2;
                        final l0 l0Var12 = l0Var3;
                        final long j111 = jH;
                        final C0937i c0937i12 = c0937i3;
                        final float f1111 = f13;
                        final androidx.compose.foundation.interaction.k kVar12 = kVar3;
                        final boolean z113 = z13;
                        CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c18.b(new p013b0.f(f1110))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                    androidx.compose.ui.h hVar12 = hVar11;
                                    O0 o10 = InteractiveComponentSizeKt.f11762a;
                                    androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar12.i(MinimumInteractiveModifier.f11774b), l0Var12, SurfaceKt.d(j111, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1110, interfaceC1084f3), c0937i12, f1111), kVar12, RippleKt.a(0.0f, 7, 0L), z113, null, aVar, 24);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        j12 = jB;
                        c0937i2 = c0937i3;
                        kVar2 = kVar3;
                        f11 = f13;
                        l0Var2 = l0Var3;
                        z12 = z13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z12 = z10;
                        l0Var2 = l0Var;
                        jH = j;
                        c0937i2 = c0937i;
                        f11 = f10;
                        j12 = j11;
                        kVar2 = kVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c19 = ElevationOverlayKt.f11744b;
                    final float f1112 = ((p013b0.f) c1086gP.x(c19)).f20481b + f13;
                    final androidx.compose.ui.h hVar12 = hVar2;
                    final l0 l0Var13 = l0Var3;
                    final long j112 = jH;
                    final C0937i c0937i13 = c0937i3;
                    final float f1113 = f13;
                    final androidx.compose.foundation.interaction.k kVar13 = kVar3;
                    final boolean z114 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c19.b(new p013b0.f(f1112))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar13 = hVar12;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar13.i(MinimumInteractiveModifier.f11774b), l0Var13, SurfaceKt.d(j112, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1112, interfaceC1084f3), c0937i13, f1113), kVar13, RippleKt.a(0.0f, 7, 0L), z114, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j10;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i12 |= i25;
            } else {
                j11 = j10;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c110 = ElevationOverlayKt.f11744b;
                    final float f1114 = ((p013b0.f) c1086gP.x(c110)).f20481b + f13;
                    final androidx.compose.ui.h hVar13 = hVar2;
                    final l0 l0Var14 = l0Var3;
                    final long j113 = jH;
                    final C0937i c0937i14 = c0937i3;
                    final float f1115 = f13;
                    final androidx.compose.foundation.interaction.k kVar14 = kVar3;
                    final boolean z115 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c110.b(new p013b0.f(f1114))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar14 = hVar13;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar14.i(MinimumInteractiveModifier.f11774b), l0Var14, SurfaceKt.d(j113, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1114, interfaceC1084f3), c0937i14, f1115), kVar14, RippleKt.a(0.0f, 7, 0L), z115, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                }
                c1086gP.U();
                androidx.compose.runtime.C c111 = ElevationOverlayKt.f11744b;
                final float f1116 = ((p013b0.f) c1086gP.x(c111)).f20481b + f13;
                final androidx.compose.ui.h hVar14 = hVar2;
                final l0 l0Var15 = l0Var3;
                final long j114 = jH;
                final C0937i c0937i15 = c0937i3;
                final float f1117 = f13;
                final androidx.compose.foundation.interaction.k kVar15 = kVar3;
                final boolean z116 = z13;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c111.b(new p013b0.f(f1116))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                            androidx.compose.ui.h hVar15 = hVar14;
                            O0 o10 = InteractiveComponentSizeKt.f11762a;
                            androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar15.i(MinimumInteractiveModifier.f11774b), l0Var15, SurfaceKt.d(j114, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1116, interfaceC1084f3), c0937i15, f1117), kVar15, RippleKt.a(0.0f, 7, 0L), z116, null, aVar, 24);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                j12 = jB;
                c0937i2 = c0937i3;
                kVar2 = kVar3;
                f11 = f13;
                l0Var2 = l0Var3;
                z12 = z13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                jH = j;
                c0937i2 = c0937i;
                f11 = f10;
                j12 = j11;
                kVar2 = kVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c1086gP.K(l0Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j10;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i25;
                } else {
                    j11 = j10;
                }
                i12 |= i25;
            } else {
                j11 = j10;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i11 & 256;
            if (i21 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i12 |= i23;
                }
                if ((i12 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            l0Var3 = h0.f13629a;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 32) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j11;
                        }
                        if (i17 != 0) {
                            c0937i3 = null;
                        } else {
                            c0937i3 = c0937i;
                        }
                        if (i19 != 0) {
                            f12 = 0;
                        } else {
                            f12 = f10;
                        }
                        if (i21 == 0) {
                        }
                        f13 = f12;
                        z13 = z14;
                    }
                    c1086gP.U();
                    androidx.compose.runtime.C c112 = ElevationOverlayKt.f11744b;
                    final float f1118 = ((p013b0.f) c1086gP.x(c112)).f20481b + f13;
                    final androidx.compose.ui.h hVar15 = hVar2;
                    final l0 l0Var16 = l0Var3;
                    final long j115 = jH;
                    final C0937i c0937i16 = c0937i3;
                    final float f1119 = f13;
                    final androidx.compose.foundation.interaction.k kVar16 = kVar3;
                    final boolean z117 = z13;
                    CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c112.b(new p013b0.f(f1118))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                                androidx.compose.ui.h hVar16 = hVar15;
                                O0 o10 = InteractiveComponentSizeKt.f11762a;
                                androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar16.i(MinimumInteractiveModifier.f11774b), l0Var16, SurfaceKt.d(j115, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f1118, interfaceC1084f3), c0937i16, f1119), kVar16, RippleKt.a(0.0f, 7, 0L), z117, null, aVar, 24);
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    j12 = jB;
                    c0937i2 = c0937i3;
                    kVar2 = kVar3;
                    f11 = f13;
                    l0Var2 = l0Var3;
                    z12 = z13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jH = j;
                    c0937i2 = c0937i;
                    f11 = f10;
                    j12 = j11;
                    kVar2 = kVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 805306368;
            if ((i12 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                }
                c1086gP.U();
                androidx.compose.runtime.C c113 = ElevationOverlayKt.f11744b;
                final float f11110 = ((p013b0.f) c1086gP.x(c113)).f20481b + f13;
                final androidx.compose.ui.h hVar16 = hVar2;
                final l0 l0Var17 = l0Var3;
                final long j116 = jH;
                final C0937i c0937i17 = c0937i3;
                final float f11111 = f13;
                final androidx.compose.foundation.interaction.k kVar17 = kVar3;
                final boolean z118 = z13;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c113.b(new p013b0.f(f11110))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                            androidx.compose.ui.h hVar17 = hVar16;
                            O0 o10 = InteractiveComponentSizeKt.f11762a;
                            androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar17.i(MinimumInteractiveModifier.f11774b), l0Var17, SurfaceKt.d(j116, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f11110, interfaceC1084f3), c0937i17, f11111), kVar17, RippleKt.a(0.0f, 7, 0L), z118, null, aVar, 24);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                j12 = jB;
                c0937i2 = c0937i3;
                kVar2 = kVar3;
                f11 = f13;
                l0Var2 = l0Var3;
                z12 = z13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                jH = j;
                c0937i2 = c0937i;
                f11 = f10;
                j12 = j11;
                kVar2 = kVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        if ((i10 & 24576) != 0) {
            i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j11 = j10;
                if (c1086gP.i(j11)) {
                }
                i12 |= i25;
            } else {
                j11 = j10;
            }
            i12 |= i25;
        } else {
            j11 = j10;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.K(c0937i)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.g(f10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i11 & 256;
        if (i21 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(kVar)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i12 |= i23;
            }
            if ((i12 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        l0Var3 = h0.f13629a;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 32) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j11;
                    }
                    if (i17 != 0) {
                        c0937i3 = null;
                    } else {
                        c0937i3 = c0937i;
                    }
                    if (i19 != 0) {
                        f12 = 0;
                    } else {
                        f12 = f10;
                    }
                    if (i21 == 0) {
                    }
                    f13 = f12;
                    z13 = z14;
                }
                c1086gP.U();
                androidx.compose.runtime.C c114 = ElevationOverlayKt.f11744b;
                final float f11112 = ((p013b0.f) c1086gP.x(c114)).f20481b + f13;
                final androidx.compose.ui.h hVar17 = hVar2;
                final l0 l0Var18 = l0Var3;
                final long j117 = jH;
                final C0937i c0937i18 = c0937i3;
                final float f11113 = f13;
                final androidx.compose.foundation.interaction.k kVar18 = kVar3;
                final boolean z119 = z13;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c114.b(new p013b0.f(f11112))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                            androidx.compose.ui.h hVar18 = hVar17;
                            O0 o10 = InteractiveComponentSizeKt.f11762a;
                            androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar18.i(MinimumInteractiveModifier.f11774b), l0Var18, SurfaceKt.d(j117, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f11112, interfaceC1084f3), c0937i18, f11113), kVar18, RippleKt.a(0.0f, 7, 0L), z119, null, aVar, 24);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                j12 = jB;
                c0937i2 = c0937i3;
                kVar2 = kVar3;
                f11 = f13;
                l0Var2 = l0Var3;
                z12 = z13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                jH = j;
                c0937i2 = c0937i;
                f11 = f10;
                j12 = j11;
                kVar2 = kVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 805306368;
        if ((i12 & 306783379) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    l0Var3 = h0.f13629a;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 32) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j11;
                }
                if (i17 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i;
                }
                if (i19 != 0) {
                    f12 = 0;
                } else {
                    f12 = f10;
                }
                if (i21 == 0) {
                }
                f13 = f12;
                z13 = z14;
            } else {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    l0Var3 = h0.f13629a;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 32) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j11;
                }
                if (i17 != 0) {
                    c0937i3 = null;
                } else {
                    c0937i3 = c0937i;
                }
                if (i19 != 0) {
                    f12 = 0;
                } else {
                    f12 = f10;
                }
                if (i21 == 0) {
                }
                f13 = f12;
                z13 = z14;
            }
            c1086gP.U();
            androidx.compose.runtime.C c115 = ElevationOverlayKt.f11744b;
            final float f11114 = ((p013b0.f) c1086gP.x(c115)).f20481b + f13;
            final androidx.compose.ui.h hVar18 = hVar2;
            final l0 l0Var19 = l0Var3;
            final long j118 = jH;
            final C0937i c0937i19 = c0937i3;
            final float f11115 = f13;
            final androidx.compose.foundation.interaction.k kVar19 = kVar3;
            final boolean z1110 = z13;
            CompositionLocalKt.b(new C1101n0[]{B7.b.b(jB, ContentColorKt.f11715a), c115.b(new p013b0.f(f11114))}, androidx.compose.runtime.internal.a.b(2031491085, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
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
                        androidx.compose.ui.h hVar19 = hVar18;
                        O0 o10 = InteractiveComponentSizeKt.f11762a;
                        androidx.compose.ui.h hVarB = ClickableKt.b(SurfaceKt.c(hVar19.i(MinimumInteractiveModifier.f11774b), l0Var19, SurfaceKt.d(j118, (y) interfaceC1084f3.x(ElevationOverlayKt.f11743a), f11114, interfaceC1084f3), c0937i19, f11115), kVar19, RippleKt.a(0.0f, 7, 0L), z1110, null, aVar, 24);
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
            j12 = jB;
            c0937i2 = c0937i3;
            kVar2 = kVar3;
            f11 = f13;
            l0Var2 = l0Var3;
            z12 = z13;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            z12 = z10;
            l0Var2 = l0Var;
            jH = j;
            c0937i2 = c0937i;
            f11 = f10;
            j12 = j11;
            kVar2 = kVar;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SurfaceKt.b(aVar, hVar2, z12, l0Var2, jH, j12, c0937i2, f11, kVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final androidx.compose.ui.h c(androidx.compose.ui.h hVar, l0 l0Var, long j, C0937i c0937i, float f10) {
        androidx.compose.ui.h hVarV = P3.d.v(hVar, f10, l0Var, 0L, 0L, 24);
        androidx.compose.ui.h hVarB = androidx.compose.ui.h.a.f13984b;
        if (c0937i != null) {
            hVarB = C0935g.b(hVarB, c0937i.f10065a, c0937i.f10066b, l0Var);
        }
        return A8.p.r(C0932d.b(hVarV.i(hVarB), j, l0Var), l0Var);
    }

    public static final long d(long j, y yVar, float f10, InterfaceC1084f interfaceC1084f) {
        if (!androidx.compose.ui.graphics.H.c(j, ((C1034j) interfaceC1084f.x(ColorsKt.f11693a)).h()) || yVar == null) {
            interfaceC1084f.L(1082990783);
            interfaceC1084f.D();
            return j;
        }
        interfaceC1084f.L(1082922676);
        long jA = yVar.a(j, f10, interfaceC1084f, 0);
        interfaceC1084f.D();
        return jA;
    }
}
