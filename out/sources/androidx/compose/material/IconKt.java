package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.platform.C1235n0;
import androidx.compose.ui.platform.InspectableValueKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IconKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.h f11757a = W.m(androidx.compose.ui.h.a.f13984b, 24);

    /* JADX WARN: Code duplicated, block: B:100:0x017c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0186  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x015d  */
    public static final void a(final Painter painter, final String str, androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        long jB;
        boolean z10;
        androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        int i13;
        androidx.compose.ui.h hVar4;
        boolean z11;
        Object objF;
        androidx.compose.ui.graphics.A a10;
        androidx.compose.ui.h hVarB;
        long jH;
        boolean z12;
        Object objF2;
        int i14;
        C1086g c1086gP = interfaceC1084f.p(-1142959010);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(painter) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.K(str) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                jB = j;
                if ((i11 & 8) == 0 || !c1086gP.i(jB)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i12 |= i14;
            } else {
                jB = j;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                i13 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i13 != 0 || c1086gP.a0()) {
                    if (i15 != 0) {
                        hVar2 = hVar4;
                    }
                    if ((i11 & 8) != 0) {
                        jB = androidx.compose.ui.graphics.H.b(((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue(), ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a);
                        i12 &= -7169;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                c1086gP.U();
                z11 = (((i12 & 7168) ^ 3072) <= 2048 && c1086gP.i(jB)) || (i12 & 3072) == 2048;
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (z11 || objF == c0153a) {
                    if (androidx.compose.ui.graphics.H.c(jB, androidx.compose.ui.graphics.H.f13504l)) {
                        a10 = null;
                    } else {
                        a10 = new androidx.compose.ui.graphics.A(5, jB);
                    }
                    objF = a10;
                    c1086gP.E(objF);
                }
                androidx.compose.ui.graphics.I i16 = (androidx.compose.ui.graphics.I) objF;
                if (str != null) {
                    c1086gP.L(980491077);
                    if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z12 || objF2 == c0153a) {
                        objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
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
                        c1086gP.E(objF2);
                    }
                    hVarB = androidx.compose.ui.semantics.p.b(hVar4, false, (Ia.l) objF2);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(980649859);
                    c1086gP.T(false);
                    hVarB = hVar4;
                }
                Ia.l<C1235n0, p293xa.r> lVar = InspectableValueKt.f14929a;
                if (I.h.a(painter.h(), 9205357640488583168L)) {
                    hVar4 = f11757a;
                } else {
                    jH = painter.h();
                    if (Float.isInfinite(I.h.d(jH)) && Float.isInfinite(I.h.b(jH))) {
                        hVar4 = f11757a;
                    }
                }
                BoxKt.a(androidx.compose.ui.draw.j.a(hVar2.i(hVar4), painter, null, InterfaceC1161g.a.f14244b, 0.0f, i16, 22).i(hVarB), c1086gP, 0);
                hVar3 = hVar2;
                jB = jB;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar3;
                final long j10 = jB;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconKt.a(painter, str, hVar5, j10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i10 & 3072) == 0) {
            jB = j;
            if ((i11 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        } else {
            jB = j;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            i13 = i10 & 1;
            hVar4 = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i15 != 0) {
                    hVar2 = hVar4;
                }
                if ((i11 & 8) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue(), ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a);
                    i12 &= -7169;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = hVar4;
                }
                if ((i11 & 8) != 0) {
                    jB = androidx.compose.ui.graphics.H.b(((Number) c1086gP.x(ContentAlphaKt.f11713a)).floatValue(), ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f11715a)).f13506a);
                    i12 &= -7169;
                }
            }
            c1086gP.U();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (z11) {
                if (androidx.compose.ui.graphics.H.c(jB, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, jB);
                }
                objF = a10;
                c1086gP.E(objF);
            } else {
                if (androidx.compose.ui.graphics.H.c(jB, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, jB);
                }
                objF = a10;
                c1086gP.E(objF);
            }
            androidx.compose.ui.graphics.I i17 = (androidx.compose.ui.graphics.I) objF;
            if (str != null) {
                c1086gP.L(980491077);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12) {
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
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
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
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
                    c1086gP.E(objF2);
                }
                hVarB = androidx.compose.ui.semantics.p.b(hVar4, false, (Ia.l) objF2);
                c1086gP.T(false);
            } else {
                c1086gP.L(980649859);
                c1086gP.T(false);
                hVarB = hVar4;
            }
            Ia.l<C1235n0, p293xa.r> lVar2 = InspectableValueKt.f14929a;
            if (I.h.a(painter.h(), 9205357640488583168L)) {
                jH = painter.h();
                if (Float.isInfinite(I.h.d(jH))) {
                    hVar4 = f11757a;
                }
            } else {
                hVar4 = f11757a;
            }
            BoxKt.a(androidx.compose.ui.draw.j.a(hVar2.i(hVar4), painter, null, InterfaceC1161g.a.f14244b, 0.0f, i17, 22).i(hVarB), c1086gP, 0);
            hVar3 = hVar2;
            jB = jB;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar6 = hVar3;
            final long j11 = jB;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    IconKt.a(painter, str, hVar6, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
