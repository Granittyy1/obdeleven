package androidx.compose.ui.layout;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeLayoutKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14210a = new a();

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    public static final void a(final androidx.compose.ui.h hVar, final Ia.p<? super e0, ? super p013b0.a, ? extends F> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if (c1086gP.C(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new SubcomposeLayoutState();
                c1086gP.E(objF);
            }
            b((SubcomposeLayoutState) objF, hVar, pVar, c1086gP, (i12 << 3) & 1008, 0);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubcomposeLayoutKt.a(hVar, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void b(final SubcomposeLayoutState subcomposeLayoutState, androidx.compose.ui.h hVar, final Ia.p<? super e0, ? super p013b0.a, ? extends F> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        int i14;
        Ia.a<LayoutNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2;
        boolean zK;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(subcomposeLayoutState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(pVar)) {
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
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                i14 = c1086gP.f12996P;
                C1086g.b bVarG = c1086gP.G();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                aVar = LayoutNode.f14380S;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(subcomposeLayoutState.f14213c, c1086gP, subcomposeLayoutState);
                R0.a(subcomposeLayoutState.f14214d, c1086gP, bVarG);
                R0.a(subcomposeLayoutState.f14215e, c1086gP, pVar);
                ComposeUiNode.f14331c0.getClass();
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar2);
                }
                c1086gP.T(true);
                if (c1086gP.s()) {
                    c1086gP.L(-26267397);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-26326018);
                    zK = c1086gP.k(subcomposeLayoutState);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:7:0x0026->B:17:0x005c, LOOP_END] */
                            /* JADX WARN: Code duplicated, block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:7:0x0026->B:17:0x005c], SYNTHETIC] */
                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                C1178y c1178yA = subcomposeLayoutState.a();
                                LayoutNode layoutNode = c1178yA.f14259b;
                                if (c1178yA.f14271o != ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d) {
                                    androidx.collection.K<LayoutNode, C1178y.b> k10 = c1178yA.f14264g;
                                    Object[] objArr = k10.f9129c;
                                    long[] jArr = k10.f9127a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i16 = 0;
                                        while (true) {
                                            long j = jArr[i16];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i16 != length) {
                                                    break;
                                                    break;
                                                }
                                                i16++;
                                            } else {
                                                int i17 = 8 - ((~(i16 - length)) >>> 31);
                                                for (int i18 = 0; i18 < i17; i18++) {
                                                    if ((255 & j) < 128) {
                                                        ((C1178y.b) objArr[(i16 << 3) + i18]).f14279d = true;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i17 != 8) {
                                                    break;
                                                }
                                                if (i16 != length) {
                                                    break;
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    if (!layoutNode.D()) {
                                        LayoutNode.f0(layoutNode, false, 7);
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l((Ia.a) objF);
                    c1086gP.T(false);
                }
                hVar2 = hVar3;
            } else {
                c1086gP.w();
                hVar2 = hVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SubcomposeLayoutKt.b(subcomposeLayoutState, hVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(pVar)) {
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
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar;
            }
            i14 = c1086gP.f12996P;
            C1086g.b bVarG2 = c1086gP.G();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar3);
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            aVar = LayoutNode.f14380S;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(subcomposeLayoutState.f14213c, c1086gP, subcomposeLayoutState);
            R0.a(subcomposeLayoutState.f14214d, c1086gP, bVarG2);
            R0.a(subcomposeLayoutState.f14215e, c1086gP, pVar);
            ComposeUiNode.f14331c0.getClass();
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar2);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar2);
            }
            c1086gP.T(true);
            if (c1086gP.s()) {
                c1086gP.L(-26326018);
                zK = c1086gP.k(subcomposeLayoutState);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:7:0x0026->B:17:0x005c, LOOP_END] */
                        /* JADX WARN: Code duplicated, block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:7:0x0026->B:17:0x005c], SYNTHETIC] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C1178y c1178yA = subcomposeLayoutState.a();
                            LayoutNode layoutNode = c1178yA.f14259b;
                            if (c1178yA.f14271o != ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d) {
                                androidx.collection.K<LayoutNode, C1178y.b> k10 = c1178yA.f14264g;
                                Object[] objArr = k10.f9129c;
                                long[] jArr = k10.f9127a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j = jArr[i16];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i16 != length) {
                                                break;
                                                break;
                                            }
                                            i16++;
                                        } else {
                                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                                            for (int i18 = 0; i18 < i17; i18++) {
                                                if ((255 & j) < 128) {
                                                    ((C1178y.b) objArr[(i16 << 3) + i18]).f14279d = true;
                                                }
                                                j >>= 8;
                                            }
                                            if (i17 != 8) {
                                                break;
                                            }
                                            if (i16 != length) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                }
                                if (!layoutNode.D()) {
                                    LayoutNode.f0(layoutNode, false, 7);
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:7:0x0026->B:17:0x005c, LOOP_END] */
                        /* JADX WARN: Code duplicated, block: B:23:0x005f A[EDGE_INSN: B:23:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:7:0x0026->B:17:0x005c], SYNTHETIC] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C1178y c1178yA = subcomposeLayoutState.a();
                            LayoutNode layoutNode = c1178yA.f14259b;
                            if (c1178yA.f14271o != ((androidx.compose.runtime.collection.c.a) layoutNode.B()).f12946b.f12945d) {
                                androidx.collection.K<LayoutNode, C1178y.b> k10 = c1178yA.f14264g;
                                Object[] objArr = k10.f9129c;
                                long[] jArr = k10.f9127a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j = jArr[i16];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i16 != length) {
                                                break;
                                                break;
                                            }
                                            i16++;
                                        } else {
                                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                                            for (int i18 = 0; i18 < i17; i18++) {
                                                if ((255 & j) < 128) {
                                                    ((C1178y.b) objArr[(i16 << 3) + i18]).f14279d = true;
                                                }
                                                j >>= 8;
                                            }
                                            if (i17 != 8) {
                                                break;
                                            }
                                            if (i16 != length) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                }
                                if (!layoutNode.D()) {
                                    LayoutNode.f0(layoutNode, false, 7);
                                }
                            }
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                androidx.compose.runtime.B b11 = androidx.compose.runtime.E.f12831a;
                c1086gP.l((Ia.a) objF);
                c1086gP.T(false);
            } else {
                c1086gP.L(-26267397);
                c1086gP.T(false);
            }
            hVar2 = hVar3;
        } else {
            c1086gP.w();
            hVar2 = hVar;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SubcomposeLayoutKt.b(subcomposeLayoutState, hVar2, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
