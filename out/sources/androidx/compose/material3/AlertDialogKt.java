package androidx.compose.material3;

import B.C0610e;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12034a = 280;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12035b = 560;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12036c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12037d = 12;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12041h;

    static {
        float f10 = 24;
        f12038e = new androidx.compose.foundation.layout.N(f10, f10, f10, f10);
        float f11 = 16;
        f12039f = PaddingKt.b(0.0f, 0.0f, 0.0f, f11, 7);
        f12040g = PaddingKt.b(0.0f, 0.0f, 0.0f, f11, 7);
        f12041h = PaddingKt.b(0.0f, 0.0f, 0.0f, f10, 7);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:118:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:124:0x015b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0166  */
    /* JADX WARN: Code duplicated, block: B:134:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x017a  */
    /* JADX WARN: Code duplicated, block: B:136:0x017f  */
    /* JADX WARN: Code duplicated, block: B:140:0x01db  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void a(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final androidx.compose.ui.graphics.l0 l0Var, final long j, final float f10, final long j10, final long j11, final long j12, final long j13, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.ui.h hVar3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1522575799);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i13 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                if (c1086gP.k(pVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c1086gP.k(pVar4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(l0Var)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.i(j)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f10)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((i12 & 256) != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.i(j10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i13 |= i20;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.i(j11)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.i(j12)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i22 |= 48;
                } else if ((i11 & 48) == 0) {
                    i22 |= c1086gP.i(j13) ? 32 : 16;
                }
                if ((306783379 & i13) != 306783378 && (i22 & 19) == 18 && c1086gP.s()) {
                    c1086gP.w();
                    hVar4 = hVar2;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    int i25 = i13 >> 12;
                    SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                        /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                        /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                        /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                        /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                        /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                        /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                            androidx.compose.ui.layout.E eD;
                            int iF;
                            InterfaceC1089h0 interfaceC1089h0Z;
                            androidx.compose.ui.h hVarC;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar2;
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar3;
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar4;
                                long j14 = j11;
                                long j15 = j12;
                                long j16 = j13;
                                long j17 = j10;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF2 = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                                R0.a(pVar12, interfaceC1084f3, c0953mA);
                                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                                R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m()) {
                                    pVar5 = pVar13;
                                    pVar6 = pVar12;
                                } else {
                                    pVar5 = pVar13;
                                    pVar6 = pVar12;
                                    if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                    }
                                    pVar7 = ComposeUiNode.Companion.f14335d;
                                    R0.a(pVar7, interfaceC1084f3, hVarC2);
                                    C0955o c0955o = C0955o.f10310a;
                                    interfaceC1084f3.L(-1924971291);
                                    if (pVar8 != null) {
                                        CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                            final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                    interfaceC1084f5.w();
                                                } else {
                                                    androidx.compose.ui.h hVarB = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                    int iF3 = interfaceC1084f5.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f5.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f5.r();
                                                    if (interfaceC1084f5.m()) {
                                                        interfaceC1084f5.v(aVar3);
                                                    } else {
                                                        interfaceC1084f5.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                        androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                    androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 56);
                                    }
                                    interfaceC1084f3.D();
                                    interfaceC1084f3.L(-1924961479);
                                    if (pVar9 == null) {
                                        ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                            final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                    interfaceC1084f5.w();
                                                } else {
                                                    androidx.compose.ui.h hVarB = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                    int iF3 = interfaceC1084f5.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f5.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f5.r();
                                                    if (interfaceC1084f5.m()) {
                                                        interfaceC1084f5.v(aVar3);
                                                    } else {
                                                        interfaceC1084f5.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                        androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                    androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 384);
                                    }
                                    interfaceC1084f3.D();
                                    interfaceC1084f3.L(-1924936431);
                                    if (pVar10 != null) {
                                        ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                            final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                    interfaceC1084f5.w();
                                                } else {
                                                    InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                    androidx.compose.ui.h hVarB = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                    int iF3 = interfaceC1084f5.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f5.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f5.r();
                                                    if (interfaceC1084f5.m()) {
                                                        interfaceC1084f5.v(aVar3);
                                                    } else {
                                                        interfaceC1084f5.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                        androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                    androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 384);
                                    }
                                    interfaceC1084f3.D();
                                    androidx.compose.ui.h hVarB = c0955o.b(aVar, androidx.compose.ui.d.a.f13348o);
                                    eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    iF = interfaceC1084f3.F();
                                    interfaceC1089h0Z = interfaceC1084f3.z();
                                    hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                                    if (interfaceC1084f3.u() != null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(pVar6, interfaceC1084f3, eD);
                                    R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                    }
                                    R0.a(pVar7, interfaceC1084f3, hVarC);
                                    ShapeKeyTokens shapeKeyTokens = C0610e.f1258a;
                                    ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                    interfaceC1084f3.J();
                                    interfaceC1084f3.J();
                                }
                                androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                                pVar7 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar7, interfaceC1084f3, hVarC2);
                                C0955o c0955o2 = C0955o.f10310a;
                                interfaceC1084f3.L(-1924971291);
                                if (pVar8 != null) {
                                    CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB2 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924961479);
                                if (pVar9 == null) {
                                    ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB2 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924936431);
                                if (pVar10 != null) {
                                    ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                androidx.compose.ui.h hVarB2 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                androidx.compose.ui.h hVarB2 = c0955o2.b(aVar, androidx.compose.ui.d.a.f13348o);
                                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar6, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m()) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                } else {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                }
                                R0.a(pVar7, interfaceC1084f3, hVarC);
                                ShapeKeyTokens shapeKeyTokens2 = C0610e.f1258a;
                                ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                                interfaceC1084f3.J();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i25 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i25 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AlertDialogKt.a(pVar, hVar4, pVar2, pVar3, pVar4, l0Var, j, f10, j10, j11, j12, j13, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.i(j10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.i(j11)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                i22 |= 48;
            } else if ((i11 & 48) == 0) {
                i22 |= c1086gP.i(j13) ? 32 : 16;
            }
            if ((306783379 & i13) != 306783378) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                int i26 = i13 >> 12;
                SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                            final Ia.p pVar8 = pVar2;
                            final Ia.p pVar9 = pVar3;
                            final Ia.p pVar10 = pVar4;
                            long j14 = j11;
                            long j15 = j12;
                            long j16 = j13;
                            long j17 = j10;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar12, interfaceC1084f3, c0953mA);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                            } else {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar7 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar7, interfaceC1084f3, hVarC2);
                                C0955o c0955o2 = C0955o.f10310a;
                                interfaceC1084f3.L(-1924971291);
                                if (pVar8 != null) {
                                    CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB2 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924961479);
                                if (pVar9 == null) {
                                    ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB2 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924936431);
                                if (pVar10 != null) {
                                    ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                androidx.compose.ui.h hVarB2 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                androidx.compose.ui.h hVarB2 = c0955o2.b(aVar, androidx.compose.ui.d.a.f13348o);
                                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB2);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar6, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                }
                                R0.a(pVar7, interfaceC1084f3, hVarC);
                                ShapeKeyTokens shapeKeyTokens2 = C0610e.f1258a;
                                ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o3 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB3 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB3 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB3 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB3 = c0955o3.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB3);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens3 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i26 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                hVar4 = hVar3;
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                int i27 = i13 >> 12;
                SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                            final Ia.p pVar8 = pVar2;
                            final Ia.p pVar9 = pVar3;
                            final Ia.p pVar10 = pVar4;
                            long j14 = j11;
                            long j15 = j12;
                            long j16 = j13;
                            long j17 = j10;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar12, interfaceC1084f3, c0953mA);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                            } else {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar7 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar7, interfaceC1084f3, hVarC2);
                                C0955o c0955o3 = C0955o.f10310a;
                                interfaceC1084f3.L(-1924971291);
                                if (pVar8 != null) {
                                    CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB3 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924961479);
                                if (pVar9 == null) {
                                    ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB3 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924936431);
                                if (pVar10 != null) {
                                    ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                androidx.compose.ui.h hVarB3 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB3);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                androidx.compose.ui.h hVarB3 = c0955o3.b(aVar, androidx.compose.ui.d.a.f13348o);
                                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB3);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar6, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                }
                                R0.a(pVar7, interfaceC1084f3, hVarC);
                                ShapeKeyTokens shapeKeyTokens3 = C0610e.f1258a;
                                ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o4 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB4 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB4 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB4 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB4 = c0955o4.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB4);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens4 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i27 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.a(pVar, hVar4, pVar2, pVar3, pVar4, l0Var, j, f10, j10, j11, j12, j13, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        hVar2 = hVar;
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            if (c1086gP.k(pVar2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(pVar3)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c1086gP.k(pVar4)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i13 |= i16;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(l0Var)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.i(j)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        if ((i12 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((i12 & 256) != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.i(j10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i13 |= i20;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.i(j11)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.i(j12)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i12 & 2048) != 0) {
                i22 |= 48;
            } else if ((i11 & 48) == 0) {
                i22 |= c1086gP.i(j13) ? 32 : 16;
            }
            if ((306783379 & i13) != 306783378) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                int i28 = i13 >> 12;
                SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                            final Ia.p pVar8 = pVar2;
                            final Ia.p pVar9 = pVar3;
                            final Ia.p pVar10 = pVar4;
                            long j14 = j11;
                            long j15 = j12;
                            long j16 = j13;
                            long j17 = j10;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar12, interfaceC1084f3, c0953mA);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                            } else {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar7 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar7, interfaceC1084f3, hVarC2);
                                C0955o c0955o4 = C0955o.f10310a;
                                interfaceC1084f3.L(-1924971291);
                                if (pVar8 != null) {
                                    CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB4 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924961479);
                                if (pVar9 == null) {
                                    ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB4 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924936431);
                                if (pVar10 != null) {
                                    ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                androidx.compose.ui.h hVarB4 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB4);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                androidx.compose.ui.h hVarB4 = c0955o4.b(aVar, androidx.compose.ui.d.a.f13348o);
                                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB4);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar6, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                }
                                R0.a(pVar7, interfaceC1084f3, hVarC);
                                ShapeKeyTokens shapeKeyTokens4 = C0610e.f1258a;
                                ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o5 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB5 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB5 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB5 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB5 = c0955o5.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB5);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens5 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i28 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                hVar4 = hVar3;
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                int i29 = i13 >> 12;
                SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                    /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                        androidx.compose.ui.layout.E eD;
                        int iF;
                        InterfaceC1089h0 interfaceC1089h0Z;
                        androidx.compose.ui.h hVarC;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                            final Ia.p pVar8 = pVar2;
                            final Ia.p pVar9 = pVar3;
                            final Ia.p pVar10 = pVar4;
                            long j14 = j11;
                            long j15 = j12;
                            long j16 = j13;
                            long j17 = j10;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF2 = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                            R0.a(pVar12, interfaceC1084f3, c0953mA);
                            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                            R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m()) {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                            } else {
                                pVar5 = pVar13;
                                pVar6 = pVar12;
                                if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                                }
                                pVar7 = ComposeUiNode.Companion.f14335d;
                                R0.a(pVar7, interfaceC1084f3, hVarC2);
                                C0955o c0955o5 = C0955o.f10310a;
                                interfaceC1084f3.L(-1924971291);
                                if (pVar8 != null) {
                                    CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB5 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924961479);
                                if (pVar9 == null) {
                                    ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.ui.h hVarB5 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.L(-1924936431);
                                if (pVar10 != null) {
                                    ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                        final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                InterfaceC0954n interfaceC0954n = this.$this_Column;
                                                androidx.compose.ui.h hVarB5 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF3 = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB5);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f5.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f5.r();
                                                if (interfaceC1084f5.m()) {
                                                    interfaceC1084f5.v(aVar3);
                                                } else {
                                                    interfaceC1084f5.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                    androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                                androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 384);
                                }
                                interfaceC1084f3.D();
                                androidx.compose.ui.h hVarB5 = c0955o5.b(aVar, androidx.compose.ui.d.a.f13348o);
                                eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                iF = interfaceC1084f3.F();
                                interfaceC1089h0Z = interfaceC1084f3.z();
                                hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB5);
                                if (interfaceC1084f3.u() != null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(pVar6, interfaceC1084f3, eD);
                                R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                }
                                R0.a(pVar7, interfaceC1084f3, hVarC);
                                ShapeKeyTokens shapeKeyTokens5 = C0610e.f1258a;
                                ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                                interfaceC1084f3.J();
                                interfaceC1084f3.J();
                            }
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o6 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB6 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB6 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB6 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB6 = c0955o6.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB6);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m()) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            } else {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens6 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i29 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i29 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.a(pVar, hVar4, pVar2, pVar3, pVar4, l0Var, j, f10, j10, j11, j12, j13, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 12582912;
        if ((i12 & 256) != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.i(j10)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i13 |= i20;
        }
        if ((i12 & 512) != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.i(j11)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i13 |= i21;
        }
        if ((i12 & 1024) != 0) {
            i22 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.i(j12)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i11 | i23;
        } else {
            i22 = i11;
        }
        if ((i12 & 2048) != 0) {
            i22 |= 48;
        } else if ((i11 & 48) == 0) {
            i22 |= c1086gP.i(j13) ? 32 : 16;
        }
        if ((306783379 & i13) != 306783378) {
            if (i24 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            int i210 = i13 >> 12;
            SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                    androidx.compose.ui.layout.E eD;
                    int iF;
                    InterfaceC1089h0 interfaceC1089h0Z;
                    androidx.compose.ui.h hVarC;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                        final Ia.p pVar8 = pVar2;
                        final Ia.p pVar9 = pVar3;
                        final Ia.p pVar10 = pVar4;
                        long j14 = j11;
                        long j15 = j12;
                        long j16 = j13;
                        long j17 = j10;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF2 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar12, interfaceC1084f3, c0953mA);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m()) {
                            pVar5 = pVar13;
                            pVar6 = pVar12;
                        } else {
                            pVar5 = pVar13;
                            pVar6 = pVar12;
                            if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                            }
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o6 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB6 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB6 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB6 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB6);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB6 = c0955o6.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB6);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens6 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                        pVar7 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar7, interfaceC1084f3, hVarC2);
                        C0955o c0955o7 = C0955o.f10310a;
                        interfaceC1084f3.L(-1924971291);
                        if (pVar8 != null) {
                            CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB7 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.L(-1924961479);
                        if (pVar9 == null) {
                            ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB7 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.L(-1924936431);
                        if (pVar10 != null) {
                            ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        InterfaceC0954n interfaceC0954n = this.$this_Column;
                                        androidx.compose.ui.h hVarB7 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        interfaceC1084f3.D();
                        androidx.compose.ui.h hVarB7 = c0955o7.b(aVar, androidx.compose.ui.d.a.f13348o);
                        eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        iF = interfaceC1084f3.F();
                        interfaceC1089h0Z = interfaceC1084f3.z();
                        hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB7);
                        if (interfaceC1084f3.u() != null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar6, interfaceC1084f3, eD);
                        R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                        if (interfaceC1084f3.m()) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                        } else {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                        }
                        R0.a(pVar7, interfaceC1084f3, hVarC);
                        ShapeKeyTokens shapeKeyTokens7 = C0610e.f1258a;
                        ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                        interfaceC1084f3.J();
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i210 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i210 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
            hVar4 = hVar3;
        } else {
            if (i24 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            int i211 = i13 >> 12;
            SurfaceKt.a(hVar3, l0Var, j, 0L, f10, 0.0f, null, androidx.compose.runtime.internal.a.b(-2126308228, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
                /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
                /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:36:0x0137  */
                /* JADX WARN: Code duplicated, block: B:38:0x0140  */
                /* JADX WARN: Code duplicated, block: B:40:0x0148  */
                /* JADX WARN: Code duplicated, block: B:45:0x0168  */
                /* JADX WARN: Code duplicated, block: B:49:0x0187  */
                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5;
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6;
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7;
                    androidx.compose.ui.layout.E eD;
                    int iF;
                    InterfaceC1089h0 interfaceC1089h0Z;
                    androidx.compose.ui.h hVarC;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarE = PaddingKt.e(aVar, AlertDialogKt.f12038e);
                        final Ia.p pVar8 = pVar2;
                        final Ia.p pVar9 = pVar3;
                        final Ia.p pVar10 = pVar4;
                        long j14 = j11;
                        long j15 = j12;
                        long j16 = j13;
                        long j17 = j10;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF2 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarE);
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
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar12 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar12, interfaceC1084f3, c0953mA);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar13 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar13, interfaceC1084f3, interfaceC1089h0Z2);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m()) {
                            pVar5 = pVar13;
                            pVar6 = pVar12;
                        } else {
                            pVar5 = pVar13;
                            pVar6 = pVar12;
                            if (!kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                            }
                            pVar7 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar7, interfaceC1084f3, hVarC2);
                            C0955o c0955o7 = C0955o.f10310a;
                            interfaceC1084f3.L(-1924971291);
                            if (pVar8 != null) {
                                CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB7 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924961479);
                            if (pVar9 == null) {
                                ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            androidx.compose.ui.h hVarB7 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            interfaceC1084f3.L(-1924936431);
                            if (pVar10 != null) {
                                ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                    final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            InterfaceC0954n interfaceC0954n = this.$this_Column;
                                            androidx.compose.ui.h hVarB7 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                            androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                            int iF3 = interfaceC1084f5.F();
                                            InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB7);
                                            ComposeUiNode.f14331c0.getClass();
                                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                            if (interfaceC1084f5.u() == null) {
                                                I.b.k();
                                                throw null;
                                            }
                                            interfaceC1084f5.r();
                                            if (interfaceC1084f5.m()) {
                                                interfaceC1084f5.v(aVar3);
                                            } else {
                                                interfaceC1084f5.A();
                                            }
                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                            if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                                androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                            }
                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                            androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 384);
                            }
                            interfaceC1084f3.D();
                            androidx.compose.ui.h hVarB7 = c0955o7.b(aVar, androidx.compose.ui.d.a.f13348o);
                            eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            iF = interfaceC1084f3.F();
                            interfaceC1089h0Z = interfaceC1084f3.z();
                            hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB7);
                            if (interfaceC1084f3.u() != null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar2);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(pVar6, interfaceC1084f3, eD);
                            R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                            }
                            R0.a(pVar7, interfaceC1084f3, hVarC);
                            ShapeKeyTokens shapeKeyTokens7 = C0610e.f1258a;
                            ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                            interfaceC1084f3.J();
                            interfaceC1084f3.J();
                        }
                        androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar14);
                        pVar7 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar7, interfaceC1084f3, hVarC2);
                        C0955o c0955o8 = C0955o.f10310a;
                        interfaceC1084f3.L(-1924971291);
                        if (pVar8 != null) {
                            CompositionLocalKt.a(B7.b.b(j14, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(934657765, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB8 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12039f), androidx.compose.ui.d.a.f13347n);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar8;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB8);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.L(-1924961479);
                        if (pVar9 == null) {
                            ProvideContentColorTextStyleKt.a(j15, TypographyKt.a(C0610e.f1260c, interfaceC1084f3), androidx.compose.runtime.internal.a.b(434448772, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB8 = this.$this_Column.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, AlertDialogKt.f12040g), pVar8 == null ? androidx.compose.ui.d.a.f13346m : androidx.compose.ui.d.a.f13347n);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar9;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB8);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.L(-1924936431);
                        if (pVar10 != null) {
                            ProvideContentColorTextStyleKt.a(j16, TypographyKt.a(C0610e.f1262e, interfaceC1084f3), androidx.compose.runtime.internal.a.b(-796843771, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                final /* synthetic */ InterfaceC0954n $this_Column = C0955o.f10310a;

                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        InterfaceC0954n interfaceC0954n = this.$this_Column;
                                        androidx.compose.ui.h hVarB8 = interfaceC0954n.b(PaddingKt.e(interfaceC0954n.a(false), AlertDialogKt.f12041h), androidx.compose.ui.d.a.f13346m);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar10;
                                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f5, hVarB8);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD2);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar16);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC3);
                                        androidx.compose.foundation.gestures.d.c(pVar15, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 384);
                        }
                        interfaceC1084f3.D();
                        androidx.compose.ui.h hVarB8 = c0955o8.b(aVar, androidx.compose.ui.d.a.f13348o);
                        eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        iF = interfaceC1084f3.F();
                        interfaceC1089h0Z = interfaceC1084f3.z();
                        hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB8);
                        if (interfaceC1084f3.u() != null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar6, interfaceC1084f3, eD);
                        R0.a(pVar5, interfaceC1084f3, interfaceC1089h0Z);
                        if (interfaceC1084f3.m()) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                        } else {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                        }
                        R0.a(pVar7, interfaceC1084f3, hVarC);
                        ShapeKeyTokens shapeKeyTokens8 = C0610e.f1258a;
                        ProvideContentColorTextStyleKt.a(j17, TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3), pVar11, interfaceC1084f3, 0);
                        interfaceC1084f3.J();
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, ((i13 >> 3) & 14) | 12582912 | (i211 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211 & 896) | ((i13 >> 9) & 57344), R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.a(pVar, hVar4, pVar2, pVar3, pVar4, l0Var, j, f10, j10, j11, j12, j13, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final float f10, final float f11, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(586821353);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.g(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.g(f11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean z10 = ((i11 & 14) == 4) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    public static final void a(ArrayList arrayList, Ref$IntRef ref$IntRef, androidx.compose.ui.layout.H h8, float f12, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef2, ArrayList arrayList4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                        if (!arrayList.isEmpty()) {
                            ref$IntRef.element = h8.e1(f12) + ref$IntRef.element;
                        }
                        arrayList.add(0, kotlin.collections.q.o0(arrayList2));
                        arrayList3.add(Integer.valueOf(ref$IntRef2.element));
                        arrayList4.add(Integer.valueOf(ref$IntRef.element));
                        ref$IntRef.element += ref$IntRef2.element;
                        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
                        arrayList2.clear();
                        ref$IntRef4.element = 0;
                        ref$IntRef2.element = 0;
                    }

                    /* JADX WARN: Code duplicated, block: B:9:0x005c  */
                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
                        Ref$IntRef ref$IntRef;
                        androidx.compose.ui.layout.Y y10;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            int i13 = i12;
                            if (i13 >= size) {
                                break;
                            }
                            androidx.compose.ui.layout.Y yQ = list.get(i13).Q(j);
                            boolean zIsEmpty = arrayList4.isEmpty();
                            Ref$IntRef ref$IntRef6 = ref$IntRef2;
                            float f12 = f10;
                            if (zIsEmpty) {
                                ref$IntRef = ref$IntRef4;
                                y10 = yQ;
                            } else {
                                if (h8.e1(f12) + ref$IntRef4.element + yQ.f14220b <= p013b0.a.h(j)) {
                                    ref$IntRef = ref$IntRef4;
                                    y10 = yQ;
                                } else {
                                    ArrayList arrayList5 = arrayList;
                                    y10 = yQ;
                                    ref$IntRef = ref$IntRef4;
                                    a(arrayList5, ref$IntRef3, h8, f11, arrayList4, arrayList2, ref$IntRef5, arrayList3, ref$IntRef6, ref$IntRef);
                                }
                            }
                            Ref$IntRef ref$IntRef7 = ref$IntRef;
                            if (!arrayList4.isEmpty()) {
                                ref$IntRef7.element = h8.e1(f12) + ref$IntRef7.element;
                            }
                            ArrayList arrayList6 = arrayList4;
                            arrayList6.add(y10);
                            ref$IntRef7.element += y10.f14220b;
                            ref$IntRef5 = ref$IntRef5;
                            ref$IntRef5.element = Math.max(ref$IntRef5.element, y10.f14221c);
                            i12 = i13 + 1;
                            arrayList4 = arrayList6;
                            ref$IntRef4 = ref$IntRef7;
                            arrayList = arrayList;
                            ref$IntRef2 = ref$IntRef6;
                            size = size;
                            ref$IntRef3 = ref$IntRef3;
                        }
                        ArrayList arrayList7 = arrayList4;
                        Ref$IntRef ref$IntRef8 = ref$IntRef3;
                        final ArrayList arrayList8 = arrayList;
                        Ref$IntRef ref$IntRef9 = ref$IntRef2;
                        Ref$IntRef ref$IntRef10 = ref$IntRef4;
                        if (!arrayList7.isEmpty()) {
                            a(arrayList8, ref$IntRef8, h8, f11, arrayList7, arrayList2, ref$IntRef5, arrayList3, ref$IntRef9, ref$IntRef10);
                        }
                        final int iMax = Math.max(ref$IntRef9.element, p013b0.a.j(j));
                        int iMax2 = Math.max(ref$IntRef8.element, p013b0.a.i(j));
                        final float f13 = f10;
                        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                                List<List<androidx.compose.ui.layout.Y>> list2 = arrayList8;
                                androidx.compose.ui.layout.H h10 = h8;
                                float f14 = f13;
                                int i14 = iMax;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    List<androidx.compose.ui.layout.Y> list4 = list2.get(i15);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        iArr[i16] = list4.get(i16).f14220b + (i16 < kotlin.collections.l.r(list4) ? h10.e1(f14) : 0);
                                        i16++;
                                    }
                                    C0945e.d dVar = C0945e.f10285b;
                                    int[] iArr2 = new int[size3];
                                    for (int i17 = 0; i17 < size3; i17++) {
                                        iArr2[i17] = 0;
                                    }
                                    dVar.a(h10, i14, iArr, h10.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i18 = 0; i18 < size4; i18++) {
                                        aVar2.d(list4.get(i18), iArr2[i18], list3.get(i15).intValue(), 0.0f);
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            int i13 = ((((i11 >> 6) & 14) << 6) & 896) | 6;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e10);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C7.g.b((i13 >> 6) & 14, pVar, c1086gP, true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.b(f10, f11, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final Ia.a<p293xa.r> aVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, final androidx.compose.ui.graphics.l0 l0Var, final long j, final long j10, final long j11, final long j12, final float f10, final androidx.compose.ui.window.f fVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c1086gP.k(pVar4) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c1086gP.k(pVar5) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c1086gP.K(l0Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c1086gP.i(j) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c1086gP.i(j10) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = (c1086gP.i(j11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c1086gP.i(j12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c1086gP.g(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c1086gP.K(fVar) ? 2048 : 1024;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            d(aVar, hVar, fVar, androidx.compose.runtime.internal.a.b(-1852840226, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
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
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar2;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar7 = pVar;
                        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(1163543932, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    float f11 = AlertDialogKt.f12036c;
                                    float f12 = AlertDialogKt.f12037d;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar6;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar7;
                                    AlertDialogKt.b(f11, f12, androidx.compose.runtime.internal.a.b(1887135077, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                            if ((num3.intValue() & 3) == 2 && interfaceC1084f7.s()) {
                                                interfaceC1084f7.w();
                                            } else {
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar8;
                                                interfaceC1084f7.L(1497073862);
                                                if (pVar10 != null) {
                                                    pVar10.invoke(interfaceC1084f7, 0);
                                                    p293xa.r rVar = p293xa.r.f47939a;
                                                }
                                                interfaceC1084f7.D();
                                                pVar9.invoke(interfaceC1084f7, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f5), interfaceC1084f5, 438);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3);
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar3;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar4;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar5;
                        androidx.compose.ui.graphics.l0 l0Var2 = l0Var;
                        long j13 = j;
                        float f11 = f10;
                        ShapeKeyTokens shapeKeyTokens = C0610e.f1258a;
                        AlertDialogKt.a(composableLambdaImplB, null, pVar8, pVar9, pVar10, l0Var2, j13, f11, ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, interfaceC1084f3), j10, j11, j12, interfaceC1084f3, 6, 0, 2);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i12 & 14) | 3072 | ((i13 >> 3) & 896), 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.c(aVar, pVar, hVar, pVar2, pVar3, pVar4, pVar5, l0Var, j, j10, j11, j12, f10, fVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void d(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, androidx.compose.ui.window.f fVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        final androidx.compose.ui.h hVar2;
        androidx.compose.ui.window.f fVar2;
        final androidx.compose.ui.h hVar3;
        final androidx.compose.ui.window.f fVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1922902937);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.K(fVar)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c1086gP.k(pVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) == 1170 || !c1086gP.s()) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        fVar2 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar2 = fVar;
                    }
                    AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                                final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                                androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                boolean zK = interfaceC1084f3.K(strG);
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            androidx.compose.ui.semantics.t.j(strG, wVar);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    hVar3 = hVar2;
                    fVar3 = fVar2;
                } else {
                    c1086gP.w();
                    hVar3 = hVar;
                    fVar3 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AlertDialogKt.d(aVar, hVar3, fVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) == 1170) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    fVar2 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar2 = fVar;
                }
                AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                            androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            boolean zK = interfaceC1084f3.K(strG);
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.j(strG, wVar);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar3 = hVar2;
                fVar3 = fVar2;
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    fVar2 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar2 = fVar;
                }
                AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                            androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            boolean zK = interfaceC1084f3.K(strG);
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.j(strG, wVar);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar3 = hVar2;
                fVar3 = fVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.d(aVar, hVar3, fVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.K(fVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) == 1170) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    fVar2 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar2 = fVar;
                }
                AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                            androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            boolean zK = interfaceC1084f3.K(strG);
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.j(strG, wVar);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar3 = hVar2;
                fVar3 = fVar2;
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    fVar2 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar2 = fVar;
                }
                AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                            androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            boolean zK = interfaceC1084f3.K(strG);
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.j(strG, wVar);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                hVar3 = hVar2;
                fVar3 = fVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.d(aVar, hVar3, fVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(pVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) == 1170) {
            if (i16 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                fVar2 = new androidx.compose.ui.window.f(7);
            } else {
                fVar2 = fVar;
            }
            AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                        final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                        androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        boolean zK = interfaceC1084f3.K(strG);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.j(strG, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF);
                        }
                        androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            hVar3 = hVar2;
            fVar3 = fVar2;
        } else {
            if (i16 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i13 != 0) {
                fVar2 = new androidx.compose.ui.window.f(7);
            } else {
                fVar2 = fVar;
            }
            AndroidDialog_androidKt.a(aVar, fVar2, androidx.compose.runtime.internal.a.b(905289008, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1
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
                        final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_dialog);
                        androidx.compose.ui.h hVarP = androidx.compose.foundation.layout.W.p(hVar2, AlertDialogKt.f12034a, 0.0f, AlertDialogKt.f12035b, 0.0f, 10);
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        boolean zK = interfaceC1084f3.K(strG);
                        Object objF = interfaceC1084f3.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.j(strG, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF);
                        }
                        androidx.compose.ui.h hVarI = hVarP.i(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF));
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarI);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 14) | 384 | ((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            hVar3 = hVar2;
            fVar3 = fVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.d(aVar, hVar3, fVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
