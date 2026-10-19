package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
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
    public static final androidx.compose.ui.h f12187a = androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, B.n.f1299a);

    /* JADX WARN: Code duplicated, block: B:103:0x016a  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    public static final void a(final Painter painter, final String str, androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        long j10;
        int i13;
        androidx.compose.ui.h hVar3;
        long j11;
        boolean z10;
        Object objF;
        androidx.compose.ui.graphics.A a10;
        androidx.compose.ui.h hVarB;
        androidx.compose.ui.h hVar4;
        long jH;
        boolean z11;
        Object objF2;
        C1105p0 c1105p0V;
        int i14;
        C1086g c1086gP = interfaceC1084f.p(-2142239481);
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
                j10 = j;
                if ((i11 & 8) == 0 || !c1086gP.i(j10)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i12 |= i14;
            } else {
                j10 = j;
            }
            if ((i12 & 1171) == 1170 || !c1086gP.s()) {
                c1086gP.r0();
                i13 = i10 & 1;
                hVar3 = androidx.compose.ui.h.a.f13984b;
                if (i13 != 0 || c1086gP.a0()) {
                    if (i15 != 0) {
                        hVar2 = hVar3;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                }
                j11 = j10;
                c1086gP.U();
                z10 = (((i12 & 7168) ^ 3072) <= 2048 && c1086gP.i(j11)) || (i12 & 3072) == 2048;
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (z10 || objF == c0153a) {
                    if (androidx.compose.ui.graphics.H.c(j11, androidx.compose.ui.graphics.H.f13504l)) {
                        a10 = null;
                    } else {
                        a10 = new androidx.compose.ui.graphics.A(5, j11);
                    }
                    objF = a10;
                    c1086gP.E(objF);
                }
                androidx.compose.ui.graphics.I i16 = (androidx.compose.ui.graphics.I) objF;
                c1086gP.L(-2144891392);
                if (str != null) {
                    if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z11 || objF2 == c0153a) {
                        objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                    hVarB = androidx.compose.ui.semantics.p.b(hVar3, false, (Ia.l) objF2);
                } else {
                    hVarB = hVar3;
                }
                c1086gP.T(false);
                Ia.l<C1235n0, p293xa.r> lVar = InspectableValueKt.f14929a;
                if (I.h.a(painter.h(), 9205357640488583168L)) {
                    hVar3 = f12187a;
                } else {
                    jH = painter.h();
                    if (Float.isInfinite(I.h.d(jH)) && Float.isInfinite(I.h.b(jH))) {
                        hVar3 = f12187a;
                    }
                }
                BoxKt.a(androidx.compose.ui.draw.j.a(hVar2.i(hVar3), painter, null, InterfaceC1161g.a.f14244b, 0.0f, i16, 22).i(hVarB), c1086gP, 0);
                hVar4 = hVar2;
                j10 = j11;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar4;
                final long j12 = j10;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconKt.a(painter, str, hVar5, j12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i10 & 3072) == 0) {
            j10 = j;
            if ((i11 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        } else {
            j10 = j;
        }
        if ((i12 & 1171) == 1170) {
            c1086gP.r0();
            i13 = i10 & 1;
            hVar3 = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i15 != 0) {
                    hVar2 = hVar3;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = hVar3;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            }
            j11 = j10;
            c1086gP.U();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (z10) {
                if (androidx.compose.ui.graphics.H.c(j11, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, j11);
                }
                objF = a10;
                c1086gP.E(objF);
            } else {
                if (androidx.compose.ui.graphics.H.c(j11, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, j11);
                }
                objF = a10;
                c1086gP.E(objF);
            }
            androidx.compose.ui.graphics.I i17 = (androidx.compose.ui.graphics.I) objF;
            c1086gP.L(-2144891392);
            if (str != null) {
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                hVarB = androidx.compose.ui.semantics.p.b(hVar3, false, (Ia.l) objF2);
            } else {
                hVarB = hVar3;
            }
            c1086gP.T(false);
            Ia.l<C1235n0, p293xa.r> lVar2 = InspectableValueKt.f14929a;
            if (I.h.a(painter.h(), 9205357640488583168L)) {
                jH = painter.h();
                if (Float.isInfinite(I.h.d(jH))) {
                    hVar3 = f12187a;
                }
            } else {
                hVar3 = f12187a;
            }
            BoxKt.a(androidx.compose.ui.draw.j.a(hVar2.i(hVar3), painter, null, InterfaceC1161g.a.f14244b, 0.0f, i17, 22).i(hVarB), c1086gP, 0);
            hVar4 = hVar2;
            j10 = j11;
        } else {
            c1086gP.r0();
            i13 = i10 & 1;
            hVar3 = androidx.compose.ui.h.a.f13984b;
            if (i13 != 0) {
                if (i15 != 0) {
                    hVar2 = hVar3;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = hVar3;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            }
            j11 = j10;
            c1086gP.U();
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
            if (z10) {
                if (androidx.compose.ui.graphics.H.c(j11, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, j11);
                }
                objF = a10;
                c1086gP.E(objF);
            } else {
                if (androidx.compose.ui.graphics.H.c(j11, androidx.compose.ui.graphics.H.f13504l)) {
                    a10 = null;
                } else {
                    a10 = new androidx.compose.ui.graphics.A(5, j11);
                }
                objF = a10;
                c1086gP.E(objF);
            }
            androidx.compose.ui.graphics.I i18 = (androidx.compose.ui.graphics.I) objF;
            c1086gP.L(-2144891392);
            if (str != null) {
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11) {
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$1$1
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
                hVarB = androidx.compose.ui.semantics.p.b(hVar3, false, (Ia.l) objF2);
            } else {
                hVarB = hVar3;
            }
            c1086gP.T(false);
            Ia.l<C1235n0, p293xa.r> lVar3 = InspectableValueKt.f14929a;
            if (I.h.a(painter.h(), 9205357640488583168L)) {
                jH = painter.h();
                if (Float.isInfinite(I.h.d(jH))) {
                    hVar3 = f12187a;
                }
            } else {
                hVar3 = f12187a;
            }
            BoxKt.a(androidx.compose.ui.draw.j.a(hVar2.i(hVar3), painter, null, InterfaceC1161g.a.f14244b, 0.0f, i18, 22).i(hVarB), c1086gP, 0);
            hVar4 = hVar2;
            j10 = j11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar6 = hVar4;
            final long j13 = j10;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    IconKt.a(painter, str, hVar6, j13, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(final androidx.compose.ui.graphics.vector.c cVar, final String str, androidx.compose.ui.h hVar, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        long j10;
        androidx.compose.ui.h hVar3;
        long j11;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-126890956);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(str) ? 32 : 16;
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
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j10 = j;
                        int i15 = c1086gP.i(j10) ? 2048 : 1024;
                        i12 |= i15;
                    } else {
                        j10 = j;
                    }
                    i12 |= i15;
                } else {
                    j10 = j;
                }
                if ((i12 & 1171) == 1170 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i11 & 8) != 0) {
                            j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            i12 &= -7169;
                        }
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        hVar3 = hVar2;
                    }
                    j11 = j10;
                    c1086gP.U();
                    a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    j11 = j10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar4 = hVar3;
                    final long j12 = j11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconKt.b(cVar, str, hVar4, j12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            hVar2 = hVar;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j10 = j;
                    if (c1086gP.i(j10)) {
                    }
                    i12 |= i15;
                } else {
                    j10 = j;
                }
                i12 |= i15;
            } else {
                j10 = j;
            }
            if ((i12 & 1171) == 1170) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                }
                j11 = j10;
                c1086gP.U();
                a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                }
                j11 = j10;
                c1086gP.U();
                a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar3;
                final long j13 = j11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconKt.b(cVar, str, hVar5, j13, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
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
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j10 = j;
                    if (c1086gP.i(j10)) {
                    }
                    i12 |= i15;
                } else {
                    j10 = j;
                }
                i12 |= i15;
            } else {
                j10 = j;
            }
            if ((i12 & 1171) == 1170) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                }
                j11 = j10;
                c1086gP.U();
                a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 8) != 0) {
                        j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        i12 &= -7169;
                    }
                }
                j11 = j10;
                c1086gP.U();
                a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar6 = hVar3;
                final long j14 = j11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconKt.b(cVar, str, hVar6, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j10 = j;
                if (c1086gP.i(j10)) {
                }
                i12 |= i15;
            } else {
                j10 = j;
            }
            i12 |= i15;
        } else {
            j10 = j;
        }
        if ((i12 & 1171) == 1170) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            } else {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            }
            j11 = j10;
            c1086gP.U();
            a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            } else {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 8) != 0) {
                    j10 = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    i12 &= -7169;
                }
            }
            j11 = j10;
            c1086gP.U();
            a(androidx.compose.ui.graphics.vector.k.b(cVar, c1086gP), str, hVar3, j11, c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168), 0);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar7 = hVar3;
            final long j15 = j11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconKt$Icon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    IconKt.b(cVar, str, hVar7, j15, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
