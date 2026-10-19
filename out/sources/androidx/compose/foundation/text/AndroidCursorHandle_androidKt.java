package androidx.compose.foundation.text;

import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11059b;

    static {
        float f10 = 25;
        f11058a = f10;
        f11059b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(final androidx.compose.foundation.text.selection.f fVar, final androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final long j10;
        C1086g c1086gP = interfaceC1084f.p(1776202187);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c1086gP.K(fVar) : c1086gP.k(fVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j10 = j;
                int i13 = c1086gP.i(j) ? 256 : 128;
                i12 |= i13;
            } else {
                j10 = j;
            }
            i12 |= i13;
        } else {
            j10 = j;
        }
        boolean z10 = true;
        if (c1086gP.C(i12 & 1, (i12 & 147) != 146)) {
            c1086gP.r0();
            if ((i10 & 1) != 0 && !c1086gP.a0()) {
                c1086gP.w();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                i12 &= -897;
                j10 = 9205357640488583168L;
            }
            c1086gP.U();
            int i14 = i12 & 14;
            if (i14 != 4 && ((i12 & 8) == 0 || !c1086gP.k(fVar))) {
                z10 = false;
            }
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        wVar.e(androidx.compose.foundation.text.selection.n.f11620c, new androidx.compose.foundation.text.selection.m(Handle.f11113b, fVar.a(), SelectionHandleAnchor.f11538c, true));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            final androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, false, (Ia.l) objF);
            AndroidSelectionHandles_androidKt.a(fVar, androidx.compose.ui.d.a.f13336b, androidx.compose.runtime.internal.a.b(-1653527038, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (!interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        interfaceC1084f3.w();
                    } else if (j10 != 9205357640488583168L) {
                        interfaceC1084f3.L(1828931592);
                        androidx.compose.ui.h hVarK = W.k(hVarB, p013b0.h.b(j10), p013b0.h.a(j10), 0.0f, 0.0f, 12);
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13336b, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarK);
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
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        AndroidCursorHandle_androidKt.b(null, interfaceC1084f3, 0, 1);
                        interfaceC1084f3.J();
                        interfaceC1084f3.D();
                    } else {
                        interfaceC1084f3.L(1829298756);
                        AndroidCursorHandle_androidKt.b(hVarB, interfaceC1084f3, 0, 0);
                        interfaceC1084f3.D();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i14 | 432);
        } else {
            c1086gP.w();
        }
        final long j11 = j10;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidCursorHandle_androidKt.a(fVar, hVar, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (c1086gP.C(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            Lb.a.a(c1086gP, ComposedModifierKt.a(W.n(f11059b, f11058a, hVar), InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f2, Integer num) {
                    androidx.compose.ui.h hVar3 = hVar2;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(-2126899193);
                    final long j = ((androidx.compose.foundation.text.selection.y) interfaceC1084f3.x(TextSelectionColorsKt.f11582a)).f11630a;
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    boolean zI = interfaceC1084f3.i(j);
                    Object objF = interfaceC1084f3.f();
                    if (zI || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.l<CacheDrawScope, androidx.compose.ui.draw.g>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final androidx.compose.ui.draw.g invoke(CacheDrawScope cacheDrawScope) {
                                CacheDrawScope cacheDrawScope2 = cacheDrawScope;
                                final float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() >> 32)) / 2.0f;
                                final androidx.compose.ui.graphics.W wD = AndroidSelectionHandles_androidKt.d(cacheDrawScope2, fIntBitsToFloat);
                                final androidx.compose.ui.graphics.A a10 = new androidx.compose.ui.graphics.A(5, j);
                                return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        float f10 = fIntBitsToFloat;
                                        androidx.compose.ui.graphics.W w3 = wD;
                                        androidx.compose.ui.graphics.I i14 = a10;
                                        J.a.b bVarW0 = cVar2.W0();
                                        long jE = bVarW0.e();
                                        bVarW0.a().g();
                                        try {
                                            J.b bVar = bVarW0.f3948a;
                                            bVar.g(f10, 0.0f);
                                            androidx.compose.ui.graphics.E eA = ((J.a.b) bVar.f3951b).a();
                                            int i15 = (int) 0;
                                            eA.m(Float.intBitsToFloat(i15), Float.intBitsToFloat(i15));
                                            eA.n();
                                            eA.m(-Float.intBitsToFloat(i15), -Float.intBitsToFloat(i15));
                                            cVar2.k1(w3, 0L, 1.0f, J.h.f3954a, i14, 3);
                                            return p293xa.r.f47939a;
                                        } finally {
                                            C0936h.f(bVarW0, jE);
                                        }
                                    }
                                });
                            }
                        };
                        interfaceC1084f3.E(objF);
                    }
                    androidx.compose.ui.h hVarI = hVar3.i(androidx.compose.ui.draw.f.b(aVar, (Ia.l) objF));
                    interfaceC1084f3.D();
                    return hVarI;
                }
            }));
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidCursorHandle_androidKt.b(hVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
