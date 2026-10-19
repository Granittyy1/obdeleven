package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SpecialNotice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SpecialNoticeKt {
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x0227  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void SpecialNotice(String text, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        androidx.compose.ui.graphics.vector.c cVarB;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(-1272749637);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i14 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                p270w.f fVarB = p270w.g.b(20);
                C0945e.j jVar = C0945e.f10284a;
                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.j;
                androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                float f10 = 16;
                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 12, C0935g.a(C0932d.b(hVarD, intercomTheme.getColors(c1086gP, i15).m649getSpecialNoticeBackground0d7_KjU(), fVarB), 1, intercomTheme.getColors(c1086gP, i15).m650getSpecialNoticeBorder0d7_KjU(), fVarB));
                T tA = S.a(jVar, bVar, c1086gP, 54);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                cVarB = A.b.f379a;
                if (cVarB == null) {
                    androidx.compose.ui.graphics.vector.c.a aVar3 = new androidx.compose.ui.graphics.vector.c.a("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                    m0 m0Var = new m0(androidx.compose.ui.graphics.H.f13495b);
                    androidx.compose.ui.graphics.vector.d dVar = new androidx.compose.ui.graphics.vector.d();
                    dVar.h(11.0f, 7.0f);
                    dVar.e(2.0f);
                    dVar.l(2.0f);
                    dVar.e(-2.0f);
                    dVar.a();
                    dVar.h(11.0f, 11.0f);
                    dVar.e(2.0f);
                    dVar.l(6.0f);
                    dVar.e(-2.0f);
                    dVar.a();
                    dVar.h(12.0f, 2.0f);
                    dVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    dVar.j(4.48f, 10.0f, 10.0f, 10.0f);
                    dVar.j(10.0f, -4.48f, 10.0f, -10.0f);
                    dVar.i(17.52f, 2.0f, 12.0f, 2.0f);
                    dVar.a();
                    dVar.h(12.0f, 20.0f);
                    dVar.c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                    dVar.j(3.59f, -8.0f, 8.0f, -8.0f);
                    dVar.j(8.0f, 3.59f, 8.0f, 8.0f);
                    dVar.j(-3.59f, 8.0f, -8.0f, 8.0f);
                    dVar.a();
                    androidx.compose.ui.graphics.vector.c.a.a(aVar3, dVar.f13897a, m0Var);
                    cVarB = aVar3.b();
                    A.b.f379a = cVarB;
                }
                IconKt.b(cVarB, null, W.m(aVar, f10), intercomTheme.getColors(c1086gP, i15).m616getActionContrastWhite0d7_KjU(), c1086gP, 432, 0);
                Lb.a.a(c1086gP, W.q(aVar, 8));
                VerticalAlignElement verticalAlignElement = new VerticalAlignElement(androidx.compose.ui.d.a.f13344k);
                Spanned spannedA = p307z0.b.a(text, 0);
                kotlin.jvm.internal.i.d(spannedA, "fromHtml(...)");
                TextKt.c(BlockExtensionsKt.toAnnotatedString(spannedA, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null), verticalAlignElement, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(c1086gP, i15).getType04Point5(), c1086gP, 0, 0, 131068);
                c1086gP.T(true);
                hVar2 = hVar3;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new G(i10, i11, hVar2, text);
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i12 & 91) == 18) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            p270w.f fVarB2 = p270w.g.b(20);
            C0945e.j jVar2 = C0945e.f10284a;
            androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.j;
            androidx.compose.ui.h hVarD2 = W.d(hVar3, 1.0f);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            float f11 = 16;
            androidx.compose.ui.h hVarG2 = PaddingKt.g(f11, 12, C0935g.a(C0932d.b(hVarD2, intercomTheme2.getColors(c1086gP, i16).m649getSpecialNoticeBackground0d7_KjU(), fVarB2), 1, intercomTheme2.getColors(c1086gP, i16).m650getSpecialNoticeBorder0d7_KjU(), fVarB2));
            T tA2 = S.a(jVar2, bVar2, c1086gP, 54);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarG2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            cVarB = A.b.f379a;
            if (cVarB == null) {
                androidx.compose.ui.graphics.vector.c.a aVar4 = new androidx.compose.ui.graphics.vector.c.a("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                m0 m0Var2 = new m0(androidx.compose.ui.graphics.H.f13495b);
                androidx.compose.ui.graphics.vector.d dVar2 = new androidx.compose.ui.graphics.vector.d();
                dVar2.h(11.0f, 7.0f);
                dVar2.e(2.0f);
                dVar2.l(2.0f);
                dVar2.e(-2.0f);
                dVar2.a();
                dVar2.h(11.0f, 11.0f);
                dVar2.e(2.0f);
                dVar2.l(6.0f);
                dVar2.e(-2.0f);
                dVar2.a();
                dVar2.h(12.0f, 2.0f);
                dVar2.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                dVar2.j(4.48f, 10.0f, 10.0f, 10.0f);
                dVar2.j(10.0f, -4.48f, 10.0f, -10.0f);
                dVar2.i(17.52f, 2.0f, 12.0f, 2.0f);
                dVar2.a();
                dVar2.h(12.0f, 20.0f);
                dVar2.c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                dVar2.j(3.59f, -8.0f, 8.0f, -8.0f);
                dVar2.j(8.0f, 3.59f, 8.0f, 8.0f);
                dVar2.j(-3.59f, 8.0f, -8.0f, 8.0f);
                dVar2.a();
                androidx.compose.ui.graphics.vector.c.a.a(aVar4, dVar2.f13897a, m0Var2);
                cVarB = aVar4.b();
                A.b.f379a = cVarB;
            }
            IconKt.b(cVarB, null, W.m(aVar, f11), intercomTheme2.getColors(c1086gP, i16).m616getActionContrastWhite0d7_KjU(), c1086gP, 432, 0);
            Lb.a.a(c1086gP, W.q(aVar, 8));
            VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement(androidx.compose.ui.d.a.f13344k);
            Spanned spannedA2 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA2, "fromHtml(...)");
            TextKt.c(BlockExtensionsKt.toAnnotatedString(spannedA2, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null), verticalAlignElement2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme2.getTypography(c1086gP, i16).getType04Point5(), c1086gP, 0, 0, 131068);
            c1086gP.T(true);
            hVar2 = hVar3;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            p270w.f fVarB3 = p270w.g.b(20);
            C0945e.j jVar3 = C0945e.f10284a;
            androidx.compose.ui.f.b bVar3 = androidx.compose.ui.d.a.j;
            androidx.compose.ui.h hVarD3 = W.d(hVar3, 1.0f);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            float f12 = 16;
            androidx.compose.ui.h hVarG3 = PaddingKt.g(f12, 12, C0935g.a(C0932d.b(hVarD3, intercomTheme3.getColors(c1086gP, i17).m649getSpecialNoticeBackground0d7_KjU(), fVarB3), 1, intercomTheme3.getColors(c1086gP, i17).m650getSpecialNoticeBorder0d7_KjU(), fVarB3));
            T tA3 = S.a(jVar3, bVar3, c1086gP, 54);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarG3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            cVarB = A.b.f379a;
            if (cVarB == null) {
                androidx.compose.ui.graphics.vector.c.a aVar5 = new androidx.compose.ui.graphics.vector.c.a("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                EmptyList emptyList3 = androidx.compose.ui.graphics.vector.i.f13970a;
                m0 m0Var3 = new m0(androidx.compose.ui.graphics.H.f13495b);
                androidx.compose.ui.graphics.vector.d dVar3 = new androidx.compose.ui.graphics.vector.d();
                dVar3.h(11.0f, 7.0f);
                dVar3.e(2.0f);
                dVar3.l(2.0f);
                dVar3.e(-2.0f);
                dVar3.a();
                dVar3.h(11.0f, 11.0f);
                dVar3.e(2.0f);
                dVar3.l(6.0f);
                dVar3.e(-2.0f);
                dVar3.a();
                dVar3.h(12.0f, 2.0f);
                dVar3.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                dVar3.j(4.48f, 10.0f, 10.0f, 10.0f);
                dVar3.j(10.0f, -4.48f, 10.0f, -10.0f);
                dVar3.i(17.52f, 2.0f, 12.0f, 2.0f);
                dVar3.a();
                dVar3.h(12.0f, 20.0f);
                dVar3.c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                dVar3.j(3.59f, -8.0f, 8.0f, -8.0f);
                dVar3.j(8.0f, 3.59f, 8.0f, 8.0f);
                dVar3.j(-3.59f, 8.0f, -8.0f, 8.0f);
                dVar3.a();
                androidx.compose.ui.graphics.vector.c.a.a(aVar5, dVar3.f13897a, m0Var3);
                cVarB = aVar5.b();
                A.b.f379a = cVarB;
            }
            IconKt.b(cVarB, null, W.m(aVar, f12), intercomTheme3.getColors(c1086gP, i17).m616getActionContrastWhite0d7_KjU(), c1086gP, 432, 0);
            Lb.a.a(c1086gP, W.q(aVar, 8));
            VerticalAlignElement verticalAlignElement3 = new VerticalAlignElement(androidx.compose.ui.d.a.f13344k);
            Spanned spannedA3 = p307z0.b.a(text, 0);
            kotlin.jvm.internal.i.d(spannedA3, "fromHtml(...)");
            TextKt.c(BlockExtensionsKt.toAnnotatedString(spannedA3, (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), (2 & 2) != 0 ? new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, androidx.compose.ui.text.style.h.f15671c, null, 61439) : null), verticalAlignElement3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(c1086gP, i17).getType04Point5(), c1086gP, 0, 0, 131068);
            c1086gP.T(true);
            hVar2 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new G(i10, i11, hVar2, text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SpecialNotice$lambda$1(String text, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        SpecialNotice(text, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void SpecialNoticePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1291680485);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m237getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SpecialNoticePreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SpecialNoticePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void SpecialNoticeShortTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(841465410);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m239getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r SpecialNoticeShortTextPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SpecialNoticeShortTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
