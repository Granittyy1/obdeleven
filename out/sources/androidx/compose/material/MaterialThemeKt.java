package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;

/* JADX INFO: compiled from: MaterialTheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MaterialThemeKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C1034j c1034j, V v10, N n10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1034j c1034j2;
        int i12;
        V v11;
        N n11;
        C1086g c1086g;
        final C1034j c1034j3;
        final N n12;
        final V v12;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-891417079);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                c1034j2 = c1034j;
                if (c1086gP.K(c1034j2)) {
                    i13 = 4;
                }
                i12 = i13 | i10;
            } else {
                c1034j2 = c1034j;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            c1034j2 = c1034j;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                v11 = v10;
                int i14 = c1086gP.K(v11) ? 32 : 16;
                i12 |= i14;
            } else {
                v11 = v10;
            }
            i12 |= i14;
        } else {
            v11 = v10;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                n11 = n10;
                int i15 = c1086gP.K(n11) ? 256 : 128;
                i12 |= i15;
            } else {
                n11 = n10;
            }
            i12 |= i15;
        } else {
            n11 = n10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(pVar) ? 2048 : 1024;
        }
        if (c1086gP.C(i12 & 1, (i12 & 1171) != 1170)) {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if ((i11 & 1) != 0) {
                    c1034j2 = (C1034j) c1086gP.x(ColorsKt.f11693a);
                }
                v12 = (i11 & 2) != 0 ? (V) c1086gP.x(TypographyKt.f11864b) : v11;
                if ((i11 & 4) != 0) {
                    n11 = (N) c1086gP.x(ShapesKt.f11807a);
                }
            } else {
                c1086gP.w();
                v12 = v11;
            }
            c1086gP.U();
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new C1034j(c1034j2.f(), ((androidx.compose.ui.graphics.H) c1034j2.f11890b.getValue()).f13506a, c1034j2.g(), ((androidx.compose.ui.graphics.H) c1034j2.f11892d.getValue()).f13506a, c1034j2.a(), c1034j2.h(), c1034j2.b(), c1034j2.d(), ((androidx.compose.ui.graphics.H) c1034j2.f11897i.getValue()).f13506a, c1034j2.c(), c1034j2.e(), ((androidx.compose.ui.graphics.H) c1034j2.f11899l.getValue()).f13506a, c1034j2.i());
                c1086g = c1086gP;
                c1086g.E(objF);
            } else {
                c1086g = c1086gP;
            }
            C1034j c1034j4 = (C1034j) objF;
            O0 o10 = ColorsKt.f11693a;
            c1034j4.f11889a.setValue(new androidx.compose.ui.graphics.H(c1034j2.f()));
            c1034j4.f11890b.setValue(new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) c1034j2.f11890b.getValue()).f13506a));
            c1034j4.f11891c.setValue(new androidx.compose.ui.graphics.H(c1034j2.g()));
            c1034j4.f11892d.setValue(new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) c1034j2.f11892d.getValue()).f13506a));
            c1034j4.f11893e.setValue(new androidx.compose.ui.graphics.H(c1034j2.a()));
            c1034j4.f11894f.setValue(new androidx.compose.ui.graphics.H(c1034j2.h()));
            c1034j4.f11895g.setValue(new androidx.compose.ui.graphics.H(c1034j2.b()));
            c1034j4.f11896h.setValue(new androidx.compose.ui.graphics.H(c1034j2.d()));
            c1034j4.f11897i.setValue(new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) c1034j2.f11897i.getValue()).f13506a));
            c1034j4.j.setValue(new androidx.compose.ui.graphics.H(c1034j2.c()));
            c1034j4.f11898k.setValue(new androidx.compose.ui.graphics.H(c1034j2.e()));
            c1034j4.f11899l.setValue(new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) c1034j2.f11899l.getValue()).f13506a));
            c1034j4.f11900m.setValue(Boolean.valueOf(c1034j2.i()));
            K kA = RippleKt.a(0.0f, 7, 0L);
            long jF = c1034j4.f();
            long jA = c1034j4.a();
            c1086g.L(1102762852);
            long jA2 = ColorsKt.a(c1034j4, jA);
            long j = jA2 != 16 ? jA2 : ((androidx.compose.ui.graphics.H) c1086g.x(ContentColorKt.f11715a)).f13506a;
            c1086g.T(false);
            N n13 = n11;
            long j10 = ((androidx.compose.ui.graphics.H) c1086g.x(ContentColorKt.f11715a)).f13506a;
            long jB = androidx.compose.ui.graphics.H.b((!((C1034j) c1086g.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j10)) < 0.5d : ((double) Q3.d.D(j10)) > 0.5d) ? 0.6f : 0.74f, j);
            boolean zI = c1086g.i(jF) | c1086g.i(jA) | c1086g.i(jB);
            Object objF2 = c1086g.f();
            float f10 = 1.0f;
            if (zI || objF2 == c0153a) {
                long jF2 = c1034j4.f();
                float fA = G0.a.a(jF, 0.4f, jB, jA);
                float fA2 = G0.a.a(jF, 0.2f, jB, jA);
                float f11 = 0.4f;
                if (fA < 4.5f) {
                    if (fA2 < 4.5f) {
                        f11 = 0.2f;
                    } else {
                        int i16 = 0;
                        float f12 = 0.2f;
                        float f13 = 0.4f;
                        float f14 = 0.4f;
                        int i17 = 7;
                        while (i16 < i17) {
                            int i18 = i17;
                            int i19 = i16;
                            float fA3 = (G0.a.a(jF, f13, jB, jA) / 4.5f) - 1.0f;
                            if (0.0f <= fA3 && fA3 <= 0.01f) {
                                break;
                            }
                            if (fA3 < 0.0f) {
                                f14 = f13;
                            } else {
                                f12 = f13;
                            }
                            f13 = (f14 + f12) / 2.0f;
                            i16 = i19 + 1;
                            i17 = i18;
                        }
                        f11 = f13;
                    }
                }
                objF2 = new androidx.compose.foundation.text.selection.y(jF2, androidx.compose.ui.graphics.H.b(f11, jF));
                c1086g.E(objF2);
            }
            androidx.compose.foundation.text.selection.y yVar = (androidx.compose.foundation.text.selection.y) objF2;
            O0 o11 = ColorsKt.f11693a;
            C1101n0 c1101n0B = o11.b(c1034j4);
            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
            long j11 = ((androidx.compose.ui.graphics.H) c1086g.x(ContentColorKt.f11715a)).f13506a;
            if (!((C1034j) c1086g.x(o11)).i() ? Q3.d.D(j11) >= 0.5d : Q3.d.D(j11) <= 0.5d) {
                f10 = 0.87f;
            }
            C1101n0 c1101n0B2 = c10.b(Float.valueOf(f10));
            C1101n0 c1101n0B3 = IndicationKt.f9774a.b(kA);
            n12 = n13;
            CompositionLocalKt.b(new C1101n0[]{c1101n0B, c1101n0B2, c1101n0B3, ShapesKt.f11807a.b(n12), TextSelectionColorsKt.f11582a.b(yVar), TypographyKt.f11864b.b(v12)}, androidx.compose.runtime.internal.a.b(-1740102967, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
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
                        androidx.compose.ui.text.F f15 = v12.f11874i;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        TextKt.a(f15, androidx.compose.runtime.internal.a.b(181426554, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
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
                                    MaterialTheme_androidKt.a(pVar2, interfaceC1084f5, 0);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 48);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086g), c1086g, 56);
            c1034j3 = c1034j2;
            v11 = v12;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            c1034j3 = c1034j2;
            n12 = n11;
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final V v13 = v11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    MaterialThemeKt.a(c1034j3, v13, n12, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
