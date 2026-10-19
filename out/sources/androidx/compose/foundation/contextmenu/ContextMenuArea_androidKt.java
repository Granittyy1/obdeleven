package androidx.compose.foundation.contextmenu;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.pointer.B;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ContextMenuArea.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuArea_androidKt {
    /* JADX WARN: Code duplicated, block: B:26:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(final g gVar, final Ia.a<r> aVar, androidx.compose.ui.h hVar, final l<? super ContextMenuScope, r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        boolean z10;
        androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        g.a aVar2;
        boolean zK;
        Object objF;
        C1105p0 c1105p0V2;
        C1086g c1086gP = interfaceC1084f.p(645832757);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(gVar) ? 4 : 2) | i10;
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
                    aVar2 = (g.a) gVar.f9889a.getValue();
                    if (!(aVar2 instanceof g.a.b)) {
                        c1105p0V2 = c1086gP.V();
                        if (c1105p0V2 != null) {
                            final androidx.compose.ui.h hVar4 = hVar3;
                            c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ContextMenuArea_androidKt.a(gVar, aVar, hVar4, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return r.f47939a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    zK = c1086gP.K(aVar2);
                    objF = c1086gP.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                        c1086gP.E(objF);
                    }
                    ContextMenuUi_androidKt.c((e) objF, aVar, hVar3, lVar, c1086gP, i12 & 8176, 0);
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar5 = hVar3;
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuArea_androidKt.a(gVar, aVar, hVar5, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                aVar2 = (g.a) gVar.f9889a.getValue();
                if (!(aVar2 instanceof g.a.b)) {
                    c1105p0V2 = c1086gP.V();
                    if (c1105p0V2 != null) {
                        final androidx.compose.ui.h hVar6 = hVar3;
                        c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ContextMenuArea_androidKt.a(gVar, aVar, hVar6, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                        return;
                    }
                    return;
                }
                zK = c1086gP.K(aVar2);
                objF = c1086gP.f();
                if (zK) {
                    objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                    c1086gP.E(objF);
                } else {
                    objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                    c1086gP.E(objF);
                }
                ContextMenuUi_androidKt.c((e) objF, aVar, hVar3, lVar, c1086gP, i12 & 8176, 0);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar7 = hVar3;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuArea_androidKt.a(gVar, aVar, hVar7, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                aVar2 = (g.a) gVar.f9889a.getValue();
                if (!(aVar2 instanceof g.a.b)) {
                    c1105p0V2 = c1086gP.V();
                    if (c1105p0V2 != null) {
                        final androidx.compose.ui.h hVar8 = hVar3;
                        c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ContextMenuArea_androidKt.a(gVar, aVar, hVar8, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                        return;
                    }
                    return;
                }
                zK = c1086gP.K(aVar2);
                objF = c1086gP.f();
                if (zK) {
                    objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                    c1086gP.E(objF);
                } else {
                    objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                    c1086gP.E(objF);
                }
                ContextMenuUi_androidKt.c((e) objF, aVar, hVar3, lVar, c1086gP, i12 & 8176, 0);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar9 = hVar3;
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuArea_androidKt.a(gVar, aVar, hVar9, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
            aVar2 = (g.a) gVar.f9889a.getValue();
            if (!(aVar2 instanceof g.a.b)) {
                c1105p0V2 = c1086gP.V();
                if (c1105p0V2 != null) {
                    final androidx.compose.ui.h hVar10 = hVar3;
                    c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuArea_androidKt.a(gVar, aVar, hVar10, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                    return;
                }
                return;
            }
            zK = c1086gP.K(aVar2);
            objF = c1086gP.f();
            if (zK) {
                objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                c1086gP.E(objF);
            } else {
                objF = new e(Cb.a.l(((g.a.b) aVar2).f9891a));
                c1086gP.E(objF);
            }
            ContextMenuUi_androidKt.c((e) objF, aVar, hVar3, lVar, c1086gP, i12 & 8176, 0);
        } else {
            c1086gP.w();
            hVar3 = hVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar11 = hVar3;
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuArea_androidKt.a(gVar, aVar, hVar11, lVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0113  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b  */
    /* JADX WARN: Code duplicated, block: B:116:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    public static final void b(final g gVar, final Ia.a<r> aVar, final l<? super ContextMenuScope, r> lVar, androidx.compose.ui.h hVar, boolean z10, Ia.a<r> aVar2, final p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        final boolean z11;
        int i14;
        int i15;
        final Ia.a<r> aVar3;
        int i16;
        int i17;
        boolean z12;
        final androidx.compose.ui.h hVar3;
        final Ia.a<r> aVar4;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        boolean z13;
        androidx.compose.ui.h hVarB;
        int i18;
        Ia.a<ComposeUiNode> aVar5;
        p<ComposeUiNode, Integer, r> pVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(1969259374);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(gVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(lVar) ? 256 : 128;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 3072) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        aVar3 = aVar2;
                        if (c1086gP.k(aVar3)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c1086gP.C(i12 & 1, z12)) {
                        if (i19 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z11;
                        }
                        if (i15 != 0) {
                            aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                                @Override // Ia.a
                                public final /* bridge */ /* synthetic */ r invoke() {
                                    return r.f47939a;
                                }
                            };
                        }
                        if (z13) {
                            c1086gP.L(1021907653);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objF = c1086gP.f();
                            if (z16 || objF == InterfaceC1084f.a.f12980a) {
                                objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(I.d dVar) {
                                        long j = dVar.f3754a;
                                        aVar3.invoke();
                                        g gVar2 = gVar;
                                        gVar2.f9889a.setValue(new g.a.b(j));
                                        return r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(1022064513);
                            c1086gP.T(false);
                            hVarB = hVar4;
                        }
                        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                        i18 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
                        ComposeUiNode.f14331c0.getClass();
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i18))) {
                            J4.i.d(i18, c1086gP, i18, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                        a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                        c1086gP.T(true);
                        aVar4 = aVar3;
                        hVar3 = hVar4;
                        z11 = z13;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        aVar4 = aVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                aVar3 = aVar2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i12 & 1, z12)) {
                    if (i19 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                            @Override // Ia.a
                            public final /* bridge */ /* synthetic */ r invoke() {
                                return r.f47939a;
                            }
                        };
                    }
                    if (z13) {
                        c1086gP.L(1021907653);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objF = c1086gP.f();
                        if (z16) {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1022064513);
                        c1086gP.T(false);
                        hVarB = hVar4;
                    }
                    E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                    pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                    a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                    c1086gP.T(true);
                    aVar4 = aVar3;
                    hVar3 = hVar4;
                    z11 = z13;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    aVar4 = aVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            z11 = z10;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    aVar3 = aVar2;
                    if (c1086gP.k(aVar3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i12 & 1, z12)) {
                    if (i19 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                            @Override // Ia.a
                            public final /* bridge */ /* synthetic */ r invoke() {
                                return r.f47939a;
                            }
                        };
                    }
                    if (z13) {
                        c1086gP.L(1021907653);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objF = c1086gP.f();
                        if (z16) {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1022064513);
                        c1086gP.T(false);
                        hVarB = hVar4;
                    }
                    E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                    a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                    c1086gP.T(true);
                    aVar4 = aVar3;
                    hVar3 = hVar4;
                    z11 = z13;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    aVar4 = aVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            aVar3 = aVar2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                if (i19 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i15 != 0) {
                    aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                if (z13) {
                    c1086gP.L(1021907653);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objF = c1086gP.f();
                    if (z16) {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1022064513);
                    c1086gP.T(false);
                    hVarB = hVar4;
                }
                E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarB);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                c1086gP.T(true);
                aVar4 = aVar3;
                hVar3 = hVar4;
                z11 = z13;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                aVar4 = aVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
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
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    aVar3 = aVar2;
                    if (c1086gP.k(aVar3)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c1086gP.C(i12 & 1, z12)) {
                    if (i19 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z11;
                    }
                    if (i15 != 0) {
                        aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                            @Override // Ia.a
                            public final /* bridge */ /* synthetic */ r invoke() {
                                return r.f47939a;
                            }
                        };
                    }
                    if (z13) {
                        c1086gP.L(1021907653);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objF = c1086gP.f();
                        if (z16) {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(I.d dVar) {
                                    long j = dVar.f3754a;
                                    aVar3.invoke();
                                    g gVar2 = gVar;
                                    gVar2.f9889a.setValue(new g.a.b(j));
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1022064513);
                        c1086gP.T(false);
                        hVarB = hVar4;
                    }
                    E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                    i18 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarB);
                    ComposeUiNode.f14331c0.getClass();
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    } else {
                        J4.i.d(i18, c1086gP, i18, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                    pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                    a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                    c1086gP.T(true);
                    aVar4 = aVar3;
                    hVar3 = hVar4;
                    z11 = z13;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    aVar4 = aVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            aVar3 = aVar2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                if (i19 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i15 != 0) {
                    aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                if (z13) {
                    c1086gP.L(1021907653);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objF = c1086gP.f();
                    if (z16) {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1022064513);
                    c1086gP.T(false);
                    hVarB = hVar4;
                }
                E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarB);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                c1086gP.T(true);
                aVar4 = aVar3;
                hVar3 = hVar4;
                z11 = z13;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                aVar4 = aVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        z11 = z10;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                aVar3 = aVar2;
                if (c1086gP.k(aVar3)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c1086gP.C(i12 & 1, z12)) {
                if (i19 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                if (i15 != 0) {
                    aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ r invoke() {
                            return r.f47939a;
                        }
                    };
                }
                if (z13) {
                    c1086gP.L(1021907653);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objF = c1086gP.f();
                    if (z16) {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(I.d dVar) {
                                long j = dVar.f3754a;
                                aVar3.invoke();
                                g gVar2 = gVar;
                                gVar2.f9889a.setValue(new g.a.b(j));
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1022064513);
                    c1086gP.T(false);
                    hVarB = hVar4;
                }
                E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarB);
                ComposeUiNode.f14331c0.getClass();
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                } else {
                    J4.i.d(i18, c1086gP, i18, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
                a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
                c1086gP.T(true);
                aVar4 = aVar3;
                hVar3 = hVar4;
                z11 = z13;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                aVar4 = aVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        aVar3 = aVar2;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(pVar)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c1086gP.C(i12 & 1, z12)) {
            if (i19 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = z11;
            }
            if (i15 != 0) {
                aVar3 = new Ia.a<r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$1
                    @Override // Ia.a
                    public final /* bridge */ /* synthetic */ r invoke() {
                        return r.f47939a;
                    }
                };
            }
            if (z13) {
                c1086gP.L(1021907653);
                if ((458752 & i12) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i12 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objF = c1086gP.f();
                if (z16) {
                    objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(I.d dVar) {
                            long j = dVar.f3754a;
                            aVar3.invoke();
                            g gVar2 = gVar;
                            gVar2.f9889a.setValue(new g.a.b(j));
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new l<I.d, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$finalModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(I.d dVar) {
                            long j = dVar.f3754a;
                            aVar3.invoke();
                            g gVar2 = gVar;
                            gVar2.f9889a.setValue(new g.a.b(j));
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                hVarB = B.b(hVar4, d.f9874a, new b((l) objF));
                c1086gP.T(false);
            } else {
                c1086gP.L(1022064513);
                c1086gP.T(false);
                hVarB = hVar4;
            }
            E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
            i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i18, c1086gP, i18, pVar2);
            } else {
                J4.i.d(i18, c1086gP, i18, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
            pVar.invoke(c1086gP, Integer.valueOf((i12 >> 18) & 14));
            a(gVar, aVar, null, lVar, c1086gP, (i12 & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 3) & 7168), 4);
            c1086gP.T(true);
            aVar4 = aVar3;
            hVar3 = hVar4;
            z11 = z13;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            aVar4 = aVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt$ContextMenuArea$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenuArea_androidKt.b(gVar, aVar, lVar, hVar3, z11, aVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
