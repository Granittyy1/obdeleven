package coil.compose;

import androidx.collection.K;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxMeasurePolicy;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.y0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.C1174u;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Object obj, String str, coil.f fVar, androidx.compose.ui.h hVar, Ia.r rVar, Ia.r rVar2, Ia.l lVar, Ia.l lVar2, Ia.l lVar3, InterfaceC1161g.a.C0159a c0159a, InterfaceC1084f interfaceC1084f, int i10, int i11, int i12) {
        interfaceC1084f.e(-1545157471);
        d dVar = AsyncImagePainter.f22712v;
        Ia.r rVar3 = (i12 & 32) != 0 ? null : rVar;
        Ia.r rVar4 = (i12 & 128) != 0 ? null : rVar2;
        final Ia.l lVar4 = (i12 & 256) != 0 ? null : lVar;
        final Ia.l lVar5 = (i12 & 512) != 0 ? null : lVar2;
        final Ia.l lVar6 = (i12 & 1024) != 0 ? null : lVar3;
        androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13339e;
        InterfaceC1161g interfaceC1161g = (i12 & 4096) != 0 ? InterfaceC1161g.a.f14244b : c0159a;
        g gVar = new g(obj, m.f22790a, fVar);
        Z2.c cVar = y.f22840b;
        b(gVar, str, hVar, dVar, (lVar4 == null && lVar5 == null && lVar6 == null) ? 0 : new Ia.l() { // from class: coil.compose.w
            @Override // Ia.l
            public final Object invoke(Object obj2) {
                AsyncImagePainter.a aVar = (AsyncImagePainter.a) obj2;
                if (aVar instanceof AsyncImagePainter.a.c) {
                    Ia.l lVar7 = lVar4;
                    if (lVar7 != null) {
                        lVar7.invoke(aVar);
                    }
                } else if (aVar instanceof AsyncImagePainter.a.d) {
                    Ia.l lVar8 = lVar5;
                    if (lVar8 != null) {
                        lVar8.invoke(aVar);
                    }
                } else if (aVar instanceof AsyncImagePainter.a.b) {
                    Ia.l lVar9 = lVar6;
                    if (lVar9 != null) {
                        lVar9.invoke(aVar);
                    }
                } else if (!(aVar instanceof AsyncImagePainter.a.C0239a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return p293xa.r.f47939a;
            }
        }, fVar2, interfaceC1161g, 1.0f, null, 1, true, (rVar3 == null && rVar4 == null) ? h.f22771a : new ComposableLambdaImpl(true, 750771424, new t(rVar3, null, rVar4)), interfaceC1084f, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i11 << 12) & 3670016), 0);
        interfaceC1084f.I();
    }

    public static final void b(final g gVar, final String str, final androidx.compose.ui.h hVar, final Ia.l lVar, final w wVar, final androidx.compose.ui.d dVar, final InterfaceC1161g interfaceC1161g, final float f10, final I i10, final int i11, final boolean z10, final ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, final int i12, final int i13) {
        int i14;
        int i15;
        ComposableLambdaImpl composableLambdaImpl2;
        C1086g c1086gP = interfaceC1084f.p(-605638725);
        if ((i12 & 14) == 0) {
            i14 = (c1086gP.K(gVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i14 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= c1086gP.k(lVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= c1086gP.k(wVar) ? 16384 : 8192;
        }
        if ((458752 & i12) == 0) {
            i14 |= c1086gP.K(dVar) ? 131072 : 65536;
        }
        if ((3670016 & i12) == 0) {
            i14 |= c1086gP.K(interfaceC1161g) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i14 |= c1086gP.g(f10) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= c1086gP.K(i10) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= c1086gP.h(i11) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (c1086gP.c(z10) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i15 |= c1086gP.k(composableLambdaImpl) ? 32 : 16;
        }
        int i16 = i15;
        if ((1533916891 & i14) == 306783378 && (i16 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            coil.request.g gVarB = y.b(gVar.f22768a, interfaceC1161g, c1086gP);
            int i17 = i14 >> 6;
            int i18 = i14 >> 12;
            AsyncImagePainter asyncImagePainterA = f.a(gVarB, gVar.f22770c, lVar, wVar, interfaceC1161g, i11, c1086gP, 64);
            Z2.f fVar = gVarB.f23069y;
            boolean z11 = fVar instanceof ConstraintsSizeResolver;
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z11) {
                c1086gP.e(-2079329304);
                q qVar = new q(fVar, composableLambdaImpl, asyncImagePainterA, str, dVar, interfaceC1161g, f10, i10, z10);
                c1086gP.q(Integer.rotateLeft(-888190719, 1), androidx.compose.runtime.internal.a.f13051a);
                Object objF = c1086gP.f();
                if (objF == c0153a) {
                    composableLambdaImpl2 = new ComposableLambdaImpl(true, -888190719, qVar);
                    c1086gP.E(composableLambdaImpl2);
                } else {
                    kotlin.jvm.internal.i.c(objF, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
                    composableLambdaImpl2 = (ComposableLambdaImpl) objF;
                    composableLambdaImpl2.l(qVar);
                }
                ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                c1086gP.T(false);
                BoxWithConstraintsKt.a(hVar, dVar, true, composableLambdaImpl3, c1086gP, (i17 & 14) | 3456 | (i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                c1086gP.T(false);
            } else {
                c1086gP.e(-2080018031);
                int i19 = (i17 & 14) | 384 | (i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                c1086gP.e(733328855);
                int i20 = ((i19 >> 3) & 14) | 48;
                K<androidx.compose.ui.d, E> k10 = BoxKt.f10095a;
                kotlin.jvm.internal.i.a(dVar, androidx.compose.ui.d.a.f13335a);
                c1086gP.L(-1709737635);
                boolean z12 = (((i20 & 14) ^ 6) > 4 && c1086gP.K(dVar)) || (i20 & 6) == 4;
                Object objF2 = c1086gP.f();
                if (z12 || objF2 == c0153a) {
                    objF2 = new BoxMeasurePolicy(dVar, true);
                    c1086gP.E(objF2);
                }
                BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) objF2;
                c1086gP.T(false);
                c1086gP.e(-1323940314);
                int i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                ComposableLambdaImpl composableLambdaImplB = C1174u.b(hVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, boxMeasurePolicy);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                composableLambdaImplB.invoke(new y0(c1086gP), c1086gP, 0);
                c1086gP.e(2058660585);
                composableLambdaImpl.invoke(new n(C0949i.f10304a, asyncImagePainterA, str, dVar, interfaceC1161g, f10, i10, z10), c1086gP, Integer.valueOf(i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(false);
                c1086gP.T(false);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: coil.compose.p
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = L4.b.l(i12 | 1);
                    int iL2 = L4.b.l(i13);
                    g gVar2 = gVar;
                    ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl;
                    u.b(gVar2, str, hVar, lVar, wVar, dVar, interfaceC1161g, f10, i10, i11, z10, composableLambdaImpl4, (InterfaceC1084f) obj, iL, iL2);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final v vVar, androidx.compose.ui.h hVar, Painter painter, String str, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10, boolean z10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        Painter painterH;
        String contentDescription;
        androidx.compose.ui.d dVarG;
        InterfaceC1161g interfaceC1161gE;
        float fA;
        I iB;
        boolean zN;
        final Painter painter2;
        final androidx.compose.ui.d dVar2;
        final float f11;
        final boolean z11;
        C1086g c1086gP = interfaceC1084f.p(880638523);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.K(vVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 176;
        if ((i11 & 7168) == 0) {
            i13 = i12 | 1200;
        }
        if ((57344 & i11) == 0) {
            i13 |= 8192;
        }
        if ((458752 & i11) == 0) {
            i13 |= 65536;
        }
        if ((3670016 & i11) == 0) {
            i13 |= 524288;
        }
        if ((29360128 & i11) == 0) {
            i13 |= 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= 33554432;
        }
        if ((191739611 & i13) == 38347922 && c1086gP.s()) {
            c1086gP.w();
            hVar2 = hVar;
            painter2 = painter;
            contentDescription = str;
            dVar2 = dVar;
            interfaceC1161gE = interfaceC1161g;
            f11 = f10;
            iB = i10;
            z11 = z10;
        } else {
            c1086gP.r0();
            if ((i11 & 1) == 0 || c1086gP.a0()) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
                painterH = vVar.h();
                contentDescription = vVar.getContentDescription();
                dVarG = vVar.g();
                interfaceC1161gE = vVar.e();
                fA = vVar.a();
                iB = vVar.b();
                zN = vVar.n();
            } else {
                c1086gP.w();
                hVar2 = hVar;
                painterH = painter;
                contentDescription = str;
                dVarG = dVar;
                interfaceC1161gE = interfaceC1161g;
                fA = f10;
                iB = i10;
                zN = z10;
            }
            c1086gP.U();
            Z2.c cVar = y.f22840b;
            androidx.compose.ui.h hVarB = contentDescription != null ? androidx.compose.ui.semantics.p.b(hVar2, false, new x(0, contentDescription)) : hVar2;
            if (zN) {
                hVarB = A8.p.s(hVarB);
            }
            androidx.compose.ui.h hVarI = hVarB.i(new ContentPainterElement(painterH, dVarG, interfaceC1161gE, fA, iB));
            s sVar = s.f22830a;
            c1086gP.e(544976794);
            int i14 = c1086gP.f12996P;
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            ComposeUiNode.f14331c0.getClass();
            final Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.e(1405779621);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(new Ia.a<ComposeUiNode>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // Ia.a
                    public final ComposeUiNode invoke() {
                        return aVar.invoke();
                    }
                });
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, sVar);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            c1086gP.T(true);
            c1086gP.T(false);
            c1086gP.T(false);
            painter2 = painterH;
            dVar2 = dVarG;
            f11 = fA;
            z11 = zN;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final String str2 = contentDescription;
            final InterfaceC1161g interfaceC1161g2 = interfaceC1161gE;
            final I i15 = iB;
            c1105p0V.f13109d = new Ia.p() { // from class: coil.compose.o
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = L4.b.l(i11 | 1);
                    I i16 = i15;
                    boolean z12 = z11;
                    u.c(vVar, hVar3, painter2, str2, dVar2, interfaceC1161g2, f11, i16, z12, (InterfaceC1084f) obj, iL);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
