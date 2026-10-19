package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.h f11657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.h f11658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11661e;

    static {
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        float f10 = 24;
        f11657a = PaddingKt.j(aVar, f10, 0.0f, f10, 0.0f, 10);
        f11658b = PaddingKt.j(aVar, f10, 0.0f, f10, 28, 2);
        f11659c = G0.a.g(40);
        f11660d = G0.a.g(36);
        f11661e = G0.a.g(38);
    }

    public static final void a(final InterfaceC0954n interfaceC0954n, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(-555573207);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(interfaceC0954n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar2) ? 256 : 128;
        }
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            androidx.compose.ui.h hVarA = interfaceC0954n.a(false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.f11662a;
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar3 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar3, c1086gP, alertDialogKt$AlertDialogBaselineLayout$2);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar4 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar4, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar5);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13346m;
            if (pVar == null) {
                c1086gP.L(1317321954);
                c1086gP.T(false);
                z10 = false;
            } else {
                c1086gP.L(1317321955);
                androidx.compose.ui.h hVarB = interfaceC0954n.b(C1171q.b(f11657a, "title"), aVar2);
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, eD);
                R0.a(pVar4, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC2);
                z10 = false;
                pVar.invoke(c1086gP, 0);
                c1086gP.T(true);
                c1086gP.T(false);
            }
            if (pVar2 == null) {
                c1086gP.L(1317454758);
                c1086gP.T(z10);
                z11 = true;
            } else {
                c1086gP.L(1317454759);
                androidx.compose.ui.h hVarB2 = interfaceC0954n.b(C1171q.b(f11658b, AttributeType.TEXT), aVar2);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, z10);
                int i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, eD2);
                R0.a(pVar4, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC3);
                pVar2.invoke(c1086gP, 0);
                z11 = true;
                c1086gP.T(true);
                c1086gP.T(false);
            }
            c1086gP.T(z11);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.a(interfaceC0954n, pVar, pVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f A[PHI: r2 r3 r4 r5 r6 r7
      0x010f: PHI (r2v30 int) = (r2v22 int), (r2v33 int) binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r3v8 androidx.compose.ui.h) = (r3v4 androidx.compose.ui.h), (r3v12 androidx.compose.ui.h) binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r4v13 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>) = 
      (r4v10 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r4v15 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
     binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r5v15 androidx.compose.ui.graphics.l0) = (r5v9 androidx.compose.ui.graphics.l0), (r5v16 androidx.compose.ui.graphics.l0) binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r6v9 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>) = 
      (r6v5 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r6v2 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
     binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r7v13 long) = (r7v7 long), (r7v14 long) binds: [B:119:0x0149, B:99:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0114  */
    /* JADX WARN: Code duplicated, block: B:103:0x0117  */
    /* JADX WARN: Code duplicated, block: B:106:0x011c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0120  */
    /* JADX WARN: Code duplicated, block: B:112:0x0125  */
    /* JADX WARN: Code duplicated, block: B:113:0x0132  */
    /* JADX WARN: Code duplicated, block: B:116:0x0137  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:120:0x014b  */
    /* JADX WARN: Code duplicated, block: B:122:0x018a  */
    /* JADX WARN: Code duplicated, block: B:125:0x019a  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    public static final void b(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, l0 l0Var, long j, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i14;
        int i15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        int i16;
        l0 l0Var2;
        long j11;
        long j12;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        final l0 l0Var3;
        final long j13;
        final long j14;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        long jH;
        long jB;
        C1086g c1086gP = interfaceC1084f.p(-453679601);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    pVar4 = pVar2;
                    if (c1086gP.k(pVar4)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        pVar5 = pVar3;
                        if (c1086gP.k(pVar5)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            l0Var2 = l0Var;
                            int i18 = c1086gP.K(l0Var2) ? 16384 : 8192;
                            i12 |= i18;
                        } else {
                            l0Var2 = l0Var;
                        }
                        i12 |= i18;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            j11 = j;
                            int i19 = c1086gP.i(j11) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            j11 = j;
                        }
                        i12 |= i19;
                    } else {
                        j11 = j;
                    }
                    if ((i10 & 1572864) == 0) {
                        if ((i11 & 64) == 0) {
                            j12 = j10;
                            int i20 = c1086gP.i(j12) ? 1048576 : 524288;
                            i12 |= i20;
                        } else {
                            j12 = j10;
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i17 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar4 = null;
                            }
                            pVar7 = i15 == 0 ? pVar5 : null;
                            if ((i11 & 16) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -57345;
                            } else {
                                l0Var3 = l0Var2;
                            }
                            if ((i11 & 32) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -458753;
                            } else {
                                jH = j11;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                jB = ColorsKt.b(jH, c1086gP);
                            }
                            c1086gP.U();
                            int i21 = ((i12 >> 3) & 14) | 1572864;
                            int i22 = i12 >> 9;
                            SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    ComposableLambdaImpl composableLambdaImplB;
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar4;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar7;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                        ComposableLambdaImpl composableLambdaImplB2 = null;
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
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        C0955o c0955o = C0955o.f10310a;
                                        if (pVar8 == null) {
                                            interfaceC1084f3.L(-366997612);
                                            interfaceC1084f3.D();
                                            composableLambdaImplB = null;
                                        } else {
                                            interfaceC1084f3.L(-366997611);
                                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                        androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                        long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                        C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar8;
                                                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // Ia.p
                                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                                int iIntValue3 = num3.intValue();
                                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                                } else {
                                                                    interfaceC1084f7.w();
                                                                }
                                                                return p293xa.r.f47939a;
                                                            }
                                                        }, interfaceC1084f5), interfaceC1084f5, 56);
                                                    } else {
                                                        interfaceC1084f5.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f3);
                                            interfaceC1084f3.D();
                                        }
                                        if (pVar9 == null) {
                                            interfaceC1084f3.L(-366576167);
                                        } else {
                                            interfaceC1084f3.L(-366576166);
                                            composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                        androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                        long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                        C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar9;
                                                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // Ia.p
                                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                                int iIntValue3 = num3.intValue();
                                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                    TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                                } else {
                                                                    interfaceC1084f7.w();
                                                                }
                                                                return p293xa.r.f47939a;
                                                            }
                                                        }, interfaceC1084f5), interfaceC1084f5, 56);
                                                    } else {
                                                        interfaceC1084f5.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f3);
                                        }
                                        interfaceC1084f3.D();
                                        AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                                        androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, i21 | (i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i22 & 896) | (i22 & 7168), 48);
                            hVar2 = hVar3;
                            pVar6 = pVar4;
                            j13 = jH;
                            j14 = jB;
                        } else {
                            c1086gP.w();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            hVar3 = hVar;
                            pVar7 = pVar5;
                            l0Var3 = l0Var2;
                            jH = j11;
                        }
                        jB = j12;
                        c1086gP.U();
                        int i23 = ((i12 >> 3) & 14) | 1572864;
                        int i24 = i12 >> 9;
                        SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                ComposableLambdaImpl composableLambdaImplB;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    ComposableLambdaImpl composableLambdaImplB2 = null;
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    C0955o c0955o = C0955o.f10310a;
                                    if (pVar8 == null) {
                                        interfaceC1084f3.L(-366997612);
                                        interfaceC1084f3.D();
                                        composableLambdaImplB = null;
                                    } else {
                                        interfaceC1084f3.L(-366997611);
                                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                    androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                    long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                    C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // Ia.p
                                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                            int iIntValue3 = num3.intValue();
                                                            if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                            } else {
                                                                interfaceC1084f7.w();
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }, interfaceC1084f5), interfaceC1084f5, 56);
                                                } else {
                                                    interfaceC1084f5.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3);
                                        interfaceC1084f3.D();
                                    }
                                    if (pVar9 == null) {
                                        interfaceC1084f3.L(-366576167);
                                    } else {
                                        interfaceC1084f3.L(-366576166);
                                        composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                    androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                    long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                    C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // Ia.p
                                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                            int iIntValue3 = num3.intValue();
                                                            if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                            } else {
                                                                interfaceC1084f7.w();
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }, interfaceC1084f5), interfaceC1084f5, 56);
                                                } else {
                                                    interfaceC1084f5.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3);
                                    }
                                    interfaceC1084f3.D();
                                    AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                                    androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i23 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i24 & 896) | (i24 & 7168), 48);
                        hVar2 = hVar3;
                        pVar6 = pVar4;
                        j13 = jH;
                        j14 = jB;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        l0Var3 = l0Var2;
                        j13 = j11;
                        j14 = j12;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                pVar5 = pVar3;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0Var2 = l0Var;
                        if (c1086gP.K(l0Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i19;
                    } else {
                        j11 = j;
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (c1086gP.i(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    } else {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    }
                    c1086gP.U();
                    int i25 = ((i12 >> 3) & 14) | 1572864;
                    int i26 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            ComposableLambdaImpl composableLambdaImplB;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                ComposableLambdaImpl composableLambdaImplB2 = null;
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                C0955o c0955o = C0955o.f10310a;
                                if (pVar8 == null) {
                                    interfaceC1084f3.L(-366997612);
                                    interfaceC1084f3.D();
                                    composableLambdaImplB = null;
                                } else {
                                    interfaceC1084f3.L(-366997611);
                                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                if (pVar9 == null) {
                                    interfaceC1084f3.L(-366576167);
                                } else {
                                    interfaceC1084f3.L(-366576166);
                                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                }
                                interfaceC1084f3.D();
                                AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                                androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i25 | (i26 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 896) | (i26 & 7168), 48);
                    hVar2 = hVar3;
                    pVar6 = pVar4;
                    j13 = jH;
                    j14 = jB;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    l0Var3 = l0Var2;
                    j13 = j11;
                    j14 = j12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            pVar4 = pVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar5 = pVar3;
                    if (c1086gP.k(pVar5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0Var2 = l0Var;
                        if (c1086gP.K(l0Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i19;
                    } else {
                        j11 = j;
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (c1086gP.i(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    } else {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    }
                    c1086gP.U();
                    int i27 = ((i12 >> 3) & 14) | 1572864;
                    int i28 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            ComposableLambdaImpl composableLambdaImplB;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                ComposableLambdaImpl composableLambdaImplB2 = null;
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                C0955o c0955o = C0955o.f10310a;
                                if (pVar8 == null) {
                                    interfaceC1084f3.L(-366997612);
                                    interfaceC1084f3.D();
                                    composableLambdaImplB = null;
                                } else {
                                    interfaceC1084f3.L(-366997611);
                                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                if (pVar9 == null) {
                                    interfaceC1084f3.L(-366576167);
                                } else {
                                    interfaceC1084f3.L(-366576166);
                                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                }
                                interfaceC1084f3.D();
                                AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                                androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i27 | (i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i28 & 896) | (i28 & 7168), 48);
                    hVar2 = hVar3;
                    pVar6 = pVar4;
                    j13 = jH;
                    j14 = jB;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    l0Var3 = l0Var2;
                    j13 = j11;
                    j14 = j12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar5 = pVar3;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                }
                c1086gP.U();
                int i29 = ((i12 >> 3) & 14) | 1572864;
                int i210 = i12 >> 9;
                SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        ComposableLambdaImpl composableLambdaImplB;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            ComposableLambdaImpl composableLambdaImplB2 = null;
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            C0955o c0955o = C0955o.f10310a;
                            if (pVar8 == null) {
                                interfaceC1084f3.L(-366997612);
                                interfaceC1084f3.D();
                                composableLambdaImplB = null;
                            } else {
                                interfaceC1084f3.L(-366997611);
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            if (pVar9 == null) {
                                interfaceC1084f3.L(-366576167);
                            } else {
                                interfaceC1084f3.L(-366576166);
                                composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                            }
                            interfaceC1084f3.D();
                            AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                            androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i29 | (i210 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i210 & 896) | (i210 & 7168), 48);
                hVar2 = hVar3;
                pVar6 = pVar4;
                j13 = jH;
                j14 = jB;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar6 = pVar4;
                pVar7 = pVar5;
                l0Var3 = l0Var2;
                j13 = j11;
                j14 = j12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                pVar4 = pVar2;
                if (c1086gP.k(pVar4)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar5 = pVar3;
                    if (c1086gP.k(pVar5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0Var2 = l0Var;
                        if (c1086gP.K(l0Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j11 = j;
                        if (c1086gP.i(j11)) {
                        }
                        i12 |= i19;
                    } else {
                        j11 = j;
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                if ((i10 & 1572864) == 0) {
                    if ((i11 & 64) == 0) {
                        j12 = j10;
                        if (c1086gP.i(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    } else {
                        if (i17 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar4 = null;
                        }
                        if (i15 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -57345;
                        } else {
                            l0Var3 = l0Var2;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j11;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            jB = ColorsKt.b(jH, c1086gP);
                        } else {
                            jB = j12;
                        }
                    }
                    c1086gP.U();
                    int i211 = ((i12 >> 3) & 14) | 1572864;
                    int i212 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            ComposableLambdaImpl composableLambdaImplB;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                ComposableLambdaImpl composableLambdaImplB2 = null;
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                C0955o c0955o = C0955o.f10310a;
                                if (pVar8 == null) {
                                    interfaceC1084f3.L(-366997612);
                                    interfaceC1084f3.D();
                                    composableLambdaImplB = null;
                                } else {
                                    interfaceC1084f3.L(-366997611);
                                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                if (pVar9 == null) {
                                    interfaceC1084f3.L(-366576167);
                                } else {
                                    interfaceC1084f3.L(-366576166);
                                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 56);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3);
                                }
                                interfaceC1084f3.D();
                                AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                                androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i211 | (i212 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i212 & 896) | (i212 & 7168), 48);
                    hVar2 = hVar3;
                    pVar6 = pVar4;
                    j13 = jH;
                    j14 = jB;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    l0Var3 = l0Var2;
                    j13 = j11;
                    j14 = j12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar5 = pVar3;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                }
                c1086gP.U();
                int i213 = ((i12 >> 3) & 14) | 1572864;
                int i214 = i12 >> 9;
                SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        ComposableLambdaImpl composableLambdaImplB;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            ComposableLambdaImpl composableLambdaImplB2 = null;
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            C0955o c0955o = C0955o.f10310a;
                            if (pVar8 == null) {
                                interfaceC1084f3.L(-366997612);
                                interfaceC1084f3.D();
                                composableLambdaImplB = null;
                            } else {
                                interfaceC1084f3.L(-366997611);
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            if (pVar9 == null) {
                                interfaceC1084f3.L(-366576167);
                            } else {
                                interfaceC1084f3.L(-366576166);
                                composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                            }
                            interfaceC1084f3.D();
                            AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                            androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i213 | (i214 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i214 & 896) | (i214 & 7168), 48);
                hVar2 = hVar3;
                pVar6 = pVar4;
                j13 = jH;
                j14 = jB;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar6 = pVar4;
                pVar7 = pVar5;
                l0Var3 = l0Var2;
                j13 = j11;
                j14 = j12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        pVar4 = pVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                pVar5 = pVar3;
                if (c1086gP.k(pVar5)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i18;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j;
                    if (c1086gP.i(j11)) {
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((i10 & 1572864) == 0) {
                if ((i11 & 64) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                } else {
                    if (i17 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar4 = null;
                    }
                    if (i15 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -57345;
                    } else {
                        l0Var3 = l0Var2;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j11;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        jB = ColorsKt.b(jH, c1086gP);
                    } else {
                        jB = j12;
                    }
                }
                c1086gP.U();
                int i215 = ((i12 >> 3) & 14) | 1572864;
                int i216 = i12 >> 9;
                SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        ComposableLambdaImpl composableLambdaImplB;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            ComposableLambdaImpl composableLambdaImplB2 = null;
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            C0955o c0955o = C0955o.f10310a;
                            if (pVar8 == null) {
                                interfaceC1084f3.L(-366997612);
                                interfaceC1084f3.D();
                                composableLambdaImplB = null;
                            } else {
                                interfaceC1084f3.L(-366997611);
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            if (pVar9 == null) {
                                interfaceC1084f3.L(-366576167);
                            } else {
                                interfaceC1084f3.L(-366576166);
                                composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                            long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 56);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3);
                            }
                            interfaceC1084f3.D();
                            AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                            androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i215 | (i216 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i216 & 896) | (i216 & 7168), 48);
                hVar2 = hVar3;
                pVar6 = pVar4;
                j13 = jH;
                j14 = jB;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar6 = pVar4;
                pVar7 = pVar5;
                l0Var3 = l0Var2;
                j13 = j11;
                j14 = j12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVar5 = pVar3;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i18;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i18;
        } else {
            l0Var2 = l0Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j11 = j;
                if (c1086gP.i(j11)) {
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            i12 |= i19;
        } else {
            j11 = j;
        }
        if ((i10 & 1572864) == 0) {
            if ((i11 & 64) == 0) {
                j12 = j10;
                if (c1086gP.i(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    pVar4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -57345;
                } else {
                    l0Var3 = l0Var2;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                } else {
                    jH = j11;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j12;
                }
            } else {
                if (i17 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    pVar4 = null;
                }
                if (i15 == 0) {
                }
                if ((i11 & 16) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -57345;
                } else {
                    l0Var3 = l0Var2;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                } else {
                    jH = j11;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    jB = ColorsKt.b(jH, c1086gP);
                } else {
                    jB = j12;
                }
            }
            c1086gP.U();
            int i217 = ((i12 >> 3) & 14) | 1572864;
            int i218 = i12 >> 9;
            SurfaceKt.a(hVar3, l0Var3, jH, jB, null, 0.0f, androidx.compose.runtime.internal.a.b(629950291, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    ComposableLambdaImpl composableLambdaImplB;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        ComposableLambdaImpl composableLambdaImplB2 = null;
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        C0955o c0955o = C0955o.f10310a;
                        if (pVar8 == null) {
                            interfaceC1084f3.L(-366997612);
                            interfaceC1084f3.D();
                            composableLambdaImplB = null;
                        } else {
                            interfaceC1084f3.L(-366997611);
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(620104160, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
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
                                        androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                        long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                        C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.87f : 1.0f));
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(770166432, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).f11872g, pVar12, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 56);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            interfaceC1084f3.D();
                        }
                        if (pVar9 == null) {
                            interfaceC1084f3.L(-366576167);
                        } else {
                            interfaceC1084f3.L(-366576166);
                            composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(1965858367, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
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
                                        androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                        long j15 = ((androidx.compose.ui.graphics.H) interfaceC1084f5.x(ContentColorKt.f11715a)).f13506a;
                                        C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f5.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j15)) < 0.5d : ((double) Q3.d.D(j15)) > 0.5d) ? 0.6f : 0.74f));
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar9;
                                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2115920639, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    TextKt.a(((V) interfaceC1084f7.x(TypographyKt.f11864b)).j, pVar12, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 56);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                        }
                        interfaceC1084f3.D();
                        AlertDialogKt.a(c0955o, composableLambdaImplB, composableLambdaImplB2, interfaceC1084f3, 6);
                        androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f3, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i217 | (i218 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i218 & 896) | (i218 & 7168), 48);
            hVar2 = hVar3;
            pVar6 = pVar4;
            j13 = jH;
            j14 = jB;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            pVar6 = pVar4;
            pVar7 = pVar5;
            l0Var3 = l0Var2;
            j13 = j11;
            j14 = j12;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.b(pVar, hVar2, pVar6, pVar7, l0Var3, j13, j14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final float f10, final float f11, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(73434452);
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
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = ((i11 & 14) == 4) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
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

                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(final androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
                        AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
                        Y y10;
                        Ref$IntRef ref$IntRef;
                        final ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
                        long jB = p013b0.b.b(p013b0.a.h(j), 0, 13);
                        int size = list.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Y yQ = list.get(i12).Q(jB);
                            boolean zIsEmpty = arrayList4.isEmpty();
                            Ref$IntRef ref$IntRef6 = ref$IntRef2;
                            float f12 = f10;
                            if (zIsEmpty) {
                                y10 = yQ;
                                ref$IntRef = ref$IntRef4;
                            } else {
                                if (h8.e1(f12) + ref$IntRef4.element + yQ.f14220b <= p013b0.a.h(j)) {
                                    ref$IntRef = ref$IntRef4;
                                    y10 = yQ;
                                } else {
                                    y10 = yQ;
                                    ref$IntRef = ref$IntRef4;
                                    a(arrayList, ref$IntRef3, h8, f11, arrayList4, arrayList2, ref$IntRef5, arrayList3, ref$IntRef6, ref$IntRef);
                                }
                            }
                            Ref$IntRef ref$IntRef7 = ref$IntRef;
                            if (!arrayList4.isEmpty()) {
                                ref$IntRef7.element = h8.e1(f12) + ref$IntRef7.element;
                            }
                            ArrayList arrayList5 = arrayList4;
                            arrayList5.add(y10);
                            ref$IntRef7.element += y10.f14220b;
                            ref$IntRef5 = ref$IntRef5;
                            ref$IntRef5.element = Math.max(ref$IntRef5.element, y10.f14221c);
                            i12++;
                            arrayList4 = arrayList5;
                            ref$IntRef4 = ref$IntRef7;
                            ref$IntRef2 = ref$IntRef6;
                            size = size;
                            jB = jB;
                            ref$IntRef3 = ref$IntRef3;
                        }
                        ArrayList arrayList6 = arrayList4;
                        Ref$IntRef ref$IntRef8 = ref$IntRef3;
                        Ref$IntRef ref$IntRef9 = ref$IntRef2;
                        Ref$IntRef ref$IntRef10 = ref$IntRef4;
                        if (arrayList6.isEmpty()) {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                        } else {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                            a(arrayList, ref$IntRef8, h8, f11, arrayList6, arrayList2, ref$IntRef5, arrayList3, ref$IntRef9, ref$IntRef10);
                        }
                        final int iH = p013b0.a.h(j) != Integer.MAX_VALUE ? p013b0.a.h(j) : Math.max(ref$IntRef9.element, p013b0.a.j(j));
                        int iMax = Math.max(ref$IntRef8.element, p013b0.a.i(j));
                        final float f13 = f10;
                        return h8.y1(iH, iMax, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r13v0 */
                            /* JADX WARN: Type inference failed for: r13v1, types: [int] */
                            /* JADX WARN: Type inference failed for: r13v3 */
                            /* JADX WARN: Type inference failed for: r13v4, types: [int] */
                            /* JADX WARN: Type inference failed for: r13v7 */
                            /* JADX WARN: Type inference failed for: r13v8 */
                            /* JADX WARN: Type inference failed for: r15v2 */
                            /* JADX WARN: Type inference failed for: r15v3, types: [int] */
                            /* JADX WARN: Type inference failed for: r15v4, types: [int] */
                            @Override // Ia.l
                            public final p293xa.r invoke(Y.a aVar) {
                                Y.a aVar2 = aVar;
                                List<List<Y>> list2 = arrayList;
                                androidx.compose.ui.layout.H h10 = h8;
                                float f14 = f13;
                                int i13 = iH;
                                List<Integer> list3 = arrayList3;
                                int size2 = list2.size();
                                boolean z11 = false;
                                int i14 = 0;
                                while (i14 < size2) {
                                    List<Y> list4 = list2.get(i14);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    ?? r13 = z11;
                                    while (r13 < size3) {
                                        iArr[r13] = list4.get(r13).f14220b + (r13 < kotlin.collections.l.r(list4) ? h10.e1(f14) : z11);
                                        r13++;
                                    }
                                    C0945e.j jVar = C0945e.f10284a;
                                    int[] iArr2 = new int[size3];
                                    C0945e.c(i13, iArr, iArr2, z11);
                                    int size4 = list4.size();
                                    for (?? r14 = z11; r14 < size4; r14++) {
                                        aVar2.d(list4.get(r14), iArr2[r14], list3.get(i14).intValue(), 0.0f);
                                    }
                                    i14++;
                                    z11 = false;
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
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AlertDialogKt.c(f10, f11, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
