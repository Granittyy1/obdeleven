package androidx.compose.foundation.text.selection;

import android.graphics.Bitmap;
import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.SecureFlagPolicy;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void a(final f fVar, final androidx.compose.ui.d dVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c1086gP.K(fVar) : c1086gP.k(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar) ? 256 : 128;
        }
        boolean z10 = true;
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !c1086gP.K(fVar))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objF = c1086gP.f();
            if (z12 || objF == InterfaceC1084f.a.f12980a) {
                objF = new d(dVar, fVar);
                c1086gP.E(objF);
            }
            AndroidPopup_androidKt.a((d) objF, null, new androidx.compose.ui.window.n(false, true, true, SecureFlagPolicy.f15821b, true, false), pVar, c1086gP, ((i11 << 3) & 7168) | 384, 2);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidSelectionHandles_androidKt.a(fVar, dVar, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final f fVar, final boolean z10, final ResolvedTextDirection resolvedTextDirection, final boolean z11, long j, final float f10, final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        long j10;
        final boolean z12;
        C1086g c1086gP = interfaceC1084f.p(-466280168);
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
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(resolvedTextDirection) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.c(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            j10 = j;
            i12 |= ((i11 & 16) == 0 && c1086gP.i(j10)) ? 16384 : 8192;
        } else {
            j10 = j;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i12 |= c1086gP.K(hVar) ? 1048576 : 524288;
        }
        if (c1086gP.C(i12 & 1, (533651 & i12) != 533650)) {
            c1086gP.r0();
            if ((i10 & 1) != 0 && !c1086gP.a0()) {
                c1086gP.w();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                i12 &= -57345;
                j10 = 9205357640488583168L;
            }
            c1086gP.U();
            if (z10) {
                float f11 = n.f11618a;
                z12 = (resolvedTextDirection == ResolvedTextDirection.f15650b && !z11) || (resolvedTextDirection == ResolvedTextDirection.f15651c && z11);
            } else {
                float f12 = n.f11618a;
                z12 = !((resolvedTextDirection == ResolvedTextDirection.f15650b && !z11) || (resolvedTextDirection == ResolvedTextDirection.f15651c && z11));
            }
            androidx.compose.ui.e eVar = z12 ? androidx.compose.ui.a.f13279b : androidx.compose.ui.a.f13278a;
            int i13 = i12 & 14;
            boolean zC = ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | (i13 == 4 || ((i12 & 8) != 0 && c1086gP.k(fVar))) | c1086gP.c(z12);
            Object objF = c1086gP.f();
            if (zC || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        long jA = fVar.a();
                        wVar2.e(n.f11620c, new m(z10 ? Handle.f11114c : Handle.f11115d, jA, z12 ? SelectionHandleAnchor.f11537b : SelectionHandleAnchor.f11539d, (9223372034707292159L & jA) != 9205357640488583168L));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            final androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, false, (Ia.l) objF);
            final Y0 y10 = (Y0) c1086gP.x(CompositionLocalsKt.f14857s);
            final long j11 = j10;
            final boolean z13 = z12;
            a(fVar, eVar, androidx.compose.runtime.internal.a.b(1365123137, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1101n0 c1101n0B = CompositionLocalsKt.f14857s.b(y10);
                        final long j12 = j11;
                        final boolean z14 = z13;
                        final androidx.compose.ui.h hVar2 = hVarB;
                        final f fVar2 = fVar;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1260045569, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j13 = j12;
                                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                                    if (j13 != 9205357640488583168L) {
                                        interfaceC1084f5.L(-837626688);
                                        C0945e.InterfaceC0129e interfaceC0129e = z14 ? C0945e.a.f10293c : C0945e.a.f10291a;
                                        androidx.compose.ui.h hVarK = W.k(hVar2, p013b0.h.b(j12), p013b0.h.a(j12), 0.0f, 0.0f, 12);
                                        final f fVar3 = fVar2;
                                        boolean z15 = z14;
                                        T tA = S.a(interfaceC0129e, androidx.compose.ui.d.a.j, interfaceC1084f5, 0);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarK);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, tA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                        boolean zK = interfaceC1084f5.k(fVar3);
                                        Object objF2 = interfaceC1084f5.f();
                                        if (zK || objF2 == c0153a) {
                                            objF2 = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    return Boolean.valueOf((fVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                }
                                            };
                                            interfaceC1084f5.E(objF2);
                                        }
                                        AndroidSelectionHandles_androidKt.c(aVar2, (Ia.a) objF2, z15, interfaceC1084f5, 6);
                                        interfaceC1084f5.J();
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-836697680);
                                        androidx.compose.ui.h hVar3 = hVar2;
                                        boolean zK2 = interfaceC1084f5.k(fVar2);
                                        final f fVar4 = fVar2;
                                        Object objF3 = interfaceC1084f5.f();
                                        if (zK2 || objF3 == c0153a) {
                                            objF3 = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$2$1
                                                {
                                                    super(0);
                                                }

                                                @Override // Ia.a
                                                public final Boolean invoke() {
                                                    return Boolean.valueOf((fVar4.a() & 9223372034707292159L) != 9205357640488583168L);
                                                }
                                            };
                                            interfaceC1084f5.E(objF3);
                                        }
                                        AndroidSelectionHandles_androidKt.c(hVar3, (Ia.a) objF3, z14, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
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
            }, c1086gP), c1086gP, i13 | 384);
        } else {
            c1086gP.w();
        }
        final long j12 = j10;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidSelectionHandles_androidKt.b(fVar, z10, resolvedTextDirection, z11, j12, f10, hVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.h hVar, final Ia.a<Boolean> aVar, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            Lb.a.a(c1086gP, ComposedModifierKt.a(W.n(n.f11618a, n.f11619b, hVar), InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f2, Integer num) {
                    androidx.compose.ui.h hVar3 = hVar2;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(-196777734);
                    final long j = ((y) interfaceC1084f3.x(TextSelectionColorsKt.f11582a)).f11630a;
                    boolean zI = interfaceC1084f3.i(j) | interfaceC1084f3.K(aVar) | interfaceC1084f3.c(z10);
                    final Ia.a<Boolean> aVar2 = aVar;
                    final boolean z11 = z10;
                    Object objF = interfaceC1084f3.f();
                    if (zI || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.l<CacheDrawScope, androidx.compose.ui.draw.g>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final androidx.compose.ui.draw.g invoke(CacheDrawScope cacheDrawScope) {
                                CacheDrawScope cacheDrawScope2 = cacheDrawScope;
                                final androidx.compose.ui.graphics.W wD = AndroidSelectionHandles_androidKt.d(cacheDrawScope2, Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() >> 32)) / 2.0f);
                                final A a10 = new A(5, j);
                                final Ia.a<Boolean> aVar3 = aVar2;
                                final boolean z12 = z11;
                                return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        if (aVar3.invoke().booleanValue()) {
                                            if (z12) {
                                                androidx.compose.ui.graphics.W w3 = wD;
                                                I i12 = a10;
                                                long jJ1 = cVar2.j1();
                                                J.a.b bVarW0 = cVar2.W0();
                                                long jE = bVarW0.e();
                                                bVarW0.a().g();
                                                try {
                                                    bVarW0.f3948a.f(-1.0f, 1.0f, jJ1);
                                                    cVar2.k1(w3, 0L, 1.0f, J.h.f3954a, i12, 3);
                                                } finally {
                                                    C0936h.f(bVarW0, jE);
                                                }
                                            } else {
                                                cVar2.k1(wD, 0L, 1.0f, J.h.f3954a, a10, 3);
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                });
                            }
                        };
                        interfaceC1084f3.E(objF);
                    }
                    androidx.compose.ui.h hVarB = androidx.compose.ui.draw.f.b(hVar3, (Ia.l) objF);
                    interfaceC1084f3.D();
                    return hVarB;
                }
            }));
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidSelectionHandles_androidKt.c(hVar, aVar, z10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final androidx.compose.ui.graphics.W d(CacheDrawScope cacheDrawScope, float f10) {
        J.a aVar;
        int iCeil = ((int) Math.ceil(f10)) * 2;
        C1141q c1141qA = O3.d.f4814b;
        C1138n c1138nC = O3.d.f4815c;
        J.a aVar2 = O3.d.f4816d;
        if (c1141qA == null || c1138nC == null) {
            c1141qA = S4.o.a(iCeil, iCeil, 1);
            O3.d.f4814b = c1141qA;
            c1138nC = D9.o.c(c1141qA);
            O3.d.f4815c = c1138nC;
        } else {
            Bitmap bitmap = c1141qA.f13790a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c1141qA = S4.o.a(iCeil, iCeil, 1);
                O3.d.f4814b = c1141qA;
                c1138nC = D9.o.c(c1141qA);
                O3.d.f4815c = c1138nC;
            }
        }
        C1141q c1141q = c1141qA;
        C1138n c1138n = c1138nC;
        if (aVar2 == null) {
            aVar = new J.a();
            O3.d.f4816d = aVar;
        } else {
            aVar = aVar2;
        }
        LayoutDirection layoutDirection = cacheDrawScope.f13369b.getLayoutDirection();
        Bitmap bitmap2 = c1141q.f13790a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        J.a.C0049a c0049a = aVar.f3940b;
        p013b0.c cVar = c0049a.f3944a;
        LayoutDirection layoutDirection2 = c0049a.f3945b;
        E e10 = c0049a.f3946c;
        long j = c0049a.f3947d;
        c0049a.f3944a = cacheDrawScope;
        c0049a.f3945b = layoutDirection;
        c0049a.f3946c = c1138n;
        c0049a.f3947d = jFloatToRawIntBits;
        c1138n.g();
        J.e.s0(aVar, H.f13495b, 0L, aVar.j(), 0.0f, 58);
        J.e.s0(aVar, Q3.d.e(4278190080L), 0L, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
        J.a aVar3 = aVar;
        aVar3.S(Q3.d.e(4278190080L), (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(aVar3.j()) / 2.0f : f10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? aVar3.j1() : (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        c1138n.o();
        c0049a.f3944a = cVar;
        c0049a.f3945b = layoutDirection2;
        c0049a.f3946c = e10;
        c0049a.f3947d = j;
        return c1141q;
    }
}
